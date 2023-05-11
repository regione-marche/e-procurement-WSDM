
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrispondenteOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrispondenteOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdSoggetto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlagAmministrazione" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitaOrganizzativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroRegistrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRegistrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrispondenteOut", propOrder = {
    "idSoggetto",
    "denominazione",
    "flagAmministrazione",
    "codiceAmministrazione",
    "aoo",
    "codiceAOO",
    "unitaOrganizzativa",
    "numeroRegistrazione",
    "dataRegistrazione"
})
public class CorrispondenteOut {

    @XmlElement(name = "IdSoggetto")
    protected int idSoggetto;
    @XmlElement(name = "Denominazione")
    protected String denominazione;
    @XmlElement(name = "FlagAmministrazione")
    protected boolean flagAmministrazione;
    @XmlElement(name = "CodiceAmministrazione")
    protected String codiceAmministrazione;
    @XmlElement(name = "AOO")
    protected String aoo;
    @XmlElement(name = "CodiceAOO")
    protected String codiceAOO;
    @XmlElement(name = "UnitaOrganizzativa")
    protected String unitaOrganizzativa;
    @XmlElement(name = "NumeroRegistrazione")
    protected String numeroRegistrazione;
    @XmlElement(name = "DataRegistrazione")
    protected String dataRegistrazione;

    /**
     * Gets the value of the idSoggetto property.
     * 
     */
    public int getIdSoggetto() {
        return idSoggetto;
    }

    /**
     * Sets the value of the idSoggetto property.
     * 
     */
    public void setIdSoggetto(int value) {
        this.idSoggetto = value;
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
     * Gets the value of the flagAmministrazione property.
     * 
     */
    public boolean isFlagAmministrazione() {
        return flagAmministrazione;
    }

    /**
     * Sets the value of the flagAmministrazione property.
     * 
     */
    public void setFlagAmministrazione(boolean value) {
        this.flagAmministrazione = value;
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
     * Gets the value of the unitaOrganizzativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaOrganizzativa() {
        return unitaOrganizzativa;
    }

    /**
     * Sets the value of the unitaOrganizzativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaOrganizzativa(String value) {
        this.unitaOrganizzativa = value;
    }

    /**
     * Gets the value of the numeroRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistrazione() {
        return numeroRegistrazione;
    }

    /**
     * Sets the value of the numeroRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistrazione(String value) {
        this.numeroRegistrazione = value;
    }

    /**
     * Gets the value of the dataRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistrazione() {
        return dataRegistrazione;
    }

    /**
     * Sets the value of the dataRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistrazione(String value) {
        this.dataRegistrazione = value;
    }

}
