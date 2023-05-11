
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.214+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "RestServiceCallResultFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.RestServiceCallResultFault restServiceCallResultFault;

    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message, it.archiflow96.RestServiceCallResultFault restServiceCallResultFault) {
        super(message);
        this.restServiceCallResultFault = restServiceCallResultFault;
    }

    public ICardServiceContractGetListItemsRestServiceCallResultFaultFaultFaultMessage(String message, it.archiflow96.RestServiceCallResultFault restServiceCallResultFault, Throwable cause) {
        super(message, cause);
        this.restServiceCallResultFault = restServiceCallResultFault;
    }

    public it.archiflow96.RestServiceCallResultFault getFaultInfo() {
        return this.restServiceCallResultFault;
    }
}
