
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.452+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "FileTooBigFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.FileTooBigFault fileTooBigFault;

    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message, it.archiflow96.FileTooBigFault fileTooBigFault) {
        super(message);
        this.fileTooBigFault = fileTooBigFault;
    }

    public ICardServiceContractGetCardDocumentFileTooBigFaultFaultFaultMessage(String message, it.archiflow96.FileTooBigFault fileTooBigFault, Throwable cause) {
        super(message, cause);
        this.fileTooBigFault = fileTooBigFault;
    }

    public it.archiflow96.FileTooBigFault getFaultInfo() {
        return this.fileTooBigFault;
    }
}
