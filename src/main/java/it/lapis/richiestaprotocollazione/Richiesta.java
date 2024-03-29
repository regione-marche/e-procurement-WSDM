//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.26 at 04:05:31 PM CEST 
//


package it.lapis.richiestaprotocollazione;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operatore" type="{}varchar100"/>
 *         &lt;element name="Note" type="{}varchar500" minOccurs="0"/>
 *         &lt;element name="IDC" type="{}varchar100"/>
 *         &lt;element name="IEFASCICOLO" type="{}varchar100" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{}varchar2000"/>
 *         &lt;element name="Cod_Mittente" type="{}varchar020"/>
 *         &lt;element name="TipoDocumento" type="{}tipo_documento" minOccurs="0"/>
 *         &lt;element ref="{}Riferimenti" minOccurs="0"/>
 *         &lt;element ref="{}Destinatari"/>
 *         &lt;element ref="{}Documento_Principale"/>
 *         &lt;element ref="{}Allegati" minOccurs="0"/>
 *         &lt;element name="PEC_Singola" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cod_applicativo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operatore",
    "note",
    "idc",
    "iefascicolo",
    "oggetto",
    "codMittente",
    "tipoDocumento",
    "riferimenti",
    "destinatari",
    "documentoPrincipale",
    "allegati",
    "pecSingola"
})
@XmlRootElement(name = "richiesta")
public class Richiesta {

    @XmlElement(name = "Operatore", required = true)
    protected String operatore;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "IDC", required = true)
    protected String idc;
    @XmlElement(name = "IEFASCICOLO")
    protected String iefascicolo;
    @XmlElement(name = "Oggetto", required = true)
    protected String oggetto;
    @XmlElement(name = "Cod_Mittente", required = true)
    protected String codMittente;
    @XmlElement(name = "TipoDocumento")
    protected TipoDocumento tipoDocumento;
    @XmlElement(name = "Riferimenti")
    protected Riferimenti riferimenti;
    @XmlElement(name = "Destinatari", required = true)
    protected Destinatari destinatari;
    @XmlElement(name = "Documento_Principale", required = true)
    protected DocumentoPrincipale documentoPrincipale;
    @XmlElement(name = "Allegati")
    protected Allegati allegati;
    @XmlElement(name = "PEC_Singola")
    protected Boolean pecSingola;
    @XmlAttribute(name = "cod_applicativo", required = true)
    protected String codApplicativo;

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatore(String value) {
        this.operatore = value;
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
     * Gets the value of the idc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDC() {
        return idc;
    }

    /**
     * Sets the value of the idc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDC(String value) {
        this.idc = value;
    }

    /**
     * Gets the value of the iefascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIEFASCICOLO() {
        return iefascicolo;
    }

    /**
     * Sets the value of the iefascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIEFASCICOLO(String value) {
        this.iefascicolo = value;
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
     * Gets the value of the codMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMittente() {
        return codMittente;
    }

    /**
     * Sets the value of the codMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMittente(String value) {
        this.codMittente = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the riferimenti property.
     * 
     * @return
     *     possible object is
     *     {@link Riferimenti }
     *     
     */
    public Riferimenti getRiferimenti() {
        return riferimenti;
    }

    /**
     * Sets the value of the riferimenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Riferimenti }
     *     
     */
    public void setRiferimenti(Riferimenti value) {
        this.riferimenti = value;
    }

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link Destinatari }
     *     
     */
    public Destinatari getDestinatari() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destinatari }
     *     
     */
    public void setDestinatari(Destinatari value) {
        this.destinatari = value;
    }

    /**
     * Gets the value of the documentoPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPrincipale }
     *     
     */
    public DocumentoPrincipale getDocumentoPrincipale() {
        return documentoPrincipale;
    }

    /**
     * Sets the value of the documentoPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPrincipale }
     *     
     */
    public void setDocumentoPrincipale(DocumentoPrincipale value) {
        this.documentoPrincipale = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link Allegati }
     *     
     */
    public Allegati getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allegati }
     *     
     */
    public void setAllegati(Allegati value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the pecSingola property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPECSingola() {
        return pecSingola;
    }

    /**
     * Sets the value of the pecSingola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPECSingola(Boolean value) {
        this.pecSingola = value;
    }

    /**
     * Gets the value of the codApplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodApplicativo() {
        return codApplicativo;
    }

    /**
     * Sets the value of the codApplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodApplicativo(String value) {
        this.codApplicativo = value;
    }

}
