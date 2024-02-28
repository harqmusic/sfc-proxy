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
                        "                    \"openQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": true" +
                        "                    }," +
                        "                    \"closeQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestion\": {" +
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
