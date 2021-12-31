
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCUMENTTYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPO2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TIPO3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATADOC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MITTENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESTINATARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORIGINALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATAFILE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DEVICE" type="{http://www.Abletech.it/Arxivar}Device"/>
 *         &lt;element name="IMPRONTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSWZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSTRING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTANTE" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Importante"/>
 *         &lt;element name="MAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AUTORE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NOTE" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Note"/>
 *         &lt;element name="PROTOCOLLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BLOCCATO" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Bloccato"/>
 *         &lt;element name="STATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INOUT" type="{http://www.Abletech.it/Arxivar}DmProfileInOut"/>
 *         &lt;element name="SCADENZA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FLAG" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Flag"/>
 *         &lt;element name="WORKFLOW" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Workflow"/>
 *         &lt;element name="GESTREV" type="{http://www.Abletech.it/Arxivar}Dm_Profile_GestRev"/>
 *         &lt;element name="ETICHETTACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ETICHETTA_AOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALLEGATI" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Allegati"/>
 *         &lt;element name="OPENDOC" type="{http://www.Abletech.it/Arxivar}Dm_Profile_OpenDoc"/>
 *         &lt;element name="ASSOCIAZIONI" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Associazioni"/>
 *         &lt;element name="EMERGENZA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WEBVISIBLE" type="{http://www.Abletech.it/Arxivar}Dm_Profile_WebVisible"/>
 *         &lt;element name="ISAOS" type="{http://www.Abletech.it/Arxivar}Dm_Profile_IsAos"/>
 *         &lt;element name="ETI_READER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCADAOS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Base" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi_IsLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DATAPROT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="COMPRESSED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FILESIZE" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile", propOrder = {
    "docnumber",
    "docname",
    "documenttype",
    "tipo2",
    "tipo3",
    "aoo",
    "numero",
    "datadoc",
    "mittente",
    "destinatario",
    "senders",
    "cc",
    "creationdate",
    "path",
    "filename",
    "originale",
    "datafile",
    "device",
    "impronta",
    "pswzip",
    "cstring",
    "importante",
    "mailid",
    "revisione",
    "autore",
    "note",
    "protocollo",
    "anno",
    "bloccato",
    "stato",
    "inout",
    "scadenza",
    "flag",
    "workflow",
    "gestrev",
    "etichettacd",
    "etichettaaos",
    "allegati",
    "opendoc",
    "associazioni",
    "emergenza",
    "webvisible",
    "isaos",
    "etireader",
    "scadaos",
    "aggiuntivi",
    "aggiuntiviIsLoaded",
    "dataprot",
    "compressed",
    "filesize"
})
public class DmProfile
    extends Base
{

    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "DOCNAME")
    protected String docname;
    @XmlElement(name = "DOCUMENTTYPE")
    protected int documenttype;
    @XmlElement(name = "TIPO2")
    protected int tipo2;
    @XmlElement(name = "TIPO3")
    protected int tipo3;
    @XmlElement(name = "AOO")
    protected String aoo;
    @XmlElement(name = "NUMERO")
    protected String numero;
    @XmlElement(name = "DATADOC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datadoc;
    @XmlElement(name = "MITTENTE")
    protected String mittente;
    @XmlElement(name = "DESTINATARIO")
    protected String destinatario;
    @XmlElement(name = "SENDERS")
    protected String senders;
    @XmlElement(name = "CC")
    protected String cc;
    @XmlElement(name = "CREATION_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    @XmlElement(name = "PATH")
    protected String path;
    @XmlElement(name = "FILENAME")
    protected String filename;
    @XmlElement(name = "ORIGINALE")
    protected String originale;
    @XmlElement(name = "DATAFILE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datafile;
    @XmlElement(name = "DEVICE", required = true)
    protected Device device;
    @XmlElement(name = "IMPRONTA")
    protected String impronta;
    @XmlElement(name = "PSWZIP")
    protected String pswzip;
    @XmlElement(name = "CSTRING")
    protected String cstring;
    @XmlElement(name = "IMPORTANTE", required = true)
    protected DmProfileImportante importante;
    @XmlElement(name = "MAILID")
    protected String mailid;
    @XmlElement(name = "REVISIONE")
    protected int revisione;
    @XmlElement(name = "AUTORE")
    protected int autore;
    @XmlElement(name = "NOTE", required = true)
    protected DmProfileNote note;
    @XmlElement(name = "PROTOCOLLO")
    protected String protocollo;
    @XmlElement(name = "ANNO")
    protected String anno;
    @XmlElement(name = "BLOCCATO", required = true)
    protected DmProfileBloccato bloccato;
    @XmlElement(name = "STATO")
    protected String stato;
    @XmlElement(name = "INOUT", required = true)
    protected DmProfileInOut inout;
    @XmlElement(name = "SCADENZA", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scadenza;
    @XmlElement(name = "FLAG", required = true)
    protected DmProfileFlag flag;
    @XmlElement(name = "WORKFLOW", required = true)
    protected DmProfileWorkflow workflow;
    @XmlElement(name = "GESTREV", required = true)
    protected DmProfileGestRev gestrev;
    @XmlElement(name = "ETICHETTACD")
    protected String etichettacd;
    @XmlElement(name = "ETICHETTA_AOS")
    protected String etichettaaos;
    @XmlElement(name = "ALLEGATI", required = true)
    protected DmProfileAllegati allegati;
    @XmlElement(name = "OPENDOC", required = true)
    protected DmProfileOpenDoc opendoc;
    @XmlElement(name = "ASSOCIAZIONI", required = true)
    protected DmProfileAssociazioni associazioni;
    @XmlElement(name = "EMERGENZA", required = true, type = Integer.class, nillable = true)
    protected Integer emergenza;
    @XmlElement(name = "WEBVISIBLE", required = true)
    protected DmProfileWebVisible webvisible;
    @XmlElement(name = "ISAOS", required = true)
    protected DmProfileIsAos isaos;
    @XmlElement(name = "ETI_READER")
    protected String etireader;
    @XmlElement(name = "SCADAOS", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scadaos;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfAggiuntivoBase aggiuntivi;
    @XmlElement(name = "Aggiuntivi_IsLoaded")
    protected boolean aggiuntiviIsLoaded;
    @XmlElement(name = "DATAPROT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataprot;
    @XmlElement(name = "COMPRESSED")
    protected boolean compressed;
    @XmlElement(name = "FILESIZE", required = true, type = Long.class, nillable = true)
    protected Long filesize;

    /**
     * Gets the value of the docnumber property.
     * 
     */
    public int getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     */
    public void setDOCNUMBER(int value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the docname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNAME() {
        return docname;
    }

    /**
     * Sets the value of the docname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNAME(String value) {
        this.docname = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     */
    public int getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     */
    public void setDOCUMENTTYPE(int value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     */
    public int getTIPO2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     */
    public void setTIPO2(int value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     */
    public int getTIPO3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     */
    public void setTIPO3(int value) {
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
    public String getAOO() {
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
    public void setAOO(String value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERO() {
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
    public void setNUMERO(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the datadoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATADOC() {
        return datadoc;
    }

    /**
     * Sets the value of the datadoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATADOC(XMLGregorianCalendar value) {
        this.datadoc = value;
    }

    /**
     * Gets the value of the mittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTENTE() {
        return mittente;
    }

    /**
     * Sets the value of the mittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTENTE(String value) {
        this.mittente = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATARIO() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATARIO(String value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the senders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERS() {
        return senders;
    }

    /**
     * Sets the value of the senders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERS(String value) {
        this.senders = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCC(String value) {
        this.cc = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATIONDATE(XMLGregorianCalendar value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATH() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATH(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the originale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINALE() {
        return originale;
    }

    /**
     * Sets the value of the originale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINALE(String value) {
        this.originale = value;
    }

    /**
     * Gets the value of the datafile property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAFILE() {
        return datafile;
    }

    /**
     * Sets the value of the datafile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAFILE(XMLGregorianCalendar value) {
        this.datafile = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDEVICE() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDEVICE(Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the impronta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPRONTA() {
        return impronta;
    }

    /**
     * Sets the value of the impronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPRONTA(String value) {
        this.impronta = value;
    }

    /**
     * Gets the value of the pswzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSWZIP() {
        return pswzip;
    }

    /**
     * Sets the value of the pswzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSWZIP(String value) {
        this.pswzip = value;
    }

    /**
     * Gets the value of the cstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSTRING() {
        return cstring;
    }

    /**
     * Sets the value of the cstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSTRING(String value) {
        this.cstring = value;
    }

    /**
     * Gets the value of the importante property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileImportante }
     *     
     */
    public DmProfileImportante getIMPORTANTE() {
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
    public void setIMPORTANTE(DmProfileImportante value) {
        this.importante = value;
    }

    /**
     * Gets the value of the mailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILID() {
        return mailid;
    }

    /**
     * Sets the value of the mailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILID(String value) {
        this.mailid = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     */
    public int getREVISIONE() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     */
    public void setREVISIONE(int value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     */
    public int getAUTORE() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     */
    public void setAUTORE(int value) {
        this.autore = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileNote }
     *     
     */
    public DmProfileNote getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileNote }
     *     
     */
    public void setNOTE(DmProfileNote value) {
        this.note = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROTOCOLLO() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROTOCOLLO(String value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANNO() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANNO(String value) {
        this.anno = value;
    }

    /**
     * Gets the value of the bloccato property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileBloccato }
     *     
     */
    public DmProfileBloccato getBLOCCATO() {
        return bloccato;
    }

    /**
     * Sets the value of the bloccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileBloccato }
     *     
     */
    public void setBLOCCATO(DmProfileBloccato value) {
        this.bloccato = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATO() {
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
    public void setSTATO(String value) {
        this.stato = value;
    }

    /**
     * Gets the value of the inout property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInOut }
     *     
     */
    public DmProfileInOut getINOUT() {
        return inout;
    }

    /**
     * Sets the value of the inout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInOut }
     *     
     */
    public void setINOUT(DmProfileInOut value) {
        this.inout = value;
    }

    /**
     * Gets the value of the scadenza property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSCADENZA() {
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
    public void setSCADENZA(XMLGregorianCalendar value) {
        this.scadenza = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileFlag }
     *     
     */
    public DmProfileFlag getFLAG() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileFlag }
     *     
     */
    public void setFLAG(DmProfileFlag value) {
        this.flag = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileWorkflow }
     *     
     */
    public DmProfileWorkflow getWORKFLOW() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileWorkflow }
     *     
     */
    public void setWORKFLOW(DmProfileWorkflow value) {
        this.workflow = value;
    }

    /**
     * Gets the value of the gestrev property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileGestRev }
     *     
     */
    public DmProfileGestRev getGESTREV() {
        return gestrev;
    }

    /**
     * Sets the value of the gestrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileGestRev }
     *     
     */
    public void setGESTREV(DmProfileGestRev value) {
        this.gestrev = value;
    }

    /**
     * Gets the value of the etichettacd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETICHETTACD() {
        return etichettacd;
    }

    /**
     * Sets the value of the etichettacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETICHETTACD(String value) {
        this.etichettacd = value;
    }

    /**
     * Gets the value of the etichettaaos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETICHETTAAOS() {
        return etichettaaos;
    }

    /**
     * Sets the value of the etichettaaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETICHETTAAOS(String value) {
        this.etichettaaos = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileAllegati }
     *     
     */
    public DmProfileAllegati getALLEGATI() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileAllegati }
     *     
     */
    public void setALLEGATI(DmProfileAllegati value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the opendoc property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileOpenDoc }
     *     
     */
    public DmProfileOpenDoc getOPENDOC() {
        return opendoc;
    }

    /**
     * Sets the value of the opendoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileOpenDoc }
     *     
     */
    public void setOPENDOC(DmProfileOpenDoc value) {
        this.opendoc = value;
    }

    /**
     * Gets the value of the associazioni property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileAssociazioni }
     *     
     */
    public DmProfileAssociazioni getASSOCIAZIONI() {
        return associazioni;
    }

    /**
     * Sets the value of the associazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileAssociazioni }
     *     
     */
    public void setASSOCIAZIONI(DmProfileAssociazioni value) {
        this.associazioni = value;
    }

    /**
     * Gets the value of the emergenza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEMERGENZA() {
        return emergenza;
    }

    /**
     * Sets the value of the emergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEMERGENZA(Integer value) {
        this.emergenza = value;
    }

    /**
     * Gets the value of the webvisible property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileWebVisible }
     *     
     */
    public DmProfileWebVisible getWEBVISIBLE() {
        return webvisible;
    }

    /**
     * Sets the value of the webvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileWebVisible }
     *     
     */
    public void setWEBVISIBLE(DmProfileWebVisible value) {
        this.webvisible = value;
    }

    /**
     * Gets the value of the isaos property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileIsAos }
     *     
     */
    public DmProfileIsAos getISAOS() {
        return isaos;
    }

    /**
     * Sets the value of the isaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileIsAos }
     *     
     */
    public void setISAOS(DmProfileIsAos value) {
        this.isaos = value;
    }

    /**
     * Gets the value of the etireader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETIREADER() {
        return etireader;
    }

    /**
     * Sets the value of the etireader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETIREADER(String value) {
        this.etireader = value;
    }

    /**
     * Gets the value of the scadaos property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSCADAOS() {
        return scadaos;
    }

    /**
     * Sets the value of the scadaos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSCADAOS(XMLGregorianCalendar value) {
        this.scadaos = value;
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
     * Gets the value of the aggiuntiviIsLoaded property.
     * 
     */
    public boolean isAggiuntiviIsLoaded() {
        return aggiuntiviIsLoaded;
    }

    /**
     * Sets the value of the aggiuntiviIsLoaded property.
     * 
     */
    public void setAggiuntiviIsLoaded(boolean value) {
        this.aggiuntiviIsLoaded = value;
    }

    /**
     * Gets the value of the dataprot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAPROT() {
        return dataprot;
    }

    /**
     * Sets the value of the dataprot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAPROT(XMLGregorianCalendar value) {
        this.dataprot = value;
    }

    /**
     * Gets the value of the compressed property.
     * 
     */
    public boolean isCOMPRESSED() {
        return compressed;
    }

    /**
     * Sets the value of the compressed property.
     * 
     */
    public void setCOMPRESSED(boolean value) {
        this.compressed = value;
    }

    /**
     * Gets the value of the filesize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFILESIZE() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFILESIZE(Long value) {
        this.filesize = value;
    }

}
