
package it.archiflow93.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:07.579+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ClassificationExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject")
public class IClassificationServiceInsertTipoFascVisibilityByParamClassificationExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow93.classification.ClassificationExceptionDetail classificationExceptionDetail;

    public IClassificationServiceInsertTipoFascVisibilityByParamClassificationExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceInsertTipoFascVisibilityByParamClassificationExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceInsertTipoFascVisibilityByParamClassificationExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceInsertTipoFascVisibilityByParamClassificationExceptionDetailFaultFaultMessage(String message, it.archiflow93.classification.ClassificationExceptionDetail classificationExceptionDetail) {
        super(message);
        this.classificationExceptionDetail = classificationExceptionDetail;
    }

    public IClassificationServiceInsertTipoFascVisibilityByParamClassificationExceptionDetailFaultFaultMessage(String message, it.archiflow93.classification.ClassificationExceptionDetail classificationExceptionDetail, Throwable cause) {
        super(message, cause);
        this.classificationExceptionDetail = classificationExceptionDetail;
    }

    public it.archiflow93.classification.ClassificationExceptionDetail getFaultInfo() {
        return this.classificationExceptionDetail;
    }
}
