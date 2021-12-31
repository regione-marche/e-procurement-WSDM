
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoProtResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoProtResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoProt" type="{http://protocollo.sispi.it}WsProtRispostaInfoProt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoProtResponse", propOrder = {
    "rispInfoProt"
})
public class InfoProtResponse {

    protected WsProtRispostaInfoProt rispInfoProt;

    /**
     * Gets the value of the rispInfoProt property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoProt }
     *     
     */
    public WsProtRispostaInfoProt getRispInfoProt() {
        return rispInfoProt;
    }

    /**
     * Sets the value of the rispInfoProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoProt }
     *     
     */
    public void setRispInfoProt(WsProtRispostaInfoProt value) {
        this.rispInfoProt = value;
    }

}
