
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
 *         &lt;element name="Dm_Fascicoli_GetData_ByIdResult" type="{http://www.Abletech.it/Arxivar}Dm_Fascicoli" minOccurs="0"/>
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
    "dmFascicoliGetDataByIdResult"
})
@XmlRootElement(name = "Dm_Fascicoli_GetData_ByIdResponse")
public class DmFascicoliGetDataByIdResponse {

    @XmlElement(name = "Dm_Fascicoli_GetData_ByIdResult")
    protected DmFascicoli dmFascicoliGetDataByIdResult;

    /**
     * Gets the value of the dmFascicoliGetDataByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmFascicoli }
     *     
     */
    public DmFascicoli getDmFascicoliGetDataByIdResult() {
        return dmFascicoliGetDataByIdResult;
    }

    /**
     * Sets the value of the dmFascicoliGetDataByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFascicoli }
     *     
     */
    public void setDmFascicoliGetDataByIdResult(DmFascicoli value) {
        this.dmFascicoliGetDataByIdResult = value;
    }

}
