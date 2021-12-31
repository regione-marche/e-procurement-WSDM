
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:04.209+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "FileTooBigFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractGetCardDocument3FileTooBigFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.FileTooBigFault fileTooBigFault;

    public ICardServiceContractGetCardDocument3FileTooBigFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractGetCardDocument3FileTooBigFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractGetCardDocument3FileTooBigFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractGetCardDocument3FileTooBigFaultFaultFaultMessage(String message, it.archiflow93.FileTooBigFault fileTooBigFault) {
        super(message);
        this.fileTooBigFault = fileTooBigFault;
    }

    public ICardServiceContractGetCardDocument3FileTooBigFaultFaultFaultMessage(String message, it.archiflow93.FileTooBigFault fileTooBigFault, Throwable cause) {
        super(message, cause);
        this.fileTooBigFault = fileTooBigFault;
    }

    public it.archiflow93.FileTooBigFault getFaultInfo() {
        return this.fileTooBigFault;
    }
}