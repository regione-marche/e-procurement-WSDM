
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.738+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "DeleteSpeInvoiceSentFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault;

    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, it.archiflow94.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault) {
        super(message);
        this.deleteSpeInvoiceSentFault = deleteSpeInvoiceSentFault;
    }

    public ICardServiceContractDeleteCardByParamDeleteSpeInvoiceSentFaultFaultFaultMessage(String message, it.archiflow94.DeleteSpeInvoiceSentFault deleteSpeInvoiceSentFault, Throwable cause) {
        super(message, cause);
        this.deleteSpeInvoiceSentFault = deleteSpeInvoiceSentFault;
    }

    public it.archiflow94.DeleteSpeInvoiceSentFault getFaultInfo() {
        return this.deleteSpeInvoiceSentFault;
    }
}