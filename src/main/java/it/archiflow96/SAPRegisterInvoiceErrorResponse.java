
package it.archiflow96;

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
 *         &lt;element name="SAP_RegisterInvoiceErrorResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}RegisterInvoiceErrorOutput" minOccurs="0"/>
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
    "sapRegisterInvoiceErrorResult"
})
@XmlRootElement(name = "SAP_RegisterInvoiceErrorResponse")
public class SAPRegisterInvoiceErrorResponse {

    @XmlElement(name = "SAP_RegisterInvoiceErrorResult", nillable = true)
    protected RegisterInvoiceErrorOutput sapRegisterInvoiceErrorResult;

    /**
     * Gets the value of the sapRegisterInvoiceErrorResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterInvoiceErrorOutput }
     *     
     */
    public RegisterInvoiceErrorOutput getSAPRegisterInvoiceErrorResult() {
        return sapRegisterInvoiceErrorResult;
    }

    /**
     * Sets the value of the sapRegisterInvoiceErrorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterInvoiceErrorOutput }
     *     
     */
    public void setSAPRegisterInvoiceErrorResult(RegisterInvoiceErrorOutput value) {
        this.sapRegisterInvoiceErrorResult = value;
    }

}
