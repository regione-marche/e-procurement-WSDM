
package org.tempuri;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:09.288+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "ClassificationExceptionDetail", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.ValueObject")
public class IFascicoloServiceContractUpdateFascicolo2ClassificationExceptionDetailFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.siav_classification_entities_common.ClassificationExceptionDetail classificationExceptionDetail;

    public IFascicoloServiceContractUpdateFascicolo2ClassificationExceptionDetailFaultFaultMessage() {
        super();
    }
    
    public IFascicoloServiceContractUpdateFascicolo2ClassificationExceptionDetailFaultFaultMessage(String message) {
        super(message);
    }
    
    public IFascicoloServiceContractUpdateFascicolo2ClassificationExceptionDetailFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IFascicoloServiceContractUpdateFascicolo2ClassificationExceptionDetailFaultFaultMessage(String message, org.datacontract.schemas._2004._07.siav_classification_entities_common.ClassificationExceptionDetail classificationExceptionDetail) {
        super(message);
        this.classificationExceptionDetail = classificationExceptionDetail;
    }

    public IFascicoloServiceContractUpdateFascicolo2ClassificationExceptionDetailFaultFaultMessage(String message, org.datacontract.schemas._2004._07.siav_classification_entities_common.ClassificationExceptionDetail classificationExceptionDetail, Throwable cause) {
        super(message, cause);
        this.classificationExceptionDetail = classificationExceptionDetail;
    }

    public org.datacontract.schemas._2004._07.siav_classification_entities_common.ClassificationExceptionDetail getFaultInfo() {
        return this.classificationExceptionDetail;
    }
}
