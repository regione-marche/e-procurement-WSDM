
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:08.596+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow93.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
