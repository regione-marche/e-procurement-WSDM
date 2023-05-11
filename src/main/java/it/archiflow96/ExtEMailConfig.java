
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtEMailConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtEMailConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedEMailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExtendedEMailOptions" minOccurs="0"/>
 *         &lt;element name="ExternalEMailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendAllInOneEMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendSystemDefaut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UrlWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtEMailConfig", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "extendedEMailEnabled",
    "extendedOptions",
    "externalEMailEnabled",
    "sendAllInOneEMail",
    "sendSystemDefaut",
    "urlWeb"
})
public class ExtEMailConfig {

    @XmlElement(name = "ExtendedEMailEnabled")
    protected Boolean extendedEMailEnabled;
    @XmlElement(name = "ExtendedOptions", nillable = true)
    protected ExtendedEMailOptions extendedOptions;
    @XmlElement(name = "ExternalEMailEnabled")
    protected Boolean externalEMailEnabled;
    @XmlElement(name = "SendAllInOneEMail")
    protected Boolean sendAllInOneEMail;
    @XmlElement(name = "SendSystemDefaut")
    protected Boolean sendSystemDefaut;
    @XmlElement(name = "UrlWeb", nillable = true)
    protected String urlWeb;

    /**
     * Gets the value of the extendedEMailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedEMailEnabled() {
        return extendedEMailEnabled;
    }

    /**
     * Sets the value of the extendedEMailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedEMailEnabled(Boolean value) {
        this.extendedEMailEnabled = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedEMailOptions }
     *     
     */
    public ExtendedEMailOptions getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedEMailOptions }
     *     
     */
    public void setExtendedOptions(ExtendedEMailOptions value) {
        this.extendedOptions = value;
    }

    /**
     * Gets the value of the externalEMailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalEMailEnabled() {
        return externalEMailEnabled;
    }

    /**
     * Sets the value of the externalEMailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalEMailEnabled(Boolean value) {
        this.externalEMailEnabled = value;
    }

    /**
     * Gets the value of the sendAllInOneEMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAllInOneEMail() {
        return sendAllInOneEMail;
    }

    /**
     * Sets the value of the sendAllInOneEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAllInOneEMail(Boolean value) {
        this.sendAllInOneEMail = value;
    }

    /**
     * Gets the value of the sendSystemDefaut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendSystemDefaut() {
        return sendSystemDefaut;
    }

    /**
     * Sets the value of the sendSystemDefaut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendSystemDefaut(Boolean value) {
        this.sendSystemDefaut = value;
    }

    /**
     * Gets the value of the urlWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlWeb() {
        return urlWeb;
    }

    /**
     * Sets the value of the urlWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlWeb(String value) {
        this.urlWeb = value;
    }

}
