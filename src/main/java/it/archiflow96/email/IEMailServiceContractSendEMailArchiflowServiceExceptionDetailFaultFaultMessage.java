
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.048+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IEMailServiceContractSendEMailArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IEMailServiceContractSendEMailArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendEMailArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendEMailArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendEMailArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IEMailServiceContractSendEMailArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow96.email.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
