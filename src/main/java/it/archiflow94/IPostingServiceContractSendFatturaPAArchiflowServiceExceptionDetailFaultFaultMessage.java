
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:16.338+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IPostingServiceContractSendFatturaPAArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IPostingServiceContractSendFatturaPAArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractSendFatturaPAArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractSendFatturaPAArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractSendFatturaPAArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IPostingServiceContractSendFatturaPAArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow94.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
