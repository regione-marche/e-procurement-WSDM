
package it.archiflow93.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:07.399+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PrivacyEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IClassificationServiceUpdateFascicoloByParamPrivacyEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.classification.PrivacyEmptyFault privacyEmptyFault;

    public IClassificationServiceUpdateFascicoloByParamPrivacyEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceUpdateFascicoloByParamPrivacyEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceUpdateFascicoloByParamPrivacyEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceUpdateFascicoloByParamPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow93.classification.PrivacyEmptyFault privacyEmptyFault) {
        super(message);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public IClassificationServiceUpdateFascicoloByParamPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow93.classification.PrivacyEmptyFault privacyEmptyFault, Throwable cause) {
        super(message, cause);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public it.archiflow93.classification.PrivacyEmptyFault getFaultInfo() {
        return this.privacyEmptyFault;
    }
}
