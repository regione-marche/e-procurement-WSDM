package it.sispi.protocollo;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-10-12T15:01:02.992+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "ProtocolloService", 
                  targetNamespace = "http://protocollo.sispi.it") 
public class ProtocolloService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://protocollo.sispi.it", "ProtocolloService");
    public final static QName ProtocolloServicePort = new QName("http://protocollo.sispi.it", "ProtocolloServicePort");
    static {
        WSDL_LOCATION = null;
    }

    public ProtocolloService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProtocolloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProtocolloService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Protocollo
     */
    @WebEndpoint(name = "ProtocolloServicePort")
    public Protocollo getProtocolloServicePort() {
        return super.getPort(ProtocolloServicePort, Protocollo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Protocollo
     */
    @WebEndpoint(name = "ProtocolloServicePort")
    public Protocollo getProtocolloServicePort(WebServiceFeature... features) {
        return super.getPort(ProtocolloServicePort, Protocollo.class, features);
    }

}
