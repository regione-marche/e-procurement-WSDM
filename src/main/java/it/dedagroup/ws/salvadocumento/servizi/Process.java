
package it.dedagroup.ws.salvadocumento.servizi;

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
 *         &lt;element name="nomeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daConservare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nomeFile",
    "documento",
    "tipope",
    "daConservare"
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
    @XmlElementRef(name = "nomeFile", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> nomeFile;
    @XmlElementRef(name = "documento", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> documento;
    @XmlElementRef(name = "tipope", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> tipope;
    @XmlElementRef(name = "daConservare", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> daConservare;

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
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeFile(JAXBElement<String> value) {
        this.nomeFile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumento(JAXBElement<String> value) {
        this.documento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipope() {
        return tipope;
    }

    /**
     * Sets the value of the tipope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipope(JAXBElement<String> value) {
        this.tipope = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the daConservare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDaConservare() {
        return daConservare;
    }

    /**
     * Sets the value of the daConservare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDaConservare(JAXBElement<String> value) {
        this.daConservare = ((JAXBElement<String> ) value);
    }

}
