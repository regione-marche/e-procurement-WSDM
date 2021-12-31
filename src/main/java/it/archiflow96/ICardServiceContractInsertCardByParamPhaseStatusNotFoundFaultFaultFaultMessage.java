
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.175+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardByParamPhaseStatusNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.PhaseStatusNotFoundFault phaseStatusNotFoundFault;

    public ICardServiceContractInsertCardByParamPhaseStatusNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardByParamPhaseStatusNotFoundFaultFaultFaultMessage(String message, it.archiflow96.PhaseStatusNotFoundFault phaseStatusNotFoundFault) {
        super(message);
        this.phaseStatusNotFoundFault = phaseStatusNotFoundFault;
    }

    public ICardServiceContractInsertCardByParamPhaseStatusNotFoundFaultFaultFaultMessage(String message, it.archiflow96.PhaseStatusNotFoundFault phaseStatusNotFoundFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusNotFoundFault = phaseStatusNotFoundFault;
    }

    public it.archiflow96.PhaseStatusNotFoundFault getFaultInfo() {
        return this.phaseStatusNotFoundFault;
    }
}