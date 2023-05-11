
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTipoAllegatoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTipoAllegatoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoTipoAllegato" type="{http://protocollo.sispi.it}WsProtRispostaInfoTipoAllegato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTipoAllegatoResponse", propOrder = {
    "rispInfoTipoAllegato"
})
public class InfoTipoAllegatoResponse {

    protected WsProtRispostaInfoTipoAllegato rispInfoTipoAllegato;

    /**
     * Gets the value of the rispInfoTipoAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoTipoAllegato }
     *     
     */
    public WsProtRispostaInfoTipoAllegato getRispInfoTipoAllegato() {
        return rispInfoTipoAllegato;
    }

    /**
     * Sets the value of the rispInfoTipoAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoTipoAllegato }
     *     
     */
    public void setRispInfoTipoAllegato(WsProtRispostaInfoTipoAllegato value) {
        this.rispInfoTipoAllegato = value;
    }

}
