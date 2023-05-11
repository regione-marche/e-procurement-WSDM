
package it.archiflow93;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2019-02-01T10:12:05.114+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidExecutiveOfficeFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSAPRegisterInvoiceInvalidExecutiveOfficeFaultFaultFaultMessage extends Exception {
    
    private it.archiflow93.InvalidExecutiveOfficeFault invalidExecutiveOfficeFault;

    public ICardServiceContractSAPRegisterInvoiceInvalidExecutiveOfficeFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSAPRegisterInvoiceInvalidExecutiveOfficeFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSAPRegisterInvoiceInvalidExecutiveOfficeFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSAPRegisterInvoiceInvalidExecutiveOfficeFaultFaultFaultMessage(String message, it.archiflow93.InvalidExecutiveOfficeFault invalidExecutiveOfficeFault) {
        super(message);
        this.invalidExecutiveOfficeFault = invalidExecutiveOfficeFault;
    }

    public ICardServiceContractSAPRegisterInvoiceInvalidExecutiveOfficeFaultFaultFaultMessage(String message, it.archiflow93.InvalidExecutiveOfficeFault invalidExecutiveOfficeFault, Throwable cause) {
        super(message, cause);
        this.invalidExecutiveOfficeFault = invalidExecutiveOfficeFault;
    }

    public it.archiflow93.InvalidExecutiveOfficeFault getFaultInfo() {
        return this.invalidExecutiveOfficeFault;
    }
}
