package com.jprotocol.webservices;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-03-24T08:41:11.562+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "WsFascicoli", 
                  targetNamespace = "http://WebServices.jprotocol.com/") 
public class WsFascicoli_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://WebServices.jprotocol.com/", "WsFascicoli");
    public final static QName WsFascicoliPort = new QName("http://WebServices.jprotocol.com/", "WsFascicoliPort");
    static {
        WSDL_LOCATION = null;
    }

    public WsFascicoli_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsFascicoli_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsFascicoli_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns WsFascicoli
     */
    @WebEndpoint(name = "WsFascicoliPort")
    public WsFascicoli getWsFascicoliPort() {
        return super.getPort(WsFascicoliPort, WsFascicoli.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsFascicoli
     */
    @WebEndpoint(name = "WsFascicoliPort")
    public WsFascicoli getWsFascicoliPort(WebServiceFeature... features) {
        return super.getPort(WsFascicoliPort, WsFascicoli.class, features);
    }

}
