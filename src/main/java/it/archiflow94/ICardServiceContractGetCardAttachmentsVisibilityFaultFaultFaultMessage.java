
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.778+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message, it.archiflow94.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message, it.archiflow94.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow94.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
