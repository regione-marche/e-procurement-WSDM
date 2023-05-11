
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.648+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "CardNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceCardNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.CardNotFoundFault cardNotFoundFault;

    public ICardServiceContractSAPRegisterInvoiceCardNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceCardNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceCardNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceCardNotFoundFaultFaultFaultMessage(String message, it.archiflow94.CardNotFoundFault cardNotFoundFault) {
        super(message);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public ICardServiceContractSAPRegisterInvoiceCardNotFoundFaultFaultFaultMessage(String message, it.archiflow94.CardNotFoundFault cardNotFoundFault, Throwable cause) {
        super(message, cause);
        this.cardNotFoundFault = cardNotFoundFault;
    }

    public it.archiflow94.CardNotFoundFault getFaultInfo() {
        return this.cardNotFoundFault;
    }
}
