
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:03.816+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractCheckCreateZipCardsDataInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractCheckCreateZipCardsDataInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractCheckCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractCheckCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractCheckCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractCheckCreateZipCardsDataInvalidSessionFaultFaultFaultMessage(String message, it.archiflow93.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow93.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
