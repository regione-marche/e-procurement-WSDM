
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.648+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "EmailFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.EmailFault emailFault;

    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message, it.archiflow93.EmailFault emailFault) {
        super(message);
        this.emailFault = emailFault;
    }

    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message, it.archiflow93.EmailFault emailFault, Throwable cause) {
        super(message, cause);
        this.emailFault = emailFault;
    }

    public it.archiflow93.EmailFault getFaultInfo() {
        return this.emailFault;
    }
}