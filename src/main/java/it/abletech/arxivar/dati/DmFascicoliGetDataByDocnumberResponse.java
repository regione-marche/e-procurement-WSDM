
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
 *         &lt;element name="Dm_Fascicoli_GetData_By_DocnumberResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Fascicoli" minOccurs="0"/>
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
    "dmFascicoliGetDataByDocnumberResult"
})
@XmlRootElement(name = "Dm_Fascicoli_GetData_By_DocnumberResponse")
public class DmFascicoliGetDataByDocnumberResponse {

    @XmlElement(name = "Dm_Fascicoli_GetData_By_DocnumberResult")
    protected ArrayOfDmFascicoli dmFascicoliGetDataByDocnumberResult;

    /**
     * Gets the value of the dmFascicoliGetDataByDocnumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmFascicoli }
     *     
     */
    public ArrayOfDmFascicoli getDmFascicoliGetDataByDocnumberResult() {
        return dmFascicoliGetDataByDocnumberResult;
    }

    /**
     * Sets the value of the dmFascicoliGetDataByDocnumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmFascicoli }
     *     
     */
    public void setDmFascicoliGetDataByDocnumberResult(ArrayOfDmFascicoli value) {
        this.dmFascicoliGetDataByDocnumberResult = value;
    }

}
