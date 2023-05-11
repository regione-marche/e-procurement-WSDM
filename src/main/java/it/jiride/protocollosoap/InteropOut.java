
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteropOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteropOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizzoTelematico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localizzazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Riservato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteropOut", propOrder = {
    "codiceAmministrazione",
    "denominazione",
    "codiceAOO",
    "aoo",
    "indirizzo",
    "indirizzoTelematico",
    "localizzazione",
    "riservato"
})
public class InteropOut {

    @XmlElement(name = "CodiceAmministrazione", nillable = true)
    protected String codiceAmministrazione;
    @XmlElement(name = "Denominazione", nillable = true)
    protected String denominazione;
    @XmlElement(name = "CodiceAOO", nillable = true)
    protected String codiceAOO;
    @XmlElement(name = "AOO")
    protected String aoo;
    @XmlElement(name = "Indirizzo", nillable = true)
    protected String indirizzo;
    @XmlElement(name = "IndirizzoTelematico", nillable = true)
    protected String indirizzoTelematico;
    @XmlElement(name = "Localizzazione", nillable = true)
    protected String localizzazione;
    @XmlElement(name = "Riservato", nillable = true)
    protected String riservato;

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
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
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
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOO(String value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the indirizzoTelematico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoTelematico() {
        return indirizzoTelematico;
    }

    /**
     * Sets the value of the indirizzoTelematico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoTelematico(String value) {
        this.indirizzoTelematico = value;
    }

    /**
     * Gets the value of the localizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizzazione() {
        return localizzazione;
    }

    /**
     * Sets the value of the localizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizzazione(String value) {
        this.localizzazione = value;
    }

    /**
     * Gets the value of the riservato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiservato() {
        return riservato;
    }

    /**
     * Sets the value of the riservato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiservato(String value) {
        this.riservato = value;
    }

}
