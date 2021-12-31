
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.418+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "CardNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorCardNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.CardNotFoundFault cardNotFoundFault;

    public ICardServiceContractSAPRegisterInvoiceErrorCardNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorCardNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorCardNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorCardNotFoundFaultFaultFaultMessage(String message, it.archiflow94.CardNotFoundFault cardNotFoundFault) {
        super(message);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorCardNotFoundFaultFaultFaultMessage(String message, it.archiflow94.CardNotFoundFault cardNotFoundFault, Throwable cause) {
        super(message, cause);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public it.archiflow94.CardNotFoundFault getFaultInfo() {
        return this.cardNotFoundFault;
    }
}