
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.141+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractCreateZipCardsDataInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractCreateZipCardsDataInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow93.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
