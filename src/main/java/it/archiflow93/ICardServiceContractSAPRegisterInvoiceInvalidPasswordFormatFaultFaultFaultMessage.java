
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:05.117+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFormatFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceInvalidPasswordFormatFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidPasswordFormatFault invalidPasswordFormatFault;

    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordFormatFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordFormatFault invalidPasswordFormatFault) {
        super(message);
        this.invalidPasswordFormatFault = invalidPasswordFormatFault;
    }

    public ICardServiceContractSAPRegisterInvoiceInvalidPasswordFormatFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordFormatFault invalidPasswordFormatFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFormatFault = invalidPasswordFormatFault;
    }

    public it.archiflow93.InvalidPasswordFormatFault getFaultInfo() {
        return this.invalidPasswordFormatFault;
    }
}
