package com.jprotocol.webservices;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-03-24T08:41:12.022+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "WsProtocollaSilente", 
                  targetNamespace = "http://WebServices.jprotocol.com/") 
public class WsProtocollaSilente_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://WebServices.jprotocol.com/", "WsProtocollaSilente");
    public final static QName WsProtocollaSilentePort = new QName("http://WebServices.jprotocol.com/", "WsProtocollaSilentePort");
    static {
        WSDL_LOCATION = null;
    }

    public WsProtocollaSilente_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsProtocollaSilente_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsProtocollaSilente_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns WsProtocollaSilente
     */
    @WebEndpoint(name = "WsProtocollaSilentePort")
    public WsProtocollaSilente getWsProtocollaSilentePort() {
        return super.getPort(WsProtocollaSilentePort, WsProtocollaSilente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsProtocollaSilente
     */
    @WebEndpoint(name = "WsProtocollaSilentePort")
    public WsProtocollaSilente getWsProtocollaSilentePort(WebServiceFeature... features) {
        return super.getPort(WsProtocollaSilentePort, WsProtocollaSilente.class, features);
    }

}