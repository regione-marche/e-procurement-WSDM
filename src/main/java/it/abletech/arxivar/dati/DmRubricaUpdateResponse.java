
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
 *         &lt;element name="Dm_Rubrica_UpdateResult" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica" minOccurs="0"/>
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
    "dmRubricaUpdateResult"
})
@XmlRootElement(name = "Dm_Rubrica_UpdateResponse")
public class DmRubricaUpdateResponse {

    @XmlElement(name = "Dm_Rubrica_UpdateResult")
    protected DmRubrica dmRubricaUpdateResult;

    /**
     * Gets the value of the dmRubricaUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubrica }
     *     
     */
    public DmRubrica getDmRubricaUpdateResult() {
        return dmRubricaUpdateResult;
    }

    /**
     * Sets the value of the dmRubricaUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubrica }
     *     
     */
    public void setDmRubricaUpdateResult(DmRubrica value) {
        this.dmRubricaUpdateResult = value;
    }

}
