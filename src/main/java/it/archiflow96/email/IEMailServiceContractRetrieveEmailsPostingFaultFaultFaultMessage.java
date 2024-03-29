
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.958+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractRetrieveEmailsPostingFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.PostingFault postingFault;

    public IEMailServiceContractRetrieveEmailsPostingFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractRetrieveEmailsPostingFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractRetrieveEmailsPostingFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractRetrieveEmailsPostingFaultFaultFaultMessage(String message, it.archiflow96.email.PostingFault postingFault) {
        super(message);
        this.postingFault = postingFault;
    }

    public IEMailServiceContractRetrieveEmailsPostingFaultFaultFaultMessage(String message, it.archiflow96.email.PostingFault postingFault, Throwable cause) {
        super(message, cause);
        this.postingFault = postingFault;
    }

    public it.archiflow96.email.PostingFault getFaultInfo() {
        return this.postingFault;
    }
}
