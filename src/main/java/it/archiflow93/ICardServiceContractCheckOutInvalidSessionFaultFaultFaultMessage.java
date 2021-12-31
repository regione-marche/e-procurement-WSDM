
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:03.843+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractCheckOutInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractCheckOutInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractCheckOutInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractCheckOutInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractCheckOutInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractCheckOutInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow93.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
