
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SAP_RegisterInvoiceResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}RegisterInvoiceOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sapRegisterInvoiceResult"
})
@XmlRootElement(name = "SAP_RegisterInvoiceResponse")
public class SAPRegisterInvoiceResponse {

    @XmlElement(name = "SAP_RegisterInvoiceResult", nillable = true)
    protected RegisterInvoiceOutput sapRegisterInvoiceResult;

    /**
     * Gets the value of the sapRegisterInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterInvoiceOutput }
     *     
     */
    public RegisterInvoiceOutput getSAPRegisterInvoiceResult() {
        return sapRegisterInvoiceResult;
    }

    /**
     * Sets the value of the sapRegisterInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterInvoiceOutput }
     *     
     */
    public void setSAPRegisterInvoiceResult(RegisterInvoiceOutput value) {
        this.sapRegisterInvoiceResult = value;
    }

}
