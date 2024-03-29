
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.750+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "LoginTicketSapFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.LoginTicketSapFault loginTicketSapFault;

    public ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage(String message, it.archiflow94.LoginTicketSapFault loginTicketSapFault) {
        super(message);
        this.loginTicketSapFault = loginTicketSapFault;
    }

    public ILoginServiceContractLoginLoginTicketSapFaultFaultFaultMessage(String message, it.archiflow94.LoginTicketSapFault loginTicketSapFault, Throwable cause) {
        super(message, cause);
        this.loginTicketSapFault = loginTicketSapFault;
    }

    public it.archiflow94.LoginTicketSapFault getFaultInfo() {
        return this.loginTicketSapFault;
    }
}
