
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.195+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "VisibilityFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendExternalMailVisibilityFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.VisibilityFault visibilityFault;

    public IEMailServiceContractSendExternalMailVisibilityFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendExternalMailVisibilityFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendExternalMailVisibilityFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendExternalMailVisibilityFaultFaultFaultMessage(String message, it.archiflow93.email.VisibilityFault visibilityFault) {
        super(message);
        this.visibilityFault = visibilityFault;
    }

    public IEMailServiceContractSendExternalMailVisibilityFaultFaultFaultMessage(String message, it.archiflow93.email.VisibilityFault visibilityFault, Throwable cause) {
        super(message, cause);
        this.visibilityFault = visibilityFault;
    }

    public it.archiflow93.email.VisibilityFault getFaultInfo() {
        return this.visibilityFault;
    }
}
