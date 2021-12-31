
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.085+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.ParamValidationFault paramValidationFault;

    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message, it.archiflow96.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ICardServiceContractMainDocumentToPDFParamValidationFaultFaultFaultMessage(String message, it.archiflow96.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow96.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}