
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.638+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordLengthFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceInvalidPasswordLengthFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.InvalidPasswordLengthFault invalidPasswordLengthFault;

    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordLengthFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordLengthFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordLengthFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow94.InvalidPasswordLengthFault invalidPasswordLengthFault) {
        super(message);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow94.InvalidPasswordLengthFault invalidPasswordLengthFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public it.archiflow94.InvalidPasswordLengthFault getFaultInfo() {
        return this.invalidPasswordLengthFault;
    }
}