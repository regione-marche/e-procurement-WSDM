
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.693+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractProtocolCardParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.ParamValidationFault paramValidationFault;

    public ICardServiceContractProtocolCardParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractProtocolCardParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractProtocolCardParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractProtocolCardParamValidationFaultFaultFaultMessage(String message, it.archiflow93.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ICardServiceContractProtocolCardParamValidationFaultFaultFaultMessage(String message, it.archiflow93.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow93.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}