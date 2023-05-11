
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
 *         &lt;element name="Dm_Profile_ForUpdate_GetNewInstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_ForUpdate" minOccurs="0"/>
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
    "dmProfileForUpdateGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_Profile_ForUpdate_GetNewInstanceResponse")
public class DmProfileForUpdateGetNewInstanceResponse {

    @XmlElement(name = "Dm_Profile_ForUpdate_GetNewInstanceResult")
    protected DmProfileForUpdate dmProfileForUpdateGetNewInstanceResult;

    /**
     * Gets the value of the dmProfileForUpdateGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileForUpdate }
     *     
     */
    public DmProfileForUpdate getDmProfileForUpdateGetNewInstanceResult() {
        return dmProfileForUpdateGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmProfileForUpdateGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileForUpdate }
     *     
     */
    public void setDmProfileForUpdateGetNewInstanceResult(DmProfileForUpdate value) {
        this.dmProfileForUpdateGetNewInstanceResult = value;
    }

}
