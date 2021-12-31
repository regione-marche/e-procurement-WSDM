
package com.jprotocol.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elencoDocumenti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elencoDocumenti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTitolario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corrispondente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrTitolario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizioneDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estensioneDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagPubblico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UORCompetente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UORCompetenteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versoProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlDownloadAllegati" type="{http://WebServices.jprotocol.com/}urlDownloadAllegato" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="urlDownloadDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoDocumenti", propOrder = {
    "annoFascicolo",
    "annoProtocollo",
    "codTitolario",
    "corrispondente",
    "dataProtocollo",
    "descrTitolario",
    "descrizioneDocumento",
    "estensioneDocumento",
    "flagPubblico",
    "nomeFile",
    "numeroFascicolo",
    "numeroProtocollo",
    "oggetto",
    "uorCompetente",
    "uorCompetenteDesc",
    "versoProtocollo",
    "urlDownloadAllegati",
    "urlDownloadDocumento"
})
public class ElencoDocumenti {

    protected String annoFascicolo;
    protected String annoProtocollo;
    protected String codTitolario;
    protected String corrispondente;
    protected String dataProtocollo;
    protected String descrTitolario;
    protected String descrizioneDocumento;
    protected String estensioneDocumento;
    protected String flagPubblico;
    protected String nomeFile;
    protected String numeroFascicolo;
    protected String numeroProtocollo;
    protected String oggetto;
    @XmlElement(name = "UORCompetente")
    protected String uorCompetente;
    @XmlElement(name = "UORCompetenteDesc")
    protected String uorCompetenteDesc;
    protected String versoProtocollo;
    @XmlElement(nillable = true)
    protected List<UrlDownloadAllegato> urlDownloadAllegati;
    protected String urlDownloadDocumento;

    /**
     * Gets the value of the annoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoFascicolo() {
        return annoFascicolo;
    }

    /**
     * Sets the value of the annoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoFascicolo(String value) {
        this.annoFascicolo = value;
    }

    /**
     * Gets the value of the annoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoProtocollo() {
        return annoProtocollo;
    }

    /**
     * Sets the value of the annoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoProtocollo(String value) {
        this.annoProtocollo = value;
    }

    /**
     * Gets the value of the codTitolario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTitolario() {
        return codTitolario;
    }

    /**
     * Sets the value of the codTitolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTitolario(String value) {
        this.codTitolario = value;
    }

    /**
     * Gets the value of the corrispondente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrispondente() {
        return corrispondente;
    }

    /**
     * Sets the value of the corrispondente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrispondente(String value) {
        this.corrispondente = value;
    }

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProtocollo(String value) {
        this.dataProtocollo = value;
    }

    /**
     * Gets the value of the descrTitolario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrTitolario() {
        return descrTitolario;
    }

    /**
     * Sets the value of the descrTitolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrTitolario(String value) {
        this.descrTitolario = value;
    }

    /**
     * Gets the value of the descrizioneDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneDocumento() {
        return descrizioneDocumento;
    }

    /**
     * Sets the value of the descrizioneDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneDocumento(String value) {
        this.descrizioneDocumento = value;
    }

    /**
     * Gets the value of the estensioneDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstensioneDocumento() {
        return estensioneDocumento;
    }

    /**
     * Sets the value of the estensioneDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstensioneDocumento(String value) {
        this.estensioneDocumento = value;
    }

    /**
     * Gets the value of the flagPubblico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagPubblico() {
        return flagPubblico;
    }

    /**
     * Sets the value of the flagPubblico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagPubblico(String value) {
        this.flagPubblico = value;
    }

    /**
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

    /**
     * Gets the value of the numeroFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFascicolo() {
        return numeroFascicolo;
    }

    /**
     * Sets the value of the numeroFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFascicolo(String value) {
        this.numeroFascicolo = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocollo(String value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the uorCompetente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUORCompetente() {
        return uorCompetente;
    }

    /**
     * Sets the value of the uorCompetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUORCompetente(String value) {
        this.uorCompetente = value;
    }

    /**
     * Gets the value of the uorCompetenteDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUORCompetenteDesc() {
        return uorCompetenteDesc;
    }

    /**
     * Sets the value of the uorCompetenteDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUORCompetenteDesc(String value) {
        this.uorCompetenteDesc = value;
    }

    /**
     * Gets the value of the versoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersoProtocollo() {
        return versoProtocollo;
    }

    /**
     * Sets the value of the versoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersoProtocollo(String value) {
        this.versoProtocollo = value;
    }

    /**
     * Gets the value of the urlDownloadAllegati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlDownloadAllegati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlDownloadAllegati().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlDownloadAllegato }
     * 
     * 
     */
    public List<UrlDownloadAllegato> getUrlDownloadAllegati() {
        if (urlDownloadAllegati == null) {
            urlDownloadAllegati = new ArrayList<UrlDownloadAllegato>();
        }
        return this.urlDownloadAllegati;
    }

    /**
     * Gets the value of the urlDownloadDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDownloadDocumento() {
        return urlDownloadDocumento;
    }

    /**
     * Sets the value of the urlDownloadDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDownloadDocumento(String value) {
        this.urlDownloadDocumento = value;
    }

}
