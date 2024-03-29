
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:15.488+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IFolderServiceContractAddFolderInDrawerArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IFolderServiceContractAddFolderInDrawerArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IFolderServiceContractAddFolderInDrawerArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IFolderServiceContractAddFolderInDrawerArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IFolderServiceContractAddFolderInDrawerArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IFolderServiceContractAddFolderInDrawerArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow94.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
