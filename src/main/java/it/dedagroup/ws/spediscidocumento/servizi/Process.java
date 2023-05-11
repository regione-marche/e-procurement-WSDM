
package it.dedagroup.ws.spediscidocumento.servizi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggettoMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testoMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mittenteMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatarioMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "password",
    "numProtocollo",
    "dataProtocollo",
    "idDocumento",
    "oggettoMail",
    "testoMail",
    "mittenteMail",
    "destinatarioMail"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElementRef(name = "id", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "password", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "numProtocollo", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> numProtocollo;
    @XmlElementRef(name = "dataProtocollo", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> dataProtocollo;
    @XmlElementRef(name = "idDocumento", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> idDocumento;
    @XmlElementRef(name = "oggettoMail", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> oggettoMail;
    @XmlElementRef(name = "testoMail", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> testoMail;
    @XmlElementRef(name = "mittenteMail", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> mittenteMail;
    @XmlElementRef(name = "destinatarioMail", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> destinatarioMail;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumProtocollo() {
        return numProtocollo;
    }

    /**
     * Sets the value of the numProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumProtocollo(JAXBElement<String> value) {
        this.numProtocollo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataProtocollo() {
        return dataProtocollo;
    }

    /**
     * Sets the value of the dataProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataProtocollo(JAXBElement<String> value) {
        this.dataProtocollo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdDocumento(JAXBElement<String> value) {
        this.idDocumento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oggettoMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOggettoMail() {
        return oggettoMail;
    }

    /**
     * Sets the value of the oggettoMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOggettoMail(JAXBElement<String> value) {
        this.oggettoMail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the testoMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTestoMail() {
        return testoMail;
    }

    /**
     * Sets the value of the testoMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTestoMail(JAXBElement<String> value) {
        this.testoMail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mittenteMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMittenteMail() {
        return mittenteMail;
    }

    /**
     * Sets the value of the mittenteMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMittenteMail(JAXBElement<String> value) {
        this.mittenteMail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the destinatarioMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinatarioMail() {
        return destinatarioMail;
    }

    /**
     * Sets the value of the destinatarioMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinatarioMail(JAXBElement<String> value) {
        this.destinatarioMail = ((JAXBElement<String> ) value);
    }

}
