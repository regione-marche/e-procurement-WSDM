
package it.archiflow93.classification;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:07.404+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "DuplicatedArchivalNumberFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IClassificationServiceUpdateFascicoloByParamDuplicatedArchivalNumberFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.classification.DuplicatedArchivalNumberFault duplicatedArchivalNumberFault;

    public IClassificationServiceUpdateFascicoloByParamDuplicatedArchivalNumberFaultFaultFaultMessage() {
        super();
    }
    
    public IClassificationServiceUpdateFascicoloByParamDuplicatedArchivalNumberFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IClassificationServiceUpdateFascicoloByParamDuplicatedArchivalNumberFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IClassificationServiceUpdateFascicoloByParamDuplicatedArchivalNumberFaultFaultFaultMessage(String message, it.archiflow93.classification.DuplicatedArchivalNumberFault duplicatedArchivalNumberFault) {
        super(message);
        this.duplicatedArchivalNumberFault = duplicatedArchivalNumberFault;
    }

    public IClassificationServiceUpdateFascicoloByParamDuplicatedArchivalNumberFaultFaultFaultMessage(String message, it.archiflow93.classification.DuplicatedArchivalNumberFault duplicatedArchivalNumberFault, Throwable cause) {
        super(message, cause);
        this.duplicatedArchivalNumberFault = duplicatedArchivalNumberFault;
    }

    public it.archiflow93.classification.DuplicatedArchivalNumberFault getFaultInfo() {
        return this.duplicatedArchivalNumberFault;
    }
}