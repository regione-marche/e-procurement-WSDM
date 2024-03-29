
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.258+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "LoginFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPDeleteInvoiceByUserLoginFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.LoginFault loginFault;

    public ICardServiceContractSAPDeleteInvoiceByUserLoginFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserLoginFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserLoginFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPDeleteInvoiceByUserLoginFaultFaultFaultMessage(String message, it.archiflow94.LoginFault loginFault) {
        super(message);
        this.loginFault = loginFault;
    }

    public ICardServiceContractSAPDeleteInvoiceByUserLoginFaultFaultFaultMessage(String message, it.archiflow94.LoginFault loginFault, Throwable cause) {
        super(message, cause);
        this.loginFault = loginFault;
    }

    public it.archiflow94.LoginFault getFaultInfo() {
        return this.loginFault;
    }
}
