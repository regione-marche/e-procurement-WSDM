
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amministrazione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Amministrazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizzoTelematico" type="{}IndirizzoTelematico" minOccurs="0"/>
 *         &lt;element name="UnitaOrganizzativa" type="{}UnitaOrganizzativa" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Persona" type="{}Persona" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="IndirizzoPostaleItem" type="{}IndirizzoPostaleType" minOccurs="0"/>
 *           &lt;element name="IndirizzoPostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amministrazione", namespace = "", propOrder = {
    "denominazione",
    "codiceAmministrazione",
    "indirizzoTelematico",
    "unitaOrganizzativa",
    "fax",
    "telefono",
    "persona",
    "ruolo",
    "indirizzoPostaleItem",
    "indirizzoPostale"
})
public class Amministrazione {

    @XmlElement(name = "Denominazione")
    protected String denominazione;
    @XmlElement(name = "CodiceAmministrazione")
    protected String codiceAmministrazione;
    @XmlElement(name = "IndirizzoTelematico")
    protected IndirizzoTelematico indirizzoTelematico;
    @XmlElement(name = "UnitaOrganizzativa")
    protected UnitaOrganizzativa unitaOrganizzativa;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "Persona")
    protected Persona persona;
    @XmlElement(name = "Ruolo")
    protected String ruolo;
    @XmlElement(name = "IndirizzoPostaleItem")
    protected IndirizzoPostaleType indirizzoPostaleItem;
    @XmlElement(name = "IndirizzoPostale")
    protected String indirizzoPostale;

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
     * Gets the value of the indirizzoTelematico property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoTelematico }
     *     
     */
    public IndirizzoTelematico getIndirizzoTelematico() {
        return indirizzoTelematico;
    }

    /**
     * Sets the value of the indirizzoTelematico property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoTelematico }
     *     
     */
    public void setIndirizzoTelematico(IndirizzoTelematico value) {
        this.indirizzoTelematico = value;
    }

    /**
     * Gets the value of the unitaOrganizzativa property.
     * 
     * @return
     *     possible object is
     *     {@link UnitaOrganizzativa }
     *     
     */
    public UnitaOrganizzativa getUnitaOrganizzativa() {
        return unitaOrganizzativa;
    }

    /**
     * Sets the value of the unitaOrganizzativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitaOrganizzativa }
     *     
     */
    public void setUnitaOrganizzativa(UnitaOrganizzativa value) {
        this.unitaOrganizzativa = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
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
     * Gets the value of the indirizzoPostaleItem property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoPostaleType }
     *     
     */
    public IndirizzoPostaleType getIndirizzoPostaleItem() {
        return indirizzoPostaleItem;
    }

    /**
     * Sets the value of the indirizzoPostaleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoPostaleType }
     *     
     */
    public void setIndirizzoPostaleItem(IndirizzoPostaleType value) {
        this.indirizzoPostaleItem = value;
    }

    /**
     * Gets the value of the indirizzoPostale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoPostale() {
        return indirizzoPostale;
    }

    /**
     * Sets the value of the indirizzoPostale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoPostale(String value) {
        this.indirizzoPostale = value;
    }

}
