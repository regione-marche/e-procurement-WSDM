
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.408+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardAttachmentInChunkInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractGetCardAttachmentInChunkInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardAttachmentInChunkInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardAttachmentInChunkInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardAttachmentInChunkInvalidSessionFaultFaultFaultMessage(String message, it.archiflow94.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractGetCardAttachmentInChunkInvalidSessionFaultFaultFaultMessage(String message, it.archiflow94.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow94.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
