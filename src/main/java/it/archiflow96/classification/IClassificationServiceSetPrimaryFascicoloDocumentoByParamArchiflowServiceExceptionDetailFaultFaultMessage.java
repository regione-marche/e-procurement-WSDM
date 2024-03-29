
package it.archiflow96.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:06.253+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IClassificationServiceSetPrimaryFascicoloDocumentoByParamArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IClassificationServiceSetPrimaryFascicoloDocumentoByParamArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceSetPrimaryFascicoloDocumentoByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceSetPrimaryFascicoloDocumentoByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceSetPrimaryFascicoloDocumentoByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IClassificationServiceSetPrimaryFascicoloDocumentoByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow96.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow96.classification.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
