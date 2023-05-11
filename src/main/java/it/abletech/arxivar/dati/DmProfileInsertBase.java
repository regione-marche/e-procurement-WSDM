
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Profile_Insert_Base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Insert_Base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_File" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tipo2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tipo3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Aoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Base" minOccurs="0"/>
 *         &lt;element name="From" type="{http://www.Abletech.it/Arxivar}Dm_DatiProfilo" minOccurs="0"/>
 *         &lt;element name="To" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_DatiProfilo" minOccurs="0"/>
 *         &lt;element name="Cc" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_DatiProfilo" minOccurs="0"/>
 *         &lt;element name="Senders" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_DatiProfilo" minOccurs="0"/>
 *         &lt;element name="Pratiche" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_ElencoPratiche" minOccurs="0"/>
 *         &lt;element name="InOut" type="{http://www.Abletech.it/Arxivar}DmProfileInOut"/>
 *         &lt;element name="Scadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Importante" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Importante"/>
 *         &lt;element name="WebVisible" type="{http://www.Abletech.it/Arxivar}Dm_Profile_WebVisible"/>
 *         &lt;element name="ProtocolloInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Note" minOccurs="0"/>
 *         &lt;element name="ConstrainRoleBehaviour" type="{http://www.Abletech.it/Arxivar}Dm_Profile_ForInsert_ConstrainRoleBehaviour"/>
 *         &lt;element name="NotePA" type="{http://www.Abletech.it/Arxivar}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DatiEnte" type="{http://www.Abletech.it/Arxivar}Dm_Dati_Ente" minOccurs="0"/>
 *         &lt;element name="DataDoc" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AssocDoc" type="{http://www.Abletech.it/Arxivar}Sd_AssocDoc" minOccurs="0"/>
 *         &lt;element name="GenerateProtocolPa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DataProt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Insert_Base", propOrder = {
    "attachments",
    "documentType",
    "tipo2",
    "tipo3",
    "aoo",
    "stato",
    "docName",
    "aggiuntivi",
    "from",
    "to",
    "cc",
    "senders",
    "pratiche",
    "inOut",
    "scadenza",
    "importante",
    "webVisible",
    "protocolloInterno",
    "note",
    "constrainRoleBehaviour",
    "notePA",
    "datiEnte",
    "dataDoc",
    "assocDoc",
    "generateProtocolPa",
    "dataProt"
})
@XmlSeeAlso({
    DmProfileInsertForModule.class,
    DmProfileInsertForBarcode2 .class,
    DmProfileForInsert.class
})
public class DmProfileInsertBase
    extends Base
{

    @XmlElement(name = "Attachments")
    protected ArrayOfArxFile attachments;
    @XmlElement(name = "DocumentType")
    protected int documentType;
    @XmlElement(name = "Tipo2")
    protected int tipo2;
    @XmlElement(name = "Tipo3")
    protected int tipo3;
    @XmlElement(name = "Aoo")
    protected String aoo;
    @XmlElement(name = "Stato")
    protected String stato;
    @XmlElement(name = "DocName")
    protected String docName;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfAggiuntivoBase aggiuntivi;
    @XmlElement(name = "From")
    protected DmDatiProfilo from;
    @XmlElement(name = "To")
    protected ArrayOfDmDatiProfilo to;
    @XmlElement(name = "Cc")
    protected ArrayOfDmDatiProfilo cc;
    @XmlElement(name = "Senders")
    protected ArrayOfDmDatiProfilo senders;
    @XmlElement(name = "Pratiche")
    protected ArrayOfDmElencoPratiche pratiche;
    @XmlElement(name = "InOut", required = true)
    protected DmProfileInOut inOut;
    @XmlElement(name = "Scadenza", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scadenza;
    @XmlElement(name = "Importante", required = true)
    protected DmProfileImportante importante;
    @XmlElement(name = "WebVisible", required = true)
    protected DmProfileWebVisible webVisible;
    @XmlElement(name = "ProtocolloInterno")
    protected String protocolloInterno;
    @XmlElement(name = "Note")
    protected ArrayOfDmNote note;
    @XmlElement(name = "ConstrainRoleBehaviour", required = true)
    protected DmProfileForInsertConstrainRoleBehaviour constrainRoleBehaviour;
    @XmlElement(name = "NotePA")
    protected ArrayOfString notePA;
    @XmlElement(name = "DatiEnte")
    protected DmDatiEnte datiEnte;
    @XmlElement(name = "DataDoc", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDoc;
    @XmlElement(name = "AssocDoc")
    protected SdAssocDoc assocDoc;
    @XmlElement(name = "GenerateProtocolPa")
    protected boolean generateProtocolPa;
    @XmlElement(name = "DataProt", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataProt;

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxFile }
     *     
     */
    public ArrayOfArxFile getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxFile }
     *     
     */
    public void setAttachments(ArrayOfArxFile value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     */
    public int getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     */
    public void setDocumentType(int value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     */
    public int getTipo2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     */
    public void setTipo2(int value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     */
    public int getTipo3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     */
    public void setTipo3(int value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAoo() {
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
    public void setAoo(String value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStato(String value) {
        this.stato = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the aggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggiuntivoBase }
     *     
     */
    public ArrayOfAggiuntivoBase getAggiuntivi() {
        return aggiuntivi;
    }

    /**
     * Sets the value of the aggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggiuntivoBase }
     *     
     */
    public void setAggiuntivi(ArrayOfAggiuntivoBase value) {
        this.aggiuntivi = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link DmDatiProfilo }
     *     
     */
    public DmDatiProfilo getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDatiProfilo }
     *     
     */
    public void setFrom(DmDatiProfilo value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmDatiProfilo }
     *     
     */
    public ArrayOfDmDatiProfilo getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmDatiProfilo }
     *     
     */
    public void setTo(ArrayOfDmDatiProfilo value) {
        this.to = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmDatiProfilo }
     *     
     */
    public ArrayOfDmDatiProfilo getCc() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmDatiProfilo }
     *     
     */
    public void setCc(ArrayOfDmDatiProfilo value) {
        this.cc = value;
    }

    /**
     * Gets the value of the senders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmDatiProfilo }
     *     
     */
    public ArrayOfDmDatiProfilo getSenders() {
        return senders;
    }

    /**
     * Sets the value of the senders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmDatiProfilo }
     *     
     */
    public void setSenders(ArrayOfDmDatiProfilo value) {
        this.senders = value;
    }

    /**
     * Gets the value of the pratiche property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmElencoPratiche }
     *     
     */
    public ArrayOfDmElencoPratiche getPratiche() {
        return pratiche;
    }

    /**
     * Sets the value of the pratiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmElencoPratiche }
     *     
     */
    public void setPratiche(ArrayOfDmElencoPratiche value) {
        this.pratiche = value;
    }

    /**
     * Gets the value of the inOut property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInOut }
     *     
     */
    public DmProfileInOut getInOut() {
        return inOut;
    }

    /**
     * Sets the value of the inOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInOut }
     *     
     */
    public void setInOut(DmProfileInOut value) {
        this.inOut = value;
    }

    /**
     * Gets the value of the scadenza property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScadenza() {
        return scadenza;
    }

    /**
     * Sets the value of the scadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScadenza(XMLGregorianCalendar value) {
        this.scadenza = value;
    }

    /**
     * Gets the value of the importante property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileImportante }
     *     
     */
    public DmProfileImportante getImportante() {
        return importante;
    }

    /**
     * Sets the value of the importante property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileImportante }
     *     
     */
    public void setImportante(DmProfileImportante value) {
        this.importante = value;
    }

    /**
     * Gets the value of the webVisible property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileWebVisible }
     *     
     */
    public DmProfileWebVisible getWebVisible() {
        return webVisible;
    }

    /**
     * Sets the value of the webVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileWebVisible }
     *     
     */
    public void setWebVisible(DmProfileWebVisible value) {
        this.webVisible = value;
    }

    /**
     * Gets the value of the protocolloInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolloInterno() {
        return protocolloInterno;
    }

    /**
     * Sets the value of the protocolloInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolloInterno(String value) {
        this.protocolloInterno = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmNote }
     *     
     */
    public ArrayOfDmNote getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmNote }
     *     
     */
    public void setNote(ArrayOfDmNote value) {
        this.note = value;
    }

    /**
     * Gets the value of the constrainRoleBehaviour property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileForInsertConstrainRoleBehaviour }
     *     
     */
    public DmProfileForInsertConstrainRoleBehaviour getConstrainRoleBehaviour() {
        return constrainRoleBehaviour;
    }

    /**
     * Sets the value of the constrainRoleBehaviour property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileForInsertConstrainRoleBehaviour }
     *     
     */
    public void setConstrainRoleBehaviour(DmProfileForInsertConstrainRoleBehaviour value) {
        this.constrainRoleBehaviour = value;
    }

    /**
     * Gets the value of the notePA property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getNotePA() {
        return notePA;
    }

    /**
     * Sets the value of the notePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setNotePA(ArrayOfString value) {
        this.notePA = value;
    }

    /**
     * Gets the value of the datiEnte property.
     * 
     * @return
     *     possible object is
     *     {@link DmDatiEnte }
     *     
     */
    public DmDatiEnte getDatiEnte() {
        return datiEnte;
    }

    /**
     * Sets the value of the datiEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDatiEnte }
     *     
     */
    public void setDatiEnte(DmDatiEnte value) {
        this.datiEnte = value;
    }

    /**
     * Gets the value of the dataDoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDoc() {
        return dataDoc;
    }

    /**
     * Sets the value of the dataDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDoc(XMLGregorianCalendar value) {
        this.dataDoc = value;
    }

    /**
     * Gets the value of the assocDoc property.
     * 
     * @return
     *     possible object is
     *     {@link SdAssocDoc }
     *     
     */
    public SdAssocDoc getAssocDoc() {
        return assocDoc;
    }

    /**
     * Sets the value of the assocDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdAssocDoc }
     *     
     */
    public void setAssocDoc(SdAssocDoc value) {
        this.assocDoc = value;
    }

    /**
     * Gets the value of the generateProtocolPa property.
     * 
     */
    public boolean isGenerateProtocolPa() {
        return generateProtocolPa;
    }

    /**
     * Sets the value of the generateProtocolPa property.
     * 
     */
    public void setGenerateProtocolPa(boolean value) {
        this.generateProtocolPa = value;
    }

    /**
     * Gets the value of the dataProt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProt() {
        return dataProt;
    }

    /**
     * Sets the value of the dataProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProt(XMLGregorianCalendar value) {
        this.dataProt = value;
    }

}
