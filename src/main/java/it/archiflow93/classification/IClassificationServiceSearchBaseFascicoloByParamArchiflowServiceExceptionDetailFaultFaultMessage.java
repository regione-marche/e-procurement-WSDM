
package it.archiflow93.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:07.249+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ArchiflowServiceExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Exceptions")
public class IClassificationServiceSearchBaseFascicoloByParamArchiflowServiceExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow93.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail;

    public IClassificationServiceSearchBaseFascicoloByParamArchiflowServiceExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceSearchBaseFascicoloByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceSearchBaseFascicoloByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceSearchBaseFascicoloByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail) {
        super(message);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public IClassificationServiceSearchBaseFascicoloByParamArchiflowServiceExceptionDetailFaultFaultMessage(String message, it.archiflow93.classification.ArchiflowServiceExceptionDetail archiflowServiceExceptionDetail, Throwable cause) {
        super(message, cause);
        this.archiflowServiceExceptionDetail = archiflowServiceExceptionDetail;
    }

    public it.archiflow93.classification.ArchiflowServiceExceptionDetail getFaultInfo() {
        return this.archiflowServiceExceptionDetail;
    }
}
