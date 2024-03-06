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
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0XDz000006C1Q5MAK\"," +
                        "                    \"question\": \"Has tenido problemas con la Net\"," +
                        "                    \"order\": 6," +
                        "                    \"openQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": true," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0XDz000006C1PvMAK\"," +
                        "                    \"question\": \"Tiene ud más productos con el banco?. En caso afirmativo diga cuales\"," +
                        "                    \"order\": 2," +
                        "                    \"openQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": true," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": [" +
                        "                        {" +
                        "                            \"nextQuestionOrder\": 5," +
                        "                            \"closedAnswer\": \"No\"," +
                        "                            \"selectedOption\": \"\"" +
                        "                        }" +
                        "                    ]" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0XDz000006C1PwMAK\"," +
                        "                    \"question\": \"seleccione qué canales usa del banco. Indícanos qué te gusta de ellos\"," +
                        "                    \"order\": 1," +
                        "                    \"openQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": true," +
                        "                        \"options\": [" +
                        "                            \"ATM\"," +
                        "                            \"GLOMO\"," +
                        "                            \"NET\"," +
                        "                            \"NETCASH\"," +
                        "                            \"OTROS\"" +
                        "                        ]" +
                        "                    }," +
                        "                    \"skipQuestionRules\": [" +
                        "                        {" +
                        "                            \"nextQuestionOrder\": 5," +
                        "                            \"closedAnswer\": \"\"," +
                        "                            \"selectedOption\": \"GLOMO\"" +
                        "                        }," +
                        "                        {" +
                        "                            \"nextQuestionOrder\": 6," +
                        "                            \"closedAnswer\": \"\"," +
                        "                            \"selectedOption\": \"NET\"" +
                        "                        }" +
                        "                    ]" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0XDz000006C1QAMA0\"," +
                        "                    \"question\": \"Cual producto le gusta mas. Alguna sugerencia de mejora\"," +
                        "                    \"order\": 3," +
                        "                    \"openQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": false" +
                        "                    }," +
                        "                    \"closedQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": true," +
                        "                        \"isMultipleAnswer\": false," +
                        "                        \"options\": [" +
                        "                            \"CDT\"," +
                        "                            \"LIBRANZA\"," +
                        "                            \"CUANTA DE AHORROS\"," +
                        "                            \"PRESTAMOS\"," +
                        "                            \"HIPOTECARIOS\"," +
                        "                            \"OTROS\"" +
                        "                        ]" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }," +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKFEA4-a0XDz000006C1Q0MAK\"," +
                        "                    \"question\": \"qué te gusta de Glomo\"," +
                        "                    \"order\": 5," +
                        "                    \"openQuestion\": {" +
                        "                        \"enabled\": true," +
                        "                        \"required\": true" +
                        "                    }," +
                        "                    \"closedQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"explainYes\": false," +
                        "                        \"explainNo\": false" +
                        "                    }," +
                        "                    \"optionListQuestion\": {" +
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"isMultipleAnswer\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }" +
                        "            ]" +
                        "        }" +
                        "    ]" +
                        "}";
        JSONObject jsonObject = new JSONObject(parteA);
        return jsonObject;
    }
}
