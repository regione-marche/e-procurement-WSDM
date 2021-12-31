
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.596+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidPasswordFault invalidPasswordFault;

    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordFault invalidPasswordFault) {
        super(message);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow93.InvalidPasswordFault invalidPasswordFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public it.archiflow93.InvalidPasswordFault getFaultInfo() {
        return this.invalidPasswordFault;
    }
}
