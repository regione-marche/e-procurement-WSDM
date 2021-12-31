
package it.jiride.protocollosoap;

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
 *         &lt;element name="Appartenenza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Identificativo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DatiUtente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "appartenenza",
    "identificativo",
    "datiUtente",
    "utente",
    "ruolo",
    "codiceAmministrazione",
    "codiceAOO"
})
@XmlRootElement(name = "InserisciDatiUtente")
public class InserisciDatiUtente {

    @XmlElement(name = "Appartenenza", required = true)
    protected String appartenenza;
    @XmlElement(name = "Identificativo")
    protected int identificativo;
    @XmlElement(name = "DatiUtente", required = true)
    protected String datiUtente;
    @XmlElement(name = "Utente", required = true)
    protected String utente;
    @XmlElement(name = "Ruolo", required = true)
    protected String ruolo;
    @XmlElement(name = "CodiceAmministrazione", required = true)
    protected String codiceAmministrazione;
    @XmlElement(name = "CodiceAOO", required = true)
    protected String codiceAOO;

    /**
     * Gets the value of the appartenenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppartenenza() {
        return appartenenza;
    }

    /**
     * Sets the value of the appartenenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppartenenza(String value) {
        this.appartenenza = value;
    }

    /**
     * Gets the value of the identificativo property.
     * 
     */
    public int getIdentificativo() {
        return identificativo;
    }

    /**
     * Sets the value of the identificativo property.
     * 
     */
    public void setIdentificativo(int value) {
        this.identificativo = value;
    }

    /**
     * Gets the value of the datiUtente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatiUtente() {
        return datiUtente;
    }

    /**
     * Sets the value of the datiUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatiUtente(String value) {
        this.datiUtente = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Gets the value of the ruolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Sets the value of the ruolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

    /**
     * Gets the value of the codiceAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAmministrazione() {
        return codiceAmministrazione;
    }

    /**
     * Sets the value of the codiceAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAmministrazione(String value) {
        this.codiceAmministrazione = value;
    }

    /**
     * Gets the value of the codiceAOO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAOO() {
        return codiceAOO;
    }

    /**
     * Sets the value of the codiceAOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAOO(String value) {
        this.codiceAOO = value;
    }

}
