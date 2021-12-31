
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:09.740+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.ParamValidationFault paramValidationFault;

    public ILoginServiceContractLoginParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public ILoginServiceContractLoginParamValidationFaultFaultFaultMessage(String message, it.archiflow94.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow94.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}