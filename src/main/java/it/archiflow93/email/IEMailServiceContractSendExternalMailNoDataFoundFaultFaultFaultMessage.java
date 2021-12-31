
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.225+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoDataFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendExternalMailNoDataFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.NoDataFoundFault noDataFoundFault;

    public IEMailServiceContractSendExternalMailNoDataFoundFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendExternalMailNoDataFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendExternalMailNoDataFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendExternalMailNoDataFoundFaultFaultFaultMessage(String message, it.archiflow93.email.NoDataFoundFault noDataFoundFault) {
        super(message);
        this.noDataFoundFault = noDataFoundFault;
    }

    public IEMailServiceContractSendExternalMailNoDataFoundFaultFaultFaultMessage(String message, it.archiflow93.email.NoDataFoundFault noDataFoundFault, Throwable cause) {
        super(message, cause);
        this.noDataFoundFault = noDataFoundFault;
    }

    public it.archiflow93.email.NoDataFoundFault getFaultInfo() {
        return this.noDataFoundFault;
    }
}
