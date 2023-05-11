
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.547+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ParamValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractSendFolderByExternalMailParamValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.ParamValidationFault paramValidationFault;

    public IEMailServiceContractSendFolderByExternalMailParamValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendFolderByExternalMailParamValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendFolderByExternalMailParamValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendFolderByExternalMailParamValidationFaultFaultFaultMessage(String message, it.archiflow93.email.ParamValidationFault paramValidationFault) {
        super(message);
        this.paramValidationFault = paramValidationFault;
    }

    public IEMailServiceContractSendFolderByExternalMailParamValidationFaultFaultFaultMessage(String message, it.archiflow93.email.ParamValidationFault paramValidationFault, Throwable cause) {
        super(message, cause);
        this.paramValidationFault = paramValidationFault;
    }

    public it.archiflow93.email.ParamValidationFault getFaultInfo() {
        return this.paramValidationFault;
    }
}
