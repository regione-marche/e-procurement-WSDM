
package it.jiride.docwsfascicolisoap;

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
 *         &lt;element name="IDFascicolo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FascicoloIn" type="{http://tempuri.org/}FascicoloIn"/>
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
    "idFascicolo",
    "utente",
    "ruolo",
    "codiceAmministrazione",
    "codiceAOO",
    "fascicoloIn"
})
@XmlRootElement(name = "CreaSottoFascicolo")
public class CreaSottoFascicolo {

    @XmlElement(name = "IDFascicolo")
    protected int idFascicolo;
    @XmlElement(name = "Utente", required = true)
    protected String utente;
    @XmlElement(name = "Ruolo", required = true)
    protected String ruolo;
    @XmlElement(name = "CodiceAmministrazione", required = true)
    protected String codiceAmministrazione;
    @XmlElement(name = "CodiceAOO", required = true)
    protected String codiceAOO;
    @XmlElement(name = "FascicoloIn", required = true)
    protected FascicoloIn fascicoloIn;

    /**
     * Gets the value of the idFascicolo property.
     * 
     */
    public int getIDFascicolo() {
        return idFascicolo;
    }

    /**
     * Sets the value of the idFascicolo property.
     * 
     */
    public void setIDFascicolo(int value) {
        this.idFascicolo = value;
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

    /**
     * Gets the value of the fascicoloIn property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIn }
     *     
     */
    public FascicoloIn getFascicoloIn() {
        return fascicoloIn;
    }

    /**
     * Sets the value of the fascicoloIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIn }
     *     
     */
    public void setFascicoloIn(FascicoloIn value) {
        this.fascicoloIn = value;
    }

}
