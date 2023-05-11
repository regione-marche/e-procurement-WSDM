
package it.marche.regione.paleowssec;

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
 *         &lt;element name="GetRegistriResult" type="{http://paleo.regione.marche.it/services/}BEListOfRegistroInfoZA0hwLp5" minOccurs="0"/>
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
    "getRegistriResult"
})
@XmlRootElement(name = "GetRegistriResponse")
public class GetRegistriResponse {

    @XmlElement(name = "GetRegistriResult", nillable = true)
    protected BEListOfRegistroInfoZA0HwLp5 getRegistriResult;

    /**
     * Gets the value of the getRegistriResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfRegistroInfoZA0HwLp5 }
     *     
     */
    public BEListOfRegistroInfoZA0HwLp5 getGetRegistriResult() {
        return getRegistriResult;
    }

    /**
     * Sets the value of the getRegistriResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfRegistroInfoZA0HwLp5 }
     *     
     */
    public void setGetRegistriResult(BEListOfRegistroInfoZA0HwLp5 value) {
        this.getRegistriResult = value;
    }

}
