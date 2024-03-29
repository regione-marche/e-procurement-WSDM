
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:05.138+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "FileTooBigFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardDocument4FileTooBigFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.FileTooBigFault fileTooBigFault;

    public ICardServiceContractGetCardDocument4FileTooBigFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardDocument4FileTooBigFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardDocument4FileTooBigFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardDocument4FileTooBigFaultFaultFaultMessage(String message, it.archiflow93.FileTooBigFault fileTooBigFault) {
        super(message);
        this.fileTooBigFault = fileTooBigFault;
    }

    public ICardServiceContractGetCardDocument4FileTooBigFaultFaultFaultMessage(String message, it.archiflow93.FileTooBigFault fileTooBigFault, Throwable cause) {
        super(message, cause);
        this.fileTooBigFault = fileTooBigFault;
    }

    public it.archiflow93.FileTooBigFault getFaultInfo() {
        return this.fileTooBigFault;
    }
}
