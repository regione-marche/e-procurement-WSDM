
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RagioneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RagioneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanWrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanWriteMittente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstendeVisibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiorniScadenza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrevistaApprovazione" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrevistaPresaInCarico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrevistaRisposta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrevistaVisioneMassiva" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TipoDestinatario" type="{http://paleo.regione.marche.it/services/}TipoDestinatarioTrasmissione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RagioneInfo", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "canWrite",
    "canWriteMittente",
    "codice",
    "descrizione",
    "estendeVisibilita",
    "giorniScadenza",
    "previstaApprovazione",
    "previstaPresaInCarico",
    "previstaRisposta",
    "previstaVisioneMassiva",
    "tipoDestinatario"
})
public class RagioneInfo {

    @XmlElement(name = "CanWrite")
    protected Boolean canWrite;
    @XmlElement(name = "CanWriteMittente")
    protected Boolean canWriteMittente;
    @XmlElement(name = "Codice", nillable = true)
    protected String codice;
    @XmlElement(name = "Descrizione", nillable = true)
    protected String descrizione;
    @XmlElement(name = "EstendeVisibilita")
    protected Boolean estendeVisibilita;
    @XmlElement(name = "GiorniScadenza", nillable = true)
    protected Integer giorniScadenza;
    @XmlElement(name = "PrevistaApprovazione")
    protected Boolean previstaApprovazione;
    @XmlElement(name = "PrevistaPresaInCarico")
    protected Boolean previstaPresaInCarico;
    @XmlElement(name = "PrevistaRisposta")
    protected Boolean previstaRisposta;
    @XmlElement(name = "PrevistaVisioneMassiva")
    protected Boolean previstaVisioneMassiva;
    @XmlElement(name = "TipoDestinatario")
    protected TipoDestinatarioTrasmissione tipoDestinatario;

    /**
     * Gets the value of the canWrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanWrite() {
        return canWrite;
    }

    /**
     * Sets the value of the canWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanWrite(Boolean value) {
        this.canWrite = value;
    }

    /**
     * Gets the value of the canWriteMittente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanWriteMittente() {
        return canWriteMittente;
    }

    /**
     * Sets the value of the canWriteMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanWriteMittente(Boolean value) {
        this.canWriteMittente = value;
    }

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
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
     * Gets the value of the estendeVisibilita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstendeVisibilita() {
        return estendeVisibilita;
    }

    /**
     * Sets the value of the estendeVisibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstendeVisibilita(Boolean value) {
        this.estendeVisibilita = value;
    }

    /**
     * Gets the value of the giorniScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiorniScadenza() {
        return giorniScadenza;
    }

    /**
     * Sets the value of the giorniScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiorniScadenza(Integer value) {
        this.giorniScadenza = value;
    }

    /**
     * Gets the value of the previstaApprovazione property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevistaApprovazione() {
        return previstaApprovazione;
    }

    /**
     * Sets the value of the previstaApprovazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevistaApprovazione(Boolean value) {
        this.previstaApprovazione = value;
    }

    /**
     * Gets the value of the previstaPresaInCarico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevistaPresaInCarico() {
        return previstaPresaInCarico;
    }

    /**
     * Sets the value of the previstaPresaInCarico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevistaPresaInCarico(Boolean value) {
        this.previstaPresaInCarico = value;
    }

    /**
     * Gets the value of the previstaRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevistaRisposta() {
        return previstaRisposta;
    }

    /**
     * Sets the value of the previstaRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevistaRisposta(Boolean value) {
        this.previstaRisposta = value;
    }

    /**
     * Gets the value of the previstaVisioneMassiva property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevistaVisioneMassiva() {
        return previstaVisioneMassiva;
    }

    /**
     * Sets the value of the previstaVisioneMassiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevistaVisioneMassiva(Boolean value) {
        this.previstaVisioneMassiva = value;
    }

    /**
     * Gets the value of the tipoDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDestinatarioTrasmissione }
     *     
     */
    public TipoDestinatarioTrasmissione getTipoDestinatario() {
        return tipoDestinatario;
    }

    /**
     * Sets the value of the tipoDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDestinatarioTrasmissione }
     *     
     */
    public void setTipoDestinatario(TipoDestinatarioTrasmissione value) {
        this.tipoDestinatario = value;
    }

}
