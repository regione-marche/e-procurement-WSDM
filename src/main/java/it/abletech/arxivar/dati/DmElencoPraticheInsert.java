
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_ElencoPratiche_Insert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_ElencoPratiche_Insert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="IDTIPOPRATICA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMEPRATICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTERNALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Base" minOccurs="0"/>
 *         &lt;element name="DATAINIZIO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DATAFINE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Permissions" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_ElencoPratiche_Insert_Permission" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_ElencoPratiche_Insert_Event" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_ElencoPratiche_Insert", propOrder = {
    "idtipopratica",
    "numero",
    "nomepratica",
    "externalid",
    "aggiuntivi",
    "datainizio",
    "datafine",
    "permissions",
    "events"
})
public class DmElencoPraticheInsert
    extends Base
{

    @XmlElement(name = "IDTIPOPRATICA")
    protected int idtipopratica;
    @XmlElement(name = "NUMERO")
    protected String numero;
    @XmlElement(name = "NOMEPRATICA")
    protected String nomepratica;
    @XmlElement(name = "EXTERNALID")
    protected String externalid;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfAggiuntivoBase aggiuntivi;
    @XmlElement(name = "DATAINIZIO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datainizio;
    @XmlElement(name = "DATAFINE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datafine;
    @XmlElement(name = "Permissions")
    protected ArrayOfDmElencoPraticheInsertPermission permissions;
    @XmlElement(name = "Events")
    protected ArrayOfDmElencoPraticheInsertEvent events;

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
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmElencoPraticheInsertPermission }
     *     
     */
    public ArrayOfDmElencoPraticheInsertPermission getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmElencoPraticheInsertPermission }
     *     
     */
    public void setPermissions(ArrayOfDmElencoPraticheInsertPermission value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmElencoPraticheInsertEvent }
     *     
     */
    public ArrayOfDmElencoPraticheInsertEvent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmElencoPraticheInsertEvent }
     *     
     */
    public void setEvents(ArrayOfDmElencoPraticheInsertEvent value) {
        this.events = value;
    }

}
