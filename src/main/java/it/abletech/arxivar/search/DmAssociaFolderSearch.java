
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_AssociaFolder_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_AssociaFolder_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOCNAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TIPODOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO2" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TIPO3" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ORIGINE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SCADENZA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATAREGOLA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="INVIAXFAX" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INVIAXMAIL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INSERTFOLDER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INSERTASS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="IMPORTANTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="BARCODEATTACH" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STARTFLOW" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="COPIEBARCODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ALLEGATASK" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INSERTRELA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PROT_RICEVUTA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PROT_SETUPSCANNER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="WEBVISIBLE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_Utenti" type="{http://www.Abletech.it/Arxivar}Join_Dm_Utenti" minOccurs="0"/>
 *         &lt;element name="Dm_AssociaFolder_DatiProfilo" type="{http://www.Abletech.it/Arxivar}Join_Dm_AssociaFolder_DatiProfilo" minOccurs="0"/>
 *         &lt;element name="Dm_TipiDocumento" type="{http://www.Abletech.it/Arxivar}Join_Dm_TipiDocumento" minOccurs="0"/>
 *         &lt;element name="Dm_Permessi_Profili" type="{http://www.Abletech.it/Arxivar}Join_Dm_Permessi_Profili" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_AssociaFolder_Search", propOrder = {
    "id",
    "docname",
    "tipodoc",
    "utente",
    "tipo2",
    "tipo3",
    "origine",
    "scadenza",
    "dataregola",
    "stato",
    "descrizione",
    "numero",
    "aoo",
    "inviaxfax",
    "inviaxmail",
    "insertfolder",
    "insertass",
    "importante",
    "barcodeattach",
    "startflow",
    "copiebarcode",
    "allegatask",
    "insertrela",
    "protricevuta",
    "protsetupscanner",
    "webvisible",
    "dmUtenti",
    "dmAssociaFolderDatiProfilo",
    "dmTipiDocumento",
    "dmPermessiProfili"
})
public class DmAssociaFolderSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "DOCNAME")
    protected FieldString docname;
    @XmlElement(name = "TIPODOC")
    protected FieldInt tipodoc;
    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "TIPO2")
    protected FieldInt tipo2;
    @XmlElement(name = "TIPO3")
    protected FieldInt tipo3;
    @XmlElement(name = "ORIGINE")
    protected FieldInt origine;
    @XmlElement(name = "SCADENZA")
    protected FieldDateTime scadenza;
    @XmlElement(name = "DATAREGOLA")
    protected FieldDateTime dataregola;
    @XmlElement(name = "STATO")
    protected FieldString stato;
    @XmlElement(name = "DESCRIZIONE")
    protected FieldString descrizione;
    @XmlElement(name = "NUMERO")
    protected FieldString numero;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "INVIAXFAX")
    protected FieldInt inviaxfax;
    @XmlElement(name = "INVIAXMAIL")
    protected FieldInt inviaxmail;
    @XmlElement(name = "INSERTFOLDER")
    protected FieldInt insertfolder;
    @XmlElement(name = "INSERTASS")
    protected FieldInt insertass;
    @XmlElement(name = "IMPORTANTE")
    protected FieldInt importante;
    @XmlElement(name = "BARCODEATTACH")
    protected FieldInt barcodeattach;
    @XmlElement(name = "STARTFLOW")
    protected FieldInt startflow;
    @XmlElement(name = "COPIEBARCODE")
    protected FieldInt copiebarcode;
    @XmlElement(name = "ALLEGATASK")
    protected FieldInt allegatask;
    @XmlElement(name = "INSERTRELA")
    protected FieldInt insertrela;
    @XmlElement(name = "PROT_RICEVUTA")
    protected FieldInt protricevuta;
    @XmlElement(name = "PROT_SETUPSCANNER")
    protected FieldInt protsetupscanner;
    @XmlElement(name = "WEBVISIBLE")
    protected FieldInt webvisible;
    @XmlElement(name = "Dm_Utenti")
    protected JoinDmUtenti dmUtenti;
    @XmlElement(name = "Dm_AssociaFolder_DatiProfilo")
    protected JoinDmAssociaFolderDatiProfilo dmAssociaFolderDatiProfilo;
    @XmlElement(name = "Dm_TipiDocumento")
    protected JoinDmTipiDocumento dmTipiDocumento;
    @XmlElement(name = "Dm_Permessi_Profili")
    protected JoinDmPermessiProfili dmPermessiProfili;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setID(FieldInt value) {
        this.id = value;
    }

    /**
     * Gets the value of the docname property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDOCNAME() {
        return docname;
    }

    /**
     * Sets the value of the docname property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDOCNAME(FieldString value) {
        this.docname = value;
    }

    /**
     * Gets the value of the tipodoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPODOC() {
        return tipodoc;
    }

    /**
     * Sets the value of the tipodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTIPODOC(FieldInt value) {
        this.tipodoc = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTE(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the tipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTIPO2() {
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
    public void setTIPO2(FieldInt value) {
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
    public FieldInt getTIPO3() {
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
    public void setTIPO3(FieldInt value) {
        this.tipo3 = value;
    }

    /**
     * Gets the value of the origine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getORIGINE() {
        return origine;
    }

    /**
     * Sets the value of the origine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setORIGINE(FieldInt value) {
        this.origine = value;
    }

    /**
     * Gets the value of the scadenza property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getSCADENZA() {
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
    public void setSCADENZA(FieldDateTime value) {
        this.scadenza = value;
    }

    /**
     * Gets the value of the dataregola property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAREGOLA() {
        return dataregola;
    }

    /**
     * Sets the value of the dataregola property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAREGOLA(FieldDateTime value) {
        this.dataregola = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATO() {
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
    public void setSTATO(FieldString value) {
        this.stato = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESCRIZIONE() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESCRIZIONE(FieldString value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNUMERO() {
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
    public void setNUMERO(FieldString value) {
        this.numero = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOO() {
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
    public void setAOO(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the inviaxfax property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINVIAXFAX() {
        return inviaxfax;
    }

    /**
     * Sets the value of the inviaxfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINVIAXFAX(FieldInt value) {
        this.inviaxfax = value;
    }

    /**
     * Gets the value of the inviaxmail property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINVIAXMAIL() {
        return inviaxmail;
    }

    /**
     * Sets the value of the inviaxmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINVIAXMAIL(FieldInt value) {
        this.inviaxmail = value;
    }

    /**
     * Gets the value of the insertfolder property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINSERTFOLDER() {
        return insertfolder;
    }

    /**
     * Sets the value of the insertfolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINSERTFOLDER(FieldInt value) {
        this.insertfolder = value;
    }

    /**
     * Gets the value of the insertass property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINSERTASS() {
        return insertass;
    }

    /**
     * Sets the value of the insertass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINSERTASS(FieldInt value) {
        this.insertass = value;
    }

    /**
     * Gets the value of the importante property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIMPORTANTE() {
        return importante;
    }

    /**
     * Sets the value of the importante property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIMPORTANTE(FieldInt value) {
        this.importante = value;
    }

    /**
     * Gets the value of the barcodeattach property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getBARCODEATTACH() {
        return barcodeattach;
    }

    /**
     * Sets the value of the barcodeattach property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setBARCODEATTACH(FieldInt value) {
        this.barcodeattach = value;
    }

    /**
     * Gets the value of the startflow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSTARTFLOW() {
        return startflow;
    }

    /**
     * Sets the value of the startflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSTARTFLOW(FieldInt value) {
        this.startflow = value;
    }

    /**
     * Gets the value of the copiebarcode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCOPIEBARCODE() {
        return copiebarcode;
    }

    /**
     * Sets the value of the copiebarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCOPIEBARCODE(FieldInt value) {
        this.copiebarcode = value;
    }

    /**
     * Gets the value of the allegatask property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getALLEGATASK() {
        return allegatask;
    }

    /**
     * Sets the value of the allegatask property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setALLEGATASK(FieldInt value) {
        this.allegatask = value;
    }

    /**
     * Gets the value of the insertrela property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINSERTRELA() {
        return insertrela;
    }

    /**
     * Sets the value of the insertrela property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINSERTRELA(FieldInt value) {
        this.insertrela = value;
    }

    /**
     * Gets the value of the protricevuta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPROTRICEVUTA() {
        return protricevuta;
    }

    /**
     * Sets the value of the protricevuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPROTRICEVUTA(FieldInt value) {
        this.protricevuta = value;
    }

    /**
     * Gets the value of the protsetupscanner property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPROTSETUPSCANNER() {
        return protsetupscanner;
    }

    /**
     * Sets the value of the protsetupscanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPROTSETUPSCANNER(FieldInt value) {
        this.protsetupscanner = value;
    }

    /**
     * Gets the value of the webvisible property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getWEBVISIBLE() {
        return webvisible;
    }

    /**
     * Sets the value of the webvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setWEBVISIBLE(FieldInt value) {
        this.webvisible = value;
    }

    /**
     * Gets the value of the dmUtenti property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmUtenti }
     *     
     */
    public JoinDmUtenti getDmUtenti() {
        return dmUtenti;
    }

    /**
     * Sets the value of the dmUtenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmUtenti }
     *     
     */
    public void setDmUtenti(JoinDmUtenti value) {
        this.dmUtenti = value;
    }

    /**
     * Gets the value of the dmAssociaFolderDatiProfilo property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmAssociaFolderDatiProfilo }
     *     
     */
    public JoinDmAssociaFolderDatiProfilo getDmAssociaFolderDatiProfilo() {
        return dmAssociaFolderDatiProfilo;
    }

    /**
     * Sets the value of the dmAssociaFolderDatiProfilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmAssociaFolderDatiProfilo }
     *     
     */
    public void setDmAssociaFolderDatiProfilo(JoinDmAssociaFolderDatiProfilo value) {
        this.dmAssociaFolderDatiProfilo = value;
    }

    /**
     * Gets the value of the dmTipiDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmTipiDocumento }
     *     
     */
    public JoinDmTipiDocumento getDmTipiDocumento() {
        return dmTipiDocumento;
    }

    /**
     * Sets the value of the dmTipiDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmTipiDocumento }
     *     
     */
    public void setDmTipiDocumento(JoinDmTipiDocumento value) {
        this.dmTipiDocumento = value;
    }

    /**
     * Gets the value of the dmPermessiProfili property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmPermessiProfili }
     *     
     */
    public JoinDmPermessiProfili getDmPermessiProfili() {
        return dmPermessiProfili;
    }

    /**
     * Sets the value of the dmPermessiProfili property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmPermessiProfili }
     *     
     */
    public void setDmPermessiProfili(JoinDmPermessiProfili value) {
        this.dmPermessiProfili = value;
    }

}
