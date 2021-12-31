
package it.iride.wsprotocollodm;

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
 *         &lt;element name="CreaCopieResult" type="{http://tempuri.org/}CreaCopieOut" minOccurs="0"/>
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
    "creaCopieResult"
})
@XmlRootElement(name = "CreaCopieResponse")
public class CreaCopieResponse {

    @XmlElement(name = "CreaCopieResult")
    protected CreaCopieOut creaCopieResult;

    /**
     * Gets the value of the creaCopieResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreaCopieOut }
     *     
     */
    public CreaCopieOut getCreaCopieResult() {
        return creaCopieResult;
    }

    /**
     * Sets the value of the creaCopieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreaCopieOut }
     *     
     */
    public void setCreaCopieResult(CreaCopieOut value) {
        this.creaCopieResult = value;
    }

}
