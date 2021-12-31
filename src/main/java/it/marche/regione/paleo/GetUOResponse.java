
package it.marche.regione.paleo;

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
 *         &lt;element name="GetUOResult" type="{http://paleo.regione.marche.it/services/}BEListOfUOInfoZA0hwLp5" minOccurs="0"/>
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
    "getUOResult"
})
@XmlRootElement(name = "GetUOResponse")
public class GetUOResponse {

    @XmlElement(name = "GetUOResult", nillable = true)
    protected BEListOfUOInfoZA0HwLp5 getUOResult;

    /**
     * Gets the value of the getUOResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfUOInfoZA0HwLp5 }
     *     
     */
    public BEListOfUOInfoZA0HwLp5 getGetUOResult() {
        return getUOResult;
    }

    /**
     * Sets the value of the getUOResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfUOInfoZA0HwLp5 }
     *     
     */
    public void setGetUOResult(BEListOfUOInfoZA0HwLp5 value) {
        this.getUOResult = value;
    }

}
