
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.905+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NsoInvalidProgFileFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCard3NsoInvalidProgFileFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.NsoInvalidProgFileFault nsoInvalidProgFileFault;

    public ICardServiceContractInsertCard3NsoInvalidProgFileFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCard3NsoInvalidProgFileFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCard3NsoInvalidProgFileFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCard3NsoInvalidProgFileFaultFaultFaultMessage(String message, it.archiflow96.NsoInvalidProgFileFault nsoInvalidProgFileFault) {
        super(message);
        this.nsoInvalidProgFileFault = nsoInvalidProgFileFault;
    }

    public ICardServiceContractInsertCard3NsoInvalidProgFileFaultFaultFaultMessage(String message, it.archiflow96.NsoInvalidProgFileFault nsoInvalidProgFileFault, Throwable cause) {
        super(message, cause);
        this.nsoInvalidProgFileFault = nsoInvalidProgFileFault;
    }

    public it.archiflow96.NsoInvalidProgFileFault getFaultInfo() {
        return this.nsoInvalidProgFileFault;
    }
}
