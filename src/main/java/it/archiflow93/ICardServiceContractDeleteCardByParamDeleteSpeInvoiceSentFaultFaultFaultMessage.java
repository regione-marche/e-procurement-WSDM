
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:03.910+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "DeleteSpeInvoiceSentFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault;

    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, it.archiflow93.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault) {
        super(message);
        this.deleteSpeInvoiceSentFault = deleteSpeInvoiceSentFault;
    }

    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, it.archiflow93.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault, Throwable cause) {
        super(message, cause);
        this.deleteSpeInvoiceSentFault = deleteSpeInvoiceSentFault;
    }

    public it.archiflow93.DeleteSpeInvoiceSentFault getFaultInfo() {
        return this.deleteSpeInvoiceSentFault;
    }
}
