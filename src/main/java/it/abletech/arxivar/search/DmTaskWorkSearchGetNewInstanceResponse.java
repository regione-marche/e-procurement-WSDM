
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
 *         &lt;element name="Dm_TaskWork_Search_GetNewInstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_TaskWork_Search" minOccurs="0"/>
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
    "dmTaskWorkSearchGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_TaskWork_Search_GetNewInstanceResponse")
public class DmTaskWorkSearchGetNewInstanceResponse {

    @XmlElement(name = "Dm_TaskWork_Search_GetNewInstanceResult")
    protected DmTaskWorkSearch dmTaskWorkSearchGetNewInstanceResult;

    /**
     * Gets the value of the dmTaskWorkSearchGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmTaskWorkSearch }
     *     
     */
    public DmTaskWorkSearch getDmTaskWorkSearchGetNewInstanceResult() {
        return dmTaskWorkSearchGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmTaskWorkSearchGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTaskWorkSearch }
     *     
     */
    public void setDmTaskWorkSearchGetNewInstanceResult(DmTaskWorkSearch value) {
        this.dmTaskWorkSearchGetNewInstanceResult = value;
    }

}
