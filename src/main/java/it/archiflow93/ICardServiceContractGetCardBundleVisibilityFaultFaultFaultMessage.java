
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.757+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.VisibilityFault visibilityFault;

    public ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage(String message, it.archiflow93.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public ICardServiceContractGetCardBundleVisibilityFaultFaultFaultMessage(String message, it.archiflow93.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow93.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}