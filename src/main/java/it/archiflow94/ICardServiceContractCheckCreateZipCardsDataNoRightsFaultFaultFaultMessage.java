
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.658+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoRightsFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractCheckCreateZipCardsDataNoRightsFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.NoRightsFault noRightsFault;

    public ICardServiceContractCheckCreateZipCardsDataNoRightsFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractCheckCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractCheckCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractCheckCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message, it.archiflow94.NoRightsFault noRightsFault) {
        super(message);
        this.noRightsFault = noRightsFault;
    }

    public ICardServiceContractCheckCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message, it.archiflow94.NoRightsFault noRightsFault, Throwable cause) {
        super(message, cause);
        this.noRightsFault = noRightsFault;
    }

    public it.archiflow94.NoRightsFault getFaultInfo() {
        return this.noRightsFault;
    }
}
