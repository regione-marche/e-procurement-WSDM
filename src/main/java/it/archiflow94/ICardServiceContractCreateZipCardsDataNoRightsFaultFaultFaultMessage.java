
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.928+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoRightsFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractCreateZipCardsDataNoRightsFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.NoRightsFault noRightsFault;

    public ICardServiceContractCreateZipCardsDataNoRightsFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message, it.archiflow94.NoRightsFault noRightsFault) {
        super(message);
        this.noRightsFault = noRightsFault;
    }

    public ICardServiceContractCreateZipCardsDataNoRightsFaultFaultFaultMessage(String message, it.archiflow94.NoRightsFault noRightsFault, Throwable cause) {
        super(message, cause);
        this.noRightsFault = noRightsFault;
    }

    public it.archiflow94.NoRightsFault getFaultInfo() {
        return this.noRightsFault;
    }
}
