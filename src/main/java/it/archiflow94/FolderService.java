package it.archiflow94;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:15.528+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "FolderService", 
                  targetNamespace = "http://tempuri.org/") 
public class FolderService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "FolderService");
    public final static QName SIAVArchiflowBaseHTTP = new QName("http://tempuri.org/", "SIAV.Archiflow.BaseHTTP");
    public final static QName SIAVArchiflowBaseHTTPS = new QName("http://tempuri.org/", "SIAV.Archiflow.BaseHTTPS");
    static {
        WSDL_LOCATION = null;
    }

    public FolderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FolderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FolderService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IFolderServiceContract
     */
    @WebEndpoint(name = "SIAV.Archiflow.BaseHTTP")
    public IFolderServiceContract getSIAVArchiflowBaseHTTP() {
        return super.getPort(SIAVArchiflowBaseHTTP, IFolderServiceContract.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IFolderServiceContract
     */
    @WebEndpoint(name = "SIAV.Archiflow.BaseHTTP")
    public IFolderServiceContract getSIAVArchiflowBaseHTTP(WebServiceFeature... features) {
        return super.getPort(SIAVArchiflowBaseHTTP, IFolderServiceContract.class, features);
    }
    /**
     *
     * @return
     *     returns IFolderServiceContract
     */
    @WebEndpoint(name = "SIAV.Archiflow.BaseHTTPS")
    public IFolderServiceContract getSIAVArchiflowBaseHTTPS() {
        return super.getPort(SIAVArchiflowBaseHTTPS, IFolderServiceContract.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IFolderServiceContract
     */
    @WebEndpoint(name = "SIAV.Archiflow.BaseHTTPS")
    public IFolderServiceContract getSIAVArchiflowBaseHTTPS(WebServiceFeature... features) {
        return super.getPort(SIAVArchiflowBaseHTTPS, IFolderServiceContract.class, features);
    }

}
