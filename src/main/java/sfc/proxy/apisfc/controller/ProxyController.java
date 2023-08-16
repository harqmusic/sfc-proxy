package sfc.proxy.apisfc.controller;

import java.sql.Blob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sfc.proxy.apisfc.dto.DownloadUploadRequest;
import sfc.proxy.apisfc.dto.DownloadUploadResponse;
import sfc.proxy.apisfc.service.DocumentService;

@RestController
@RequestMapping("/sfcproxy")
public class ProxyController {

    private final DocumentService documentService;

    public ProxyController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/getGoogleDocument2")
    public String getGoogleDocument2(@RequestParam String googleUrl, @RequestParam String GoogleAccessId, @RequestParam String Signature, @RequestBody String jsonRequestString){

        //String result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature);
        String result = documentService.getGoogleDocument2(googleUrl + "&GoogleAccessId=");

        return result;
    }

    @GetMapping("/getGoogleDocument")
    public @ResponseBody DownloadUploadResponse getGoogleDocument(@RequestBody DownloadUploadRequest downloadUploadRequest){

        //String result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature);
        //Blob result = documentService.getGoogleDocument(googleUrl + "&GoogleAccessId=" + GoogleAccessId +"&Signature=" + Signature, jsonRequestString);

        String googleDocumentString = documentService.getGoogleDocument2(downloadUploadRequest.getGoogleUrl());
        String fileId = documentService.uploadBinaryToGD(googleDocumentString, downloadUploadRequest.getTsec(), downloadUploadRequest.getAsoGDUrl());

        String result =  "OK: <br>" + downloadUploadRequest.getGoogleUrl() + "<br>";
        result += downloadUploadRequest.getTsec() + "<br>";
        result += downloadUploadRequest.getAsoGDUrl() + "<br>";
        result += downloadUploadRequest.getAsoGDUrl() + "fileId: " + fileId;


        DownloadUploadResponse downloadUploadResponse = new DownloadUploadResponse();
        downloadUploadResponse.setAsoGDUrl(downloadUploadRequest.getAsoGDUrl());
        downloadUploadResponse.setGoogleUrl(downloadUploadRequest.getGoogleUrl());
        downloadUploadResponse.setTsec(downloadUploadRequest.getTsec());
        downloadUploadResponse.setResult(result);

        return downloadUploadResponse;
    }



}
