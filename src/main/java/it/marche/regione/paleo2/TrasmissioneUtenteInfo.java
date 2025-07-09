
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrasmissioneUtenteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrasmissioneUtenteInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}TrasmissioneUtente">
 *       &lt;sequence>
 *         &lt;element name="DataAccettazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataRifiuto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataRisposta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataVista" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NoteAccettazioneRifiuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasmissioneUtenteInfo", propOrder = {
    "dataAccettazione",
    "dataRifiuto",
    "dataRisposta",
    "dataVista",
    "noteAccettazioneRifiuto"
})
public class TrasmissioneUtenteInfo
    extends TrasmissioneUtente
{

    @XmlElement(name = "DataAccettazione", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAccettazione;
    @XmlElement(name = "DataRifiuto", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRifiuto;
    @XmlElement(name = "DataRisposta", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRisposta;
    @XmlElement(name = "DataVista", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVista;
    @XmlElement(name = "NoteAccettazioneRifiuto", nillable = true)
    protected String noteAccettazioneRifiuto;

    /**
     * Gets the value of the dataAccettazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAccettazione() {
        return dataAccettazione;
    }

    /**
     * Sets the value of the dataAccettazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAccettazione(XMLGregorianCalendar value) {
        this.dataAccettazione = value;
    }

    /**
     * Gets the value of the dataRifiuto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRifiuto() {
        return dataRifiuto;
    }

    /**
     * Sets the value of the dataRifiuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRifiuto(XMLGregorianCalendar value) {
        this.dataRifiuto = value;
    }

    /**
     * Gets the value of the dataRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRisposta() {
        return dataRisposta;
    }

    /**
     * Sets the value of the dataRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRisposta(XMLGregorianCalendar value) {
        this.dataRisposta = value;
    }

    /**
     * Gets the value of the dataVista property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVista() {
        return dataVista;
    }

    /**
     * Sets the value of the dataVista property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVista(XMLGregorianCalendar value) {
        this.dataVista = value;
    }

    /**
     * Gets the value of the noteAccettazioneRifiuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteAccettazioneRifiuto() {
        return noteAccettazioneRifiuto;
    }

    /**
     * Sets the value of the noteAccettazioneRifiuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteAccettazioneRifiuto(String value) {
        this.noteAccettazioneRifiuto = value;
    }

}
