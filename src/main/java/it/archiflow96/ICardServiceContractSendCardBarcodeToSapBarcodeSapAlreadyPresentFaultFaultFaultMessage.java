
package it.archiflow96;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2020-08-03T11:26:02.920+02:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "BarcodeSapAlreadyPresentFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults")
public class ICardServiceContractSendCardBarcodeToSapBarcodeSapAlreadyPresentFaultFaultFaultMessage extends Exception {
    
    private it.archiflow96.BarcodeSapAlreadyPresentFault barcodeSapAlreadyPresentFault;

    public ICardServiceContractSendCardBarcodeToSapBarcodeSapAlreadyPresentFaultFaultFaultMessage() {
        super();
    }
    
    public ICardServiceContractSendCardBarcodeToSapBarcodeSapAlreadyPresentFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICardServiceContractSendCardBarcodeToSapBarcodeSapAlreadyPresentFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICardServiceContractSendCardBarcodeToSapBarcodeSapAlreadyPresentFaultFaultFaultMessage(String message, it.archiflow96.BarcodeSapAlreadyPresentFault barcodeSapAlreadyPresentFault) {
        super(message);
        this.barcodeSapAlreadyPresentFault = barcodeSapAlreadyPresentFault;
    }

    public ICardServiceContractSendCardBarcodeToSapBarcodeSapAlreadyPresentFaultFaultFaultMessage(String message, it.archiflow96.BarcodeSapAlreadyPresentFault barcodeSapAlreadyPresentFault, Throwable cause) {
        super(message, cause);
        this.barcodeSapAlreadyPresentFault = barcodeSapAlreadyPresentFault;
    }

    public it.archiflow96.BarcodeSapAlreadyPresentFault getFaultInfo() {
        return this.barcodeSapAlreadyPresentFault;
    }
}
