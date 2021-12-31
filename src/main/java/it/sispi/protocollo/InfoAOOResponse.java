
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoAOOResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoAOOResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispInfoAOO" type="{http://protocollo.sispi.it}WsProtRispostaInfoAOO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoAOOResponse", propOrder = {
    "rispInfoAOO"
})
public class InfoAOOResponse {

    protected WsProtRispostaInfoAOO rispInfoAOO;

    /**
     * Gets the value of the rispInfoAOO property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaInfoAOO }
     *     
     */
    public WsProtRispostaInfoAOO getRispInfoAOO() {
        return rispInfoAOO;
    }

    /**
     * Sets the value of the rispInfoAOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaInfoAOO }
     *     
     */
    public void setRispInfoAOO(WsProtRispostaInfoAOO value) {
        this.rispInfoAOO = value;
    }

}
