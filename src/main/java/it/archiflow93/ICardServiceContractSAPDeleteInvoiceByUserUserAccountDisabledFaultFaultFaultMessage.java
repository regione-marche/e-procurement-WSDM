
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.606+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "UserAccountDisabledFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPDeleteInvoiceByUserUserAccountDisabledFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.UserAccountDisabledFault userAccountDisabledFault;

    public ICardServiceContractSAPDeleteInvoiceByUserUserAccountDisabledFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserUserAccountDisabledFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserUserAccountDisabledFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPDeleteInvoiceByUserUserAccountDisabledFaultFaultFaultMessage(String message, it.archiflow93.UserAccountDisabledFault userAccountDisabledFault) {
        super(message);
        this.userAccountDisabledFault = userAccountDisabledFault;
    }

    public ICardServiceContractSAPDeleteInvoiceByUserUserAccountDisabledFaultFaultFaultMessage(String message, it.archiflow93.UserAccountDisabledFault userAccountDisabledFault, Throwable cause) {
        super(message, cause);
        this.userAccountDisabledFault = userAccountDisabledFault;
    }

    public it.archiflow93.UserAccountDisabledFault getFaultInfo() {
        return this.userAccountDisabledFault;
    }
}
