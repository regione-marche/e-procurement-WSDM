
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
 *         &lt;element name="Dm_Fascicoli_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_Fascicoli" minOccurs="0"/>
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
    "dmFascicoliInsertResult"
})
@XmlRootElement(name = "Dm_Fascicoli_InsertResponse")
public class DmFascicoliInsertResponse {

    @XmlElement(name = "Dm_Fascicoli_InsertResult")
    protected DmFascicoli dmFascicoliInsertResult;

    /**
     * Gets the value of the dmFascicoliInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmFascicoli }
     *     
     */
    public DmFascicoli getDmFascicoliInsertResult() {
        return dmFascicoliInsertResult;
    }

    /**
     * Sets the value of the dmFascicoliInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFascicoli }
     *     
     */
    public void setDmFascicoliInsertResult(DmFascicoli value) {
        this.dmFascicoliInsertResult = value;
    }

}
