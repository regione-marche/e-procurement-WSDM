
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoClassificaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoClassificaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoClassifica" type="{http://protocollo.sispi.it}WsProtRispostaInfoClassifica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoClassificaResponse", propOrder = {
    "rispInfoClassifica"
})
public class InfoClassificaResponse {

    protected WsProtRispostaInfoClassifica rispInfoClassifica;

    /**
     * Gets the value of the rispInfoClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoClassifica }
     *     
     */
    public WsProtRispostaInfoClassifica getRispInfoClassifica() {
        return rispInfoClassifica;
    }

    /**
     * Sets the value of the rispInfoClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoClassifica }
     *     
     */
    public void setRispInfoClassifica(WsProtRispostaInfoClassifica value) {
        this.rispInfoClassifica = value;
    }

}
