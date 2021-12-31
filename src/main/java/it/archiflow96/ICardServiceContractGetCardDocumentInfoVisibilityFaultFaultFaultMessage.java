
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:01.999+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardDocumentInfoVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardDocumentInfoVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardDocumentInfoVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardDocumentInfoVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardDocumentInfoVisibilityFaultFaultFaultMessage(String message, it.archiflow96.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardDocumentInfoVisibilityFaultFaultFaultMessage(String message, it.archiflow96.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow96.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
