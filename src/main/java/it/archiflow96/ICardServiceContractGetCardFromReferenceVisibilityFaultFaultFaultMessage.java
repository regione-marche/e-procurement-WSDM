
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.524+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardFromReferenceVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardFromReferenceVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardFromReferenceVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardFromReferenceVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardFromReferenceVisibilityFaultFaultFaultMessage(String message, it.archiflow96.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardFromReferenceVisibilityFaultFaultFaultMessage(String message, it.archiflow96.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow96.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
