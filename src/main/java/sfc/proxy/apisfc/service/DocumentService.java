package sfc.proxy.apisfc.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.util.Arrays;
import java.util.Base64;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import sfc.proxy.apisfc.dto.AsoResponseData;
import sfc.proxy.apisfc.dto.DownloadUploadResponse;
import sfc.proxy.apisfc.dto.IdFile;
import sfc.proxy.apisfc.dto.PostGoogleRequest;

@Service
public class DocumentService {





    public String getGoogleDocument(String googleUrl, DownloadUploadResponse downloadUploadResponse) {


        PostGoogleRequest requestDocument = new PostGoogleRequest();
        requestDocument.setUrl(googleUrl);
        try {
            RestTemplate restTemplate = new RestTemplate();
            String encodedString;
            ResponseEntity<byte[]> responseEntity = restTemplate.getForEntity(googleUrl, byte[].class);

            byte[] googleDocumentBytes = responseEntity.getBody();
            System.out.println("SIZE 1: " + googleDocumentBytes.length);
            encodedString = Base64.getEncoder().encodeToString(googleDocumentBytes);
            System.out.println("SIZE 2: " + encodedString.length());

            return encodedString;

        } catch (HttpClientErrorException   e) {
            e.printStackTrace();
            if(e.getStatusCode().equals(HttpStatus.BAD_REQUEST) && e.getMessage().contains("ExpiredToken")) {
                downloadUploadResponse.setResultStatus("UrlGoogleExpirada");
            } else{
                downloadUploadResponse.setResultStatus("ErrorServicioGoogle");
            }
            String result = "Error en respuesta de servicio de Google: " + e.getMessage() +". HttpStatus: " + e.getStatusText() + " (" + e.getStatusCode().value() + ") Response:" + e.getResponseBodyAsString();
            downloadUploadResponse.setResult(result);
        }
        catch (Exception e) {
            e.printStackTrace();
            downloadUploadResponse.setResultStatus("ErrorConsultaGoogle");
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            String result = "Error consultando Url de Google: " + e.getMessage() + ". StackTrace: " + sw.toString();
            downloadUploadResponse.setResult(result);
        }
        return "ERROR";
    }

    public void uploadBinaryToGD(String googleDocumentString, String tsec, String asoGDUrl, DownloadUploadResponse downloadUploadResponse) {
        try {
            HttpHeaders httpHeader = new HttpHeaders();
			httpHeader.setContentType(MediaType.MULTIPART_FORM_DATA);
            httpHeader.set("tsec", tsec);

			MultiValueMap<String, Object> body  = new LinkedMultiValueMap<>();
            byte[] bodyByteArray = Base64.getDecoder().decode(googleDocumentString.getBytes(StandardCharsets.UTF_8));
            Integer fileSize = bodyByteArray.length;
            System.out.println("SIZE: " + fileSize);
			body.add("file", bodyByteArray);

            HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(body, httpHeader);


            AsoResponseData asoResponseData = new AsoResponseData();
            RestTemplate restTemplate = new RestTemplate();

            System.out.println("PRE Consulta");
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(asoGDUrl, request, String.class);
            asoResponseData = new Gson().fromJson(responseEntity.getBody(), AsoResponseData.class);
            downloadUploadResponse.setResult(asoResponseData.getData().getFileId());
            downloadUploadResponse.setResultStatus("FILEID OK");
            downloadUploadResponse.setFileSize(fileSize);

         } catch (HttpClientErrorException e) {
            e.printStackTrace();
            if(e.getStatusCode().equals(HttpStatus.FORBIDDEN) && e.getMessage().contains("TSEC caducado")) {
                downloadUploadResponse.setResultStatus("TSEC caducado");
            } else {
                downloadUploadResponse.setResultStatus("ErrorServicioGestorDocumental");
            }
            String result = "Error en respuesta de servicio de Gestor Documental: " + e.getMessage() +". HttpStatus: " + e.getStatusText() + " (" + e.getStatusCode().value() + ") Response:" + e.getResponseBodyAsString().replace("\"","!");
            downloadUploadResponse.setResult(result);
        }
        catch (HttpServerErrorException e) {
            e.printStackTrace();
            if(e.getStatusCode().equals(HttpStatus.FORBIDDEN) && e.getMessage().contains("TSEC caducado")) {
                downloadUploadResponse.setResultStatus("TSEC caducado");
            } else {
                downloadUploadResponse.setResultStatus("ErrorServicioGestorDocumental");
            }
            String result = "Error en respuesta de servicio de Gestor Documental: " + e.getMessage() +". HttpStatus: " + e.getStatusText() + " (" + e.getStatusCode().value() + ") Response:" + e.getResponseBodyAsString();
            downloadUploadResponse.setResult(result);
        }
        catch (Exception e) {
            e.printStackTrace();
            downloadUploadResponse.setResultStatus("ErrorServicioGestorDocumental");
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String result = "Error cosumiendo consumiendo servicio de Gestor Documental: " + e.getMessage() + ". StackTrace: " + sw.toString();
            downloadUploadResponse.setResult(result);
        }
    }

}
