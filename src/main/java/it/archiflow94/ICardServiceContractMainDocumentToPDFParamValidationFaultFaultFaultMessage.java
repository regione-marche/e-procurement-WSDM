
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.798+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.ParamValidationFault paramValidationFault;

    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow94.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
