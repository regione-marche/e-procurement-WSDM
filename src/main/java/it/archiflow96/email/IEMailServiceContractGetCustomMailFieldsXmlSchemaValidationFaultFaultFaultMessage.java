
package it.archiflow96.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:09.120+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "XmlSchemaValidationFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class IEMailServiceContractGetCustomMailFieldsXmlSchemaValidationFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.email.XmlSchemaValidationFault xmlSchemaValidationFault;

    public IEMailServiceContractGetCustomMailFieldsXmlSchemaValidationFaultFaultFaultMessage() {
        super();
    }
    
    public IEMailServiceContractGetCustomMailFieldsXmlSchemaValidationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEMailServiceContractGetCustomMailFieldsXmlSchemaValidationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEMailServiceContractGetCustomMailFieldsXmlSchemaValidationFaultFaultFaultMessage(String message, it.archiflow96.email.XmlSchemaValidationFault xmlSchemaValidationFault) {
        super(message);
        this.xmlSchemaValidationFault = xmlSchemaValidationFault;
    }

    public IEMailServiceContractGetCustomMailFieldsXmlSchemaValidationFaultFaultFaultMessage(String message, it.archiflow96.email.XmlSchemaValidationFault xmlSchemaValidationFault, Throwable cause) {
        super(message, cause);
        this.xmlSchemaValidationFault = xmlSchemaValidationFault;
    }

    public it.archiflow96.email.XmlSchemaValidationFault getFaultInfo() {
        return this.xmlSchemaValidationFault;
    }
}