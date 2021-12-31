
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:01.902+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCard1VisibilityEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.VisibilityEmptyFault visibilityEmptyFault;

    public ICardServiceContractInsertCard1VisibilityEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCard1VisibilityEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCard1VisibilityEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCard1VisibilityEmptyFaultFaultFaultMessage(String message, it.archiflow96.VisibilityEmptyFault visibilityEmptyFault) {
        super(message);
        this.visibilityEmptyFault = visibilityEmptyFault;
    }

    public ICardServiceContractInsertCard1VisibilityEmptyFaultFaultFaultMessage(String message, it.archiflow96.VisibilityEmptyFault visibilityEmptyFault, Throwable cause) {
        super(message, cause);
        this.visibilityEmptyFault = visibilityEmptyFault;
    }

    public it.archiflow96.VisibilityEmptyFault getFaultInfo() {
        return this.visibilityEmptyFault;
    }
}
