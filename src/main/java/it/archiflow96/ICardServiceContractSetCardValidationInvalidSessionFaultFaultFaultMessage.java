
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.544+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSetCardValidationInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractSetCardValidationInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSetCardValidationInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSetCardValidationInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSetCardValidationInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractSetCardValidationInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow96.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
