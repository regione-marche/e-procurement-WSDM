
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentumOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentumOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnnoProtocollo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataProtocollo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Registri" type="{http://tempuri.org/}ArrayOfRegistroOut" minOccurs="0"/>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentumOut", propOrder = {
    "idDocumento",
    "annoProtocollo",
    "numeroProtocollo",
    "dataProtocollo",
    "registri",
    "messaggio",
    "errore"
})
public class DocumentumOut {

    @XmlElement(name = "IdDocumento")
    protected int idDocumento;
    @XmlElement(name = "AnnoProtocollo")
    protected short annoProtocollo;
    @XmlElement(name = "NumeroProtocollo")
    protected int numeroProtocollo;
    @XmlElement(name = "DataProtocollo", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataProtocollo;
    @XmlElement(name = "Registri", nillable = true)
    protected ArrayOfRegistroOut registri;
    @XmlElement(name = "Messaggio", nillable = true)
    protected String messaggio;
    @XmlElement(name = "Errore", nillable = true)
    protected String errore;

    /**
     * Gets the value of the idDocumento property.
     * 
     */
    public int getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     */
    public void setIdDocumento(int value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the annoProtocollo property.
     * 
     */
    public short getAnnoProtocollo() {
        return annoProtocollo;
    }

    /**
     * Sets the value of the annoProtocollo property.
     * 
     */
    public void setAnnoProtocollo(short value) {
        this.annoProtocollo = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     */
    public int getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     */
    public void setNumeroProtocollo(int value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocollo(XMLGregorianCalendar value) {
        this.dataProtocollo = value;
    }

    /**
     * Gets the value of the registri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegistroOut }
     *     
     */
    public ArrayOfRegistroOut getRegistri() {
        return registri;
    }

    /**
     * Sets the value of the registri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegistroOut }
     *     
     */
    public void setRegistri(ArrayOfRegistroOut value) {
        this.registri = value;
    }

    /**
     * Gets the value of the messaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the value of the messaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

}
