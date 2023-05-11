
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Note complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Note">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DATAORA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="COMMENTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REVISIONE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FLAGAOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DM_COUNTERSTABLE_ID" type="{http://www.Abletech.it/Arxivar}Dm_Counters_Tables"/>
 *         &lt;element name="KEYID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Note", propOrder = {
    "idsystem",
    "docnumber",
    "utente",
    "dataora",
    "commenti",
    "revisione",
    "flagaos",
    "dmcounterstableid",
    "keyid"
})
@XmlSeeAlso({
    Note.class
})
public class DmNote
    extends Base
{

    @XmlElement(name = "ID_SYSTEM")
    protected int idsystem;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "UTENTE")
    protected int utente;
    @XmlElement(name = "DATAORA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataora;
    @XmlElement(name = "COMMENTI")
    protected String commenti;
    @XmlElement(name = "REVISIONE")
    protected int revisione;
    @XmlElement(name = "FLAGAOS")
    protected boolean flagaos;
    @XmlElement(name = "DM_COUNTERSTABLE_ID", required = true)
    protected DmCountersTables dmcounterstableid;
    @XmlElement(name = "KEYID", required = true, type = Integer.class, nillable = true)
    protected Integer keyid;

    /**
     * Gets the value of the idsystem property.
     * 
     */
    public int getIDSYSTEM() {
        return idsystem;
    }

    /**
     * Sets the value of the idsystem property.
     * 
     */
    public void setIDSYSTEM(int value) {
        this.idsystem = value;
    }

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
     * Gets the value of the utente property.
     * 
     */
    public int getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     */
    public void setUTENTE(int value) {
        this.utente = value;
    }

    /**
     * Gets the value of the dataora property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAORA() {
        return dataora;
    }

    /**
     * Sets the value of the dataora property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAORA(XMLGregorianCalendar value) {
        this.dataora = value;
    }

    /**
     * Gets the value of the commenti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENTI() {
        return commenti;
    }

    /**
     * Sets the value of the commenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENTI(String value) {
        this.commenti = value;
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
     * Gets the value of the flagaos property.
     * 
     */
    public boolean isFLAGAOS() {
        return flagaos;
    }

    /**
     * Sets the value of the flagaos property.
     * 
     */
    public void setFLAGAOS(boolean value) {
        this.flagaos = value;
    }

    /**
     * Gets the value of the dmcounterstableid property.
     * 
     * @return
     *     possible object is
     *     {@link DmCountersTables }
     *     
     */
    public DmCountersTables getDMCOUNTERSTABLEID() {
        return dmcounterstableid;
    }

    /**
     * Sets the value of the dmcounterstableid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCountersTables }
     *     
     */
    public void setDMCOUNTERSTABLEID(DmCountersTables value) {
        this.dmcounterstableid = value;
    }

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKEYID(Integer value) {
        this.keyid = value;
    }

}
