
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
 *         &lt;element name="Dm_TaskWork_Select_GetNewInstanceResult" type="{http://www.Abletech.it/Arxivar}Dm_TaskWork_Select" minOccurs="0"/>
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
    "dmTaskWorkSelectGetNewInstanceResult"
})
@XmlRootElement(name = "Dm_TaskWork_Select_GetNewInstanceResponse")
public class DmTaskWorkSelectGetNewInstanceResponse {

    @XmlElement(name = "Dm_TaskWork_Select_GetNewInstanceResult")
    protected DmTaskWorkSelect dmTaskWorkSelectGetNewInstanceResult;

    /**
     * Gets the value of the dmTaskWorkSelectGetNewInstanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmTaskWorkSelect }
     *     
     */
    public DmTaskWorkSelect getDmTaskWorkSelectGetNewInstanceResult() {
        return dmTaskWorkSelectGetNewInstanceResult;
    }

    /**
     * Sets the value of the dmTaskWorkSelectGetNewInstanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTaskWorkSelect }
     *     
     */
    public void setDmTaskWorkSelectGetNewInstanceResult(DmTaskWorkSelect value) {
        this.dmTaskWorkSelectGetNewInstanceResult = value;
    }

}
