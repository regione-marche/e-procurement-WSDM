
package it.archiflow96.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:06.714+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ClassificationExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject")
public class IClassificationServiceReadTitolarioItemCollSortedByParamClassificationExceptionDetailFaultFaultMessage extends Exception {
    
    private it.archiflow96.classification.ClassificationExceptionDetail classificationExceptionDetail;

    public IClassificationServiceReadTitolarioItemCollSortedByParamClassificationExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceReadTitolarioItemCollSortedByParamClassificationExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceReadTitolarioItemCollSortedByParamClassificationExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceReadTitolarioItemCollSortedByParamClassificationExceptionDetailFaultFaultMessage(String message, it.archiflow96.classification.ClassificationExceptionDetail classificationExceptionDetail) {
        super(message);
        this.classificationExceptionDetail = classificationExceptionDetail;
    }

    public IClassificationServiceReadTitolarioItemCollSortedByParamClassificationExceptionDetailFaultFaultMessage(String message, it.archiflow96.classification.ClassificationExceptionDetail classificationExceptionDetail, Throwable cause) {
        super(message, cause);
        this.classificationExceptionDetail = classificationExceptionDetail;
    }

    public it.archiflow96.classification.ClassificationExceptionDetail getFaultInfo() {
        return this.classificationExceptionDetail;
    }
}
