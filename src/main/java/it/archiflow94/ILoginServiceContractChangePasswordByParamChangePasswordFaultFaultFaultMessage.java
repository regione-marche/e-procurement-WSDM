
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.720+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ChangePasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractChangePasswordByParamChangePasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.ChangePasswordFault changePasswordFault;

    public ILoginServiceContractChangePasswordByParamChangePasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractChangePasswordByParamChangePasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractChangePasswordByParamChangePasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractChangePasswordByParamChangePasswordFaultFaultFaultMessage(String message, it.archiflow94.ChangePasswordFault changePasswordFault) {
        super(message);
        this.changePasswordFault = changePasswordFault;
    }

    public ILoginServiceContractChangePasswordByParamChangePasswordFaultFaultFaultMessage(String message, it.archiflow94.ChangePasswordFault changePasswordFault, Throwable cause) {
        super(message, cause);
        this.changePasswordFault = changePasswordFault;
    }

    public it.archiflow94.ChangePasswordFault getFaultInfo() {
        return this.changePasswordFault;
    }
}
