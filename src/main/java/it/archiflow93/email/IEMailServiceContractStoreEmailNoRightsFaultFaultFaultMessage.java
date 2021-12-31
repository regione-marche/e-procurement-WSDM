
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.477+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoRightsFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractStoreEmailNoRightsFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.NoRightsFault noRightsFault;

    public IEMailServiceContractStoreEmailNoRightsFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractStoreEmailNoRightsFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractStoreEmailNoRightsFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractStoreEmailNoRightsFaultFaultFaultMessage(String message, it.archiflow93.email.NoRightsFault noRightsFault) {
        super(message);
        this.noRightsFault = noRightsFault;
    }

    public IEMailServiceContractStoreEmailNoRightsFaultFaultFaultMessage(String message, it.archiflow93.email.NoRightsFault noRightsFault, Throwable cause) {
        super(message, cause);
        this.noRightsFault = noRightsFault;
    }

    public it.archiflow93.email.NoRightsFault getFaultInfo() {
        return this.noRightsFault;
    }
}
