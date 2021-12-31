
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.090+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendHiddenExtEMailInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.InvalidSessionFault invalidSessionFault;

    public IEMailServiceContractSendHiddenExtEMailInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendHiddenExtEMailInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendHiddenExtEMailInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendHiddenExtEMailInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.email.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public IEMailServiceContractSendHiddenExtEMailInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.email.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow96.email.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
