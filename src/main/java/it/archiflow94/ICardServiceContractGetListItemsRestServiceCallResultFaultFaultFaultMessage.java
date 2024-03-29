
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.398+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "RestServiceCallResultFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.RestServiceCallResultFault restServiceCallResultFault;

    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message, it.archiflow94.RestServiceCallResultFault restServiceCallResultFault) {
        super(message);
        this.restServiceCallResultFault = restServiceCallResultFault;
    }

    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message, it.archiflow94.RestServiceCallResultFault restServiceCallResultFault, Throwable cause) {
        super(message, cause);
        this.restServiceCallResultFault = restServiceCallResultFault;
    }

    public it.archiflow94.RestServiceCallResultFault getFaultInfo() {
        return this.restServiceCallResultFault;
    }
}
