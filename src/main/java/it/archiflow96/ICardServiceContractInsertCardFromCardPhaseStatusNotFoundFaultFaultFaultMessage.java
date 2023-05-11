
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:03.404+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusNotFoundFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardFromCardPhaseStatusNotFoundFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.PhaseStatusNotFoundFault phaseStatusNotFoundFault;

    public ICardServiceContractInsertCardFromCardPhaseStatusNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardFromCardPhaseStatusNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardFromCardPhaseStatusNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardFromCardPhaseStatusNotFoundFaultFaultFaultMessage(String message, it.archiflow96.PhaseStatusNotFoundFault phaseStatusNotFoundFault) {
        super(message);
        this.phaseStatusNotFoundFault = phaseStatusNotFoundFault;
    }

    public ICardServiceContractInsertCardFromCardPhaseStatusNotFoundFaultFaultFaultMessage(String message, it.archiflow96.PhaseStatusNotFoundFault phaseStatusNotFoundFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusNotFoundFault = phaseStatusNotFoundFault;
    }

    public it.archiflow96.PhaseStatusNotFoundFault getFaultInfo() {
        return this.phaseStatusNotFoundFault;
    }
}
