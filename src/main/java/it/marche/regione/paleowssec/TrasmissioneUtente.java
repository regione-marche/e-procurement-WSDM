
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="DataScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatoreDestinatario" type="{http://paleo.regione.marche.it/services/}OperatorePaleo"/>
 *         &lt;element name="Ragione" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "dataScadenza",
    "note",
    "operatoreDestinatario",
    "ragione"
})
public class TrasmissioneUtente {

    @XmlElement(name = "DataScadenza")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataScadenza;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "OperatoreDestinatario", required = true, nillable = true)
    protected OperatorePaleo operatoreDestinatario;
    @XmlElement(name = "Ragione", required = true, nillable = true)
    protected String ragione;

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

    /**
     * Gets the value of the ragione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRagione() {
        return ragione;
    }

    /**
     * Sets the value of the ragione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRagione(String value) {
        this.ragione = value;
    }

}
