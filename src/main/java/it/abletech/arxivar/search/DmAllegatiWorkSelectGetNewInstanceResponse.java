
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
 *         &lt;element name="Dm_AllegatiWork_Select_Get_New_InstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_AllegatiWork_Select" minOccurs="0"/>
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
    "dmAllegatiWorkSelectGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_AllegatiWork_Select_Get_New_InstanceResponse")
public class DmAllegatiWorkSelectGetNewInstanceResponse {

    @XmlElement(name = "Dm_AllegatiWork_Select_Get_New_InstanceResult")
    protected DmAllegatiWorkSelect dmAllegatiWorkSelectGetNewInstanceResult;

    /**
     * Gets the value of the dmAllegatiWorkSelectGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmAllegatiWorkSelect }
     *     
     */
    public DmAllegatiWorkSelect getDmAllegatiWorkSelectGetNewInstanceResult() {
        return dmAllegatiWorkSelectGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmAllegatiWorkSelectGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAllegatiWorkSelect }
     *     
     */
    public void setDmAllegatiWorkSelectGetNewInstanceResult(DmAllegatiWorkSelect value) {
        this.dmAllegatiWorkSelectGetNewInstanceResult = value;
    }

}
