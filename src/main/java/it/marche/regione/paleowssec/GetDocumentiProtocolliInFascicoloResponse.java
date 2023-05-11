
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
 *         &lt;element name="GetDocumentiProtocolliInFascicoloResult" type="{http://paleo.regione.marche.it/services/}BEListOfrespDocProtocolliInfoZA0hwLp5" minOccurs="0"/>
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
    "getDocumentiProtocolliInFascicoloResult"
})
@XmlRootElement(name = "GetDocumentiProtocolliInFascicoloResponse")
public class GetDocumentiProtocolliInFascicoloResponse {

    @XmlElement(name = "GetDocumentiProtocolliInFascicoloResult", nillable = true)
    protected BEListOfrespDocProtocolliInfoZA0HwLp5 getDocumentiProtocolliInFascicoloResult;

    /**
     * Gets the value of the getDocumentiProtocolliInFascicoloResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEListOfrespDocProtocolliInfoZA0HwLp5 }
     *     
     */
    public BEListOfrespDocProtocolliInfoZA0HwLp5 getGetDocumentiProtocolliInFascicoloResult() {
        return getDocumentiProtocolliInFascicoloResult;
    }

    /**
     * Sets the value of the getDocumentiProtocolliInFascicoloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEListOfrespDocProtocolliInfoZA0HwLp5 }
     *     
     */
    public void setGetDocumentiProtocolliInFascicoloResult(BEListOfrespDocProtocolliInfoZA0HwLp5 value) {
        this.getDocumentiProtocolliInFascicoloResult = value;
    }

}
