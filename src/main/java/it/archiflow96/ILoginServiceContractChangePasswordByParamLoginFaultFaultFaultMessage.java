
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:25:56.739+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "LoginFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractChangePasswordByParamLoginFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.LoginFault loginFault;

    public ILoginServiceContractChangePasswordByParamLoginFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractChangePasswordByParamLoginFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractChangePasswordByParamLoginFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractChangePasswordByParamLoginFaultFaultFaultMessage(String message, it.archiflow96.LoginFault loginFault) {
        super(message);
        this.loginFault = loginFault;
    }

    public ILoginServiceContractChangePasswordByParamLoginFaultFaultFaultMessage(String message, it.archiflow96.LoginFault loginFault, Throwable cause) {
        super(message, cause);
        this.loginFault = loginFault;
    }

    public it.archiflow96.LoginFault getFaultInfo() {
        return this.loginFault;
    }
}