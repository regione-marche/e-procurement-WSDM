
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.428+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ProcessInstanceNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.ProcessInstanceNotFoundFault processInstanceNotFoundFault;

    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message, it.archiflow94.ProcessInstanceNotFoundFault processInstanceNotFoundFault) {
        super(message);
        this.processInstanceNotFoundFault = processInstanceNotFoundFault;
    }

    public ICardServiceContractSAPRegisterInvoiceErrorProcessInstanceNotFoundFaultFaultFaultMessage(String message, it.archiflow94.ProcessInstanceNotFoundFault processInstanceNotFoundFault, Throwable cause) {
        super(message, cause);
        this.processInstanceNotFoundFault = processInstanceNotFoundFault;
    }

    public it.archiflow94.ProcessInstanceNotFoundFault getFaultInfo() {
        return this.processInstanceNotFoundFault;
    }
}