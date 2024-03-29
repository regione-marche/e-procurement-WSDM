package it.dedagroup.ws.salvadocumento.servizi;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-10-01T16:37:06.188+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "SalvaDocumento", 
                  targetNamespace = "http://servizi.protocollo.ws.dedagroup.it") 
public class SalvaDocumento extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servizi.protocollo.ws.dedagroup.it", "SalvaDocumento");
    public final static QName SalvaDocumentoHttpSoap11Endpoint = new QName("http://servizi.protocollo.ws.dedagroup.it", "SalvaDocumentoHttpSoap11Endpoint");
    public final static QName SalvaDocumentoHttpSoap12Endpoint = new QName("http://servizi.protocollo.ws.dedagroup.it", "SalvaDocumentoHttpSoap12Endpoint");
    public final static QName SalvaDocumentoHttpEndpoint = new QName("http://servizi.protocollo.ws.dedagroup.it", "SalvaDocumentoHttpEndpoint");
    static {
        WSDL_LOCATION = null;
    }

    public SalvaDocumento(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SalvaDocumento(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalvaDocumento() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SalvaDocumentoPortType
     */
    @WebEndpoint(name = "SalvaDocumentoHttpSoap11Endpoint")
    public SalvaDocumentoPortType getSalvaDocumentoHttpSoap11Endpoint() {
        return super.getPort(SalvaDocumentoHttpSoap11Endpoint, SalvaDocumentoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalvaDocumentoPortType
     */
    @WebEndpoint(name = "SalvaDocumentoHttpSoap11Endpoint")
    public SalvaDocumentoPortType getSalvaDocumentoHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(SalvaDocumentoHttpSoap11Endpoint, SalvaDocumentoPortType.class, features);
    }
    /**
     *
     * @return
     *     returns SalvaDocumentoPortType
     */
    @WebEndpoint(name = "SalvaDocumentoHttpSoap12Endpoint")
    public SalvaDocumentoPortType getSalvaDocumentoHttpSoap12Endpoint() {
        return super.getPort(SalvaDocumentoHttpSoap12Endpoint, SalvaDocumentoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalvaDocumentoPortType
     */
    @WebEndpoint(name = "SalvaDocumentoHttpSoap12Endpoint")
    public SalvaDocumentoPortType getSalvaDocumentoHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(SalvaDocumentoHttpSoap12Endpoint, SalvaDocumentoPortType.class, features);
    }
    /**
     *
     * @return
     *     returns SalvaDocumentoPortType
     */
    @WebEndpoint(name = "SalvaDocumentoHttpEndpoint")
    public SalvaDocumentoPortType getSalvaDocumentoHttpEndpoint() {
        return super.getPort(SalvaDocumentoHttpEndpoint, SalvaDocumentoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalvaDocumentoPortType
     */
    @WebEndpoint(name = "SalvaDocumentoHttpEndpoint")
    public SalvaDocumentoPortType getSalvaDocumentoHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(SalvaDocumentoHttpEndpoint, SalvaDocumentoPortType.class, features);
    }

}
