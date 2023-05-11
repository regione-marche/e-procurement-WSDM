package it.marche.regione.paleowssec;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-23T08:46:37.402+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "PaleoService", 
                  targetNamespace = "http://paleo.regione.marche.it/services/") 
public class PaleoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://paleo.regione.marche.it/services/", "PaleoService");
    public final static QName WS2007HttpBindingIPaleoService = new QName("http://paleo.regione.marche.it/services/", "WS2007HttpBinding_IPaleoService");
    static {
        WSDL_LOCATION = null;
    }

    public PaleoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PaleoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaleoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IPaleoService
     */
    @WebEndpoint(name = "WS2007HttpBinding_IPaleoService")
    public IPaleoService getWS2007HttpBindingIPaleoService() {
        return super.getPort(WS2007HttpBindingIPaleoService, IPaleoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPaleoService
     */
    @WebEndpoint(name = "WS2007HttpBinding_IPaleoService")
    public IPaleoService getWS2007HttpBindingIPaleoService(WebServiceFeature... features) {
        return super.getPort(WS2007HttpBindingIPaleoService, IPaleoService.class, features);
    }

}
