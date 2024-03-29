
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.700+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractChangePasswordByParamInvalidPasswordFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.InvalidPasswordFault invalidPasswordFault;

    public ILoginServiceContractChangePasswordByParamInvalidPasswordFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractChangePasswordByParamInvalidPasswordFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractChangePasswordByParamInvalidPasswordFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractChangePasswordByParamInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow94.InvalidPasswordFault invalidPasswordFault) {
        super(message);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public ILoginServiceContractChangePasswordByParamInvalidPasswordFaultFaultFaultMessage(String message, it.archiflow94.InvalidPasswordFault invalidPasswordFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFault = invalidPasswordFault;
    }

    public it.archiflow94.InvalidPasswordFault getFaultInfo() {
        return this.invalidPasswordFault;
    }
}
