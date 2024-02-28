package sfc.proxy.apisfc.service;

import org.json.JSONObject;

public class TopicResponse {

    public static JSONObject getTopicsAso() {
        String parteA = "{" +
                        "    \"data\": [" +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYJiAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Transacciones no reconocidas por páginas diferentes a BBVA Net\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas por páginas diferentes a BBVA Net\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"4\"" +
                        "                }" +
                        "            }," +
                        "            \"forms\": [" +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0Xg0000005yNBSEA2\"," +
                        "                    \"question\": \"1. ¿Recibió usted un correo electrónico o mensaje de texto a través del cual le indicaron que sus productos con el Banco estaban bloqueados y diligenció la información requerida en el mismo (agradecemos reenviar dicho correo al buzón de fraude internet@bbva.com)?\"," +
                        "                    \"order\": 1," +
                        "                    \"openQuestions\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": true" +
                        "                    }," +
                        "                    \"closedQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": false," + //
                        "                        \"options\": [" +
                        "                            \"Option1\"," +
                        "                            \"Option2\"" +
                        "                        ]" +
                        "                    }," +
                        "                    \"skipQuestionRules\": [" +
                        "                        {" +
                        "                            \"nextQuestionOrder\": 2," +
                        "                            \"closedAnswer\": \"No\"," +
                        "                            \"selectedOption\": \"Option1\"" +
                        "                        }," +
                        "                        {" +
                        "                            \"nextQuestionOrder\": 3," +
                        "                            \"closedAnswer\": \"Si\"," +
                        "                            \"selectedOption\": \"Option2\"" +
                        "                        }" +
                        "                    ]" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0Xg0000005yNBTEA2\"," +
                        "                    \"question\": \"2XX. ¿¿¿Durante la realización de las transacciones objetadas, tuvo inconvenientes en el servicio de su línea celular?\"," +
                        "                    \"order\": 3," +
                        "                    \"openQuestions\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestions\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": true," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": false," + //
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0Xg0000005yNBUEA2\"," +
                        "                    \"question\": \"3. ¿Tiene personas de su confianza con acceso a la tarjeta debito y/o crédito?\"," +
                        "                    \"order\": 4," +
                        "                    \"openQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestions\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": false," + //
                        "                        \"options\": [" +
                        "                            \"Opción 1\"," +
                        "                            \"Opción 2\"," +
                        "                            \"Opción 2 Opción 2 Opción 2\"," +
                        "                            \"Opción 3\"" +
                        "                        ]" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0Xg0000005yNBVEA2\"," +
                        "                    \"question\": \"4. ¿Alguien más conoce su clave de operaciones en los canales de internet, móvil, cajeros, y/o Call center?\"," +
                        "                    \"order\": 2," +
                        "                    \"openQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestions\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestions\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": true," +
                        "                        \"isMultipleAnswer\": false," + //
                        "                        \"options\": [" +
                        "                            \"Optio 1x\"," +
                        "                            \"Optio 2x\"," +
                        "                            \"Optio 3x\"," +
                        "                            \"Optio 4x\"," +
                        "                            \"Optio 5x\"," +
                        "                            \"Optio 6x\"," +
                        "                            \"Optio 7x\"," +
                        "                            \"Optio 8x\"," +
                        "                            \"Optio xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\"," +
                        "                            \"Optio 10x\"" +
                        "                        ]" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }" +
                        "            ]" +
                        "        }" +
                        "    ]" +
                        "}" +
                        "" +
                        "" +
                        "";
        JSONObject jsonObject = new JSONObject(parteA);
        return jsonObject;
    }
}
