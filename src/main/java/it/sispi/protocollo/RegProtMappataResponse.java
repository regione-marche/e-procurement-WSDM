
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regProtMappataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regProtMappataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispRegProtMappata" type="{http://protocollo.sispi.it}WsProtRisposta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regProtMappataResponse", propOrder = {
    "rispRegProtMappata"
})
public class RegProtMappataResponse {

    protected WsProtRisposta rispRegProtMappata;

    /**
     * Gets the value of the rispRegProtMappata property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRisposta }
     *     
     */
    public WsProtRisposta getRispRegProtMappata() {
        return rispRegProtMappata;
    }

    /**
     * Sets the value of the rispRegProtMappata property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRisposta }
     *     
     */
    public void setRispRegProtMappata(WsProtRisposta value) {
        this.rispRegProtMappata = value;
    }

}
