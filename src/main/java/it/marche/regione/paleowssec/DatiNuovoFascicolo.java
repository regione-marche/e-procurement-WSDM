
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiNuovoFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiNuovoFascicolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnniConservazione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodiceClassifica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceFaldone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custode" type="{http://paleo.regione.marche.it/services/}OperatorePaleo"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdSerieArchivistica" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTipoDati" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiNuovoFascicolo", propOrder = {
    "anniConservazione",
    "codiceClassifica",
    "codiceFaldone",
    "custode",
    "descrizione",
    "idSerieArchivistica",
    "idTipoDati",
    "note"
})
public class DatiNuovoFascicolo {

    @XmlElement(name = "AnniConservazione", nillable = true)
    protected Integer anniConservazione;
    @XmlElement(name = "CodiceClassifica", required = true, nillable = true)
    protected String codiceClassifica;
    @XmlElement(name = "CodiceFaldone", nillable = true)
    protected String codiceFaldone;
    @XmlElement(name = "Custode", required = true, nillable = true)
    protected OperatorePaleo custode;
    @XmlElement(name = "Descrizione", required = true, nillable = true)
    protected String descrizione;
    @XmlElement(name = "IdSerieArchivistica", nillable = true)
    protected Integer idSerieArchivistica;
    @XmlElement(name = "IdTipoDati", nillable = true)
    protected Integer idTipoDati;
    @XmlElement(name = "Note", nillable = true)
    protected String note;

    /**
     * Gets the value of the anniConservazione property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnniConservazione() {
        return anniConservazione;
    }

    /**
     * Sets the value of the anniConservazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnniConservazione(Integer value) {
        this.anniConservazione = value;
    }

    /**
     * Gets the value of the codiceClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceClassifica() {
        return codiceClassifica;
    }

    /**
     * Sets the value of the codiceClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceClassifica(String value) {
        this.codiceClassifica = value;
    }

    /**
     * Gets the value of the codiceFaldone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFaldone() {
        return codiceFaldone;
    }

    /**
     * Sets the value of the codiceFaldone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFaldone(String value) {
        this.codiceFaldone = value;
    }

    /**
     * Gets the value of the custode property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getCustode() {
        return custode;
    }

    /**
     * Sets the value of the custode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setCustode(OperatorePaleo value) {
        this.custode = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the idSerieArchivistica property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSerieArchivistica() {
        return idSerieArchivistica;
    }

    /**
     * Sets the value of the idSerieArchivistica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSerieArchivistica(Integer value) {
        this.idSerieArchivistica = value;
    }

    /**
     * Gets the value of the idTipoDati property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoDati() {
        return idTipoDati;
    }

    /**
     * Sets the value of the idTipoDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoDati(Integer value) {
        this.idTipoDati = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
