
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.587+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractRetrieveEmailPostingFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.PostingFault postingFault;

    public IEMailServiceContractRetrieveEmailPostingFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractRetrieveEmailPostingFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractRetrieveEmailPostingFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractRetrieveEmailPostingFaultFaultFaultMessage(String message, it.archiflow93.email.PostingFault postingFault) {
        super(message);
        this.postingFault = postingFault;
    }

    public IEMailServiceContractRetrieveEmailPostingFaultFaultFaultMessage(String message, it.archiflow93.email.PostingFault postingFault, Throwable cause) {
        super(message, cause);
        this.postingFault = postingFault;
    }

    public it.archiflow93.email.PostingFault getFaultInfo() {
        return this.postingFault;
    }
}