
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
 *         &lt;element name="Dm_Profile_Insert_For_MaskResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Result" minOccurs="0"/>
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
    "dmProfileInsertForMaskResult"
})
@XmlRootElement(name = "Dm_Profile_Insert_For_MaskResponse")
public class DmProfileInsertForMaskResponse {

    @XmlElement(name = "Dm_Profile_Insert_For_MaskResult")
    protected DmProfileResult dmProfileInsertForMaskResult;

    /**
     * Gets the value of the dmProfileInsertForMaskResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileResult }
     *     
     */
    public DmProfileResult getDmProfileInsertForMaskResult() {
        return dmProfileInsertForMaskResult;
    }

    /**
     * Sets the value of the dmProfileInsertForMaskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileResult }
     *     
     */
    public void setDmProfileInsertForMaskResult(DmProfileResult value) {
        this.dmProfileInsertForMaskResult = value;
    }

}
