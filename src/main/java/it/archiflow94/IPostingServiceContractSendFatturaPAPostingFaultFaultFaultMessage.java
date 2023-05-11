
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:16.338+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PostingFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractSendFatturaPAPostingFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.PostingFault postingFault;

    public IPostingServiceContractSendFatturaPAPostingFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractSendFatturaPAPostingFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractSendFatturaPAPostingFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractSendFatturaPAPostingFaultFaultFaultMessage(String message, it.archiflow94.PostingFault postingFault) {
        super(message);
        this.postingFault = postingFault;
    }

    public IPostingServiceContractSendFatturaPAPostingFaultFaultFaultMessage(String message, it.archiflow94.PostingFault postingFault, Throwable cause) {
        super(message, cause);
        this.postingFault = postingFault;
    }

    public it.archiflow94.PostingFault getFaultInfo() {
        return this.postingFault;
    }
}
