
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.488+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardFromCardVisibilityEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.VisibilityEmptyFault visibilityEmptyFault;

    public ICardServiceContractInsertCardFromCardVisibilityEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardFromCardVisibilityEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardFromCardVisibilityEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardFromCardVisibilityEmptyFaultFaultFaultMessage(String message, it.archiflow94.VisibilityEmptyFault visibilityEmptyFault) {
        super(message);
        this.visibilityEmptyFault = visibilityEmptyFault;
    }

    public ICardServiceContractInsertCardFromCardVisibilityEmptyFaultFaultFaultMessage(String message, it.archiflow94.VisibilityEmptyFault visibilityEmptyFault, Throwable cause) {
        super(message, cause);
        this.visibilityEmptyFault = visibilityEmptyFault;
    }

    public it.archiflow94.VisibilityEmptyFault getFaultInfo() {
        return this.visibilityEmptyFault;
    }
}
