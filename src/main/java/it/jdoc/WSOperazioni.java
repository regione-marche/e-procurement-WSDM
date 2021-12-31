package it.jdoc;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-09-08T16:05:30.708+02:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "WS_Operazioni", 
                  targetNamespace = "http://tempuri.org/") 
public class WSOperazioni extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "WS_Operazioni");
    public final static QName BasicHttpBindingIWSOperazioni = new QName("http://tempuri.org/", "BasicHttpBinding_IWS_Operazioni");
    static {
        WSDL_LOCATION = null;
    }

    public WSOperazioni(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSOperazioni(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSOperazioni() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IWSOperazioni
     */
    @WebEndpoint(name = "BasicHttpBinding_IWS_Operazioni")
    public IWSOperazioni getBasicHttpBindingIWSOperazioni() {
        return super.getPort(BasicHttpBindingIWSOperazioni, IWSOperazioni.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWSOperazioni
     */
    @WebEndpoint(name = "BasicHttpBinding_IWS_Operazioni")
    public IWSOperazioni getBasicHttpBindingIWSOperazioni(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIWSOperazioni, IWSOperazioni.class, features);
    }

}
