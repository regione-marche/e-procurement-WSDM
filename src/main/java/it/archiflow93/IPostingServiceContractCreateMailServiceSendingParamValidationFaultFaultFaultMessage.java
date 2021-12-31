
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:08.674+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ParamValidationFault paramValidationFault;

    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message, it.archiflow93.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message, it.archiflow93.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow93.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
