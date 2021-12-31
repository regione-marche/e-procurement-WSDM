
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqDocProtocolliInFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqDocProtocolliInFascicolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceFascicolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services/}OperatorePaleo"/>
 *         &lt;element name="SoloPubblici" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoloVerificaFascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqDocProtocolliInFascicolo", propOrder = {
    "codiceFascicolo",
    "operatore",
    "soloPubblici",
    "soloVerificaFascicolo"
})
public class ReqDocProtocolliInFascicolo {

    @XmlElement(name = "CodiceFascicolo", required = true, nillable = true)
    protected String codiceFascicolo;
    @XmlElement(name = "Operatore", required = true, nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(name = "SoloPubblici")
    protected Boolean soloPubblici;
    @XmlElement(name = "SoloVerificaFascicolo")
    protected Boolean soloVerificaFascicolo;

    /**
     * Gets the value of the codiceFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFascicolo() {
        return codiceFascicolo;
    }

    /**
     * Sets the value of the codiceFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFascicolo(String value) {
        this.codiceFascicolo = value;
    }

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOperatore(OperatorePaleo value) {
        this.operatore = value;
    }

    /**
     * Gets the value of the soloPubblici property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoloPubblici() {
        return soloPubblici;
    }

    /**
     * Sets the value of the soloPubblici property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoloPubblici(Boolean value) {
        this.soloPubblici = value;
    }

    /**
     * Gets the value of the soloVerificaFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoloVerificaFascicolo() {
        return soloVerificaFascicolo;
    }

    /**
     * Sets the value of the soloVerificaFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoloVerificaFascicolo(Boolean value) {
        this.soloVerificaFascicolo = value;
    }

}
