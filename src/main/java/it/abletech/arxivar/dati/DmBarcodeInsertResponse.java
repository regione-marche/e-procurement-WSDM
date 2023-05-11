
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_Barcode_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_Barcode" minOccurs="0"/>
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
    "dmBarcodeInsertResult"
})
@XmlRootElement(name = "Dm_Barcode_InsertResponse")
public class DmBarcodeInsertResponse {

    @XmlElement(name = "Dm_Barcode_InsertResult")
    protected DmBarcode dmBarcodeInsertResult;

    /**
     * Gets the value of the dmBarcodeInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmBarcode }
     *     
     */
    public DmBarcode getDmBarcodeInsertResult() {
        return dmBarcodeInsertResult;
    }

    /**
     * Sets the value of the dmBarcodeInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBarcode }
     *     
     */
    public void setDmBarcodeInsertResult(DmBarcode value) {
        this.dmBarcodeInsertResult = value;
    }

}
