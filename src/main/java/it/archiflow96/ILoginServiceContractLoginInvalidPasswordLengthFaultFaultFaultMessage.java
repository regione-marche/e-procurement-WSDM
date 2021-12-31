
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:25:56.814+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordLengthFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidPasswordLengthFault invalidPasswordLengthFault;

    public ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordLengthFault invalidPasswordLengthFault) {
        super(message);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public ILoginServiceContractLoginInvalidPasswordLengthFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordLengthFault invalidPasswordLengthFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordLengthFault = invalidPasswordLengthFault;
    }

    public it.archiflow96.InvalidPasswordLengthFault getFaultInfo() {
        return this.invalidPasswordLengthFault;
    }
}
