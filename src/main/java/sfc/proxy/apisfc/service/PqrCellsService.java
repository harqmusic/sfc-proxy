package sfc.proxy.apisfc.service;

import org.json.JSONObject;

public class PqrCellsService {




    public static JSONObject getAccountJson() {

        JSONObject jsonObject = new JSONObject("{"
            +"\"customerId\": \"05971614\","
            +"\"firstName\": \"NELSON EDUARDO\","
            +"\"lastName\": \"MENJURA\","
            +"\"secondLastName\": \"GONZALEZ\","
            +"\"birthData\": {"
                +"\"city\": \"BUCARAMANGA\","
                +"\"state\": {"
                    +"\"id\": \"68\","
                    +"\"name\": \"SANTANDER\""
                +"},"
                +"\"country\": {"
                    +"\"id\": \"COL\","
                    +"\"name\": \"COLOMBIA\""
                +"},"
                +"\"birthDate\": \"1967-08-26\""
            +"},"
            +"\"nationalities\": ["
                +"{"
                    +"\"id\": \"COL\","
                    +"\"name\": \"COLOMBIA\""
                +"}"
            +"],"
            +"\"identityDocuments\": ["
                +"{"
                    +"\"documentType\": {"
                        +"\"id\": \"CC\","
                        +"\"name\": \"CEDULA DE CIUDADANIA\""
                    +"},"
                    +"\"country\": {"
                        +"\"id\": \"COL\","
                        +"\"name\": \"COLOMBIA\""
                    +"},"
                    +"\"state\": {"
                        +"\"id\": \"68\","
                        +"\"name\": \"SANTANDER\""
                    +"},"
                    +"\"status\": {"
                        +"\"id\": \"ACTIVE\","
                        +"\"name\": \"ACTIVO\""
                    +"},"
                    +"\"issueDate\": \"1985-08-31\","
                    +"\"expirationDate\": \"9999-12-31\","
                    +"\"documentNumber\": \"000000091251449\","
                    +"\"city\": \"BUCARAMANGA\""
                +"}"
            +"],"
            +"\"membershipDate\": \"2008-02-23\","
            +"\"personalTitle\": {"
                +"\"id\": \"SER\","
                +"\"name\": \"SR             SE#OR\""
            +"},"
            +"\"maritalStatus\": {"
                +"\"id\": \"MARRIED\","
                +"\"name\": \"CASADO\""
            +"},"
            +"\"gender\": {"
                +"\"id\": \"MALE\","
                +"\"name\": \"MASCULINO\""
            +"},"
            +"\"bank\": {"
                +"\"bankId\": \"0013\","
                +"\"name\": \"BBVA COLOMBIA\","
                +"\"branch\": {"
                    +"\"branchId\": \"0084\","
                    +"\"name\": \"BARRANCABERMEJA\""
                +"}"
            +"},"
            +"\"residence\": {"
                +"\"country\": {"
                    +"\"id\": \"COL\","
                    +"\"name\": \"COLOMBIA\""
                +"},"
                +"\"residenceType\": {"
                    +"\"id\": \"PERMANENT\","
                    +"\"name\": \"PERMANENTE\""
                +"},"
                +"\"startDate\": \"1999-01-01\""
            +"},"
            +"\"creationDate\": \"2008-02-23\","
            +"\"lastModification\": {"
                +"\"terminal\": \"PEX0\","
                +"\"updateHour\": \"14.01.24\","
                +"\"businessAgent\": {"
                    +"\"id\": \"C794656\""
                +"}"
            +"}"
        +"}");


        return jsonObject;
    }

    public static JSONObject getAccountAso() {

        JSONObject jsonObject = new JSONObject("{\"data\": [{"
            +"\"customerId\": \"05971614\","
            +"\"firstName\": \"NELSON EDUARDO\","
            +"\"lastName\": \"MENJURA\","
            +"\"secondLastName\": \"GONZALEZ\","
            +"\"birthData\": {"
                +"\"city\": \"BUCARAMANGA\","
                +"\"state\": {"
                    +"\"id\": \"68\","
                    +"\"name\": \"SANTANDER\""
                +"},"
                +"\"country\": {"
                    +"\"id\": \"COL\","
                    +"\"name\": \"COLOMBIA\""
                +"},"
                +"\"birthDate\": \"1967-08-26\""
            +"},"
            +"\"nationalities\": ["
                +"{"
                    +"\"id\": \"COL\","
                    +"\"name\": \"COLOMBIA\""
                +"}"
            +"],"
            +"\"identityDocuments\": ["
                +"{"
                    +"\"documentType\": {"
                        +"\"id\": \"CC\","
                        +"\"name\": \"CEDULA DE CIUDADANIA\""
                    +"},"
                    +"\"country\": {"
                        +"\"id\": \"COL\","
                        +"\"name\": \"COLOMBIA\""
                    +"},"
                    +"\"state\": {"
                        +"\"id\": \"68\","
                        +"\"name\": \"SANTANDER\""
                    +"},"
                    +"\"status\": {"
                        +"\"id\": \"ACTIVE\","
                        +"\"name\": \"ACTIVO\""
                    +"},"
                    +"\"issueDate\": \"1985-08-31\","
                    +"\"expirationDate\": \"9999-12-31\","
                    +"\"documentNumber\": \"000000091251449\","
                    +"\"city\": \"BUCARAMANGA\""
                +"}"
            +"],"
            +"\"membershipDate\": \"2008-02-23\","
            +"\"personalTitle\": {"
                +"\"id\": \"SER\","
                +"\"name\": \"SR             SE#OR\""
            +"},"
            +"\"maritalStatus\": {"
                +"\"id\": \"MARRIED\","
                +"\"name\": \"CASADO\""
            +"},"
            +"\"gender\": {"
                +"\"id\": \"MALE\","
                +"\"name\": \"MASCULINO\""
            +"},"
            +"\"bank\": {"
                +"\"bankId\": \"0013\","
                +"\"name\": \"BBVA COLOMBIA\","
                +"\"branch\": {"
                    +"\"branchId\": \"0084\","
                    +"\"name\": \"BARRANCABERMEJA\""
                +"}"
            +"},"
            +"\"residence\": {"
                +"\"country\": {"
                    +"\"id\": \"COL\","
                    +"\"name\": \"COLOMBIA\""
                +"},"
                +"\"residenceType\": {"
                    +"\"id\": \"PERMANENT\","
                    +"\"name\": \"PERMANENTE\""
                +"},"
                +"\"startDate\": \"1999-01-01\""
            +"},"
            +"\"creationDate\": \"2008-02-23\","
            +"\"lastModification\": {"
                +"\"terminal\": \"PEX0\","
                +"\"updateHour\": \"14.01.24\","
                +"\"businessAgent\": {"
                    +"\"id\": \"C794656\""
                +"}"
            +"}"
        +"}]}");
        return jsonObject;
    }



    ///customers/v1/customers/1000001032422977/classification

    public static JSONObject getClassificationAso() {

        JSONObject jsonObject = new JSONObject(
                "{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"0001\"," +
                "            \"consumerProfile\": \"0188\"," +
                "            \"segments\": [" +
                "                {" +
                "                    \"id\": \"84000 N\"," +
                "                    \"description\": \"TRANSACCIONAL(CLASICO)\"" +
                "                }" +
                "            ]," +
                "            \"residualProducts\": {" +
                "                \"id\": \"N\"" +
                "            }" +
                "        }" +
                "    ]" +
                "}"
        );
        return jsonObject;
    }

    //salesforce-issue-tracker/v0/issues?targetUserId=01-91251449

    public static JSONObject getIssuesAso() {

        JSONObject jsonObject = new JSONObject(
                "{" +
                        "    \"data\": [" +
                        "        {" +
                        "            \"id\": \"00328697\"," +
                        "            \"subject\": \"Superfinanciera - 20\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"menju.abg.22@gmail.com\"," +
                        "                        \"contactType\": \"Email\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm00000GBFAQIA5\"," +
                        "            \"origin\": \"10\"," +
                        "            \"internalIssueId\": \"500Dm00000GBFAQIA5\"," +
                        "            \"creationDate\": \"2023-10-13T15:05:06.000-0500\"," +
                        "            \"classification\": \"Endosos de Seguros\"," +
                        "            \"closeDate\": \"2023-10-31T13:15:57.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-11-07T17:01:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00268344\"," +
                        "            \"subject\": \"Superfinanciera - 99\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"menju.abg.22@gmail.com\"," +
                        "                        \"contactType\": \"Email\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm000005jb0HIAQ\"," +
                        "            \"origin\": \"10\"," +
                        "            \"internalIssueId\": \"500Dm000005jb0HIAQ\"," +
                        "            \"creationDate\": \"2023-05-10T15:03:50.000-0500\"," +
                        "            \"classification\": \"Seguros\"," +
                        "            \"closeDate\": \"2023-05-21T08:46:29.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-06-01T17:01:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00265093\"," +
                        "            \"subject\": \"Superfinanciera - 99\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"menju.abg.22@gmail.com\"," +
                        "                        \"contactType\": \"Email\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm000001AOPtIAO\"," +
                        "            \"origin\": \"10\"," +
                        "            \"internalIssueId\": \"500Dm000001AOPtIAO\"," +
                        "            \"creationDate\": \"2023-05-02T15:05:09.000-0500\"," +
                        "            \"classification\": \"Seguros\"," +
                        "            \"closeDate\": \"2023-05-04T11:04:45.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-05-24T17:01:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00262722\"," +
                        "            \"subject\": \"Superfinanciera - 7\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"menju.abg.22@gmail.com\"," +
                        "                        \"contactType\": \"Email\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm0000019gGIIAY\"," +
                        "            \"origin\": \"10\"," +
                        "            \"internalIssueId\": \"500Dm0000019gGIIAY\"," +
                        "            \"creationDate\": \"2023-04-25T08:08:35.000-0500\"," +
                        "            \"classification\": \"Seguros\"," +
                        "            \"closeDate\": \"2023-04-27T16:36:32.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-05-03T17:01:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00242030\"," +
                        "            \"subject\": \"Superfinanciera - 99\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"menju.abg.22@gmail.com\"," +
                        "                        \"contactType\": \"Email\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm0000018d1XIAQ\"," +
                        "            \"origin\": \"10\"," +
                        "            \"internalIssueId\": \"500Dm0000018d1XIAQ\"," +
                        "            \"creationDate\": \"2023-02-25T08:07:56.000-0500\"," +
                        "            \"classification\": \"Seguros\"," +
                        "            \"closeDate\": \"2023-03-13T13:53:03.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-03-21T17:00:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00230143\"," +
                        "            \"subject\": \"Revisión y/o liquidación - Liquidación de seguros\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"menju.abg.22@gmail.com\"," +
                        "                        \"contactType\": \"Email\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm00000187h6IAA\"," +
                        "            \"origin\": \"01\"," +
                        "            \"internalIssueId\": \"500Dm00000187h6IAA\"," +
                        "            \"creationDate\": \"2023-01-25T09:50:03.000-0500\"," +
                        "            \"classification\": \"Liquidación de seguros\"," +
                        "            \"closeDate\": \"2023-02-02T09:51:28.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-02-15T17:01:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00227809\"," +
                        "            \"subject\": \"Revisión y liquidación - Reestructuración deuda\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"a@b.com\"," +
                        "                        \"contactType\": \"No Aplica\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"500Dm00000183yoIAA\"," +
                        "            \"origin\": \"01\"," +
                        "            \"internalIssueId\": \"500Dm00000183yoIAA\"," +
                        "            \"creationDate\": \"2023-01-19T11:45:42.000-0500\"," +
                        "            \"classification\": \"Solicitud de documentos\"," +
                        "            \"closeDate\": \"2023-01-28T09:31:27.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2023-02-09T17:01:00.000-0500\"" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"00200202\"," +
                        "            \"subject\": \"Indebida atención - Trato inadecuado en oficina\"," +
                        "            \"status\": \"07\"," +
                        "            \"issuer\": {" +
                        "                \"fullName\": \"NELSON EDUARDO MENJURA GONZALEZ\"," +
                        "                \"contactDetails\": [" +
                        "                    {" +
                        "                        \"contact\": \"NELSON@BBVA.COM, EL BANCO, MAGDALENA, COLOMBIA\"," +
                        "                        \"contactType\": \"Address\"" +
                        "                    }" +
                        "                ]" +
                        "            }," +
                        "            \"description\": \"5003p00002kx8nKAAQ\"," +
                        "            \"origin\": \"01\"," +
                        "            \"internalIssueId\": \"5003p00002kx8nKAAQ\"," +
                        "            \"creationDate\": \"2022-11-02T15:18:48.000-0500\"," +
                        "            \"classification\": \"Servicio brindado Oficina\"," +
                        "            \"closeDate\": \"2022-11-09T11:27:10.000-0500\"," +
                        "            \"targetedCompletionDate\": \"2022-11-25T17:01:00.000-0500\"" +
                        "        }" +
                        "    ]" +
                        "}"
        );
        return jsonObject;
    }

