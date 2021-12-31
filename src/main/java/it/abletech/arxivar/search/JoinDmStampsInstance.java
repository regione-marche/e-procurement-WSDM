
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_StampsInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_StampsInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="UTENTE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DATETIMEINSERT" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DMSTAMPDEFINITIONID" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="ISRESIZABLE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="LOCATIONX" type="{http://www.Abletech.it/Arxivar}Field_Double" minOccurs="0"/>
 *         &lt;element name="LOCATIONY" type="{http://www.Abletech.it/Arxivar}Field_Double" minOccurs="0"/>
 *         &lt;element name="WIDTH" type="{http://www.Abletech.it/Arxivar}Field_Double" minOccurs="0"/>
 *         &lt;element name="HEIGHT" type="{http://www.Abletech.it/Arxivar}Field_Double" minOccurs="0"/>
 *         &lt;element name="PAGEINDEX" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="APPLIED" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_StampsInstance", propOrder = {
    "utente",
    "id",
    "datetimeinsert",
    "dmstampdefinitionid",
    "isresizable",
    "locationx",
    "locationy",
    "width",
    "height",
    "pageindex",
    "applied"
})
public class JoinDmStampsInstance
    extends JoinAbstract
{

    @XmlElement(name = "UTENTE")
    protected FieldInt utente;
    @XmlElement(name = "ID")
    protected FieldString id;
    @XmlElement(name = "DATETIMEINSERT")
    protected FieldDateTime datetimeinsert;
    @XmlElement(name = "DMSTAMPDEFINITIONID")
    protected FieldString dmstampdefinitionid;
    @XmlElement(name = "ISRESIZABLE")
    protected FieldInt isresizable;
    @XmlElement(name = "LOCATIONX")
    protected FieldDouble locationx;
    @XmlElement(name = "LOCATIONY")
    protected FieldDouble locationy;
    @XmlElement(name = "WIDTH")
    protected FieldDouble width;
    @XmlElement(name = "HEIGHT")
    protected FieldDouble height;
    @XmlElement(name = "PAGEINDEX")
    protected FieldInt pageindex;
    @XmlElement(name = "APPLIED")
    protected FieldInt applied;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setID(FieldString value) {
        this.id = value;
    }

    /**
     * Gets the value of the datetimeinsert property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATETIMEINSERT() {
        return datetimeinsert;
    }

    /**
     * Sets the value of the datetimeinsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATETIMEINSERT(FieldDateTime value) {
        this.datetimeinsert = value;
    }

    /**
     * Gets the value of the dmstampdefinitionid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDMSTAMPDEFINITIONID() {
        return dmstampdefinitionid;
    }

    /**
     * Sets the value of the dmstampdefinitionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDMSTAMPDEFINITIONID(FieldString value) {
        this.dmstampdefinitionid = value;
    }

    /**
     * Gets the value of the isresizable property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getISRESIZABLE() {
        return isresizable;
    }

    /**
     * Sets the value of the isresizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setISRESIZABLE(FieldInt value) {
        this.isresizable = value;
    }

    /**
     * Gets the value of the locationx property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDouble }
     *     
     */
    public FieldDouble getLOCATIONX() {
        return locationx;
    }

    /**
     * Sets the value of the locationx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDouble }
     *     
     */
    public void setLOCATIONX(FieldDouble value) {
        this.locationx = value;
    }

    /**
     * Gets the value of the locationy property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDouble }
     *     
     */
    public FieldDouble getLOCATIONY() {
        return locationy;
    }

    /**
     * Sets the value of the locationy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDouble }
     *     
     */
    public void setLOCATIONY(FieldDouble value) {
        this.locationy = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDouble }
     *     
     */
    public FieldDouble getWIDTH() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDouble }
     *     
     */
    public void setWIDTH(FieldDouble value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDouble }
     *     
     */
    public FieldDouble getHEIGHT() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDouble }
     *     
     */
    public void setHEIGHT(FieldDouble value) {
        this.height = value;
    }

    /**
     * Gets the value of the pageindex property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getPAGEINDEX() {
        return pageindex;
    }

    /**
     * Sets the value of the pageindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setPAGEINDEX(FieldInt value) {
        this.pageindex = value;
    }

    /**
     * Gets the value of the applied property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getAPPLIED() {
        return applied;
    }

    /**
     * Sets the value of the applied property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setAPPLIED(FieldInt value) {
        this.applied = value;
    }

}
