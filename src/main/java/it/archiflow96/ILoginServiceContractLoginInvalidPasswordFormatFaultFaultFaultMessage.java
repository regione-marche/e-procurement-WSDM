
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:25:56.879+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidPasswordFormatFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidPasswordFormatFault invalidPasswordFormatFault;

    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordFormatFault invalidPasswordFormatFault) {
        super(message);
        this.invalidPasswordFormatFault = invalidPasswordFormatFault;
    }

    public ILoginServiceContractLoginInvalidPasswordFormatFaultFaultFaultMessage(String message, it.archiflow96.InvalidPasswordFormatFault invalidPasswordFormatFault, Throwable cause) {
        super(message, cause);
        this.invalidPasswordFormatFault = invalidPasswordFormatFault;
    }

    public it.archiflow96.InvalidPasswordFormatFault getFaultInfo() {
        return this.invalidPasswordFormatFault;
    }
}