    public static JSONObject getContactDetailesAso() {

        JSONObject jsonObject = new JSONObject("{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"001\"," +
                "            \"adsAllowed\": false," +
                "            \"isPreferential\": false," +
                "            \"contact\": {" +
                "                \"contactDetailType\": \"LANDLINE\"," +
                "                \"number\": \"6076884152\"," +
                "                \"phoneType\": \"HOME\"," +
                "                \"country\": {" +
                "                    \"id\": \"COL\"," +
                "                    \"name\": \"COLOMBIA\"" +
                "                }," +
                "                \"extension\": \"00000\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"002\"," +
                "            \"adsAllowed\": false," +
                "            \"isPreferential\": false," +
                "            \"contact\": {" +
                "                \"contactDetailType\": \"LANDLINE\"," +
                "                \"number\": \"6079125449\"," +
                "                \"phoneType\": \"HOME\"," +
                "                \"country\": {" +
                "                    \"id\": \"COL\"," +
                "                    \"name\": \"COLOMBIA\"" +
                "                }," +
                "                \"extension\": \"00000\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"003\"," +
                "            \"adsAllowed\": false," +
                "            \"isPreferential\": false," +
                "            \"lastUpdateDate\": \"2021-07-23\"," +
                "            \"contact\": {" +
                "                \"contactDetailType\": \"LANDLINE\"," +
                "                \"number\": \"3144717163\"," +
                "                \"phoneType\": \"HOME\"," +
                "                \"country\": {" +
                "                    \"id\": \"COL\"," +
                "                    \"name\": \"COLOMBIA\"" +
                "                }," +
                "                \"extension\": \"00000\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"004\"," +
                "            \"adsAllowed\": false," +
                "            \"isPreferential\": false," +
                "            \"contact\": {" +
                "                \"contactDetailType\": \"EMAIL\"," +
                "                \"address\": \"NELSON@BBVA.COM\"," +
                "                \"receivesNotifications\": false" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"005\"," +
                "            \"adsAllowed\": false," +
                "            \"isPreferential\": false," +
                "            \"contact\": {" +
                "                \"contactDetailType\": \"EMAIL\"," +
                "                \"address\": \"NELSON@GMAIL.COM\"," +
                "                \"receivesNotifications\": false" +
                "            }" +
                "        }" +
                "    ]" +
                "}");
        return jsonObject;
    }

    public static JSONObject getAddressesAso() {

        JSONObject jsonObject = new JSONObject("{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"01001\"," +
                "            \"isPreferential\": false," +
                "            \"isChecked\": false," +
                "            \"addressType\": {" +
                "                \"id\": \"8\"," +
                "                \"description\": \"CORRESPONDENCIA\"" +
                "            }," +
                "            \"ownershipType\": {" +
                "                \"id\": \"F\"," +
                "                \"description\": \"FAMILIAR\"," +
                "                \"propertyType\": {" +
                "                    \"id\": \"F\"," +
                "                    \"description\": \"FAMILIAR\"" +
                "                }" +
                "            }," +
                "            \"location\": {" +
                "                \"formattedAddress\": \"CLL 74 A # 49-63\"," +
                "                \"locationTypes\": [" +
                "                    \"CORRESPONDENCIA\"" +
                "                ]," +
                "                \"addressComponents\": [" +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"PAIS\"" +
                "                        ]," +
                "                        \"code\": \"COL\"," +
                "                        \"name\": \"COLOMBIA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"DEPARTAMENTO\"" +
                "                        ]," +
                "                        \"code\": \"68\"," +
                "                        \"name\": \"SANTANDER\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"CIUDAD\"" +
                "                        ]," +
                "                        \"code\": \"01\"," +
                "                        \"name\": \"BUCARAMANGA\"" +
                "                    }" +
                "                ]," +
                "                \"geolocation\": {" +
                "                    \"latitude\": 999.0," +
                "                    \"longitude\": 0.0" +
                "                }," +
                "                \"meta\": {" +
                "                    \"stratum\": \"06\"" +
                "                }" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"02001\"," +
                "            \"isPreferential\": false," +
                "            \"isChecked\": false," +
                "            \"addressType\": {" +
                "                \"id\": \"I\"," +
                "                \"description\": \"POSTAL\"" +
                "            }," +
                "            \"ownershipType\": {" +
                "                \"id\": \"X\"," +
                "                \"description\": \"OTROS\"," +
                "                \"propertyType\": {" +
                "                    \"id\": \"X\"," +
                "                    \"description\": \"OTROS\"" +
                "                }" +
                "            }," +
                "            \"location\": {" +
                "                \"formattedAddress\": \"Cl 60 1 111 Casa 24\"," +
                "                \"locationTypes\": [" +
                "                    \"POSTAL\"" +
                "                ]," +
                "                \"addressComponents\": [" +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"PAIS\"" +
                "                        ]," +
                "                        \"code\": \"COL\"," +
                "                        \"name\": \"COLOMBIA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"DEPARTAMENTO\"" +
                "                        ]," +
                "                        \"code\": \"68\"," +
                "                        \"name\": \"SANTANDER\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"CIUDAD\"" +
                "                        ]," +
                "                        \"code\": \"01\"," +
                "                        \"name\": \"BUCARAMANGA\"" +
                "                    }" +
                "                ]," +
                "                \"geolocation\": {" +
                "                    \"latitude\": 4.0," +
                "                    \"longitude\": 0.0" +
                "                }," +
                "                \"meta\": {" +
                "                    \"stratum\": \"00\"" +
                "                }" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"03245\"," +
                "            \"isPreferential\": false," +
                "            \"isChecked\": false," +
                "            \"addressType\": {" +
                "                \"id\": \"0\"," +
                "                \"description\": \"RESIDENCIA\"" +
                "            }," +
                "            \"ownershipType\": {" +
                "                \"id\": \"L\"," +
                "                \"description\": \"PROPIA SIN HIP.\"," +
                "                \"propertyType\": {" +
                "                    \"id\": \"L\"," +
                "                    \"description\": \"PROPIA SIN HIP.\"" +
                "                }" +
                "            }," +
                "            \"location\": {" +
                "                \"formattedAddress\": \"CLL 2 A # 6-30\"," +
                "                \"locationTypes\": [" +
                "                    \"RESIDENCIA\"" +
                "                ]," +
                "                \"addressComponents\": [" +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"PAIS\"" +
                "                        ]," +
                "                        \"code\": \"COL\"," +
                "                        \"name\": \"COLOMBIA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"DEPARTAMENTO\"" +
                "                        ]," +
                "                        \"code\": \"47\"," +
                "                        \"name\": \"MAGDALENA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"CIUDAD\"" +
                "                        ]," +
                "                        \"code\": \"01\"," +
                "                        \"name\": \"EL BANCO\"" +
                "                    }" +
                "                ]," +
                "                \"geolocation\": {" +
                "                    \"latitude\": 5.0," +
                "                    \"longitude\": 0.0" +
                "                }," +
                "                \"meta\": {" +
                "                    \"stratum\": \"03\"" +
                "                }" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"04001\"," +
                "            \"isPreferential\": false," +
                "            \"isChecked\": false," +
                "            \"addressType\": {" +
                "                \"id\": \"1\"," +
                "                \"description\": \"OFICINA\"" +
                "            }," +
                "            \"ownershipType\": {" +
                "                \"id\": \"X\"," +
                "                \"description\": \"OTROS\"," +
                "                \"propertyType\": {" +
                "                    \"id\": \"X\"," +
                "                    \"description\": \"OTROS\"" +
                "                }" +
                "            }," +
                "            \"location\": {" +
                "                \"formattedAddress\": \"CRA 13 # 36-36\"," +
                "                \"locationTypes\": [" +
                "                    \"OFICINA\"" +
                "                ]," +
                "                \"addressComponents\": [" +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"PAIS\"" +
                "                        ]," +
                "                        \"code\": \"COL\"," +
                "                        \"name\": \"COLOMBIA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"DEPARTAMENTO\"" +
                "                        ]," +
                "                        \"code\": \"68\"," +
                "                        \"name\": \"SANTANDER\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"CIUDAD\"" +
                "                        ]," +
                "                        \"code\": \"01\"," +
                "                        \"name\": \"BUCARAMANGA\"" +
                "                    }" +
                "                ]," +
                "                \"geolocation\": {" +
                "                    \"latitude\": 8.0," +
                "                    \"longitude\": 0.0" +
                "                }," +
                "                \"meta\": {" +
                "                    \"stratum\": \"00\"" +
                "                }" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"05245\"," +
                "            \"isPreferential\": false," +
                "            \"isChecked\": false," +
                "            \"addressType\": {" +
                "                \"id\": \"E\"," +
                "                \"description\": \"CORREO ELECTR.\"" +
                "            }," +
                "            \"ownershipType\": {" +
                "                \"id\": \"X\"," +
                "                \"description\": \"OTROS\"," +
                "                \"propertyType\": {" +
                "                    \"id\": \"X\"," +
                "                    \"description\": \"OTROS\"" +
                "                }" +
                "            }," +
                "            \"location\": {" +
                "                \"formattedAddress\": \"NELSON@BBVA.COM\"," +
                "                \"locationTypes\": [" +
                "                    \"CORREO ELECTR.\"" +
                "                ]," +
                "                \"addressComponents\": [" +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"PAIS\"" +
                "                        ]," +
                "                        \"code\": \"COL\"," +
                "                        \"name\": \"COLOMBIA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"DEPARTAMENTO\"" +
                "                        ]," +
                "                        \"code\": \"47\"," +
                "                        \"name\": \"MAGDALENA\"" +
                "                    }," +
                "                    {" +
                "                        \"componentTypes\": [" +
                "                            \"CIUDAD\"" +
                "                        ]," +
                "                        \"code\": \"01\"," +
                "                        \"name\": \"EL BANCO\"" +
                "                    }" +
                "                ]," +
                "                \"geolocation\": {" +
                "                    \"latitude\": 9.0," +
                "                    \"longitude\": 0.0" +
                "                }," +
                "                \"meta\": {" +
                "                    \"stratum\": \"00\"" +
                "                }" +
                "            }" +
                "        }" +
                "    ]" +
                "}");
        return jsonObject;
    }

