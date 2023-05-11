
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_TipiDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_TipiDocumento">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="DUPLICATEMODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATADOCMODE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="SYSTEM_ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TYPE_ID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.Abletech.it/Arxivar}Field_String_LinguaCampi" minOccurs="0"/>
 *         &lt;element name="PADRE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="INOLTRO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CHECKPDF" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="STATODOC" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ORIGINE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TP_ENABLED" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="TP_PROFILE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ISLUL" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="PA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="REQUIREFILE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DM_MASK_ID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DISPLAYFILENAME" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_TipiDocumento", propOrder = {
    "duplicatemode",
    "datadocmode",
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
    "pa",
    "requirefile",
    "dmmaskid",
    "displayfilename"
})
public class JoinDmTipiDocumento
    extends JoinAbstract
{

    @XmlElement(name = "DUPLICATEMODE")
    protected FieldInt duplicatemode;
    @XmlElement(name = "DATADOCMODE")
    protected FieldInt datadocmode;
    @XmlElement(name = "SYSTEM_ID")
    protected FieldInt systemid;
    @XmlElement(name = "TYPE_ID")
    protected FieldString typeid;
    @XmlElement(name = "DESCRIPTION")
    protected FieldStringLinguaCampi description;
    @XmlElement(name = "PADRE")
    protected FieldInt padre;
    @XmlElement(name = "STATO")
    protected FieldString stato;
    @XmlElement(name = "INOLTRO")
    protected FieldInt inoltro;
    @XmlElement(name = "CHECKPDF")
    protected FieldInt checkpdf;
    @XmlElement(name = "STATODOC")
    protected FieldString statodoc;
    @XmlElement(name = "ORIGINE")
    protected FieldInt origine;
    @XmlElement(name = "TP_ENABLED")
    protected FieldInt tpenabled;
    @XmlElement(name = "TP_PROFILE")
    protected FieldInt tpprofile;
    @XmlElement(name = "ISLUL")
    protected FieldInt islul;
    @XmlElement(name = "PA")
    protected FieldInt pa;
    @XmlElement(name = "REQUIREFILE")
    protected FieldInt requirefile;
    @XmlElement(name = "DM_MASK_ID")
    protected FieldString dmmaskid;
    @XmlElement(name = "DISPLAYFILENAME")
    protected FieldString displayfilename;

    /**
     * Gets the value of the duplicatemode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDUPLICATEMODE() {
        return duplicatemode;
    }

    /**
     * Sets the value of the duplicatemode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDUPLICATEMODE(FieldInt value) {
        this.duplicatemode = value;
    }

    /**
     * Gets the value of the datadocmode property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDATADOCMODE() {
        return datadocmode;
    }

    /**
     * Sets the value of the datadocmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDATADOCMODE(FieldInt value) {
        this.datadocmode = value;
    }

    /**
     * Gets the value of the systemid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSYSTEMID() {
        return systemid;
    }

    /**
     * Sets the value of the systemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSYSTEMID(FieldInt value) {
        this.systemid = value;
    }

    /**
     * Gets the value of the typeid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTYPEID() {
        return typeid;
    }

    /**
     * Sets the value of the typeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTYPEID(FieldString value) {
        this.typeid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link FieldStringLinguaCampi }
     *     
     */
    public FieldStringLinguaCampi getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldStringLinguaCampi }
     *     
     */
    public void setDESCRIPTION(FieldStringLinguaCampi value) {
        this.description = value;
    }

    /**
     * Gets the value of the padre property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPADRE() {
        return padre;
    }

    /**
     * Sets the value of the padre property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPADRE(FieldInt value) {
        this.padre = value;
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
     * Gets the value of the inoltro property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getINOLTRO() {
        return inoltro;
    }

    /**
     * Sets the value of the inoltro property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setINOLTRO(FieldInt value) {
        this.inoltro = value;
    }

    /**
     * Gets the value of the checkpdf property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCHECKPDF() {
        return checkpdf;
    }

    /**
     * Sets the value of the checkpdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCHECKPDF(FieldInt value) {
        this.checkpdf = value;
    }

    /**
     * Gets the value of the statodoc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATODOC() {
        return statodoc;
    }

    /**
     * Sets the value of the statodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTATODOC(FieldString value) {
        this.statodoc = value;
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
     * Gets the value of the tpenabled property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTPENABLED() {
        return tpenabled;
    }

    /**
     * Sets the value of the tpenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTPENABLED(FieldInt value) {
        this.tpenabled = value;
    }

    /**
     * Gets the value of the tpprofile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getTPPROFILE() {
        return tpprofile;
    }

    /**
     * Sets the value of the tpprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setTPPROFILE(FieldInt value) {
        this.tpprofile = value;
    }

    /**
     * Gets the value of the islul property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getISLUL() {
        return islul;
    }

    /**
     * Sets the value of the islul property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setISLUL(FieldInt value) {
        this.islul = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPA() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPA(FieldInt value) {
        this.pa = value;
    }

    /**
     * Gets the value of the requirefile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getREQUIREFILE() {
        return requirefile;
    }

    /**
     * Sets the value of the requirefile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setREQUIREFILE(FieldInt value) {
        this.requirefile = value;
    }

    /**
     * Gets the value of the dmmaskid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMMASKID() {
        return dmmaskid;
    }

    /**
     * Sets the value of the dmmaskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMMASKID(FieldString value) {
        this.dmmaskid = value;
    }

    /**
     * Gets the value of the displayfilename property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDISPLAYFILENAME() {
        return displayfilename;
    }

    /**
     * Sets the value of the displayfilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDISPLAYFILENAME(FieldString value) {
        this.displayfilename = value;
    }

}
