
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiEmergenza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiEmergenza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataCreazioneEmergenza" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdProfiloProtocollo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdProtocolloEmergenza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Segnatura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiEmergenza", propOrder = {
    "data",
    "dataCreazioneEmergenza",
    "idProfiloProtocollo",
    "idProtocolloEmergenza",
    "numero",
    "segnatura"
})
public class DatiEmergenza {

    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "DataCreazioneEmergenza", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreazioneEmergenza;
    @XmlElement(name = "IdProfiloProtocollo")
    protected int idProfiloProtocollo;
    @XmlElement(name = "IdProtocolloEmergenza")
    protected int idProtocolloEmergenza;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "Segnatura", required = true, nillable = true)
    protected String segnatura;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the dataCreazioneEmergenza property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreazioneEmergenza() {
        return dataCreazioneEmergenza;
    }

    /**
     * Sets the value of the dataCreazioneEmergenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreazioneEmergenza(XMLGregorianCalendar value) {
        this.dataCreazioneEmergenza = value;
    }

    /**
     * Gets the value of the idProfiloProtocollo property.
     * 
     */
    public int getIdProfiloProtocollo() {
        return idProfiloProtocollo;
    }

    /**
     * Sets the value of the idProfiloProtocollo property.
     * 
     */
    public void setIdProfiloProtocollo(int value) {
        this.idProfiloProtocollo = value;
    }

    /**
     * Gets the value of the idProtocolloEmergenza property.
     * 
     */
    public int getIdProtocolloEmergenza() {
        return idProtocolloEmergenza;
    }

    /**
     * Sets the value of the idProtocolloEmergenza property.
     * 
     */
    public void setIdProtocolloEmergenza(int value) {
        this.idProtocolloEmergenza = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Gets the value of the segnatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnatura() {
        return segnatura;
    }

    /**
     * Sets the value of the segnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnatura(String value) {
        this.segnatura = value;
    }

}