    public static JSONObject getContractsAso() {

        JSONObject jsonObject = new JSONObject("{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"05971614\"," +
                "            \"number\": \"001301585008286874\"," +
                "            \"numberType\": {" +
                "                \"id\": \"CCC\"" +
                "            }," +
                "            \"product\": {" +
                "                \"id\": \"50\"," +
                "                \"name\": \"TARJETA CREDITO\"," +
                "                \"productType\": {" +
                "                    \"id\": \"CARD\"" +
                "                }" +
                "            }," +
                "            \"status\": {" +
                "                \"id\": \"ACTIVE\"," +
                "                \"description\": \"CONTRATO ACTIVO\"" +
                "            }," +
                "            \"relatedContracts\": [" +
                "                {" +
                "                    \"id\": \"001301585008286874\"," +
                "                    \"number\": \"5035\"," +
                "                    \"numberType\": {" +
                "                        \"id\": \"PAN\"" +
                "                    }," +
                "                    \"product\": {" +
                "                        \"id\": \"50\"," +
                "                        \"name\": \"TARJETA CREDITO\"" +
                "                    }," +
                "                    \"subproduct\": {" +
                "                        \"id\": \"72\"," +
                "                        \"name\": \"MASTER PLATINUM\"," +
                "                        \"description\": \"MASTER PLATINUM\"" +
                "                    }," +
                "                    \"status\": {" +
                "                        \"id\": \"CANCELED\"," +
                "                        \"description\": \"PRODUCTO CANCELADO\"" +
                "                    }," +
                "                    \"relationType\": {" +
                "                        \"id\": \"LINKED WITH\"," +
                "                        \"name\": \"LINKED WITH\"" +
                "                    }" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"05971614\"," +
                "            \"number\": \"001301589623277498\"," +
                "            \"numberType\": {" +
                "                \"id\": \"CCC\"" +
                "            }," +
                "            \"product\": {" +
                "                \"id\": \"96\"," +
                "                \"name\": \"VEHNVOCPCOMB90%TRA12\"," +
                "                \"productType\": {" +
                "                    \"id\": \"LOAN\"" +
                "                }" +
                "            }," +
                "            \"status\": {" +
                "                \"id\": \"ACTIVE\"," +
                "                \"description\": \"CONTRATO ACTIVO\"" +
                "            }," +
                "            \"relatedContracts\": [" +
                "                {" +
                "                    \"id\": \"001301589623277498\"," +
                "                    \"product\": {" +
                "                        \"id\": \"96\"," +
                "                        \"name\": \"VEHNVOCPCOMB90%TRA12\"" +
                "                    }," +
                "                    \"subproduct\": {" +
                "                        \"id\": \"3195\"," +
                "                        \"name\": \"VEHNVOCPCOMB90%TRA12\"," +
                "                        \"description\": \"VEHNVOCPCOMB90%TRA12\"" +
                "                    }," +
                "                    \"status\": {" +
                "                        \"id\": \"ACTIVE\"," +
                "                        \"description\": \"CONTRATO ACTIVO\"" +
                "                    }," +
                "                    \"relationType\": {" +
                "                        \"id\": \"LINKED WITH\"," +
                "                        \"name\": \"LINKED WITH\"" +
                "                    }" +
                "                }" +
                "            ]" +
                "        }" +
                "    ]" +
                "}");
        return jsonObject;
    }

