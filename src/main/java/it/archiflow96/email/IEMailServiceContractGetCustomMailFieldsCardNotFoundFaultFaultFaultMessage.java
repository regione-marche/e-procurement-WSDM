
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.120+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "CardNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.CardNotFoundFault cardNotFoundFault;

    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message, it.archiflow96.email.CardNotFoundFault cardNotFoundFault) {
        super(message);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message, it.archiflow96.email.CardNotFoundFault cardNotFoundFault, Throwable cause) {
        super(message, cause);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public it.archiflow96.email.CardNotFoundFault getFaultInfo() {
        return this.cardNotFoundFault;
    }
}
