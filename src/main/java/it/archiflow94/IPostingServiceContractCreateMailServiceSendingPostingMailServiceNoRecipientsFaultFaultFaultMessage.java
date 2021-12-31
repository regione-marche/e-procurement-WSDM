
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:16.358+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingMailServiceNoRecipientsFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoRecipientsFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.PostingMailServiceNoRecipientsFault postingMailServiceNoRecipientsFault;

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoRecipientsFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoRecipientsFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoRecipientsFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoRecipientsFaultFaultFaultMessage(String message, it.archiflow94.PostingMailServiceNoRecipientsFault postingMailServiceNoRecipientsFault) {
        super(message);
        this.postingMailServiceNoRecipientsFault = postingMailServiceNoRecipientsFault;
    }

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoRecipientsFaultFaultFaultMessage(String message, it.archiflow94.PostingMailServiceNoRecipientsFault postingMailServiceNoRecipientsFault, Throwable cause) {
        super(message, cause);
        this.postingMailServiceNoRecipientsFault = postingMailServiceNoRecipientsFault;
    }

    public it.archiflow94.PostingMailServiceNoRecipientsFault getFaultInfo() {
        return this.postingMailServiceNoRecipientsFault;
    }
}