
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.036+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.ParamValidationFault paramValidationFault;

    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message, it.archiflow96.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public IPostingServiceContractCreateMailServiceSendingParamValidationFaultFaultFaultMessage(String message, it.archiflow96.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow96.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
