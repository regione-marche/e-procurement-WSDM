package it.dedagroup.ws.spediscidocumento.servizi;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-10-01T16:37:06.367+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "SpedisciDocumento", 
                  targetNamespace = "http://servizi.protocollo.ws.dedagroup.it") 
public class SpedisciDocumento extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servizi.protocollo.ws.dedagroup.it", "SpedisciDocumento");
    public final static QName SpedisciDocumentoHttpEndpoint = new QName("http://servizi.protocollo.ws.dedagroup.it", "SpedisciDocumentoHttpEndpoint");
    public final static QName SpedisciDocumentoHttpSoap11Endpoint = new QName("http://servizi.protocollo.ws.dedagroup.it", "SpedisciDocumentoHttpSoap11Endpoint");
    public final static QName SpedisciDocumentoHttpSoap12Endpoint = new QName("http://servizi.protocollo.ws.dedagroup.it", "SpedisciDocumentoHttpSoap12Endpoint");
    static {
        WSDL_LOCATION = null;
    }

    public SpedisciDocumento(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SpedisciDocumento(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpedisciDocumento() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SpedisciDocumentoPortType
     */
    @WebEndpoint(name = "SpedisciDocumentoHttpEndpoint")
    public SpedisciDocumentoPortType getSpedisciDocumentoHttpEndpoint() {
        return super.getPort(SpedisciDocumentoHttpEndpoint, SpedisciDocumentoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpedisciDocumentoPortType
     */
    @WebEndpoint(name = "SpedisciDocumentoHttpEndpoint")
    public SpedisciDocumentoPortType getSpedisciDocumentoHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(SpedisciDocumentoHttpEndpoint, SpedisciDocumentoPortType.class, features);
    }
    /**
     *
     * @return
     *     returns SpedisciDocumentoPortType
     */
    @WebEndpoint(name = "SpedisciDocumentoHttpSoap11Endpoint")
    public SpedisciDocumentoPortType getSpedisciDocumentoHttpSoap11Endpoint() {
        return super.getPort(SpedisciDocumentoHttpSoap11Endpoint, SpedisciDocumentoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpedisciDocumentoPortType
     */
    @WebEndpoint(name = "SpedisciDocumentoHttpSoap11Endpoint")
    public SpedisciDocumentoPortType getSpedisciDocumentoHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(SpedisciDocumentoHttpSoap11Endpoint, SpedisciDocumentoPortType.class, features);
    }
    /**
     *
     * @return
     *     returns SpedisciDocumentoPortType
     */
    @WebEndpoint(name = "SpedisciDocumentoHttpSoap12Endpoint")
    public SpedisciDocumentoPortType getSpedisciDocumentoHttpSoap12Endpoint() {
        return super.getPort(SpedisciDocumentoHttpSoap12Endpoint, SpedisciDocumentoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpedisciDocumentoPortType
     */
    @WebEndpoint(name = "SpedisciDocumentoHttpSoap12Endpoint")
    public SpedisciDocumentoPortType getSpedisciDocumentoHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(SpedisciDocumentoHttpSoap12Endpoint, SpedisciDocumentoPortType.class, features);
    }

}
