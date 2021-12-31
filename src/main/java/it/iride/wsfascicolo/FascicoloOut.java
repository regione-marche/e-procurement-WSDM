
package it.iride.wsfascicolo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FascicoloOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Anno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroSenzaClassifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica_Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltriDati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Archiviata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoArchiviazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroArchiviazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UtenteDiInserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuoloDiInserimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDiInserimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataDiChiusura" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PraticaChiusa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DataDiScarto" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PraticaRiservata" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DocumentiFascicolo" type="{http://tempuri.org/}ArrayOfDocumentoFascicoloOut" minOccurs="0"/>
 *         &lt;element name="FormatoData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LivelloDiSicurezza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PraticaScartabile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumeroDocumentiPratica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IterAttivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDiAnnullo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PraticaAnnullata" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AnnullamentoNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnullamentoUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Padre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SottoFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSottofascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasSottofascicolo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasDocumenti" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasDocumentiConIter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloOut", propOrder = {
    "id",
    "anno",
    "numero",
    "numeroSenzaClassifica",
    "oggetto",
    "oggettoBilingue",
    "data",
    "classifica",
    "classificaDescrizione",
    "altriDati",
    "archiviata",
    "annoArchiviazione",
    "numeroArchiviazione",
    "utenteDiInserimento",
    "ruoloDiInserimento",
    "dataDiInserimento",
    "dataDiChiusura",
    "praticaChiusa",
    "dataDiScarto",
    "praticaRiservata",
    "documentiFascicolo",
    "formatoData",
    "livelloDiSicurezza",
    "praticaScartabile",
    "numeroDocumentiPratica",
    "iterAttivo",
    "acl",
    "errDescription",
    "dataDiAnnullo",
    "praticaAnnullata",
    "annullamentoNote",
    "annullamentoUtente",
    "padre",
    "key",
    "sottoFascicolo",
    "isSottofascicolo",
    "hasSottofascicolo",
    "hasDocumenti",
    "hasDocumentiConIter",
    "messaggio",
    "errore"
})
public class FascicoloOut {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Anno")
    protected int anno;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "NumeroSenzaClassifica")
    protected String numeroSenzaClassifica;
    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "OggettoBilingue")
    protected String oggettoBilingue;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "Classifica")
    protected String classifica;
    @XmlElement(name = "Classifica_Descrizione")
    protected String classificaDescrizione;
    @XmlElement(name = "AltriDati")
    protected String altriDati;
    @XmlElement(name = "Archiviata")
    protected String archiviata;
    @XmlElement(name = "AnnoArchiviazione")
    protected int annoArchiviazione;
    @XmlElement(name = "NumeroArchiviazione")
    protected int numeroArchiviazione;
    @XmlElement(name = "UtenteDiInserimento")
    protected String utenteDiInserimento;
    @XmlElement(name = "RuoloDiInserimento")
    protected String ruoloDiInserimento;
    @XmlElement(name = "DataDiInserimento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiInserimento;
    @XmlElement(name = "DataDiChiusura", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiChiusura;
    @XmlElement(name = "PraticaChiusa")
    protected boolean praticaChiusa;
    @XmlElement(name = "DataDiScarto", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiScarto;
    @XmlElement(name = "PraticaRiservata")
    protected boolean praticaRiservata;
    @XmlElement(name = "DocumentiFascicolo")
    protected ArrayOfDocumentoFascicoloOut documentiFascicolo;
    @XmlElement(name = "FormatoData")
    protected String formatoData;
    @XmlElement(name = "LivelloDiSicurezza")
    protected String livelloDiSicurezza;
    @XmlElement(name = "PraticaScartabile")
    protected boolean praticaScartabile;
    @XmlElement(name = "NumeroDocumentiPratica")
    protected int numeroDocumentiPratica;
    @XmlElement(name = "IterAttivo")
    protected int iterAttivo;
    @XmlElement(name = "ACL")
    protected String acl;
    @XmlElement(name = "ErrDescription")
    protected String errDescription;
    @XmlElement(name = "DataDiAnnullo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiAnnullo;
    @XmlElement(name = "PraticaAnnullata")
    protected boolean praticaAnnullata;
    @XmlElement(name = "AnnullamentoNote")
    protected String annullamentoNote;
    @XmlElement(name = "AnnullamentoUtente")
    protected String annullamentoUtente;
    @XmlElement(name = "Padre")
    protected String padre;
    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "SottoFascicolo")
    protected String sottoFascicolo;
    @XmlElement(name = "IsSottofascicolo")
    protected boolean isSottofascicolo;
    @XmlElement(name = "HasSottofascicolo")
    protected boolean hasSottofascicolo;
    @XmlElement(name = "HasDocumenti")
    protected boolean hasDocumenti;
    @XmlElement(name = "HasDocumentiConIter")
    protected boolean hasDocumentiConIter;
    @XmlElement(name = "Messaggio")
    protected String messaggio;
    @XmlElement(name = "Errore")
    protected String errore;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     */
    public void setAnno(int value) {
        this.anno = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the numeroSenzaClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSenzaClassifica() {
        return numeroSenzaClassifica;
    }

    /**
     * Sets the value of the numeroSenzaClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSenzaClassifica(String value) {
        this.numeroSenzaClassifica = value;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
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
     * Gets the value of the altriDati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltriDati() {
        return altriDati;
    }

    /**
     * Sets the value of the altriDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltriDati(String value) {
        this.altriDati = value;
    }

    /**
     * Gets the value of the archiviata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiviata() {
        return archiviata;
    }

    /**
     * Sets the value of the archiviata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiviata(String value) {
        this.archiviata = value;
    }

    /**
     * Gets the value of the annoArchiviazione property.
     * 
     */
    public int getAnnoArchiviazione() {
        return annoArchiviazione;
    }

    /**
     * Sets the value of the annoArchiviazione property.
     * 
     */
    public void setAnnoArchiviazione(int value) {
        this.annoArchiviazione = value;
    }

    /**
     * Gets the value of the numeroArchiviazione property.
     * 
     */
    public int getNumeroArchiviazione() {
        return numeroArchiviazione;
    }

    /**
     * Sets the value of the numeroArchiviazione property.
     * 
     */
    public void setNumeroArchiviazione(int value) {
        this.numeroArchiviazione = value;
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
     * Gets the value of the ruoloDiInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuoloDiInserimento() {
        return ruoloDiInserimento;
    }

    /**
     * Sets the value of the ruoloDiInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuoloDiInserimento(String value) {
        this.ruoloDiInserimento = value;
    }

    /**
     * Gets the value of the dataDiInserimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiInserimento() {
        return dataDiInserimento;
    }

    /**
     * Sets the value of the dataDiInserimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiInserimento(XMLGregorianCalendar value) {
        this.dataDiInserimento = value;
    }

    /**
     * Gets the value of the dataDiChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiChiusura() {
        return dataDiChiusura;
    }

    /**
     * Sets the value of the dataDiChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiChiusura(XMLGregorianCalendar value) {
        this.dataDiChiusura = value;
    }

    /**
     * Gets the value of the praticaChiusa property.
     * 
     */
    public boolean isPraticaChiusa() {
        return praticaChiusa;
    }

    /**
     * Sets the value of the praticaChiusa property.
     * 
     */
    public void setPraticaChiusa(boolean value) {
        this.praticaChiusa = value;
    }

    /**
     * Gets the value of the dataDiScarto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiScarto() {
        return dataDiScarto;
    }

    /**
     * Sets the value of the dataDiScarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiScarto(XMLGregorianCalendar value) {
        this.dataDiScarto = value;
    }

    /**
     * Gets the value of the praticaRiservata property.
     * 
     */
    public boolean isPraticaRiservata() {
        return praticaRiservata;
    }

    /**
     * Sets the value of the praticaRiservata property.
     * 
     */
    public void setPraticaRiservata(boolean value) {
        this.praticaRiservata = value;
    }

    /**
     * Gets the value of the documentiFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentoFascicoloOut }
     *     
     */
    public ArrayOfDocumentoFascicoloOut getDocumentiFascicolo() {
        return documentiFascicolo;
    }

    /**
     * Sets the value of the documentiFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentoFascicoloOut }
     *     
     */
    public void setDocumentiFascicolo(ArrayOfDocumentoFascicoloOut value) {
        this.documentiFascicolo = value;
    }

    /**
     * Gets the value of the formatoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatoData() {
        return formatoData;
    }

    /**
     * Sets the value of the formatoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatoData(String value) {
        this.formatoData = value;
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
     * Gets the value of the praticaScartabile property.
     * 
     */
    public boolean isPraticaScartabile() {
        return praticaScartabile;
    }

    /**
     * Sets the value of the praticaScartabile property.
     * 
     */
    public void setPraticaScartabile(boolean value) {
        this.praticaScartabile = value;
    }

    /**
     * Gets the value of the numeroDocumentiPratica property.
     * 
     */
    public int getNumeroDocumentiPratica() {
        return numeroDocumentiPratica;
    }

    /**
     * Sets the value of the numeroDocumentiPratica property.
     * 
     */
    public void setNumeroDocumentiPratica(int value) {
        this.numeroDocumentiPratica = value;
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
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL(String value) {
        this.acl = value;
    }

    /**
     * Gets the value of the errDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDescription() {
        return errDescription;
    }

    /**
     * Sets the value of the errDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDescription(String value) {
        this.errDescription = value;
    }

    /**
     * Gets the value of the dataDiAnnullo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiAnnullo() {
        return dataDiAnnullo;
    }

    /**
     * Sets the value of the dataDiAnnullo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiAnnullo(XMLGregorianCalendar value) {
        this.dataDiAnnullo = value;
    }

    /**
     * Gets the value of the praticaAnnullata property.
     * 
     */
    public boolean isPraticaAnnullata() {
        return praticaAnnullata;
    }

    /**
     * Sets the value of the praticaAnnullata property.
     * 
     */
    public void setPraticaAnnullata(boolean value) {
        this.praticaAnnullata = value;
    }

    /**
     * Gets the value of the annullamentoNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnullamentoNote() {
        return annullamentoNote;
    }

    /**
     * Sets the value of the annullamentoNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnullamentoNote(String value) {
        this.annullamentoNote = value;
    }

    /**
     * Gets the value of the annullamentoUtente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnullamentoUtente() {
        return annullamentoUtente;
    }

    /**
     * Sets the value of the annullamentoUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnullamentoUtente(String value) {
        this.annullamentoUtente = value;
    }

    /**
     * Gets the value of the padre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadre() {
        return padre;
    }

    /**
     * Sets the value of the padre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadre(String value) {
        this.padre = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the sottoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSottoFascicolo() {
        return sottoFascicolo;
    }

    /**
     * Sets the value of the sottoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSottoFascicolo(String value) {
        this.sottoFascicolo = value;
    }

    /**
     * Gets the value of the isSottofascicolo property.
     * 
     */
    public boolean isIsSottofascicolo() {
        return isSottofascicolo;
    }

    /**
     * Sets the value of the isSottofascicolo property.
     * 
     */
    public void setIsSottofascicolo(boolean value) {
        this.isSottofascicolo = value;
    }

    /**
     * Gets the value of the hasSottofascicolo property.
     * 
     */
    public boolean isHasSottofascicolo() {
        return hasSottofascicolo;
    }

    /**
     * Sets the value of the hasSottofascicolo property.
     * 
     */
    public void setHasSottofascicolo(boolean value) {
        this.hasSottofascicolo = value;
    }

    /**
     * Gets the value of the hasDocumenti property.
     * 
     */
    public boolean isHasDocumenti() {
        return hasDocumenti;
    }

    /**
     * Sets the value of the hasDocumenti property.
     * 
     */
    public void setHasDocumenti(boolean value) {
        this.hasDocumenti = value;
    }

    /**
     * Gets the value of the hasDocumentiConIter property.
     * 
     */
    public boolean isHasDocumentiConIter() {
        return hasDocumentiConIter;
    }

    /**
     * Sets the value of the hasDocumentiConIter property.
     * 
     */
    public void setHasDocumentiConIter(boolean value) {
        this.hasDocumentiConIter = value;
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

}
