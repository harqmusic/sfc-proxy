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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import sfc.proxy.apisfc.dto.AsoResponseData;
import sfc.proxy.apisfc.dto.IdFile;
import sfc.proxy.apisfc.dto.PostGoogleRequest;

@Service
public class DocumentService {


    RestTemplate restTemplate;


    public String getGoogleDocument(String googleUrl) {


        PostGoogleRequest requestDocument = new PostGoogleRequest();
        requestDocument.setUrl(googleUrl);
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity <String> entity = new HttpEntity<String>(headers);

            restTemplate = new RestTemplate();

            byte[] googleDocumentBytes = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, byte[].class).getBody();

            String encodedString = Base64.getEncoder().encodeToString(googleDocumentBytes);


            return encodedString;// googleDocumentString;
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            return "ERROR";
        }
    }

    public String getGoogleDocument2(String googleUrl) {

        String result;

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity <String> entity = new HttpEntity<String>(headers);

            RestTemplate restTemplate = new RestTemplate();
            result = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();

        } catch (Exception e) {
            result = "<br>ERROR MESSAGE: " + e.getMessage();
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            result += "<br>ERROR STACK TRACE: <br>" + sw.toString() ;            // TODO: handle exception
        }
        return result;
    }


    public String uploadBinaryToGD(String googleDocumentString, String tsec, String asoGDUrl) {

        String result = "";

        try {
            HttpHeaders httpHeader = new HttpHeaders();
			httpHeader.setContentType(MediaType.MULTIPART_FORM_DATA);

			MultiValueMap<String, Object> body  = new LinkedMultiValueMap<>();
            byte[] bodyByteArray = Base64.getDecoder().decode(googleDocumentString.getBytes(StandardCharsets.UTF_8));
			body.add("file", bodyByteArray);

            HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(body, httpHeader);

           try {
                RestTemplate restTemplate = new RestTemplate();
				ResponseEntity<String> responseService = restTemplate.postForEntity(asoGDUrl, request, String.class);
                AsoResponseData asoResponseData = new AsoResponseData();
				if(responseService != null) {
					if (responseService.getStatusCode().equals(HttpStatus.OK)) {

                        asoResponseData = new Gson().fromJson(responseService.getBody(), AsoResponseData.class);
					} else {
						IdFile idFile = new IdFile();
						idFile.setFileId("ERROR");
						asoResponseData.setData(idFile);
					}
                    result = asoResponseData.getData().getFileId();
			    }
                else{
                    result = "respuesta nula";
                }
            }
            catch (Exception ex) {
                throw new Exception(ex);
            }
        } catch (Exception e) {
            result += "<br>ERROR MESSAGE: " + e.getMessage();
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            result += "<br>ERROR STACK TRACE: <br>" + sw.toString() ;            // TODO: handle exception
        }
        return result;
    }

}
