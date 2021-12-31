
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.284+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "UserAccountDisabledFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorUserAccountDisabledFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.UserAccountDisabledFault userAccountDisabledFault;

    public ICardServiceContractSAPRegisterInvoiceErrorUserAccountDisabledFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorUserAccountDisabledFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorUserAccountDisabledFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorUserAccountDisabledFaultFaultFaultMessage(String message, it.archiflow96.UserAccountDisabledFault userAccountDisabledFault) {
        super(message);
        this.userAccountDisabledFault = userAccountDisabledFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorUserAccountDisabledFaultFaultFaultMessage(String message, it.archiflow96.UserAccountDisabledFault userAccountDisabledFault, Throwable cause) {
        super(message, cause);
        this.userAccountDisabledFault = userAccountDisabledFault;
    }

    public it.archiflow96.UserAccountDisabledFault getFaultInfo() {
        return this.userAccountDisabledFault;
    }
}
