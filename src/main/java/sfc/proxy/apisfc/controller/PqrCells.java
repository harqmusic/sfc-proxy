package sfc.proxy.apisfc.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import sfc.proxy.apisfc.service.PqrCellsService;
import sfc.proxy.apisfc.service.TopicResponse;



@RestController
@RequestMapping("/pqrcells")
public class PqrCells {




    //HEROKU
    @CrossOrigin(origins = "*")
    @GetMapping(value= "account/{client-id}", produces="application/json")
    public @ResponseBody String getAccountJson(@PathVariable(value = "client-id") String clientId) {

        JSONObject jsonObject = PqrCellsService.getAccountJson();

        return jsonObject.toString();
    }



    //ASO
    ///customers/v0/customers?identityDocument.documentNumber=000001032422977&identityDocument.documentType.id=1
    @CrossOrigin(origins = "*")
    @GetMapping(value= "customers/v0/customers", produces="application/json")
    public @ResponseBody String getAccountAso(@RequestParam("identityDocument.documentNumber") String clientId, @RequestParam("identityDocument.documentType.id") String id) {

        JSONObject jsonObject = PqrCellsService.getAccountAso();
        return jsonObject.toString();
    }

    ///customers/v1/customers/1000000091251449/classifications
    @CrossOrigin(origins = "*")
    @GetMapping(value = "customers/v1/customers/{client-id}/classifications", produces="application/json")
    public @ResponseBody String getClassificationAso(@PathVariable(value = "client-id") String clientId) {

        JSONObject jsonObject = PqrCellsService.getClassificationAso();
        return jsonObject.toString();
    }

    ///https://cellsaso.live.co.nextgen.igrupobbva/salesforce-issue-tracker/v0/issues?targetUserId=01-91251449
    /*@CrossOrigin(origins = "*")
    @GetMapping(value = "salesforce-issue-tracker/v0/issues", produces="application/json")
    public @ResponseBody String getIssuesAso(@RequestParam("targetUserId") String targetUserId) {

        JSONObject jsonObject = PqrCellsService.getIssuesAso();
        return jsonObject.toString();
    }*/

    ///https://cellsaso.live.co.nextgen.igrupobbva/salesforce-issue-tracker/v0/issues
    @CrossOrigin(origins = "*")
    @PostMapping(value = "salesforce-issue-tracker/v0/issues", produces="application/json")
    public @ResponseBody String postNewCaseAso(@RequestBody Object newCase) {

        JSONObject jsonObject = PqrCellsService.postNewCaseAso();
        return jsonObject.toString();
    }

    //https://cellsaso.live.co.nextgen.igrupobbva/customers/v1/customers/05971614/contact-details
    @CrossOrigin(origins = "*")
    @GetMapping(value = "customers/v1/customers/{client-id}/contact-details", produces="application/json")
    public @ResponseBody String getContactDetailesAso(@PathVariable(value = "client-id") String clientId) {

        JSONObject jsonObject = PqrCellsService.getContactDetailesAso();
        return jsonObject.toString();
    }

    //https://cellsaso.live.co.nextgen.igrupobbva/customers/v1/customers/1000000091251449/addresses
    @CrossOrigin(origins = "*")
    @GetMapping(value = "customers/v1/customers/{client-id}/addresses", produces="application/json")
    public @ResponseBody String getAddressesAso(@PathVariable(value = "client-id") String clientId) {

        JSONObject jsonObject = PqrCellsService.getAddressesAso();
        return jsonObject.toString();
    }

    //http://localhost:8080/pqrcells/contracts/v0/contracts?customer-id=10000010324229770
    @CrossOrigin(origins = "*")
    @GetMapping(value = "contracts/v0/contracts", produces="application/json")
    public @ResponseBody String getContractsAso(@RequestParam("customer-id") String productId) {

        JSONObject jsonObject = PqrCellsService.getContractsAso();
        return jsonObject.toString();
    }

    //http://localhost:8080/pqrcells/salesforce-issue-tracker/v0/topics?product.Id=0&subProduct.Id=0
    @CrossOrigin(origins = "*")
    @GetMapping(value = "salesforce-issue-tracker/v0/topics", produces="application/json")
    public @ResponseBody String getTopicsAso(@RequestParam("product.Id") String productId, @RequestParam("subProduct.Id") String supProductIdtargetUserIdd) {

        //JSONObject jsonObject = PqrCellsService.getTopicsAso();
        JSONObject jsonObject = TopicResponse.getTopicsAso();

        return jsonObject.toString();
    }

    //https://cellsaso.live.co.nextgen.igrupobbva/geographicplaces/v0/countries
    @CrossOrigin(origins = "*")
    @GetMapping(value = "geographicplaces/v0/countries", produces="application/json")
    public @ResponseBody String getCountriesAso() {

        JSONObject jsonObject = PqrCellsService.getCountriesAso();
        return jsonObject.toString();
    }

    //https://cellsaso.live.co.nextgen.igrupobbva/geographicplaces/v0/states?country.id=CO
    @CrossOrigin(origins = "*")
    @GetMapping(value = "geographicplaces/v0/states", produces="application/json")
    public @ResponseBody String getStatesAso(@RequestParam("country.id") String productId) {

        JSONObject jsonObject = PqrCellsService.getStatesAso();
        return jsonObject.toString();
    }

    //https://cellsaso.live.co.nextgen.igrupobbva/geographicplaces/v0/cities?country.id=CO&state.id=CO-AMA
    @CrossOrigin(origins = "*")
    @GetMapping(value = "geographicplaces/v0/cities", produces="application/json")
    public @ResponseBody String getCitiesAso(@RequestParam("country.id") String countryId, @RequestParam("state.id") String stateId) {

        JSONObject jsonObject = PqrCellsService.getCitiesAso();
        return jsonObject.toString();
    }

    //https://qa-cellsaso.work.co.nextgen.igrupobbva/salesforce-issue-tracker/v0/issues/5007j00000Gw8rkAAB
    @CrossOrigin(origins = "*")
    @GetMapping(value = "salesforce-issue-tracker/v0/issues/{case-id}", produces="application/json")
    public @ResponseBody String getIssueASO(@PathVariable(value = "case-id") String caseId) {

        JSONObject jsonObject = PqrCellsService.getIssueAso();
        return jsonObject.toString();
    }

    //https://cellsaso.live.co.nextgen.igrupobbva/salesforce-issue-tracker/v0/issues?targetUserId=01-91251449
    @CrossOrigin(origins = "*")
    @GetMapping(value = "salesforce-issue-tracker/v0/issues", produces="application/json")
    public @ResponseBody String listIssuesASO(@RequestParam("targetUserId") String targetUserId) {

        JSONObject jsonObject = PqrCellsService.getListIssuesAso();
        return jsonObject.toString();
    }


}
