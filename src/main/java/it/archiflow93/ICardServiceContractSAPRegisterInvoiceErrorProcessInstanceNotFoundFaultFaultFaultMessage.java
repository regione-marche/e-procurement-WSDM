
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.820+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ProcessInstanceNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ProcessInstanceNotFoundFault processInstanceNotFoundFault;

    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message, it.archiflow93.ProcessInstanceNotFoundFault processInstanceNotFoundFault) {
        super(message);
        this.processInstanceNotFoundFault = processInstanceNotFoundFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message, it.archiflow93.ProcessInstanceNotFoundFault processInstanceNotFoundFault, Throwable cause) {
        super(message, cause);
        this.processInstanceNotFoundFault = processInstanceNotFoundFault;
    }

    public it.archiflow93.ProcessInstanceNotFoundFault getFaultInfo() {
        return this.processInstanceNotFoundFault;
    }
}
