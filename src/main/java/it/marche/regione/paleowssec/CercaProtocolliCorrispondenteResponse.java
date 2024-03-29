
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
 *         &lt;element name="CercaProtocolliCorrispondenteResult" type="{http://paleo.regione.marche.it/services/}BEListOfrespProtocolloInfoZA0hwLp5" minOccurs="0"/>
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
    "cercaProtocolliCorrispondenteResult"
})
@XmlRootElement(name = "CercaProtocolliCorrispondenteResponse")
public class CercaProtocolliCorrispondenteResponse {

    @XmlElement(name = "CercaProtocolliCorrispondenteResult", nillable = true)
    protected BEListOfrespProtocolloInfoZA0HwLp5 cercaProtocolliCorrispondenteResult;

    /**
     * Gets the value of the cercaProtocolliCorrispondenteResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfrespProtocolloInfoZA0HwLp5 }
     *     
     */
    public BEListOfrespProtocolloInfoZA0HwLp5 getCercaProtocolliCorrispondenteResult() {
        return cercaProtocolliCorrispondenteResult;
    }

    /**
     * Sets the value of the cercaProtocolliCorrispondenteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfrespProtocolloInfoZA0HwLp5 }
     *     
     */
    public void setCercaProtocolliCorrispondenteResult(BEListOfrespProtocolloInfoZA0HwLp5 value) {
        this.cercaProtocolliCorrispondenteResult = value;
    }

}
