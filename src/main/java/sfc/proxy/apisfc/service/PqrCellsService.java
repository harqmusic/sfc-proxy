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

    //Post salesforce-issue-tracker/v0/issues
    public static JSONObject postNewCaseAso() {

        JSONObject jsonObject = new JSONObject(
                "{" +
                                        "  \"data\": {" +
                                        "    \"id\": \"5003E00000DBm5ZQAT\"," +
                                        "    \"subject\": \"86848-ROYAL BANK OF SCOTLAND PLC\"," +
                                        "    \"resolution\": \"Introducir la información de la cuenta correctamente\"," +
                                        "    \"appUserId\": \"ADMIN01\"," +
                                        "    \"financialManagementCompanyId\": \"20072230\"," +
                                        "    \"description\": \"Incidencia a la hora de crear una transferencia.\"," +
                                        "    \"sourceSystem\": \"Net Cash\"," +
                                        "    \"sourceSystemCode\":\"1234\"," +
                                        "    \"internalIssueId\": \"00015837\"," +
                                        "    \"creationDate\": \"2018-05-03\"," +
                                        "    \"closeDate\": \"2016-01-29T12:03:26Z\"," +
                                        "    \"caseCreator\": \"Creador del caso\"," +
                                        "    \"targetedCompletionDate\":\"2016-01-29T12:03:26Z\"," +
                                        "    \"origin\": \"WEB_FORM\"," +
                                        "    \"priority\": \"MEDIUM\"," +
                                        "    \"milestone\":\"remove\"," +
                                        "    \"classification\": \"INCIDENCE\"," +
                                        "    \"status\": \"ANSWERED\"," +
                                        "    \"action\":\"NEW\"," +
                                        "    \"notes\":{" +
                                        "      \"id\":[\"12332\",\"1322\"]" +
                                        "    }," +
                                        "    \"location\":{" +
                                        "      \"addressComponents\":[" +
                                        "        {" +
                                        "          \"componentTypes\":[\"calle\",\"15\"]," +
                                        "          \"code\":\"110921\"," +
                                        "          \"name\":\"calle Robles\"," +
                                        "          \"additionalInformation\":\"frente a iglesia\"" +
                                        "        }," +
                                        "        {" +
                                        "          \"componentTypes\":[\"calle\",\"15\"]," +
                                        "          \"code\":\"110921\"," +
                                        "          \"name\":\"calle Robles\"," +
                                        "          \"additionalInformation\":\"frente a iglesia\"" +
                                        "        }" +
                                        "      ]" +
                                        "    }," +
                                        "    \"client\": {" +
                                        "      \"id\": \"987652587\"," +
                                        "      \"fullName\": \"Nombre cliente Max Mistral\"" +
                                        "    }," +
                                        "    \"form\":{" +
                                        "      \"id\":\"5003E00000DBm5ZQAT\"," +
                                        "      \"name\":\"Reporte tarjeta\"," +
                                        "      \"formAnswers\":[" +
                                        "        {" +
                                        "          \"id\":\"5003E00000DBm5ZQAT\"," +
                                        "          \"questionId\":\"1\"," +
                                        "          \"questionType\":{" +
                                        "            \"id\":\"2\"," +
                                        "            \"description\":\"pregunta de incidencia\"" +
                                        "          }," +
                                        "          \"answer\":\"respuesta cliente\"," +
                                        "          \"isRequired\":\"String\"," +
                                        "          \"optionListAnswer\":[\"a\",\"b\",\"c\"]," +
                                        "          \"order\":2," +
                                        "          \"openQuestion\":{" +
                                        "            \"enabled\":true," +
                                        "            \"required\":false" +
                                        "          }," +
                                        "          \"closedQuestion\":{" +
                                        "            \"enabled\":false," +
                                        "            \"required\":true," +
                                        "            \"explainYes\":true," +
                                        "            \"explainNo\":false" +
                                        "          }," +
                                        "          \"optionListQuestion\":{" +
                                        "            \"enabled\":false," +
                                        "            \"required\":true," +
                                        "            \"isMultipleAnswer\":true," +
                                        "            \"options\":[\"A\",\"b\",\"c\"]" +
                                        "          }" +
                                        "        }," +
                                        "        {" +
                                        "          \"id\":\"5003E00000DBm5ZQAT\"," +
                                        "          \"questionId\":\"1\"," +
                                        "          \"questionType\":{" +
                                        "            \"id\":\"2\"," +
                                        "            \"description\":\"pregunta de incidencia\"" +
                                        "          }," +
                                        "          \"answer\":\"respuesta cliente\"," +
                                        "          \"isRequired\":\"String\"," +
                                        "          \"optionListAnswer\":[\"a\",\"b\",\"c\"]," +
                                        "          \"order\":2," +
                                        "          \"openQuestion\":{" +
                                        "            \"enabled\":true," +
                                        "            \"required\":false" +
                                        "          }," +
                                        "          \"closedQuestion\":{" +
                                        "            \"enabled\":false," +
                                        "            \"required\":true," +
                                        "            \"explainYes\":true," +
                                        "            \"explainNo\":false" +
                                        "          }," +
                                        "          \"optionListQuestion\":{" +
                                        "            \"enabled\":false," +
                                        "            \"required\":true," +
                                        "            \"isMultipleAnswer\":true," +
                                        "            \"options\":[\"A\",\"b\",\"c\"]" +
                                        "          }" +
                                        "        }" +
                                        "      ]" +
                                        "    }," +
                                        "    \"area\":{" +
                                        "      \"id\":\"2323\"," +
                                        "      \"subarea\":{" +
                                        "        \"id\":\"6329\"" +
                                        "      }" +
                                        "    }," +
                                        "    \"attachments\":[" +
                                        "      {" +
                                        "        \"name\":\"objeto\"," +
                                        "        \"size\":\"600mbp\"," +
                                        "        \"createdDate\":\"2016-01-29T12:03:26Z\"," +
                                        "        \"link\":{" +
                                        "          \"rel\":\"depende\"," +
                                        "          \"href\":\"www.casosPqr.com\"" +
                                        "        }" +
                                        "      }," +
                                        "      {" +
                                        "        \"name\":\"objeto\"," +
                                        "        \"size\":\"600mbp\"," +
                                        "        \"createdDate\":\"2016-01-29T12:03:26Z\"," +
                                        "        \"link\":{" +
                                        "          \"rel\":\"depende\"," +
                                        "          \"href\":\"www.casosPqr.com\"" +
                                        "        }" +
                                        "      }" +
                                        "    ]," +
                                        "    \"issuer\": {" +
                                        "      \"fullName\": \"John Doe García\"," +
                                        "      \"contactDetails\": [" +
                                        "        {" +
                                        "          \"contact\": \"637824316\"," +
                                        "          \"contactType\": \"PHONE_NUMBER\"," +
                                        "          \"isPreferential\": true" +
                                        "        }," +
                                        "        {" +
                                        "          \"contact\": \"JohnDoe@organization.com\"," +
                                        "          \"contactType\": \"WORK_EMAIL\"," +
                                        "          \"isPreferential\": false" +
                                        "        }" +
                                        "      ]," +
                                        "      \"location\":{" +
                                        "        \"formattedAddress\":\"colombianizada\"," +
                                        "        \"addressComponents\":[" +
                                        "          {" +
                                        "            \"componentTypes\":[\"calle\",\"15\"]," +
                                        "            \"code\":\"110921\"," +
                                        "            \"name\":\"calle Robles\"," +
                                        "            \"additionalInformation\":\"frente a iglesia\" " +
                                        "          }," +
                                        "          {" +
                                        "            \"componentTypes\":[\"calle\",\"15\"]," +
                                        "            \"code\":\"110921\"," +
                                        "            \"name\":\"calle Robles\"," +
                                        "            \"additionalInformation\":\"frente a iglesia\"" +
                                        "          }" +
                                        "        ]" +
                                        "      }," +
                                        "      \"gender\":{" +
                                        "        \"id\":\"2\"," +
                                        "        \"description\":\"no binario\"" +
                                        "      }," +
                                        "      \"lgbtiqCommunity\":\"Queer\"," +
                                        "      \"specialCondition\":{" +
                                        "        \"id\":\"2\"," +
                                        "        \"description\":\"TDHA\"" +
                                        "      }" +
                                        "    }," +
                                        "    \"contract\": {" +
                                        "      \"id\": \"1234\"," +
                                        "      \"number\": \"1234\"," +
                                        "      \"numberType\": {" +
                                        "        \"id\": \"1234\"" +
                                        "      }," +
                                        "      \"product\": {" +
                                        "        \"id\": \"9876\"," +
                                        "        \"name\": \"Tarjeta de credito\"," +
                                        "        \"productType\": {" +
                                        "          \"id\": \"VISA\"" +
                                        "        }" +
                                        "      }," +
                                        "      \"transaction\": [" +
                                        "        {" +
                                        "          \"id\": 1," +
                                        "          \"operationDate\": \"2019-12-12T20:33:52.0+0000\"," +
                                        "          \"localAmount\": {" +
                                        "            \"amount\": \"100000\"," +
                                        "            \"currency\": \"COP\"" +
                                        "          }," +
                                        "          \"channel\": {" +
                                        "            \"id\": \"ATM\"," +
                                        "            \"name\": \"ATM 345\"" +
                                        "          }," +
                                        "          \"transactionNumber\": \"561\"," +
                                        "        }," +
                                        "        {" +
                                        "          \"id\": 1," +
                                        "          \"operationDate\": \"2019-12-12T20:33:52.0+0000\"," +
                                        "          \"localAmount\": {" +
                                        "            \"amount\": \"100000\"," +
                                        "            \"currency\": \"COP\"" +
                                        "          }," +
                                        "          \"channel\": {" +
                                        "            \"id\": \"ATM\"," +
                                        "            \"name\": \"ATM 345\"" +
                                        "          }," +
                                        "          \"transactionNumber\": \"561\"" +
                                        "        }" +
                                        "      ]" +
                                        "    }," +
                                        "    \"ocurrenceDate\": \"2020-02-06\"," +
                                        "    \"parentIssue\": {" +
                                        "      \"id\": \"00043\"," +
                                        "      \"internalIssueId\": \"500g000000UN5eFAAT\"" +
                                        "    }," +
                                        "    \"replyTopic\": \"03\"," +
                                        "    \"claimant\": {" +
                                        "      " +
                                        "      \"NONCUSTOMER\":{" +
                                        "        \"claimantType\":\"NONCUSTOMER\"," +
                                        "        \"identityDocuments\": [" +
                                        "        {" +
                                        "          \"documentType\": {" +
                                        "            \"id\": \"02\"" +
                                        "          }," +
                                        "          \"documentNumber\": \"3545444422\"" +
                                        "        }," +
                                        "        {" +
                                        "          \"documentType\": {" +
                                        "            \"id\": \"02\"" +
                                        "          }," +
                                        "          \"documentNumber\": \"3545444422\"" +
                                        "        }" +
                                        "      ]," +
                                        "      \"occupationType\": {" +
                                        "        \"id\": \"02\"" +
                                        "      }    " +
                                        "    }," +
                                        "    \"ASCUSTOMER\":{" +
                                        "      \"claimantType\":\"CUSTOMER\"," +
                                        "      \"id\":\"00043\"" +
                                        "      }" +
                                        "    }" +
                                        "  }" +
                                        "}"
        );
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
        String parteA = "{" + //
                "    \"data\": [" + //
                "        {" + //
                "            \"id\": \"a0h3p00000BfWB7AAN\"," + //
                "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Revisión y/o liquidación con relación a la retención del cliente.\"," + //
                "            \"requireMovements\": false," + //
                "            \"issue\": {" + //
                "                \"issueType\": {" + //
                "                    \"id\": \"Revisión y/o liquidación\"" + //
                "                }," + //
                "                \"specificSubject\": \"Tarjeta de crédito - Cancelación TDC o retención - falencia de retención\"," + //
                "                \"tooltip\": \"Tema Call center retención\"," + //
                "                \"ranking\": {" + //
                "                    \"value\": \"15\"" + //
                "                }" + //
                "            }" + //
                "        }," + //
                "        {" + //
                "            \"id\": \"a0h3p00000Brs3UAAR\"," + //
                "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Cajero automático con relación a la Transacciones no reconocidas - Posible clonación\"," + //
                "            \"requireMovements\": true," + //
                "            \"issue\": {" + //
                "                \"issueType\": {" + //
                "                    \"id\": \"Cajero automático\"" + //
                "                }," + //
                "                \"specificSubject\": \"Transacciones no reconocidas - Posible clonación Atm's\"," + //
                "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," + //
                "                \"ranking\": {" + //
                "                    \"value\": \"14\"" + //
                "                }" + //
                "            }," + //
                "            \"forms\": [" + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIA1\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 1," + //
                "                    \"question\": \"¿Recibió usted un correo electrónico o mensaje de texto a través del cual le indicaron que sus productos con el Banco estaban bloqueados y diligenció la información requerida en el mismo (agradecemos reenviar dicho correo al buzón de fraude internet@bbva.com)?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": true," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"isMultipleAnswer\": true," + //
                "                        \"options\": [" + //
                "                          \"option 1\", " + //
                "                          \"option 2\", " + //
                "                          \"option 3\", " + //
                "                          \"option N\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [" + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 4," + //
                "                            \"closedAnswer\": \"Si\"," + //
                "                            \"selectedOption\": \"option 3\"" + //
                "                        }," + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"Si\"," + //
                "                            \"selectedOption\": \"option N\"" + //
                "                        }" + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIA2\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 4," + //
                "                    \"question\": \"¿Durante la realización de las transacciones objetadas, tuvo inconvenientes en el servicio de su línea celular?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": false," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"isMultipleAnswer\": false," + //
                "                        \"options\": [" + //
                "                          \"option 1A\", " + //
                "                          \"option 2A\", " + //
                "                          \"option 3A\", " + //
                "                          \"option NA\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [" + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 4," + //
                "                            \"closedAnswer\": \"No\"," + //
                "                            \"selectedOption\": \"\"" + //
                "                        }" + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIA3\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 3," + //
                "                    \"question\": \"¿Tiene personas de su confianza con acceso a la tarjeta debito y/o crédito?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": false," + //
                "                        \"explainNo\": false" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"isMultipleAnswer\": true," + //
                "                        \"options\": [" + //
                "                          \"option1 option1 option1 option1 option1 option1 option1\", " + //
                "                          \"option2B\", " + //
                "                          \"option3B\", " + //
                "                          \"optionNB optionNB optionNB optionNB\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [" + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"No\"," + //
                "                            \"selectedOption\": \"option1 option1 option1 option1 option1 option1 option1\"" + //
                "                        }," + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"Si\"," + //
                "                            \"selectedOption\": \"option2B\"" + //
                "                        }," + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"No\"," + //
                "                            \"selectedOption\": \"optionNB optionNB optionNB optionNB\"" + //
                "                        }" + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIA4\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 5," + //
                "                    \"question\": \"¿Alguien más conoce su clave de operaciones en los canales de internet, móvil, cajeros, y/o Call center?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": false," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": false," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"isMultipleAnswer\": true," + //
                "                        \"options\": [" + //
                "                          \"option1 option1 option1 option1 option1XXXx\", " + //
                "                          \"option 2C\", " + //
                "                          \"option 3C option 3C option 3C\", " + //
                "                          \"option NC\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [                        " + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAA-a0dDm000000xCWwIA5\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 2," + //
                "                    \"question\": \"Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
                "3. Formato Radicación PQR Suplantación Productos Online\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"explainYes\": true," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": false," + //
                "                        \"required\": false," + //
                "                        \"isMultipleAnswer\": false," + //
                "                        \"options\": [" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [                        " + //
                "                    ]                    " + //
                "                }                        " + //
                "            ]" + //
                "        }," + //
                "        {" + //
                "            \"id\": \"a0h3p00000Brs3UAAX\"," + //
                "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Tarjeta de Crédito referente a Cajero automático con relación a la Transacciones no reconocidas - Posible clonación\"," + //
                "            \"requireMovements\": true," + //
                "            \"issue\": {" + //
                "                \"issueType\": {" + //
                "                    \"id\": \"Cajero automático\"" + //
                "                }," + //
                "                \"specificSubject\": \"Transacciones no reconocidas 2 - Posible clonación sesiones GLOMO\"," + //
                "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," + //
                "                \"ranking\": {" + //
                "                    \"value\": \"14\"" + //
                "                }" + //
                "            }," + //
                "            \"forms\": [" + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAX-a0dDm000000xCWwIA6\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 1," + //
                "                    \"question\": \"¿Recibió usted un correo electrónico o mensaje de texto a través del cual le indicaron que sus productos con el Banco estaban bloqueados y diligenció la información requerida en el mismo (agradecemos reenviar dicho correo al buzón de fraude internet@bbva.com)?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": true," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"isMultipleAnswer\": true," + //
                "                        \"options\": [" + //
                "                          \"option 1\", " + //
                "                          \"option 2\", " + //
                "                          \"option 3\", " + //
                "                          \"option N\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [" + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 4," + //
                "                            \"closedAnswer\": \"\"," + //
                "                            \"selectedOption\": \"option 3\"" + //
                "                        }," + //
                "                        {" + //
                "                            \"nextQuestionOrder\": \"\"," + //
                "                            \"closedAnswer\": \"Si\"," + //
                "                            \"selectedOption\": \"option N\"" + //
                "                        }" + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAX-a0dDm000000xCWwIA7\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 2," + //
                "                    \"question\": \"¿Durante la realización de las transacciones objetadas, tuvo inconvenientes en el servicio de su línea celular?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": false," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"isMultipleAnswer\": false," + //
                "                        \"options\": [" + //
                "                          \"option 1A\", " + //
                "                          \"option 2A\", " + //
                "                          \"option 3A\", " + //
                "                          \"option NA\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [" + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 4," + //
                "                            \"closedAnswer\": \"No\"," + //
                "                            \"selectedOption\": \"\"" + //
                "                        }" + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAX-a0dDm000000xCWwIA8\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 3," + //
                "                    \"question\": \"¿Tiene personas de su confianza con acceso a la tarjeta debito y/o crédito?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": false," + //
                "                        \"explainNo\": false" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"isMultipleAnswer\": true," + //
                "                        \"options\": [" + //
                "                          \"option1 option1 option1 option1 option1 option1 option1\", " + //
                "                          \"option2B\", " + //
                "                          \"option3B\", " + //
                "                          \"optionNB optionNB optionNB optionNB\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [" + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"No\"," + //
                "                            \"selectedOption\": \"option1 option1 option1 option1 option1 option1 option1\"" + //
                "                        }," + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"Si\"," + //
                "                            \"selectedOption\": \"option2B\"" + //
                "                        }," + //
                "                        {" + //
                "                            \"nextQuestionOrder\": 5," + //
                "                            \"closedAnswer\": \"No\"," + //
                "                            \"selectedOption\": \"optionNB optionNB optionNB optionNB\"" + //
                "                        }" + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAX-a0dDm000000xCWwIA9\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 4," + //
                "                    \"question\": \"¿Alguien más conoce su clave de operaciones en los canales de internet, móvil, cajeros, y/o Call center?\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": false," + //
                "                        \"required\": false," + //
                "                        \"explainYes\": false," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false," + //
                "                        \"isMultipleAnswer\": true," + //
                "                        \"options\": [" + //
                "                          \"option1 option1 option1 option1 option1XXXx\", " + //
                "                          \"option 2C\", " + //
                "                          \"option 3C option 3C option 3C\", " + //
                "                          \"option NC\"" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [                        " + //
                "                    ]                    " + //
                "                }," + //
                "                {" + //
                "                    \"id\": \"a0eDm000000ij2xIAX-a0dDm000000xCWwI10\"," + //
                "                    \"formType\": \"02\"," + //
                "                    \"order\": 5," + //
                "                    \"question\": \"Tiene usted productos contratados actualmente con el banco? Si marco No: No olvide adjuntar el 1. Copia del documento de identificación  2. Reclamo con descripción de los hechos, firma y huella\\r\\n" + //
                "3. Formato Radicación PQR Suplantación Productos Online\"," + //
                "                    \"openQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": false" + //
                "                    }," + //
                "                    \"closedQuestion\": {" + //
                "                        \"enabled\": true," + //
                "                        \"required\": true," + //
                "                        \"explainYes\": true," + //
                "                        \"explainNo\": true" + //
                "                    }," + //
                "                    \"optionListQuestion\": {" + //
                "                        \"enabled\": false," + //
                "                        \"required\": false," + //
                "                        \"isMultipleAnswer\": false," + //
                "                        \"options\": [" + //
                "                        ]" + //
                "                    }," + //
                "                    \"skipQuestionRules\": [                        " + //
                "                    ]                    " + //
                "                }                        " + //
                "            ]" + //
                "        }" + //
                "    ]" + //
                "}";
        JSONObject jsonObject = new JSONObject(parteA);
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


    public static JSONObject getIssueAso() {

        JSONObject jsonObject = new JSONObject("");
        return jsonObject;
    }

    public static JSONObject getListIssuesAso() {

        JSONObject jsonObject = new JSONObject("{" +
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
                        "}");
        return jsonObject;
    }
}
