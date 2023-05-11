
package it.archiflow94;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2018-11-20T10:00:13.838+01:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "LicenseSupportFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractInsertCardByParamLicenseSupportFaultFaultFaultMessage extends Exception {
    
    private it.archiflow94.LicenseSupportFault licenseSupportFault;

    public ICardServiceContractInsertCardByParamLicenseSupportFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractInsertCardByParamLicenseSupportFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractInsertCardByParamLicenseSupportFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractInsertCardByParamLicenseSupportFaultFaultFaultMessage(String message, it.archiflow94.LicenseSupportFault licenseSupportFault) {
        super(message);
        this.licenseSupportFault = licenseSupportFault;
    }

    public ICardServiceContractInsertCardByParamLicenseSupportFaultFaultFaultMessage(String message, it.archiflow94.LicenseSupportFault licenseSupportFault, Throwable cause) {
        super(message, cause);
        this.licenseSupportFault = licenseSupportFault;
    }

    public it.archiflow94.LicenseSupportFault getFaultInfo() {
        return this.licenseSupportFault;
    }
}
