
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.548+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractModifyCardParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.ParamValidationFault paramValidationFault;

    public ICardServiceContractModifyCardParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractModifyCardParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractModifyCardParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractModifyCardParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ICardServiceContractModifyCardParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow94.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
