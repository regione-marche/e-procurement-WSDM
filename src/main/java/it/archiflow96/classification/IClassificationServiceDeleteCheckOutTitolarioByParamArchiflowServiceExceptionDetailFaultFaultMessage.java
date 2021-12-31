
package it.archiflow96.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:06.450+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IClassificationServiceDeleteCheckOutTitolarioByParamArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IClassificationServiceDeleteCheckOutTitolarioByParamArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceDeleteCheckOutTitolarioByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceDeleteCheckOutTitolarioByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceDeleteCheckOutTitolarioByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IClassificationServiceDeleteCheckOutTitolarioByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow96.classification.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
