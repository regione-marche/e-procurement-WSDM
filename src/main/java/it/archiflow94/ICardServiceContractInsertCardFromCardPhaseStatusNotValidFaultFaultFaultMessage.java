
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:14.488+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusNotValidFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardFromCardPhaseStatusNotValidFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.PhaseStatusNotValidFault phaseStatusNotValidFault;

    public ICardServiceContractInsertCardFromCardPhaseStatusNotValidFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardFromCardPhaseStatusNotValidFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardFromCardPhaseStatusNotValidFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardFromCardPhaseStatusNotValidFaultFaultFaultMessage(String message, it.archiflow94.PhaseStatusNotValidFault phaseStatusNotValidFault) {
        super(message);
        this.phaseStatusNotValidFault = phaseStatusNotValidFault;
    }

    public ICardServiceContractInsertCardFromCardPhaseStatusNotValidFaultFaultFaultMessage(String message, it.archiflow94.PhaseStatusNotValidFault phaseStatusNotValidFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusNotValidFault = phaseStatusNotValidFault;
    }

    public it.archiflow94.PhaseStatusNotValidFault getFaultInfo() {
        return this.phaseStatusNotValidFault;
    }
}
