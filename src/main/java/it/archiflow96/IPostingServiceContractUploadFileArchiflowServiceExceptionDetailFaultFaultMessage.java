
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:08.006+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IPostingServiceContractUploadFileArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IPostingServiceContractUploadFileArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractUploadFileArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractUploadFileArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractUploadFileArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IPostingServiceContractUploadFileArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow96.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
