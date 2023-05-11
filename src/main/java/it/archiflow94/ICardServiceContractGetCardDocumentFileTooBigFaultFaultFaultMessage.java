
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.978+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "FileTooBigFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.FileTooBigFault fileTooBigFault;

    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message, it.archiflow94.FileTooBigFault fileTooBigFault) {
        super(message);
        this.fileTooBigFault = fileTooBigFault;
    }

    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message, it.archiflow94.FileTooBigFault fileTooBigFault, Throwable cause) {
        super(message, cause);
        this.fileTooBigFault = fileTooBigFault;
    }

    public it.archiflow94.FileTooBigFault getFaultInfo() {
        return this.fileTooBigFault;
    }
}
