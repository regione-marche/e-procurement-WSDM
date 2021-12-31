
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.866+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IEMailServiceContractSendExternalMailArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IEMailServiceContractSendExternalMailArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractSendExternalMailArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractSendExternalMailArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractSendExternalMailArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IEMailServiceContractSendExternalMailArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow96.email.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}