
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.033+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingMailServiceMaxRecipientsFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractCreateMailServiceSendingPostingMailServiceMaxRecipientsFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.PostingMailServiceMaxRecipientsFault postingMailServiceMaxRecipientsFault;

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceMaxRecipientsFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceMaxRecipientsFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceMaxRecipientsFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceMaxRecipientsFaultFaultFaultMessage(String message, it.archiflow96.PostingMailServiceMaxRecipientsFault postingMailServiceMaxRecipientsFault) {
        super(message);
        this.postingMailServiceMaxRecipientsFault = postingMailServiceMaxRecipientsFault;
    }

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceMaxRecipientsFaultFaultFaultMessage(String message, it.archiflow96.PostingMailServiceMaxRecipientsFault postingMailServiceMaxRecipientsFault, Throwable cause) {
        super(message, cause);
        this.postingMailServiceMaxRecipientsFault = postingMailServiceMaxRecipientsFault;
    }

    public it.archiflow96.PostingMailServiceMaxRecipientsFault getFaultInfo() {
        return this.postingMailServiceMaxRecipientsFault;
    }
}
