
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.938+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardAttachmentSignaturesInfoParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.ParamValidationFault paramValidationFault;

    public ICardServiceContractGetCardAttachmentSignaturesInfoParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardAttachmentSignaturesInfoParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardAttachmentSignaturesInfoParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardAttachmentSignaturesInfoParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ICardServiceContractGetCardAttachmentSignaturesInfoParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow94.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
