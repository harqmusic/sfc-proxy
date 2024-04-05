package sfc.proxy.apisfc.service;

import org.json.JSONObject;

public class ContractsService {

public static JSONObject getContractsAso() {

        JSONObject jsonObject = new JSONObject("{" +
                        "   \"data\":[" +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001307770200124066\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"02\"," +
                        "            \"name\":\"CUENTA DE AHORROS LI\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"ACCOUNT\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001307770200124066\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"02\"," +
                        "                  \"name\":\"CUENTA DE AHORROS LI\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"0003\"," +
                        "                  \"name\":\"CUENTA DE AHORROS LI\"," +
                        "                  \"description\":\"CUENTA DE AHORROS LI\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307770200124066\"," +
                        "               \"number\":\"6570\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"02\"," +
                        "                  \"name\":\"TARJETA DEBITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"SR\"," +
                        "                  \"name\":\"RBM.BILLETERA\"," +
                        "                  \"description\":\"RBM.BILLETERA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"PRODUCTO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307770200124066\"," +
                        "               \"number\":\"6407\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"02\"," +
                        "                  \"name\":\"TARJETA DEBITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"ST\"," +
                        "                  \"name\":\"VISA.ELEC.SIN.TJ\"," +
                        "                  \"description\":\"VISA.ELEC.SIN.TJ\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"PRODUCTO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001307770200090978\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"02\"," +
                        "            \"name\":\"CUENTA DE AHORROS AF\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"ACCOUNT\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001307770200090978\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"02\"," +
                        "                  \"name\":\"CUENTA DE AHORROS AF\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"0007\"," +
                        "                  \"name\":\"CUENTA DE AHORROS AF\"," +
                        "                  \"description\":\"CUENTA DE AHORROS AF\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001304015000028808\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"50\"," +
                        "            \"name\":\"TARJETA CREDITO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"CARD\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001304015000028808\"," +
                        "               \"number\":\"0822\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"P1\"," +
                        "                  \"name\":\"VIS CORPCLIEXTER\"," +
                        "                  \"description\":\"VIS CORPCLIEXTER\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001307775000033598\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"50\"," +
                        "            \"name\":\"TARJETA CREDITO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"CARD\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0405\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"W1\"," +
                        "                  \"name\":\"VPLA.ELIT.AVIA\"," +
                        "                  \"description\":\"VPLA.ELIT.AVIA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"PRODUCTO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0579\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"W1\"," +
                        "                  \"name\":\"VPLA.ELIT.AVIA\"," +
                        "                  \"description\":\"VPLA.ELIT.AVIA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0652\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"W1\"," +
                        "                  \"name\":\"VPLA.ELIT.AVIA\"," +
                        "                  \"description\":\"VPLA.ELIT.AVIA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0991\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"W1\"," +
                        "                  \"name\":\"VPLA.ELIT.AVIA\"," +
                        "                  \"description\":\"VPLA.ELIT.AVIA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"1155\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"W1\"," +
                        "                  \"name\":\"VPLA.ELIT.AVIA\"," +
                        "                  \"description\":\"VPLA.ELIT.AVIA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"PRODUCTO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0324\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"55\"," +
                        "                  \"name\":\"TJ.VI.PLA.EMBBVA\"," +
                        "                  \"description\":\"TJ.VI.PLA.EMBBVA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0738\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"55\"," +
                        "                  \"name\":\"TJ.VI.PLA.EMBBVA\"," +
                        "                  \"description\":\"TJ.VI.PLA.EMBBVA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"0811\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"55\"," +
                        "                  \"name\":\"TJ.VI.PLA.EMBBVA\"," +
                        "                  \"description\":\"TJ.VI.PLA.EMBBVA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"PRODUCTO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"1074\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"55\"," +
                        "                  \"name\":\"TJ.VI.PLA.EMBBVA\"," +
                        "                  \"description\":\"TJ.VI.PLA.EMBBVA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"BLOCKED\"," +
                        "                  \"description\":\"PRODUCTO BLOQUEADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }," +
                        "            {" +
                        "               \"id\":\"001307775000033598\"," +
                        "               \"number\":\"1231\"," +
                        "               \"numberType\":{" +
                        "                  \"id\":\"PAN\"" +
                        "               }," +
                        "               \"product\":{" +
                        "                  \"id\":\"50\"," +
                        "                  \"name\":\"TARJETA CREDITO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"55\"," +
                        "                  \"name\":\"TJ.VI.PLA.EMBBVA\"," +
                        "                  \"description\":\"TJ.VI.PLA.EMBBVA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"PRODUCTO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001307777000018342\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"70\"," +
                        "            \"name\":\"FONDO DIGITAL BBVA\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"DEPOSIT\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001307777000018342\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"70\"," +
                        "                  \"name\":\"FONDO DIGITAL BBVA\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"FDIG\"," +
                        "                  \"name\":\"FONDO DIGITAL BBVA\"," +
                        "                  \"description\":\"FONDO DIGITAL BBVA\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300349670134619\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA STANDARD\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300349670134619\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA STANDARD\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"1564\"," +
                        "                  \"name\":\"LIBRANZA STANDARD\"," +
                        "                  \"description\":\"LIBRANZA STANDARD\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301269690011865\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA STANDARD\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301269690011865\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA STANDARD\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"1564\"," +
                        "                  \"name\":\"LIBRANZA STANDARD\"," +
                        "                  \"description\":\"LIBRANZA STANDARD\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301269690011881\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA STANDARD\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301269690011881\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA STANDARD\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"1564\"," +
                        "                  \"name\":\"LIBRANZA STANDARD\"," +
                        "                  \"description\":\"LIBRANZA STANDARD\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684019170\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684019170\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"2558\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "                  \"description\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300349670133447\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300349670133447\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"2558\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "                  \"description\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300349670133454\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300349670133454\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"2558\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "                  \"description\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300739699105380\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300739699105380\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"2558\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "                  \"description\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660012294\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660012294\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"2558\"," +
                        "                  \"name\":\"LIBRE INVERSIóN 12 C\"," +
                        "                  \"description\":\"LIBRE INVERSIóN 12 C\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660012591\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"VEHNVOCPCOMB100%GRA6\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660012591\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"VEHNVOCPCOMB100%GRA6\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"3213\"," +
                        "                  \"name\":\"VEHNVOCPCOMB100%GRA6\"," +
                        "                  \"description\":\"VEHNVOCPCOMB100%GRA6\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660013078\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"VEHNVOCPCOMB100%GRA6\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660013078\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"VEHNVOCPCOMB100%GRA6\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"3213\"," +
                        "                  \"name\":\"VEHNVOCPCOMB100%GRA6\"," +
                        "                  \"description\":\"VEHNVOCPCOMB100%GRA6\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660013367\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"VEHNVOCPCOMB100%GRA6\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660013367\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"VEHNVOCPCOMB100%GRA6\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"3213\"," +
                        "                  \"name\":\"VEHNVOCPCOMB100%GRA6\"," +
                        "                  \"description\":\"VEHNVOCPCOMB100%GRA6\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660013151\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRE INVERSIóN CLáS\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660013151\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRE INVERSIóN CLáS\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"3261\"," +
                        "                  \"name\":\"LIBRE INVERSIóN CLáS\"," +
                        "                  \"description\":\"LIBRE INVERSIóN CLáS\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660013045\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"RCI - NUEVO 12C 100%\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660013045\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"RCI - NUEVO 12C 100%\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"3459\"," +
                        "                  \"name\":\"RCI - NUEVO 12C 100%\"," +
                        "                  \"description\":\"RCI - NUEVO 12C 100%\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684016572\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL EST\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684016572\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL EST\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4126\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL EST\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL EST\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690029843\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL EST\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690029843\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL EST\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4126\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL EST\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL EST\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690029975\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690029975\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690030007\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690030007\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690030015\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690030015\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690030031\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690030031\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690030049\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690030049\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690030205\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690030205\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690033506\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690033506\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189690033514\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189690033514\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4127\"," +
                        "                  \"name\":\"LIBRANZA DIGITAL RET\"," +
                        "                  \"description\":\"LIBRANZA DIGITAL RET\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660012856\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CF TRADICIONAL NUEVO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660012856\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CF TRADICIONAL NUEVO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4130\"," +
                        "                  \"name\":\"CF TRADICIONAL NUEVO\"," +
                        "                  \"description\":\"CF TRADICIONAL NUEVO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660012757\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CF TRADICIONAL NUEVO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660012757\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CF TRADICIONAL NUEVO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"4142\"," +
                        "                  \"name\":\"CF TRADICIONAL NUEVO\"," +
                        "                  \"description\":\"CF TRADICIONAL NUEVO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018271\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CREDITO VIVIENDA CUO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018271\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CUO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5071\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CUO\"," +
                        "                  \"description\":\"CREDITO VIVIENDA CUO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018289\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CREDITO VIVIENDA CUO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018289\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CUO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5071\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CUO\"," +
                        "                  \"description\":\"CREDITO VIVIENDA CUO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018503\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CREDITO VIVIENDA CUO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018503\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CUO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5071\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CUO\"," +
                        "                  \"description\":\"CREDITO VIVIENDA CUO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018321\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CREDITO VIVIENDA CAP\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018321\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CAP\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5072\"," +
                        "                  \"name\":\"CREDITO VIVIENDA CAP\"," +
                        "                  \"description\":\"CREDITO VIVIENDA CAP\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018339\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018339\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5099\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "                  \"description\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660011239\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660011239\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5099\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "                  \"description\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660011536\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660011536\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5099\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "                  \"description\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660012724\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660012724\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5099\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "                  \"description\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589660013805\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589660013805\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5099\"," +
                        "                  \"name\":\"PESOS HIP. TRAD 15 A\"," +
                        "                  \"description\":\"PESOS HIP. TRAD 15 A\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001307779600135443\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"HIPNOVIS PESOS FUNCI\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001307779600135443\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"HIPNOVIS PESOS FUNCI\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5490\"," +
                        "                  \"name\":\"HIPNOVIS PESOS FUNCI\"," +
                        "                  \"description\":\"HIPNOVIS PESOS FUNCI\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589695020763\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"HIPOTECARIO COBERTUR\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589695020763\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"HIPOTECARIO COBERTUR\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5545\"," +
                        "                  \"name\":\"HIPOTECARIO COBERTUR\"," +
                        "                  \"description\":\"HIPOTECARIO COBERTUR\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018297\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CRéDITO HIPOTECARIO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"ACTIVE\"," +
                        "            \"description\":\"CONTRATO ACTIVO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018297\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CRéDITO HIPOTECARIO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5925\"," +
                        "                  \"name\":\"CRéDITO HIPOTECARIO\"," +
                        "                  \"description\":\"CRéDITO HIPOTECARIO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"ACTIVE\"," +
                        "                  \"description\":\"CONTRATO ACTIVO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300189684018305\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"CRéDITO HIPOTECARIO\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300189684018305\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"CRéDITO HIPOTECARIO\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5928\"," +
                        "                  \"name\":\"CRéDITO HIPOTECARIO\"," +
                        "                  \"description\":\"CRéDITO HIPOTECARIO\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300739699106412\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LEASING HABITACIONAL\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300739699106412\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LEASING HABITACIONAL\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5944\"," +
                        "                  \"name\":\"LEASING HABITACIONAL\"," +
                        "                  \"description\":\"LEASING HABITACIONAL\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300739699107055\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LEASING HABITACIONAL\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300739699107055\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LEASING HABITACIONAL\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5946\"," +
                        "                  \"name\":\"LEASING HABITACIONAL\"," +
                        "                  \"description\":\"LEASING HABITACIONAL\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001300739699106222\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LEASING HABIT. NOFAM\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001300739699106222\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LEASING HABIT. NOFAM\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"5970\"," +
                        "                  \"name\":\"LEASING HABIT. NOFAM\"," +
                        "                  \"description\":\"LEASING HABIT. NOFAM\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }," +
                        "      {" +
                        "         \"id\":\"01794196\"," +
                        "         \"number\":\"001301589695019351\"," +
                        "         \"numberType\":{" +
                        "            \"id\":\"CCC\"" +
                        "         }," +
                        "         \"product\":{" +
                        "            \"id\":\"96\"," +
                        "            \"name\":\"LH NOFAM COLEX CXI F\"," +
                        "            \"productType\":{" +
                        "               \"id\":\"LOAN\"" +
                        "            }" +
                        "         }," +
                        "         \"status\":{" +
                        "            \"id\":\"CANCELED\"," +
                        "            \"description\":\"CONTRATO CANCELADO\"" +
                        "         }," +
                        "         \"relatedContracts\":[" +
                        "            {" +
                        "               \"id\":\"001301589695019351\"," +
                        "               \"product\":{" +
                        "                  \"id\":\"96\"," +
                        "                  \"name\":\"LH NOFAM COLEX CXI F\"" +
                        "               }," +
                        "               \"subproduct\":{" +
                        "                  \"id\":\"6002\"," +
                        "                  \"name\":\"LH NOFAM COLEX CXI F\"," +
                        "                  \"description\":\"LH NOFAM COLEX CXI F\"" +
                        "               }," +
                        "               \"status\":{" +
                        "                  \"id\":\"CANCELED\"," +
                        "                  \"description\":\"CONTRATO CANCELADO\"" +
                        "               }," +
                        "               \"relationType\":{" +
                        "                  \"id\":\"LINKED WITH\"," +
                        "                  \"name\":\"LINKED WITH\"" +
                        "               }" +
                        "            }" +
                        "         ]" +
                        "      }" +
                        "   ]" +
                        "}");
        return jsonObject;
    }

}
