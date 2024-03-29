
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
 *         &lt;element name="Dm_Profile_Insert_For_BarcodeResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Result" minOccurs="0"/>
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
    "dmProfileInsertForBarcodeResult"
})
@XmlRootElement(name = "Dm_Profile_Insert_For_BarcodeResponse")
public class DmProfileInsertForBarcodeResponse {

    @XmlElement(name = "Dm_Profile_Insert_For_BarcodeResult")
    protected DmProfileResult dmProfileInsertForBarcodeResult;

    /**
     * Gets the value of the dmProfileInsertForBarcodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileResult }
     *     
     */
    public DmProfileResult getDmProfileInsertForBarcodeResult() {
        return dmProfileInsertForBarcodeResult;
    }

    /**
     * Sets the value of the dmProfileInsertForBarcodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileResult }
     *     
     */
    public void setDmProfileInsertForBarcodeResult(DmProfileResult value) {
        this.dmProfileInsertForBarcodeResult = value;
    }

}
