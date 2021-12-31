
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.057+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendEMailInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.InvalidSessionFault invalidSessionFault;

    public IEMailServiceContractSendEMailInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendEMailInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendEMailInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendEMailInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.email.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public IEMailServiceContractSendEMailInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.email.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow96.email.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
