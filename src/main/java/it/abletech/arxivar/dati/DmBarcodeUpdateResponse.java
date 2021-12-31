
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
 *         &lt;element name="Dm_Barcode_UpdateResult" type="{http://www.Abletech.it/Arxivar}Dm_Barcode" minOccurs="0"/>
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
    "dmBarcodeUpdateResult"
})
@XmlRootElement(name = "Dm_Barcode_UpdateResponse")
public class DmBarcodeUpdateResponse {

    @XmlElement(name = "Dm_Barcode_UpdateResult")
    protected DmBarcode dmBarcodeUpdateResult;

    /**
     * Gets the value of the dmBarcodeUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmBarcode }
     *     
     */
    public DmBarcode getDmBarcodeUpdateResult() {
        return dmBarcodeUpdateResult;
    }

    /**
     * Sets the value of the dmBarcodeUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmBarcode }
     *     
     */
    public void setDmBarcodeUpdateResult(DmBarcode value) {
        this.dmBarcodeUpdateResult = value;
    }

}
