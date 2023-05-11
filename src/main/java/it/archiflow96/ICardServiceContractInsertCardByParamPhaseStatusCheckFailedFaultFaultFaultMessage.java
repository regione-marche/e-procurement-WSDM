
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.131+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusCheckFailedFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardByParamPhaseStatusCheckFailedFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.PhaseStatusCheckFailedFault phaseStatusCheckFailedFault;

    public ICardServiceContractInsertCardByParamPhaseStatusCheckFailedFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusCheckFailedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusCheckFailedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardByParamPhaseStatusCheckFailedFaultFaultFaultMessage(String message, it.archiflow96.PhaseStatusCheckFailedFault phaseStatusCheckFailedFault) {
        super(message);
        this.phaseStatusCheckFailedFault = phaseStatusCheckFailedFault;
    }

    public ICardServiceContractInsertCardByParamPhaseStatusCheckFailedFaultFaultFaultMessage(String message, it.archiflow96.PhaseStatusCheckFailedFault phaseStatusCheckFailedFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusCheckFailedFault = phaseStatusCheckFailedFault;
    }

    public it.archiflow96.PhaseStatusCheckFailedFault getFaultInfo() {
        return this.phaseStatusCheckFailedFault;
    }
}
