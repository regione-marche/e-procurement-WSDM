
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Tabelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Tabelle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TABELLA" type="{http://www.Abletech.it/Arxivar}Dm_Tabelle_Tabella"/>
 *         &lt;element name="VALORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TASKS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NOTIFICA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NOTIFICAREV" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NOEDIT_AUT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TRANSLATEDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALLOWFORCEREVISION" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ALLOWFORCEOVERWRITE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="USERCANFORCE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Tabelle", propOrder = {
    "id",
    "tabella",
    "valore",
    "icona",
    "tasks",
    "notifica",
    "notificarev",
    "noeditaut",
    "translatedescription",
    "allowforcerevision",
    "allowforceoverwrite",
    "usercanforce"
})
public class DmTabelle
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "TABELLA", required = true)
    protected DmTabelleTabella tabella;
    @XmlElement(name = "VALORE")
    protected String valore;
    @XmlElement(name = "ICONA")
    protected int icona;
    @XmlElement(name = "TASKS")
    protected boolean tasks;
    @XmlElement(name = "NOTIFICA")
    protected boolean notifica;
    @XmlElement(name = "NOTIFICAREV")
    protected boolean notificarev;
    @XmlElement(name = "NOEDIT_AUT")
    protected boolean noeditaut;
    @XmlElement(name = "TRANSLATEDESCRIPTION")
    protected String translatedescription;
    @XmlElement(name = "ALLOWFORCEREVISION")
    protected boolean allowforcerevision;
    @XmlElement(name = "ALLOWFORCEOVERWRITE")
    protected boolean allowforceoverwrite;
    @XmlElement(name = "USERCANFORCE")
    protected boolean usercanforce;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the tabella property.
     * 
     * @return
     *     possible object is
     *     {@link DmTabelleTabella }
     *     
     */
    public DmTabelleTabella getTABELLA() {
        return tabella;
    }

    /**
     * Sets the value of the tabella property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTabelleTabella }
     *     
     */
    public void setTABELLA(DmTabelleTabella value) {
        this.tabella = value;
    }

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORE() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORE(String value) {
        this.valore = value;
    }

    /**
     * Gets the value of the icona property.
     * 
     */
    public int getICONA() {
        return icona;
    }

    /**
     * Sets the value of the icona property.
     * 
     */
    public void setICONA(int value) {
        this.icona = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     */
    public boolean isTASKS() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     */
    public void setTASKS(boolean value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the notifica property.
     * 
     */
    public boolean isNOTIFICA() {
        return notifica;
    }

    /**
     * Sets the value of the notifica property.
     * 
     */
    public void setNOTIFICA(boolean value) {
        this.notifica = value;
    }

    /**
     * Gets the value of the notificarev property.
     * 
     */
    public boolean isNOTIFICAREV() {
        return notificarev;
    }

    /**
     * Sets the value of the notificarev property.
     * 
     */
    public void setNOTIFICAREV(boolean value) {
        this.notificarev = value;
    }

    /**
     * Gets the value of the noeditaut property.
     * 
     */
    public boolean isNOEDITAUT() {
        return noeditaut;
    }

    /**
     * Sets the value of the noeditaut property.
     * 
     */
    public void setNOEDITAUT(boolean value) {
        this.noeditaut = value;
    }

    /**
     * Gets the value of the translatedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSLATEDESCRIPTION() {
        return translatedescription;
    }

    /**
     * Sets the value of the translatedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSLATEDESCRIPTION(String value) {
        this.translatedescription = value;
    }

    /**
     * Gets the value of the allowforcerevision property.
     * 
     */
    public boolean isALLOWFORCEREVISION() {
        return allowforcerevision;
    }

    /**
     * Sets the value of the allowforcerevision property.
     * 
     */
    public void setALLOWFORCEREVISION(boolean value) {
        this.allowforcerevision = value;
    }

    /**
     * Gets the value of the allowforceoverwrite property.
     * 
     */
    public boolean isALLOWFORCEOVERWRITE() {
        return allowforceoverwrite;
    }

    /**
     * Sets the value of the allowforceoverwrite property.
     * 
     */
    public void setALLOWFORCEOVERWRITE(boolean value) {
        this.allowforceoverwrite = value;
    }

    /**
     * Gets the value of the usercanforce property.
     * 
     */
    public boolean isUSERCANFORCE() {
        return usercanforce;
    }

    /**
     * Sets the value of the usercanforce property.
     * 
     */
    public void setUSERCANFORCE(boolean value) {
        this.usercanforce = value;
    }

}
