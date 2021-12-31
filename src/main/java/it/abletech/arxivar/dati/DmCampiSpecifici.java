
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_CampiSpecifici complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_CampiSpecifici">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="NOMECAMPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPODOC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CLASSE" type="{http://www.Abletech.it/Arxivar}Dm_CampiSpecifici_Classe"/>
 *         &lt;element name="PIXEL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CARATTERI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DECIMALI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="POSIZIONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OBBLIGATORIO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Dm_CampiSpecifici_Stato"/>
 *         &lt;element name="AUTOINS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="COMBOGRUPPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOCOM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AUTOCOMCAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTOCOMALL" type="{http://www.Abletech.it/Arxivar}Dm_CampiSpecifici_AutoComAll"/>
 *         &lt;element name="FLAG_TRANS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TABORIGINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPOCODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPODESCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDKALIASNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BLOCCATO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LIMITTOLIST" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ETICHETTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FORMULA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DMTIPIDOCUMENTOSYSTEMID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DMMASKIDFORINSERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DMMASKIDFORVIEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELETERULE" type="{http://www.Abletech.it/Arxivar}Dm_CampiSpecifici_DeleteRule"/>
 *         &lt;element name="SHOWESPANCE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="INHERITGRANTPARENT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SINGLEELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="REFERENCEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHOWROWCOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_CampiSpecifici", propOrder = {
    "nomecampo",
    "tipodoc",
    "classe",
    "pixel",
    "caratteri",
    "decimali",
    "posizione",
    "obbligatorio",
    "stato",
    "autoins",
    "combogruppi",
    "autocom",
    "autocomcar",
    "autocomall",
    "flagtrans",
    "taborigine",
    "campocodice",
    "campodescrizione",
    "sdkaliasname",
    "idgrp",
    "bloccato",
    "limittolist",
    "etichetta",
    "formula",
    "dmtipidocumentosystemid",
    "dmmaskidforinsert",
    "dmmaskidforview",
    "deleterule",
    "showespance",
    "inheritgrantparent",
    "singleelement",
    "referenceid",
    "showrowcount"
})
public class DmCampiSpecifici
    extends Base
{

    @XmlElement(name = "NOMECAMPO")
    protected String nomecampo;
    @XmlElement(name = "TIPODOC")
    protected int tipodoc;
    @XmlElement(name = "CLASSE", required = true)
    protected DmCampiSpecificiClasse classe;
    @XmlElement(name = "PIXEL")
    protected int pixel;
    @XmlElement(name = "CARATTERI")
    protected int caratteri;
    @XmlElement(name = "DECIMALI")
    protected int decimali;
    @XmlElement(name = "POSIZIONE")
    protected int posizione;
    @XmlElement(name = "OBBLIGATORIO")
    protected boolean obbligatorio;
    @XmlElement(name = "STATO", required = true)
    protected DmCampiSpecificiStato stato;
    @XmlElement(name = "AUTOINS")
    protected boolean autoins;
    @XmlElement(name = "COMBOGRUPPI")
    protected String combogruppi;
    @XmlElement(name = "AUTOCOM")
    protected boolean autocom;
    @XmlElement(name = "AUTOCOMCAR")
    protected String autocomcar;
    @XmlElement(name = "AUTOCOMALL", required = true)
    protected DmCampiSpecificiAutoComAll autocomall;
    @XmlElement(name = "FLAG_TRANS")
    protected boolean flagtrans;
    @XmlElement(name = "TABORIGINE")
    protected String taborigine;
    @XmlElement(name = "CAMPOCODICE")
    protected String campocodice;
    @XmlElement(name = "CAMPODESCRIZIONE")
    protected String campodescrizione;
    @XmlElement(name = "SDKALIASNAME")
    protected String sdkaliasname;
    @XmlElement(name = "IDGRP")
    protected int idgrp;
    @XmlElement(name = "BLOCCATO")
    protected boolean bloccato;
    @XmlElement(name = "LIMITTOLIST")
    protected boolean limittolist;
    @XmlElement(name = "ETICHETTA")
    protected String etichetta;
    @XmlElement(name = "FORMULA")
    protected String formula;
    @XmlElement(name = "DMTIPIDOCUMENTOSYSTEMID")
    protected int dmtipidocumentosystemid;
    @XmlElement(name = "DMMASKIDFORINSERT")
    protected String dmmaskidforinsert;
    @XmlElement(name = "DMMASKIDFORVIEW")
    protected String dmmaskidforview;
    @XmlElement(name = "DELETERULE", required = true)
    protected DmCampiSpecificiDeleteRule deleterule;
    @XmlElement(name = "SHOWESPANCE")
    protected boolean showespance;
    @XmlElement(name = "INHERITGRANTPARENT")
    protected boolean inheritgrantparent;
    @XmlElement(name = "SINGLEELEMENT")
    protected boolean singleelement;
    @XmlElement(name = "REFERENCEID")
    protected String referenceid;
    @XmlElement(name = "SHOWROWCOUNT")
    protected int showrowcount;

    /**
     * Gets the value of the nomecampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECAMPO() {
        return nomecampo;
    }

    /**
     * Sets the value of the nomecampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECAMPO(String value) {
        this.nomecampo = value;
    }

    /**
     * Gets the value of the tipodoc property.
     * 
     */
    public int getTIPODOC() {
        return tipodoc;
    }

    /**
     * Sets the value of the tipodoc property.
     * 
     */
    public void setTIPODOC(int value) {
        this.tipodoc = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link DmCampiSpecificiClasse }
     *     
     */
    public DmCampiSpecificiClasse getCLASSE() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCampiSpecificiClasse }
     *     
     */
    public void setCLASSE(DmCampiSpecificiClasse value) {
        this.classe = value;
    }

    /**
     * Gets the value of the pixel property.
     * 
     */
    public int getPIXEL() {
        return pixel;
    }

    /**
     * Sets the value of the pixel property.
     * 
     */
    public void setPIXEL(int value) {
        this.pixel = value;
    }

    /**
     * Gets the value of the caratteri property.
     * 
     */
    public int getCARATTERI() {
        return caratteri;
    }

    /**
     * Sets the value of the caratteri property.
     * 
     */
    public void setCARATTERI(int value) {
        this.caratteri = value;
    }

    /**
     * Gets the value of the decimali property.
     * 
     */
    public int getDECIMALI() {
        return decimali;
    }

    /**
     * Sets the value of the decimali property.
     * 
     */
    public void setDECIMALI(int value) {
        this.decimali = value;
    }

    /**
     * Gets the value of the posizione property.
     * 
     */
    public int getPOSIZIONE() {
        return posizione;
    }

    /**
     * Sets the value of the posizione property.
     * 
     */
    public void setPOSIZIONE(int value) {
        this.posizione = value;
    }

    /**
     * Gets the value of the obbligatorio property.
     * 
     */
    public boolean isOBBLIGATORIO() {
        return obbligatorio;
    }

    /**
     * Sets the value of the obbligatorio property.
     * 
     */
    public void setOBBLIGATORIO(boolean value) {
        this.obbligatorio = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link DmCampiSpecificiStato }
     *     
     */
    public DmCampiSpecificiStato getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCampiSpecificiStato }
     *     
     */
    public void setSTATO(DmCampiSpecificiStato value) {
        this.stato = value;
    }

    /**
     * Gets the value of the autoins property.
     * 
     */
    public boolean isAUTOINS() {
        return autoins;
    }

    /**
     * Sets the value of the autoins property.
     * 
     */
    public void setAUTOINS(boolean value) {
        this.autoins = value;
    }

    /**
     * Gets the value of the combogruppi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMBOGRUPPI() {
        return combogruppi;
    }

    /**
     * Sets the value of the combogruppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMBOGRUPPI(String value) {
        this.combogruppi = value;
    }

    /**
     * Gets the value of the autocom property.
     * 
     */
    public boolean isAUTOCOM() {
        return autocom;
    }

    /**
     * Sets the value of the autocom property.
     * 
     */
    public void setAUTOCOM(boolean value) {
        this.autocom = value;
    }

    /**
     * Gets the value of the autocomcar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOCOMCAR() {
        return autocomcar;
    }

    /**
     * Sets the value of the autocomcar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOCOMCAR(String value) {
        this.autocomcar = value;
    }

    /**
     * Gets the value of the autocomall property.
     * 
     * @return
     *     possible object is
     *     {@link DmCampiSpecificiAutoComAll }
     *     
     */
    public DmCampiSpecificiAutoComAll getAUTOCOMALL() {
        return autocomall;
    }

    /**
     * Sets the value of the autocomall property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCampiSpecificiAutoComAll }
     *     
     */
    public void setAUTOCOMALL(DmCampiSpecificiAutoComAll value) {
        this.autocomall = value;
    }

    /**
     * Gets the value of the flagtrans property.
     * 
     */
    public boolean isFLAGTRANS() {
        return flagtrans;
    }

    /**
     * Sets the value of the flagtrans property.
     * 
     */
    public void setFLAGTRANS(boolean value) {
        this.flagtrans = value;
    }

    /**
     * Gets the value of the taborigine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABORIGINE() {
        return taborigine;
    }

    /**
     * Sets the value of the taborigine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABORIGINE(String value) {
        this.taborigine = value;
    }

    /**
     * Gets the value of the campocodice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPOCODICE() {
        return campocodice;
    }

    /**
     * Sets the value of the campocodice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPOCODICE(String value) {
        this.campocodice = value;
    }

    /**
     * Gets the value of the campodescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPODESCRIZIONE() {
        return campodescrizione;
    }

    /**
     * Sets the value of the campodescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPODESCRIZIONE(String value) {
        this.campodescrizione = value;
    }

    /**
     * Gets the value of the sdkaliasname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDKALIASNAME() {
        return sdkaliasname;
    }

    /**
     * Sets the value of the sdkaliasname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDKALIASNAME(String value) {
        this.sdkaliasname = value;
    }

    /**
     * Gets the value of the idgrp property.
     * 
     */
    public int getIDGRP() {
        return idgrp;
    }

    /**
     * Sets the value of the idgrp property.
     * 
     */
    public void setIDGRP(int value) {
        this.idgrp = value;
    }

    /**
     * Gets the value of the bloccato property.
     * 
     */
    public boolean isBLOCCATO() {
        return bloccato;
    }

    /**
     * Sets the value of the bloccato property.
     * 
     */
    public void setBLOCCATO(boolean value) {
        this.bloccato = value;
    }

    /**
     * Gets the value of the limittolist property.
     * 
     */
    public boolean isLIMITTOLIST() {
        return limittolist;
    }

    /**
     * Sets the value of the limittolist property.
     * 
     */
    public void setLIMITTOLIST(boolean value) {
        this.limittolist = value;
    }

    /**
     * Gets the value of the etichetta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETICHETTA() {
        return etichetta;
    }

    /**
     * Sets the value of the etichetta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETICHETTA(String value) {
        this.etichetta = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMULA() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMULA(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the dmtipidocumentosystemid property.
     * 
     */
    public int getDMTIPIDOCUMENTOSYSTEMID() {
        return dmtipidocumentosystemid;
    }

    /**
     * Sets the value of the dmtipidocumentosystemid property.
     * 
     */
    public void setDMTIPIDOCUMENTOSYSTEMID(int value) {
        this.dmtipidocumentosystemid = value;
    }

    /**
     * Gets the value of the dmmaskidforinsert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMMASKIDFORINSERT() {
        return dmmaskidforinsert;
    }

    /**
     * Sets the value of the dmmaskidforinsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMMASKIDFORINSERT(String value) {
        this.dmmaskidforinsert = value;
    }

    /**
     * Gets the value of the dmmaskidforview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMMASKIDFORVIEW() {
        return dmmaskidforview;
    }

    /**
     * Sets the value of the dmmaskidforview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMMASKIDFORVIEW(String value) {
        this.dmmaskidforview = value;
    }

    /**
     * Gets the value of the deleterule property.
     * 
     * @return
     *     possible object is
     *     {@link DmCampiSpecificiDeleteRule }
     *     
     */
    public DmCampiSpecificiDeleteRule getDELETERULE() {
        return deleterule;
    }

    /**
     * Sets the value of the deleterule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCampiSpecificiDeleteRule }
     *     
     */
    public void setDELETERULE(DmCampiSpecificiDeleteRule value) {
        this.deleterule = value;
    }

    /**
     * Gets the value of the showespance property.
     * 
     */
    public boolean isSHOWESPANCE() {
        return showespance;
    }

    /**
     * Sets the value of the showespance property.
     * 
     */
    public void setSHOWESPANCE(boolean value) {
        this.showespance = value;
    }

    /**
     * Gets the value of the inheritgrantparent property.
     * 
     */
    public boolean isINHERITGRANTPARENT() {
        return inheritgrantparent;
    }

    /**
     * Sets the value of the inheritgrantparent property.
     * 
     */
    public void setINHERITGRANTPARENT(boolean value) {
        this.inheritgrantparent = value;
    }

    /**
     * Gets the value of the singleelement property.
     * 
     */
    public boolean isSINGLEELEMENT() {
        return singleelement;
    }

    /**
     * Sets the value of the singleelement property.
     * 
     */
    public void setSINGLEELEMENT(boolean value) {
        this.singleelement = value;
    }

    /**
     * Gets the value of the referenceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEID() {
        return referenceid;
    }

    /**
     * Sets the value of the referenceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEID(String value) {
        this.referenceid = value;
    }

    /**
     * Gets the value of the showrowcount property.
     * 
     */
    public int getSHOWROWCOUNT() {
        return showrowcount;
    }

    /**
     * Sets the value of the showrowcount property.
     * 
     */
    public void setSHOWROWCOUNT(int value) {
        this.showrowcount = value;
    }

}
