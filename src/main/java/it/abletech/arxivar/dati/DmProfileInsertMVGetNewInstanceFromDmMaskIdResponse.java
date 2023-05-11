
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
 *         &lt;element name="Dm_Profile_Insert_MV_GetNewInstance_From_DmMaskIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_MV" minOccurs="0"/>
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
    "dmProfileInsertMVGetNewInstanceFromDmMaskIdResult"
})
@XmlRootElement(name = "Dm_Profile_Insert_MV_GetNewInstance_From_DmMaskIdResponse")
public class DmProfileInsertMVGetNewInstanceFromDmMaskIdResponse {

    @XmlElement(name = "Dm_Profile_Insert_MV_GetNewInstance_From_DmMaskIdResult")
    protected DmProfileInsertMV dmProfileInsertMVGetNewInstanceFromDmMaskIdResult;

    /**
     * Gets the value of the dmProfileInsertMVGetNewInstanceFromDmMaskIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInsertMV }
     *     
     */
    public DmProfileInsertMV getDmProfileInsertMVGetNewInstanceFromDmMaskIdResult() {
        return dmProfileInsertMVGetNewInstanceFromDmMaskIdResult;
    }

    /**
     * Sets the value of the dmProfileInsertMVGetNewInstanceFromDmMaskIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInsertMV }
     *     
     */
    public void setDmProfileInsertMVGetNewInstanceFromDmMaskIdResult(DmProfileInsertMV value) {
        this.dmProfileInsertMVGetNewInstanceFromDmMaskIdResult = value;
    }

}
