
package it.dedagroup.ws.protocolla.servizi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="verso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anagraficaMittDest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indirizzoMittDest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cfpivaMittDest" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titolario" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ufficioDestProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protPrecedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceResponsabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceTipoSpedizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "verso",
    "dataProtocollo",
    "oraProtocollo",
    "anagraficaMittDest",
    "indirizzoMittDest",
    "cfpivaMittDest",
    "oggetto",
    "titolario",
    "ufficioDestProv",
    "note",
    "protPrecedente",
    "codiceResponsabile",
    "codiceTipoSpedizione"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElementRef(name = "id", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "password", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "verso", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> verso;
    @XmlElementRef(name = "dataProtocollo", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> dataProtocollo;
    @XmlElementRef(name = "oraProtocollo", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> oraProtocollo;
    @XmlElement(nillable = true)
    protected List<String> anagraficaMittDest;
    @XmlElement(nillable = true)
    protected List<String> indirizzoMittDest;
    @XmlElement(nillable = true)
    protected List<String> cfpivaMittDest;
    @XmlElementRef(name = "oggetto", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> oggetto;
    @XmlElement(nillable = true)
    protected List<String> titolario;
    @XmlElementRef(name = "ufficioDestProv", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> ufficioDestProv;
    @XmlElementRef(name = "note", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> note;
    @XmlElementRef(name = "protPrecedente", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> protPrecedente;
    @XmlElementRef(name = "codiceResponsabile", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> codiceResponsabile;
    @XmlElementRef(name = "codiceTipoSpedizione", namespace = "http://servizi.protocollo.ws.dedagroup.it", type = JAXBElement.class)
    protected JAXBElement<String> codiceTipoSpedizione;

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
     * Gets the value of the verso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerso() {
        return verso;
    }

    /**
     * Sets the value of the verso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerso(JAXBElement<String> value) {
        this.verso = ((JAXBElement<String> ) value);
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
     * Gets the value of the oraProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOraProtocollo() {
        return oraProtocollo;
    }

    /**
     * Sets the value of the oraProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOraProtocollo(JAXBElement<String> value) {
        this.oraProtocollo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the anagraficaMittDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anagraficaMittDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnagraficaMittDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnagraficaMittDest() {
        if (anagraficaMittDest == null) {
            anagraficaMittDest = new ArrayList<String>();
        }
        return this.anagraficaMittDest;
    }

    /**
     * Gets the value of the indirizzoMittDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indirizzoMittDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndirizzoMittDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIndirizzoMittDest() {
        if (indirizzoMittDest == null) {
            indirizzoMittDest = new ArrayList<String>();
        }
        return this.indirizzoMittDest;
    }

    /**
     * Gets the value of the cfpivaMittDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfpivaMittDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfpivaMittDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCfpivaMittDest() {
        if (cfpivaMittDest == null) {
            cfpivaMittDest = new ArrayList<String>();
        }
        return this.cfpivaMittDest;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOggetto(JAXBElement<String> value) {
        this.oggetto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the titolario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titolario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitolario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitolario() {
        if (titolario == null) {
            titolario = new ArrayList<String>();
        }
        return this.titolario;
    }

    /**
     * Gets the value of the ufficioDestProv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUfficioDestProv() {
        return ufficioDestProv;
    }

    /**
     * Sets the value of the ufficioDestProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUfficioDestProv(JAXBElement<String> value) {
        this.ufficioDestProv = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the protPrecedente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtPrecedente() {
        return protPrecedente;
    }

    /**
     * Sets the value of the protPrecedente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtPrecedente(JAXBElement<String> value) {
        this.protPrecedente = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codiceResponsabile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceResponsabile() {
        return codiceResponsabile;
    }

    /**
     * Sets the value of the codiceResponsabile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceResponsabile(JAXBElement<String> value) {
        this.codiceResponsabile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codiceTipoSpedizione property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceTipoSpedizione() {
        return codiceTipoSpedizione;
    }

    /**
     * Sets the value of the codiceTipoSpedizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceTipoSpedizione(JAXBElement<String> value) {
        this.codiceTipoSpedizione = ((JAXBElement<String> ) value);
    }

}
