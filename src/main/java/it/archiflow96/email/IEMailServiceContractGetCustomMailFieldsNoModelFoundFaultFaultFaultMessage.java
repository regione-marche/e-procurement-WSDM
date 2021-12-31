
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.120+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoModelFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetCustomMailFieldsNoModelFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.NoModelFoundFault noModelFoundFault;

    public IEMailServiceContractGetCustomMailFieldsNoModelFoundFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetCustomMailFieldsNoModelFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetCustomMailFieldsNoModelFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetCustomMailFieldsNoModelFoundFaultFaultFaultMessage(String message, it.archiflow96.email.NoModelFoundFault noModelFoundFault) {
        super(message);
        this.noModelFoundFault = noModelFoundFault;
    }

    public IEMailServiceContractGetCustomMailFieldsNoModelFoundFaultFaultFaultMessage(String message, it.archiflow96.email.NoModelFoundFault noModelFoundFault, Throwable cause) {
        super(message, cause);
        this.noModelFoundFault = noModelFoundFault;
    }

    public it.archiflow96.email.NoModelFoundFault getFaultInfo() {
        return this.noModelFoundFault;
    }
}
