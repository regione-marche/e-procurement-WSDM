
package it.datagraph;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Destinatario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Destinatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Persona" type="{}Persona" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AOO" type="{}AOO" minOccurs="0"/>
 *         &lt;element name="Amministrazione" type="{}Amministrazione" minOccurs="0"/>
 *         &lt;element name="IndirizzoTelematico" type="{}IndirizzoTelematico" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="IndirizzoPostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="IndirizzoPostaleItem" type="{}IndirizzoPostaleType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destinatario", namespace = "", propOrder = {
    "persona",
    "aoo",
    "amministrazione",
    "indirizzoTelematico",
    "telefono",
    "fax",
    "indirizzoPostale",
    "indirizzoPostaleItem"
})
public class Destinatario {

    @XmlElement(name = "Persona")
    protected List<Persona> persona;
    @XmlElement(name = "AOO")
    protected AOO aoo;
    @XmlElement(name = "Amministrazione")
    protected Amministrazione amministrazione;
    @XmlElement(name = "IndirizzoTelematico")
    protected IndirizzoTelematico indirizzoTelematico;
    @XmlElement(name = "Telefono")
    protected List<String> telefono;
    @XmlElement(name = "Fax")
    protected List<String> fax;
    @XmlElement(name = "IndirizzoPostale")
    protected String indirizzoPostale;
    @XmlElement(name = "IndirizzoPostaleItem")
    protected IndirizzoPostaleType indirizzoPostaleItem;

    /**
     * Gets the value of the persona property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persona property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersona().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Persona }
     * 
     * 
     */
    public List<Persona> getPersona() {
        if (persona == null) {
            persona = new ArrayList<Persona>();
        }
        return this.persona;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link AOO }
     *     
     */
    public AOO getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AOO }
     *     
     */
    public void setAOO(AOO value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the amministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link Amministrazione }
     *     
     */
    public Amministrazione getAmministrazione() {
        return amministrazione;
    }

    /**
     * Sets the value of the amministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amministrazione }
     *     
     */
    public void setAmministrazione(Amministrazione value) {
        this.amministrazione = value;
    }

    /**
     * Gets the value of the indirizzoTelematico property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoTelematico }
     *     
     */
    public IndirizzoTelematico getIndirizzoTelematico() {
        return indirizzoTelematico;
    }

    /**
     * Sets the value of the indirizzoTelematico property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoTelematico }
     *     
     */
    public void setIndirizzoTelematico(IndirizzoTelematico value) {
        this.indirizzoTelematico = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefono() {
        if (telefono == null) {
            telefono = new ArrayList<String>();
        }
        return this.telefono;
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFax() {
        if (fax == null) {
            fax = new ArrayList<String>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the indirizzoPostale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoPostale() {
        return indirizzoPostale;
    }

    /**
     * Sets the value of the indirizzoPostale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoPostale(String value) {
        this.indirizzoPostale = value;
    }

    /**
     * Gets the value of the indirizzoPostaleItem property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoPostaleType }
     *     
     */
    public IndirizzoPostaleType getIndirizzoPostaleItem() {
        return indirizzoPostaleItem;
    }

    /**
     * Sets the value of the indirizzoPostaleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoPostaleType }
     *     
     */
    public void setIndirizzoPostaleItem(IndirizzoPostaleType value) {
        this.indirizzoPostaleItem = value;
    }

}
