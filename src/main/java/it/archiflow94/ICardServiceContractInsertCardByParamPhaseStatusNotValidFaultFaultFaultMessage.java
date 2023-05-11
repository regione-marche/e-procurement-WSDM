
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.848+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "PhaseStatusNotValidFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.PhaseStatusNotValidFault phaseStatusNotValidFault;

    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message, it.archiflow94.PhaseStatusNotValidFault phaseStatusNotValidFault) {
        super(message);
        this.phaseStatusNotValidFault = phaseStatusNotValidFault;
    }

    public ICardServiceContractInsertCardByParamPhaseStatusNotValidFaultFaultFaultMessage(String message, it.archiflow94.PhaseStatusNotValidFault phaseStatusNotValidFault, Throwable cause) {
        super(message, cause);
        this.phaseStatusNotValidFault = phaseStatusNotValidFault;
    }

    public it.archiflow94.PhaseStatusNotValidFault getFaultInfo() {
        return this.phaseStatusNotValidFault;
    }
}
