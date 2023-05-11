
package it.archiflow93.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-06-03T16:40:44.597+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "XmlSchemaValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractRetrieveEmailXmlSchemaValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.email.XmlSchemaValidationFault xmlSchemaValidationFault;

    public IEMailServiceContractRetrieveEmailXmlSchemaValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractRetrieveEmailXmlSchemaValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractRetrieveEmailXmlSchemaValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractRetrieveEmailXmlSchemaValidationFaultFaultFaultMessage(String message, it.archiflow93.email.XmlSchemaValidationFault xmlSchemaValidationFault) {
        super(message);
        this.xmlSchemaValidationFault = xmlSchemaValidationFault;
    }

    public IEMailServiceContractRetrieveEmailXmlSchemaValidationFaultFaultFaultMessage(String message, it.archiflow93.email.XmlSchemaValidationFault xmlSchemaValidationFault, Throwable cause) {
        super(message, cause);
        this.xmlSchemaValidationFault = xmlSchemaValidationFault;
    }

    public it.archiflow93.email.XmlSchemaValidationFault getFaultInfo() {
        return this.xmlSchemaValidationFault;
    }
}
