package it.archiflow96.classification;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:06.829+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "ClassificationService", 
                  targetNamespace = "http://tempuri.org/") 
public class ClassificationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ClassificationService");
    public final static QName ClassificationBaseHTTP = new QName("http://tempuri.org/", "Classification.BaseHTTP");
    public final static QName ClassificationBaseHTTPS = new QName("http://tempuri.org/", "Classification.BaseHTTPS");
    static {
        WSDL_LOCATION = null;
    }

    public ClassificationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClassificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClassificationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IClassificationService
     */
    @WebEndpoint(name = "Classification.BaseHTTP")
    public IClassificationService getClassificationBaseHTTP() {
        return super.getPort(ClassificationBaseHTTP, IClassificationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IClassificationService
     */
    @WebEndpoint(name = "Classification.BaseHTTP")
    public IClassificationService getClassificationBaseHTTP(WebServiceFeature... features) {
        return super.getPort(ClassificationBaseHTTP, IClassificationService.class, features);
    }
    /**
     *
     * @return
     *     returns IClassificationService
     */
    @WebEndpoint(name = "Classification.BaseHTTPS")
    public IClassificationService getClassificationBaseHTTPS() {
        return super.getPort(ClassificationBaseHTTPS, IClassificationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IClassificationService
     */
    @WebEndpoint(name = "Classification.BaseHTTPS")
    public IClassificationService getClassificationBaseHTTPS(WebServiceFeature... features) {
        return super.getPort(ClassificationBaseHTTPS, IClassificationService.class, features);
    }

}
