
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.690+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "AccessDeniedFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractChangePasswordByParamAccessDeniedFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.AccessDeniedFault accessDeniedFault;

    public ILoginServiceContractChangePasswordByParamAccessDeniedFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractChangePasswordByParamAccessDeniedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractChangePasswordByParamAccessDeniedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractChangePasswordByParamAccessDeniedFaultFaultFaultMessage(String message, it.archiflow94.AccessDeniedFault accessDeniedFault) {
        super(message);
        this.accessDeniedFault = accessDeniedFault;
    }

    public ILoginServiceContractChangePasswordByParamAccessDeniedFaultFaultFaultMessage(String message, it.archiflow94.AccessDeniedFault accessDeniedFault, Throwable cause) {
        super(message, cause);
        this.accessDeniedFault = accessDeniedFault;
    }

    public it.archiflow94.AccessDeniedFault getFaultInfo() {
        return this.accessDeniedFault;
    }
}