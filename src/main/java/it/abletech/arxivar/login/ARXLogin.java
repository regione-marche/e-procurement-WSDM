package it.abletech.arxivar.login;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2015-01-29T17:05:53.821+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "ARX_Login", 
                  targetNamespace = "http://www.Abletech.it/Arxivar") 
public class ARXLogin extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.Abletech.it/Arxivar", "ARX_Login");
    public final static QName ARXLoginSoap12 = new QName("http://www.Abletech.it/Arxivar", "ARX_LoginSoap12");
    public final static QName ARXLoginSoap = new QName("http://www.Abletech.it/Arxivar", "ARX_LoginSoap");
    public final static QName ARXLoginHttpPost = new QName("http://www.Abletech.it/Arxivar", "ARX_LoginHttpPost");
    public final static QName ARXLoginHttpGet = new QName("http://www.Abletech.it/Arxivar", "ARX_LoginHttpGet");
    static {
        WSDL_LOCATION = null;
    }

    public ARXLogin(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ARXLogin(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ARXLogin() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ARXLoginSoap
     */
    @WebEndpoint(name = "ARX_LoginSoap12")
    public ARXLoginSoap getARXLoginSoap12() {
        return super.getPort(ARXLoginSoap12, ARXLoginSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ARXLoginSoap
     */
    @WebEndpoint(name = "ARX_LoginSoap12")
    public ARXLoginSoap getARXLoginSoap12(WebServiceFeature... features) {
        return super.getPort(ARXLoginSoap12, ARXLoginSoap.class, features);
    }
    /**
     *
     * @return
     *     returns ARXLoginSoap
     */
    @WebEndpoint(name = "ARX_LoginSoap")
    public ARXLoginSoap getARXLoginSoap() {
        return super.getPort(ARXLoginSoap, ARXLoginSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ARXLoginSoap
     */
    @WebEndpoint(name = "ARX_LoginSoap")
    public ARXLoginSoap getARXLoginSoap(WebServiceFeature... features) {
        return super.getPort(ARXLoginSoap, ARXLoginSoap.class, features);
    }
    /**
     *
     * @return
     *     returns ARXLoginHttpPost
     */
    @WebEndpoint(name = "ARX_LoginHttpPost")
    public ARXLoginHttpPost getARXLoginHttpPost() {
        return super.getPort(ARXLoginHttpPost, ARXLoginHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ARXLoginHttpPost
     */
    @WebEndpoint(name = "ARX_LoginHttpPost")
    public ARXLoginHttpPost getARXLoginHttpPost(WebServiceFeature... features) {
        return super.getPort(ARXLoginHttpPost, ARXLoginHttpPost.class, features);
    }
    /**
     *
     * @return
     *     returns ARXLoginHttpGet
     */
    @WebEndpoint(name = "ARX_LoginHttpGet")
    public ARXLoginHttpGet getARXLoginHttpGet() {
        return super.getPort(ARXLoginHttpGet, ARXLoginHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ARXLoginHttpGet
     */
    @WebEndpoint(name = "ARX_LoginHttpGet")
    public ARXLoginHttpGet getARXLoginHttpGet(WebServiceFeature... features) {
        return super.getPort(ARXLoginHttpGet, ARXLoginHttpGet.class, features);
    }

}
