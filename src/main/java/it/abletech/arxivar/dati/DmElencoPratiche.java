
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_ElencoPratiche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_ElencoPratiche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDTIPOPRATICA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STATOPRATICA" type="{http://www.Abletech.it/Arxivar}Dm_ElencoPratiche_StatoPratica"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DATAFINE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMEPRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDFOLDER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Base" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi_IsLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EXTERNALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_ElencoPratiche", propOrder = {
    "id",
    "idtipopratica",
    "statopratica",
    "datainizio",
    "datafine",
    "utente",
    "numero",
    "nomepratica",
    "idfolder",
    "aggiuntivi",
    "aggiuntiviIsLoaded",
    "externalid"
})
public class DmElencoPratiche
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "IDTIPOPRATICA")
    protected int idtipopratica;
    @XmlElement(name = "STATOPRATICA", required = true)
    protected DmElencoPraticheStatoPratica statopratica;
    @XmlElement(name = "DATAINIZIO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datainizio;
    @XmlElement(name = "DATAFINE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datafine;
    @XmlElement(name = "UTENTE")
    protected int utente;
    @XmlElement(name = "NUMERO")
    protected String numero;
    @XmlElement(name = "NOMEPRATICA")
    protected String nomepratica;
    @XmlElement(name = "IDFOLDER")
    protected int idfolder;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfAggiuntivoBase aggiuntivi;
    @XmlElement(name = "Aggiuntivi_IsLoaded")
    protected boolean aggiuntiviIsLoaded;
    @XmlElement(name = "EXTERNALID")
    protected String externalid;

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
     * Gets the value of the idtipopratica property.
     * 
     */
    public int getIDTIPOPRATICA() {
        return idtipopratica;
    }

    /**
     * Sets the value of the idtipopratica property.
     * 
     */
    public void setIDTIPOPRATICA(int value) {
        this.idtipopratica = value;
    }

    /**
     * Gets the value of the statopratica property.
     * 
     * @return
     *     possible object is
     *     {@link DmElencoPraticheStatoPratica }
     *     
     */
    public DmElencoPraticheStatoPratica getSTATOPRATICA() {
        return statopratica;
    }

    /**
     * Sets the value of the statopratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmElencoPraticheStatoPratica }
     *     
     */
    public void setSTATOPRATICA(DmElencoPraticheStatoPratica value) {
        this.statopratica = value;
    }

    /**
     * Gets the value of the datainizio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAINIZIO() {
        return datainizio;
    }

    /**
     * Sets the value of the datainizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAINIZIO(XMLGregorianCalendar value) {
        this.datainizio = value;
    }

    /**
     * Gets the value of the datafine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAFINE() {
        return datafine;
    }

    /**
     * Sets the value of the datafine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAFINE(XMLGregorianCalendar value) {
        this.datafine = value;
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
     * Gets the value of the nomepratica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEPRATICA() {
        return nomepratica;
    }

    /**
     * Sets the value of the nomepratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEPRATICA(String value) {
        this.nomepratica = value;
    }

    /**
     * Gets the value of the idfolder property.
     * 
     */
    public int getIDFOLDER() {
        return idfolder;
    }

    /**
     * Sets the value of the idfolder property.
     * 
     */
    public void setIDFOLDER(int value) {
        this.idfolder = value;
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
     * Gets the value of the externalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALID() {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALID(String value) {
        this.externalid = value;
    }

}
