
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.016+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCards2VisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.VisibilityFault visibilityFault;

    public ICardServiceContractGetCards2VisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCards2VisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCards2VisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCards2VisibilityFaultFaultFaultMessage(String message, it.archiflow93.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCards2VisibilityFaultFaultFaultMessage(String message, it.archiflow93.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow93.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
