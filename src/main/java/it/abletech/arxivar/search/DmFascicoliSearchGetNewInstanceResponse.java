
package it.abletech.arxivar.search;

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
 *         &lt;element name="Dm_Fascicoli_Search_Get_New_InstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_Fascicoli_Search" minOccurs="0"/>
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
    "dmFascicoliSearchGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_Fascicoli_Search_Get_New_InstanceResponse")
public class DmFascicoliSearchGetNewInstanceResponse {

    @XmlElement(name = "Dm_Fascicoli_Search_Get_New_InstanceResult")
    protected DmFascicoliSearch dmFascicoliSearchGetNewInstanceResult;

    /**
     * Gets the value of the dmFascicoliSearchGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmFascicoliSearch }
     *     
     */
    public DmFascicoliSearch getDmFascicoliSearchGetNewInstanceResult() {
        return dmFascicoliSearchGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmFascicoliSearchGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFascicoliSearch }
     *     
     */
    public void setDmFascicoliSearchGetNewInstanceResult(DmFascicoliSearch value) {
        this.dmFascicoliSearchGetNewInstanceResult = value;
    }

}
