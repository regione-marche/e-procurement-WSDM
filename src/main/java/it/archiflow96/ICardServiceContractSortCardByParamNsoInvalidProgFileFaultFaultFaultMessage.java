
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.415+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NsoInvalidProgFileFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSortCardByParamNsoInvalidProgFileFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.NsoInvalidProgFileFault nsoInvalidProgFileFault;

    public ICardServiceContractSortCardByParamNsoInvalidProgFileFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSortCardByParamNsoInvalidProgFileFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSortCardByParamNsoInvalidProgFileFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSortCardByParamNsoInvalidProgFileFaultFaultFaultMessage(String message, it.archiflow96.NsoInvalidProgFileFault nsoInvalidProgFileFault) {
        super(message);
        this.nsoInvalidProgFileFault = nsoInvalidProgFileFault;
    }

    public ICardServiceContractSortCardByParamNsoInvalidProgFileFaultFaultFaultMessage(String message, it.archiflow96.NsoInvalidProgFileFault nsoInvalidProgFileFault, Throwable cause) {
        super(message, cause);
        this.nsoInvalidProgFileFault = nsoInvalidProgFileFault;
    }

    public it.archiflow96.NsoInvalidProgFileFault getFaultInfo() {
        return this.nsoInvalidProgFileFault;
    }
}