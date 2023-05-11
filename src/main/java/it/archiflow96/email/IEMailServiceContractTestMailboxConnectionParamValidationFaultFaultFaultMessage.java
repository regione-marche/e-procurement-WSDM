
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.090+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractTestMailboxConnectionParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.ParamValidationFault paramValidationFault;

    public IEMailServiceContractTestMailboxConnectionParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractTestMailboxConnectionParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractTestMailboxConnectionParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractTestMailboxConnectionParamValidationFaultFaultFaultMessage(String message, it.archiflow96.email.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public IEMailServiceContractTestMailboxConnectionParamValidationFaultFaultFaultMessage(String message, it.archiflow96.email.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow96.email.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
