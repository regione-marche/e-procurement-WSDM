
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.487+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IEMailServiceContractGetCustomObjectArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IEMailServiceContractGetCustomObjectArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetCustomObjectArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetCustomObjectArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetCustomObjectArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IEMailServiceContractGetCustomObjectArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.email.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow93.email.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
