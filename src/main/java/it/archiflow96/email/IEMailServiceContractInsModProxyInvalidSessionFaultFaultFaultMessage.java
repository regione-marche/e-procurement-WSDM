
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.150+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractInsModProxyInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.InvalidSessionFault invalidSessionFault;

    public IEMailServiceContractInsModProxyInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractInsModProxyInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractInsModProxyInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractInsModProxyInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.email.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public IEMailServiceContractInsModProxyInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.email.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow96.email.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
