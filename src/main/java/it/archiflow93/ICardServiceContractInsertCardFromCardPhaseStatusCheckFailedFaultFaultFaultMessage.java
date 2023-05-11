
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.893+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusCheckFailedFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardFromCardPhaseStatusCheckFailedFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.PhaseStatusCheckFailedFault phaseStatusCheckFailedFault;

    public ICardServiceContractInsertCardFromCardPhaseStatusCheckFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardFromCardPhaseStatusCheckFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardFromCardPhaseStatusCheckFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardFromCardPhaseStatusCheckFailedFaultFaultFaultMessage(String message, it.archiflow93.PhaseStatusCheckFailedFault phaseStatusCheckFailedFault) {
        super(message);
        this.phaseStatusCheckFailedFault = phaseStatusCheckFailedFault;
    }

    public ICardServiceContractInsertCardFromCardPhaseStatusCheckFailedFaultFaultFaultMessage(String message, it.archiflow93.PhaseStatusCheckFailedFault phaseStatusCheckFailedFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusCheckFailedFault = phaseStatusCheckFailedFault;
    }

    public it.archiflow93.PhaseStatusCheckFailedFault getFaultInfo() {
        return this.phaseStatusCheckFailedFault;
    }
}
