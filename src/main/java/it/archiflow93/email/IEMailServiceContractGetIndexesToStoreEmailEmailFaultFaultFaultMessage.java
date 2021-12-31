
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.285+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "EmailFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetIndexesToStoreEmailEmailFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.EmailFault emailFault;

    public IEMailServiceContractGetIndexesToStoreEmailEmailFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetIndexesToStoreEmailEmailFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetIndexesToStoreEmailEmailFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetIndexesToStoreEmailEmailFaultFaultFaultMessage(String message, it.archiflow93.email.EmailFault emailFault) {
        super(message);
        this.emailFault = emailFault;
    }

    public IEMailServiceContractGetIndexesToStoreEmailEmailFaultFaultFaultMessage(String message, it.archiflow93.email.EmailFault emailFault, Throwable cause) {
        super(message, cause);
        this.emailFault = emailFault;
    }

    public it.archiflow93.email.EmailFault getFaultInfo() {
        return this.emailFault;
    }
}
