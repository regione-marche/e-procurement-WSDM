
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:01.956+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoStyleSheetFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetStyleSheetByParamNoStyleSheetFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.NoStyleSheetFault noStyleSheetFault;

    public ICardServiceContractGetStyleSheetByParamNoStyleSheetFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetStyleSheetByParamNoStyleSheetFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetStyleSheetByParamNoStyleSheetFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetStyleSheetByParamNoStyleSheetFaultFaultFaultMessage(String message, it.archiflow96.NoStyleSheetFault noStyleSheetFault) {
        super(message);
        this.noStyleSheetFault = noStyleSheetFault;
    }

    public ICardServiceContractGetStyleSheetByParamNoStyleSheetFaultFaultFaultMessage(String message, it.archiflow96.NoStyleSheetFault noStyleSheetFault, Throwable cause) {
        super(message, cause);
        this.noStyleSheetFault = noStyleSheetFault;
    }

    public it.archiflow96.NoStyleSheetFault getFaultInfo() {
        return this.noStyleSheetFault;
    }
}
