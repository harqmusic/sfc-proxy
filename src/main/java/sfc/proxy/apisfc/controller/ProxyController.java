package sfc.proxy.apisfc.controller;

import java.sql.Blob;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sfc.proxy.apisfc.dto.DownloadUploadRequest;
import sfc.proxy.apisfc.dto.DownloadUploadResponse;
import sfc.proxy.apisfc.service.DocumentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/sfcproxy")
public class ProxyController {

    private final DocumentService documentService;

    public ProxyController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/getGoogleDocument")
    public @ResponseBody DownloadUploadResponse getGoogleDocument(@RequestBody DownloadUploadRequest downloadUploadRequest){

        DownloadUploadResponse downloadUploadResponse = new DownloadUploadResponse();
        downloadUploadResponse.setAsoGDUrl(downloadUploadRequest.getAsoGDUrl());
        downloadUploadResponse.setGoogleUrl(downloadUploadRequest.getGoogleUrl());
        downloadUploadResponse.setTsec(downloadUploadRequest.getTsec());

        String googleDocumentString = documentService.getGoogleDocument(downloadUploadRequest.getGoogleUrl(), downloadUploadResponse);

        if(googleDocumentString.equals("ERROR")) {
            return downloadUploadResponse;
        }

        documentService.uploadBinaryToGD(googleDocumentString, downloadUploadRequest.getTsec(), downloadUploadRequest.getAsoGDUrl(), downloadUploadResponse);
        return downloadUploadResponse;
    }



}
