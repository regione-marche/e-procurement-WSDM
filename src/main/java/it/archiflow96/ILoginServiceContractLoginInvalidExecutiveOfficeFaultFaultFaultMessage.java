
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:25:56.846+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "InvalidExecutiveOfficeFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.InvalidExecutiveOfficeFault invalidExecutiveOfficeFault;

    public ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage() {
        super();
    }
    
    public ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage(String message, it.archiflow96.InvalidExecutiveOfficeFault invalidExecutiveOfficeFault) {
        super(message);
        this.invalidExecutiveOfficeFault = invalidExecutiveOfficeFault;
    }

    public ILoginServiceContractLoginInvalidExecutiveOfficeFaultFaultFaultMessage(String message, it.archiflow96.InvalidExecutiveOfficeFault invalidExecutiveOfficeFault, Throwable cause) {
        super(message, cause);
        this.invalidExecutiveOfficeFault = invalidExecutiveOfficeFault;
    }

    public it.archiflow96.InvalidExecutiveOfficeFault getFaultInfo() {
        return this.invalidExecutiveOfficeFault;
    }
}