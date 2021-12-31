
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.029+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingMailServiceNoSenderFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoSenderFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.PostingMailServiceNoSenderFault postingMailServiceNoSenderFault;

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoSenderFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoSenderFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoSenderFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoSenderFaultFaultFaultMessage(String message, it.archiflow96.PostingMailServiceNoSenderFault postingMailServiceNoSenderFault) {
        super(message);
        this.postingMailServiceNoSenderFault = postingMailServiceNoSenderFault;
    }

    public IPostingServiceContractCreateMailServiceSendingPostingMailServiceNoSenderFaultFaultFaultMessage(String message, it.archiflow96.PostingMailServiceNoSenderFault postingMailServiceNoSenderFault, Throwable cause) {
        super(message, cause);
        this.postingMailServiceNoSenderFault = postingMailServiceNoSenderFault;
    }

    public it.archiflow96.PostingMailServiceNoSenderFault getFaultInfo() {
        return this.postingMailServiceNoSenderFault;
    }
}