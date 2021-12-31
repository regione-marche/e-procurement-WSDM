
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Campispecifici_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Campispecifici_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="DMTIPIDOCUMENTOSYSTEMID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DMMASKIDFORINSERT" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DMMASKIDFORVIEW" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DELETERULE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SHOWESPANCE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="INHERITGRANTPARENT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SINGLEELEMENT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FORMULA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOMECAMPO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TIPODOC" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PIXEL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CARATTERI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DECIMALI" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="POSIZIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="COMBOGRUPPI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="AUTOCOMCAR" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TABORIGINE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CAMPOCODICE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CAMPODESCRIZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="SDKALIASNAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="IDGRP" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ETICHETTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="OBBLIGATORIO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AUTOINS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="FLAG_TRANS" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="BLOCCATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="LIMITTOLIST" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AUTOCOM" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CLASSE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AUTOCOMALL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DmLinguaCampi" type="{http://www.Abletech.it/Arxivar}Join_Dm_LinguaCampi" minOccurs="0"/>
 *         &lt;element name="DmCampiSpecGrp" type="{http://www.Abletech.it/Arxivar}Join_Dm_CampiSpecGrp" minOccurs="0"/>
 *         &lt;element name="REFERENCEID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="SHOWROWCOUNT" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Campispecifici_Search", propOrder = {
    "dmtipidocumentosystemid",
    "dmmaskidforinsert",
    "dmmaskidforview",
    "deleterule",
    "showespance",
    "inheritgrantparent",
    "singleelement",
    "formula",
    "nomecampo",
    "tipodoc",
    "pixel",
    "caratteri",
    "decimali",
    "posizione",
    "combogruppi",
    "autocomcar",
    "taborigine",
    "campocodice",
    "campodescrizione",
    "sdkaliasname",
    "idgrp",
    "etichetta",
    "obbligatorio",
    "autoins",
    "flagtrans",
    "bloccato",
    "limittolist",
    "autocom",
    "classe",
    "stato",
    "autocomall",
    "dmLinguaCampi",
    "dmCampiSpecGrp",
    "referenceid",
    "showrowcount"
})
public class DmCampispecificiSearch
    extends DmBaseSearch
{

    @XmlElement(name = "DMTIPIDOCUMENTOSYSTEMID")
    protected FieldInt dmtipidocumentosystemid;
    @XmlElement(name = "DMMASKIDFORINSERT")
    protected FieldString dmmaskidforinsert;
    @XmlElement(name = "DMMASKIDFORVIEW")
    protected FieldString dmmaskidforview;
    @XmlElement(name = "DELETERULE")
    protected FieldInt deleterule;
    @XmlElement(name = "SHOWESPANCE")
    protected FieldInt showespance;
    @XmlElement(name = "INHERITGRANTPARENT")
    protected FieldInt inheritgrantparent;
    @XmlElement(name = "SINGLEELEMENT")
    protected FieldInt singleelement;
    @XmlElement(name = "FORMULA")
    protected FieldString formula;
    @XmlElement(name = "NOMECAMPO")
    protected FieldString nomecampo;
    @XmlElement(name = "TIPODOC")
    protected FieldInt tipodoc;
    @XmlElement(name = "PIXEL")
    protected FieldInt pixel;
    @XmlElement(name = "CARATTERI")
    protected FieldInt caratteri;
    @XmlElement(name = "DECIMALI")
    protected FieldInt decimali;
    @XmlElement(name = "POSIZIONE")
    protected FieldInt posizione;
    @XmlElement(name = "COMBOGRUPPI")
    protected FieldString combogruppi;
    @XmlElement(name = "AUTOCOMCAR")
    protected FieldString autocomcar;
    @XmlElement(name = "TABORIGINE")
    protected FieldString taborigine;
    @XmlElement(name = "CAMPOCODICE")
    protected FieldString campocodice;
    @XmlElement(name = "CAMPODESCRIZIONE")
    protected FieldString campodescrizione;
    @XmlElement(name = "SDKALIASNAME")
    protected FieldString sdkaliasname;
    @XmlElement(name = "IDGRP")
    protected FieldInt idgrp;
    @XmlElement(name = "ETICHETTA")
    protected FieldString etichetta;
    @XmlElement(name = "OBBLIGATORIO")
    protected FieldInt obbligatorio;
    @XmlElement(name = "AUTOINS")
    protected FieldInt autoins;
    @XmlElement(name = "FLAG_TRANS")
    protected FieldInt flagtrans;
    @XmlElement(name = "BLOCCATO")
    protected FieldInt bloccato;
    @XmlElement(name = "LIMITTOLIST")
    protected FieldInt limittolist;
    @XmlElement(name = "AUTOCOM")
    protected FieldInt autocom;
    @XmlElement(name = "CLASSE")
    protected FieldString classe;
    @XmlElement(name = "STATO")
    protected FieldInt stato;
    @XmlElement(name = "AUTOCOMALL")
    protected FieldInt autocomall;
    @XmlElement(name = "DmLinguaCampi")
    protected JoinDmLinguaCampi dmLinguaCampi;
    @XmlElement(name = "DmCampiSpecGrp")
    protected JoinDmCampiSpecGrp dmCampiSpecGrp;
    @XmlElement(name = "REFERENCEID")
    protected FieldString referenceid;
    @XmlElement(name = "SHOWROWCOUNT")
    protected FieldInt showrowcount;

    /**
     * Gets the value of the dmtipidocumentosystemid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDMTIPIDOCUMENTOSYSTEMID() {
        return dmtipidocumentosystemid;
    }

    /**
     * Sets the value of the dmtipidocumentosystemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDMTIPIDOCUMENTOSYSTEMID(FieldInt value) {
        this.dmtipidocumentosystemid = value;
    }

    /**
     * Gets the value of the dmmaskidforinsert property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMMASKIDFORINSERT() {
        return dmmaskidforinsert;
    }

    /**
     * Sets the value of the dmmaskidforinsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMMASKIDFORINSERT(FieldString value) {
        this.dmmaskidforinsert = value;
    }

    /**
     * Gets the value of the dmmaskidforview property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMMASKIDFORVIEW() {
        return dmmaskidforview;
    }

    /**
     * Sets the value of the dmmaskidforview property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMMASKIDFORVIEW(FieldString value) {
        this.dmmaskidforview = value;
    }

    /**
     * Gets the value of the deleterule property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDELETERULE() {
        return deleterule;
    }

    /**
     * Sets the value of the deleterule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDELETERULE(FieldInt value) {
        this.deleterule = value;
    }

    /**
     * Gets the value of the showespance property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSHOWESPANCE() {
        return showespance;
    }

    /**
     * Sets the value of the showespance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSHOWESPANCE(FieldInt value) {
        this.showespance = value;
    }

    /**
     * Gets the value of the inheritgrantparent property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINHERITGRANTPARENT() {
        return inheritgrantparent;
    }

    /**
     * Sets the value of the inheritgrantparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINHERITGRANTPARENT(FieldInt value) {
        this.inheritgrantparent = value;
    }

    /**
     * Gets the value of the singleelement property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSINGLEELEMENT() {
        return singleelement;
    }

    /**
     * Sets the value of the singleelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSINGLEELEMENT(FieldInt value) {
        this.singleelement = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFORMULA() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFORMULA(FieldString value) {
        this.formula = value;
    }

    /**
     * Gets the value of the nomecampo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOMECAMPO() {
        return nomecampo;
    }

    /**
     * Sets the value of the nomecampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOMECAMPO(FieldString value) {
        this.nomecampo = value;
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
     * Gets the value of the pixel property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPIXEL() {
        return pixel;
    }

    /**
     * Sets the value of the pixel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPIXEL(FieldInt value) {
        this.pixel = value;
    }

    /**
     * Gets the value of the caratteri property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCARATTERI() {
        return caratteri;
    }

    /**
     * Sets the value of the caratteri property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCARATTERI(FieldInt value) {
        this.caratteri = value;
    }

    /**
     * Gets the value of the decimali property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDECIMALI() {
        return decimali;
    }

    /**
     * Sets the value of the decimali property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDECIMALI(FieldInt value) {
        this.decimali = value;
    }

    /**
     * Gets the value of the posizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPOSIZIONE() {
        return posizione;
    }

    /**
     * Sets the value of the posizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPOSIZIONE(FieldInt value) {
        this.posizione = value;
    }

    /**
     * Gets the value of the combogruppi property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCOMBOGRUPPI() {
        return combogruppi;
    }

    /**
     * Sets the value of the combogruppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCOMBOGRUPPI(FieldString value) {
        this.combogruppi = value;
    }

    /**
     * Gets the value of the autocomcar property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAUTOCOMCAR() {
        return autocomcar;
    }

    /**
     * Sets the value of the autocomcar property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAUTOCOMCAR(FieldString value) {
        this.autocomcar = value;
    }

    /**
     * Gets the value of the taborigine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTABORIGINE() {
        return taborigine;
    }

    /**
     * Sets the value of the taborigine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTABORIGINE(FieldString value) {
        this.taborigine = value;
    }

    /**
     * Gets the value of the campocodice property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCAMPOCODICE() {
        return campocodice;
    }

    /**
     * Sets the value of the campocodice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCAMPOCODICE(FieldString value) {
        this.campocodice = value;
    }

    /**
     * Gets the value of the campodescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCAMPODESCRIZIONE() {
        return campodescrizione;
    }

    /**
     * Sets the value of the campodescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCAMPODESCRIZIONE(FieldString value) {
        this.campodescrizione = value;
    }

    /**
     * Gets the value of the sdkaliasname property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSDKALIASNAME() {
        return sdkaliasname;
    }

    /**
     * Sets the value of the sdkaliasname property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSDKALIASNAME(FieldString value) {
        this.sdkaliasname = value;
    }

    /**
     * Gets the value of the idgrp property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getIDGRP() {
        return idgrp;
    }

    /**
     * Sets the value of the idgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setIDGRP(FieldInt value) {
        this.idgrp = value;
    }

    /**
     * Gets the value of the etichetta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getETICHETTA() {
        return etichetta;
    }

    /**
     * Sets the value of the etichetta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setETICHETTA(FieldString value) {
        this.etichetta = value;
    }

    /**
     * Gets the value of the obbligatorio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getOBBLIGATORIO() {
        return obbligatorio;
    }

    /**
     * Sets the value of the obbligatorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setOBBLIGATORIO(FieldInt value) {
        this.obbligatorio = value;
    }

    /**
     * Gets the value of the autoins property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAUTOINS() {
        return autoins;
    }

    /**
     * Sets the value of the autoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAUTOINS(FieldInt value) {
        this.autoins = value;
    }

    /**
     * Gets the value of the flagtrans property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFLAGTRANS() {
        return flagtrans;
    }

    /**
     * Sets the value of the flagtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFLAGTRANS(FieldInt value) {
        this.flagtrans = value;
    }

    /**
     * Gets the value of the bloccato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getBLOCCATO() {
        return bloccato;
    }

    /**
     * Sets the value of the bloccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setBLOCCATO(FieldInt value) {
        this.bloccato = value;
    }

    /**
     * Gets the value of the limittolist property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getLIMITTOLIST() {
        return limittolist;
    }

    /**
     * Sets the value of the limittolist property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setLIMITTOLIST(FieldInt value) {
        this.limittolist = value;
    }

    /**
     * Gets the value of the autocom property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAUTOCOM() {
        return autocom;
    }

    /**
     * Sets the value of the autocom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAUTOCOM(FieldInt value) {
        this.autocom = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCLASSE() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCLASSE(FieldString value) {
        this.classe = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSTATO(FieldInt value) {
        this.stato = value;
    }

    /**
     * Gets the value of the autocomall property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAUTOCOMALL() {
        return autocomall;
    }

    /**
     * Sets the value of the autocomall property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAUTOCOMALL(FieldInt value) {
        this.autocomall = value;
    }

    /**
     * Gets the value of the dmLinguaCampi property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmLinguaCampi }
     *     
     */
    public JoinDmLinguaCampi getDmLinguaCampi() {
        return dmLinguaCampi;
    }

    /**
     * Sets the value of the dmLinguaCampi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmLinguaCampi }
     *     
     */
    public void setDmLinguaCampi(JoinDmLinguaCampi value) {
        this.dmLinguaCampi = value;
    }

    /**
     * Gets the value of the dmCampiSpecGrp property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmCampiSpecGrp }
     *     
     */
    public JoinDmCampiSpecGrp getDmCampiSpecGrp() {
        return dmCampiSpecGrp;
    }

    /**
     * Sets the value of the dmCampiSpecGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmCampiSpecGrp }
     *     
     */
    public void setDmCampiSpecGrp(JoinDmCampiSpecGrp value) {
        this.dmCampiSpecGrp = value;
    }

    /**
     * Gets the value of the referenceid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getREFERENCEID() {
        return referenceid;
    }

    /**
     * Sets the value of the referenceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setREFERENCEID(FieldString value) {
        this.referenceid = value;
    }

    /**
     * Gets the value of the showrowcount property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSHOWROWCOUNT() {
        return showrowcount;
    }

    /**
     * Sets the value of the showrowcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSHOWROWCOUNT(FieldInt value) {
        this.showrowcount = value;
    }

}
