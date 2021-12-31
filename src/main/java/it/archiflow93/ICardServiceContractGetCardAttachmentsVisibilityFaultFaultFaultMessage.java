
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:03.966+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message, it.archiflow93.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardAttachmentsVisibilityFaultFaultFaultMessage(String message, it.archiflow93.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow93.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
