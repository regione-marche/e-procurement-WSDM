
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:07.918+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IPostingServiceContractCheckUserRightToSendFatturaPAOrNotifECArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow96.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
