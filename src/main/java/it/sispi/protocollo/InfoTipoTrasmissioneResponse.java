
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoTipoTrasmissioneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTipoTrasmissioneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispTipoTrasmissione" type="{http://protocollo.sispi.it}WsProtRispostaInfoTipoTrasmissione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTipoTrasmissioneResponse", propOrder = {
    "rispTipoTrasmissione"
})
public class InfoTipoTrasmissioneResponse {

    protected WsProtRispostaInfoTipoTrasmissione rispTipoTrasmissione;

    /**
     * Gets the value of the rispTipoTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoTipoTrasmissione }
     *     
     */
    public WsProtRispostaInfoTipoTrasmissione getRispTipoTrasmissione() {
        return rispTipoTrasmissione;
    }

    /**
     * Sets the value of the rispTipoTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoTipoTrasmissione }
     *     
     */
    public void setRispTipoTrasmissione(WsProtRispostaInfoTipoTrasmissione value) {
        this.rispTipoTrasmissione = value;
    }

}
