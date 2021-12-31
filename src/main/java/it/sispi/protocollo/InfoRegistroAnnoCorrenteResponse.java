
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoRegistroAnnoCorrenteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoRegistroAnnoCorrenteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoRegistroAnnoCorrente" type="{http://protocollo.sispi.it}WsProtRispostaInfoRegistroAnnoCorrente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoRegistroAnnoCorrenteResponse", propOrder = {
    "rispInfoRegistroAnnoCorrente"
})
public class InfoRegistroAnnoCorrenteResponse {

    protected WsProtRispostaInfoRegistroAnnoCorrente rispInfoRegistroAnnoCorrente;

    /**
     * Gets the value of the rispInfoRegistroAnnoCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoRegistroAnnoCorrente }
     *     
     */
    public WsProtRispostaInfoRegistroAnnoCorrente getRispInfoRegistroAnnoCorrente() {
        return rispInfoRegistroAnnoCorrente;
    }

    /**
     * Sets the value of the rispInfoRegistroAnnoCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoRegistroAnnoCorrente }
     *     
     */
    public void setRispInfoRegistroAnnoCorrente(WsProtRispostaInfoRegistroAnnoCorrente value) {
        this.rispInfoRegistroAnnoCorrente = value;
    }

}
