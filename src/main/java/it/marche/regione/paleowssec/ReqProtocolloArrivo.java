
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reqProtocolloArrivo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqProtocolloArrivo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}reqProtocollo">
 *       &lt;sequence>
 *         &lt;element name="DataArrivo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataProtocolloMittente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Mittente" type="{http://paleo.regione.marche.it/services/}Corrispondente"/>
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
@XmlType(name = "reqProtocolloArrivo", propOrder = {
    "dataArrivo",
    "dataProtocolloMittente",
    "mittente",
    "protocolloMittente"
})
public class ReqProtocolloArrivo
    extends ReqProtocollo
{

    @XmlElement(name = "DataArrivo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataArrivo;
    @XmlElement(name = "DataProtocolloMittente")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataProtocolloMittente;
    @XmlElement(name = "Mittente", required = true, nillable = true)
    protected Corrispondente mittente;
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
     * Gets the value of the dataProtocolloMittente property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocolloMittente() {
        return dataProtocolloMittente;
    }

    /**
     * Sets the value of the dataProtocolloMittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocolloMittente(XMLGregorianCalendar value) {
        this.dataProtocolloMittente = value;
    }

    /**
     * Gets the value of the mittente property.
     * 
     * @return
     *     possible object is
     *     {@link Corrispondente }
     *     
     */
    public Corrispondente getMittente() {
        return mittente;
    }

    /**
     * Sets the value of the mittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corrispondente }
     *     
     */
    public void setMittente(Corrispondente value) {
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
