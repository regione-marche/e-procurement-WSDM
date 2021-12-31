
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
 *         &lt;element name="Dm_Profile_Select_Get_New_InstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Select" minOccurs="0"/>
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
    "dmProfileSelectGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_Profile_Select_Get_New_InstanceResponse")
public class DmProfileSelectGetNewInstanceResponse {

    @XmlElement(name = "Dm_Profile_Select_Get_New_InstanceResult")
    protected DmProfileSelect dmProfileSelectGetNewInstanceResult;

    /**
     * Gets the value of the dmProfileSelectGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileSelect }
     *     
     */
    public DmProfileSelect getDmProfileSelectGetNewInstanceResult() {
        return dmProfileSelectGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmProfileSelectGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileSelect }
     *     
     */
    public void setDmProfileSelectGetNewInstanceResult(DmProfileSelect value) {
        this.dmProfileSelectGetNewInstanceResult = value;
    }

}
