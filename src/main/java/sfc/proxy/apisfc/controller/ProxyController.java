package sfc.proxy.apisfc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sfc.proxy.apisfc.service.DocumentService;

@RestController
@RequestMapping("/sfcproxy")
public class ProxyController {

    private final DocumentService documentService;

    public ProxyController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/getGoogleDocument")
    public String getGoogleDocument(@RequestParam String googleUrl){

        String result = documentService.getGoogleDocument(googleUrl);

        return result;
    }

}
