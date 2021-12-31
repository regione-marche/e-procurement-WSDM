
package it.infor.JProtocolloServices;

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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}riferimento"/>
 *         &lt;element name="allegati" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "riferimento",
    "allegati"
})
@XmlRootElement(name = "richiestaLeggiProtocollo")
public class RichiestaLeggiProtocollo {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected Riferimento riferimento;
    protected boolean allegati;

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
     * Gets the value of the riferimento property.
     * 
     * @return
     *     possible object is
     *     {@link Riferimento }
     *     
     */
    public Riferimento getRiferimento() {
        return riferimento;
    }

    /**
     * Sets the value of the riferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Riferimento }
     *     
     */
    public void setRiferimento(Riferimento value) {
        this.riferimento = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     */
    public boolean isAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     */
    public void setAllegati(boolean value) {
        this.allegati = value;
    }

}
