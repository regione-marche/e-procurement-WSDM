package it.finmatica.dmserver.wscxf.service;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-21T09:20:55.398+01:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "AttachServiceService", 
                  targetNamespace = "http://service.wscxf.dmServer.finmatica.it/") 
public class AttachServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.wscxf.dmServer.finmatica.it/", "AttachServiceService");
    public final static QName AttachServicePort = new QName("http://service.wscxf.dmServer.finmatica.it/", "AttachServicePort");
    static {
        WSDL_LOCATION = null;
    }

    public AttachServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AttachServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AttachServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AttachService
     */
    @WebEndpoint(name = "AttachServicePort")
    public AttachService getAttachServicePort() {
        return super.getPort(AttachServicePort, AttachService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AttachService
     */
    @WebEndpoint(name = "AttachServicePort")
    public AttachService getAttachServicePort(WebServiceFeature... features) {
        return super.getPort(AttachServicePort, AttachService.class, features);
    }

}
