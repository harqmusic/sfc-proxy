package sfc.proxy.apisfc.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Blob;
import java.util.Arrays;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DocumentService {


    RestTemplate restTemplate;

    public Blob getGoogleDocument(String googleUrl, String jsonRequestString) {
        googleUrl = "https://storage.googleapis.com/clean2-sfc-smartsupervision-prod/1131692067823875628/WhatsApp_Image_2023-08-08_at_8.13.55_AM.jpeg?Expires=1692071820&GoogleAccessId=backend-prod%40sfc-smartsupervision-prod.iam.gserviceaccount.com&Signature=jej7aN1aWpxuRqKHpr04QrqDAbLniwjCElTDEHwjZiuIQgNgqEKeX7iJmVp6hYusZfkc2MnV2oHddi5UNPwEn0Fgf8YjPdFAKxAVcH8F1q3%2FKoY0CcpyOzsghv9APZXuLieu%2FtP2TrtC%2Ffz9pJEALagwURuPZ%2BBpkL9UtrKGYYtByGOsMFRnLedRmfupRg8ThIZIIshOwbBuia%2FzHamIoDCJk%2FkXGZO7uRle34Akq1BwflqXxxJ%2FuPlNvRLFBZj7h3iKBsvs4jR3uuyYU1vGfiDwaNhkSd5Di04Sv5t2ShzoV0r6XPGP07PEOe%2FWBG8ul7M1%2FksHit55RtBKxHxrDQ%3D%3D";
        String result = "<br>URL: " + googleUrl;
        Blob blo = null;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity <String> entity = new HttpEntity<String>(headers);

            restTemplate = new RestTemplate();
            //result += "<br>DOCUMENTO RECIBIDO: <br>" + restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();

            byte[] imageBytes = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, byte[].class).getBody();
            Blob blobData = new SerialBlob(imageBytes);

            return blobData;
            //result = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();
        } catch (Exception e) {
            result += "<br>ERROR MESSAGE: " + e.getMessage();
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            result += "<br>ERROR STACK TRACE: <br>" + sw.toString() ;            // TODO: handle exception
        }
        return blo;
    }


    /*public Blob uploadBinaryToGD(String jsonRequest) {
        googleUrl = "https://storage.googleapis.com/clean2-sfc-smartsupervision-prod/1131692067823875628/WhatsApp_Image_2023-08-08_at_8.13.55_AM.jpeg?Expires=1692071820&GoogleAccessId=backend-prod%40sfc-smartsupervision-prod.iam.gserviceaccount.com&Signature=jej7aN1aWpxuRqKHpr04QrqDAbLniwjCElTDEHwjZiuIQgNgqEKeX7iJmVp6hYusZfkc2MnV2oHddi5UNPwEn0Fgf8YjPdFAKxAVcH8F1q3%2FKoY0CcpyOzsghv9APZXuLieu%2FtP2TrtC%2Ffz9pJEALagwURuPZ%2BBpkL9UtrKGYYtByGOsMFRnLedRmfupRg8ThIZIIshOwbBuia%2FzHamIoDCJk%2FkXGZO7uRle34Akq1BwflqXxxJ%2FuPlNvRLFBZj7h3iKBsvs4jR3uuyYU1vGfiDwaNhkSd5Di04Sv5t2ShzoV0r6XPGP07PEOe%2FWBG8ul7M1%2FksHit55RtBKxHxrDQ%3D%3D";
        String result = "<br>URL: " + googleUrl;
        Blob blo = null;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity <String> entity = new HttpEntity<String>(headers);

            restTemplate = new RestTemplate();
            //result += "<br>DOCUMENTO RECIBIDO: <br>" + restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();

            byte[] imageBytes = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, byte[].class).getBody();
            Blob blobData = new SerialBlob(imageBytes);

            return blobData;
            //result = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();
        } catch (Exception e) {
            result += "<br>ERROR MESSAGE: " + e.getMessage();
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            result += "<br>ERROR STACK TRACE: <br>" + sw.toString() ;            // TODO: handle exception
        }
        return blo;
    }*/

}