    public static JSONObject getTopicsAso() {
        String parteA = "{" +
        "    \"data\": [" +
        "        {" +
        "            \"id\": \"a0h3p00000BPPYKAA5\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente relacionada con atención de la solicitud del alivio financiero.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Incumplimiento aplicación de alivio financiero\"" +
        "                }," +
        "                \"specificSubject\": \"Incumplimiento aplicación de alivio financiero\"," +
        "                \"tooltip\": \"Antes de radicar valida en los productos y explica si ya se aplicaron los alivios financieros\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"3\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfWB7AAN\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la retención del cliente.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Tarjeta de crédito - Cancelación TDC o retención - falencia de retención\"," +
        "                \"tooltip\": \"Tema Call center retención\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3UAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Cajero automático con relación a la Transacciones no reconocidas - Posible clonación\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - Posible clonación Atm's\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3aAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la Inconformidad programa puntos\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad programa puntos\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3cAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la Inconformidad Rediferidos\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad Rediferidos\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfXhEAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto tarjeta de crédito relación a los Certificados Financieros\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Certificado costos Financieros\"," +
        "                \"tooltip\": \"Validar antes de radicar si pueden entregar los certificados solicitados\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3nAAB\"," +
        "            \"description\": \"Solicitud relacionada con el transacción de pago realizado en el caja de las oficinas.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Pago irregular en caja\"" +
        "                }," +
        "                \"specificSubject\": \"Consignación Duplicada\"," +
        "                \"tooltip\": \"Valida si es posible realizar la reversión de la operación antes de radicar su petición.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"13\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3tAAB\"," +
        "            \"description\": \"Solicitud relacionada con debito presentado en la cuenta del Cliente por motivos no establecidos o que ameriten algún tipo de investigación interna.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Descuentos injustificados\"" +
        "                }," +
        "                \"specificSubject\": \"Debitó automático no autorizado\"," +
        "                \"tooltip\": \"No radiques si el descuento corresponde a un barrido para el pago de obligaciones con BBVA, explícale al cliente que se trata del pago de obligaciones contraídas con el Banco, que se encuentran en mora o domiciliadas según corresponda.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3wAAB\"," +
        "            \"description\": \"Solicitud relacionada con la entrega parcial o total de dinero en los cajeros del Bbva administrado por la oficina.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Debitó y no entregó cajero Bbva\"," +
        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"9\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3zAAB\"," +
        "            \"description\": \"Solicitud relacionada con la entrega parcial o total de dinero en los cajeros automáticos utilizados en el exterior.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Debitó y no entregó cajero internacional\"," +
        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Bs0SGAAZ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad Compra - Toma de datos\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\\r\\n" + //
        " \\r\\n" + //
        " Validar que no tenga antecedentes en los últimos 6 meses.\\r\\n" + //
        " Validar el Monto según el segmento.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"9\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfXyPAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la Seguros\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Seguros\"," +
        "                \"tooltip\": \"Antes de radicar, válida :\\n" + //
        "- No radiques si son casos de seguros de vida\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"12\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs42AAB\"," +
        "            \"description\": \"Solicitud relacionada con la entrega parcial o total de dinero en cajeros diferentes al Bbva.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Debitó y no entregó cajero otras redes\"," +
        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"9\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs45AAB\"," +
        "            \"description\": \"Solicitud relaciona pago de préstamos a través de cheques en los cajeros depositarios administrados por transportadora de valores.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Consignación errónea\"" +
        "                }," +
        "                \"specificSubject\": \"Consignación Depositario\"," +
        "                \"tooltip\": \"Antes de radicar, válida :\\n" + //
        "\\n" + //
        "Si fue aplicado erróneamente un depósito a un producto diferente al que el cliente dice haber solicitado; una vez hayas realizado las gestiones propias de la oficina (contacto con los clientes afectados), apóyate con el área jurídica a través de Pregúntale a D.G.\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs48AAB\"," +
        "            \"description\": \"Solicitud relacionada con el plazo otorgado automáticamente o ajustado directamente por el cliente.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Diferidos no conformes\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"12\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ13AAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Reporte Centrales de Riesgo - Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Reporte centrales de riesgos - Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4GAAR\"," +
        "            \"description\": \"Solicitud relacionada  con la entrega al Cliente de los extractos de los créditos o tarjetas.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"No se remite información al cliente\"" +
        "                }," +
        "                \"specificSubject\": \"Cliente no recibe información\"," +
        "                \"tooltip\": \"antes de radicar, valida: \\n" + //
        "1. Valida si tiene activa la Bbva.net o móvil\\n" + //
        "2.. Validar sus datos personales del Cliente (No olvides seguir los protocolos de seguridad para realizar los cambios en base de persona) \\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4QAAR\"," +
        "            \"description\": \"Inconformidad presentada por concepto del impuesto cuatro por mil cobrado.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Gravamen movimientos financieros\"" +
        "                }," +
        "                \"specificSubject\": \"Impuesto cuatro por mil\"," +
        "                \"tooltip\": \"Evita radicar validando:\\n" + //
        "1. Que la cuenta esté marcada con exoneración del cuatro por mil o GMF (gravamen a los movimientos financieros).\\n" + //
        "2. Que la cuenta pensional o ahorros no haya superado el límite establecido.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"3\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4UAAR\"," +
        "            \"description\": \"Inconformidad presentada en el proceso de compra de cartera al Bbva.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad Compra de Cartera\"," +
        "                \"tooltip\": \"Evita radicar validando:\\n" + //
        "1. Aclara al cliente las revisiones solicitadas \\n" + //
        "2. Revisa las tasas cobras con sus respectivas cuotas. \\n" + //
        "3. Revisa las fechas de liquidación.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ1EAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Reporte Centrales de Riesgo - Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Reporte centrales de riesgos - Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ1HAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Negativa Aprobación Crédito Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Negativa Aprobación Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ1KAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Reporte Centrales de Riesgo - Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Reporte centrales de riesgos - Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ1OAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Reporte Centrales de Riesgo - Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Reporte centrales de riesgos - Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4YAAR\"," +
        "            \"description\": \"Inconformidad presentada por inconformidad con el pago mínimo que debe realizar el Cliente.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad con el pago mínimo\"," +
        "                \"tooltip\": \"Evita radicar validando:\\n" + //
        "1. Aclara al cliente las revisiones solicitadas \\n" + //
        "2. Revisa las tasas cobras con sus respectivas cuotas. \\n" + //
        "3. Revisa las fechas de liquidación.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4dAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Inconformidad en compra internacional\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad en compra internacional Internet\"," +
        "                \"tooltip\": \"Para todas las compras Internacionales los primeros 15 días el Cliente debe realizar su petición directamente ante el comercio (de lo contrario la franquicia no recibe realizar el contracargo)\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ1hAAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Reporte Centrales de Riesgo - Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Reporte centrales de riesgos - Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4lAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la Inconformidad en el saldo total de la deuda\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad en el saldo total de la deuda\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs4qAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la Incremento en el valor de los intereses\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Incremento en el valor de los intereses\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ26AAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente teniendo en cuenta la Ley de borrón y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"ley borron y cuenta nueva puntaje buro\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Negativa Aprobación Crédito Ley Borrón y Cuenta Nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Negativa Aprobación Ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ2WAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto relacionadas con la Ley de borron y cuenta nueva\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Procedimientos y honorarios de cobranza\"" +
        "                }," +
        "                \"specificSubject\": \"Procedimienyo y honorarios de cobranza ley borron y cuenta nueva\"," +
        "                \"tooltip\": \"procedimientos y honorarios de cobranza ley borron y cuenta nueva\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs57AAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto tarjeta de crédito referente a Información sujeta a reserva\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Información sujeta a reserva\"" +
        "                }," +
        "                \"specificSubject\": \"Información sujeta a reserva\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs5FAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a SIPLA con relación a la Lavado de activos\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"SARLAFT\"" +
        "                }," +
        "                \"specificSubject\": \"Lavado de activos\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ2rAAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente relacionadas con publicidad engañosa relacionada con la ley de borron y cuenta nueva.\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"Publicidad Engañosa Ley de borrón y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Publicidad Engañosa Ley de borrón y cuenta nueva\"" +
        "                }," +
        "                \"specificSubject\": \"Publicidad Engañosa Ley de borrón y cuenta nueva\"," +
        "                \"tooltip\": \"\\\"• Incumplimiento en lo ofrecido por el banco. \\r\\n" + //
        "• Información insuficiente. \\r\\n" + //
        "• Información errada. \\r\\n" + //
        "• Mala venta oficina. \\r\\n" + //
        "• Mala venta comercializadora. \\r\\n" + //
        "• Mala venta Call Center. \\r\\n" + //
        "• Mala venta canales virtuales. \\r\\n" + //
        "•\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ2uAAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto relacionadas con la Ley de borron y cuenta nueva\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"Incumplimiento acuerdo de pago por Banco Ley borrón y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Procedimientos y honorarios de cobranza\"" +
        "                }," +
        "                \"specificSubject\": \"Incumplimiento acuerdo de pago por Banco Ley borrón y cuenta nueva\"," +
        "                \"tooltip\": \"procedimientos y honorarios de cobranza ley borron y cuenta nueva\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs5MAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto tarjeta de crédito referente a Incumplimiento de condiciones aspectos contractuales\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Incumplimiento de condiciones aspectos contractuales\"" +
        "                }," +
        "                \"specificSubject\": \"Incumplimiento de condiciones aspectos contractuales\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"13\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs5ZAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Consignación errónea con relación a la Pago mal aplicado\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Consignación errónea\"" +
        "                }," +
        "                \"specificSubject\": \"Pago mal aplicado\"," +
        "                \"tooltip\": \"Antes de radicar, válida :\\n" + //
        "\\n" + //
        "Si fue aplicado erróneamente un depósito a un producto diferente al que el cliente dice haber solicitado; una vez hayas realizado las gestiones propias de la oficina (contacto con los clientes afectados), apóyate con el área jurídica a través de Pregúntale a D.G.\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ30AAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto relacionadas con la Ley de borron y cuenta nueva\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"Propuesta de negociación o acuerdo Ley de borrón y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Procedimientos y honorarios de cobranza\"" +
        "                }," +
        "                \"specificSubject\": \"Propuesta de negociación o acuerdo Ley de borrón y cuenta nueva\"," +
        "                \"tooltip\": \"procedimientos y honorarios de cobranza ley borron y cuenta nueva. Propuesta de negociación o acuerdo Ley de borrón y cuenta nueva\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs5nAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Reestructuración de créditos con relación a la Reestructuración deuda\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Reestructuración deuda\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"13\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs5pAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la Reversión y anulación de transacciones\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Revisión y/o liquidación\"" +
        "                }," +
        "                \"specificSubject\": \"Reversión y anulación de transacciones\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"12\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ3LAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente o usuarios referente a la indebida atención relacionado con  la Demora en la Tramitación Ley borrón y cuenta nueva\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"Servicio brindado en casas de cobranza Ley borrón y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Indebida atención\"" +
        "                }," +
        "                \"specificSubject\": \"Servicio brindado en casas de cobranza Ley borrón y cuenta nueva\"," +
        "                \"tooltip\": \"\\\"• Cliente Al día efectúan gestión de cobranza. \\r\\n" + //
        "• La contabilización del acuerdo de pago no es oportuna. \\r\\n" + //
        "• Inadecuada gestión o información suministrada por la casa de cobranza. \\r\\n" + //
        "• Inconformidad con los horarios de cobranza.\\r\\n" + //
        "• inconformidad con gestión de cobranza a terceros.\\r\\n" + //
        "• inconformidad en la gestión de cobranza efectuada servicio\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ3TAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente o usuarios referente a la indebida atención relacionado con  la Demora en la Tramitación Ley borrón y cuenta nueva\"," +
        "            \"requireMovements\": false," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"Demora en la Tramitación Ley borrón y cuenta nueva\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Indebida atención\"" +
        "                }," +
        "                \"specificSubject\": \"Demora  Tramitación Ley borrón y cuenta nueva\"," +
        "                \"tooltip\": \"Demora en la Tramitación Ley borrón y cuenta nueva\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"4\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ98AAF\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente relacionadas con productos digitales\"," +
        "            \"requireMovements\": true," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"Suplantación productos digitales\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Suplantación presunta de persona\"" +
        "                }," +
        "                \"specificSubject\": \"Suplantación productos digitales\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"11\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A22OOAAZ-a0d3p000006B7GYAA0\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"1. ¿Recibió ayuda de terceros cuando se encontraba tranzando en el cajero automático? De ser así, solicitar indicar la ubicación del cajero de nuestra red u otras redes en las que ocurrió lo anterior, así como también la hora aproximada de estos hechos. Validar el número del plástico que el cliente tiene en su poder en ese momento?\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6DAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Su Plantación presunta de persona\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Suplantación presunta de persona\"" +
        "                }," +
        "                \"specificSubject\": \"Suplantación presunta de persona\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo del producto y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6NAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto tarjeta de crédito referente a Inadecuado suministro de información en la vinculación\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Inadecuado suministro de información en la vinculación\"" +
        "                }," +
        "                \"specificSubject\": \"Suministro de información insuficiente o errada\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"11\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BfZ9WAAV\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente relacionadas con hurto por celular\"," +
        "            \"requireMovements\": true," +
        "            \"keywords\": [" +
        "                {" +
        "                    \"value\": \"hurto por celular\"" +
        "                }" +
        "            ]," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Hurto\"" +
        "                }," +
        "                \"specificSubject\": \"Hurto Celular\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"11\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs2IAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Transacciones no reconocidas por páginas diferentes a BBVA Net\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas por páginas diferentes a BBVA Net\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"2\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs2NAAR\"," +
        "            \"description\": \"Solicitud relacionada con el cobro de comisión de retiro en Atm's ó cobro de cuotas de manejo ó comisiones de créditos.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cobro servicios o comisiones\"" +
        "                }," +
        "                \"specificSubject\": \"Cobro servicios o comisiones\"," +
        "                \"tooltip\": \"Antes de radicar, válida :\\n" + //
        "\\n" + //
        "1. Si los beneficios naturales del producto, ya vencieron. \\n" + //
        "2. Él portafolio nómina y que reciba los abonos recurrentes.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"3\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6YAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Transacción cargada doblemente\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Transacción cargada doblemente en Internet\"," +
        "                \"tooltip\": \"Valida los movimientos antes de radicar\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6bAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Cajero automático con relación a la Transacciones no reconocidas - Cambiazo\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - Cambiazo Atm's\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\",";
        String parteB =                 "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6gAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Transacciones no reconocidas - Cambiazo\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - Cambiazo Internet\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"13\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs2WAAR\"," +
        "            \"description\": \"Inconformidad presentada por la utilización de medios de pagos del Banco al realizar compras en los establecimientos.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad Compra en Internet\"," +
        "                \"tooltip\": \"valida los movimiento antes de radicar\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs2eAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Pago debitado y no aplicado\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Pago debitado y no aplicado Internet\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6jAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Cajero automático con relación a la Transacciones no reconocidas - hurto o pérdida\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - hurto o pérdida  Atm's\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6mAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Transacciones no reconocidas - hurto o pérdida\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - hurto o pérdida Internet\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs6pAAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Internet con relación a la Transacciones no reconocidas en BBVA NET\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas en BBVA Net\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"10\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs2tAAB\"," +
        "            \"description\": \"Inconformidad presentada durante el proceso de cobro de honorario de cobranza o incumplimiento de acuerdos de pago por parte del Banco o eventos presentados por venta de cartera.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Procedimientos y honorarios de cobranza\"" +
        "                }," +
        "                \"specificSubject\": \"Gestión de Cobranza\"," +
        "                \"tooltip\": \"Evita radicar si el Cliente presentó mora y explícale la generación de honorarios por cobro prejurídico.\\n" + //
        "Recuerda que en leasing habitacional y crédito hipotecario, se generan honorarios cuando se ha presentado cobro jurídico.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"10\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs2xAAB\"," +
        "            \"description\": \"Solicitud presentada con el proceso de activación de las tarjetas\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Bloqueo de productos\"" +
        "                }," +
        "                \"specificSubject\": \"Activación de tarjeta\"," +
        "                \"tooltip\": \"No radiques si se evidencia una “retención manual oficina \\\" en cuenta de ahorros o corriente, contacta al Cliente con su oficina gestora para que le suministren los motivos del bloqueo.\\n" + //
        "\\n" + //
        "Si el Cliente solicita información de un embargo, válida en el sistema el ente que lo ordenó e invitalo a dirigirse a dicha entidad - No se debe radicar la Petición.\\n" + //
        "\\n" + //
        "Si se trata de entrega de oficios de embargo o desembargo de saldos, se deben gestionar por el circuito establecido a través del buzón embargos.colombia@bbva.com\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs73AAB\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Procedimientos y honorarios de cobranza con relación a la Venta de Cartera\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Procedimientos y honorarios de cobranza\"" +
        "                }," +
        "                \"specificSubject\": \"Venta de Cartera\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs7AAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Vinculación presuntamente fraudulenta.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Vinculación presuntamente fraudulenta\"" +
        "                }," +
        "                \"specificSubject\": \"Vinculación presuntamente fraudulenta\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3AAAR\"," +
        "            \"description\": \"Inconformidad presentada por la entrega de billetes falsos a través del cajero automático del Bbva.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Billetes falsos en Atm's\"," +
        "                \"tooltip\": \"No solicites la radicación si la reclamación es por billete falso entregado por ventanilla, recuérdale al cliente que antes de retirarse de la ventanilla debe validar calidad y cantidad de lo entregado.\\n" + //
        "\\n" + //
        "\\n" + //
        "Si el retiro fue en ATM, anexa copia del billete y no olvides enviar el billete a Caja Central.\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3BAAR\"," +
        "            \"description\": \"Inconformidad presentada durante proceso de bloqueo tarjeta por cambio, pérdida etc.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Bloqueo de productos\"" +
        "                }," +
        "                \"specificSubject\": \"Bloqueo de tarjeta\"," +
        "                \"tooltip\": \"No radiques si se evidencia una “retención manual oficina \\\" en cuenta de ahorros o corriente, contacta al Cliente con su oficina gestora para que le suministren los motivos del bloqueo.\\n" + //
        "\\n" + //
        "Si el Cliente solicita información de un embargo, válida en el sistema el ente que lo ordenó e invitalo a dirigirse a dicha entidad - No se debe radicar la Petición.\\n" + //
        "\\n" + //
        "Si se trata de entrega de oficios de embargo o desembargo de saldos, se deben gestionar por el circuito establecido a través del buzón embargos.colombia@bbva.com\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"11\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3IAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto tarjeta de crédito referente a Actualización, Autorización para consultas, Calificación de Cartera, Prescripción de la Obligación.\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Reporte centrales de riesgos\"" +
        "                }," +
        "                \"specificSubject\": \"Reporte centrales de riesgos\"," +
        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" + //
        "\\n" + //
        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" + //
        "\\n" + //
        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" + //
        "\\n" + //
        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"11\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0e3p00000A2VERAA3-a0d3p000006BBi9AAG\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"Señor (a) Cliente, autoriza Usted a BBVA Colombia o a quien represente sus derechos, para que consulte, actualice y divulgue en las centrales de información del sector financiero y cualquier otra entidad que maneje bases de datos, la información correspondiente a las obligaciones contraídas o que llegue a contraer, fruto de operaciones financieras o comerciales celebradas con el Banco, sus filiales, subsidiarias y/o subordinadas.\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzGxAAJ\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de ahorro referente a Negación en la apertura o solicitud del producto\"," +
        "            \"requireMovements\": false," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Negación en la apertura o solicitud del producto\"" +
        "                }," +
        "                \"specificSubject\": \"Negación del producto\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"12\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3MAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a BBVA Móvil con relación a la Transacciones no reconocidas\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"BBVA Móvil\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas Móvil\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000Brs3PAAR\"," +
        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Cajero automático con relación a la Transacciones no reconocidas\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas Atm's\"," +
        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzHlAAJ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Datáfono\"" +
        "                }," +
        "                \"specificSubject\": \"Inconformidad Compra en Datáfono - Toma de datos\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzQxAAJ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Debitó y no entregó BBVA - Toma de datos\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"15\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzR7AAJ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Debitó y no entregó otras redes - Toma de datos\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"13\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzRMAAZ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Datáfono\"" +
        "                }," +
        "                \"specificSubject\": \"Transacción cargada doblemente - Toma de datos Datáfono\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"13\"" +
        "                }" +
        "            }" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzRWAAZ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Cajero automático\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - Toma de datos Cajero automático\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"10\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzRbAAJ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"Internet\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - Toma de datos Internet\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"14\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }," +
        "        {" +
        "            \"id\": \"a0h3p00000BrzRgAAJ\"," +
        "            \"description\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "            \"requireMovements\": true," +
        "            \"issue\": {" +
        "                \"issueType\": {" +
        "                    \"id\": \"BBVA Móvil\"" +
        "                }," +
        "                \"specificSubject\": \"Transacciones no reconocidas - Toma de datos BBVA Movil\"," +
        "                \"tooltip\": \"Tipología utilizada exclusivamente los agentes del call center.\"," +
        "                \"ranking\": {" +
        "                    \"value\": \"12\"" +
        "                }" +
        "            }," +
        "            \"forms\": [" +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"1. Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
        "3. Formato Radicación PQR Suplantación Productos Online\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWmIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"2. -¿ Contrató usted el producto objeto de la transacción no reconocida ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWrIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"3. ¿Es usuario habitual de bancas digitales (BBVA Net)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCiUIAU\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"4. ¿Es usuario habitual de bancas digitales (BBVA Móvil)?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xDdvIAE\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"5. ¿En algún momento usted presentó alguna falla o novedad en su línea celular?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFWIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"6. ¿En el momento en que se produjo el evento, usted estaba intentando realizar alguna operación o consulta ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFoIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"7. ¿Alguna persona de su entorno tuvo acceso a su celular, claves o tarjetas?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFpIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"8. ¿Fue víctima de sustancias psicoactivas? \\r\\n" + //
        "Si marco SI: No olvide adjuntar el examen toxicologico\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFqIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"9. ¿Fue víctima de hurto de su celular ?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFUIA2\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"10. ¿Extravió o le robaron su billetera - documentos y/o tarjetas - o fue víctima de cambiazo de tarjeta debito o crédito?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFjIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"11. ¿Fue forzado a realizar la operación fraudulenta usando la violencia?\\r\\n" + //
        "Si marco SI: No olvide adjuntar denuncia ante fiscalia\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFVIA2\"," +
        "                    \"formType\": \"03\"," +
        "                    \"question\": \"12. Recibió usted una llamada telefonica, mail o SMS donde le solicitaban informacion de sus productos, clave de canales digitales y/o códigos?\\r\\n" + //
        "( Si marco SI - indique el canal de contacto entre: SMS - llamada telefonica- email )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFeIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"13. El producto afectado fue Tarjetas? \\r\\n" + //
        "Si marco SI: indique el canal entre: a. Operaciones en Comercios b.Retiro en ATMS\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFZIA2\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"14. El producto afectado fue Cuentas ? \\r\\n" + //
        "(Si marco SI: indique el o los canales entre:\\r\\n" + //
        "-Transferencia interbancaria -Traspaso cuentas propias o de otros clientes BBVA -PSE -Retiros mi billetera ( sin tarjetas) Avances - Trasnfiya \\r\\n" + //
        "- Otros pagos )\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFaIAM\"," +
        "                    \"formType\": \"02\"," +
        "                    \"question\": \"15. El producto afectado fue Préstamos?\"" +
        "                }," +
        "                {" +
        "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCFyIAM\"," +
        "                    \"formType\": \"01\"," +
        "                    \"question\": \"16. Realice una breve descripción del caso\\r\\n" + //
        "(Incluyendo datos de valor como Fecha y Hora de los sucesos y si se comunico con el BBVA por call center u oficina a notificar lo sucedido)\"" +
        "                }" +
        "            ]" +
        "        }" +
        "    ]" +
        "}";
        JSONObject jsonObject = new JSONObject(parteA + parteB);
        return jsonObject;
    }

