
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.828+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ChangePasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorChangePasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ChangePasswordFault changePasswordFault;

    public ICardServiceContractSAPRegisterInvoiceErrorChangePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorChangePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorChangePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorChangePasswordFaultFaultFaultMessage(String message, it.archiflow93.ChangePasswordFault changePasswordFault) {
        super(message);
        this.changePasswordFault = changePasswordFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorChangePasswordFaultFaultFaultMessage(String message, it.archiflow93.ChangePasswordFault changePasswordFault, Throwable cause) {
        super(message, cause);
        this.changePasswordFault = changePasswordFault;
    }

    public it.archiflow93.ChangePasswordFault getFaultInfo() {
        return this.changePasswordFault;
    }
}
