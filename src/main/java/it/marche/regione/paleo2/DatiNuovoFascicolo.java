
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 *         &lt;element name="CodiceClassifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceFaldone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custode" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="DatiProcedimento" type="{http://paleo.regione.marche.it/services2/}ProcedimentoAmministrativo" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdSerieArchivistica" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTipoDati" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Progressivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Tipologia" type="{http://paleo.regione.marche.it/services2/}TipologiaFascicolo" minOccurs="0"/>
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
    "datiProcedimento",
    "descrizione",
    "idSerieArchivistica",
    "idTipoDati",
    "note",
    "progressivo",
    "tipologia"
})
@XmlSeeAlso({
    ReqCreaFascicolo.class
})
public class DatiNuovoFascicolo {

    @XmlElement(name = "AnniConservazione", nillable = true)
    protected Integer anniConservazione;
    @XmlElement(name = "CodiceClassifica", nillable = true)
    protected String codiceClassifica;
    @XmlElement(name = "CodiceFaldone", nillable = true)
    protected String codiceFaldone;
    @XmlElement(name = "Custode", nillable = true)
    protected OperatorePaleo custode;
    @XmlElement(name = "DatiProcedimento", nillable = true)
    protected ProcedimentoAmministrativo datiProcedimento;
    @XmlElement(name = "Descrizione", nillable = true)
    protected String descrizione;
    @XmlElement(name = "IdSerieArchivistica", nillable = true)
    protected Integer idSerieArchivistica;
    @XmlElement(name = "IdTipoDati", nillable = true)
    protected Integer idTipoDati;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "Progressivo", nillable = true)
    protected Integer progressivo;
    @XmlElement(name = "Tipologia", nillable = true)
    protected TipologiaFascicolo tipologia;

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
     * Gets the value of the datiProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedimentoAmministrativo }
     *     
     */
    public ProcedimentoAmministrativo getDatiProcedimento() {
        return datiProcedimento;
    }

    /**
     * Sets the value of the datiProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedimentoAmministrativo }
     *     
     */
    public void setDatiProcedimento(ProcedimentoAmministrativo value) {
        this.datiProcedimento = value;
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

    /**
     * Gets the value of the progressivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressivo() {
        return progressivo;
    }

    /**
     * Sets the value of the progressivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressivo(Integer value) {
        this.progressivo = value;
    }

    /**
     * Gets the value of the tipologia property.
     * 
     * @return
     *     possible object is
     *     {@link TipologiaFascicolo }
     *     
     */
    public TipologiaFascicolo getTipologia() {
        return tipologia;
    }

    /**
     * Sets the value of the tipologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipologiaFascicolo }
     *     
     */
    public void setTipologia(TipologiaFascicolo value) {
        this.tipologia = value;
    }

}
