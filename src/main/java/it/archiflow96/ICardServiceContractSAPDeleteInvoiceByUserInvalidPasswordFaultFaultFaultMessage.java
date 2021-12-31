
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.994+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidPasswordFault invalidPasswordFault;

    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordFault invalidPasswordFault) {
        super(message);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public ICardServiceContractSAPDeleteInvoiceByUserInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordFault invalidPasswordFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public it.archiflow96.InvalidPasswordFault getFaultInfo() {
        return this.invalidPasswordFault;
    }
}
