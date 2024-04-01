package sfc.proxy.apisfc.service;

import org.json.JSONObject;

public class AsoMovementsService {

	public static JSONObject getFinancialOverviewAccountsAso() {

		JSONObject jsonObject = new JSONObject("{" +
                        "    \"data\": {" +
                        "        \"family\": [" +
                        "            {" +
                        "                \"id\": \"CARDS\"," +
                        "                \"name\": \"TARJETAS\"," +
                        "                \"balances\": [" +
                        "                    {" +
                        "                        \"id\": \"DISPOSED_CURRENT_AGGREGATED\"," +
                        "                        \"amountBalance\": [" +
                        "                            {" +
                        "                                \"amount\": 1000.00," +
                        "                                \"currency\": \"COP\"" +
                        "                            }" +
                        "                        ]" +
                        "                    }" +
                        "                ]" +
                        "            }" +
                        "        ]," +
                        "        \"contracts\": [" +
                        "            {" +
                        "                \"id\": \"4912680579338755\"," +
                        "                \"classification\": {" +
                        "                    \"type\": \"GLOMO\"," +
                        "                    \"level\": [" +
                        "                        {" +
                        "                            \"id\": \"FIRST_LEVEL\"," +
                        "                            \"name\": \"CARDS\"" +
                        "                        }," +
                        "                        {" +
                        "                            \"id\": \"SECOND_LEVEL\"," +
                        "                            \"name\": \"CARDS\"" +
                        "                        }" +
                        "                    ]" +
                        "                }," +
                        "                \"number\": \"8755\"," +
                        "                \"numberType\": {" +
                        "                    \"id\": \"PAN\"" +
                        "                }," +
                        "                \"countryId\": \"CO\"," +
                        "                \"bank\": {" +
                        "                    \"id\": \"0013\"," +
                        "                    \"name\": \"BBVA COLOMBIA\"" +
                        "                }," +
                        "                \"branch\": {" +
                        "                    \"id\": \"0073\"" +
                        "                }," +
                        "                \"status\": {" +
                        "                    \"id\": \"OPERATIVE\"" +
                        "                }," +
                        "                \"signedAuthorization\": {" +
                        "                    \"id\": \"INDISTINCT\"" +
                        "                }," +
                        "                \"currencies\": [" +
                        "                    {" +
                        "                        \"currency\": \"COP\"," +
                        "                        \"isMajor\": true" +
                        "                    }" +
                        "                ]," +
                        "                \"participant\": {" +
                        "                    \"participantType\": {" +
                        "                        \"id\": \"HOLDER\"" +
                        "                    }," +
                        "                    \"name\": \"NOMBRE PRIAPE SEGAPE\"" +
                        "                }," +
                        "                \"product\": {" +
                        "                    \"id\": \"50\"," +
                        "                    \"name\": \"Visa Débito\"" +
                        "                }," +
                        "                \"productType\": \"CARD\"," +
                        "                \"subProductType\": {" +
                        "                    \"id\": \"DEBIT_CARD\"" +
                        "                }," +
                        "                \"isLegacy\": false," +
                        "                \"detail\": {" +
                        "                    \"specificAmounts\": [" +
                        "                        {" +
                        "                            \"id\": \"AVAILABLE_CURRENT_BALANCES\"," +
                        "                            \"amounts\": [" +
                        "                                {" +
                        "                                    \"amount\": 1000.00," +
                        "                                    \"currency\": \"COP\"" +
                        "                                }" +
                        "                            ]" +
                        "                        }," +
                        "                        {" +
                        "                            \"id\": \"GRANTED_CREDITS\"," +
                        "                            \"amounts\": [" +
                        "                                {" +
                        "                                    \"amount\": 2000.00," +
                        "                                    \"currency\": \"COP\"" +
                        "                                }" +
                        "                            ]" +
                        "                        }" +
                        "                    ]," +
                        "                    \"agreementContract\": \"00130073005000054496\"," +
                        "                    \"images\": [" +
                        "                        {" +
                        "                            \"id\": \"491268A0\"," +
                        "                            \"name\": \"{\\\"dc:modified\\\":\\\"2019-10-16T22:56:50.880+02:00\\\",\\\"dc:format\\\":\\\"image/png\\\",\\\"title\\\":\\\"co_A0_491268_19700101_front.png\\\"}\"," +
                        "                            \"url\": \"https://cardcovers-stage.caasbbva.com/colombia/co_A0_491268_19700101_front.png\"" +
                        "                        }" +
                        "                    ]," +
                        "                    \"physicalSupport\": {" +
                        "                        \"id\": \"NORMAL_PLASTIC\"" +
                        "                    }," +
                        "                    \"expirationDate\": \"2050-12-31T00:00:00.0-0500\"," +
                        "                    \"activations\": [" +
                        "                        {" +
                        "                            \"id\": \"ON_OFF\"," +
                        "                            \"isActive\": true" +
                        "                        }" +
                        "                    ]," +
                        "                    \"rewards\": [" +
                        "                        {" +
                        "                            \"id\": \"BANCOMER_POINTS\"," +
                        "                            \"nonMonetaryValue\": 1" +
                        "                        }" +
                        "                    ]," +
                        "                    \"indicators\": [" +
                        "                        {" +
                        "                            \"id\": \"BLOCKABLE\"," +
                        "                            \"isActive\": true" +
                        "                        }" +
                        "                    ]," +
                        "                    \"embossingDate\": \"2017-05-10T00:00:00.0-0500\"," +
                        "                    \"migrationType\": \"NORMAL\"," +
                        "                    \"status\": {" +
                        "                        \"id\": \"OPERATIVE\"," +
                        "                        \"name\": \"ACTIVADA\"" +
                        "                    }" +
                        "                }" +
                        "            }" +
                        "        ]" +
                        "    }" +
                        "}");
        return jsonObject;
	}

