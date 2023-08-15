package sfc.proxy.apisfc.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DocumentService {


    RestTemplate restTemplate;

    public String getGoogleDocument(String googleUrl) {
        googleUrl = "https://storage.googleapis.com/clean2-sfc-smartsupervision-prod/1131692067823875628/WhatsApp_Image_2023-08-08_at_8.13.55_AM.jpeg?Expires=1692070390&GoogleAccessId=backend-prod%40sfc-smartsupervision-prod.iam.gserviceaccount.com&Signature=SkZ739U9rJ%2FoeJBX79K%2F9Lf7OJb1IRzPkfTuuhdRlII0jbYHP0XohSAqR6BZR%2FEIO8n%2BNHTq4%2BdOjmkLp6yyKFmelMmIr%2FLnKZvkLrNduFATwEEe%2FP7bWrFpIewGwyONq23xbR0Qz5ynAzIWrxg6HTlG49n96sn3%2Fq2GMWA43ZYVaiLOphRhi1NuVKw%2F4hBjcRTzlkSxoWPc6kyLdoMqJZzUtyqGkMp%2FaA7LpujKUQ0EPuwAZ5xipKGrF5iSX7UeHmiXpqevSN8wCb%2BUxiDd1hCvw%2BAgTyRGzQoWuAgN%2FsI2B6KS0CR8JA0M%2B0C7eU5Dt1k5dF8yt85lHzLe%2FulpSw%3D%3D";
        String result = "<br>URL: " + googleUrl;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity <String> entity = new HttpEntity<String>(headers);

            restTemplate = new RestTemplate();
            //result += "<br>DOCUMENTO RECIBIDO: <br>" + restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();
            result = restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();
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
