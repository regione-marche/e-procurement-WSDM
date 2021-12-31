
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.924+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoRightsFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendEMailMsgNoRightsFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.NoRightsFault noRightsFault;

    public IEMailServiceContractSendEMailMsgNoRightsFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendEMailMsgNoRightsFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendEMailMsgNoRightsFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendEMailMsgNoRightsFaultFaultFaultMessage(String message, it.archiflow96.email.NoRightsFault noRightsFault) {
        super(message);
        this.noRightsFault = noRightsFault;
    }

    public IEMailServiceContractSendEMailMsgNoRightsFaultFaultFaultMessage(String message, it.archiflow96.email.NoRightsFault noRightsFault, Throwable cause) {
        super(message, cause);
        this.noRightsFault = noRightsFault;
    }

    public it.archiflow96.email.NoRightsFault getFaultInfo() {
        return this.noRightsFault;
    }
}
