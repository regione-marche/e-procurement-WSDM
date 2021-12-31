
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
 *         &lt;element name="Dm_Contatti_UpdateResult" type="{http://www.Abletech.it/Arxivar}Dm_Contatti" minOccurs="0"/>
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
    "dmContattiUpdateResult"
})
@XmlRootElement(name = "Dm_Contatti_UpdateResponse")
public class DmContattiUpdateResponse {

    @XmlElement(name = "Dm_Contatti_UpdateResult")
    protected DmContatti dmContattiUpdateResult;

    /**
     * Gets the value of the dmContattiUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmContatti }
     *     
     */
    public DmContatti getDmContattiUpdateResult() {
        return dmContattiUpdateResult;
    }

    /**
     * Sets the value of the dmContattiUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmContatti }
     *     
     */
    public void setDmContattiUpdateResult(DmContatti value) {
        this.dmContattiUpdateResult = value;
    }

}
