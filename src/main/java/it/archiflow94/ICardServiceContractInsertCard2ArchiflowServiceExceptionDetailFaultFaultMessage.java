
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.868+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class ICardServiceContractInsertCard2ArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public ICardServiceContractInsertCard2ArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCard2ArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCard2ArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCard2ArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public ICardServiceContractInsertCard2ArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow94.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow94.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
