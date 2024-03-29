
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.802+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFormatFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.InvalidPasswordFormatFault invalidPasswordFormatFault;

    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message, it.archiflow94.InvalidPasswordFormatFault invalidPasswordFormatFault) {
        super(message);
        this.invalidPasswordFormatFault = invalidPasswordFormatFault;
    }

    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message, it.archiflow94.InvalidPasswordFormatFault invalidPasswordFormatFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFormatFault = invalidPasswordFormatFault;
    }

    public it.archiflow94.InvalidPasswordFormatFault getFaultInfo() {
        return this.invalidPasswordFormatFault;
    }
}
