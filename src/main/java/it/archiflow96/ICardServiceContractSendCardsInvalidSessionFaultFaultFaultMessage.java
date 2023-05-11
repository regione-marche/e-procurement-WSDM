
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.718+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSendCardsInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractSendCardsInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSendCardsInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSendCardsInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSendCardsInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractSendCardsInvalidSessionFaultFaultFaultMessage(String message, it.archiflow96.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow96.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
