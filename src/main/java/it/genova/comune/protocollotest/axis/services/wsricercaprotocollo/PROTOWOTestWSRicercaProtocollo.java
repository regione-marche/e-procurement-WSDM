package it.genova.comune.protocollotest.axis.services.wsricercaprotocollo;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2016-11-18T15:14:35.048+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "PROTO_WO_test_WSRicercaProtocollo", 
                  targetNamespace = "http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo") 
public class PROTOWOTestWSRicercaProtocollo extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocollo");
    public final static QName PROTOWOTestWSRicercaProtocolloHttpsEndpoint = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocolloHttpsEndpoint");
    public final static QName PROTOWOTestWSRicercaProtocolloHttpsSoap11Endpoint = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocolloHttpsSoap11Endpoint");
    public final static QName PROTOWOTestWSRicercaProtocolloHttpSoap11Endpoint = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocolloHttpSoap11Endpoint");
    public final static QName PROTOWOTestWSRicercaProtocolloHttpsSoap12Endpoint = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocolloHttpsSoap12Endpoint");
    public final static QName PROTOWOTestWSRicercaProtocolloHttpEndpoint = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocolloHttpEndpoint");
    public final static QName PROTOWOTestWSRicercaProtocolloHttpSoap12Endpoint = new QName("http://protocollotest.comune.genova.it/axis/services/WSRicercaProtocollo", "PROTO_WO_test_WSRicercaProtocolloHttpSoap12Endpoint");
    static {
        WSDL_LOCATION = null;
    }

    public PROTOWOTestWSRicercaProtocollo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PROTOWOTestWSRicercaProtocollo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PROTOWOTestWSRicercaProtocollo() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpsEndpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpsEndpoint() {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpsEndpoint, PROTOWOTestWSRicercaProtocolloPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpsEndpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpsEndpoint(WebServiceFeature... features) {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpsEndpoint, PROTOWOTestWSRicercaProtocolloPortType.class, features);
    }
    /**
     *
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpsSoap11Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpsSoap11Endpoint() {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpsSoap11Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpsSoap11Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpsSoap11Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class, features);
    }
    /**
     *
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpSoap11Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpSoap11Endpoint() {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpSoap11Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpSoap11Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpSoap11Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class, features);
    }
    /**
     *
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpsSoap12Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpsSoap12Endpoint() {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpsSoap12Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpsSoap12Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpsSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpsSoap12Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class, features);
    }
    /**
     *
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpEndpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpEndpoint() {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpEndpoint, PROTOWOTestWSRicercaProtocolloPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpEndpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpEndpoint, PROTOWOTestWSRicercaProtocolloPortType.class, features);
    }
    /**
     *
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpSoap12Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpSoap12Endpoint() {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpSoap12Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PROTOWOTestWSRicercaProtocolloPortType
     */
    @WebEndpoint(name = "PROTO_WO_test_WSRicercaProtocolloHttpSoap12Endpoint")
    public PROTOWOTestWSRicercaProtocolloPortType getPROTOWOTestWSRicercaProtocolloHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(PROTOWOTestWSRicercaProtocolloHttpSoap12Endpoint, PROTOWOTestWSRicercaProtocolloPortType.class, features);
    }

}
