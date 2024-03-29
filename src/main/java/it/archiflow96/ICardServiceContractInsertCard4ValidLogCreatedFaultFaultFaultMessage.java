
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.634+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ValidLogCreatedFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCard4ValidLogCreatedFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.ValidLogCreatedFault validLogCreatedFault;

    public ICardServiceContractInsertCard4ValidLogCreatedFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCard4ValidLogCreatedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCard4ValidLogCreatedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCard4ValidLogCreatedFaultFaultFaultMessage(String message, it.archiflow96.ValidLogCreatedFault validLogCreatedFault) {
        super(message);
        this.validLogCreatedFault = validLogCreatedFault;
    }

    public ICardServiceContractInsertCard4ValidLogCreatedFaultFaultFaultMessage(String message, it.archiflow96.ValidLogCreatedFault validLogCreatedFault, Throwable cause) {
        super(message, cause);
        this.validLogCreatedFault = validLogCreatedFault;
    }

    public it.archiflow96.ValidLogCreatedFault getFaultInfo() {
        return this.validLogCreatedFault;
    }
}
