package sfc.proxy.apisfc.service;

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

        String result = "URL: " + googleUrl + "\n";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        result += "DOCUMENTO RECIBIDO: \n" + restTemplate.exchange(googleUrl, HttpMethod.GET, entity, String.class).getBody();
        return result;
    }

}
