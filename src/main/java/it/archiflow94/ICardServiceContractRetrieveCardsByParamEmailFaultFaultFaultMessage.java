
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.308+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "EmailFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.EmailFault emailFault;

    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message, it.archiflow94.EmailFault emailFault) {
        super(message);
        this.emailFault = emailFault;
    }

    public ICardServiceContractRetrieveCardsByParamEmailFaultFaultFaultMessage(String message, it.archiflow94.EmailFault emailFault, Throwable cause) {
        super(message, cause);
        this.emailFault = emailFault;
    }

    public it.archiflow94.EmailFault getFaultInfo() {
        return this.emailFault;
    }
}