    public static JSONObject getFinancialOverviewCardsAso() {
        JSONObject jsonObject = new JSONObject("{" +
                        "    \"data\": {" +
                        "        \"family\": [" +
                        "            {" +
                        "                \"id\": \"CARDS\"," +
                        "                \"name\": \"TARJETAS\"," +
                        "                \"balances\": [" +
                        "                    {" +
                        "                        \"id\": \"DISPOSED_CURRENT_AGGREGATED\"," +
                        "                        \"amountBalance\": [" +
                        "                            {" +
                        "                                \"amount\": 1000.00," +
                        "                                \"currency\": \"COP\"" +
                        "                            }" +
                        "                        ]" +
                        "                    }" +
                        "                ]" +
                        "            }" +
                        "        ]," +
                        "        \"contracts\": [" +
                        "            {" +
                        "                \"id\": \"4912680579338755\"," +
                        "                \"classification\": {" +
                        "                    \"type\": \"GLOMO\"," +
                        "                    \"level\": [" +
                        "                        {" +
                        "                            \"id\": \"FIRST_LEVEL\"," +
                        "                            \"name\": \"CARDS\"" +
                        "                        }," +
                        "                        {" +
                        "                            \"id\": \"SECOND_LEVEL\"," +
                        "                            \"name\": \"CARDS\"" +
                        "                        }" +
                        "                    ]" +
                        "                }," +
                        "                \"number\": \"8755\"," +
                        "                \"numberType\": {" +
                        "                    \"id\": \"PAN\"" +
                        "                }," +
                        "                \"countryId\": \"CO\"," +
                        "                \"bank\": {" +
                        "                    \"id\": \"0013\"," +
                        "                    \"name\": \"BBVA COLOMBIA\"" +
                        "                }," +
                        "                \"branch\": {" +
                        "                    \"id\": \"0073\"" +
                        "                }," +
                        "                \"status\": {" +
                        "                    \"id\": \"OPERATIVE\"" +
                        "                }," +
                        "                \"signedAuthorization\": {" +
                        "                    \"id\": \"INDISTINCT\"" +
                        "                }," +
                        "                \"currencies\": [" +
                        "                    {" +
                        "                        \"currency\": \"COP\"," +
                        "                        \"isMajor\": true" +
                        "                    }" +
                        "                ]," +
                        "                \"participant\": {" +
                        "                    \"participantType\": {" +
                        "                        \"id\": \"HOLDER\"" +
                        "                    }," +
                        "                    \"name\": \"NOMBRE PRIAPE SEGAPE\"" +
                        "                }," +
                        "                \"product\": {" +
                        "                    \"id\": \"50\"," +
                        "                    \"name\": \"Visa Débito\"" +
                        "                }," +
                        "                \"productType\": \"CARD\"," +
                        "                \"subProductType\": {" +
                        "                    \"id\": \"DEBIT_CARD\"" +
                        "                }," +
                        "                \"isLegacy\": false," +
                        "                \"detail\": {" +
                        "                    \"specificAmounts\": [" +
                        "                        {" +
                        "                            \"id\": \"AVAILABLE_CURRENT_BALANCES\"," +
                        "                            \"amounts\": [" +
                        "                                {" +
                        "                                    \"amount\": 1000.00," +
                        "                                    \"currency\": \"COP\"" +
                        "                                }" +
                        "                            ]" +
                        "                        }," +
                        "                        {" +
                        "                            \"id\": \"GRANTED_CREDITS\"," +
                        "                            \"amounts\": [" +
                        "                                {" +
                        "                                    \"amount\": 2000.00," +
                        "                                    \"currency\": \"COP\"" +
                        "                                }" +
                        "                            ]" +
                        "                        }" +
                        "                    ]," +
                        "                    \"agreementContract\": \"00130073005000054496\"," +
                        "                    \"images\": [" +
                        "                        {" +
                        "                            \"id\": \"491268A0\"," +
                        "                            \"name\": \"{\\\"dc:modified\\\":\\\"2019-10-16T22:56:50.880+02:00\\\",\\\"dc:format\\\":\\\"image/png\\\",\\\"title\\\":\\\"co_A0_491268_19700101_front.png\\\"}\"," +
                        "                            \"url\": \"https://cardcovers-stage.caasbbva.com/colombia/co_A0_491268_19700101_front.png\"" +
                        "                        }" +
                        "                    ]," +
                        "                    \"physicalSupport\": {" +
                        "                        \"id\": \"NORMAL_PLASTIC\"" +
                        "                    }," +
                        "                    \"expirationDate\": \"2050-12-31T00:00:00.0-0500\"," +
                        "                    \"activations\": [" +
                        "                        {" +
                        "                            \"id\": \"ON_OFF\"," +
                        "                            \"isActive\": true" +
                        "                        }" +
                        "                    ]," +
                        "                    \"rewards\": [" +
                        "                        {" +
                        "                            \"id\": \"BANCOMER_POINTS\"," +
                        "                            \"nonMonetaryValue\": 1" +
                        "                        }" +
                        "                    ]," +
                        "                    \"indicators\": [" +
                        "                        {" +
                        "                            \"id\": \"BLOCKABLE\"," +
                        "                            \"isActive\": true" +
                        "                        }" +
                        "                    ]," +
                        "                    \"embossingDate\": \"2017-05-10T00:00:00.0-0500\"," +
                        "                    \"migrationType\": \"NORMAL\"," +
                        "                    \"status\": {" +
                        "                        \"id\": \"OPERATIVE\"," +
                        "                        \"name\": \"ACTIVADA\"" +
                        "                    }" +
                        "                }" +
                        "            }" +
                        "        ]" +
                        "    }" +
                        "}");

        return jsonObject;
    }

