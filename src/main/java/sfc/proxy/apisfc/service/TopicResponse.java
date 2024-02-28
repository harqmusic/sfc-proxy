package sfc.proxy.apisfc.service;

import org.json.JSONObject;

public class TopicResponse {

    public static JSONObject getTopicsAso() {
        String parteA = "{" +
                        "    \"data\": [" +
                        "        {" +
                        "            \"id\": \"a0bg000000FG199AAD\"," +
                        "            \"description\": \"Inconformidad presentada por la entrega de billetes falsos a través del cajero automático del Bbva.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Billetes naguara2\"," +
                        "                \"tooltip\": \"No solicites la radicación si la reclamación es por billete falso entregado por ventanilla, recuérdale al cliente que antes de retirarse de la ventanilla debe validar calidad y cantidad de lo entregado.\\n" +
                        "\\n" +
                        "\\n" +
                        "Si el retiro fue en ATM, anexa copia del billete y no olvides enviar el billete a Caja Central.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"3\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLKAA3\"," +
                        "            \"description\": \"Solicitud relacionada con el bloqueo presentado en la cuenta del Cliente por motivos no establecidos o que ameriten algún tipo de investigación interna.\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Bloqueo de productos\"" +
                        "                }," +
                        "                \"specificSubject\": \"Cuenta bloqueada\"," +
                        "                \"tooltip\": \"No radiques si se evidencia una “retención manual oficina \\\" en cuenta de ahorros o corriente, contacta al Cliente con su oficina gestora para que le suministren los motivos del bloqueo.\\n" +
                        "\\n" +
                        "Si el Cliente solicita información de un embargo, válida en el sistema el ente que lo ordenó e invitalo a dirigirse a dicha entidad - No se debe radicar la Petición.\\n" +
                        "\\n" +
                        "Si se trata de entrega de oficios de embargo o desembargo de saldos, se deben gestionar por el circuito establecido a través del buzón embargos.colombia@bbva.com.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLMAA3\"," +
                        "            \"description\": \"Solicitud relacionada con debito presentado en la cuenta del Cliente por motivos no establecidos o que ameriten algún tipo de investigación interna.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Descuentos injustificados\"" +
                        "                }," +
                        "                \"specificSubject\": \"Debitó automático no autorizado\"," +
                        "                \"tooltip\": \"No radiques si el descuento corresponde a un barrido para el pago de obligaciones con BBVA, explícale al cliente que se trata del pago de obligaciones contraídas con el Banco, que se encuentran en mora o domiciliadas según corresponda.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLPAA3\"," +
                        "            \"description\": \"Solicitud relacionada con la entrega parcial o total de dinero en los cajeros del Bbva administrado por la oficina.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Debitó y no entregó cajero administrado por la oficina\"," +
                        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLSAA3\"," +
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
                        "            \"id\": \"a0bg000000ErYLVAA3\"," +
                        "            \"description\": \"Solicitud relacionada con la entrega parcial o total de dinero en cajeros diferentes al Bbva.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Debitó y no entregó cajero otras redes\"," +
                        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYMTAA3\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto cuenta de ahorros referente a Incumplimiento de condiciones aspectos contractuales\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Incumplimiento de condiciones aspectos contractuales\"" +
                        "                }," +
                        "                \"specificSubject\": \"Incumplimiento de condiciones aspectos contractuales\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYMZAA3\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de ahorro referente a Información sujeta a reserva\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Información sujeta a reserva\"" +
                        "                }," +
                        "                \"specificSubject\": \"Información sujeta a reserva\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYNMAA3\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Descuentos injustificados con relación a la Seguros\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Descuentos injustificados\"" +
                        "                }," +
                        "                \"specificSubject\": \"Seguros\"," +
                        "                \"tooltip\": \"Antes de radicar, válida :\\n" +
                        "- No radiques si son casos de seguros de vida\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYMiAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a SIPLA con relación a la Lavado de activos\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"SARLAFT\"" +
                        "                }," +
                        "                \"specificSubject\": \"Lavado de activos\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLYAA3\"," +
                        "            \"description\": \"Solicitud relaciona pago de préstamos a través de cheques en los cajeros depositarios administrados por transportadora de valores.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Consignación errónea\"" +
                        "                }," +
                        "                \"specificSubject\": \"Depositario - Depósito en cheque Cajero Nivel 7\"," +
                        "                \"tooltip\": \"Antes de radicar, válida :\\n" +
                        "\\n" +
                        "Si fue aplicado erróneamente un depósito a un producto diferente al que el cliente dice haber solicitado; una vez hayas realizado las gestiones propias de la oficina (contacto con los clientes afectados), apóyate con el área jurídica a través de Pregúntale a D.G.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLiAAN\"," +
                        "            \"description\": \"Solicitud relacionada  con la entrega al Cliente de los extractos de los créditos o tarjetas.\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"No se remite información al cliente\"" +
                        "                }," +
                        "                \"specificSubject\": \"El cliente no recibe extractos\"," +
                        "                \"tooltip\": \"antes de radicar, valida: \\n" +
                        "1. Valida si tiene activa la Bbva.net o móvil\\n" +
                        "2.. Validar sus datos personales del Cliente (No olvides seguir los protocolos de seguridad para realizar los cambios en base de persona) \\n" +
                        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"2\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYMuAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Revisión y/o liquidación con relación a la Liquidación no conforme Particular\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Revisión y/o liquidación\"" +
                        "                }," +
                        "                \"specificSubject\": \"Liquidación no conforme Particular\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"1\"" +
                        "                }" +
                        "            }" +
                        "        }," +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLwAAN\"," +
                        "            \"description\": \"Inconformidad presentada por concepto del impuesto cuatro por mil cobrado.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Gravamen movimientos financieros\"" +
                        "                }," +
                        "                \"specificSubject\": \"Impuesto cuatro por mil\"," +
                        "                \"tooltip\": \"Evita radicar validando:\\n" +
                        "1. Que la cuenta esté marcada con exoneración del cuatro por mil o GMF (gravamen a los movimientos financieros).\\n" +
                        "2. Que la cuenta pensional o ahorros no haya superado el límite establecido.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYNfAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Su Plantación presunta de persona\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Suplantación presunta de persona\"" +
                        "                }," +
                        "                \"specificSubject\": \"Suplantación presunta de persona\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo del producto y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYMwAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de ahorro referente a Negación en la apertura o solicitud del producto\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Negación en la apertura o solicitud del producto\"" +
                        "                }," +
                        "                \"specificSubject\": \"Negación del producto\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYM4AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Datáfono con relación a la Inconformidad en compra internacional\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Datáfono\"" +
                        "                }," +
                        "                \"specificSubject\": \"Inconformidad en compra internacional Datáfono\"," +
                        "                \"tooltip\": \"Para todas las compras Internacionales los primeros 15 días el Cliente debe realizar su petición directamente ante el comercio (de lo contrario la franquicia no recibe realizar el contracargo)\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYM6AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Inconformidad en compra internacional\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Inconformidad en compra internacional Internet\"," +
                        "                \"tooltip\": \"Para todas las compras Internacionales los primeros 15 días el Cliente debe realizar su petición directamente ante el comercio (de lo contrario la franquicia no recibe realizar el contracargo)\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"2\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYJkAAN\"," +
                        "            \"description\": \"Solicitud relacionada con el cobro de comisión de retiro en Atm's ó cobro de cuotas de manejo ó comisiones de créditos.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cobro servicios o comisiones\"" +
                        "                }," +
                        "                \"specificSubject\": \"Cobro servicios o comisiones\"," +
                        "                \"tooltip\": \"Antes de radicar, válida :\\n" +
                        "\\n" +
                        "1. Si los beneficios naturales del producto, ya vencieron. \\n" +
                        "2. Él portafolio nómina y que reciba los abonos recurrentes.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"4\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYN2AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Consignación errónea con relación a la Pago mal aplicado\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Consignación errónea\"" +
                        "                }," +
                        "                \"specificSubject\": \"Pago mal aplicado\"," +
                        "                \"tooltip\": \"Antes de radicar, válida :\\n" +
                        "\\n" +
                        "Si fue aplicado erróneamente un depósito a un producto diferente al que el cliente dice haber solicitado; una vez hayas realizado las gestiones propias de la oficina (contacto con los clientes afectados), apóyate con el área jurídica a través de Pregúntale a D.G.\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYJuAAN\"," +
                        "            \"description\": \"Solicitud relacionada con la entrega parcial o total de dinero en los cajeros automáticos del Bbva administrado por la transportadora de dinero.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Debitó y no entregó cajero nivel siete\"," +
                        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"3\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYJxAAN\"," +
                        "            \"description\": \"Inconformidad presentada por la utilización de medios de pagos del Banco al realizar compras en los establecimientos.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Datáfono\"" +
                        "                }," +
                        "                \"specificSubject\": \"Inconformidad Compra en Datáfono\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"3\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYJzAAN\"," +
                        "            \"description\": \"Inconformidad presentada por la utilización de medios de pagos del Banco al realizar compras en los establecimientos.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Inconformidad Compra en Internet\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"3\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYNpAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto cuenta de ahorros referente a Inadecuado suministro de información en la vinculación\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Inadecuado suministro de información en la vinculación\"" +
                        "                }," +
                        "                \"specificSubject\": \"Suministro de información insuficiente o errada\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYNzAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Datáfono con relación a la Transacción cargada doblemente\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Datáfono\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacción cargada doblemente en datáfono\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYO1AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Transacción cargada doblemente\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacción cargada doblemente en Internet\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYOCAA3\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Cajero automático con relación a la Transacciones no reconocidas - hurto o pérdida\"," +
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
                        "                    \"id\": \"a0Yg0000006PKKGEA4-a0Xg0000005yNBWEA2\"," +
                        "                    \"question\": \"1. ¿Recibió ayuda de terceros cuando se encontraba tranzando en el cajero automático? De ser así, solicitar indicar la ubicación del cajero de nuestra red u otras redes en las que ocurrió lo anterior, así como también la hora aproximada de estos hechos. Validar el número del plástico que el cliente tiene en su poder en ese momento?\"," +
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
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }" +
                        "            ]" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYOFAA3\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Transacciones no reconocidas - hurto o pérdida\"," +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYOIAA3\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Transacciones no reconocidas en BBVA NET\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas en BBVA Net\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYO4AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Cajero automático con relación a la Transacciones no reconocidas - Cambiazo\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas - Cambiazo Atm's\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
                        "            }," +
                        "            \"forms\": [" +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKGEA4-a0Xg0000005yNBWEA2\"," +
                        "                    \"question\": \"1. ¿Recibió ayuda de terceros cuando se encontraba tranzando en el cajero automático? De ser así, solicitar indicar la ubicación del cajero de nuestra red u otras redes en las que ocurrió lo anterior, así como también la hora aproximada de estos hechos. Validar el número del plástico que el cliente tiene en su poder en ese momento?\"," +
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
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }" +
                        "            ]" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYO7AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Datáfono con relación a la Transacciones no reconocidas - Cambiazo\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Datáfono\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas - Cambiazo Datáfono\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYO9AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Transacciones no reconocidas - Cambiazo\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas - Cambiazo Internet\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"" +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYK2AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a BBVA Móvil con relación a la Pago debitado y no aplicado\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"BBVA Móvil\"" +
                        "                }," +
                        "                \"specificSubject\": \"Pago debitado y no aplicado BBVA Móvil\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"2\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYK4AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Cajero automático con relación a la Pago debitado y no aplicado\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Pago debitado y no aplicado Atm's\"," +
                        "                \"tooltip\": \"Antes de radicar, valida que la suma reclamada no haya sido reintegrada.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"5\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYK7AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Internet con relación a la Pago debitado y no aplicado\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Internet\"" +
                        "                }," +
                        "                \"specificSubject\": \"Pago debitado y no aplicado Internet\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"5\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKbAAN\"," +
                        "            \"description\": \"Inconformidad presentada por entrega de billetes deteriorados por parte del Banco a través de sus diferentes canales.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Billetes falsos\"" +
                        "                }," +
                        "                \"specificSubject\": \"Billetes Deteriorados\"," +
                        "                \"tooltip\": \"algo\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"4\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKdAAN\"," +
                        "            \"description\": \"Inconformidad presentada por la entrega de billetes falsos a través del cajero automático del Bbva.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Billetes naguara\"," +
                        "                \"tooltip\": \"No solicites la radicación si la reclamación es por billete falso entregado por ventanilla, recuérdale al cliente que antes de retirarse de la ventanilla debe validar calidad y cantidad de lo entregado.\\n" +
                        "\\n" +
                        "\\n" +
                        "Si el retiro fue en ATM, anexa copia del billete y no olvides enviar el billete a Caja Central.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"2\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYOcAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Vinculación presuntamente fraudulenta.\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Vinculación presuntamente fraudulenta\"" +
                        "                }," +
                        "                \"specificSubject\": \"Vinculación presuntamente fraudulenta\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKkAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto cuenta de ahorros referente a Actualización, Autorización para consultas, Calificación de Cartera, Prescripción de la Obligación.\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Reporte centrales de riesgos\"" +
                        "                }," +
                        "                \"specificSubject\": \"Reporte centrales de riesgos\"," +
                        "                \"tooltip\": \"No radiques casos por buro/puntaje, indícale al Cliente que el Banco no provee puntajes a las centrales de información financiera; nuestra entidad solo reporta el hábito de pago del cliente y su calificación.\\n" +
                        "\\n" +
                        "Si el cliente reclama por reporte generado por mora, identifica el producto y valida si efectivamente presentó mora e indícale que el reporte es acorde.\\n" +
                        "\\n" +
                        "\\\"Es obligatorio la autorización escrita del cliente para proceder con la consulta ante las centrales de información. para el call center se deben conservar el audio de autorización\\\"\\n" +
                        "\\n" +
                        "Se ha habilitado la compatibilidad con lectores de pantalla.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"2\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKpAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a BBVA Móvil con relación a la Transacciones no reconocidas\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"BBVA Móvil\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas Móvil\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"1\"" +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKsAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Cajero automático con relación a la Transacciones no reconocidas\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas Atm's\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"2\"" +
                        "                }" +
                        "            }," +
                        "            \"forms\": [" +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKGEA4-a0Xg0000005yNBWEA2\"," +
                        "                    \"question\": \"1. ¿Recibió ayuda de terceros cuando se encontraba tranzando en el cajero automático? De ser así, solicitar indicar la ubicación del cajero de nuestra red u otras redes en las que ocurrió lo anterior, así como también la hora aproximada de estos hechos. Validar el número del plástico que el cliente tiene en su poder en ese momento?\"," +
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
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }" +
                        "            ]" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKvAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Datáfono con relación a la Transacciones no reconocidas\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Datáfono\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas Datafono\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"7\"" +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYKxAAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Cajero automático con relación a la Transacciones no reconocidas - Posible clonación\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cajero automático\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas - Posible clonación Atm's\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"3\"" +
                        "                }" +
                        "            }," +
                        "            \"forms\": [" +
                        "                {" +
                        "                    \"id\": \"a0Yg0000006PKKGEA4-a0Xg0000005yNBWEA2\"," +
                        "                    \"question\": \"1. ¿Recibió ayuda de terceros cuando se encontraba tranzando en el cajero automático? De ser así, solicitar indicar la ubicación del cajero de nuestra red u otras redes en las que ocurrió lo anterior, así como también la hora aproximada de estos hechos. Validar el número del plástico que el cliente tiene en su poder en ese momento?\"," +
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
                        "                        \"enabled\": false," +
                        "                        \"required\": false," +
                        "                        \"options\": []" +
                        "                    }," +
                        "                    \"skipQuestionRules\": []" +
                        "                }" +
                        "            ]" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYL0AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Datáfono con relación a la Transacciones no reconocidas - Posible clonación\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Datáfono\"" +
                        "                }," +
                        "                \"specificSubject\": \"Transacciones no reconocidas - Posible clonación Datáfono\"," +
                        "                \"tooltip\": \"El presente trámite exige el bloqueo de la tarjeta asociada y el radicador es responsable de realizar esta operación interna, so pena de devolución y/o penalización.   El funcionario será responsable de informarle al cliente que una vez recibida la notificación con número de radicado, deberá comunicarse al Call Center para solicitar el desbloqueo  de los canales.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"8\"" +
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
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYL2AAN\"," +
                        "            \"description\": \"Solicitud relaciona pago de préstamos a través de cheques en los cajeros depositarios administrados por transportadora de valores.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Consignación errónea\"" +
                        "                }," +
                        "                \"specificSubject\": \"Depositario - Depósito en efectivo Cajero Nivel 7\"," +
                        "                \"tooltip\": \"Antes de radicar, válida :\\n" +
                        "\\n" +
                        "Si fue aplicado erróneamente un depósito a un producto diferente al que el cliente dice haber solicitado; una vez hayas realizado las gestiones propias de la oficina (contacto con los clientes afectados), apóyate con el área jurídica a través de Pregúntale a D.G.\"," +
                        "                \"ranking\": {" +
                        "                    \"value\": \"9\"" +
                        "                }" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYL3AAN\"," +
                        "            \"description\": \"Son peticiones realizadas por el Cliente en su producto Cuenta de Ahorro referente a Revisión y/o liquidación con relación a la Inconformidad programa puntos\"," +
                        "            \"requireMovements\": false," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Revisión y/o liquidación\"" +
                        "                }," +
                        "                \"specificSubject\": \"Inconformidad programa puntos\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLEAA3\"," +
                        "            \"description\": \"Solicitud relacionada con la sanción devolución cheque ó pagos con cheque de gerencia ó cheque no pagado falta de fondos ó cheque no pagado por firmas ó cheques devueltos ó orden de no pago no ejecutada ó uso fraudulento de cheques.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Cheques\"" +
                        "                }," +
                        "                \"specificSubject\": \"Cheques\"" +
                        "            }" +
                        "        }," +
                        "        {" +
                        "            \"id\": \"a0bg000000ErYLGAA3\"," +
                        "            \"description\": \"Solicitud relacionada con el transacción de pago realizado en el caja de las oficinas.\"," +
                        "            \"requireMovements\": true," +
                        "            \"issue\": {" +
                        "                \"issueType\": {" +
                        "                    \"id\": \"Pago irregular en caja\"" +
                        "                }," +
                        "                \"specificSubject\": \"Consignación Duplicada\"," +
                        "                \"tooltip\": \"Valida si es posible realizar la reversión de la operación antes de radicar su petición.\"" +
                        "            }" +
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
