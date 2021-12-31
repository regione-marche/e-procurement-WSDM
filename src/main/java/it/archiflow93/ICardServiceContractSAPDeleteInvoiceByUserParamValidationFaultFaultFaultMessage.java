
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.565+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPDeleteInvoiceByUserParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ParamValidationFault paramValidationFault;

    public ICardServiceContractSAPDeleteInvoiceByUserParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPDeleteInvoiceByUserParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPDeleteInvoiceByUserParamValidationFaultFaultFaultMessage(String message, it.archiflow93.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ICardServiceContractSAPDeleteInvoiceByUserParamValidationFaultFaultFaultMessage(String message, it.archiflow93.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow93.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
