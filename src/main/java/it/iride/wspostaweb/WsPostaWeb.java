package it.iride.wspostaweb;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-11-25T10:25:06.805+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "WsPostaWeb", 
                  targetNamespace = "http://tempuri.org/") 
public class WsPostaWeb extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "WsPostaWeb");
    public final static QName WsPostaWebSoap = new QName("http://tempuri.org/", "WsPostaWebSoap");
    static {
        WSDL_LOCATION = null;
    }

    public WsPostaWeb(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsPostaWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsPostaWeb() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns WsPostaWebSoap
     */
    @WebEndpoint(name = "WsPostaWebSoap")
    public WsPostaWebSoap getWsPostaWebSoap() {
        return super.getPort(WsPostaWebSoap, WsPostaWebSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsPostaWebSoap
     */
    @WebEndpoint(name = "WsPostaWebSoap")
    public WsPostaWebSoap getWsPostaWebSoap(WebServiceFeature... features) {
        return super.getPort(WsPostaWebSoap, WsPostaWebSoap.class, features);
    }

}
