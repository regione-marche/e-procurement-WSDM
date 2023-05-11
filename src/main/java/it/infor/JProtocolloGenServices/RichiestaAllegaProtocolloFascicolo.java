
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riferimentoProtocollo" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}protocolloRiferimentoType"/>
 *         &lt;element name="riferimentoFascicolo" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}fascicoloRiferimentoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "riferimentoProtocollo",
    "riferimentoFascicolo"
})
@XmlRootElement(name = "richiestaAllegaProtocolloFascicolo")
public class RichiestaAllegaProtocolloFascicolo {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected ProtocolloRiferimentoType riferimentoProtocollo;
    @XmlElement(required = true)
    protected FascicoloRiferimentoType riferimentoFascicolo;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the riferimentoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloRiferimentoType }
     *     
     */
    public ProtocolloRiferimentoType getRiferimentoProtocollo() {
        return riferimentoProtocollo;
    }

    /**
     * Sets the value of the riferimentoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloRiferimentoType }
     *     
     */
    public void setRiferimentoProtocollo(ProtocolloRiferimentoType value) {
        this.riferimentoProtocollo = value;
    }

    /**
     * Gets the value of the riferimentoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloRiferimentoType }
     *     
     */
    public FascicoloRiferimentoType getRiferimentoFascicolo() {
        return riferimentoFascicolo;
    }

    /**
     * Sets the value of the riferimentoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloRiferimentoType }
     *     
     */
    public void setRiferimentoFascicolo(FascicoloRiferimentoType value) {
        this.riferimentoFascicolo = value;
    }

}
