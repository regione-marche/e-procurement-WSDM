package it.iride.wsprotocollodm;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-16T15:25:58.389+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "Protocollo", 
                  targetNamespace = "http://tempuri.org/") 
public class Protocollo extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Protocollo");
    public final static QName ProtocolloHttpGet = new QName("http://tempuri.org/", "ProtocolloHttpGet");
    public final static QName ProtocolloSoap12 = new QName("http://tempuri.org/", "ProtocolloSoap12");
    public final static QName ProtocolloSoap = new QName("http://tempuri.org/", "ProtocolloSoap");
    public final static QName ProtocolloHttpPost = new QName("http://tempuri.org/", "ProtocolloHttpPost");
    static {
        WSDL_LOCATION = null;
    }

    public Protocollo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Protocollo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Protocollo() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ProtocolloHttpGet
     */
    @WebEndpoint(name = "ProtocolloHttpGet")
    public ProtocolloHttpGet getProtocolloHttpGet() {
        return super.getPort(ProtocolloHttpGet, ProtocolloHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProtocolloHttpGet
     */
    @WebEndpoint(name = "ProtocolloHttpGet")
    public ProtocolloHttpGet getProtocolloHttpGet(WebServiceFeature... features) {
        return super.getPort(ProtocolloHttpGet, ProtocolloHttpGet.class, features);
    }
    /**
     *
     * @return
     *     returns ProtocolloSoap
     */
    @WebEndpoint(name = "ProtocolloSoap12")
    public ProtocolloSoap getProtocolloSoap12() {
        return super.getPort(ProtocolloSoap12, ProtocolloSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProtocolloSoap
     */
    @WebEndpoint(name = "ProtocolloSoap12")
    public ProtocolloSoap getProtocolloSoap12(WebServiceFeature... features) {
        return super.getPort(ProtocolloSoap12, ProtocolloSoap.class, features);
    }
    /**
     *
     * @return
     *     returns ProtocolloSoap
     */
    @WebEndpoint(name = "ProtocolloSoap")
    public ProtocolloSoap getProtocolloSoap() {
        return super.getPort(ProtocolloSoap, ProtocolloSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProtocolloSoap
     */
    @WebEndpoint(name = "ProtocolloSoap")
    public ProtocolloSoap getProtocolloSoap(WebServiceFeature... features) {
        return super.getPort(ProtocolloSoap, ProtocolloSoap.class, features);
    }
    /**
     *
     * @return
     *     returns ProtocolloHttpPost
     */
    @WebEndpoint(name = "ProtocolloHttpPost")
    public ProtocolloHttpPost getProtocolloHttpPost() {
        return super.getPort(ProtocolloHttpPost, ProtocolloHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProtocolloHttpPost
     */
    @WebEndpoint(name = "ProtocolloHttpPost")
    public ProtocolloHttpPost getProtocolloHttpPost(WebServiceFeature... features) {
        return super.getPort(ProtocolloHttpPost, ProtocolloHttpPost.class, features);
    }

}
