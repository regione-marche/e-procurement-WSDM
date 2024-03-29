
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.050+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardByParamVisibilityEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.VisibilityEmptyFault visibilityEmptyFault;

    public ICardServiceContractInsertCardByParamVisibilityEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardByParamVisibilityEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardByParamVisibilityEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardByParamVisibilityEmptyFaultFaultFaultMessage(String message, it.archiflow93.VisibilityEmptyFault visibilityEmptyFault) {
        super(message);
        this.visibilityEmptyFault = visibilityEmptyFault;
    }

    public ICardServiceContractInsertCardByParamVisibilityEmptyFaultFaultFaultMessage(String message, it.archiflow93.VisibilityEmptyFault visibilityEmptyFault, Throwable cause) {
        super(message, cause);
        this.visibilityEmptyFault = visibilityEmptyFault;
    }

    public it.archiflow93.VisibilityEmptyFault getFaultInfo() {
        return this.visibilityEmptyFault;
    }
}