    public static JSONObject getCountriesAso() {

        JSONObject jsonObject = new JSONObject("{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"002\"," +
                "            \"alternateCode\": \"ABW\"," +
                "            \"name\": \"ARUBA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"003\"," +
                "            \"alternateCode\": \"AFG\"," +
                "            \"name\": \"AFGANISTAN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"005\"," +
                "            \"alternateCode\": \"AGO\"," +
                "            \"name\": \"ANGOLA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"006\"," +
                "            \"alternateCode\": \"AIA\"," +
                "            \"name\": \"ANGUILA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"007\"," +
                "            \"alternateCode\": \"ALA\"," +
                "            \"name\": \"ÅLAND\"" +
                "        }," +
                "        {" +
                "            \"id\": \"008\"," +
                "            \"alternateCode\": \"ALB\"," +
                "            \"name\": \"ALBANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"010\"," +
                "            \"alternateCode\": \"AND\"," +
                "            \"name\": \"ANDORRA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"015\"," +
                "            \"alternateCode\": \"ARE\"," +
                "            \"name\": \"EMIRATOS ÁRABES UNIDOS (LOS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"016\"," +
                "            \"alternateCode\": \"ARG\"," +
                "            \"name\": \"ARGENTINA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"017\"," +
                "            \"alternateCode\": \"ARM\"," +
                "            \"name\": \"ARMENIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"022\"," +
                "            \"alternateCode\": \"ASM\"," +
                "            \"name\": \"SAMOA AMERICANA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"025\"," +
                "            \"alternateCode\": \"ATF\"," +
                "            \"name\": \"TIERRAS AUSTRALES Y ANTáRTICAS FRANCESAS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"026\"," +
                "            \"alternateCode\": \"ATG\"," +
                "            \"name\": \"ANTIGUA Y BARBUDA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"028\"," +
                "            \"alternateCode\": \"AUS\"," +
                "            \"name\": \"AUSTRALIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"029\"," +
                "            \"alternateCode\": \"AUT\"," +
                "            \"name\": \"AUSTRIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"030\"," +
                "            \"alternateCode\": \"AZE\"," +
                "            \"name\": \"AZERBAIYAN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"035\"," +
                "            \"alternateCode\": \"BDI\"," +
                "            \"name\": \"BURUNDI\"" +
                "        }," +
                "        {" +
                "            \"id\": \"036\"," +
                "            \"alternateCode\": \"BEL\"," +
                "            \"name\": \"BELGICA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"040\"," +
                "            \"alternateCode\": \"BES\"," +
                "            \"name\": \"BONAIRE, SAN EUSTAQUIO Y SABA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"042\"," +
                "            \"alternateCode\": \"BFA\"," +
                "            \"name\": \"BURKINA / FASO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"043\"," +
                "            \"alternateCode\": \"BGD\"," +
                "            \"name\": \"BANGLADéS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"044\"," +
                "            \"alternateCode\": \"BGR\"," +
                "            \"name\": \"BULGARIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"047\"," +
                "            \"alternateCode\": \"BHR\"," +
                "            \"name\": \"BARéIN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"048\"," +
                "            \"alternateCode\": \"BHS\"," +
                "            \"name\": \"BAHAMAS (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"050\"," +
                "            \"alternateCode\": \"BIH\"," +
                "            \"name\": \"BOSNIA Y HERZEGOVINA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"052\"," +
                "            \"alternateCode\": \"BLM\"," +
                "            \"name\": \"SAN BARTOLOMé\"" +
                "        }," +
                "        {" +
                "            \"id\": \"053\"," +
                "            \"alternateCode\": \"BLR\"," +
                "            \"name\": \"BIELORRUSIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"054\"," +
                "            \"alternateCode\": \"BLZ\"," +
                "            \"name\": \"BELICE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"055\"," +
                "            \"alternateCode\": \"BMU\"," +
                "            \"name\": \"BERMUDAS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"056\"," +
                "            \"alternateCode\": \"BOL\"," +
                "            \"name\": \"BOLIVIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"058\"," +
                "            \"alternateCode\": \"BRA\"," +
                "            \"name\": \"BRASIL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"059\"," +
                "            \"alternateCode\": \"BRB\"," +
                "            \"name\": \"BARBADOS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"060\"," +
                "            \"alternateCode\": \"BRN\"," +
                "            \"name\": \"BRUNéI DARUSSALAM\"" +
                "        }," +
                "        {" +
                "            \"id\": \"062\"," +
                "            \"alternateCode\": \"BTN\"," +
                "            \"name\": \"BUTáN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"065\"," +
                "            \"alternateCode\": \"BVT\"," +
                "            \"name\": \"ISLA BOUVET\"" +
                "        }," +
                "        {" +
                "            \"id\": \"066\"," +
                "            \"alternateCode\": \"BWA\"," +
                "            \"name\": \"BOTSUANA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"069\"," +
                "            \"alternateCode\": \"CAF\"," +
                "            \"name\": \"REPúBLICA CENTROAFRICANA (LA)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"071\"," +
                "            \"alternateCode\": \"CAN\"," +
                "            \"name\": \"CANADA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"075\"," +
                "            \"alternateCode\": \"CHE\"," +
                "            \"name\": \"SUIZA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"077\"," +
                "            \"alternateCode\": \"CHL\"," +
                "            \"name\": \"CHILE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"078\"," +
                "            \"alternateCode\": \"CHN\"," +
                "            \"name\": \"CHINA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"080\"," +
                "            \"alternateCode\": \"CIV\"," +
                "            \"name\": \"CôTE D'IVOIRE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"082\"," +
                "            \"alternateCode\": \"CMR\"," +
                "            \"name\": \"CAMERúN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"085\"," +
                "            \"alternateCode\": \"COD\"," +
                "            \"name\": \"REPúBLICA DEMOCRáTICA DEL CONGO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"086\"," +
                "            \"alternateCode\": \"COG\"," +
                "            \"name\": \"CONGO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"087\"," +
                "            \"alternateCode\": \"COK\"," +
                "            \"name\": \"ISLAS COOK (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"088\"," +
                "            \"alternateCode\": \"COL\"," +
                "            \"name\": \"COLOMBIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"089\"," +
                "            \"alternateCode\": \"COM\"," +
                "            \"name\": \"COMORES\"" +
                "        }," +
                "        {" +
                "            \"id\": \"092\"," +
                "            \"alternateCode\": \"CPV\"," +
                "            \"name\": \"CABO VERDE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"093\"," +
                "            \"alternateCode\": \"CRI\"," +
                "            \"name\": \"COSTA RICA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"098\"," +
                "            \"alternateCode\": \"CUB\"," +
                "            \"name\": \"CUBA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"099\"," +
                "            \"alternateCode\": \"CUW\"," +
                "            \"name\": \"CURAZAO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"102\"," +
                "            \"alternateCode\": \"CYM\"," +
                "            \"name\": \"ISLAS CAIMáN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"103\"," +
                "            \"alternateCode\": \"CYP\"," +
                "            \"name\": \"CHIPRE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"104\"," +
                "            \"alternateCode\": \"CZE\"," +
                "            \"name\": \"REPúBLICA CHECA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"106\"," +
                "            \"alternateCode\": \"DEU\"," +
                "            \"name\": \"ALEMANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"110\"," +
                "            \"alternateCode\": \"DJI\"," +
                "            \"name\": \"DJIBOUTI\"" +
                "        }," +
                "        {" +
                "            \"id\": \"111\"," +
                "            \"alternateCode\": \"DMA\"," +
                "            \"name\": \"DOMINICA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"112\"," +
                "            \"alternateCode\": \"DNK\"," +
                "            \"name\": \"DINAMARCA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"113\"," +
                "            \"alternateCode\": \"DOM\"," +
                "            \"name\": \"REPUBLICA DOMINICANA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"114\"," +
                "            \"alternateCode\": \"DZA\"," +
                "            \"name\": \"ARGELIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"116\"," +
                "            \"alternateCode\": \"ECU\"," +
                "            \"name\": \"ECUADOR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"118\"," +
                "            \"alternateCode\": \"EGY\"," +
                "            \"name\": \"EGIPTO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"120\"," +
                "            \"alternateCode\": \"ERI\"," +
                "            \"name\": \"ERITREA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"122\"," +
                "            \"alternateCode\": \"ESH\"," +
                "            \"name\": \"REPúBLICA ÁRABE SAHARAUI DEMOCRáTICA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"124\"," +
                "            \"alternateCode\": \"ESP\"," +
                "            \"name\": \"ESPANA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"125\"," +
                "            \"alternateCode\": \"EST\"," +
                "            \"name\": \"ESTONIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"127\"," +
                "            \"alternateCode\": \"ETH\"," +
                "            \"name\": \"ETIOPíA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"133\"," +
                "            \"alternateCode\": \"FIN\"," +
                "            \"name\": \"FINLANDIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"134\"," +
                "            \"alternateCode\": \"FJI\"," +
                "            \"name\": \"FIYI\"" +
                "        }," +
                "        {" +
                "            \"id\": \"135\"," +
                "            \"alternateCode\": \"FLK\"," +
                "            \"name\": \"ISLAS MALVINAS ¢FALKLAND! (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"136\"," +
                "            \"alternateCode\": \"FRA\"," +
                "            \"name\": \"FRANCIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"137\"," +
                "            \"alternateCode\": \"FRO\"," +
                "            \"name\": \"ISLAS FEROE (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"138\"," +
                "            \"alternateCode\": \"FSM\"," +
                "            \"name\": \"MICRONESIA (LOS ESTADOS FEDERADOS DE)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"140\"," +
                "            \"alternateCode\": \"GAB\"," +
                "            \"name\": \"GABON\"" +
                "        }," +
                "        {" +
                "            \"id\": \"144\"," +
                "            \"alternateCode\": \"GBR\"," +
                "            \"name\": \"REINO UNIDO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"147\"," +
                "            \"alternateCode\": \"GEO\"," +
                "            \"name\": \"GEORGIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"149\"," +
                "            \"alternateCode\": \"GGY\"," +
                "            \"name\": \"GUERNSEY\"" +
                "        }," +
                "        {" +
                "            \"id\": \"150\"," +
                "            \"alternateCode\": \"GHA\"," +
                "            \"name\": \"GHANA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"151\"," +
                "            \"alternateCode\": \"GIB\"," +
                "            \"name\": \"GIBRALTAR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"152\"," +
                "            \"alternateCode\": \"GIN\"," +
                "            \"name\": \"GUINEA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"153\"," +
                "            \"alternateCode\": \"GLP\"," +
                "            \"name\": \"GUADALUPE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"154\"," +
                "            \"alternateCode\": \"GMB\"," +
                "            \"name\": \"GAMBIA (LA)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"155\"," +
                "            \"alternateCode\": \"GNB\"," +
                "            \"name\": \"GUINEA-BISáU\"" +
                "        }," +
                "        {" +
                "            \"id\": \"156\"," +
                "            \"alternateCode\": \"GNQ\"," +
                "            \"name\": \"GUINEA ECUATORIAL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"158\"," +
                "            \"alternateCode\": \"GRC\"," +
                "            \"name\": \"GRECIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"159\"," +
                "            \"alternateCode\": \"GRD\"," +
                "            \"name\": \"GRANADA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"161\"," +
                "            \"alternateCode\": \"GRL\"," +
                "            \"name\": \"GROENLANDIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"163\"," +
                "            \"alternateCode\": \"GTM\"," +
                "            \"name\": \"GUATEMALA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"165\"," +
                "            \"alternateCode\": \"GUF\"," +
                "            \"name\": \"GUAYANA FRANCESA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"167\"," +
                "            \"alternateCode\": \"GUM\"," +
                "            \"name\": \"GUAM\"" +
                "        }," +
                "        {" +
                "            \"id\": \"169\"," +
                "            \"alternateCode\": \"GUY\"," +
                "            \"name\": \"GUYANA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"171\"," +
                "            \"alternateCode\": \"HKG\"," +
                "            \"name\": \"HONG KONG\"" +
                "        }," +
                "        {" +
                "            \"id\": \"173\"," +
                "            \"alternateCode\": \"HMD\"," +
                "            \"name\": \"ISLAS HEARD Y MCDONALD\"" +
                "        }," +
                "        {" +
                "            \"id\": \"174\"," +
                "            \"alternateCode\": \"HND\"," +
                "            \"name\": \"HONDURAS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"177\"," +
                "            \"alternateCode\": \"HRV\"," +
                "            \"name\": \"CROACIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"178\"," +
                "            \"alternateCode\": \"HTI\"," +
                "            \"name\": \"HAITí\"" +
                "        }," +
                "        {" +
                "            \"id\": \"179\"," +
                "            \"alternateCode\": \"HUN\"," +
                "            \"name\": \"HUNGRIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"185\"," +
                "            \"alternateCode\": \"IDN\"," +
                "            \"name\": \"INDONESIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"190\"," +
                "            \"alternateCode\": \"IMN\"," +
                "            \"name\": \"ISLAS MARIANAS NORTE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"194\"," +
                "            \"alternateCode\": \"IND\"," +
                "            \"name\": \"INDIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"198\"," +
                "            \"alternateCode\": \"IOT\"," +
                "            \"name\": \"TERRITORIO BRITáNICO DEL OCéANO ÍNDICO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"203\"," +
                "            \"alternateCode\": \"IRL\"," +
                "            \"name\": \"IRLANDA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"204\"," +
                "            \"alternateCode\": \"IRN\"," +
                "            \"name\": \"IRáN (LA REPúBLICA ISLáMICA DE)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"205\"," +
                "            \"alternateCode\": \"IRQ\"," +
                "            \"name\": \"IRAK\"" +
                "        }," +
                "        {" +
                "            \"id\": \"207\"," +
                "            \"alternateCode\": \"ISL\"," +
                "            \"name\": \"ISLANDIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"208\"," +
                "            \"alternateCode\": \"ISR\"," +
                "            \"name\": \"ISRAEL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"209\"," +
                "            \"alternateCode\": \"ITA\"," +
                "            \"name\": \"ITALIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"214\"," +
                "            \"alternateCode\": \"JAM\"," +
                "            \"name\": \"JAMAICA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"216\"," +
                "            \"alternateCode\": \"JEY\"," +
                "            \"name\": \"JERSEY\"" +
                "        }," +
                "        {" +
                "            \"id\": \"217\"," +
                "            \"alternateCode\": \"JOR\"," +
                "            \"name\": \"JORDANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"218\"," +
                "            \"alternateCode\": \"JPN\"," +
                "            \"name\": \"JAPóN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"221\"," +
                "            \"alternateCode\": \"KAZ\"," +
                "            \"name\": \"KAZAJSTAN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"222\"," +
                "            \"alternateCode\": \"KEN\"," +
                "            \"name\": \"KENYA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"223\"," +
                "            \"alternateCode\": \"KGZ\"," +
                "            \"name\": \"KIRGUISTáN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"224\"," +
                "            \"alternateCode\": \"KHM\"," +
                "            \"name\": \"CAMBOYA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"226\"," +
                "            \"alternateCode\": \"KIR\"," +
                "            \"name\": \"KIRIBATI\"" +
                "        }," +
                "        {" +
                "            \"id\": \"227\"," +
                "            \"alternateCode\": \"KNA\"," +
                "            \"name\": \"SAN CRISTóBAL Y NIEVES\"" +
                "        }," +
                "        {" +
                "            \"id\": \"228\"," +
                "            \"alternateCode\": \"KOR\"," +
                "            \"name\": \"COREA (LA REPúBLICA DE)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"230\"," +
                "            \"alternateCode\": \"KWT\"," +
                "            \"name\": \"KUWAIT\"" +
                "        }," +
                "        {" +
                "            \"id\": \"232\"," +
                "            \"alternateCode\": \"LAO\"," +
                "            \"name\": \"LAOS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"233\"," +
                "            \"alternateCode\": \"LBN\"," +
                "            \"name\": \"LíBANO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"234\"," +
                "            \"alternateCode\": \"LBR\"," +
                "            \"name\": \"LIBERIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"235\"," +
                "            \"alternateCode\": \"LBY\"," +
                "            \"name\": \"LIBIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"236\"," +
                "            \"alternateCode\": \"LCA\"," +
                "            \"name\": \"SANTA LUCíA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"240\"," +
                "            \"alternateCode\": \"LIE\"," +
                "            \"name\": \"LIETCHTENSTEIN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"244\"," +
                "            \"alternateCode\": \"LKA\"," +
                "            \"name\": \"SRI LANKA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"245\"," +
                "            \"alternateCode\": \"LSO\"," +
                "            \"name\": \"LESOTO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"246\"," +
                "            \"alternateCode\": \"LTU\"," +
                "            \"name\": \"LITUANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"247\"," +
                "            \"alternateCode\": \"LUX\"," +
                "            \"name\": \"LUXEMBURGO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"248\"," +
                "            \"alternateCode\": \"LVA\"," +
                "            \"name\": \"LETONIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"249\"," +
                "            \"alternateCode\": \"MAC\"," +
                "            \"name\": \"MACAO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"251\"," +
                "            \"alternateCode\": \"MAF\"," +
                "            \"name\": \"SAN MARTíN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"255\"," +
                "            \"alternateCode\": \"MAR\"," +
                "            \"name\": \"MARRUECOS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"260\"," +
                "            \"alternateCode\": \"MCO\"," +
                "            \"name\": \"MóNACO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"261\"," +
                "            \"alternateCode\": \"MDA\"," +
                "            \"name\": \"MOLDAVIA (LA REPúBLICA DE)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"262\"," +
                "            \"alternateCode\": \"MDG\"," +
                "            \"name\": \"MADAGASCAR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"263\"," +
                "            \"alternateCode\": \"MDV\"," +
                "            \"name\": \"MALDIVAS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"264\"," +
                "            \"alternateCode\": \"MEX\"," +
                "            \"name\": \"MEXICO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"265\"," +
                "            \"alternateCode\": \"MHL\"," +
                "            \"name\": \"ISLAS MARSHALL (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"269\"," +
                "            \"alternateCode\": \"MKD\"," +
                "            \"name\": \"MACEDONIA (LA ANTIGUA REPúBLICA YUGOSLA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"270\"," +
                "            \"alternateCode\": \"MLI\"," +
                "            \"name\": \"MALí\"" +
                "        }," +
                "        {" +
                "            \"id\": \"271\"," +
                "            \"alternateCode\": \"MLT\"," +
                "            \"name\": \"MALTA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"272\"," +
                "            \"alternateCode\": \"MMR\"," +
                "            \"name\": \"MYANMAR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"273\"," +
                "            \"alternateCode\": \"MNE\"," +
                "            \"name\": \"MONTENEGRO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"274\"," +
                "            \"alternateCode\": \"MNG\"," +
                "            \"name\": \"MONGOLIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"275\"," +
                "            \"alternateCode\": \"MNP\"," +
                "            \"name\": \"ISLAS MARIANAS DEL NORTE (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"281\"," +
                "            \"alternateCode\": \"MOZ\"," +
                "            \"name\": \"MOZAMBIQUE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"282\"," +
                "            \"alternateCode\": \"MRT\"," +
                "            \"name\": \"MAURITANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"283\"," +
                "            \"alternateCode\": \"MSR\"," +
                "            \"name\": \"MONTSERRAT\"" +
                "        }," +
                "        {" +
                "            \"id\": \"284\"," +
                "            \"alternateCode\": \"MTQ\"," +
                "            \"name\": \"MARTINICA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"285\"," +
                "            \"alternateCode\": \"MUS\"," +
                "            \"name\": \"MAURICIO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"286\"," +
                "            \"alternateCode\": \"MWI\"," +
                "            \"name\": \"MALAUI\"" +
                "        }," +
                "        {" +
                "            \"id\": \"288\"," +
                "            \"alternateCode\": \"MYS\"," +
                "            \"name\": \"MALASIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"289\"," +
                "            \"alternateCode\": \"MYT\"," +
                "            \"name\": \"MAYOTTE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"290\"," +
                "            \"alternateCode\": \"NAM\"," +
                "            \"name\": \"NAMIBIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"293\"," +
                "            \"alternateCode\": \"NCL\"," +
                "            \"name\": \"NUEVA CALEDONIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"295\"," +
                "            \"alternateCode\": \"NER\"," +
                "            \"name\": \"NíGER (EL)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"297\"," +
                "            \"alternateCode\": \"NGA\"," +
                "            \"name\": \"NIGERIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"299\"," +
                "            \"alternateCode\": \"NIC\"," +
                "            \"name\": \"NICARAGUA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"303\"," +
                "            \"alternateCode\": \"NLD\"," +
                "            \"name\": \"PAíSES BAJOS (LOS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"304\"," +
                "            \"alternateCode\": \"NOR\"," +
                "            \"name\": \"NORUEGA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"305\"," +
                "            \"alternateCode\": \"NPL\"," +
                "            \"name\": \"NEPAL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"306\"," +
                "            \"alternateCode\": \"NRU\"," +
                "            \"name\": \"NAURU\"" +
                "        }," +
                "        {" +
                "            \"id\": \"309\"," +
                "            \"alternateCode\": \"NZL\"," +
                "            \"name\": \"NUEVA ZELANDA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"314\"," +
                "            \"alternateCode\": \"OMN\"," +
                "            \"name\": \"OMáN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"317\"," +
                "            \"alternateCode\": \"PAK\"," +
                "            \"name\": \"PAKISTAN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"318\"," +
                "            \"alternateCode\": \"PAN\"," +
                "            \"name\": \"PANAMA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"324\"," +
                "            \"alternateCode\": \"PER\"," +
                "            \"name\": \"PERU\"" +
                "        }," +
                "        {" +
                "            \"id\": \"327\"," +
                "            \"alternateCode\": \"PHL\"," +
                "            \"name\": \"FILIPINAS (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"328\"," +
                "            \"alternateCode\": \"PLW\"," +
                "            \"name\": \"PALAOS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"329\"," +
                "            \"alternateCode\": \"PNG\"," +
                "            \"name\": \"PAPUA-NUEVA GUINEA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"330\"," +
                "            \"alternateCode\": \"POL\"," +
                "            \"name\": \"POLONIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"332\"," +
                "            \"alternateCode\": \"PRI\"," +
                "            \"name\": \"PUERTO RICO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"333\"," +
                "            \"alternateCode\": \"PRK\"," +
                "            \"name\": \"COREA (LA REPúBLICA DEMOCRáTICA POPULAR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"334\"," +
                "            \"alternateCode\": \"PRT\"," +
                "            \"name\": \"PORTUGAL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"335\"," +
                "            \"alternateCode\": \"PRY\"," +
                "            \"name\": \"PARAGUAY\"" +
                "        }," +
                "        {" +
                "            \"id\": \"336\"," +
                "            \"alternateCode\": \"PSE\"," +
                "            \"name\": \"PALESTINA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"340\"," +
                "            \"alternateCode\": \"PYF\"," +
                "            \"name\": \"POLINESIA FRANCESA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"346\"," +
                "            \"alternateCode\": \"REU\"," +
                "            \"name\": \"REUNION\"" +
                "        }," +
                "        {" +
                "            \"id\": \"349\"," +
                "            \"alternateCode\": \"ROU\"," +
                "            \"name\": \"RUMANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"353\"," +
                "            \"alternateCode\": \"RUS\"," +
                "            \"name\": \"RUSIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"354\"," +
                "            \"alternateCode\": \"RWA\"," +
                "            \"name\": \"RUANDA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"357\"," +
                "            \"alternateCode\": \"SAU\"," +
                "            \"name\": \"ARABIA SAUDITA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"361\"," +
                "            \"alternateCode\": \"SDN\"," +
                "            \"name\": \"SUDáN (EL)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"362\"," +
                "            \"alternateCode\": \"SEN\"," +
                "            \"name\": \"SENEGAL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"363\"," +
                "            \"alternateCode\": \"SGP\"," +
                "            \"name\": \"SINGAPUR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"364\"," +
                "            \"alternateCode\": \"SGS\"," +
                "            \"name\": \"ISLAS GEORGIAS DEL SUR Y SANDWICH DEL\"" +
                "        }," +
                "        {" +
                "            \"id\": \"366\"," +
                "            \"alternateCode\": \"SHN\"," +
                "            \"name\": \"SANTA ELENA, ASCENSIóN Y TRISTáN DE AC\"" +
                "        }," +
                "        {" +
                "            \"id\": \"369\"," +
                "            \"alternateCode\": \"SJM\"," +
                "            \"name\": \"SVALBARD Y JAN MAYEN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"372\"," +
                "            \"alternateCode\": \"SLB\"," +
                "            \"name\": \"ISLAS SALOMóN (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"373\"," +
                "            \"alternateCode\": \"SLE\"," +
                "            \"name\": \"SIERRA LEONA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"375\"," +
                "            \"alternateCode\": \"SLV\"," +
                "            \"name\": \"EL SALVADOR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"377\"," +
                "            \"alternateCode\": \"SMR\"," +
                "            \"name\": \"SAN MARINO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"379\"," +
                "            \"alternateCode\": \"SOM\"," +
                "            \"name\": \"SOMALIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"380\"," +
                "            \"alternateCode\": \"SPM\"," +
                "            \"name\": \"SAN PEDRO Y MIQUELON\"" +
                "        }," +
                "        {" +
                "            \"id\": \"381\"," +
                "            \"alternateCode\": \"SRB\"," +
                "            \"name\": \"SERBIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"382\"," +
                "            \"alternateCode\": \"SSD\"," +
                "            \"name\": \"SUDáN DEL SUR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"383\"," +
                "            \"alternateCode\": \"STP\"," +
                "            \"name\": \"SANTO TOME Y PR\"" +
                "        }," +
                "        {" +
                "            \"id\": \"388\"," +
                "            \"alternateCode\": \"SUR\"," +
                "            \"name\": \"SURINAM\"" +
                "        }," +
                "        {" +
                "            \"id\": \"390\"," +
                "            \"alternateCode\": \"SVK\"," +
                "            \"name\": \"ESLOVAQUIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"391\"," +
                "            \"alternateCode\": \"SVN\"," +
                "            \"name\": \"ESLOVENIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"393\"," +
                "            \"alternateCode\": \"SWE\"," +
                "            \"name\": \"SUECIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"394\"," +
                "            \"alternateCode\": \"SWZ\"," +
                "            \"name\": \"SUAZILANDIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"395\"," +
                "            \"alternateCode\": \"SXM\"," +
                "            \"name\": \"SINT MAARTEN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"396\"," +
                "            \"alternateCode\": \"SYC\"," +
                "            \"name\": \"SEYCHELLES\"" +
                "        }," +
                "        {" +
                "            \"id\": \"397\"," +
                "            \"alternateCode\": \"SYR\"," +
                "            \"name\": \"SIRIA, (LA) REPúBLICA ÁRABE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"405\"," +
                "            \"alternateCode\": \"TCA\"," +
                "            \"name\": \"ISLAS TURCAS Y CAICOS (LAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"406\"," +
                "            \"alternateCode\": \"TCD\"," +
                "            \"name\": \"CHAD\"" +
                "        }," +
                "        {" +
                "            \"id\": \"409\"," +
                "            \"alternateCode\": \"TGO\"," +
                "            \"name\": \"TOGO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"410\"," +
                "            \"alternateCode\": \"THA\"," +
                "            \"name\": \"THAILANDIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"412\"," +
                "            \"alternateCode\": \"TJK\"," +
                "            \"name\": \"TAYIKISTáN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"414\"," +
                "            \"alternateCode\": \"TKM\"," +
                "            \"name\": \"TURKMENISTáN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"415\"," +
                "            \"alternateCode\": \"TLS\"," +
                "            \"name\": \"TIMOR-LESTE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"419\"," +
                "            \"alternateCode\": \"TON\"," +
                "            \"name\": \"TONGA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"420\"," +
                "            \"alternateCode\": \"TTO\"," +
                "            \"name\": \"TRINIDAD Y TOBAGO\"" +
                "        }," +
                "        {" +
                "            \"id\": \"422\"," +
                "            \"alternateCode\": \"TUN\"," +
                "            \"name\": \"TUNEZ\"" +
                "        }," +
                "        {" +
                "            \"id\": \"423\"," +
                "            \"alternateCode\": \"TUR\"," +
                "            \"name\": \"TURQUIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"424\"," +
                "            \"alternateCode\": \"TUV\"," +
                "            \"name\": \"TUVALU\"" +
                "        }," +
                "        {" +
                "            \"id\": \"425\"," +
                "            \"alternateCode\": \"TWN\"," +
                "            \"name\": \"TAIWáN (PROVINCIA DE CHINA)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"426\"," +
                "            \"alternateCode\": \"TZA\"," +
                "            \"name\": \"TANZANIA, REPúBLICA UNIDA DE\"" +
                "        }," +
                "        {" +
                "            \"id\": \"428\"," +
                "            \"alternateCode\": \"UGA\"," +
                "            \"name\": \"UGANDA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"429\"," +
                "            \"alternateCode\": \"UKR\"," +
                "            \"name\": \"UCRANIA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"430\"," +
                "            \"alternateCode\": \"UMI\"," +
                "            \"name\": \"ISLAS ULTRAMARINAS DE ESTADOS UNIDOS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"432\"," +
                "            \"alternateCode\": \"URY\"," +
                "            \"name\": \"URUGUAY\"" +
                "        }," +
                "        {" +
                "            \"id\": \"433\"," +
                "            \"alternateCode\": \"USA\"," +
                "            \"name\": \"ESTADOS UNIDOS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"434\"," +
                "            \"alternateCode\": \"UZB\"," +
                "            \"name\": \"UZBEDISTAN\"" +
                "        }," +
                "        {" +
                "            \"id\": \"436\"," +
                "            \"alternateCode\": \"VAT\"," +
                "            \"name\": \"SANTA SEDE¢ESTADO DE LA CIUDAD DEL VATIC\"" +
                "        }," +
                "        {" +
                "            \"id\": \"437\"," +
                "            \"alternateCode\": \"VCT\"," +
                "            \"name\": \"SAN VICENTE Y LAS GRANADINAS\"" +
                "        }," +
                "        {" +
                "            \"id\": \"439\"," +
                "            \"alternateCode\": \"VEN\"," +
                "            \"name\": \"VENEZUELA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"440\"," +
                "            \"alternateCode\": \"VGB\"," +
                "            \"name\": \"ISLAS VíRGENES (BRITáNICAS)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"442\"," +
                "            \"alternateCode\": \"VIR\"," +
                "            \"name\": \"ISLAS VíRGENES (EE.UU.)\"" +
                "        }," +
                "        {" +
                "            \"id\": \"443\"," +
                "            \"alternateCode\": \"VNM\"," +
                "            \"name\": \"VIET NAM\"" +
                "        }," +
                "        {" +
                "            \"id\": \"444\"," +
                "            \"alternateCode\": \"VUT\"," +
                "            \"name\": \"VANUATU\"" +
                "        }," +
                "        {" +
                "            \"id\": \"446\"," +
                "            \"alternateCode\": \"WLF\"," +
                "            \"name\": \"WALLIS Y FUTUNA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"447\"," +
                "            \"alternateCode\": \"WSM\"," +
                "            \"name\": \"SAMOA\"" +
                "        }," +
                "        {" +
                "            \"id\": \"448\"," +
                "            \"alternateCode\": \"YEM\"," +
                "            \"name\": \"YEMEN\"" +
                "        }" +
                "    ]" +
                "}");
        return jsonObject;
    }

