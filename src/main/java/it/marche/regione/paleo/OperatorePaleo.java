
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorePaleo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorePaleo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceRuolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceUO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceUOSicurezza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorePaleo", propOrder = {
    "codiceFiscale",
    "codiceRuolo",
    "codiceUO",
    "codiceUOSicurezza",
    "cognome",
    "nome",
    "ruolo",
    "uo"
})
public class OperatorePaleo {

    @XmlElement(name = "CodiceFiscale", nillable = true)
    protected String codiceFiscale;
    @XmlElement(name = "CodiceRuolo", nillable = true)
    protected String codiceRuolo;
    @XmlElement(name = "CodiceUO", required = true, nillable = true)
    protected String codiceUO;
    @XmlElement(name = "CodiceUOSicurezza", nillable = true)
    protected String codiceUOSicurezza;
    @XmlElement(name = "Cognome", required = true, nillable = true)
    protected String cognome;
    @XmlElement(name = "Nome", nillable = true)
    protected String nome;
    @XmlElement(name = "Ruolo", required = true, nillable = true)
    protected String ruolo;
    @XmlElement(name = "UO", nillable = true)
    protected String uo;

    /**
     * Gets the value of the codiceFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Sets the value of the codiceFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Gets the value of the codiceRuolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRuolo() {
        return codiceRuolo;
    }

    /**
     * Sets the value of the codiceRuolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRuolo(String value) {
        this.codiceRuolo = value;
    }

    /**
     * Gets the value of the codiceUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUO() {
        return codiceUO;
    }

    /**
     * Sets the value of the codiceUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUO(String value) {
        this.codiceUO = value;
    }

    /**
     * Gets the value of the codiceUOSicurezza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUOSicurezza() {
        return codiceUOSicurezza;
    }

    /**
     * Sets the value of the codiceUOSicurezza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUOSicurezza(String value) {
        this.codiceUOSicurezza = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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
     * Gets the value of the uo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUO() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUO(String value) {
        this.uo = value;
    }

}
