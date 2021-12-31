
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.878+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "DeleteSpeInvoiceSentFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractDeleteCardDeleteSpeInvoiceSentFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault;

    public ICardServiceContractDeleteCardDeleteSpeInvoiceSentFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractDeleteCardDeleteSpeInvoiceSentFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractDeleteCardDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractDeleteCardDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, it.archiflow94.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault) {
        super(message);
        this.deleteSpeInvoiceSentFault = deleteSpeInvoiceSentFault;
    }

    public ICardServiceContractDeleteCardDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, it.archiflow94.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault, Throwable cause) {
        super(message, cause);
        this.deleteSpeInvoiceSentFault = deleteSpeInvoiceSentFault;
    }

    public it.archiflow94.DeleteSpeInvoiceSentFault getFaultInfo() {
        return this.deleteSpeInvoiceSentFault;
    }
}