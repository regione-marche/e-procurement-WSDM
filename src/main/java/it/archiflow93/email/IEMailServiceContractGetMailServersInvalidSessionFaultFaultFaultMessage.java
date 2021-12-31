
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.315+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetMailServersInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.InvalidSessionFault invalidSessionFault;

    public IEMailServiceContractGetMailServersInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetMailServersInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetMailServersInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetMailServersInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.email.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public IEMailServiceContractGetMailServersInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.email.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow93.email.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}