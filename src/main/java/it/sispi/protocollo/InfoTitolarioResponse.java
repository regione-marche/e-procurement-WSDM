
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTitolarioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTitolarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoTitolario" type="{http://protocollo.sispi.it}WsProtRispostaInfoTitolario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTitolarioResponse", propOrder = {
    "rispInfoTitolario"
})
public class InfoTitolarioResponse {

    protected WsProtRispostaInfoTitolario rispInfoTitolario;

    /**
     * Gets the value of the rispInfoTitolario property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoTitolario }
     *     
     */
    public WsProtRispostaInfoTitolario getRispInfoTitolario() {
        return rispInfoTitolario;
    }

    /**
     * Sets the value of the rispInfoTitolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoTitolario }
     *     
     */
    public void setRispInfoTitolario(WsProtRispostaInfoTitolario value) {
        this.rispInfoTitolario = value;
    }

}
