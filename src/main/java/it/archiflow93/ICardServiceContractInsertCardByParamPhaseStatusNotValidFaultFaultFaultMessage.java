
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.046+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusNotValidFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.PhaseStatusNotValidFault phaseStatusNotValidFault;

    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message, it.archiflow93.PhaseStatusNotValidFault phaseStatusNotValidFault) {
        super(message);
        this.phaseStatusNotValidFault = phaseStatusNotValidFault;
    }

    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message, it.archiflow93.PhaseStatusNotValidFault phaseStatusNotValidFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusNotValidFault = phaseStatusNotValidFault;
    }

    public it.archiflow93.PhaseStatusNotValidFault getFaultInfo() {
        return this.phaseStatusNotValidFault;
    }
}
