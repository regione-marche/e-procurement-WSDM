
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.744+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardIndexesVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardIndexesVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardIndexesVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardIndexesVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardIndexesVisibilityFaultFaultFaultMessage(String message, it.archiflow96.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardIndexesVisibilityFaultFaultFaultMessage(String message, it.archiflow96.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow96.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
