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
