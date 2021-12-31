
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.931+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "EmailFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetMailBoxesEmailFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.EmailFault emailFault;

    public IEMailServiceContractGetMailBoxesEmailFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetMailBoxesEmailFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetMailBoxesEmailFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetMailBoxesEmailFaultFaultFaultMessage(String message, it.archiflow96.email.EmailFault emailFault) {
        super(message);
        this.emailFault = emailFault;
    }

    public IEMailServiceContractGetMailBoxesEmailFaultFaultFaultMessage(String message, it.archiflow96.email.EmailFault emailFault, Throwable cause) {
        super(message, cause);
        this.emailFault = emailFault;
    }

    public it.archiflow96.email.EmailFault getFaultInfo() {
        return this.emailFault;
    }
}