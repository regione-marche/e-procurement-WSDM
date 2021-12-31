
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_TipiDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_TipiDocumento">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="SYSTEM_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PADRE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento_Stato"/>
 *         &lt;element name="INOLTRO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CHECKPDF" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="STATODOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORIGINE" type="{http://www.Abletech.it/Arxivar}DmProfileInOut"/>
 *         &lt;element name="TP_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TP_PROFILE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ISLUL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIVELLO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PA" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento_Pa"/>
 *         &lt;element name="REQUIREFILE" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento_RequireFile"/>
 *         &lt;element name="DM_MASK_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDFA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SAOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RUMODE" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento_RuMode"/>
 *         &lt;element name="DISPLAYFILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUPLICATEMODE" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento_DuplicateMode"/>
 *         &lt;element name="DATADOCMODE" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento_DataDocMode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_TipiDocumento", propOrder = {
    "systemid",
    "typeid",
    "description",
    "padre",
    "stato",
    "inoltro",
    "checkpdf",
    "statodoc",
    "origine",
    "tpenabled",
    "tpprofile",
    "islul",
    "ids",
    "livello",
    "codice",
    "pa",
    "requirefile",
    "dmmaskid",
    "pdfa",
    "saos",
    "rumode",
    "displayfilename",
    "duplicatemode",
    "datadocmode"
})
public class DmTipiDocumento
    extends Base
{

    @XmlElement(name = "SYSTEM_ID")
    protected int systemid;
    @XmlElement(name = "TYPE_ID")
    protected String typeid;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "PADRE")
    protected int padre;
    @XmlElement(name = "STATO", required = true)
    protected DmTipiDocumentoStato stato;
    @XmlElement(name = "INOLTRO")
    protected boolean inoltro;
    @XmlElement(name = "CHECKPDF")
    protected boolean checkpdf;
    @XmlElement(name = "STATODOC")
    protected String statodoc;
    @XmlElement(name = "ORIGINE", required = true)
    protected DmProfileInOut origine;
    @XmlElement(name = "TP_ENABLED")
    protected boolean tpenabled;
    @XmlElement(name = "TP_PROFILE")
    protected int tpprofile;
    @XmlElement(name = "ISLUL")
    protected boolean islul;
    @XmlElement(name = "IDS")
    protected String ids;
    @XmlElement(name = "LIVELLO")
    protected int livello;
    @XmlElement(name = "CODICE")
    protected String codice;
    @XmlElement(name = "PA", required = true)
    protected DmTipiDocumentoPa pa;
    @XmlElement(name = "REQUIREFILE", required = true)
    protected DmTipiDocumentoRequireFile requirefile;
    @XmlElement(name = "DM_MASK_ID")
    protected String dmmaskid;
    @XmlElement(name = "PDFA")
    protected boolean pdfa;
    @XmlElement(name = "SAOS", required = true, type = Integer.class, nillable = true)
    protected Integer saos;
    @XmlElement(name = "RUMODE", required = true)
    protected DmTipiDocumentoRuMode rumode;
    @XmlElement(name = "DISPLAYFILENAME")
    protected String displayfilename;
    @XmlElement(name = "DUPLICATEMODE", required = true)
    protected DmTipiDocumentoDuplicateMode duplicatemode;
    @XmlElement(name = "DATADOCMODE", required = true)
    protected DmTipiDocumentoDataDocMode datadocmode;

    /**
     * Gets the value of the systemid property.
     * 
     */
    public int getSYSTEMID() {
        return systemid;
    }

    /**
     * Sets the value of the systemid property.
     * 
     */
    public void setSYSTEMID(int value) {
        this.systemid = value;
    }

    /**
     * Gets the value of the typeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEID() {
        return typeid;
    }

    /**
     * Sets the value of the typeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEID(String value) {
        this.typeid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the padre property.
     * 
     */
    public int getPADRE() {
        return padre;
    }

    /**
     * Sets the value of the padre property.
     * 
     */
    public void setPADRE(int value) {
        this.padre = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumentoStato }
     *     
     */
    public DmTipiDocumentoStato getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumentoStato }
     *     
     */
    public void setSTATO(DmTipiDocumentoStato value) {
        this.stato = value;
    }

    /**
     * Gets the value of the inoltro property.
     * 
     */
    public boolean isINOLTRO() {
        return inoltro;
    }

    /**
     * Sets the value of the inoltro property.
     * 
     */
    public void setINOLTRO(boolean value) {
        this.inoltro = value;
    }

    /**
     * Gets the value of the checkpdf property.
     * 
     */
    public boolean isCHECKPDF() {
        return checkpdf;
    }

    /**
     * Sets the value of the checkpdf property.
     * 
     */
    public void setCHECKPDF(boolean value) {
        this.checkpdf = value;
    }

    /**
     * Gets the value of the statodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATODOC() {
        return statodoc;
    }

    /**
     * Sets the value of the statodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATODOC(String value) {
        this.statodoc = value;
    }

    /**
     * Gets the value of the origine property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfileInOut }
     *     
     */
    public DmProfileInOut getORIGINE() {
        return origine;
    }

    /**
     * Sets the value of the origine property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfileInOut }
     *     
     */
    public void setORIGINE(DmProfileInOut value) {
        this.origine = value;
    }

    /**
     * Gets the value of the tpenabled property.
     * 
     */
    public boolean isTPENABLED() {
        return tpenabled;
    }

    /**
     * Sets the value of the tpenabled property.
     * 
     */
    public void setTPENABLED(boolean value) {
        this.tpenabled = value;
    }

    /**
     * Gets the value of the tpprofile property.
     * 
     */
    public int getTPPROFILE() {
        return tpprofile;
    }

    /**
     * Sets the value of the tpprofile property.
     * 
     */
    public void setTPPROFILE(int value) {
        this.tpprofile = value;
    }

    /**
     * Gets the value of the islul property.
     * 
     */
    public boolean isISLUL() {
        return islul;
    }

    /**
     * Sets the value of the islul property.
     * 
     */
    public void setISLUL(boolean value) {
        this.islul = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDS() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDS(String value) {
        this.ids = value;
    }

    /**
     * Gets the value of the livello property.
     * 
     */
    public int getLIVELLO() {
        return livello;
    }

    /**
     * Sets the value of the livello property.
     * 
     */
    public void setLIVELLO(int value) {
        this.livello = value;
    }

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICE() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICE(String value) {
        this.codice = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumentoPa }
     *     
     */
    public DmTipiDocumentoPa getPA() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumentoPa }
     *     
     */
    public void setPA(DmTipiDocumentoPa value) {
        this.pa = value;
    }

    /**
     * Gets the value of the requirefile property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumentoRequireFile }
     *     
     */
    public DmTipiDocumentoRequireFile getREQUIREFILE() {
        return requirefile;
    }

    /**
     * Sets the value of the requirefile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumentoRequireFile }
     *     
     */
    public void setREQUIREFILE(DmTipiDocumentoRequireFile value) {
        this.requirefile = value;
    }

    /**
     * Gets the value of the dmmaskid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMMASKID() {
        return dmmaskid;
    }

    /**
     * Sets the value of the dmmaskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMMASKID(String value) {
        this.dmmaskid = value;
    }

    /**
     * Gets the value of the pdfa property.
     * 
     */
    public boolean isPDFA() {
        return pdfa;
    }

    /**
     * Sets the value of the pdfa property.
     * 
     */
    public void setPDFA(boolean value) {
        this.pdfa = value;
    }

    /**
     * Gets the value of the saos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSAOS() {
        return saos;
    }

    /**
     * Sets the value of the saos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSAOS(Integer value) {
        this.saos = value;
    }

    /**
     * Gets the value of the rumode property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumentoRuMode }
     *     
     */
    public DmTipiDocumentoRuMode getRUMODE() {
        return rumode;
    }

    /**
     * Sets the value of the rumode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumentoRuMode }
     *     
     */
    public void setRUMODE(DmTipiDocumentoRuMode value) {
        this.rumode = value;
    }

    /**
     * Gets the value of the displayfilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYFILENAME() {
        return displayfilename;
    }

    /**
     * Sets the value of the displayfilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYFILENAME(String value) {
        this.displayfilename = value;
    }

    /**
     * Gets the value of the duplicatemode property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumentoDuplicateMode }
     *     
     */
    public DmTipiDocumentoDuplicateMode getDUPLICATEMODE() {
        return duplicatemode;
    }

    /**
     * Sets the value of the duplicatemode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumentoDuplicateMode }
     *     
     */
    public void setDUPLICATEMODE(DmTipiDocumentoDuplicateMode value) {
        this.duplicatemode = value;
    }

    /**
     * Gets the value of the datadocmode property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumentoDataDocMode }
     *     
     */
    public DmTipiDocumentoDataDocMode getDATADOCMODE() {
        return datadocmode;
    }

    /**
     * Sets the value of the datadocmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumentoDataDocMode }
     *     
     */
    public void setDATADOCMODE(DmTipiDocumentoDataDocMode value) {
        this.datadocmode = value;
    }

}
