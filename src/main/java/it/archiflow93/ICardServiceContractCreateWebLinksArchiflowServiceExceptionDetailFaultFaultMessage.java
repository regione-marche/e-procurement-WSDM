
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.672+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class ICardServiceContractCreateWebLinksArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public ICardServiceContractCreateWebLinksArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractCreateWebLinksArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractCreateWebLinksArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractCreateWebLinksArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public ICardServiceContractCreateWebLinksArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow93.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
