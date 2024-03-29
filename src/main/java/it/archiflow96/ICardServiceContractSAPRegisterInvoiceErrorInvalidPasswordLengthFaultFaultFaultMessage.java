
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.244+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordLengthFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidPasswordLengthFault invalidPasswordLengthFault;

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordLengthFault invalidPasswordLengthFault) {
        super(message);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordLengthFault invalidPasswordLengthFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public it.archiflow96.InvalidPasswordLengthFault getFaultInfo() {
        return this.invalidPasswordLengthFault;
    }
}