    public static JSONObject getStatesAso() {

        JSONObject jsonObject = new JSONObject("{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"CO-ANT\"," +
                "            \"name\": \"ANTIOQUIA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"05\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-ATL\"," +
                "            \"name\": \"ATLANTICO\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"08\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-DC\"," +
                "            \"name\": \"DISTRITO CAPITAL\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"11\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-BOL\"," +
                "            \"name\": \"BOLIVAR\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"13\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-BOY\"," +
                "            \"name\": \"BOYACA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"15\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CAL\"," +
                "            \"name\": \"CALDAS\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"17\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CAQ\"," +
                "            \"name\": \"CAQUETA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"18\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CAU\"," +
                "            \"name\": \"CAUCA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"19\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CES\"," +
                "            \"name\": \"CESAR\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"20\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-COR\"," +
                "            \"name\": \"CORDOBA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"23\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CUN\"," +
                "            \"name\": \"CUNDINAMARCA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"25\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CHO\"," +
                "            \"name\": \"CHOCO\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"27\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-HUI\"," +
                "            \"name\": \"HUILA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"41\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-LAG\"," +
                "            \"name\": \"LA GUAJIRA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"44\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-MAG\"," +
                "            \"name\": \"MAGDALENA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"47\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-MET\"," +
                "            \"name\": \"META\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"50\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-NAR\"," +
                "            \"name\": \"NARI#O\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"52\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-NSA\"," +
                "            \"name\": \"NORTE SANTANDER\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"54\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-QUI\"," +
                "            \"name\": \"QUINDIO\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"63\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-RIS\"," +
                "            \"name\": \"RISARALDA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"66\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-SAN\"," +
                "            \"name\": \"SANTANDER\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"68\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-SUC\"," +
                "            \"name\": \"SUCRE\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"70\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-TOL\"," +
                "            \"name\": \"TOLIMA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"73\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-VAC\"," +
                "            \"name\": \"VALLE\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"76\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-ARA\"," +
                "            \"name\": \"ARAUCA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"81\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-CAS\"," +
                "            \"name\": \"CASANARE\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"85\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-PUT\"," +
                "            \"name\": \"PUTUMAYO\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"86\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-SAP\"," +
                "            \"name\": \"SAN ANDRES\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"88\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-AMA\"," +
                "            \"name\": \"AMAZONAS\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"91\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-GUA\"," +
                "            \"name\": \"GUAINIA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"94\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-GUV\"," +
                "            \"name\": \"GUAVIARE\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"95\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-VAU\"," +
                "            \"name\": \"VAUPES\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"97\"" +
                "                }" +
                "            ]" +
                "        }," +
                "        {" +
                "            \"id\": \"CO-VID\"," +
                "            \"name\": \"VICHADA\"," +
                "            \"geolocation\": {" +
                "                \"latitude\": 0.0," +
                "                \"longitude\": 0.0" +
                "            }," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"geographicPlacesTypes\": [" +
                "                {" +
                "                    \"id\": \"DANE\"," +
                "                    \"value\": \"99\"" +
                "                }" +
                "            ]" +
                "        }" +
                "    ]" +
                "}");
        return jsonObject;
    }

