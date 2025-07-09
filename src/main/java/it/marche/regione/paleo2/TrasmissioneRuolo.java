
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrasmissioneRuolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrasmissioneRuolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceRagione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceRuoloDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceUODestinataria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasmissioneRuolo", propOrder = {
    "codiceRagione",
    "codiceRuoloDestinatario",
    "codiceUODestinataria",
    "dataScadenza",
    "note"
})
@XmlSeeAlso({
    TrasmissioneRuoloInfo.class
})
public class TrasmissioneRuolo {

    @XmlElement(name = "CodiceRagione", nillable = true)
    protected String codiceRagione;
    @XmlElement(name = "CodiceRuoloDestinatario", nillable = true)
    protected String codiceRuoloDestinatario;
    @XmlElement(name = "CodiceUODestinataria", nillable = true)
    protected String codiceUODestinataria;
    @XmlElement(name = "DataScadenza", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataScadenza;
    @XmlElement(name = "Note", nillable = true)
    protected String note;

    /**
     * Gets the value of the codiceRagione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRagione() {
        return codiceRagione;
    }

    /**
     * Sets the value of the codiceRagione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRagione(String value) {
        this.codiceRagione = value;
    }

    /**
     * Gets the value of the codiceRuoloDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRuoloDestinatario() {
        return codiceRuoloDestinatario;
    }

    /**
     * Sets the value of the codiceRuoloDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRuoloDestinatario(String value) {
        this.codiceRuoloDestinatario = value;
    }

    /**
     * Gets the value of the codiceUODestinataria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUODestinataria() {
        return codiceUODestinataria;
    }

    /**
     * Sets the value of the codiceUODestinataria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUODestinataria(String value) {
        this.codiceUODestinataria = value;
    }

    /**
     * Gets the value of the dataScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Sets the value of the dataScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataScadenza(XMLGregorianCalendar value) {
        this.dataScadenza = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
