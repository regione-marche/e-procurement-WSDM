
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
 *         &lt;element name="Dm_AllegatiDoc_UpdateResult" type="{http://www.Abletech.it/Arxivar}Dm_AllegatiDoc" minOccurs="0"/>
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
    "dmAllegatiDocUpdateResult"
})
@XmlRootElement(name = "Dm_AllegatiDoc_UpdateResponse")
public class DmAllegatiDocUpdateResponse {

    @XmlElement(name = "Dm_AllegatiDoc_UpdateResult")
    protected DmAllegatiDoc dmAllegatiDocUpdateResult;

    /**
     * Gets the value of the dmAllegatiDocUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmAllegatiDoc }
     *     
     */
    public DmAllegatiDoc getDmAllegatiDocUpdateResult() {
        return dmAllegatiDocUpdateResult;
    }

    /**
     * Sets the value of the dmAllegatiDocUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAllegatiDoc }
     *     
     */
    public void setDmAllegatiDocUpdateResult(DmAllegatiDoc value) {
        this.dmAllegatiDocUpdateResult = value;
    }

}
