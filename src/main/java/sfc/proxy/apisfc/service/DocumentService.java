package sfc.proxy.apisfc.service;

import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    public String getGoogleDocument(String googleUrl) {
        return "DATOS INGRESADOS" + googleUrl;
    }


}
