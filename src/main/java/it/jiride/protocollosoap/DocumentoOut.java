
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnnoProtocollo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataProtocollo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MittenteInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MittenteInterno_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MittentiDestinatari" type="{http://tempuri.org/}ArrayOfMittenteDestinatarioOut" minOccurs="0"/>
 *         &lt;element name="DataDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCaricoA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCaricoA_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoNumeroData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoPratica" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoNumeroPratica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LivelloDiSicurezza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataEvidenza" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocAllegati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentoRiservato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IterAttivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataDiCarico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UtenteDiInserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataInserimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://tempuri.org/}ArrayOfAllegatoOut" minOccurs="0"/>
 *         &lt;element name="Impegni" type="{http://tempuri.org/}ArrayOfImpegnoOut" minOccurs="0"/>
 *         &lt;element name="Accertamenti" type="{http://tempuri.org/}ArrayOfAccertamentoOut" minOccurs="0"/>
 *         &lt;element name="CentriDiCosto" type="{http://tempuri.org/}ArrayOfCentriDiCostoOut" minOccurs="0"/>
 *         &lt;element name="Registri" type="{http://tempuri.org/}ArrayOfRegistroAssegnatoOut" minOccurs="0"/>
 *         &lt;element name="Interop" type="{http://tempuri.org/}InteropOut" minOccurs="0"/>
 *         &lt;element name="RispostaAlProtocollo" type="{http://tempuri.org/}RispostaAlProtocolloOut" minOccurs="0"/>
 *         &lt;element name="ProtocolliGenerati" type="{http://tempuri.org/}ArrayOfProtocolloGeneratoOut" minOccurs="0"/>
 *         &lt;element name="Corrispondenti" type="{http://tempuri.org/}ArrayOfCorrispondenteOut" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdPratica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataInizioPubblicazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataFinePubblicazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DatiUtente" type="{http://tempuri.org/}ArrayOfTabellaUtente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoOut", propOrder = {
    "idDocumento",
    "annoProtocollo",
    "numeroProtocollo",
    "dataProtocollo",
    "oggetto",
    "oggettoBilingue",
    "origine",
    "classifica",
    "classificaDescrizione",
    "tipoDocumento",
    "tipoDocumentoDescrizione",
    "mittenteInterno",
    "mittenteInternoDescrizione",
    "mittentiDestinatari",
    "dataDocumento",
    "numeroDocumento",
    "inCaricoA",
    "inCaricoADescrizione",
    "annoNumeroData",
    "annoPratica",
    "numeroPratica",
    "annoNumeroPratica",
    "livelloDiSicurezza",
    "dataEvidenza",
    "docAllegati",
    "documentoRiservato",
    "iterAttivo",
    "dataDiCarico",
    "utenteDiInserimento",
    "dataInserimento",
    "messaggio",
    "allegati",
    "impegni",
    "accertamenti",
    "centriDiCosto",
    "registri",
    "interop",
    "rispostaAlProtocollo",
    "protocolliGenerati",
    "corrispondenti",
    "errore",
    "idPratica",
    "dataInizioPubblicazione",
    "dataFinePubblicazione",
    "datiUtente"
})
@XmlRootElement(name="DocumentoOut")
public class DocumentoOut {

