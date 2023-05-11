
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:11:59.683+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public ILoginServiceContractLoginArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow93.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
