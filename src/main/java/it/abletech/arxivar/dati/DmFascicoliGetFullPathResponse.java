
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
 *         &lt;element name="Dm_Fascicoli_GetFullPathResult" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_KeyValue" minOccurs="0"/>
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
    "dmFascicoliGetFullPathResult"
})
@XmlRootElement(name = "Dm_Fascicoli_GetFullPathResponse")
public class DmFascicoliGetFullPathResponse {

    @XmlElement(name = "Dm_Fascicoli_GetFullPathResult")
    protected ArrayOfArxKeyValue dmFascicoliGetFullPathResult;

    /**
     * Gets the value of the dmFascicoliGetFullPathResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxKeyValue }
     *     
     */
    public ArrayOfArxKeyValue getDmFascicoliGetFullPathResult() {
        return dmFascicoliGetFullPathResult;
    }

    /**
     * Sets the value of the dmFascicoliGetFullPathResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxKeyValue }
     *     
     */
    public void setDmFascicoliGetFullPathResult(ArrayOfArxKeyValue value) {
        this.dmFascicoliGetFullPathResult = value;
    }

}