    @XmlElement(name = "IdDocumento")
    protected int idDocumento;
    @XmlElement(name = "AnnoProtocollo")
    protected short annoProtocollo;
    @XmlElement(name = "NumeroProtocollo")
    protected int numeroProtocollo;
    @XmlElement(name = "DataProtocollo", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataProtocollo;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "OggettoBilingue", nillable = true)
    protected String oggettoBilingue;
    @XmlElement(name = "Origine", nillable = true)
    protected String origine;
    @XmlElement(name = "Classifica", nillable = true)
    protected String classifica;
    @XmlElement(name = "Classifica_Descrizione", nillable = true)
    protected String classificaDescrizione;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;
    @XmlElement(name = "TipoDocumento_Descrizione", nillable = true)
    protected String tipoDocumentoDescrizione;
    @XmlElement(name = "MittenteInterno", nillable = true)
    protected String mittenteInterno;
    @XmlElement(name = "MittenteInterno_Descrizione", nillable = true)
    protected String mittenteInternoDescrizione;
    @XmlElement(name = "MittentiDestinatari", nillable = true)
    protected ArrayOfMittenteDestinatarioOut mittentiDestinatari;
    @XmlElement(name = "DataDocumento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDocumento;
    @XmlElement(name = "NumeroDocumento", nillable = true)
    protected String numeroDocumento;
    @XmlElement(name = "InCaricoA", nillable = true)
    protected String inCaricoA;
    @XmlElement(name = "InCaricoA_Descrizione", nillable = true)
    protected String inCaricoADescrizione;
    @XmlElement(name = "AnnoNumeroData", nillable = true)
    protected String annoNumeroData;
    @XmlElement(name = "AnnoPratica")
    protected short annoPratica;
    @XmlElement(name = "NumeroPratica", nillable = true)
    protected String numeroPratica;
    @XmlElement(name = "AnnoNumeroPratica", nillable = true)
    protected String annoNumeroPratica;
    @XmlElement(name = "LivelloDiSicurezza", nillable = true)
    protected String livelloDiSicurezza;
    @XmlElement(name = "DataEvidenza", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEvidenza;
    @XmlElement(name = "DocAllegati", nillable = true)
    protected String docAllegati;
    @XmlElement(name = "DocumentoRiservato")
    protected boolean documentoRiservato;
    @XmlElement(name = "IterAttivo")
    protected int iterAttivo;
    @XmlElement(name = "DataDiCarico", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiCarico;
    @XmlElement(name = "UtenteDiInserimento", nillable = true)
    protected String utenteDiInserimento;
    @XmlElement(name = "DataInserimento", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInserimento;
    @XmlElement(name = "Messaggio", nillable = true)
    protected String messaggio;
    @XmlElement(name = "Allegati", nillable = true)
    protected ArrayOfAllegatoOut allegati;
    @XmlElement(name = "Impegni", nillable = true)
    protected ArrayOfImpegnoOut impegni;
    @XmlElement(name = "Accertamenti", nillable = true)
    protected ArrayOfAccertamentoOut accertamenti;
    @XmlElement(name = "CentriDiCosto", nillable = true)
    protected ArrayOfCentriDiCostoOut centriDiCosto;
    @XmlElement(name = "Registri", nillable = true)
    protected ArrayOfRegistroAssegnatoOut registri;
    @XmlElement(name = "Interop", nillable = true)
    protected InteropOut interop;
    @XmlElement(name = "RispostaAlProtocollo", nillable = true)
    protected RispostaAlProtocolloOut rispostaAlProtocollo;
    @XmlElement(name = "ProtocolliGenerati", nillable = true)
    protected ArrayOfProtocolloGeneratoOut protocolliGenerati;
    @XmlElement(name = "Corrispondenti", nillable = true)
    protected ArrayOfCorrispondenteOut corrispondenti;
    @XmlElement(name = "Errore", nillable = true)
    protected String errore;
    @XmlElement(name = "IdPratica")
    protected int idPratica;
    @XmlElement(name = "DataInizioPubblicazione", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInizioPubblicazione;
    @XmlElement(name = "DataFinePubblicazione", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinePubblicazione;
    @XmlElement(name = "DatiUtente", nillable = true)
    protected ArrayOfTabellaUtente datiUtente;

    /**
     * Gets the value of the idDocumento property.
     * 
     */
    public int getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     */
    public void setIdDocumento(int value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the annoProtocollo property.
     * 
     */
    public short getAnnoProtocollo() {
        return annoProtocollo;
    }

    /**
     * Sets the value of the annoProtocollo property.
     * 
     */
    public void setAnnoProtocollo(short value) {
        this.annoProtocollo = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     */
    public int getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     */
    public void setNumeroProtocollo(int value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocollo(XMLGregorianCalendar value) {
        this.dataProtocollo = value;
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
     * Gets the value of the classificaDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificaDescrizione() {
        return classificaDescrizione;
    }

    /**
     * Sets the value of the classificaDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificaDescrizione(String value) {
        this.classificaDescrizione = value;
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
     * Gets the value of the tipoDocumentoDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoDescrizione() {
        return tipoDocumentoDescrizione;
    }

    /**
     * Sets the value of the tipoDocumentoDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoDescrizione(String value) {
        this.tipoDocumentoDescrizione = value;
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
     * Gets the value of the mittenteInternoDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMittenteInternoDescrizione() {
        return mittenteInternoDescrizione;
    }

    /**
     * Sets the value of the mittenteInternoDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMittenteInternoDescrizione(String value) {
        this.mittenteInternoDescrizione = value;
    }

    /**
     * Gets the value of the mittentiDestinatari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMittenteDestinatarioOut }
     *     
     */
    public ArrayOfMittenteDestinatarioOut getMittentiDestinatari() {
        return mittentiDestinatari;
    }

    /**
     * Sets the value of the mittentiDestinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMittenteDestinatarioOut }
     *     
     */
    public void setMittentiDestinatari(ArrayOfMittenteDestinatarioOut value) {
        this.mittentiDestinatari = value;
    }

    /**
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDocumento(XMLGregorianCalendar value) {
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
     * Gets the value of the inCaricoADescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCaricoADescrizione() {
        return inCaricoADescrizione;
    }

    /**
     * Sets the value of the inCaricoADescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCaricoADescrizione(String value) {
        this.inCaricoADescrizione = value;
    }

    /**
     * Gets the value of the annoNumeroData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoNumeroData() {
        return annoNumeroData;
    }

    /**
     * Sets the value of the annoNumeroData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoNumeroData(String value) {
        this.annoNumeroData = value;
    }

    /**
     * Gets the value of the annoPratica property.
     * 
     */
    public short getAnnoPratica() {
        return annoPratica;
    }

    /**
     * Sets the value of the annoPratica property.
     * 
     */
    public void setAnnoPratica(short value) {
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
     * Gets the value of the annoNumeroPratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoNumeroPratica() {
        return annoNumeroPratica;
    }

    /**
     * Sets the value of the annoNumeroPratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoNumeroPratica(String value) {
        this.annoNumeroPratica = value;
    }

    /**
     * Gets the value of the livelloDiSicurezza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivelloDiSicurezza() {
        return livelloDiSicurezza;
    }

    /**
     * Sets the value of the livelloDiSicurezza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivelloDiSicurezza(String value) {
        this.livelloDiSicurezza = value;
    }

    /**
     * Gets the value of the dataEvidenza property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEvidenza() {
        return dataEvidenza;
    }

    /**
     * Sets the value of the dataEvidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEvidenza(XMLGregorianCalendar value) {
        this.dataEvidenza = value;
    }

    /**
     * Gets the value of the docAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocAllegati() {
        return docAllegati;
    }

    /**
     * Sets the value of the docAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocAllegati(String value) {
        this.docAllegati = value;
    }

    /**
     * Gets the value of the documentoRiservato property.
     * 
     */
    public boolean isDocumentoRiservato() {
        return documentoRiservato;
    }

    /**
     * Sets the value of the documentoRiservato property.
     * 
     */
    public void setDocumentoRiservato(boolean value) {
        this.documentoRiservato = value;
    }

    /**
     * Gets the value of the iterAttivo property.
     * 
     */
    public int getIterAttivo() {
        return iterAttivo;
    }

    /**
     * Sets the value of the iterAttivo property.
     * 
     */
    public void setIterAttivo(int value) {
        this.iterAttivo = value;
    }

    /**
     * Gets the value of the dataDiCarico property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiCarico() {
        return dataDiCarico;
    }

    /**
     * Sets the value of the dataDiCarico property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiCarico(XMLGregorianCalendar value) {
        this.dataDiCarico = value;
    }

    /**
     * Gets the value of the utenteDiInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtenteDiInserimento() {
        return utenteDiInserimento;
    }

    /**
     * Sets the value of the utenteDiInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtenteDiInserimento(String value) {
        this.utenteDiInserimento = value;
    }

    /**
     * Gets the value of the dataInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Sets the value of the dataInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInserimento(XMLGregorianCalendar value) {
        this.dataInserimento = value;
    }

    /**
     * Gets the value of the messaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the value of the messaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoOut }
     *     
     */
    public ArrayOfAllegatoOut getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoOut }
     *     
     */
    public void setAllegati(ArrayOfAllegatoOut value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the impegni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImpegnoOut }
     *     
     */
    public ArrayOfImpegnoOut getImpegni() {
        return impegni;
    }

    /**
     * Sets the value of the impegni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImpegnoOut }
     *     
     */
    public void setImpegni(ArrayOfImpegnoOut value) {
        this.impegni = value;
    }

    /**
     * Gets the value of the accertamenti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccertamentoOut }
     *     
     */
    public ArrayOfAccertamentoOut getAccertamenti() {
        return accertamenti;
    }

    /**
     * Sets the value of the accertamenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccertamentoOut }
     *     
     */
    public void setAccertamenti(ArrayOfAccertamentoOut value) {
        this.accertamenti = value;
    }

    /**
     * Gets the value of the centriDiCosto property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCentriDiCostoOut }
     *     
     */
    public ArrayOfCentriDiCostoOut getCentriDiCosto() {
        return centriDiCosto;
    }

    /**
     * Sets the value of the centriDiCosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCentriDiCostoOut }
     *     
     */
    public void setCentriDiCosto(ArrayOfCentriDiCostoOut value) {
        this.centriDiCosto = value;
    }

    /**
     * Gets the value of the registri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegistroAssegnatoOut }
     *     
     */
    public ArrayOfRegistroAssegnatoOut getRegistri() {
        return registri;
    }

    /**
     * Sets the value of the registri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegistroAssegnatoOut }
     *     
     */
    public void setRegistri(ArrayOfRegistroAssegnatoOut value) {
        this.registri = value;
    }

    /**
     * Gets the value of the interop property.
     * 
     * @return
     *     possible object is
     *     {@link InteropOut }
     *     
     */
    public InteropOut getInterop() {
        return interop;
    }

    /**
     * Sets the value of the interop property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteropOut }
     *     
     */
    public void setInterop(InteropOut value) {
        this.interop = value;
    }

    /**
     * Gets the value of the rispostaAlProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link RispostaAlProtocolloOut }
     *     
     */
    public RispostaAlProtocolloOut getRispostaAlProtocollo() {
        return rispostaAlProtocollo;
    }

    /**
     * Sets the value of the rispostaAlProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RispostaAlProtocolloOut }
     *     
     */
    public void setRispostaAlProtocollo(RispostaAlProtocolloOut value) {
        this.rispostaAlProtocollo = value;
    }

    /**
     * Gets the value of the protocolliGenerati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProtocolloGeneratoOut }
     *     
     */
    public ArrayOfProtocolloGeneratoOut getProtocolliGenerati() {
        return protocolliGenerati;
    }

    /**
     * Sets the value of the protocolliGenerati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProtocolloGeneratoOut }
     *     
     */
    public void setProtocolliGenerati(ArrayOfProtocolloGeneratoOut value) {
        this.protocolliGenerati = value;
    }

    /**
     * Gets the value of the corrispondenti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCorrispondenteOut }
     *     
     */
    public ArrayOfCorrispondenteOut getCorrispondenti() {
        return corrispondenti;
    }

    /**
     * Sets the value of the corrispondenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCorrispondenteOut }
     *     
     */
    public void setCorrispondenti(ArrayOfCorrispondenteOut value) {
        this.corrispondenti = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

    /**
     * Gets the value of the idPratica property.
     * 
     */
    public int getIdPratica() {
        return idPratica;
    }

    /**
     * Sets the value of the idPratica property.
     * 
     */
    public void setIdPratica(int value) {
        this.idPratica = value;
    }

    /**
     * Gets the value of the dataInizioPubblicazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioPubblicazione() {
        return dataInizioPubblicazione;
    }

    /**
     * Sets the value of the dataInizioPubblicazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioPubblicazione(XMLGregorianCalendar value) {
        this.dataInizioPubblicazione = value;
    }

    /**
     * Gets the value of the dataFinePubblicazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinePubblicazione() {
        return dataFinePubblicazione;
    }

    /**
     * Sets the value of the dataFinePubblicazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinePubblicazione(XMLGregorianCalendar value) {
        this.dataFinePubblicazione = value;
    }

    /**
     * Gets the value of the datiUtente property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTabellaUtente }
     *     
     */
    public ArrayOfTabellaUtente getDatiUtente() {
        return datiUtente;
    }

    /**
     * Sets the value of the datiUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTabellaUtente }
     *     
     */
    public void setDatiUtente(ArrayOfTabellaUtente value) {
        this.datiUtente = value;
    }

}
