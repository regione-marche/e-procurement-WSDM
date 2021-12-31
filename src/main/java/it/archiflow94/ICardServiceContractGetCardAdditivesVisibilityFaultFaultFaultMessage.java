
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.448+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardAdditivesVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardAdditivesVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardAdditivesVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardAdditivesVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardAdditivesVisibilityFaultFaultFaultMessage(String message, it.archiflow94.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardAdditivesVisibilityFaultFaultFaultMessage(String message, it.archiflow94.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow94.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
