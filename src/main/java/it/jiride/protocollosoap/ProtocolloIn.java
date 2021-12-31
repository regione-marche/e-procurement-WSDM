
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolloIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolloIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MittenteInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MittentiDestinatari" type="{http://tempuri.org/}ArrayOfMittenteDestinatarioIn" minOccurs="0"/>
 *         &lt;element name="AggiornaAnagrafiche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCaricoA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroAllegati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataEvid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoStandard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://tempuri.org/}ArrayOfAllegatoIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolloIn", propOrder = {
    "data",
    "dataProt",
    "numProt",
    "classifica",
    "tipoDocumento",
    "oggetto",
    "oggettoBilingue",
    "origine",
    "mittenteInterno",
    "mittentiDestinatari",
    "aggiornaAnagrafiche",
    "inCaricoA",
    "annoPratica",
    "numeroPratica",
    "dataDocumento",
    "numeroDocumento",
    "numeroAllegati",
    "dataEvid",
    "oggettoStandard",
    "utente",
    "ruolo",
    "allegati"
})
@XmlRootElement(name="ProtocolloIn")
public class ProtocolloIn {

    @XmlElement(name = "Data", nillable = true)
    protected String data;
    @XmlElement(name = "DataProt", nillable = true)
    protected String dataProt;
    @XmlElement(name = "NumProt", nillable = true)
    protected String numProt;
    @XmlElement(name = "Classifica", nillable = true)
    protected String classifica;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "OggettoBilingue", nillable = true)
    protected String oggettoBilingue;
    @XmlElement(name = "Origine", nillable = true)
    protected String origine;
    @XmlElement(name = "MittenteInterno", nillable = true)
    protected String mittenteInterno;
    @XmlElement(name = "MittentiDestinatari", nillable = true)
    protected ArrayOfMittenteDestinatarioIn mittentiDestinatari;
    @XmlElement(name = "AggiornaAnagrafiche", nillable = true)
    protected String aggiornaAnagrafiche;
    @XmlElement(name = "InCaricoA", nillable = true)
    protected String inCaricoA;
    @XmlElement(name = "AnnoPratica", nillable = true)
    protected String annoPratica;
    @XmlElement(name = "NumeroPratica", nillable = true)
    protected String numeroPratica;
    @XmlElement(name = "DataDocumento", nillable = true)
    protected String dataDocumento;
    @XmlElement(name = "NumeroDocumento", nillable = true)
    protected String numeroDocumento;
    @XmlElement(name = "NumeroAllegati", nillable = true)
    protected String numeroAllegati;
    @XmlElement(name = "DataEvid", nillable = true)
    protected String dataEvid;
    @XmlElement(name = "OggettoStandard", nillable = true)
    protected String oggettoStandard;
    @XmlElement(name = "Utente", nillable = true)
    protected String utente;
    @XmlElement(name = "Ruolo", nillable = true)
    protected String ruolo;
    @XmlElement(name = "Allegati", nillable = true)
    protected ArrayOfAllegatoIn allegati;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the dataProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProt() {
        return dataProt;
    }

    /**
     * Sets the value of the dataProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProt(String value) {
        this.dataProt = value;
    }

    /**
     * Gets the value of the numProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumProt() {
        return numProt;
    }

    /**
     * Sets the value of the numProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumProt(String value) {
        this.numProt = value;
    }

    /**
     * Gets the value of the classifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifica() {
        return classifica;
    }

    /**
     * Sets the value of the classifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifica(String value) {
        this.classifica = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
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
     * Gets the value of the oggettoBilingue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoBilingue() {
        return oggettoBilingue;
    }

    /**
     * Sets the value of the oggettoBilingue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoBilingue(String value) {
        this.oggettoBilingue = value;
    }

    /**
     * Gets the value of the origine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigine() {
        return origine;
    }

    /**
     * Sets the value of the origine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigine(String value) {
        this.origine = value;
    }

    /**
     * Gets the value of the mittenteInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMittenteInterno() {
        return mittenteInterno;
    }

    /**
     * Sets the value of the mittenteInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMittenteInterno(String value) {
        this.mittenteInterno = value;
    }

    /**
     * Gets the value of the mittentiDestinatari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMittenteDestinatarioIn }
     *     
     */
    public ArrayOfMittenteDestinatarioIn getMittentiDestinatari() {
        return mittentiDestinatari;
    }

    /**
     * Sets the value of the mittentiDestinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMittenteDestinatarioIn }
     *     
     */
    public void setMittentiDestinatari(ArrayOfMittenteDestinatarioIn value) {
        this.mittentiDestinatari = value;
    }

    /**
     * Gets the value of the aggiornaAnagrafiche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggiornaAnagrafiche() {
        return aggiornaAnagrafiche;
    }

    /**
     * Sets the value of the aggiornaAnagrafiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggiornaAnagrafiche(String value) {
        this.aggiornaAnagrafiche = value;
    }

    /**
     * Gets the value of the inCaricoA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCaricoA() {
        return inCaricoA;
    }

    /**
     * Sets the value of the inCaricoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCaricoA(String value) {
        this.inCaricoA = value;
    }

    /**
     * Gets the value of the annoPratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoPratica() {
        return annoPratica;
    }

    /**
     * Sets the value of the annoPratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoPratica(String value) {
        this.annoPratica = value;
    }

    /**
     * Gets the value of the numeroPratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPratica() {
        return numeroPratica;
    }

    /**
     * Sets the value of the numeroPratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPratica(String value) {
        this.numeroPratica = value;
    }

    /**
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDocumento(String value) {
        this.dataDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the numeroAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAllegati() {
        return numeroAllegati;
    }

    /**
     * Sets the value of the numeroAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAllegati(String value) {
        this.numeroAllegati = value;
    }

    /**
     * Gets the value of the dataEvid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEvid() {
        return dataEvid;
    }

    /**
     * Sets the value of the dataEvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEvid(String value) {
        this.dataEvid = value;
    }

    /**
     * Gets the value of the oggettoStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoStandard() {
        return oggettoStandard;
    }

    /**
     * Sets the value of the oggettoStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoStandard(String value) {
        this.oggettoStandard = value;
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
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public ArrayOfAllegatoIn getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public void setAllegati(ArrayOfAllegatoIn value) {
        this.allegati = value;
    }

}
