
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.392+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PrivacyEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSendCardsPrivacyEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.PrivacyEmptyFault privacyEmptyFault;

    public ICardServiceContractSendCardsPrivacyEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSendCardsPrivacyEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSendCardsPrivacyEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSendCardsPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow93.PrivacyEmptyFault privacyEmptyFault) {
        super(message);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public ICardServiceContractSendCardsPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow93.PrivacyEmptyFault privacyEmptyFault, Throwable cause) {
        super(message, cause);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public it.archiflow93.PrivacyEmptyFault getFaultInfo() {
        return this.privacyEmptyFault;
    }
}