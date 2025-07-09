<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  
<%@page import="java.io.File"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="javax.naming.Context" %>
<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.naming.NamingException" %>
<%@page import="javax.naming.NamingEnumeration" %>
<%@page import="javax.naming.NameClassPair" %>

<%
	try {
	  
	Object ERRORERILEVATO = "";  
	  
	Context initCtx = new InitialContext();
	Context ctx = (Context) initCtx.lookup("java:/comp/env");
	Object REMOTEWSDM = ctx.lookup("REMOTEWSDM");

	Object IRIDE_WSPROTOCOLLO = "";
	Object IRIDE_WSFASCICOLO = "";
	Object IRIDE_WSATTO = "";
	Object IRIDE_CODICEAMMINISTRAZIONE = "";
	Object IRIDE_CODICEAOO = "";
	if (REMOTEWSDM.equals("IRIDE")) {
		try {
			IRIDE_WSPROTOCOLLO = ctx.lookup("IRIDE_WSPROTOCOLLO");
			IRIDE_WSFASCICOLO = ctx.lookup("IRIDE_WSFASCICOLO");
			IRIDE_WSATTO = ctx.lookup("IRIDE_WSATTO");
			IRIDE_CODICEAMMINISTRAZIONE = ctx.lookup("IRIDE_CODICEAMMINISTRAZIONE");
			IRIDE_CODICEAOO = ctx.lookup("IRIDE_CODICEAOO");
		} catch (Throwable ex) {
			ERRORERILEVATO = ex.toString();
		}
	}
	
	Object JIRIDE_WSPROTOCOLLO = "";
	Object JIRIDE_WSFASCICOLO = "";
	Object JIRIDE_WSATTO = "";
	Object JIRIDE_WSPOSTA = "";
	Object JIRIDE_CODICEAMMINISTRAZIONE = "";
	Object JIRIDE_CODICEAOO = "";
	Object JIRIDE_AGGIORNAANAGRAFICHE = "N";
	Object JIRIDE_UTRWSSGATEWAY_WS = "";
	Object JIRIDE_UTRWSSGATEWAY_ALIAS = "";
	Object JIRIDE_WSTABELLE = "";
	Object JIRIDE_SENZALOG = "";
	Object JIRIDE_MOTIVAZIONE = "";
	Object JIRIDE_ESTREMIPROVVAUT = "";
	Object JIRIDE_ACCOUNT_EMAIL_WS = "";
	Object JIRIDE_TICKET = "";
	Object JIRIDE_DOWNLOAD_ALLEGATI_REPWSSGATEWAY = "";
	Object JIRIDE_REPWSSGATEWAY_WS = "";
	Object JIRIDE_REPWSSGATEWAY_ALIAS = "";
	Object JIRIDE_PROTOCOLLO_MODO_FASCICOLAZIONE = "";
	
	if (REMOTEWSDM.equals("JIRIDE")) {
		try {
			JIRIDE_WSPROTOCOLLO = ctx.lookup("JIRIDE_WSPROTOCOLLO");
			JIRIDE_WSFASCICOLO = ctx.lookup("JIRIDE_WSFASCICOLO");
			JIRIDE_WSATTO = ctx.lookup("JIRIDE_WSATTO");
			JIRIDE_WSPOSTA = ctx.lookup("JIRIDE_WSPOSTA");
			JIRIDE_CODICEAMMINISTRAZIONE = ctx.lookup("JIRIDE_CODICEAMMINISTRAZIONE");
			JIRIDE_CODICEAOO = ctx.lookup("JIRIDE_CODICEAOO");
		} catch (Throwable ex) {
		  	ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
		
		try {
		  JIRIDE_AGGIORNAANAGRAFICHE = ctx.lookup("JIRIDE_AGGIORNAANAGRAFICHE");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_UTRWSSGATEWAY_WS = ctx.lookup("JIRIDE_UTRWSSGATEWAY_WS");
		} catch (Throwable ex) {
		  
		}

		try {
		  JIRIDE_UTRWSSGATEWAY_ALIAS = ctx.lookup("JIRIDE_UTRWSSGATEWAY_ALIAS");
		} catch (Throwable ex) {
	
		}

		try {
		  JIRIDE_WSTABELLE = ctx.lookup("JIRIDE_WSTABELLE");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_SENZALOG = ctx.lookup("JIRIDE_SENZALOG");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_MOTIVAZIONE = ctx.lookup("JIRIDE_MOTIVAZIONE");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_ESTREMIPROVVAUT = ctx.lookup("JIRIDE_ESTREMIPROVVAUT");
		} catch (Throwable ex) {

		}

		
		try {
		  JIRIDE_ACCOUNT_EMAIL_WS = ctx.lookup("JIRIDE_ACCOUNT_EMAIL_WS");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_TICKET = ctx.lookup("JIRIDE_TICKET");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_DOWNLOAD_ALLEGATI_REPWSSGATEWAY = ctx.lookup("JIRIDE_DOWNLOAD_ALLEGATI_REPWSSGATEWAY");
		} catch (Throwable ex) {
		  JIRIDE_DOWNLOAD_ALLEGATI_REPWSSGATEWAY = "S";
		}
		
		try {
		  JIRIDE_REPWSSGATEWAY_WS = ctx.lookup("JIRIDE_REPWSSGATEWAY_WS");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_REPWSSGATEWAY_ALIAS = ctx.lookup("JIRIDE_REPWSSGATEWAY_ALIAS");
		} catch (Throwable ex) {

		}
		
		try {
		  JIRIDE_PROTOCOLLO_MODO_FASCICOLAZIONE = ctx.lookup("JIRIDE_PROTOCOLLO_MODO_FASCICOLAZIONE");
		} catch (Throwable ex) {
		  JIRIDE_PROTOCOLLO_MODO_FASCICOLAZIONE = "DIRETTA";
		}
		
	}
	
	Object PALEO_WS = "";
	Object PALEO_WSSEC = "";
	Object PALEO_CODICEAMMINISTRAZIONE = "";
	Object PALEO_DOCUMENTOPRIVATO = "true";
	
	Object PALEO_TA = "false";
	Object PALEO_TA_OP_RUOLO = "";
	Object PALEO_TA_OP_NOME = "";
	Object PALEO_TA_OP_COGNOME = "";
	Object PALEO_TA_OP_CODICEUO = "";
	Object PALEO_TA_TIPO = "";
	
	if (REMOTEWSDM.equals("PALEO")) {
		try {
		  	PALEO_WS = ctx.lookup("PALEO_WS");
			PALEO_WSSEC = ctx.lookup("PALEO_WSSEC");
			PALEO_CODICEAMMINISTRAZIONE = ctx.lookup("PALEO_CODICEAMMINISTRAZIONE");
			PALEO_DOCUMENTOPRIVATO = ctx.lookup("PALEO_DOCUMENTOPRIVATO");
			
			PALEO_TA = ctx.lookup("PALEO_TA");
			PALEO_TA_OP_RUOLO = ctx.lookup("PALEO_TA_OP_RUOLO");
			PALEO_TA_OP_NOME = ctx.lookup("PALEO_TA_OP_NOME");
			PALEO_TA_OP_COGNOME = ctx.lookup("PALEO_TA_OP_COGNOME");
			PALEO_TA_OP_CODICEUO = ctx.lookup("PALEO_TA_OP_CODICEUO");
			PALEO_TA_TIPO = ctx.lookup("PALEO_TA_TIPO");
			
		} catch (Throwable ex) {
		  	ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}


	Object ENGINEERING_WSINSERIMENTOFASC = "";
	Object ENGINEERING_WSPROTOCOLLAZIONE = "";
	Object ENGINEERING_WSRICERCAFASCICOLO = "";
	Object ENGINEERING_WSRICERCAPROTOCOLLO = "";
	Object ENGINEERING_CODICEENTE = "";

	if (REMOTEWSDM.equals("ENGINEERING")) {
		try {
			ENGINEERING_WSINSERIMENTOFASC = ctx.lookup("ENGINEERING_WSINSERIMENTOFASC");
			ENGINEERING_WSPROTOCOLLAZIONE = ctx.lookup("ENGINEERING_WSPROTOCOLLAZIONE");
			ENGINEERING_WSRICERCAFASCICOLO = ctx.lookup("ENGINEERING_WSRICERCAFASCICOLO");
			ENGINEERING_WSRICERCAPROTOCOLLO = ctx.lookup("ENGINEERING_WSRICERCAPROTOCOLLO");
			ENGINEERING_CODICEENTE = ctx.lookup("ENGINEERING_CODICEENTE");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object ENGINEERINGDOC_WSADDUD = "";
	Object ENGINEERINGDOC_WSGETMETADATAUD = "";
	Object ENGINEERINGDOC_WSEXTRACTMULTI = "";
	Object ENGINEERINGDOC_WSADDFOLDER = "";
	Object ENGINEERINGDOC_WSGETMETADATAFOLDER = "";
	Object ENGINEERINGDOC_WSTROVADOCFOLDER = "";
	Object ENGINEERINGDOC_WSTROVAINORGANIGRAMMA = "";
	
	Object ENGINEERINGDOC_ADDFOLDER_GENERICS12 = "";
	Object ENGINEERINGDOC_ADDFOLDER_STRUTTURA = "";
	
	Object ENGINEERINGDOC_CODICEAPPLICAZIONE = "";
	Object ENGINEERINGDOC_ISTANZAAPPLICAZIONE = "";
	
	if (REMOTEWSDM.equals("ENGINEERINGDOC")) {
		try {
			ENGINEERINGDOC_WSADDUD = ctx.lookup("ENGINEERINGDOC_WSADDUD");
			ENGINEERINGDOC_WSGETMETADATAUD = ctx.lookup("ENGINEERINGDOC_WSGETMETADATAUD");
			ENGINEERINGDOC_WSEXTRACTMULTI = ctx.lookup("ENGINEERINGDOC_WSEXTRACTMULTI");
			ENGINEERINGDOC_WSADDFOLDER = ctx.lookup("ENGINEERINGDOC_WSADDFOLDER");
			ENGINEERINGDOC_WSGETMETADATAFOLDER = ctx.lookup("ENGINEERINGDOC_WSGETMETADATAFOLDER");
			ENGINEERINGDOC_WSTROVADOCFOLDER = ctx.lookup("ENGINEERINGDOC_WSTROVADOCFOLDER");
			
			try {
			ENGINEERINGDOC_WSTROVAINORGANIGRAMMA = ctx.lookup("ENGINEERINGDOC_WSTROVAINORGANIGRAMMA");
			} catch (Throwable ex) {

			}
			
			ENGINEERINGDOC_CODICEAPPLICAZIONE = ctx.lookup("ENGINEERINGDOC_CODICEAPPLICAZIONE");
			ENGINEERINGDOC_ISTANZAAPPLICAZIONE = ctx.lookup("ENGINEERINGDOC_ISTANZAAPPLICAZIONE");
			
			try {
			  ENGINEERINGDOC_ADDFOLDER_GENERICS12 = ctx.lookup("ENGINEERINGDOC_ADDFOLDER_GENERICS12");
			} catch (Throwable ex) {

			}
			
			try {
			  ENGINEERINGDOC_ADDFOLDER_STRUTTURA = ctx.lookup("ENGINEERINGDOC_ADDFOLDER_STRUTTURA");
			} catch (Throwable ex) {

			}
			
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object ARCHIFLOW_WS_LOGIN = "";
	Object ARCHIFLOW_WS_CARD = "";
	Object ARCHIFLOW_WS_FOLDER = "";
	Object ARCHIFLOW_WS_POSTING = "";
	Object ARCHIFLOW_WS_LOGIN_DOMAIN = "Archiflow";

	if (REMOTEWSDM.equals("ARCHIFLOW") || REMOTEWSDM.equals("ARCHIFLOW10") || REMOTEWSDM.equals("ARCHIFLOW10.ARCHIFLOW")) {
		try {
			ARCHIFLOW_WS_LOGIN = ctx.lookup("ARCHIFLOW_WS_LOGIN");
			ARCHIFLOW_WS_CARD = ctx.lookup("ARCHIFLOW_WS_CARD");
			ARCHIFLOW_WS_FOLDER = ctx.lookup("ARCHIFLOW_WS_FOLDER");
			ARCHIFLOW_WS_POSTING = ctx.lookup("ARCHIFLOW_WS_POSTING");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}

		try {
		  ARCHIFLOW_WS_LOGIN_DOMAIN = ctx.lookup("ARCHIFLOW_WS_LOGIN_DOMAIN");
		} catch (Throwable ex) {

		}

	}
	

	
	Object ARCHIFLOWFA_WS_LOGIN = "";
	Object ARCHIFLOWFA_WS_LOGIN_DOMAIN = "";	
	Object ARCHIFLOWFA_WS_CARD = "";
	Object ARCHIFLOWFA_WS_FOLDER = "";
	Object ARCHIFLOWFA_WS_FOLDER_UTENTE_ID = "";
	Object ARCHIFLOWFA_WS_POSTING = "";
	Object ARCHIFLOWFA_MODO_INVIO_PEC = "";
	
	if (REMOTEWSDM.equals("ARCHIFLOWFA")) {
		try {
			ARCHIFLOWFA_WS_LOGIN = ctx.lookup("ARCHIFLOWFA_WS_LOGIN");
			ARCHIFLOWFA_WS_LOGIN_DOMAIN = ctx.lookup("ARCHIFLOWFA_WS_LOGIN_DOMAIN");
			ARCHIFLOWFA_WS_CARD = ctx.lookup("ARCHIFLOWFA_WS_CARD");
			ARCHIFLOWFA_WS_FOLDER = ctx.lookup("ARCHIFLOWFA_WS_FOLDER");
			ARCHIFLOWFA_WS_FOLDER_UTENTE_ID = ctx.lookup("ARCHIFLOWFA_WS_FOLDER_UTENTE_ID");
			ARCHIFLOWFA_WS_POSTING = ctx.lookup("ARCHIFLOWFA_WS_POSTING");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	if (REMOTEWSDM.equals("ARCHIFLOWFA")) {
		try {
			ARCHIFLOWFA_MODO_INVIO_PEC = ctx.lookup("ARCHIFLOWFA_MODO_INVIO_PEC");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object TITULUS4UGOV_WS = "";
	Object TITULUS4DEPOSITORY_WS = "";
	Object TITULUSACL4_WS = "";
	if (REMOTEWSDM.equals("TITULUS")) {
		try {
			TITULUS4UGOV_WS = ctx.lookup("TITULUS4UGOV_WS");
			TITULUS4DEPOSITORY_WS = ctx.lookup("TITULUS4DEPOSITORY_WS");
			TITULUSACL4_WS = ctx.lookup("TITULUSACL4_WS");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object SMAT_WS = "";
	if (REMOTEWSDM.equals("SMAT")) {
		try {
			SMAT_WS = ctx.lookup("SMAT_WS");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}

	Object FOLIUM_PROTOCOLLA_WS = "";
	Object FOLIUM_SALVA_DOCUMENTO_WS = "";
	Object FOLIUM_ESEGUI_SALVA_DOCUMENTO = "SI";
	if (REMOTEWSDM.equals("FOLIUM")) {
		try {
			FOLIUM_PROTOCOLLA_WS = ctx.lookup("FOLIUM_PROTOCOLLA_WS");
			FOLIUM_SALVA_DOCUMENTO_WS = ctx.lookup("FOLIUM_SALVA_DOCUMENTO_WS");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
		
		try {
		  FOLIUM_ESEGUI_SALVA_DOCUMENTO = ctx.lookup("FOLIUM_ESEGUI_SALVA_DOCUMENTO");
		} catch (Throwable ex) {

		}
	}

	Object SISPI_PROTOCOLLO = "";
	Object SISPI_CLIENTID = "";
	if (REMOTEWSDM.equals("SISPI")) {
		try {
			SISPI_PROTOCOLLO = ctx.lookup("SISPI_PROTOCOLLO");
			SISPI_CLIENTID = ctx.lookup("SISPI_CLIENTID");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object EASYDOC_SOAP_WS = "";
	Object EASYDOC_SOAP_ADMIN_WS = "";
	Object EASYDOC_SOAP_MAIL_WS = "";
	Object EASYDOC_REST_WS = "";
	Object EASYDOC_PARAMETRI_AOO = "";
	Object EASYDOC_PARAMETRI_COMPANYCODE = "";
	Object EASYDOC_PARAMETRI_ADDITIONALASSIGNEES = "";
	Object EASYDOC_PARAMETRI_DOMAINCODE = "";
	Object EASYDOC_EXTERNALSENDER_TYPE = "";
	Object EASYDOC_INTERNALSENDER_TYPE = "";
	Object EASYDOC_MAILCFGCODE_PROVVISORIO = "";
	
	if (REMOTEWSDM.equals("EASYDOC")) {
		try {
			EASYDOC_SOAP_WS = ctx.lookup("EASYDOC_SOAP_WS");
			EASYDOC_SOAP_ADMIN_WS = ctx.lookup("EASYDOC_SOAP_ADMIN_WS");
			EASYDOC_SOAP_MAIL_WS = ctx.lookup("EASYDOC_SOAP_MAIL_WS");
			EASYDOC_REST_WS = ctx.lookup("EASYDOC_REST_WS");
			EASYDOC_PARAMETRI_AOO = ctx.lookup("EASYDOC_PARAMETRI_AOO");
			EASYDOC_PARAMETRI_COMPANYCODE = ctx.lookup("EASYDOC_PARAMETRI_COMPANYCODE");
			EASYDOC_PARAMETRI_ADDITIONALASSIGNEES = ctx.lookup("EASYDOC_PARAMETRI_ADDITIONALASSIGNEES");
			EASYDOC_PARAMETRI_DOMAINCODE = ctx.lookup("EASYDOC_PARAMETRI_DOMAINCODE");
			EASYDOC_EXTERNALSENDER_TYPE = ctx.lookup("EASYDOC_EXTERNALSENDER_TYPE");
			EASYDOC_INTERNALSENDER_TYPE = ctx.lookup("EASYDOC_INTERNALSENDER_TYPE");
			EASYDOC_MAILCFGCODE_PROVVISORIO = ctx.lookup("EASYDOC_MAILCFGCODE_PROVVISORIO");
			
		} catch (Throwable ex) {
				ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
		
		
	Object PRISMA_DOCAREAPROTO = "";
	Object PRISMA_DOCAREAEXTENDED = "";
	Object PRISMA_DUCDSERVICES = "";
	Object PRISMA_DMS_ATTACH = "";
	Object PRISMA_DENOMINAZIONE_AMMINISTRAZIONE = "";
	Object PRISMA_CODICE_AMMINISTRAZIONE = "";
	Object PRISMA_EMAIL_AMMINISTRAZIONE = "";
	Object PRISMA_CODICE_AOO = "";
	Object PRISMA_NOME_APPLICATIVO = "";
	Object PRISMA_TIPO_SMISTAMENTO = "";
	Object PRISMA_TIPO_DOCUMENTO_PER_REGISTRO = "";
	Object PRISMA_TIPO_REGISTRO = "";
	Object PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI = "";
	Object PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO = "";
	Object PRISMA_ESEGUI_SMISTAMENTO = "SI";
	
	if (REMOTEWSDM.equals("PRISMA")) {
		try {
		  PRISMA_DOCAREAPROTO = ctx.lookup("PRISMA_DOCAREAPROTO");
		  PRISMA_DOCAREAEXTENDED = ctx.lookup("PRISMA_DOCAREAEXTENDED");
		  PRISMA_DUCDSERVICES = ctx.lookup("PRISMA_DUCDSERVICES");
		  PRISMA_DMS_ATTACH = ctx.lookup("PRISMA_DMS_ATTACH");
		  PRISMA_DENOMINAZIONE_AMMINISTRAZIONE = ctx.lookup("PRISMA_DENOMINAZIONE_AMMINISTRAZIONE");
		  PRISMA_CODICE_AMMINISTRAZIONE = ctx.lookup("PRISMA_CODICE_AMMINISTRAZIONE");
		  PRISMA_EMAIL_AMMINISTRAZIONE = ctx.lookup("PRISMA_EMAIL_AMMINISTRAZIONE");
		  PRISMA_CODICE_AOO = ctx.lookup("PRISMA_CODICE_AOO");
		  PRISMA_NOME_APPLICATIVO = ctx.lookup("PRISMA_NOME_APPLICATIVO");
		  PRISMA_TIPO_SMISTAMENTO = ctx.lookup("PRISMA_TIPO_SMISTAMENTO");
		  PRISMA_TIPO_DOCUMENTO_PER_REGISTRO = ctx.lookup("PRISMA_TIPO_DOCUMENTO_PER_REGISTRO");
		  PRISMA_TIPO_REGISTRO = ctx.lookup("PRISMA_TIPO_REGISTRO");
		  PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI = ctx.lookup("PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI");
		  PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO = ctx.lookup("PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
		
		try {
		  PRISMA_ESEGUI_SMISTAMENTO = ctx.lookup("PRISMA_ESEGUI_SMISTAMENTO");
		} catch (Throwable ex) {

		}
		
	}
	
	Object INFOR_JPROTOCOLLO_ENDPOINT = "";
	Object INFOR_JPROTOCOLLOGEN_ENDPOINT = "";
	if (REMOTEWSDM.equals("INFOR")) {
		try {
		  INFOR_JPROTOCOLLO_ENDPOINT = ctx.lookup("INFOR_JPROTOCOLLO_ENDPOINT");
		  INFOR_JPROTOCOLLOGEN_ENDPOINT = ctx.lookup("INFOR_JPROTOCOLLOGEN_ENDPOINT");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
		
	Object URBI_PROTOCOLLO_URL = "";
	Object URBI_IDAOO = "";
	Object URBI_UTENTE_REGISTRATORE = "";
	Object URBI_PARTENZA_TIPO_MEZZO = "";
	Object URBI_ARRIVO_TIPO_MEZZO = "";
	Object URBI_PARTENZA_UFFICIO_MITTENTE = "";
	Object URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE = "";
	Object URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE = "";
	Object URBI_PARTENZA_INVIO_IMMEDIATO_PEC = "";
	Object URBI_PARTENZA_CLASSIFICAZIONE = "";
	Object URBI_ARRIVO_UFFICIO_DESTINATARIO = "";
	Object URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE = "";
	Object URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI = "";
	Object URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE = "";
	Object URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE = "";
	Object URBI_ARRIVO_CLASSIFICAZIONE = "";

	if (REMOTEWSDM.equals("URBI")) {
		try {
			URBI_PROTOCOLLO_URL = ctx.lookup("URBI_PROTOCOLLO_URL");
			URBI_IDAOO = ctx.lookup("URBI_IDAOO");
			URBI_UTENTE_REGISTRATORE = ctx.lookup("URBI_UTENTE_REGISTRATORE");
			URBI_PARTENZA_TIPO_MEZZO = ctx.lookup("URBI_PARTENZA_TIPO_MEZZO");
			URBI_ARRIVO_TIPO_MEZZO = ctx.lookup("URBI_ARRIVO_TIPO_MEZZO");
			URBI_PARTENZA_UFFICIO_MITTENTE = ctx.lookup("URBI_PARTENZA_UFFICIO_MITTENTE");
			URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE = ctx.lookup("URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE");
			URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE = ctx.lookup("URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE");
			URBI_PARTENZA_INVIO_IMMEDIATO_PEC = ctx.lookup("URBI_PARTENZA_INVIO_IMMEDIATO_PEC");
			URBI_PARTENZA_CLASSIFICAZIONE = ctx.lookup("URBI_PARTENZA_CLASSIFICAZIONE");
			URBI_ARRIVO_UFFICIO_DESTINATARIO = ctx.lookup("URBI_ARRIVO_UFFICIO_DESTINATARIO");
			URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE = ctx.lookup("URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE");
			URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI = ctx.lookup("URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI");
			URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE = ctx.lookup("URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE");
			URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE = ctx.lookup("URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE");
			URBI_ARRIVO_CLASSIFICAZIONE = ctx.lookup("URBI_ARRIVO_CLASSIFICAZIONE");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object PROTSERVICE_ENDPOINT = "";
	Object PROTSERVICE_RISERVATO = "";
	Object PROTSERVICE_REGISTRO = "";
	if (REMOTEWSDM.equals("PROTSERVICE")) {
		try {
		  PROTSERVICE_ENDPOINT = ctx.lookup("PROTSERVICE_ENDPOINT");
		  PROTSERVICE_RISERVATO = ctx.lookup("PROTSERVICE_RISERVATO");
		  PROTSERVICE_REGISTRO = ctx.lookup("PROTSERVICE_REGISTRO");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	
	Object JPROTOCOL_WSPROTOCOLLASILENTE = "";
	Object JPROTOCOL_WSELENCODOCUMENTI = "";
	Object JPROTOCOL_WSSENDMAIL = "";
	Object JPROTOCOL_WSFASCICOLI = "";
	Object JPROTOCOL_TOKEN = "";
	Object JPROTOCOL_PROTOCOLLATORE_ENTRATA = "";
	Object JPROTOCOL_PROTOCOLLATORE_USCITA = "";
	Object JPROTOCOL_PROTOCOLLATORE_INTERNO = "";
	Object JPROTOCOL_CODUFFMITTINTERNO = "";
	Object JPROTOCOL_TIPOLOGIADOC = "";
	Object JPROTOCOL_CATDOC = "";
	Object JPROTOCOL_CODICEMAILSERVER = "";
	Object JPROTOCOL_GRADO_RISERVATEZZA = "";
	Object JPROTOCOL_MITTDEST_TIPOLOGIA = "";


	if (REMOTEWSDM.equals("JPROTOCOL")) {
		try {
		  JPROTOCOL_WSPROTOCOLLASILENTE = ctx.lookup("JPROTOCOL_WSPROTOCOLLASILENTE");
		  JPROTOCOL_WSELENCODOCUMENTI = ctx.lookup("JPROTOCOL_WSELENCODOCUMENTI");
		  JPROTOCOL_WSSENDMAIL = ctx.lookup("JPROTOCOL_WSSENDMAIL");
		  JPROTOCOL_WSFASCICOLI = ctx.lookup("JPROTOCOL_WSFASCICOLI");
		  JPROTOCOL_TOKEN = ctx.lookup("JPROTOCOL_TOKEN");
		  JPROTOCOL_PROTOCOLLATORE_ENTRATA = ctx.lookup("JPROTOCOL_PROTOCOLLATORE_ENTRATA");
		  JPROTOCOL_PROTOCOLLATORE_USCITA = ctx.lookup("JPROTOCOL_PROTOCOLLATORE_USCITA");
		  JPROTOCOL_PROTOCOLLATORE_INTERNO = ctx.lookup("JPROTOCOL_PROTOCOLLATORE_INTERNO");
		  JPROTOCOL_CODUFFMITTINTERNO = ctx.lookup("JPROTOCOL_CODUFFMITTINTERNO");
		  JPROTOCOL_TIPOLOGIADOC = ctx.lookup("JPROTOCOL_TIPOLOGIADOC");
		  JPROTOCOL_CATDOC = ctx.lookup("JPROTOCOL_CATDOC");
		  JPROTOCOL_CODICEMAILSERVER = ctx.lookup("JPROTOCOL_CODICEMAILSERVER");
		  JPROTOCOL_GRADO_RISERVATEZZA = ctx.lookup("JPROTOCOL_GRADO_RISERVATEZZA");
		  JPROTOCOL_MITTDEST_TIPOLOGIA = ctx.lookup("JPROTOCOL_MITTDEST_TIPOLOGIA");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object ITALPROT_PROWSPROTOCOLLO = "";
	Object ITALPROT_PROWSFASCICOLO = "";
	Object ITALPROT_CODICEENTE = "";
	Object ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE = "";
	Object ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE = "";
	Object ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE = "";
	Object ITALPROT_PARTENZA_CODICE_FIRMATARIO = ""; 
	Object ITALPROT_ARRIVO_CODICE_FIRMATARIO = "";
	Object ITALPROT_INTERNO_CODICE_FIRMATARIO = "";
	Object ITALPROT_PARTENZA_UFFICIO_FIRMATARIO = "";
	Object ITALPROT_ARRIVO_UFFICIO_FIRMATARIO = "";
	Object ITALPROT_INTERNO_UFFICIO_FIRMATARIO = "";
	
	if (REMOTEWSDM.equals("ITALPROT")) {
		try {
		  ITALPROT_PROWSPROTOCOLLO = ctx.lookup("ITALPROT_PROWSPROTOCOLLO");
		  ITALPROT_PROWSFASCICOLO = ctx.lookup("ITALPROT_PROWSFASCICOLO");
		  ITALPROT_CODICEENTE = ctx.lookup("ITALPROT_CODICEENTE");
		  ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE = ctx.lookup("ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE");
		  ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE = ctx.lookup("ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE");
		  ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE = ctx.lookup("ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE");
		  ITALPROT_PARTENZA_CODICE_FIRMATARIO = ctx.lookup("ITALPROT_PARTENZA_CODICE_FIRMATARIO");
		  ITALPROT_ARRIVO_CODICE_FIRMATARIO = ctx.lookup("ITALPROT_ARRIVO_CODICE_FIRMATARIO");
		  ITALPROT_INTERNO_CODICE_FIRMATARIO = ctx.lookup("ITALPROT_INTERNO_CODICE_FIRMATARIO");
		  ITALPROT_PARTENZA_UFFICIO_FIRMATARIO = ctx.lookup("ITALPROT_PARTENZA_UFFICIO_FIRMATARIO");
		  ITALPROT_ARRIVO_UFFICIO_FIRMATARIO = ctx.lookup("ITALPROT_ARRIVO_UFFICIO_FIRMATARIO");
		  ITALPROT_INTERNO_UFFICIO_FIRMATARIO = ctx.lookup("ITALPROT_INTERNO_UFFICIO_FIRMATARIO");
		  
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}

	Object JDOC_WS_OPERAZIONI = "";
	Object JDOC_DOCTYPE_ENTRATA = "";
	Object JDOC_DOCTYPE_FASCICOLO = "";
	Object JDOC_FASCICOLO_TESTO_ALLEGATO = "";
	Object JDOC_USER = "";
	Object JDOC_COMPANY = "";
	Object JDOC_PROTOCOLLO_C11 = "";  
	Object JDOC_PROTOCOLLO_C01 = "";   
	Object JDOC_FASCICOLO_C01 = "";
	Object JDOC_CONTRATTO_C01 = "";
	Object JDOC_CONTRATTO_C11 = "";
	Object JDOC_CONTRATTO_C16 = "";
	

	if (REMOTEWSDM.equals("JDOC")) {
		try {
		  JDOC_WS_OPERAZIONI = ctx.lookup("JDOC_WS_OPERAZIONI");
		  JDOC_DOCTYPE_ENTRATA = ctx.lookup("JDOC_DOCTYPE_ENTRATA");
		  JDOC_DOCTYPE_FASCICOLO = ctx.lookup("JDOC_DOCTYPE_FASCICOLO");
		  JDOC_FASCICOLO_TESTO_ALLEGATO = ctx.lookup("JDOC_FASCICOLO_TESTO_ALLEGATO");
		  JDOC_USER = ctx.lookup("JDOC_USER");
		  JDOC_COMPANY = ctx.lookup("JDOC_COMPANY");
		  JDOC_PROTOCOLLO_C11 = ctx.lookup("JDOC_PROTOCOLLO_C11"); 
		  JDOC_PROTOCOLLO_C01 = ctx.lookup("JDOC_PROTOCOLLO_C01");  
		  JDOC_FASCICOLO_C01 = ctx.lookup("JDOC_FASCICOLO_C01");
		  JDOC_CONTRATTO_C01 = ctx.lookup("JDOC_CONTRATTO_C01");
		  JDOC_CONTRATTO_C11 = ctx.lookup("JDOC_CONTRATTO_C11");
		  JDOC_CONTRATTO_C16 = ctx.lookup("JDOC_CONTRATTO_C16");
		  
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object FOLIUMAGORA_WS_FASCICOLO = "";
	Object FOLIUMAGORA_WS_PROTOCOLLO = "";
	Object FOLIUMAGORA_AOO = "";
	Object FOLIUMAGORA_APPLICAZIONE = "";
	Object FOLIUMAGORA_ENTE = "";
	
	if (REMOTEWSDM.equals("FOLIUMAGORA")) {
		try {
		  FOLIUMAGORA_WS_FASCICOLO = ctx.lookup("FOLIUMAGORA_WS_FASCICOLO");
		  FOLIUMAGORA_WS_PROTOCOLLO = ctx.lookup("FOLIUMAGORA_WS_PROTOCOLLO");
		  FOLIUMAGORA_AOO = ctx.lookup("FOLIUMAGORA_AOO");
		  FOLIUMAGORA_APPLICAZIONE = ctx.lookup("FOLIUMAGORA_APPLICAZIONE");
		  FOLIUMAGORA_ENTE = ctx.lookup("FOLIUMAGORA_ENTE");
		  
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}

	Object DOCER_AUTHENTICATION = "";
	Object DOCER_WS_DOCER = "";
	Object DOCER_WS_PROTOCOLLAZIONE = "";
	Object DOCER_WS_FASCICOLAZIONE = "";
	Object DOCER_AMMINISTRAZIONE_CODICE = "";
	Object DOCER_AMMINISTRAZIONE_DENOMINAZIONE = "";
	Object DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO = "";
	Object DOCER_AOO_CODICE = "";
	Object DOCER_AOO_DENOMINAZIONE = "";
	Object DOCER_AOO_INDIRIZZO_TELEMATICO = "";
	Object DOCER_AOO_MITTENTE_CODICE = "";
	Object DOCER_AOO_MITTENTE_DENOMINAZIONE = "";
	Object DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO = "";
	Object DOCER_APPLICATION = "";
	Object DOCER_ACL = "";
	
	if (REMOTEWSDM.equals("DOCER")) {
		try {
		  DOCER_AUTHENTICATION = ctx.lookup("DOCER_AUTHENTICATION");
		  DOCER_WS_DOCER = ctx.lookup("DOCER_WS_DOCER");
		  DOCER_WS_PROTOCOLLAZIONE = ctx.lookup("DOCER_WS_PROTOCOLLAZIONE");
		  DOCER_WS_FASCICOLAZIONE = ctx.lookup("DOCER_WS_FASCICOLAZIONE");
		  DOCER_AMMINISTRAZIONE_CODICE = ctx.lookup("DOCER_AMMINISTRAZIONE_CODICE");
		  DOCER_AMMINISTRAZIONE_DENOMINAZIONE = ctx.lookup("DOCER_AMMINISTRAZIONE_DENOMINAZIONE");
		  DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO = ctx.lookup("DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO");
		  DOCER_AOO_CODICE = ctx.lookup("DOCER_AOO_CODICE");
		  DOCER_AOO_DENOMINAZIONE = ctx.lookup("DOCER_AOO_DENOMINAZIONE");
		  DOCER_AOO_INDIRIZZO_TELEMATICO = ctx.lookup("DOCER_AOO_INDIRIZZO_TELEMATICO");
		  DOCER_AOO_MITTENTE_CODICE = ctx.lookup("DOCER_AOO_MITTENTE_CODICE");
		  DOCER_AOO_MITTENTE_DENOMINAZIONE = ctx.lookup("DOCER_AOO_MITTENTE_DENOMINAZIONE");
		  DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO = ctx.lookup("DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO");
		  DOCER_APPLICATION = ctx.lookup("DOCER_APPLICATION");
		  DOCER_ACL = ctx.lookup("DOCER_ACL");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}	
	
	
	Object NUMIX_WS = "";
	Object NUMIX_ORGCODE = "";
    Object NUMIX_REGISTRY_TYPE_PROTOCOL = "";
    Object NUMIX_REGISTRY_TYPE_DOCUMENT = "";
    Object NUMIX_IN_SENDER_ID = "";
    Object NUMIX_OUT_SENDER_ID = "";
    Object NUMIX_INT_SENDER_ID = "";
    
	if (REMOTEWSDM.equals("NUMIX")) {
		try {
		  NUMIX_WS = ctx.lookup("NUMIX_WS");
		  NUMIX_ORGCODE = ctx.lookup("NUMIX_ORGCODE");
		  NUMIX_REGISTRY_TYPE_PROTOCOL = ctx.lookup("NUMIX_REGISTRY_TYPE_PROTOCOL");
		  NUMIX_REGISTRY_TYPE_DOCUMENT = ctx.lookup("NUMIX_REGISTRY_TYPE_DOCUMENT");
		  NUMIX_IN_SENDER_ID = ctx.lookup("NUMIX_IN_SENDER_ID");
		  NUMIX_OUT_SENDER_ID = ctx.lookup("NUMIX_OUT_SENDER_ID");
		  NUMIX_INT_SENDER_ID = ctx.lookup("NUMIX_INT_SENDER_ID");
		  
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}	
	
	Object GENERIC01_LOGIN_WS = "";
	Object GENERIC01_LOGIN_GRANT_TYPE = "";
	Object GENERIC01_LOGIN_SCOPE = "";
	Object GENERIC01_PROTOCOLLO_WS = "";
	Object GENERIC01_DOCUMENTALE_WS = "";
	Object GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE = "";
	Object GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID = "";
	Object GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID = "";
	Object GENERIC01_SYSLOGIN = "";
	if (REMOTEWSDM.equals("GENERIC01")) {
		try {
		  GENERIC01_LOGIN_WS = ctx.lookup("GENERIC01_LOGIN_WS");
		  GENERIC01_LOGIN_GRANT_TYPE = ctx.lookup("GENERIC01_LOGIN_GRANT_TYPE");
		  GENERIC01_LOGIN_SCOPE = ctx.lookup("GENERIC01_LOGIN_SCOPE");
		  GENERIC01_PROTOCOLLO_WS = ctx.lookup("GENERIC01_PROTOCOLLO_WS");
		  GENERIC01_DOCUMENTALE_WS = ctx.lookup("GENERIC01_DOCUMENTALE_WS");
		  GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE = ctx.lookup("GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE");
		  GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID = ctx.lookup("GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID");
		  GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID = ctx.lookup("GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID");
		  GENERIC01_SYSLOGIN = ctx.lookup("GENERIC01_SYSLOGIN");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object DATAGRAPH_DOCAREAPROTO = "";
	Object DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE = "";
	Object DATAGRAPH_CODICE_AMMINISTRAZIONE = "";
	Object DATAGRAPH_CODICE_AOO = "";
	Object DATAGRAPH_NOME_APPLICATIVO = "";
	Object DATAGRAPH_TIPO_SMISTAMENTO = "";
	
	if (REMOTEWSDM.equals("DATAGRAPH") || REMOTEWSDM.equals("DATAGRAPH.PRISMA")) {
		try {
		  DATAGRAPH_DOCAREAPROTO = ctx.lookup("DATAGRAPH_DOCAREAPROTO");
		  DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE = ctx.lookup("DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE");
		  DATAGRAPH_CODICE_AMMINISTRAZIONE = ctx.lookup("DATAGRAPH_CODICE_AMMINISTRAZIONE");
		  DATAGRAPH_CODICE_AOO = ctx.lookup("DATAGRAPH_CODICE_AOO");
		  DATAGRAPH_NOME_APPLICATIVO = ctx.lookup("DATAGRAPH_NOME_APPLICATIVO");
		  DATAGRAPH_TIPO_SMISTAMENTO = ctx.lookup("DATAGRAPH_TIPO_SMISTAMENTO");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}

	Object FOLIUM2_WS_PROTOCOLLO = "";
	Object FOLIUM2_AOO = "";
	Object FOLIUM2_APPLICAZIONE = "";
	Object FOLIUM2_ENTE = "";
	Object FOLIUM2_REGISTRO = "";
	Object FOLIUM2_ESEGUI_SALVA_DOCUMENTO = "SI";
	
	if (REMOTEWSDM.equals("FOLIUM2") || REMOTEWSDM.equals("FOLIUM2.FOLIUM")) {
		try {
		  FOLIUM2_WS_PROTOCOLLO = ctx.lookup("FOLIUM2_WS_PROTOCOLLO");
		  FOLIUM2_AOO = ctx.lookup("FOLIUM2_AOO");
		  FOLIUM2_APPLICAZIONE = ctx.lookup("FOLIUM2_APPLICAZIONE");
		  FOLIUM2_ENTE = ctx.lookup("FOLIUM2_ENTE");
		  FOLIUM2_REGISTRO = ctx.lookup("FOLIUM2_REGISTRO");
		  
		  try {
		    FOLIUM2_ESEGUI_SALVA_DOCUMENTO = ctx.lookup("FOLIUM2_ESEGUI_SALVA_DOCUMENTO");
			} catch (Throwable ex) {

			}
		  
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object INFOR2_JPROTOCOLLO_ENDPOINT = "";
	Object INFOR2_JPROTOCOLLOGEN_ENDPOINT = "";
	if (REMOTEWSDM.equals("INFOR2") || REMOTEWSDM.equals("INFOR2.INFOR")) {
		try {
		  INFOR2_JPROTOCOLLO_ENDPOINT = ctx.lookup("INFOR2_JPROTOCOLLO_ENDPOINT");
		  INFOR2_JPROTOCOLLOGEN_ENDPOINT = ctx.lookup("INFOR2_JPROTOCOLLOGEN_ENDPOINT");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object LAPIS_PROTOCOLLO_URL = "";
	Object OPERA_DOCUMENTALE_URL = "";
	Object LAPIS_CODICE_APPLICATIVO = "";
	if (REMOTEWSDM.equals("LAPISOPERA")) {
		try {
		  LAPIS_PROTOCOLLO_URL = ctx.lookup("LAPIS_PROTOCOLLO_URL");
		  OPERA_DOCUMENTALE_URL = ctx.lookup("OPERA_DOCUMENTALE_URL");
		  LAPIS_CODICE_APPLICATIVO = ctx.lookup("LAPIS_CODICE_APPLICATIVO");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object H5EDOK_PROTOCOLLO_URL = "";
	Object H5EDOK_AUTENTICAZIONE_URL = "";
	Object H5EDOK_RESPONSIBLETYPE  = ""; 
	Object H5EDOK_PCUNIQUE         = ""; 
	Object H5EDOK_RESPONSIBLEID    = ""; 
	Object H5EDOK_UOID             = ""; 
	Object H5EDOK_UONAME           = ""; 
	Object H5EDOK_RESPONSIBLENAME  = ""; 
	Object H5EDOK_DSLIVRISID       = ""; 
	Object H5EDOK_PRIVACYLEVELID   = ""; 
	Object H5EDOK_AOONAME          = ""; 
	Object H5EDOK_AOOID            = ""; 
	Object H5EDOK_OCUNIQUE         = ""; 
	Object H5EDOK_RECEIVINGNAME    = ""; 
	Object H5EDOK_SENDERNAME       = ""; 
	
	
	if (REMOTEWSDM.equals("H5EDOK")) {
		try {
		  H5EDOK_PROTOCOLLO_URL = ctx.lookup("H5EDOK_PROTOCOLLO_URL");
		  H5EDOK_AUTENTICAZIONE_URL = ctx.lookup("H5EDOK_AUTENTICAZIONE_URL");
		  H5EDOK_RESPONSIBLETYPE = ctx.lookup("H5EDOK_RESPONSIBLETYPE"); 
		  H5EDOK_PCUNIQUE = ctx.lookup("H5EDOK_PCUNIQUE");       
		  H5EDOK_RESPONSIBLEID = ctx.lookup("H5EDOK_RESPONSIBLEID");   
		  H5EDOK_UOID = ctx.lookup("H5EDOK_UOID");         
		  H5EDOK_UONAME = ctx.lookup("H5EDOK_UONAME");          
		  H5EDOK_RESPONSIBLENAME = ctx.lookup("H5EDOK_RESPONSIBLENAME"); 
		  H5EDOK_DSLIVRISID = ctx.lookup("H5EDOK_DSLIVRISID");      
		  H5EDOK_PRIVACYLEVELID = ctx.lookup("H5EDOK_PRIVACYLEVELID");  
		  H5EDOK_AOONAME = ctx.lookup("H5EDOK_AOONAME");         
		  H5EDOK_AOOID = ctx.lookup("H5EDOK_AOOID");           
		  H5EDOK_OCUNIQUE = ctx.lookup("H5EDOK_OCUNIQUE");        
		  H5EDOK_RECEIVINGNAME = ctx.lookup("H5EDOK_RECEIVINGNAME");   
		  H5EDOK_SENDERNAME = ctx.lookup("H5EDOK_SENDERNAME"); 
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}

	Object HALLEY_WSINSERIMENTOPROTOCOLLO = "";
	Object HALLEY_WSCONSULTADOC = "";
	Object HALLEY_WSAGGIUNTIVI = "";
	Object HALLEY_WSESTRAIPROTOCOLLI = "";

	if (REMOTEWSDM.equals("HALLEY")) {
		try {
			HALLEY_WSINSERIMENTOPROTOCOLLO = ctx.lookup("HALLEY_WSINSERIMENTOPROTOCOLLO");
			HALLEY_WSCONSULTADOC = ctx.lookup("HALLEY_WSCONSULTADOC");
			HALLEY_WSAGGIUNTIVI = ctx.lookup("HALLEY_WSAGGIUNTIVI");
			HALLEY_WSESTRAIPROTOCOLLI = ctx.lookup("HALLEY_WSESTRAIPROTOCOLLI");
		} catch (Throwable ex) {
			ERRORERILEVATO = ERRORERILEVATO + "<br>" + ex.toString();
		}
	}
	
	Object ELDASOFTWSDM_VER = "";
	try {
		String jspPath = session.getServletContext().getRealPath("/WEB-INF");
	    String txtFilePath = jspPath+ "/EldasoftWSDM_Ver.txt";
	    BufferedReader reader = new BufferedReader(new FileReader(txtFilePath));
	    StringBuilder sb = new StringBuilder();
	    String line;
	
	    while((line = reader.readLine())!= null){
	        sb.append(line+"\n");
	    }
	    ELDASOFTWSDM_VER = sb.toString();
	    
	    reader.close();
	    
	} catch (Throwable ex) {
	  
	}
	
	
%>
  
  	<c:set var="remotewsdm" value="<%=REMOTEWSDM%>" />

	<table class="contenitore">
		<tr>
			<th id="thremotewsdm"></th>
		</tr>
		<tr class="titolo">
			<td>
				Eldasoft WSDM <%=ELDASOFTWSDM_VER%>
			</td>
		</tr>
		<tr>
			<td>
				<table class="griglia" id="configurazioni">
					<caption>Configurazioni</caption>
					<tr>
						<th id="thconfigurazioni"></th>
					</tr>
					<tr class="intestazione">
						<th colspan="2" id="thconfigurazionintestazione">
							Configurazioni del server per l'inoltro delle richieste al sistema remoto di protocollazione
							<br><span style="color: #FF2222"><%=ERRORERILEVATO%></span>
						</th>
					<tr>
					<tr>
						<td>
							Sistemi remoti di protocollazione e di gestione documentale supportati
						</td>
						<td>
							<table class="griglia" id="listaprotocollisupportati">
							<caption>Lista protocolli supportati</caption>
								<tr>
									<th id="thprotocollisupportati"></th>
								</tr>
								<tr>
									<td>IRIDE</td>
									<td>JIRIDE</td>
									<td>PALEO</td>
									<td>ENGINEERING</td>
									<td>ENGINEERINGDOC</td>
								</tr>
								<tr>
									<td>ARCHIFLOW</td>
									<td>TITULUS</td>
									<td>SMAT</td>
									<td>FOLIUM</td>
									<td>ARCHIFLOWFA</td>
								</tr>
								<tr>
									<td>EASYDOC</td>
									<td>SISPI</td>
									<td>PRISMA</td>
									<td>INFOR</td>
									<td>URBI</td>
								</tr>
								<tr>
									<td>PROTSERVICE</td>
									<td>JPROTOCOL</td>
									<td>ITALPROT</td>
									<td>JDOC</td>
									<td>FOLIUMAGORA</td>
								</tr>
								<tr>
									<td>DOCER</td>
									<td>NUMIX</td>
									<td>GENERIC01</td>
									<td>DATAGRAPH<br>DATAGRAPH.PRISMA restituito ai client come PRISMA</td>
									<td>FOLIUM2<br>FOLIUM2.FOLIUM restituito ai client come FOLIUM</td>
								</tr>
								<tr>
									<td>INFOR2<br>INFOR2.INFOR restituito ai client come INFOR</td>
									<td>LAPISOPERA</td>
									<td>H5EDOK</td>
									<td>ARCHIFLOW10<br>ARCHIFLOW10.ARCHIFLOW restituito ai client come ARCHIFLOW</td>
									<td>HALLEY</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr class="intestazione" id="parametriprotocollo">
						<th id="configurazione">Configurazione</th>
						<th id="valore">Valore</th>
					</tr>
					<tr>
						<td class="etichetta">Sistema remoto di protocollazione</td>
						<td><%=REMOTEWSDM%></td>
					</tr>
					<c:choose>
						<c:when test="${remotewsdm eq 'IRIDE'}">
							<tr>
								<td class="etichetta">Indirizzo servizio fascicoli</td>
								<td><%=IRIDE_WSFASCICOLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio protocolli</td>
								<td><%=IRIDE_WSPROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio atti</td>
								<td><%=IRIDE_WSATTO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice amministrazione</td>
								<td><%=IRIDE_CODICEAMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice AOO (Area Organizzativa Omogenea)</td>
								<td><%=IRIDE_CODICEAOO%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'JIRIDE'}">
							<tr>
								<td class="etichetta">Indirizzo servizio fascicoli</td>
								<td><%=JIRIDE_WSFASCICOLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio protocolli</td>
								<td><%=JIRIDE_WSPROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio atti</td>
								<td><%=JIRIDE_WSATTO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio posta</td>
								<td><%=JIRIDE_WSPOSTA%></td>
							</tr>															
							<tr>
								<td class="etichetta">Codice amministrazione</td>
								<td><%=JIRIDE_CODICEAMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice AOO (Area Organizzativa Omogenea)</td>
								<td><%=JIRIDE_CODICEAOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Flag AggiornaAnagrafiche</td>
								<td><%=JIRIDE_AGGIORNAANAGRAFICHE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio utenti e ruoli</td>
								<td><%=JIRIDE_UTRWSSGATEWAY_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Alias di accesso al servizio utenti e ruoli</td>
								<td><%=JIRIDE_UTRWSSGATEWAY_ALIAS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio lettura tabelle</td>
								<td><%=JIRIDE_WSTABELLE%></td>
							</tr>
							
							<tr>
								<td class="etichetta">Aggiungi allegati: senzaLog</td>
								<td><%=JIRIDE_SENZALOG%></td>
							</tr>	
							<tr>
								<td class="etichetta">Aggiungi allegati: motivazioni</td>
								<td><%=JIRIDE_MOTIVAZIONE%></td>
							</tr>	
							<tr>
								<td class="etichetta">Aggiungi allegati: estremi provvedimento</td>
								<td><%=JIRIDE_ESTREMIPROVVAUT%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio di lettura della lista degli account email</td>
								<td><%=JIRIDE_ACCOUNT_EMAIL_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Download allegati mediante servizio REPWSSGATEWAY (S/N)</td>
								<td><%=JIRIDE_DOWNLOAD_ALLEGATI_REPWSSGATEWAY%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio RESWSSGATEWAY</td>
								<td><%=JIRIDE_REPWSSGATEWAY_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Alias di accesso al servizio RESWSSGATEWAY</td>
								<td><%=JIRIDE_REPWSSGATEWAY_ALIAS%></td>
							</tr>
							<tr>
								<td class="etichetta">Modalita' di fascicolazione del protocollo/documento</td>
								<td><%=JIRIDE_PROTOCOLLO_MODO_FASCICOLAZIONE%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'PALEO'}">
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo/protocollo standard</td>
								<td><%=PALEO_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo/protocollo ws-security</td>
								<td><%=PALEO_WSSEC%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice amministrazione</td>
								<td><%=PALEO_CODICEAMMINISTRAZIONE%></td>
							</tr>	
							<tr>
								<td class="etichetta">Documento privato</td>
								<td><%=PALEO_DOCUMENTOPRIVATO%></td>
							</tr>
							<tr>
								<td class="etichetta">Trasmissione automatica <br>(true: trasmette automaticamente all'operatore indicato, false: non trasmette ad alcun operatore)</td>
								<td><%=PALEO_TA%></td>
							</tr>
							<tr>
								<td class="etichetta">Operatore destinatario della trasmissione automatica</td>
								<td>
									<table class="griglia">
										<tr class="intestazione">
											<th id="attributo">Attributo</th>
											<th id="valore">Valore</th>
										</tr>
										<tr>
											<td class="etichetta">Ruolo</td>
											<td><%=PALEO_TA_OP_RUOLO%></td>
										</tr>
										<tr>
											<td class="etichetta">Nome</td>
											<td><%=PALEO_TA_OP_NOME%></td>
										</tr>
										<tr>
											<td class="etichetta">Cognome</td>
											<td><%=PALEO_TA_OP_COGNOME%></td>
										</tr>
										<tr>
											<td class="etichetta">CodiceUO</td>
											<td><%=PALEO_TA_OP_CODICEUO%></td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td class="etichetta">Tipo di trasmissione automatica (Smistamento, assegnazione, approvazione, inoltro...)</td>
								<td><%=PALEO_TA_TIPO%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'ENGINEERING'}">
							<tr>
								<td class="etichetta">Indirizzo servizio inserimento fascicolo</td>
								<td><%=ENGINEERING_WSINSERIMENTOFASC%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio inserimento protocollo</td>
								<td><%=ENGINEERING_WSPROTOCOLLAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio ricerca fascicolo</td>
								<td><%=ENGINEERING_WSRICERCAFASCICOLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio ricerca protocollo</td>
								<td><%=ENGINEERING_WSRICERCAPROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice ente</td>
								<td><%=ENGINEERING_CODICEENTE%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'ENGINEERINGDOC'}">
							<tr>
								<td class="etichetta">Indirizzo servizio di inserimento di una unita' documentaria</td>
								<td><%=ENGINEERINGDOC_WSADDUD%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio di estrazione dei metadati di una unita' documentaria</td>
								<td><%=ENGINEERINGDOC_WSGETMETADATAUD%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio di estrazione di tutti i file relativi ad una unita' documentaria</td>
								<td><%=ENGINEERINGDOC_WSEXTRACTMULTI%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio di creazione di un nuovo folder</td>
								<td><%=ENGINEERINGDOC_WSADDFOLDER%></td>
							</tr>
							<tr>
								<td class="etichetta">Inserimento fascicolo, tipo di dettaglio del fascicolo, da settare opzionalmente se e' definita una tipologia di fascicolo censita in AURIGA</td>
								<td><%=ENGINEERINGDOC_ADDFOLDER_GENERICS12%></td>
							</tr>
							<tr>
								<td class="etichetta">Inserimento fascicolo, default 'InCaricoA/Struttura'</td>
								<td><%=ENGINEERINGDOC_ADDFOLDER_STRUTTURA%></td>
							</tr>
							
							
							<tr>
								<td class="etichetta">Indirizzo servizio di estrazione dei metadati di un folder</td>
								<td><%=ENGINEERINGDOC_WSGETMETADATAFOLDER%></td>
							</tr>														
							<tr>
								<td class="etichetta">Indirizzo servizio di ricerca sul repository documentale</td>
								<td><%=ENGINEERINGDOC_WSTROVADOCFOLDER%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio di ricerca organigramma</td>
								<td><%=ENGINEERINGDOC_WSTROVAINORGANIGRAMMA%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice applicazione</td>
								<td><%=ENGINEERINGDOC_CODICEAPPLICAZIONE%></td>
							</tr>
							
							<tr>
								<td class="etichetta">Istanza applicazione</td>
								<td><%=ENGINEERINGDOC_ISTANZAAPPLICAZIONE%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'ARCHIFLOW' or remotewsdm eq 'ARCHIFLOW10.ARCHIFLOW' or remotewsdm eq 'ARCHIFLOW10'}">
							<tr>
								<td class="etichetta">Indirizzo servizio login</td>
								<td><%=ARCHIFLOW_WS_LOGIN%></td>
							</tr>
							<tr>
								<td class="etichetta">Dominio (workflow)</td>
								<td><%=ARCHIFLOW_WS_LOGIN_DOMAIN%></td>
							</tr>							
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=ARCHIFLOW_WS_CARD%></td>
							</tr>	
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo</td>
								<td><%=ARCHIFLOW_WS_FOLDER%></td>
							</tr>
							<tr>
							<td class="etichetta">Indirizzo servizio mail</td>
								<td><%=ARCHIFLOW_WS_POSTING%></td>
							</tr>				
						</c:when>
						<c:when test="${remotewsdm eq 'ARCHIFLOWFA'}">
							<tr>
								<td class="etichetta">Indirizzo servizio login (login.svc)</td>
								<td><%=ARCHIFLOWFA_WS_LOGIN%></td>
							</tr>
							<tr>
								<td class="etichetta">Dominio (workflow)</td>
								<td><%=ARCHIFLOWFA_WS_LOGIN_DOMAIN%></td>
							</tr>							
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo (card.svc)</td>
								<td><%=ARCHIFLOWFA_WS_CARD%></td>
							</tr>	
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo (classification.svc)</td>
								<td><%=ARCHIFLOWFA_WS_FOLDER%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo utente per la lettura del fascicolo</td>
								<td><%=ARCHIFLOWFA_WS_FOLDER_UTENTE_ID%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio mail (postingservice.svc o email.svc)</td>
								<td><%=ARCHIFLOWFA_WS_POSTING%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome del servizio di inoltro PEC
									<br>
									<br>
									Opzioni disponibili:
									<br>- POSTING, utilizza il servizio postingservice.svc
									<br>- EMAIL, utilizza il servizio email.svc
									<br>- CARD, utilizza il servizio card.svc
								</td>
								<td><%=ARCHIFLOWFA_MODO_INVIO_PEC%></td>
							</tr>				
						</c:when>
						<c:when test="${remotewsdm eq 'TITULUS'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=TITULUS4UGOV_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio depository</td>
								<td><%=TITULUS4DEPOSITORY_WS%></td>
							</tr>	
							<tr>
								<td class="etichetta">Indirizzo servizio Acl</td>
								<td><%=TITULUSACL4_WS%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'SMAT'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=SMAT_WS%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'FOLIUM'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=FOLIUM_PROTOCOLLA_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio salva documento</td>
								<td><%=FOLIUM_SALVA_DOCUMENTO_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Esegui salva documento</td>
								<td><%=FOLIUM_ESEGUI_SALVA_DOCUMENTO%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'SISPI'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=SISPI_PROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo del client (CLIENTID)</td>
								<td><%=SISPI_CLIENTID%></td>
							</tr>							
						</c:when>
						<c:when test="${remotewsdm eq 'EASYDOC'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocolmanagerservice</td>
								<td><%=EASYDOC_SOAP_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio protocoladminservice</td>
								<td><%=EASYDOC_SOAP_ADMIN_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio mailmanagerservice</td>
								<td><%=EASYDOC_SOAP_MAIL_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo rest</td>
								<td><%=EASYDOC_REST_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice dell'area organizzativa omogenea</td>
								<td><%=EASYDOC_PARAMETRI_AOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice azienda</td>
								<td><%=EASYDOC_PARAMETRI_COMPANYCODE%></td>
							</tr>
							<tr>
								<td class="etichetta">Additionalassignees</td>
								<td><%=EASYDOC_PARAMETRI_ADDITIONALASSIGNEES%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice dominio</td>
								<td><%=EASYDOC_PARAMETRI_DOMAINCODE%></td>
							</tr>	
							<tr>
								<td class="etichetta">Competenza/conoscenza externalsender</td>
								<td><%=EASYDOC_EXTERNALSENDER_TYPE%></td>
							</tr>
							<tr>
								<td class="etichetta">Competenza/conoscenza internalsender</td>
								<td><%=EASYDOC_INTERNALSENDER_TYPE%></td>
							</tr>
							<tr>
								<td class="etichetta">EASYDOC_MAILCFGCODE_PROVVISORIO</td>
								<td><%=EASYDOC_MAILCFGCODE_PROVVISORIO%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'PRISMA'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo (DOCAreaProto)</td>
								<td><%=PRISMA_DOCAREAPROTO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio esteso protocollo (DocAreaExtended)</td>
								<td><%=PRISMA_DOCAREAEXTENDED%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio PEC (DUCD services)</td>
								<td><%=PRISMA_DUCDSERVICES%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio di download degli allegati (DMServerWSCXF AttachServicePort)</td>
								<td><%=PRISMA_DMS_ATTACH%></td>
							</tr>
							<tr>
								<td class="etichetta">Denominazione amministrazione</td>
								<td><%=PRISMA_DENOMINAZIONE_AMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice amministrazione</td>
								<td><%=PRISMA_CODICE_AMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Email amministrazione</td>
								<td><%=PRISMA_EMAIL_AMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice AOO</td>
								<td><%=PRISMA_CODICE_AOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome applicativo protocollo</td>
								<td><%=PRISMA_NOME_APPLICATIVO%></td>
							</tr>
							<tr>
								<td class="etichetta">Tipo smistamento (CONOSCENZA o COMPETENZA)</td>
								<td><%=PRISMA_TIPO_SMISTAMENTO%></td>
							</tr>	
							<tr>
								<td class="etichetta">Tipo documento per registro (per esempio ZTST per test, stringa vuota per produzione, utilizzato per l'inserimento in protocollo)</td>
								<td><%=PRISMA_TIPO_DOCUMENTO_PER_REGISTRO%></td>
							</tr>	
							<tr>
								<td class="etichetta">Tipo registro (per esempio ZTST per test, PROT per produzione, utilizzato per la lettura dei documenti protocollati)</td>
								<td><%=PRISMA_TIPO_REGISTRO%></td>
							</tr>	
								<tr>
								<td class="etichetta">Ricerca documenti nel fascicolo, profondita' in giorni</td>
								<td><%=PRISMA_RICERCA_DOCUMENTI_FASCICOLO_GIORNI%></td>
							</tr>								
							<tr>
								<td class="etichetta">Ricerca documenti nel fascicolo, numero massimo di documenti per i quali leggere i dettagli</td>
								<td><%=PRISMA_RICERCA_DOCUMENTI_NUMERO_MASSIMO%></td>
							</tr>	
							<tr>
								<td class="etichetta">Esegui smistamento</td>
								<td><%=PRISMA_ESEGUI_SMISTAMENTO%></td>
							</tr>							
						</c:when>
						<c:when test="${remotewsdm eq 'INFOR'}">
							<tr>
								<td class="etichetta">Indirizzo servizio JPROTOCOLLO</td>
								<td><%=INFOR_JPROTOCOLLO_ENDPOINT%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio JPROTOCOLLOGEN</td>
								<td><%=INFOR_JPROTOCOLLOGEN_ENDPOINT%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'URBI'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=URBI_PROTOCOLLO_URL%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo AOO</td>								
								<td><%=URBI_IDAOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Utente registratore</td>								
								<td><%=URBI_UTENTE_REGISTRATORE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_PARTENZA_TIPO_MEZZO</td>								
								<td><%=URBI_PARTENZA_TIPO_MEZZO%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_TIPO_MEZZO</td>								
								<td><%=URBI_ARRIVO_TIPO_MEZZO%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_PARTENZA_UFFICIO_MITTENTE</td>								
								<td><%=URBI_PARTENZA_UFFICIO_MITTENTE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE</td>								
								<td><%=URBI_PARTENZA_UFFICIO_MITTENTE_ORIGINALE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE</td>								
								<td><%=URBI_PARTENZA_UFFICIO_MITTENTE_UTENTE_MITTENTE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_PARTENZA_INVIO_IMMEDIATO_PEC</td>								
								<td><%=URBI_PARTENZA_INVIO_IMMEDIATO_PEC%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_PARTENZA_CLASSIFICAZIONE</td>								
								<td><%=URBI_PARTENZA_CLASSIFICAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_UFFICIO_DESTINATARIO</td>								
								<td><%=URBI_ARRIVO_UFFICIO_DESTINATARIO%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE</td>								
								<td><%=URBI_ARRIVO_UFFICIO_DESTINATARIO_ORIGINALE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI</td>								
								<td><%=URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE_CO_AUTOMATICI%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE</td>								
								<td><%=URBI_ARRIVO_UFFICIO_DESTINATARIO_ASSEGNAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE</td>								
								<td><%=URBI_ARRIVO_UFFICIO_DESTINATARIO_UTENTE%></td>
							</tr>
							<tr>
								<td class="etichetta">URBI_ARRIVO_CLASSIFICAZIONE</td>								
								<td><%=URBI_ARRIVO_CLASSIFICAZIONE%></td>
							</tr>
						</c:when>	
						<c:when test="${remotewsdm eq 'PROTSERVICE'}">
							<tr>
								<td class="etichetta">Indirizzo servizio PROTSERVICE</td>
								<td><%=PROTSERVICE_ENDPOINT%></td>
							</tr>
							<tr>
								<td class="etichetta">Riservato</td>
								<td><%=PROTSERVICE_RISERVATO%></td>
							</tr>
							<tr>
								<td class="etichetta">Registro</td>
								<td><%=PROTSERVICE_REGISTRO%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'JPROTOCOL'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollazione</td>
								<td><%=JPROTOCOL_WSPROTOCOLLASILENTE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio elenco documento</td>
								<td><%=JPROTOCOL_WSELENCODOCUMENTI%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio mail</td>
								<td><%=JPROTOCOL_WSSENDMAIL%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo</td>
								<td><%=JPROTOCOL_WSFASCICOLI%></td>
							</tr>
							<tr>
								<td class="etichetta">Token</td>
								<td><%=JPROTOCOL_TOKEN%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollatore entrata</td>
								<td><%=JPROTOCOL_PROTOCOLLATORE_ENTRATA%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollatore uscita</td>
								<td><%=JPROTOCOL_PROTOCOLLATORE_USCITA%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollatore interno</td>
								<td><%=JPROTOCOL_PROTOCOLLATORE_INTERNO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice ufficio mittente interno</td>
								<td><%=JPROTOCOL_CODUFFMITTINTERNO%></td>
							</tr>
							<tr>
								<td class="etichetta">Mezzo di trasmissione</td>
								<td><%=JPROTOCOL_TIPOLOGIADOC%></td>
							</tr>
							<tr>
								<td class="etichetta">Categoria documento</td>
								<td><%=JPROTOCOL_CATDOC%></td>
							</tr>
							<tr>
								<td class="etichetta">ID del server di mail</td>
								<td><%=JPROTOCOL_CODICEMAILSERVER%></td>
							</tr>
							<tr>
								<td class="etichetta">
									Grado di riservatezza delle comunicazioni
									<br>
									<ul>
										<li>1 - Pubblico</li>
										<li>2 - Riservato</li>
										<li>3 - Altamente Confidenziale</li>
									</ul>
								</td>
								<td><%=JPROTOCOL_GRADO_RISERVATEZZA%></td>
							</tr>
							<tr>
								<td class="etichetta">
									Tipologia di anagrafica
									<br>
									<ul>
										<li>1 - DIPENDENTE</li>
										<li>2 - ALTRO</li>
										<li>3 - PERSONA FISICA</li>
										<li>4 - PERSONA GIURIDICA</li>
										<li>5 - PUBBLICA AMMINISTRAZIONE LOCALE</li>
										<li>6 - PUBBLICA AMMINISTRAZIONE CENTRALE</li>
										<li>7 - ACCADEMIE</li>
										<li>8 - ISTITUTI SCOLASTICI</li>
									</ul>
								</td>
								<td><%=JPROTOCOL_MITTDEST_TIPOLOGIA%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'ITALPROT'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=ITALPROT_PROWSPROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo</td>
								<td><%=ITALPROT_PROWSFASCICOLO%></td>
							</tr>							
							<tr>
								<td class="etichetta">Codice dell'ente (domainCode) per l'accesso al servizio protocollo</td>
								<td><%=ITALPROT_CODICEENTE%></td>
							</tr>
							<tr>
								<td colspan="2" class="etichetta">&nbsp;</td>
							</tr>							
							<tr>
								<td class="etichetta">Codice ufficio operatore (partenza)</td>
								<td><%=ITALPROT_PARTENZA_CODICE_UFFICIO_OPERATORE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice ufficio operatore (arrivo)</td>
								<td><%=ITALPROT_ARRIVO_CODICE_UFFICIO_OPERATORE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice ufficio operatore (interno)</td>
								<td><%=ITALPROT_INTERNO_CODICE_UFFICIO_OPERATORE%></td>
							</tr>	
							<tr>
								<td colspan="2" class="etichetta">&nbsp;</td>
							</tr>
							<tr>
								<td class="etichetta">Codice firmatario (partenza)</td>
								<td><%=ITALPROT_PARTENZA_CODICE_FIRMATARIO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice firmatario (arrivo)</td>
								<td><%=ITALPROT_ARRIVO_CODICE_FIRMATARIO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice firmatario (interno)</td>
								<td><%=ITALPROT_INTERNO_CODICE_FIRMATARIO%></td>
							</tr>
							<tr>
								<td colspan="2" class="etichetta">&nbsp;</td>
							</tr>
							<tr>
								<td class="etichetta">Codice ufficio firmatario (partenza)</td>
								<td><%=ITALPROT_PARTENZA_UFFICIO_FIRMATARIO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice ufficio firmatario (arrivo)</td>
								<td><%=ITALPROT_ARRIVO_UFFICIO_FIRMATARIO%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice ufficio firmatario (interno)</td>
								<td><%=ITALPROT_INTERNO_UFFICIO_FIRMATARIO%></td>
							</tr>
						</c:when>	
						<c:when test="${remotewsdm eq 'JDOC'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=JDOC_WS_OPERAZIONI%></td>
							</tr>
							<tr>
								<td class="etichetta">Utente che sta archiviando</td>
								<td><%=JDOC_USER%></td>
							</tr>
							<tr>
								<td class="etichetta">Azienda</td>
								<td><%=JDOC_COMPANY%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollo, Tipo documento (DOCTYPE) (utilizzato solo per la protocollazione in ingresso)</td>
								<td><%=JDOC_DOCTYPE_ENTRATA%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollo, Parametro C01 per il Tipo documento "CORR_SOC"</td>
								<td><%=JDOC_PROTOCOLLO_C01%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollo, Parametro C11 per il Tipo documento "CORR_SOC"</td>
								<td><%=JDOC_PROTOCOLLO_C11%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollo, Parametro C01 (Area) per il Tipo documento "CONTRATTO"</td>
								<td><%=JDOC_CONTRATTO_C01%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollo, Parametro C11 (Codice fornitore) per il Tipo documento "CONTRATTO"</td>
								<td><%=JDOC_CONTRATTO_C11%></td>
							</tr>
							<tr>
								<td class="etichetta">Protocollo, Parametro C16 (Ragione sociale del fornitore) per il Tipo documento "CONTRATTO"</td>
								<td><%=JDOC_CONTRATTO_C16%></td>
							</tr>
							<tr>
								<td class="etichetta">Fascicolo, Tipo documento (DOCTYPE)</td>
								<td><%=JDOC_DOCTYPE_FASCICOLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Fascicolo, Parametro C01</td>
								<td><%=JDOC_FASCICOLO_C01%></td>
							</tr>
							<tr>
								<td class="etichetta">Fascicolo, Testo dell'allegato di creazione fascicolo</td>
								<td><%=JDOC_FASCICOLO_TESTO_ALLEGATO%></td>
							</tr>							
						</c:when>
						<c:when test="${remotewsdm eq 'FOLIUMAGORA'}">
							<tr>
								<td class="etichetta">Indirizzo servizio fascicolo</td>
								<td><%=FOLIUMAGORA_WS_FASCICOLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=FOLIUMAGORA_WS_PROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">AOO</td>
								<td><%=FOLIUMAGORA_AOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Applicazione</td>
								<td><%=FOLIUMAGORA_APPLICAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Ente</td>
								<td><%=FOLIUMAGORA_ENTE%></td>
							</tr>
						</c:when>
						
						<c:when test="${remotewsdm eq 'DOCER'}">
							<tr>
								<td class="etichetta">Indirizzo del servizio 'AuthenticationService'</td>
								<td><%=DOCER_AUTHENTICATION%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo del servizio 'DocerService'</td>
								<td><%=DOCER_WS_DOCER%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo del servizio 'Protocollazione'</td>
								<td><%=DOCER_WS_PROTOCOLLAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo del servizio 'Fascicolazione'</td>
								<td><%=DOCER_WS_FASCICOLAZIONE%></td>
							</tr>
							
							<tr>
								<td class="etichetta">Codice amministrazione/ente</td>
								<td><%=DOCER_AMMINISTRAZIONE_CODICE%></td>
							</tr>
							<tr>
								<td class="etichetta">Denominazione dell'amministrazione/ente</td>
								<td><%=DOCER_AMMINISTRAZIONE_DENOMINAZIONE%></td>
							</tr>
								<tr>
								<td class="etichetta">Indirizzo telematico dell'amministrazione/ente</td>
								<td><%=DOCER_AMMINISTRAZIONE_INDIRIZZO_TELEMATICO%></td>
							</tr>							
							<tr>
								<td class="etichetta">Codice AOO</td>
								<td><%=DOCER_AOO_CODICE%></td>
							</tr>
							<tr>
								<td class="etichetta">Denominazione AOO</td>
								<td><%=DOCER_AOO_DENOMINAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo telematico AOO</td>
								<td><%=DOCER_AOO_INDIRIZZO_TELEMATICO%></td>
							</tr>							
							<tr>
								<td class="etichetta">Codice AOO mittente</td>
								<td><%=DOCER_AOO_MITTENTE_CODICE%></td>
							</tr>
							<tr>
								<td class="etichetta">Denominazione AOO mittente</td>
								<td><%=DOCER_AOO_MITTENTE_DENOMINAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo telematico AOO mittente</td>
								<td><%=DOCER_AOO_MITTENTE_INDIRIZZO_TELEMATICO%></td>
							</tr>							
							<tr>
								<td class="etichetta">Codice applicazione</td>
								<td><%=DOCER_APPLICATION%></td>
							</tr>
							<tr>
								<td class="etichetta">Lista dei codici GROUP_ID o USER_ID cui assegnare i diritti sui documenti. I codici devono essere separati da virgola (,)</td>
								<td><%=DOCER_ACL%></td>
							</tr>							
						</c:when>
						<c:when test="${remotewsdm eq 'NUMIX'}">
							<tr>
								<td class="etichetta">Indirizzo del servizio REST</td>
								<td><%=NUMIX_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice organizzazione ORGCODE</td>
								<td><%=NUMIX_ORGCODE%></td>
							</tr>
							<tr>
								<td class="etichetta">Registry type protocol</td>
								<td><%=NUMIX_REGISTRY_TYPE_PROTOCOL%></td>
							</tr>
							<tr>
								<td class="etichetta">Registry type document</td>
								<td><%=NUMIX_REGISTRY_TYPE_DOCUMENT%></td>
							</tr>
							<tr>
								<td class="etichetta"> Sender Id protocollo in ingresso</td>
								<td><%=NUMIX_IN_SENDER_ID%></td>
							</tr>
							<tr>
								<td class="etichetta">Sender Id protocollo in uscita</td>
								<td><%=NUMIX_OUT_SENDER_ID%></td>
							</tr>
							<tr>
								<td class="etichetta">Sender Id protocollo interno</td>
								<td><%=NUMIX_INT_SENDER_ID%></td>
							</tr>								
						</c:when>
						<c:when test="${remotewsdm eq 'GENERIC01'}">
							<tr>
								<td class="etichetta">Indirizzo del servizio LOGIN</td>
								<td><%=GENERIC01_LOGIN_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Parametro GRANT_TYPE</td>
								<td><%=GENERIC01_LOGIN_GRANT_TYPE%></td>
							</tr>
							<tr>
								<td class="etichetta">Parametro SCOPE</td>
								<td><%=GENERIC01_LOGIN_SCOPE%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo del servizio PROTOCOLLO</td>
								<td><%=GENERIC01_PROTOCOLLO_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo del servizio DOCUMENTALE</td>
								<td><%=GENERIC01_DOCUMENTALE_WS%></td>
							</tr>
							<tr>
								<td class="etichetta">Parametro SERVICE_PROVIDER_CODE</td>
								<td><%=GENERIC01_PROTOCOLLO_SERVICE_PROVIDER_CODE%></td>
							</tr>
							<tr>
								<td class="etichetta">Parametro PROTOCOLLO_CLIENT_ID</td>
								<td><%=GENERIC01_PROTOCOLLO_PROTOCOLLO_CLIENT_ID%></td>
							</tr>	
							<tr>
								<td class="etichetta">Parametro PROTOCOLLO_USER_ID</td>
								<td><%=GENERIC01_PROTOCOLLO_PROTOCOLLO_USER_ID%></td>
							</tr>
							<tr>
								<td class="etichetta">Parametro SYSLOGIN</td>
								<td><%=GENERIC01_SYSLOGIN%></td>
							</tr>									
						</c:when>
						<c:when test="${remotewsdm eq 'DATAGRAPH' or remotewsdm eq 'DATAGRAPH.PRISMA'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo (DOCAreaProto)</td>
								<td><%=DATAGRAPH_DOCAREAPROTO%></td>
							</tr>
							<tr>
								<td class="etichetta">Denominazione amministrazione</td>
								<td><%=DATAGRAPH_DENOMINAZIONE_AMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice amministrazione</td>
								<td><%=DATAGRAPH_CODICE_AMMINISTRAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice AOO</td>
								<td><%=DATAGRAPH_CODICE_AOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome applicativo protocollo</td>
								<td><%=DATAGRAPH_NOME_APPLICATIVO%></td>
							</tr>
							<tr>
								<td class="etichetta">Tipo smistamento (CONOSCENZA o COMPETENZA)</td>
								<td><%=DATAGRAPH_TIPO_SMISTAMENTO%></td>
							</tr>	
						</c:when>
						<c:when test="${remotewsdm eq 'FOLIUM2' or remotewsdm eq 'FOLIUM2.FOLIUM'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo</td>
								<td><%=FOLIUM2_WS_PROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">AOO</td>
								<td><%=FOLIUM2_AOO%></td>
							</tr>
							<tr>
								<td class="etichetta">Applicazione</td>
								<td><%=FOLIUM2_APPLICAZIONE%></td>
							</tr>
							<tr>
								<td class="etichetta">Ente</td>
								<td><%=FOLIUM2_ENTE%></td>
							</tr>
							<tr>
								<td class="etichetta">Registro (se nullo si utilizza il registro ufficiale)</td>
								<td><%=FOLIUM2_REGISTRO%></td>
							</tr>
							<tr>
								<td class="etichetta">Esegui il salvataggio dei documenti allegati</td>
								<td><%=FOLIUM2_ESEGUI_SALVA_DOCUMENTO%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'INFOR2' or remotewsdm eq 'INFOR2.INFOR'}">
							<tr>
								<td class="etichetta">Indirizzo servizio JPROTOCOLLO</td>
								<td><%=INFOR2_JPROTOCOLLO_ENDPOINT%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio JPROTOCOLLOGEN</td>
								<td><%=INFOR2_JPROTOCOLLOGEN_ENDPOINT%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'LAPISOPERA'}">
							<tr>
								<td class="etichetta">Indirizzo servizio protocollo LAPIS</td>
								<td><%=LAPIS_PROTOCOLLO_URL%></td>
							</tr>
							<tr>
								<td class="etichetta">Codice applicativo protocollo LAPIS</td>
								<td><%=LAPIS_CODICE_APPLICATIVO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio documentale OPERA</td>
								<td><%=OPERA_DOCUMENTALE_URL%></td>
							</tr>
						</c:when>
						<c:when test="${remotewsdm eq 'H5EDOK'}">
							<tr>
								<td class="etichetta">Indirizzo servizio di autenticazione</td>
								<td><%=H5EDOK_AUTENTICAZIONE_URL%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo protocollo</td>
								<td><%=H5EDOK_PROTOCOLLO_URL%></td>
							</tr>
							
							<tr>
								<td class="etichetta">Tipo responsabile</td>
								<td><%=H5EDOK_RESPONSIBLETYPE%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo univoco del titolario</td>
								<td><%=H5EDOK_PCUNIQUE%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo univoco dell'operatore di protocollo</td>
								<td><%=H5EDOK_RESPONSIBLEID%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo unita' operativa</td>
								<td><%=H5EDOK_UOID%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome unita' operativa</td>
								<td><%=H5EDOK_UONAME%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome responsabile dell'unita' operativa</td>
								<td><%=H5EDOK_RESPONSIBLENAME%></td>
							</tr>
							<tr>
								<td class="etichetta">Livello di riservatezza</td>
								<td><%=H5EDOK_DSLIVRISID%></td>
							</tr>
							<tr>
								<td class="etichetta">Livello privacy</td>
								<td><%=H5EDOK_PRIVACYLEVELID%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome della AOO</td>
								<td><%=H5EDOK_AOONAME%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo della AOO</td>
								<td><%=H5EDOK_AOOID%></td>
							</tr>
							<tr>
								<td class="etichetta">Identificativo univoco dell'organigramma"</td>
								<td><%=H5EDOK_OCUNIQUE%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome ricevente</td>
								<td><%=H5EDOK_RECEIVINGNAME%></td>
							</tr>
							<tr>
								<td class="etichetta">Nome mittente</td>
								<td><%=H5EDOK_SENDERNAME%></td>
							</tr>
							
						</c:when>
						<c:when test="${remotewsdm eq 'HALLEY'}">
							<tr>
								<td class="etichetta">Indirizzo servizio inserimento protocollo</td>
								<td><%=HALLEY_WSINSERIMENTOPROTOCOLLO%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizio consulta documenti</td>
								<td><%=HALLEY_WSCONSULTADOC%></td>
							</tr>

							<tr>
								<td class="etichetta">Indirizzo servizi aggiuntivi (fascicolo, classifica, uffici)</td>
								<td><%=HALLEY_WSAGGIUNTIVI%></td>
							</tr>
							<tr>
								<td class="etichetta">Indirizzo servizi estrai protocolli</td>
								<td><%=HALLEY_WSESTRAIPROTOCOLLI%></td>
							</tr>
						</c:when>
						<c:otherwise>
							<td colspan="2" style="text-align: center;">
								<span style="color: red;">Il sistema indicato non &egrave; supportato</span>
							</td>
						</c:otherwise>					
					</c:choose>
				</table>
			</td>
		</tr>
	</table>
<%
	}
	catch (NamingException ex) {
	  System.out.println(ex);	  
	  System.err.println(ex);
	  Object ERRORERILEVATO = ex;
%>	
	<table class="contenitore">
		<tr class="titolo">
			<td>
				Eldasoft WSDM
			</td>
		</tr>
		<tr>
			<td style="color: #FF2200">
				Si &egrave; verificato un errore nella lettura della configurazione: 
				<br>
				<b><%=ERRORERILEVATO%></b>
			</td>
		</tr>
	</table>
<%
	}
%>