    public static JSONObject getFinancialOverviewLoansAso() {
        JSONObject jsonObject = new JSONObject("{" +
                        "    \"data\": {" +
                        "        \"family\": [" +
                        "            {" +
                        "                \"id\": \"CARDS\"," +
                        "                \"name\": \"TARJETAS\"," +
                        "                \"balances\": [" +
                        "                    {" +
                        "                        \"id\": \"DISPOSED_CURRENT_AGGREGATED\"," +
                        "                        \"amountBalance\": [" +
                        "                            {" +
                        "                                \"amount\": 1000.00," +
                        "                                \"currency\": \"COP\"" +
                        "                            }" +
                        "                        ]" +
                        "                    }" +
                        "                ]" +
                        "            }" +
                        "        ]," +
                        "        \"contracts\": [" +
                        "            {" +
                        "                \"id\": \"4912680579338755\"," +
                        "                \"classification\": {" +
                        "                    \"type\": \"GLOMO\"," +
                        "                    \"level\": [" +
                        "                        {" +
                        "                            \"id\": \"FIRST_LEVEL\"," +
                        "                            \"name\": \"CARDS\"" +
                        "                        }," +
                        "                        {" +
                        "                            \"id\": \"SECOND_LEVEL\"," +
                        "                            \"name\": \"CARDS\"" +
                        "                        }" +
                        "                    ]" +
                        "                }," +
                        "                \"number\": \"8755\"," +
                        "                \"numberType\": {" +
                        "                    \"id\": \"PAN\"" +
                        "                }," +
                        "                \"countryId\": \"CO\"," +
                        "                \"bank\": {" +
                        "                    \"id\": \"0013\"," +
                        "                    \"name\": \"BBVA COLOMBIA\"" +
                        "                }," +
                        "                \"branch\": {" +
                        "                    \"id\": \"0073\"" +
                        "                }," +
                        "                \"status\": {" +
                        "                    \"id\": \"OPERATIVE\"" +
                        "                }," +
                        "                \"signedAuthorization\": {" +
                        "                    \"id\": \"INDISTINCT\"" +
                        "                }," +
                        "                \"currencies\": [" +
                        "                    {" +
                        "                        \"currency\": \"COP\"," +
                        "                        \"isMajor\": true" +
                        "                    }" +
                        "                ]," +
                        "                \"participant\": {" +
                        "                    \"participantType\": {" +
                        "                        \"id\": \"HOLDER\"" +
                        "                    }," +
                        "                    \"name\": \"NOMBRE PRIAPE SEGAPE\"" +
                        "                }," +
                        "                \"product\": {" +
                        "                    \"id\": \"50\"," +
                        "                    \"name\": \"Visa Débito\"" +
                        "                }," +
                        "                \"productType\": \"CARD\"," +
                        "                \"subProductType\": {" +
                        "                    \"id\": \"DEBIT_CARD\"" +
                        "                }," +
                        "                \"isLegacy\": false," +
                        "                \"detail\": {" +
                        "                    \"specificAmounts\": [" +
                        "                        {" +
                        "                            \"id\": \"AVAILABLE_CURRENT_BALANCES\"," +
                        "                            \"amounts\": [" +
                        "                                {" +
                        "                                    \"amount\": 1000.00," +
                        "                                    \"currency\": \"COP\"" +
                        "                                }" +
                        "                            ]" +
                        "                        }," +
                        "                        {" +
                        "                            \"id\": \"GRANTED_CREDITS\"," +
                        "                            \"amounts\": [" +
                        "                                {" +
                        "                                    \"amount\": 2000.00," +
                        "                                    \"currency\": \"COP\"" +
                        "                                }" +
                        "                            ]" +
                        "                        }" +
                        "                    ]," +
                        "                    \"agreementContract\": \"00130073005000054496\"," +
                        "                    \"images\": [" +
                        "                        {" +
                        "                            \"id\": \"491268A0\"," +
                        "                            \"name\": \"{\\\"dc:modified\\\":\\\"2019-10-16T22:56:50.880+02:00\\\",\\\"dc:format\\\":\\\"image/png\\\",\\\"title\\\":\\\"co_A0_491268_19700101_front.png\\\"}\"," +
                        "                            \"url\": \"https://cardcovers-stage.caasbbva.com/colombia/co_A0_491268_19700101_front.png\"" +
                        "                        }" +
                        "                    ]," +
                        "                    \"physicalSupport\": {" +
                        "                        \"id\": \"NORMAL_PLASTIC\"" +
                        "                    }," +
                        "                    \"expirationDate\": \"2050-12-31T00:00:00.0-0500\"," +
                        "                    \"activations\": [" +
                        "                        {" +
                        "                            \"id\": \"ON_OFF\"," +
                        "                            \"isActive\": true" +
                        "                        }" +
                        "                    ]," +
                        "                    \"rewards\": [" +
                        "                        {" +
                        "                            \"id\": \"BANCOMER_POINTS\"," +
                        "                            \"nonMonetaryValue\": 1" +
                        "                        }" +
                        "                    ]," +
                        "                    \"indicators\": [" +
                        "                        {" +
                        "                            \"id\": \"BLOCKABLE\"," +
                        "                            \"isActive\": true" +
                        "                        }" +
                        "                    ]," +
                        "                    \"embossingDate\": \"2017-05-10T00:00:00.0-0500\"," +
                        "                    \"migrationType\": \"NORMAL\"," +
                        "                    \"status\": {" +
                        "                        \"id\": \"OPERATIVE\"," +
                        "                        \"name\": \"ACTIVADA\"" +
                        "                    }" +
                        "                }" +
                        "            }" +
                        "        ]" +
                        "    }" +
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

    public static JSONObject getAccountTransactionsAso() {

        JSONObject jsonObject = new JSONObject("{" +
                        "    \"data\": [" +
                        "        {" +
                        "            \"id\": \"000001846\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 1088067255.10" +
                        "            }," +
                        "            \"originAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": -4573064.00" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"id\": \"838D\"," +
                        "                \"name\": \"CARGO DOMICIL\"," +
                        "                \"internalCode\": {" +
                        "                    \"id\": \"CARGO DOMICILIACION\"," +
                        "                    \"name\": \"00143506  N0043506  C0026\"" +
                        "                }" +
                        "            }," +
                        "            \"operationDate\": \"2024-03-22T00:00:00.0-0500\"," +
                        "            \"accountedDate\": \"2024-03-22T00:00:00.0-0500\"," +
                        "            \"valuationDate\": \"2024-03-22T00:00:00.0-0500\"," +
                        "            \"financingType\": {" +
                        "                \"id\": \"NON_FINANCING\"," +
                        "                \"name\": \"Non Financing\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"id\": \"00130144000200934643\"," +
                        "                \"number\": \"00130144000200934643\"," +
                        "                \"numberType\": {" +
                        "                    \"id\": \"LIC\"," +
                        "                    \"name\": \"Local Internal Code\"" +
                        "                }" +
                        "            }," +
                        "            \"additionalInformation\": {" +
                        "                \"reference\": \"BANK\"," +
                        "                \"additionalData\": \"COL-BBVA\"," +
                        "                \"updatedBalance\": {" +
                        "                    \"currency\": \"COP\"," +
                        "                    \"amount\": 1088067255.10" +
                        "                }" +
                        "            }" +
                        "        }" +
                        "    ]," +
                        "    \"pagination\": {" +
                        "        \"links\": {" +
                        "            \"first\": \"/accounts/v0/accounts/00130144000200934643/transactions\"," +
                        "            \"last\": \"/accounts/v0/accounts/00130144000200934643/transactions?paginationKey=LAST\"," +
                        "            \"next\": \"/accounts/v0/accounts/00130144000200934643/transactions?paginationKey=000000002&pageSize=20\"" +
                        "        }," +
                        "        \"totalPages\": 2," +
                        "        \"pageSize\": 20" +
                        "    }" +
                        "}");
        return jsonObject;
    }

    public static JSONObject getCardTransactionsAso() {

        JSONObject jsonObject = new JSONObject("{" +
                        "    \"data\": [" +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"SETTLED\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"tags\": []," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"UNCATEGORIZED\"," +
                        "                \"id\": \"UNCATEGORIZED\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"CO0013540699h70kUQaYnN\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"50\"," +
                        "                    \"id\": \"PAN\"" +
                        "                }," +
                        "                \"id\": \"CO0013540699h70kUQaYnN\"" +
                        "            }," +
                        "            \"moneyFlow\": {" +
                        "                \"name\": \"INCOME\"," +
                        "                \"id\": \"INCOME\"" +
                        "            }," +
                        "            \"accountedDate\": \"2024-01-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-31T05:00:00Z\"," +
                        "            \"originAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 16243.13" +
                        "            }," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 16243.13" +
                        "            }," +
                        "            \"additionalInformation\": {}," +
                        "            \"operationDate\": \"2024-01-31T05:00:00Z\"," +
                        "            \"concept\": \"PAGO TARJ. CRED BARRIDO\"," +
                        "            \"id\": \"50000166340210000001\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"SETTLED\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"tags\": []," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"UNCATEGORIZED\"," +
                        "                \"id\": \"UNCATEGORIZED\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"CO0013540699h70kUQaYnN\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"50\"," +
                        "                    \"id\": \"PAN\"" +
                        "                }," +
                        "                \"id\": \"CO0013540699h70kUQaYnN\"" +
                        "            }," +
                        "            \"moneyFlow\": {" +
                        "                \"name\": \"INCOME\"," +
                        "                \"id\": \"INCOME\"" +
                        "            }," +
                        "            \"accountedDate\": \"2024-01-04T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-04T05:00:00Z\"," +
                        "            \"originAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 5875.08" +
                        "            }," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 5875.08" +
                        "            }," +
                        "            \"additionalInformation\": {}," +
                        "            \"operationDate\": \"2024-01-04T05:00:00Z\"," +
                        "            \"concept\": \"PAGO TARJ. CRED BARRIDO\"," +
                        "            \"id\": \"50000166340209000001\"" +
                        "        }" +
                        "    ]," +
                        "    \"pagination\": {" +
                        "        \"links\": {" +
                        "            \"first\": \"/cards/v1/cards/5406992949500331/transactions\"" +
                        "        }," +
                        "        \"page\": 1," +
                        "        \"totalPages\": 1," +
                        "        \"totalElements\": 2," +
                        "        \"pageSize\": 20" +
                        "    }" +
                        "}");
        return jsonObject;
    }

    public static JSONObject getLoanTransactionsAso() {

        JSONObject jsonObject = new JSONObject("{" +
                        "    \"data\": [" +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-02-29T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-02-29T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-02-29T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 662600.64" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-02-29-19.08.43.963567Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-02-29T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-02-29T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-02-29T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 8584.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-02-29-19.08.43.963044G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"CAPITAL PREPAGO\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"CAPITAL PREPAGO\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 482711.08" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-01-18-02.49.39.939738S2\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"INTERES PREPAGO\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"INTERES PREPAGO\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 171305.92" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-01-18-02.49.39.939737S1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS PREPAGO\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS PREPAGO\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 8924.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-01-18-02.49.39.939736S4\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS PREPAGO\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS PREPAGO\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-18T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 1.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-01-18-01.57.18.117549S4\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-01-02T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-01-02T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-02T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 663368.89" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-01-02-21.43.33.968925Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2024-01-02T05:00:00Z\"," +
                        "            \"accountedDate\": \"2024-01-02T05:00:00Z\"," +
                        "            \"valuationDate\": \"2024-01-02T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 9352.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2024-01-02-21.43.33.968457G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-11-30T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-11-30T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-11-30T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 663744.21" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-11-30-19.14.23.447380Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-11-30T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-11-30T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-11-30T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 9727.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-11-30-19.14.23.446754G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-10-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-10-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-10-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 664122.54" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-10-31-19.07.35.334574Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-10-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-10-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-10-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 10106.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-10-31-19.07.35.331886G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-10-03T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-10-03T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-10-03T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 665077.12" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-10-03-20.20.28.117946Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-10-03T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-10-03T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-10-03T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 10460.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-10-03-20.20.28.115721G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 364835.72" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-08-31-15.15.08.480970Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 300000.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-08-31-15.08.21.613614Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-08-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 10819.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-08-31-15.08.21.607994G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-07-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-07-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-07-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 665188.75" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-07-31-20.42.12.903994Z0\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"GASTOS MANUALES\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"GASTOS MANUALES\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-07-31T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-07-31T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-07-31T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 11172.00" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-07-31-20.42.12.903584G1\"" +
                        "        }," +
                        "        {" +
                        "            \"status\": {" +
                        "                \"name\": \"COMPLETADA\"," +
                        "                \"id\": \"SETTLED\"" +
                        "            }," +
                        "            \"transactionType\": {" +
                        "                \"name\": \"PAGO DE CUOTA\"," +
                        "                \"id\": \"LOAN_AMORTIZATION\"" +
                        "            }," +
                        "            \"contract\": {" +
                        "                \"number\": \"00130018009684013504\"," +
                        "                \"numberType\": {" +
                        "                    \"name\": \"LOCAL INTERNAL CODE\"," +
                        "                    \"id\": \"LIC\"" +
                        "                }," +
                        "                \"id\": \"00130018009684013504\"" +
                        "            }," +
                        "            \"concept\": \"PAGO DE CUOTA\"," +
                        "            \"transactionNumber\": \"00130018009684013504\"," +
                        "            \"operationDate\": \"2023-06-30T05:00:00Z\"," +
                        "            \"accountedDate\": \"2023-06-30T05:00:00Z\"," +
                        "            \"valuationDate\": \"2023-06-30T05:00:00Z\"," +
                        "            \"localAmount\": {" +
                        "                \"currency\": \"COP\"," +
                        "                \"amount\": 665537.16" +
                        "            }," +
                        "            \"financingType\": {" +
                        "                \"name\": \"NON_FINANCING\"," +
                        "                \"id\": \"NON_FINANCING\"" +
                        "            }," +
                        "            \"id\": \"2023-06-30-18.57.45.571553Z0\"" +
                        "        }" +
                        "    ]," +
                        "    \"pagination\": {" +
                        "        \"links\": {" +
                        "            \"first\": \"/loans/v1/loans/00130018009684013504/transactions\"," +
                        "            \"last\": \"/loans/v1/loans/00130018009684013504/transactions?paginationKey=LAST\"," +
                        "            \"next\": \"/loans/v1/loans/00130018009684013504/transactions?paginationKey=2&pageSize=20\"" +
                        "        }," +
                        "        \"page\": 1," +
                        "        \"pageSize\": 20" +
                        "    }" +
                        "}");
        return jsonObject;
    }

}
