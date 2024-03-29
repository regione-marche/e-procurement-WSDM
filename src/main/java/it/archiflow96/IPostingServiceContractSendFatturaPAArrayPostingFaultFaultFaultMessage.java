
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:07.766+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractSendFatturaPAArrayPostingFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.PostingFault postingFault;

    public IPostingServiceContractSendFatturaPAArrayPostingFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractSendFatturaPAArrayPostingFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractSendFatturaPAArrayPostingFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractSendFatturaPAArrayPostingFaultFaultFaultMessage(String message, it.archiflow96.PostingFault postingFault) {
        super(message);
        this.postingFault = postingFault;
    }

    public IPostingServiceContractSendFatturaPAArrayPostingFaultFaultFaultMessage(String message, it.archiflow96.PostingFault postingFault, Throwable cause) {
        super(message, cause);
        this.postingFault = postingFault;
    }

    public it.archiflow96.PostingFault getFaultInfo() {
        return this.postingFault;
    }
}
