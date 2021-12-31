
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
 *         &lt;element name="Dm_Contatti_Select_Get_New_InstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_Contatti_Select" minOccurs="0"/>
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
    "dmContattiSelectGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_Contatti_Select_Get_New_InstanceResponse")
public class DmContattiSelectGetNewInstanceResponse {

    @XmlElement(name = "Dm_Contatti_Select_Get_New_InstanceResult")
    protected DmContattiSelect dmContattiSelectGetNewInstanceResult;

    /**
     * Gets the value of the dmContattiSelectGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmContattiSelect }
     *     
     */
    public DmContattiSelect getDmContattiSelectGetNewInstanceResult() {
        return dmContattiSelectGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmContattiSelectGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmContattiSelect }
     *     
     */
    public void setDmContattiSelectGetNewInstanceResult(DmContattiSelect value) {
        this.dmContattiSelectGetNewInstanceResult = value;
    }

}
