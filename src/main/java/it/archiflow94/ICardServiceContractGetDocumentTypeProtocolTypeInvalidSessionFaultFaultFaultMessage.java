
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.208+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidSessionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetDocumentTypeProtocolTypeInvalidSessionFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.InvalidSessionFault invalidSessionFault;

    public ICardServiceContractGetDocumentTypeProtocolTypeInvalidSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetDocumentTypeProtocolTypeInvalidSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetDocumentTypeProtocolTypeInvalidSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetDocumentTypeProtocolTypeInvalidSessionFaultFaultFaultMessage(String message, it.archiflow94.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public ICardServiceContractGetDocumentTypeProtocolTypeInvalidSessionFaultFaultFaultMessage(String message, it.archiflow94.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public it.archiflow94.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
