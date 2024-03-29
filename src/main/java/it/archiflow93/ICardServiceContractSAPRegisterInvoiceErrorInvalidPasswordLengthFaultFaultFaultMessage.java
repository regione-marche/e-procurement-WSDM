
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.795+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordLengthFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidPasswordLengthFault invalidPasswordLengthFault;

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordLengthFault invalidPasswordLengthFault) {
        super(message);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordLengthFault invalidPasswordLengthFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public it.archiflow93.InvalidPasswordLengthFault getFaultInfo() {
        return this.invalidPasswordLengthFault;
    }
}
