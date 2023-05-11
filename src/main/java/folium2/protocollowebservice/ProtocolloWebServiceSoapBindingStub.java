/**
 * ProtocolloWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package folium2.protocollowebservice;

public class ProtocolloWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements folium2.protocollowebservice.ProtocolloWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[18];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium2.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "testLoginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testStato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium2.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "testStatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaTitolarioPerCodiceDescrizione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario"), folium2.protocollowebservice.VoceTitolario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_VoceTitolario"));
        oper.setReturnClass(folium2.protocollowebservice.VoceTitolario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ricercaTitolarioPerCodiceDescrizioneReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaProtocolli");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Ricerca"), folium2.protocollowebservice.Ricerca.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_DocumentoProtocollato"));
        oper.setReturnClass(folium2.protocollowebservice.DocumentoProtocollato[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ricercaProtocolliReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("protocolla");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato"), folium2.protocollowebservice.DocumentoProtocollato.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato"));
        oper.setReturnClass(folium2.protocollowebservice.DocumentoProtocollato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "protocollaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciContenuto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"), folium2.protocollowebservice.ImmagineDocumentale.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"));
        oper.setReturnClass(folium2.protocollowebservice.ImmagineDocumentale.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciContenutoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assegna");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione"), folium2.protocollowebservice.Assegnazione.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione"));
        oper.setReturnClass(folium2.protocollowebservice.Assegnazione.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "assegnaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaContenuto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale"));
        oper.setReturnClass(folium2.protocollowebservice.ImmagineDocumentale.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "recuperaContenutoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContenutoDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContenutoDocumentoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"), folium2.protocollowebservice.Allegato.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        oper.setReturnClass(folium2.protocollowebservice.Allegato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "inserisciAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllegati");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Allegato"));
        oper.setReturnClass(folium2.protocollowebservice.Allegato[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllegatiReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        oper.setReturnClass(folium2.protocollowebservice.Allegato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContenutoAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContenutoAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rimuoviAllegato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato"));
        oper.setReturnClass(folium2.protocollowebservice.Allegato.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rimuoviAllegatoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("elencoAssegnazioni");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "RicercaAssegnazioni"), folium2.protocollowebservice.RicercaAssegnazioni.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Assegnazione"));
        oper.setReturnClass(folium2.protocollowebservice.AssegnazioneDaRicerca[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "elencoAssegnazioniReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prendiInCarico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "presaInCarico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "PresaInCarico"), folium2.protocollowebservice.PresaInCarico.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito"));
        oper.setReturnClass(agora.folium2.ws.WSEsito.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "prendiInCaricoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMezziSpedizione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_MezzoSpedizione"));
        oper.setReturnClass(folium2.protocollowebservice.MezzoSpedizione[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMezziSpedizioneReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ricercaCorrispondenti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication"), agora.folium2.ws.WSAuthentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://type.ws.folium.agora", "RicercaCorrispondenti"), folium2.protocollowebservice.RicercaCorrispondenti.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Corrispondenti"));
        oper.setReturnClass(folium2.protocollowebservice.CorrispondenteDaRicerca[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ricercaCorrispondentiReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

    }

    public ProtocolloWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProtocolloWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProtocolloWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.Allegato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Assegnazione");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.Assegnazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "AssegnazioneDaRicerca");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.AssegnazioneDaRicerca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "CorrispondenteDaRicerca");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.CorrispondenteDaRicerca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.DocumentoProtocollato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "ImmagineDocumentale");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.ImmagineDocumentale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "IndirizzoEmail");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.IndirizzoEmail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "IndirizzoFisico");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.IndirizzoFisico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "MittenteDestinatario");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.MittenteDestinatario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "PresaInCarico");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.PresaInCarico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Ricerca");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.Ricerca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "RicercaAssegnazioni");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.RicercaAssegnazioni.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "RicercaCorrispondenti");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.RicercaCorrispondenti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.VoceTitolario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.folium.agora", "WSAuthentication");
            cachedSerQNames.add(qName);
            cls = agora.folium2.ws.WSAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.folium.agora", "WSEsito");
            cachedSerQNames.add(qName);
            cls = agora.folium2.ws.WSEsito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Allegato");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.Allegato[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "Allegato");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Assegnazione");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.AssegnazioneDaRicerca[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "AssegnazioneDaRicerca");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_Corrispondenti");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.CorrispondenteDaRicerca[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "CorrispondenteDaRicerca");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_DocumentoProtocollato");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.DocumentoProtocollato[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "DocumentoProtocollato");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_IndirizzoEmail");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.IndirizzoEmail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "IndirizzoEmail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_IndirizzoFisico");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.IndirizzoFisico[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "IndirizzoFisico");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_MezzoSpedizione");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.MezzoSpedizione[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "MezzoSpedizione");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_MittenteDestinatario");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.MittenteDestinatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "MittenteDestinatario");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "ArrayOf_tns3_VoceTitolario");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.VoceTitolario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://type.ws.folium.agora", "VoceTitolario");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProtocolloWebService", "MezzoSpedizione");
            cachedSerQNames.add(qName);
            cls = folium2.protocollowebservice.MezzoSpedizione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public agora.folium2.ws.WSEsito testLogin(agora.folium2.ws.WSAuthentication in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "testLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium2.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium2.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium2.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium2.ws.WSEsito testStato(agora.folium2.ws.WSAuthentication in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "testStato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium2.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium2.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium2.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.VoceTitolario[] ricercaTitolarioPerCodiceDescrizione(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.VoceTitolario in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ricercaTitolarioPerCodiceDescrizione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.VoceTitolario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.VoceTitolario[]) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.VoceTitolario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.DocumentoProtocollato[] ricercaProtocolli(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Ricerca in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ricercaProtocolli"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.DocumentoProtocollato[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.DocumentoProtocollato[]) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.DocumentoProtocollato[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.DocumentoProtocollato protocolla(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.DocumentoProtocollato in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "protocolla"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.DocumentoProtocollato) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.DocumentoProtocollato) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.DocumentoProtocollato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.ImmagineDocumentale inserisciContenuto(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.ImmagineDocumentale in1, boolean in2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciContenuto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Boolean(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.ImmagineDocumentale) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.ImmagineDocumentale) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.ImmagineDocumentale.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.Assegnazione assegna(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Assegnazione in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "assegna"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.Assegnazione) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.Assegnazione) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.Assegnazione.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.ImmagineDocumentale recuperaContenuto(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "recuperaContenuto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.ImmagineDocumentale) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.ImmagineDocumentale) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.ImmagineDocumentale.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getContenutoDocumento(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getContenutoDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.Allegato inserisciAllegato(agora.folium2.ws.WSAuthentication in0, folium2.protocollowebservice.Allegato in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "inserisciAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.Allegato) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.Allegato) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.Allegato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.Allegato[] getAllegati(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getAllegati"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.Allegato[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.Allegato[]) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.Allegato[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.Allegato getAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.Allegato) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.Allegato) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.Allegato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getContenutoAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getContenutoAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.Allegato rimuoviAllegato(agora.folium2.ws.WSAuthentication in0, long in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "rimuoviAllegato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.Allegato) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.Allegato) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.Allegato.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.AssegnazioneDaRicerca[] elencoAssegnazioni(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.RicercaAssegnazioni criteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "elencoAssegnazioni"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, criteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.AssegnazioneDaRicerca[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.AssegnazioneDaRicerca[]) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.AssegnazioneDaRicerca[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public agora.folium2.ws.WSEsito prendiInCarico(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.PresaInCarico presaInCarico) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "prendiInCarico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, presaInCarico});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (agora.folium2.ws.WSEsito) _resp;
            } catch (java.lang.Exception _exception) {
                return (agora.folium2.ws.WSEsito) org.apache.axis.utils.JavaUtils.convert(_resp, agora.folium2.ws.WSEsito.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.MezzoSpedizione[] getMezziSpedizione(agora.folium2.ws.WSAuthentication authentication) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "getMezziSpedizione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.MezzoSpedizione[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.MezzoSpedizione[]) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.MezzoSpedizione[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public folium2.protocollowebservice.CorrispondenteDaRicerca[] ricercaCorrispondenti(agora.folium2.ws.WSAuthentication authentication, folium2.protocollowebservice.RicercaCorrispondenti criteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProtocolloWebService", "ricercaCorrispondenti"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, criteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (folium2.protocollowebservice.CorrispondenteDaRicerca[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (folium2.protocollowebservice.CorrispondenteDaRicerca[]) org.apache.axis.utils.JavaUtils.convert(_resp, folium2.protocollowebservice.CorrispondenteDaRicerca[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