    public static JSONObject getCitiesAso() {

        JSONObject jsonObject = new JSONObject("{" +
                "    \"data\": [" +
                "        {" +
                "            \"id\": \"001\"," +
                "            \"name\": \"LETICIA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"263\"," +
                "            \"name\": \"EL ENCANTO\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"405\"," +
                "            \"name\": \"LA CHORRERA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"407\"," +
                "            \"name\": \"LA PEDRERA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"430\"," +
                "            \"name\": \"LA VICTORIA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"460\"," +
                "            \"name\": \"MIRITI-PARANA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"530\"," +
                "            \"name\": \"PUERTO ALEGRIA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"536\"," +
                "            \"name\": \"PUERTO ARICA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"540\"," +
                "            \"name\": \"PUERTO NARI#O\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"669\"," +
                "            \"name\": \"PTO SANTANDER\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }," +
                "        {" +
                "            \"id\": \"798\"," +
                "            \"name\": \"TARAPACA\"," +
                "            \"country\": {" +
                "                \"id\": \"CO\"," +
                "                \"name\": \"COLOMBIA\"" +
                "            }," +
                "            \"state\": {" +
                "                \"id\": \"CO-AMA\"," +
                "                \"name\": \"AMAZONAS\"" +
                "            }" +
                "        }" +
                "    ]" +
                "}");
        return jsonObject;
    }

}
