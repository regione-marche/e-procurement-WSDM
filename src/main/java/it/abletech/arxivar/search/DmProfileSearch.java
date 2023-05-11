
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="DocNumber" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DocName" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Tipo2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Tipo3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Path" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DataDoc" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="A" type="{http://www.Abletech.it/Arxivar}Field_Da_A" minOccurs="0"/>
 *         &lt;element name="CC" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="SENDERS" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Profilato" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Creation_Date" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Importante" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Revisione" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Autore" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Protocollo" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Anno" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Bloccato" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Stato" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="InOut" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Scadenza" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Flag" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="WorkFlow" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Originale" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DataFile" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="GestRev" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="OpenDoc" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Associazioni" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Impronta" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Emergenza" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Aoo" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="WebVisible" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IsAos" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ScadAos" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="EtichettaCd" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Eti_Reader" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DataProt" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Dm_Dati_Ente" type="{http://www.Abletech.it/Arxivar}Join_Dm_Dati_Ente" minOccurs="0"/>
 *         &lt;element name="Dm_Profile_Pratiche" type="{http://www.Abletech.it/Arxivar}Join_Dm_Profile_Pratica" minOccurs="0"/>
 *         &lt;element name="Dm_ElencoPratiche" type="{http://www.Abletech.it/Arxivar}Join_Dm_ElencoPratiche" minOccurs="0"/>
 *         &lt;element name="Dm_Allegati_Doc" type="{http://www.Abletech.it/Arxivar}Join_Dm_Allegati_Doc" minOccurs="0"/>
 *         &lt;element name="Dm_ProcessDoc" type="{http://www.Abletech.it/Arxivar}Join_Dm_ProcessDoc" minOccurs="0"/>
 *         &lt;element name="Dm_DatiProfilo" type="{http://www.Abletech.it/Arxivar}Join_Dm_DatiProfilo" minOccurs="0"/>
 *         &lt;element name="Dm_Associazioni" type="{http://www.Abletech.it/Arxivar}Join_Dm_Associazioni" minOccurs="0"/>
 *         &lt;element name="Dm_FileInFolder" type="{http://www.Abletech.it/Arxivar}Join_Dm_FileInFolder" minOccurs="0"/>
 *         &lt;element name="Dm_DocOpen" type="{http://www.Abletech.it/Arxivar}Join_Dm_DocOpen" minOccurs="0"/>
 *         &lt;element name="Dm_Testo" type="{http://www.Abletech.it/Arxivar}Join_Dm_Testo" minOccurs="0"/>
 *         &lt;element name="Dm_Note" type="{http://www.Abletech.it/Arxivar}Join_Dm_Note" minOccurs="0"/>
 *         &lt;element name="Dm_Movimenti_Liste" type="{http://www.Abletech.it/Arxivar}Join_Dm_Movimenti_Liste" minOccurs="0"/>
 *         &lt;element name="Dm_DocAllegati" type="{http://www.Abletech.it/Arxivar}Join_Dm_DocAllegati" minOccurs="0"/>
 *         &lt;element name="Periodo" type="{http://www.Abletech.it/Arxivar}Field_String_Periodo" minOccurs="0"/>
 *         &lt;element name="DataDoc_NrGiorni" type="{http://www.Abletech.it/Arxivar}FieldNrGiorni" minOccurs="0"/>
 *         &lt;element name="Creation_Date_NrGiorni" type="{http://www.Abletech.it/Arxivar}FieldNrGiorni" minOccurs="0"/>
 *         &lt;element name="Dm_Fascicoli" type="{http://www.Abletech.it/Arxivar}Join_Dm_Fascicoli" minOccurs="0"/>
 *         &lt;element name="Sostitutiva" type="{http://www.Abletech.it/Arxivar}Dm_Profile_Search_Sostitutiva" minOccurs="0"/>
 *         &lt;element name="Dm_DevDoc" type="{http://www.Abletech.it/Arxivar}Join_Dm_DevDoc" minOccurs="0"/>
 *         &lt;element name="Dm_Barcode" type="{http://www.Abletech.it/Arxivar}Join_Dm_Barcode" minOccurs="0"/>
 *         &lt;element name="Dm_TipoDocumento" type="{http://www.Abletech.it/Arxivar}Join_Dm_TipoDocumento" minOccurs="0"/>
 *         &lt;element name="Dm_Autore" type="{http://www.Abletech.it/Arxivar}Join_Dm_Autore" minOccurs="0"/>
 *         &lt;element name="Dm_Npce_Out" type="{http://www.Abletech.it/Arxivar}Join_Dm_Npce_Out" minOccurs="0"/>
 *         &lt;element name="Sd_AssocDoc" type="{http://www.Abletech.it/Arxivar}Join_Sd_Assocdoc" minOccurs="0"/>
 *         &lt;element name="Dm_Relazioni" type="{http://www.Abletech.it/Arxivar}Join_Dm_Relazioni" minOccurs="0"/>
 *         &lt;element name="Dm_Revisioni" type="{http://www.Abletech.it/Arxivar}Join_Dm_Revisioni" minOccurs="0"/>
 *         &lt;element name="Dm_DatiProfilo_From" type="{http://www.Abletech.it/Arxivar}Join_Dm_DatiProfilo_From" minOccurs="0"/>
 *         &lt;element name="Dm_DatiProfilo_To" type="{http://www.Abletech.it/Arxivar}Join_Dm_DatiProfilo_To" minOccurs="0"/>
 *         &lt;element name="Dm_DatiProfilo_Cc" type="{http://www.Abletech.it/Arxivar}Join_Dm_DatiProfilo_Cc" minOccurs="0"/>
 *         &lt;element name="Dm_Emergenza" type="{http://www.Abletech.it/Arxivar}Join_Dm_Emergenza" minOccurs="0"/>
 *         &lt;element name="Dm_StampDefinition" type="{http://www.Abletech.it/Arxivar}Join_Dm_StampDefinition" minOccurs="0"/>
 *         &lt;element name="Dm_StampsInstance" type="{http://www.Abletech.it/Arxivar}Join_Dm_StampsInstance" minOccurs="0"/>
 *         &lt;element name="Dm_StampApplied" type="{http://www.Abletech.it/Arxivar}Join_Dm_StampApplied" minOccurs="0"/>
 *         &lt;element name="FILESIZE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Collaboration" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_CampiClasseLegami" type="{http://www.Abletech.it/Arxivar}Join_DmCampiClasseLegami" minOccurs="0"/>
 *         &lt;element name="Dm_DatiProfilo_Senders" type="{http://www.Abletech.it/Arxivar}Join_Dm_DatiProfilo_Senders" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Search", propOrder = {
    "docNumber",
    "docName",
    "documentType",
    "tipo2",
    "tipo3",
    "path",
    "fileName",
    "numero",
    "dataDoc",
    "a",
    "cc",
    "senders",
    "profilato",
    "creationDate",
    "importante",
    "revisione",
    "autore",
    "note",
    "protocollo",
    "anno",
    "bloccato",
    "stato",
    "inOut",
    "scadenza",
    "flag",
    "workFlow",
    "originale",
    "dataFile",
    "gestRev",
    "device",
    "allegati",
    "openDoc",
    "associazioni",
    "impronta",
    "emergenza",
    "aoo",
    "webVisible",
    "isAos",
    "invoice",
    "scadAos",
    "etichettaCd",
    "etiReader",
    "dataProt",
    "dmDatiEnte",
    "dmProfilePratiche",
    "dmElencoPratiche",
    "dmAllegatiDoc",
    "dmProcessDoc",
    "dmDatiProfilo",
    "dmAssociazioni",
    "dmFileInFolder",
    "dmDocOpen",
    "dmTesto",
    "dmNote",
    "dmMovimentiListe",
    "dmDocAllegati",
    "periodo",
    "dataDocNrGiorni",
    "creationDateNrGiorni",
    "dmFascicoli",
    "sostitutiva",
    "dmDevDoc",
    "dmBarcode",
    "dmTipoDocumento",
    "dmAutore",
    "dmNpceOut",
    "sdAssocDoc",
    "dmRelazioni",
    "dmRevisioni",
    "dmDatiProfiloFrom",
    "dmDatiProfiloTo",
    "dmDatiProfiloCc",
    "dmEmergenza",
    "dmStampDefinition",
    "dmStampsInstance",
    "dmStampApplied",
    "filesize",
    "collaboration",
    "dmCampiClasseLegami",
    "dmDatiProfiloSenders"
})
public class DmProfileSearch
    extends DmBaseSearch
{

    @XmlElement(name = "DocNumber")
    protected FieldInt docNumber;
    @XmlElement(name = "DocName")
    protected FieldString docName;
    @XmlElement(name = "DocumentType")
    protected FieldInt documentType;
    @XmlElement(name = "Tipo2")
    protected FieldInt tipo2;
    @XmlElement(name = "Tipo3")
    protected FieldInt tipo3;
    @XmlElement(name = "Path")
    protected FieldString path;
    @XmlElement(name = "FileName")
    protected FieldString fileName;
    @XmlElement(name = "Numero")
    protected FieldString numero;
    @XmlElement(name = "DataDoc")
    protected FieldDateTime dataDoc;
    @XmlElement(name = "A")
    protected FieldDaA a;
    @XmlElement(name = "CC")
    protected FieldString cc;
    @XmlElement(name = "SENDERS")
    protected FieldString senders;
    @XmlElement(name = "Profilato")
    protected FieldString profilato;
    @XmlElement(name = "Creation_Date")
    protected FieldDateTime creationDate;
    @XmlElement(name = "Importante")
    protected FieldString importante;
    @XmlElement(name = "Revisione")
    protected FieldInt revisione;
    @XmlElement(name = "Autore")
    protected FieldInt autore;
    @XmlElement(name = "Note")
    protected FieldString note;
    @XmlElement(name = "Protocollo")
    protected FieldString protocollo;
    @XmlElement(name = "Anno")
    protected FieldString anno;
    @XmlElement(name = "Bloccato")
    protected FieldString bloccato;
    @XmlElement(name = "Stato")
    protected FieldString stato;
    @XmlElement(name = "InOut")
    protected FieldInt inOut;
    @XmlElement(name = "Scadenza")
    protected FieldDateTime scadenza;
    @XmlElement(name = "Flag")
    protected FieldString flag;
    @XmlElement(name = "WorkFlow")
    protected FieldInt workFlow;
    @XmlElement(name = "Originale")
    protected FieldString originale;
    @XmlElement(name = "DataFile")
    protected FieldDateTime dataFile;
    @XmlElement(name = "GestRev")
    protected FieldInt gestRev;
    @XmlElement(name = "Device")
    protected FieldString device;
    @XmlElement(name = "Allegati")
    protected FieldString allegati;
    @XmlElement(name = "OpenDoc")
    protected FieldInt openDoc;
    @XmlElement(name = "Associazioni")
    protected FieldString associazioni;
    @XmlElement(name = "Impronta")
    protected FieldString impronta;
    @XmlElement(name = "Emergenza")
    protected FieldInt emergenza;
    @XmlElement(name = "Aoo")
    protected FieldString aoo;
    @XmlElement(name = "WebVisible")
    protected FieldInt webVisible;
    @XmlElement(name = "IsAos")
    protected FieldInt isAos;
    @XmlElement(name = "Invoice")
    protected FieldInt invoice;
    @XmlElement(name = "ScadAos")
    protected FieldDateTime scadAos;
    @XmlElement(name = "EtichettaCd")
    protected FieldString etichettaCd;
    @XmlElement(name = "Eti_Reader")
    protected FieldString etiReader;
    @XmlElement(name = "DataProt")
    protected FieldDateTime dataProt;
    @XmlElement(name = "Dm_Dati_Ente")
    protected JoinDmDatiEnte dmDatiEnte;
    @XmlElement(name = "Dm_Profile_Pratiche")
    protected JoinDmProfilePratica dmProfilePratiche;
    @XmlElement(name = "Dm_ElencoPratiche")
    protected JoinDmElencoPratiche dmElencoPratiche;
    @XmlElement(name = "Dm_Allegati_Doc")
    protected JoinDmAllegatiDoc dmAllegatiDoc;
    @XmlElement(name = "Dm_ProcessDoc")
    protected JoinDmProcessDoc dmProcessDoc;
    @XmlElement(name = "Dm_DatiProfilo")
    protected JoinDmDatiProfilo dmDatiProfilo;
    @XmlElement(name = "Dm_Associazioni")
    protected JoinDmAssociazioni dmAssociazioni;
    @XmlElement(name = "Dm_FileInFolder")
    protected JoinDmFileInFolder dmFileInFolder;
    @XmlElement(name = "Dm_DocOpen")
    protected JoinDmDocOpen dmDocOpen;
    @XmlElement(name = "Dm_Testo")
    protected JoinDmTesto dmTesto;
    @XmlElement(name = "Dm_Note")
    protected JoinDmNote dmNote;
    @XmlElement(name = "Dm_Movimenti_Liste")
    protected JoinDmMovimentiListe dmMovimentiListe;
    @XmlElement(name = "Dm_DocAllegati")
    protected JoinDmDocAllegati dmDocAllegati;
    @XmlElement(name = "Periodo")
    protected FieldStringPeriodo periodo;
    @XmlElement(name = "DataDoc_NrGiorni")
    protected FieldNrGiorni dataDocNrGiorni;
    @XmlElement(name = "Creation_Date_NrGiorni")
    protected FieldNrGiorni creationDateNrGiorni;
    @XmlElement(name = "Dm_Fascicoli")
    protected JoinDmFascicoli dmFascicoli;
    @XmlElement(name = "Sostitutiva")
    protected DmProfileSearchSostitutiva sostitutiva;
    @XmlElement(name = "Dm_DevDoc")
    protected JoinDmDevDoc dmDevDoc;
    @XmlElement(name = "Dm_Barcode")
    protected JoinDmBarcode dmBarcode;
    @XmlElement(name = "Dm_TipoDocumento")
    protected JoinDmTipoDocumento dmTipoDocumento;
    @XmlElement(name = "Dm_Autore")
    protected JoinDmAutore dmAutore;
    @XmlElement(name = "Dm_Npce_Out")
    protected JoinDmNpceOut dmNpceOut;
    @XmlElement(name = "Sd_AssocDoc")
    protected JoinSdAssocdoc sdAssocDoc;
    @XmlElement(name = "Dm_Relazioni")
    protected JoinDmRelazioni dmRelazioni;
    @XmlElement(name = "Dm_Revisioni")
    protected JoinDmRevisioni dmRevisioni;
    @XmlElement(name = "Dm_DatiProfilo_From")
    protected JoinDmDatiProfiloFrom dmDatiProfiloFrom;
    @XmlElement(name = "Dm_DatiProfilo_To")
    protected JoinDmDatiProfiloTo dmDatiProfiloTo;
    @XmlElement(name = "Dm_DatiProfilo_Cc")
    protected JoinDmDatiProfiloCc dmDatiProfiloCc;
    @XmlElement(name = "Dm_Emergenza")
    protected JoinDmEmergenza dmEmergenza;
    @XmlElement(name = "Dm_StampDefinition")
    protected JoinDmStampDefinition dmStampDefinition;
    @XmlElement(name = "Dm_StampsInstance")
    protected JoinDmStampsInstance dmStampsInstance;
    @XmlElement(name = "Dm_StampApplied")
    protected JoinDmStampApplied dmStampApplied;
    @XmlElement(name = "FILESIZE")
    protected FieldInt filesize;
    @XmlElement(name = "Collaboration")
    protected FieldInt collaboration;
    @XmlElement(name = "Dm_CampiClasseLegami")
    protected JoinDmCampiClasseLegami dmCampiClasseLegami;
    @XmlElement(name = "Dm_DatiProfilo_Senders")
    protected JoinDmDatiProfiloSenders dmDatiProfiloSenders;

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDocNumber(FieldInt value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDocName(FieldString value) {
        this.docName = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDocumentType(FieldInt value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTipo2() {
        return tipo2;
    }

    /**
     * Sets the value of the tipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTipo2(FieldInt value) {
        this.tipo2 = value;
    }

    /**
     * Gets the value of the tipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTipo3() {
        return tipo3;
    }

    /**
     * Sets the value of the tipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTipo3(FieldInt value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPath(FieldString value) {
        this.path = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFileName(FieldString value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNumero(FieldString value) {
        this.numero = value;
    }

    /**
     * Gets the value of the dataDoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataDoc() {
        return dataDoc;
    }

    /**
     * Sets the value of the dataDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataDoc(FieldDateTime value) {
        this.dataDoc = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDaA }
     *     
     */
    public FieldDaA getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDaA }
     *     
     */
    public void setA(FieldDaA value) {
        this.a = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCC() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCC(FieldString value) {
        this.cc = value;
    }

    /**
     * Gets the value of the senders property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSENDERS() {
        return senders;
    }

    /**
     * Sets the value of the senders property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSENDERS(FieldString value) {
        this.senders = value;
    }

    /**
     * Gets the value of the profilato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProfilato() {
        return profilato;
    }

    /**
     * Sets the value of the profilato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProfilato(FieldString value) {
        this.profilato = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setCreationDate(FieldDateTime value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the importante property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getImportante() {
        return importante;
    }

    /**
     * Sets the value of the importante property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setImportante(FieldString value) {
        this.importante = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRevisione() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRevisione(FieldInt value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the autore property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAutore() {
        return autore;
    }

    /**
     * Sets the value of the autore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAutore(FieldInt value) {
        this.autore = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNote(FieldString value) {
        this.note = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProtocollo() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProtocollo(FieldString value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAnno(FieldString value) {
        this.anno = value;
    }

    /**
     * Gets the value of the bloccato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getBloccato() {
        return bloccato;
    }

    /**
     * Sets the value of the bloccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setBloccato(FieldString value) {
        this.bloccato = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setStato(FieldString value) {
        this.stato = value;
    }

    /**
     * Gets the value of the inOut property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getInOut() {
        return inOut;
    }

    /**
     * Sets the value of the inOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setInOut(FieldInt value) {
        this.inOut = value;
    }

    /**
     * Gets the value of the scadenza property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getScadenza() {
        return scadenza;
    }

    /**
     * Sets the value of the scadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setScadenza(FieldDateTime value) {
        this.scadenza = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFlag(FieldString value) {
        this.flag = value;
    }

    /**
     * Gets the value of the workFlow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWorkFlow() {
        return workFlow;
    }

    /**
     * Sets the value of the workFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWorkFlow(FieldInt value) {
        this.workFlow = value;
    }

    /**
     * Gets the value of the originale property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOriginale() {
        return originale;
    }

    /**
     * Sets the value of the originale property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOriginale(FieldString value) {
        this.originale = value;
    }

    /**
     * Gets the value of the dataFile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataFile() {
        return dataFile;
    }

    /**
     * Sets the value of the dataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataFile(FieldDateTime value) {
        this.dataFile = value;
    }

    /**
     * Gets the value of the gestRev property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getGestRev() {
        return gestRev;
    }

    /**
     * Sets the value of the gestRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setGestRev(FieldInt value) {
        this.gestRev = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDevice(FieldString value) {
        this.device = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAllegati(FieldString value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the openDoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getOpenDoc() {
        return openDoc;
    }

    /**
     * Sets the value of the openDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setOpenDoc(FieldInt value) {
        this.openDoc = value;
    }

    /**
     * Gets the value of the associazioni property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAssociazioni() {
        return associazioni;
    }

    /**
     * Sets the value of the associazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAssociazioni(FieldString value) {
        this.associazioni = value;
    }

    /**
     * Gets the value of the impronta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getImpronta() {
        return impronta;
    }

    /**
     * Sets the value of the impronta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setImpronta(FieldString value) {
        this.impronta = value;
    }

    /**
     * Gets the value of the emergenza property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getEmergenza() {
        return emergenza;
    }

    /**
     * Sets the value of the emergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setEmergenza(FieldInt value) {
        this.emergenza = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAoo() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAoo(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the webVisible property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWebVisible() {
        return webVisible;
    }

    /**
     * Sets the value of the webVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWebVisible(FieldInt value) {
        this.webVisible = value;
    }

    /**
     * Gets the value of the isAos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIsAos() {
        return isAos;
    }

    /**
     * Sets the value of the isAos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIsAos(FieldInt value) {
        this.isAos = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setInvoice(FieldInt value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the scadAos property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getScadAos() {
        return scadAos;
    }

    /**
     * Sets the value of the scadAos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setScadAos(FieldDateTime value) {
        this.scadAos = value;
    }

    /**
     * Gets the value of the etichettaCd property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEtichettaCd() {
        return etichettaCd;
    }

    /**
     * Sets the value of the etichettaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEtichettaCd(FieldString value) {
        this.etichettaCd = value;
    }

    /**
     * Gets the value of the etiReader property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEtiReader() {
        return etiReader;
    }

    /**
     * Sets the value of the etiReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEtiReader(FieldString value) {
        this.etiReader = value;
    }

    /**
     * Gets the value of the dataProt property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataProt() {
        return dataProt;
    }

    /**
     * Sets the value of the dataProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataProt(FieldDateTime value) {
        this.dataProt = value;
    }

    /**
     * Gets the value of the dmDatiEnte property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDatiEnte }
     *     
     */
    public JoinDmDatiEnte getDmDatiEnte() {
        return dmDatiEnte;
    }

    /**
     * Sets the value of the dmDatiEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDatiEnte }
     *     
     */
    public void setDmDatiEnte(JoinDmDatiEnte value) {
        this.dmDatiEnte = value;
    }

    /**
     * Gets the value of the dmProfilePratiche property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProfilePratica }
     *     
     */
    public JoinDmProfilePratica getDmProfilePratiche() {
        return dmProfilePratiche;
    }

    /**
     * Sets the value of the dmProfilePratiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProfilePratica }
     *     
     */
    public void setDmProfilePratiche(JoinDmProfilePratica value) {
        this.dmProfilePratiche = value;
    }

    /**
     * Gets the value of the dmElencoPratiche property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmElencoPratiche }
     *     
     */
    public JoinDmElencoPratiche getDmElencoPratiche() {
        return dmElencoPratiche;
    }

    /**
     * Sets the value of the dmElencoPratiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmElencoPratiche }
     *     
     */
    public void setDmElencoPratiche(JoinDmElencoPratiche value) {
        this.dmElencoPratiche = value;
    }

    /**
     * Gets the value of the dmAllegatiDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmAllegatiDoc }
     *     
     */
    public JoinDmAllegatiDoc getDmAllegatiDoc() {
        return dmAllegatiDoc;
    }

    /**
     * Sets the value of the dmAllegatiDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmAllegatiDoc }
     *     
     */
    public void setDmAllegatiDoc(JoinDmAllegatiDoc value) {
        this.dmAllegatiDoc = value;
    }

    /**
     * Gets the value of the dmProcessDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmProcessDoc }
     *     
     */
    public JoinDmProcessDoc getDmProcessDoc() {
        return dmProcessDoc;
    }

    /**
     * Sets the value of the dmProcessDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmProcessDoc }
     *     
     */
    public void setDmProcessDoc(JoinDmProcessDoc value) {
        this.dmProcessDoc = value;
    }

    /**
     * Gets the value of the dmDatiProfilo property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDatiProfilo }
     *     
     */
    public JoinDmDatiProfilo getDmDatiProfilo() {
        return dmDatiProfilo;
    }

    /**
     * Sets the value of the dmDatiProfilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDatiProfilo }
     *     
     */
    public void setDmDatiProfilo(JoinDmDatiProfilo value) {
        this.dmDatiProfilo = value;
    }

    /**
     * Gets the value of the dmAssociazioni property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmAssociazioni }
     *     
     */
    public JoinDmAssociazioni getDmAssociazioni() {
        return dmAssociazioni;
    }

    /**
     * Sets the value of the dmAssociazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmAssociazioni }
     *     
     */
    public void setDmAssociazioni(JoinDmAssociazioni value) {
        this.dmAssociazioni = value;
    }

    /**
     * Gets the value of the dmFileInFolder property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmFileInFolder }
     *     
     */
    public JoinDmFileInFolder getDmFileInFolder() {
        return dmFileInFolder;
    }

    /**
     * Sets the value of the dmFileInFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmFileInFolder }
     *     
     */
    public void setDmFileInFolder(JoinDmFileInFolder value) {
        this.dmFileInFolder = value;
    }

    /**
     * Gets the value of the dmDocOpen property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDocOpen }
     *     
     */
    public JoinDmDocOpen getDmDocOpen() {
        return dmDocOpen;
    }

    /**
     * Sets the value of the dmDocOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDocOpen }
     *     
     */
    public void setDmDocOpen(JoinDmDocOpen value) {
        this.dmDocOpen = value;
    }

    /**
     * Gets the value of the dmTesto property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTesto }
     *     
     */
    public JoinDmTesto getDmTesto() {
        return dmTesto;
    }

    /**
     * Sets the value of the dmTesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTesto }
     *     
     */
    public void setDmTesto(JoinDmTesto value) {
        this.dmTesto = value;
    }

    /**
     * Gets the value of the dmNote property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmNote }
     *     
     */
    public JoinDmNote getDmNote() {
        return dmNote;
    }

    /**
     * Sets the value of the dmNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmNote }
     *     
     */
    public void setDmNote(JoinDmNote value) {
        this.dmNote = value;
    }

    /**
     * Gets the value of the dmMovimentiListe property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmMovimentiListe }
     *     
     */
    public JoinDmMovimentiListe getDmMovimentiListe() {
        return dmMovimentiListe;
    }

    /**
     * Sets the value of the dmMovimentiListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmMovimentiListe }
     *     
     */
    public void setDmMovimentiListe(JoinDmMovimentiListe value) {
        this.dmMovimentiListe = value;
    }

    /**
     * Gets the value of the dmDocAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDocAllegati }
     *     
     */
    public JoinDmDocAllegati getDmDocAllegati() {
        return dmDocAllegati;
    }

    /**
     * Sets the value of the dmDocAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDocAllegati }
     *     
     */
    public void setDmDocAllegati(JoinDmDocAllegati value) {
        this.dmDocAllegati = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringPeriodo }
     *     
     */
    public FieldStringPeriodo getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringPeriodo }
     *     
     */
    public void setPeriodo(FieldStringPeriodo value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the dataDocNrGiorni property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNrGiorni }
     *     
     */
    public FieldNrGiorni getDataDocNrGiorni() {
        return dataDocNrGiorni;
    }

    /**
     * Sets the value of the dataDocNrGiorni property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNrGiorni }
     *     
     */
    public void setDataDocNrGiorni(FieldNrGiorni value) {
        this.dataDocNrGiorni = value;
    }

    /**
     * Gets the value of the creationDateNrGiorni property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNrGiorni }
     *     
     */
    public FieldNrGiorni getCreationDateNrGiorni() {
        return creationDateNrGiorni;
    }

    /**
     * Sets the value of the creationDateNrGiorni property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNrGiorni }
     *     
     */
    public void setCreationDateNrGiorni(FieldNrGiorni value) {
        this.creationDateNrGiorni = value;
    }

    /**
     * Gets the value of the dmFascicoli property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmFascicoli }
     *     
     */
    public JoinDmFascicoli getDmFascicoli() {
        return dmFascicoli;
    }

    /**
     * Sets the value of the dmFascicoli property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmFascicoli }
     *     
     */
    public void setDmFascicoli(JoinDmFascicoli value) {
        this.dmFascicoli = value;
    }

    /**
     * Gets the value of the sostitutiva property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileSearchSostitutiva }
     *     
     */
    public DmProfileSearchSostitutiva getSostitutiva() {
        return sostitutiva;
    }

    /**
     * Sets the value of the sostitutiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileSearchSostitutiva }
     *     
     */
    public void setSostitutiva(DmProfileSearchSostitutiva value) {
        this.sostitutiva = value;
    }

    /**
     * Gets the value of the dmDevDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDevDoc }
     *     
     */
    public JoinDmDevDoc getDmDevDoc() {
        return dmDevDoc;
    }

    /**
     * Sets the value of the dmDevDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDevDoc }
     *     
     */
    public void setDmDevDoc(JoinDmDevDoc value) {
        this.dmDevDoc = value;
    }

    /**
     * Gets the value of the dmBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmBarcode }
     *     
     */
    public JoinDmBarcode getDmBarcode() {
        return dmBarcode;
    }

    /**
     * Sets the value of the dmBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmBarcode }
     *     
     */
    public void setDmBarcode(JoinDmBarcode value) {
        this.dmBarcode = value;
    }

    /**
     * Gets the value of the dmTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTipoDocumento }
     *     
     */
    public JoinDmTipoDocumento getDmTipoDocumento() {
        return dmTipoDocumento;
    }

    /**
     * Sets the value of the dmTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTipoDocumento }
     *     
     */
    public void setDmTipoDocumento(JoinDmTipoDocumento value) {
        this.dmTipoDocumento = value;
    }

    /**
     * Gets the value of the dmAutore property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmAutore }
     *     
     */
    public JoinDmAutore getDmAutore() {
        return dmAutore;
    }

    /**
     * Sets the value of the dmAutore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmAutore }
     *     
     */
    public void setDmAutore(JoinDmAutore value) {
        this.dmAutore = value;
    }

    /**
     * Gets the value of the dmNpceOut property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmNpceOut }
     *     
     */
    public JoinDmNpceOut getDmNpceOut() {
        return dmNpceOut;
    }

    /**
     * Sets the value of the dmNpceOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmNpceOut }
     *     
     */
    public void setDmNpceOut(JoinDmNpceOut value) {
        this.dmNpceOut = value;
    }

    /**
     * Gets the value of the sdAssocDoc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinSdAssocdoc }
     *     
     */
    public JoinSdAssocdoc getSdAssocDoc() {
        return sdAssocDoc;
    }

    /**
     * Sets the value of the sdAssocDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinSdAssocdoc }
     *     
     */
    public void setSdAssocDoc(JoinSdAssocdoc value) {
        this.sdAssocDoc = value;
    }

    /**
     * Gets the value of the dmRelazioni property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmRelazioni }
     *     
     */
    public JoinDmRelazioni getDmRelazioni() {
        return dmRelazioni;
    }

    /**
     * Sets the value of the dmRelazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmRelazioni }
     *     
     */
    public void setDmRelazioni(JoinDmRelazioni value) {
        this.dmRelazioni = value;
    }

    /**
     * Gets the value of the dmRevisioni property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmRevisioni }
     *     
     */
    public JoinDmRevisioni getDmRevisioni() {
        return dmRevisioni;
    }

    /**
     * Sets the value of the dmRevisioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmRevisioni }
     *     
     */
    public void setDmRevisioni(JoinDmRevisioni value) {
        this.dmRevisioni = value;
    }

    /**
     * Gets the value of the dmDatiProfiloFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDatiProfiloFrom }
     *     
     */
    public JoinDmDatiProfiloFrom getDmDatiProfiloFrom() {
        return dmDatiProfiloFrom;
    }

    /**
     * Sets the value of the dmDatiProfiloFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDatiProfiloFrom }
     *     
     */
    public void setDmDatiProfiloFrom(JoinDmDatiProfiloFrom value) {
        this.dmDatiProfiloFrom = value;
    }

    /**
     * Gets the value of the dmDatiProfiloTo property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDatiProfiloTo }
     *     
     */
    public JoinDmDatiProfiloTo getDmDatiProfiloTo() {
        return dmDatiProfiloTo;
    }

    /**
     * Sets the value of the dmDatiProfiloTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDatiProfiloTo }
     *     
     */
    public void setDmDatiProfiloTo(JoinDmDatiProfiloTo value) {
        this.dmDatiProfiloTo = value;
    }

    /**
     * Gets the value of the dmDatiProfiloCc property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDatiProfiloCc }
     *     
     */
    public JoinDmDatiProfiloCc getDmDatiProfiloCc() {
        return dmDatiProfiloCc;
    }

    /**
     * Sets the value of the dmDatiProfiloCc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDatiProfiloCc }
     *     
     */
    public void setDmDatiProfiloCc(JoinDmDatiProfiloCc value) {
        this.dmDatiProfiloCc = value;
    }

    /**
     * Gets the value of the dmEmergenza property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmEmergenza }
     *     
     */
    public JoinDmEmergenza getDmEmergenza() {
        return dmEmergenza;
    }

    /**
     * Sets the value of the dmEmergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmEmergenza }
     *     
     */
    public void setDmEmergenza(JoinDmEmergenza value) {
        this.dmEmergenza = value;
    }

    /**
     * Gets the value of the dmStampDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmStampDefinition }
     *     
     */
    public JoinDmStampDefinition getDmStampDefinition() {
        return dmStampDefinition;
    }

    /**
     * Sets the value of the dmStampDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmStampDefinition }
     *     
     */
    public void setDmStampDefinition(JoinDmStampDefinition value) {
        this.dmStampDefinition = value;
    }

    /**
     * Gets the value of the dmStampsInstance property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmStampsInstance }
     *     
     */
    public JoinDmStampsInstance getDmStampsInstance() {
        return dmStampsInstance;
    }

    /**
     * Sets the value of the dmStampsInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmStampsInstance }
     *     
     */
    public void setDmStampsInstance(JoinDmStampsInstance value) {
        this.dmStampsInstance = value;
    }

    /**
     * Gets the value of the dmStampApplied property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmStampApplied }
     *     
     */
    public JoinDmStampApplied getDmStampApplied() {
        return dmStampApplied;
    }

    /**
     * Sets the value of the dmStampApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmStampApplied }
     *     
     */
    public void setDmStampApplied(JoinDmStampApplied value) {
        this.dmStampApplied = value;
    }

    /**
     * Gets the value of the filesize property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFILESIZE() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFILESIZE(FieldInt value) {
        this.filesize = value;
    }

    /**
     * Gets the value of the collaboration property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCollaboration() {
        return collaboration;
    }

    /**
     * Sets the value of the collaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCollaboration(FieldInt value) {
        this.collaboration = value;
    }

    /**
     * Gets the value of the dmCampiClasseLegami property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmCampiClasseLegami }
     *     
     */
    public JoinDmCampiClasseLegami getDmCampiClasseLegami() {
        return dmCampiClasseLegami;
    }

    /**
     * Sets the value of the dmCampiClasseLegami property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmCampiClasseLegami }
     *     
     */
    public void setDmCampiClasseLegami(JoinDmCampiClasseLegami value) {
        this.dmCampiClasseLegami = value;
    }

    /**
     * Gets the value of the dmDatiProfiloSenders property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmDatiProfiloSenders }
     *     
     */
    public JoinDmDatiProfiloSenders getDmDatiProfiloSenders() {
        return dmDatiProfiloSenders;
    }

    /**
     * Sets the value of the dmDatiProfiloSenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmDatiProfiloSenders }
     *     
     */
    public void setDmDatiProfiloSenders(JoinDmDatiProfiloSenders value) {
        this.dmDatiProfiloSenders = value;
    }

}
