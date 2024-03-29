
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
 *         &lt;element name="Dm_Fascicoli_GetDataResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Fascicoli" minOccurs="0"/>
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
    "dmFascicoliGetDataResult"
})
@XmlRootElement(name = "Dm_Fascicoli_GetDataResponse")
public class DmFascicoliGetDataResponse {

    @XmlElement(name = "Dm_Fascicoli_GetDataResult")
    protected ArrayOfDmFascicoli dmFascicoliGetDataResult;

    /**
     * Gets the value of the dmFascicoliGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmFascicoli }
     *     
     */
    public ArrayOfDmFascicoli getDmFascicoliGetDataResult() {
        return dmFascicoliGetDataResult;
    }

    /**
     * Sets the value of the dmFascicoliGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmFascicoli }
     *     
     */
    public void setDmFascicoliGetDataResult(ArrayOfDmFascicoli value) {
        this.dmFascicoliGetDataResult = value;
    }

}
