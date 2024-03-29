
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.577+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "CardNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.CardNotFoundFault cardNotFoundFault;

    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message, it.archiflow93.email.CardNotFoundFault cardNotFoundFault) {
        super(message);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public IEMailServiceContractGetCustomMailFieldsCardNotFoundFaultFaultFaultMessage(String message, it.archiflow93.email.CardNotFoundFault cardNotFoundFault, Throwable cause) {
        super(message, cause);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public it.archiflow93.email.CardNotFoundFault getFaultInfo() {
        return this.cardNotFoundFault;
    }
}
