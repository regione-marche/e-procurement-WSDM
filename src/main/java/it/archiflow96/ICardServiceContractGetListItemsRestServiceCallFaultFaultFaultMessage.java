
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.214+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "RestServiceCallFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetListItemsRestServiceCallFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.RestServiceCallFault restServiceCallFault;

    public ICardServiceContractGetListItemsRestServiceCallFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetListItemsRestServiceCallFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetListItemsRestServiceCallFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetListItemsRestServiceCallFaultFaultFaultMessage(String message, it.archiflow96.RestServiceCallFault restServiceCallFault) {
        super(message);
        this.restServiceCallFault = restServiceCallFault;
    }

    public ICardServiceContractGetListItemsRestServiceCallFaultFaultFaultMessage(String message, it.archiflow96.RestServiceCallFault restServiceCallFault, Throwable cause) {
        super(message, cause);
        this.restServiceCallFault = restServiceCallFault;
    }

    public it.archiflow96.RestServiceCallFault getFaultInfo() {
        return this.restServiceCallFault;
    }
}
