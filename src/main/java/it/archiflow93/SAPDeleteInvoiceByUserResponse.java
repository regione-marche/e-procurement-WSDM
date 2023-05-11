
package it.archiflow93;

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
 *         &lt;element name="SAP_DeleteInvoiceByUserResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DeleteInvoiceByUserOutput" minOccurs="0"/>
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
    "sapDeleteInvoiceByUserResult"
})
@XmlRootElement(name = "SAP_DeleteInvoiceByUserResponse")
public class SAPDeleteInvoiceByUserResponse {

    @XmlElement(name = "SAP_DeleteInvoiceByUserResult", nillable = true)
    protected DeleteInvoiceByUserOutput sapDeleteInvoiceByUserResult;

    /**
     * Gets the value of the sapDeleteInvoiceByUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteInvoiceByUserOutput }
     *     
     */
    public DeleteInvoiceByUserOutput getSAPDeleteInvoiceByUserResult() {
        return sapDeleteInvoiceByUserResult;
    }

    /**
     * Sets the value of the sapDeleteInvoiceByUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteInvoiceByUserOutput }
     *     
     */
    public void setSAPDeleteInvoiceByUserResult(DeleteInvoiceByUserOutput value) {
        this.sapDeleteInvoiceByUserResult = value;
    }

}
