
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MittenteDestinatarioIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MittenteDestinatarioIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CognomeNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceComuneResidenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceComuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nazionalita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInvio_DataProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spese_NProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mezzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRicevimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoSogg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recapiti" type="{http://tempuri.org/}ArrayOfRecapitoIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MittenteDestinatarioIn", propOrder = {
    "codiceFiscale",
    "cognomeNome",
    "nome",
    "indirizzo",
    "localita",
    "codiceComuneResidenza",
    "dataNascita",
    "codiceComuneNascita",
    "nazionalita",
    "dataInvioDataProt",
    "speseNProt",
    "mezzo",
    "dataRicevimento",
    "tipoSogg",
    "tipoPersona",
    "recapiti"
})
public class MittenteDestinatarioIn {

    @XmlElement(name = "CodiceFiscale", nillable = true)
    protected String codiceFiscale;
    @XmlElement(name = "CognomeNome", nillable = true)
    protected String cognomeNome;
    @XmlElement(name = "Nome", nillable = true)
    protected String nome;
    @XmlElement(name = "Indirizzo", nillable = true)
    protected String indirizzo;
    @XmlElement(name = "Localita", nillable = true)
    protected String localita;
    @XmlElement(name = "CodiceComuneResidenza", nillable = true)
    protected String codiceComuneResidenza;
    @XmlElement(name = "DataNascita", nillable = true)
    protected String dataNascita;
    @XmlElement(name = "CodiceComuneNascita", nillable = true)
    protected String codiceComuneNascita;
    @XmlElement(name = "Nazionalita", nillable = true)
    protected String nazionalita;
    @XmlElement(name = "DataInvio_DataProt", nillable = true)
    protected String dataInvioDataProt;
    @XmlElement(name = "Spese_NProt", nillable = true)
    protected String speseNProt;
    @XmlElement(name = "Mezzo", nillable = true)
    protected String mezzo;
    @XmlElement(name = "DataRicevimento", nillable = true)
    protected String dataRicevimento;
    @XmlElement(name = "TipoSogg", nillable = true)
    protected String tipoSogg;
    @XmlElement(name = "TipoPersona", nillable = true)
    protected String tipoPersona;
    @XmlElement(name = "Recapiti", nillable = true)
    protected ArrayOfRecapitoIn recapiti;

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
     * Gets the value of the cognomeNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognomeNome() {
        return cognomeNome;
    }

    /**
     * Sets the value of the cognomeNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognomeNome(String value) {
        this.cognomeNome = value;
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
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalita() {
        return localita;
    }

    /**
     * Sets the value of the localita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalita(String value) {
        this.localita = value;
    }

    /**
     * Gets the value of the codiceComuneResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceComuneResidenza() {
        return codiceComuneResidenza;
    }

    /**
     * Sets the value of the codiceComuneResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceComuneResidenza(String value) {
        this.codiceComuneResidenza = value;
    }

    /**
     * Gets the value of the dataNascita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     * Sets the value of the dataNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascita(String value) {
        this.dataNascita = value;
    }

    /**
     * Gets the value of the codiceComuneNascita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceComuneNascita() {
        return codiceComuneNascita;
    }

    /**
     * Sets the value of the codiceComuneNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceComuneNascita(String value) {
        this.codiceComuneNascita = value;
    }

    /**
     * Gets the value of the nazionalita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazionalita() {
        return nazionalita;
    }

    /**
     * Sets the value of the nazionalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazionalita(String value) {
        this.nazionalita = value;
    }

    /**
     * Gets the value of the dataInvioDataProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInvioDataProt() {
        return dataInvioDataProt;
    }

    /**
     * Sets the value of the dataInvioDataProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvioDataProt(String value) {
        this.dataInvioDataProt = value;
    }

    /**
     * Gets the value of the speseNProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeseNProt() {
        return speseNProt;
    }

    /**
     * Sets the value of the speseNProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeseNProt(String value) {
        this.speseNProt = value;
    }

    /**
     * Gets the value of the mezzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezzo() {
        return mezzo;
    }

    /**
     * Sets the value of the mezzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezzo(String value) {
        this.mezzo = value;
    }

    /**
     * Gets the value of the dataRicevimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRicevimento() {
        return dataRicevimento;
    }

    /**
     * Sets the value of the dataRicevimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRicevimento(String value) {
        this.dataRicevimento = value;
    }

    /**
     * Gets the value of the tipoSogg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSogg() {
        return tipoSogg;
    }

    /**
     * Sets the value of the tipoSogg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSogg(String value) {
        this.tipoSogg = value;
    }

    /**
     * Gets the value of the tipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Gets the value of the recapiti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecapitoIn }
     *     
     */
    public ArrayOfRecapitoIn getRecapiti() {
        return recapiti;
    }

    /**
     * Sets the value of the recapiti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecapitoIn }
     *     
     */
    public void setRecapiti(ArrayOfRecapitoIn value) {
        this.recapiti = value;
    }

}
