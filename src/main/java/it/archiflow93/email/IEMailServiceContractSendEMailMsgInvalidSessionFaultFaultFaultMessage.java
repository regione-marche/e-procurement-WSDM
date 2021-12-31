
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.325+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendEMailMsgInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.InvalidSessionFault invalidSessionFault;

    public IEMailServiceContractSendEMailMsgInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendEMailMsgInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendEMailMsgInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendEMailMsgInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.email.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public IEMailServiceContractSendEMailMsgInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.email.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow93.email.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
