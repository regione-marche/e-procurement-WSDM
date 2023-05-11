
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.823+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidPasswordFault invalidPasswordFault;

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordFault invalidPasswordFault) {
        super(message);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordFault invalidPasswordFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public it.archiflow93.InvalidPasswordFault getFaultInfo() {
        return this.invalidPasswordFault;
    }
}
