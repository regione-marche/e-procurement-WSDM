
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.115+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PrivacyEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractRemoveVisibilityByParamPrivacyEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.PrivacyEmptyFault privacyEmptyFault;

    public ICardServiceContractRemoveVisibilityByParamPrivacyEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractRemoveVisibilityByParamPrivacyEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractRemoveVisibilityByParamPrivacyEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractRemoveVisibilityByParamPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow93.PrivacyEmptyFault privacyEmptyFault) {
        super(message);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public ICardServiceContractRemoveVisibilityByParamPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow93.PrivacyEmptyFault privacyEmptyFault, Throwable cause) {
        super(message, cause);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public it.archiflow93.PrivacyEmptyFault getFaultInfo() {
        return this.privacyEmptyFault;
    }
}
