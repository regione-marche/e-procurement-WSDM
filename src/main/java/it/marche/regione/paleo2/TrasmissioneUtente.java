
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrasmissioneUtente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrasmissioneUtente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceRagione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatoreDestinatario" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasmissioneUtente", propOrder = {
    "codiceRagione",
    "dataScadenza",
    "note",
    "operatoreDestinatario"
})
@XmlSeeAlso({
    TrasmissioneUtenteInfo.class
})
public class TrasmissioneUtente {

    @XmlElement(name = "CodiceRagione", nillable = true)
    protected String codiceRagione;
    @XmlElement(name = "DataScadenza", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataScadenza;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "OperatoreDestinatario", nillable = true)
    protected OperatorePaleo operatoreDestinatario;

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

    /**
     * Gets the value of the operatoreDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOperatoreDestinatario() {
        return operatoreDestinatario;
    }

    /**
     * Sets the value of the operatoreDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOperatoreDestinatario(OperatorePaleo value) {
        this.operatoreDestinatario = value;
    }

}
