
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:11:59.711+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ChangePasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ChangePasswordFault changePasswordFault;

    public ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage(String message, it.archiflow93.ChangePasswordFault changePasswordFault) {
        super(message);
        this.changePasswordFault = changePasswordFault;
    }

    public ILoginServiceContractLoginChangePasswordFaultFaultFaultMessage(String message, it.archiflow93.ChangePasswordFault changePasswordFault, Throwable cause) {
        super(message, cause);
        this.changePasswordFault = changePasswordFault;
    }

    public it.archiflow93.ChangePasswordFault getFaultInfo() {
        return this.changePasswordFault;
    }
}
