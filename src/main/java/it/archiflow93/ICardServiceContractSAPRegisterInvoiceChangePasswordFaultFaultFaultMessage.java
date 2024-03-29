
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:05.130+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ChangePasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceChangePasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ChangePasswordFault changePasswordFault;

    public ICardServiceContractSAPRegisterInvoiceChangePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceChangePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceChangePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceChangePasswordFaultFaultFaultMessage(String message, it.archiflow93.ChangePasswordFault changePasswordFault) {
        super(message);
        this.changePasswordFault = changePasswordFault;
    }

    public ICardServiceContractSAPRegisterInvoiceChangePasswordFaultFaultFaultMessage(String message, it.archiflow93.ChangePasswordFault changePasswordFault, Throwable cause) {
        super(message, cause);
        this.changePasswordFault = changePasswordFault;
    }

    public it.archiflow93.ChangePasswordFault getFaultInfo() {
        return this.changePasswordFault;
    }
}
