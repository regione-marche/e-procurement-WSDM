
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.022+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "XmlSchemaValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractStoreEmailXmlSchemaValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.XmlSchemaValidationFault xmlSchemaValidationFault;

    public IEMailServiceContractStoreEmailXmlSchemaValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractStoreEmailXmlSchemaValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractStoreEmailXmlSchemaValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractStoreEmailXmlSchemaValidationFaultFaultFaultMessage(String message, it.archiflow96.email.XmlSchemaValidationFault xmlSchemaValidationFault) {
        super(message);
        this.xmlSchemaValidationFault = xmlSchemaValidationFault;
    }

    public IEMailServiceContractStoreEmailXmlSchemaValidationFaultFaultFaultMessage(String message, it.archiflow96.email.XmlSchemaValidationFault xmlSchemaValidationFault, Throwable cause) {
        super(message, cause);
        this.xmlSchemaValidationFault = xmlSchemaValidationFault;
    }

    public it.archiflow96.email.XmlSchemaValidationFault getFaultInfo() {
        return this.xmlSchemaValidationFault;
    }
}
