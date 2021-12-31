/**
 * ProWsProtocolloBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.italprot.prowsprotocollo;

public class ProWsProtocolloBindingStub extends org.apache.axis.client.Stub implements it.italprot.prowsprotocollo.ProWsProtocolloPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItaEngineContextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "domainCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItaEngineContextTokenInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "domainCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UserName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UserCode"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckItaEngineContextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "domainCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DestroyItaEngineContextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "domainCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "blockSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "part"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allegato"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "allegato"), it.italprot.prowsprotocollo.Allegato.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProtocollo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segnatura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "itemProtocollo"), it.italprot.prowsprotocollo.ItemProtocollo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProtocolloFattura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileFattura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "itemProtocollo"), it.italprot.prowsprotocollo.ItemProtocollo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOrganigramma");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "organigramma"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "organigramma"), it.italprot.prowsprotocollo.RigaOrganigramma[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PutAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nomeFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "estensione"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stream"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "note"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "marcaDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mettiAllaFirma"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allegati"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "allegati"), it.italprot.prowsprotocollo.Allegato[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PutProtocollo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datiProtocollo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:proWsProtocollo", "datiProtocollo"), it.italprot.prowsprotocollo.DatiProtocollo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datiProtocollo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "retProtocollo"), it.italprot.prowsprotocollo.RetProtocollo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NotificaMailProtocollo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oggettoCustom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bodyCustom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "statoNotifica"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "statoNotifica"), it.italprot.prowsprotocollo.StatoNotifica.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nomeFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stream"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allegatoPrecaricato"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "allegatoPrecaricato"), it.italprot.prowsprotocollo.AllegatoPrecaricato.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNotificaMailProtocollo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rowidmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notificaMail"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "notificaMail"), it.italprot.prowsprotocollo.NotificaMail.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult"), it.italprot.prowsprotocollo.MessageResult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

    }

    public ProWsProtocolloBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProWsProtocolloBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProWsProtocolloBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "allegati");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Allegato[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "allegato");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "allegatiPrecaricati");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.AllegatoPrecaricato[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "allegatoPrecaricato");
            qName2 = new javax.xml.namespace.QName("", "allegatoPrecaricato");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "allegato");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Allegato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "allegatoPrecaricato");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.AllegatoPrecaricato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "datiProtocollo");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.DatiProtocollo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "destinatari");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.MittenteDestinatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario");
            qName2 = new javax.xml.namespace.QName("", "mittenteDestinatario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "firmatari");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Firmatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "firmatario");
            qName2 = new javax.xml.namespace.QName("", "firmatario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "firmatario");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Firmatario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "itemProtocollo");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.ItemProtocollo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "messageResult");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.MessageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.MittenteDestinatario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenti");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.MittenteDestinatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario");
            qName2 = new javax.xml.namespace.QName("", "mittenteDestinatario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "mittentiDestinatari");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.MittenteDestinatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "mittenteDestinatario");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "nota");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Nota.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "note");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Nota[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "nota");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "notifica");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Notifica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "notificaMail");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.NotificaMail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "notificheMail");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Notifica[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "notifica");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "organigramma");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.RigaOrganigramma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "rigaOrganigramma");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "retProtocollo");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.RetProtocollo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "rigaOrganigramma");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.RigaOrganigramma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "statoNotifica");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.StatoNotifica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissione");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Trasmissione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissioni");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Trasmissione[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissione");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissioniInterne");
            cachedSerQNames.add(qName);
            cls = it.italprot.prowsprotocollo.Trasmissione[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:proWsProtocollo", "trasmissione");
            qName2 = new javax.xml.namespace.QName("", "trasmissione");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String getItaEngineContextToken(java.lang.String userName, java.lang.String userPassword, java.lang.String domainCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetItaEngineContextToken");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItaEngineContextToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, userPassword, domainCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getItaEngineContextTokenInfo(java.lang.String token, java.lang.String domainCode, javax.xml.rpc.holders.StringHolder userName, javax.xml.rpc.holders.StringHolder userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetItaEngineContextTokenInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItaEngineContextTokenInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, domainCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                userName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "UserName"));
            } catch (java.lang.Exception _exception) {
                userName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "UserName")), java.lang.String.class);
            }
            try {
                userCode.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "UserCode"));
            } catch (java.lang.Exception _exception) {
                userCode.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "UserCode")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String checkItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/CheckItaEngineContextToken");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckItaEngineContextToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, domainCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String destroyItaEngineContextToken(java.lang.String token, java.lang.String domainCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/DestroyItaEngineContextToken");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DestroyItaEngineContextToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, domainCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getAllegato(java.lang.String token, java.lang.String id, java.lang.String blockSize, java.lang.String part, it.italprot.prowsprotocollo.holders.AllegatoHolder allegato, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetAllegato");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, id, blockSize, part});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                allegato.value = (it.italprot.prowsprotocollo.Allegato) _output.get(new javax.xml.namespace.QName("", "allegato"));
            } catch (java.lang.Exception _exception) {
                allegato.value = (it.italprot.prowsprotocollo.Allegato) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "allegato")), it.italprot.prowsprotocollo.Allegato.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String segnatura, it.italprot.prowsprotocollo.holders.ItemProtocolloHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetProtocollo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProtocollo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, anno, numero, tipo, segnatura});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                items.value = (it.italprot.prowsprotocollo.ItemProtocollo) _output.get(new javax.xml.namespace.QName("", "items"));
            } catch (java.lang.Exception _exception) {
                items.value = (it.italprot.prowsprotocollo.ItemProtocollo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items")), it.italprot.prowsprotocollo.ItemProtocollo.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getProtocolloFattura(java.lang.String token, java.lang.String fileFattura, it.italprot.prowsprotocollo.holders.ItemProtocolloHolder items, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetProtocolloFattura");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProtocolloFattura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, fileFattura});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                items.value = (it.italprot.prowsprotocollo.ItemProtocollo) _output.get(new javax.xml.namespace.QName("", "items"));
            } catch (java.lang.Exception _exception) {
                items.value = (it.italprot.prowsprotocollo.ItemProtocollo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items")), it.italprot.prowsprotocollo.ItemProtocollo.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getOrganigramma(java.lang.String token, it.italprot.prowsprotocollo.holders.OrganigrammaHolder organigramma, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetOrganigramma");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOrganigramma"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                organigramma.value = (it.italprot.prowsprotocollo.RigaOrganigramma[]) _output.get(new javax.xml.namespace.QName("", "organigramma"));
            } catch (java.lang.Exception _exception) {
                organigramma.value = (it.italprot.prowsprotocollo.RigaOrganigramma[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "organigramma")), it.italprot.prowsprotocollo.RigaOrganigramma[].class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void putAllegato(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String tipoFile, java.lang.String nomeFile, java.lang.String estensione, java.lang.String stream, java.lang.String note, java.lang.String marcaDocumento, java.lang.String mettiAllaFirma, it.italprot.prowsprotocollo.holders.AllegatiHolder allegati, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/PutAllegato");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PutAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, anno, numero, tipo, tipoFile, nomeFile, estensione, stream, note, marcaDocumento, mettiAllaFirma});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                allegati.value = (it.italprot.prowsprotocollo.Allegato[]) _output.get(new javax.xml.namespace.QName("", "allegati"));
            } catch (java.lang.Exception _exception) {
                allegati.value = (it.italprot.prowsprotocollo.Allegato[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "allegati")), it.italprot.prowsprotocollo.Allegato[].class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void putProtocollo(java.lang.String token, it.italprot.prowsprotocollo.DatiProtocollo datiProtocollo, it.italprot.prowsprotocollo.holders.RetProtocolloHolder datiProtocollo2, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/PutProtocollo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PutProtocollo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, datiProtocollo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                datiProtocollo2.value = (it.italprot.prowsprotocollo.RetProtocollo) _output.get(new javax.xml.namespace.QName("", "datiProtocollo"));
            } catch (java.lang.Exception _exception) {
                datiProtocollo2.value = (it.italprot.prowsprotocollo.RetProtocollo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "datiProtocollo")), it.italprot.prowsprotocollo.RetProtocollo.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void notificaMailProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String oggettoCustom, java.lang.String bodyCustom, it.italprot.prowsprotocollo.holders.StatoNotificaHolder statoNotifica, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/NotificaMailProtocollo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NotificaMailProtocollo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, anno, numero, tipo, oggettoCustom, bodyCustom});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                statoNotifica.value = (it.italprot.prowsprotocollo.StatoNotifica) _output.get(new javax.xml.namespace.QName("", "statoNotifica"));
            } catch (java.lang.Exception _exception) {
                statoNotifica.value = (it.italprot.prowsprotocollo.StatoNotifica) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "statoNotifica")), it.italprot.prowsprotocollo.StatoNotifica.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void insertDocumento(java.lang.String token, java.lang.String nomeFile, java.lang.String stream, it.italprot.prowsprotocollo.holders.AllegatoPrecaricatoHolder allegatoPrecaricato, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/InsertDocumento");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "InsertDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, nomeFile, stream});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                allegatoPrecaricato.value = (it.italprot.prowsprotocollo.AllegatoPrecaricato) _output.get(new javax.xml.namespace.QName("", "allegatoPrecaricato"));
            } catch (java.lang.Exception _exception) {
                allegatoPrecaricato.value = (it.italprot.prowsprotocollo.AllegatoPrecaricato) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "allegatoPrecaricato")), it.italprot.prowsprotocollo.AllegatoPrecaricato.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNotificaMailProtocollo(java.lang.String token, java.lang.String anno, java.lang.String numero, java.lang.String tipo, java.lang.String rowidmail, it.italprot.prowsprotocollo.holders.NotificaMailHolder notificaMail, it.italprot.prowsprotocollo.holders.MessageResultHolder messageResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://93.43.91.194/itaTest/ws/Protocollo/proWsProtocollo.php/GetNotificaMailProtocollo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetNotificaMailProtocollo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, anno, numero, tipo, rowidmail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                notificaMail.value = (it.italprot.prowsprotocollo.NotificaMail) _output.get(new javax.xml.namespace.QName("", "notificaMail"));
            } catch (java.lang.Exception _exception) {
                notificaMail.value = (it.italprot.prowsprotocollo.NotificaMail) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "notificaMail")), it.italprot.prowsprotocollo.NotificaMail.class);
            }
            try {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) _output.get(new javax.xml.namespace.QName("", "messageResult"));
            } catch (java.lang.Exception _exception) {
                messageResult.value = (it.italprot.prowsprotocollo.MessageResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "messageResult")), it.italprot.prowsprotocollo.MessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
