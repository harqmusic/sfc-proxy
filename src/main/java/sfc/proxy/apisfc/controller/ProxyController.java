package sfc.proxy.apisfc.controller;

import java.sql.Blob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sfc.proxy.apisfc.dto.DownloadUploadRequest;
import sfc.proxy.apisfc.service.DocumentService;

@RestController
@RequestMapping("/sfcproxy")
public class ProxyController {

    private final DocumentService documentService;

    public ProxyController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/getGoogleDocument2")
    public Blob getGoogleDocument(@RequestParam String googleUrl, @RequestParam String GoogleAccessId, @RequestParam String Signature, @RequestBody String jsonRequestString){

        //String result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature);
        Blob result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature, jsonRequestString);

        return result;
    }

    @GetMapping("/getGoogleDocument")
    public String getGoogleDocument(@RequestBody DownloadUploadRequest downloadUploadRequest){

        //String result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature);
        //Blob result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature, jsonRequestString);

        String result =  "OK: <br>" + downloadUploadRequest.getGoogleUrl() + "<br>";
        result += downloadUploadRequest.getTsec() + "<br>";
        result += downloadUploadRequest.getAsoGDUrl() + "<br>";

        return result;
    }



}
