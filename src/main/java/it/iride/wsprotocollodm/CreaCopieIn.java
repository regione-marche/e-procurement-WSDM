
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreaCopieIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreaCopieIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FascicolaConOriginale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UODestinatarie" type="{http://tempuri.org/}ArrayOfUODestinataria" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreaCopieIn", propOrder = {
    "idDocumento",
    "annoProtocollo",
    "numeroProtocollo",
    "fascicolaConOriginale",
    "uoDestinatarie",
    "utente",
    "ruolo"
})
public class CreaCopieIn {

    @XmlElement(name = "IdDocumento")
    protected String idDocumento;
    @XmlElement(name = "AnnoProtocollo")
    protected String annoProtocollo;
    @XmlElement(name = "NumeroProtocollo")
    protected String numeroProtocollo;
    @XmlElement(name = "FascicolaConOriginale")
    protected String fascicolaConOriginale;
    @XmlElement(name = "UODestinatarie")
    protected ArrayOfUODestinataria uoDestinatarie;
    @XmlElement(name = "Utente")
    protected String utente;
    @XmlElement(name = "Ruolo")
    protected String ruolo;

    /**
     * Gets the value of the idDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the annoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoProtocollo() {
        return annoProtocollo;
    }

    /**
     * Sets the value of the annoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoProtocollo(String value) {
        this.annoProtocollo = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocollo(String value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the fascicolaConOriginale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFascicolaConOriginale() {
        return fascicolaConOriginale;
    }

    /**
     * Sets the value of the fascicolaConOriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFascicolaConOriginale(String value) {
        this.fascicolaConOriginale = value;
    }

    /**
     * Gets the value of the uoDestinatarie property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUODestinataria }
     *     
     */
    public ArrayOfUODestinataria getUODestinatarie() {
        return uoDestinatarie;
    }

    /**
     * Sets the value of the uoDestinatarie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUODestinataria }
     *     
     */
    public void setUODestinatarie(ArrayOfUODestinataria value) {
        this.uoDestinatarie = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Gets the value of the ruolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Sets the value of the ruolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

}
