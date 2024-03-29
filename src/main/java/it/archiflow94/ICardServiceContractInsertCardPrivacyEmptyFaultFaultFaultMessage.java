
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.698+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PrivacyEmptyFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardPrivacyEmptyFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.PrivacyEmptyFault privacyEmptyFault;

    public ICardServiceContractInsertCardPrivacyEmptyFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardPrivacyEmptyFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardPrivacyEmptyFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow94.PrivacyEmptyFault privacyEmptyFault) {
        super(message);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public ICardServiceContractInsertCardPrivacyEmptyFaultFaultFaultMessage(String message, it.archiflow94.PrivacyEmptyFault privacyEmptyFault, Throwable cause) {
        super(message, cause);
        this.privacyEmptyFault = privacyEmptyFault;
    }

    public it.archiflow94.PrivacyEmptyFault getFaultInfo() {
        return this.privacyEmptyFault;
    }
}
