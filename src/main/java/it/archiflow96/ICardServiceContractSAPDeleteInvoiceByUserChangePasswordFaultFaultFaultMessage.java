
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.004+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ChangePasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPDeleteInvoiceByUserChangePasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.ChangePasswordFault changePasswordFault;

    public ICardServiceContractSAPDeleteInvoiceByUserChangePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserChangePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserChangePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPDeleteInvoiceByUserChangePasswordFaultFaultFaultMessage(String message, it.archiflow96.ChangePasswordFault changePasswordFault) {
        super(message);
        this.changePasswordFault = changePasswordFault;
    }

    public ICardServiceContractSAPDeleteInvoiceByUserChangePasswordFaultFaultFaultMessage(String message, it.archiflow96.ChangePasswordFault changePasswordFault, Throwable cause) {
        super(message, cause);
        this.changePasswordFault = changePasswordFault;
    }

    public it.archiflow96.ChangePasswordFault getFaultInfo() {
        return this.changePasswordFault;
    }
}
