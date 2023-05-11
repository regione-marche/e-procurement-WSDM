package it.kdm.docer.core.authentication;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2021-07-15T14:46:50.663+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "AuthenticationService", 
                  targetNamespace = "http://authentication.core.docer.kdm.it") 
public class AuthenticationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://authentication.core.docer.kdm.it", "AuthenticationService");
    public final static QName AuthenticationServiceHttpsSoap11Endpoint = new QName("http://authentication.core.docer.kdm.it", "AuthenticationServiceHttpsSoap11Endpoint");
    public final static QName AuthenticationServiceHttpsEndpoint = new QName("http://authentication.core.docer.kdm.it", "AuthenticationServiceHttpsEndpoint");
    public final static QName AuthenticationServiceHttpsSoap12Endpoint = new QName("http://authentication.core.docer.kdm.it", "AuthenticationServiceHttpsSoap12Endpoint");
    static {
        WSDL_LOCATION = null;
    }

    public AuthenticationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuthenticationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthenticationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AuthenticationServicePortType
     */
    @WebEndpoint(name = "AuthenticationServiceHttpsSoap11Endpoint")
    public AuthenticationServicePortType getAuthenticationServiceHttpsSoap11Endpoint() {
        return super.getPort(AuthenticationServiceHttpsSoap11Endpoint, AuthenticationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticationServicePortType
     */
    @WebEndpoint(name = "AuthenticationServiceHttpsSoap11Endpoint")
    public AuthenticationServicePortType getAuthenticationServiceHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(AuthenticationServiceHttpsSoap11Endpoint, AuthenticationServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AuthenticationServicePortType
     */
    @WebEndpoint(name = "AuthenticationServiceHttpsEndpoint")
    public AuthenticationServicePortType getAuthenticationServiceHttpsEndpoint() {
        return super.getPort(AuthenticationServiceHttpsEndpoint, AuthenticationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticationServicePortType
     */
    @WebEndpoint(name = "AuthenticationServiceHttpsEndpoint")
    public AuthenticationServicePortType getAuthenticationServiceHttpsEndpoint(WebServiceFeature... features) {
        return super.getPort(AuthenticationServiceHttpsEndpoint, AuthenticationServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AuthenticationServicePortType
     */
    @WebEndpoint(name = "AuthenticationServiceHttpsSoap12Endpoint")
    public AuthenticationServicePortType getAuthenticationServiceHttpsSoap12Endpoint() {
        return super.getPort(AuthenticationServiceHttpsSoap12Endpoint, AuthenticationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticationServicePortType
     */
    @WebEndpoint(name = "AuthenticationServiceHttpsSoap12Endpoint")
    public AuthenticationServicePortType getAuthenticationServiceHttpsSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(AuthenticationServiceHttpsSoap12Endpoint, AuthenticationServicePortType.class, features);
    }

}
