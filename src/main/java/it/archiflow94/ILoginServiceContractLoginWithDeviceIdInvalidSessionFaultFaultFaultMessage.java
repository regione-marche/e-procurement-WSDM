
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.842+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginWithDeviceIdInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.InvalidSessionFault invalidSessionFault;

    public ILoginServiceContractLoginWithDeviceIdInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginWithDeviceIdInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginWithDeviceIdInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginWithDeviceIdInvalidSessionFaultFaultFaultMessage(String message, it.archiflow94.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ILoginServiceContractLoginWithDeviceIdInvalidSessionFaultFaultFaultMessage(String message, it.archiflow94.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow94.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
