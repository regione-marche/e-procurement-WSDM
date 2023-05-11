
package it.sispi.protocollo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regProtMassivaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regProtMassivaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispRichiestaMassiva" type="{http://protocollo.sispi.it}wsProtRispostaRegProtMassiva" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regProtMassivaResponse", propOrder = {
    "rispRichiestaMassiva"
})
public class RegProtMassivaResponse {

    protected WsProtRispostaRegProtMassiva rispRichiestaMassiva;

    /**
     * Gets the value of the rispRichiestaMassiva property.
     * 
     * @return
     *     possible object is
     *     {@link WsProtRispostaRegProtMassiva }
     *     
     */
    public WsProtRispostaRegProtMassiva getRispRichiestaMassiva() {
        return rispRichiestaMassiva;
    }

    /**
     * Sets the value of the rispRichiestaMassiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProtRispostaRegProtMassiva }
     *     
     */
    public void setRispRichiestaMassiva(WsProtRispostaRegProtMassiva value) {
        this.rispRichiestaMassiva = value;
    }

}
