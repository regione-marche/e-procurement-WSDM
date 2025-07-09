
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for respProtocolloArrivo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respProtocolloArrivo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}respProtocollo">
 *       &lt;sequence>
 *         &lt;element name="DataArrivo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Mittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolloMittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respProtocolloArrivo", propOrder = {
    "dataArrivo",
    "mittente",
    "protocolloMittente"
})
public class RespProtocolloArrivo
    extends RespProtocollo
{

    @XmlElement(name = "DataArrivo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataArrivo;
    @XmlElement(name = "Mittente", nillable = true)
    protected String mittente;
    @XmlElement(name = "ProtocolloMittente", nillable = true)
    protected String protocolloMittente;

    /**
     * Gets the value of the dataArrivo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataArrivo() {
        return dataArrivo;
    }

    /**
     * Sets the value of the dataArrivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataArrivo(XMLGregorianCalendar value) {
        this.dataArrivo = value;
    }

    /**
     * Gets the value of the mittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMittente() {
        return mittente;
    }

    /**
     * Sets the value of the mittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMittente(String value) {
        this.mittente = value;
    }

    /**
     * Gets the value of the protocolloMittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolloMittente() {
        return protocolloMittente;
    }

    /**
     * Sets the value of the protocolloMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolloMittente(String value) {
        this.protocolloMittente = value;
    }

}
