
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetExtMailSettingsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExtMailSettingsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ExtendedEMailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalEMailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxEmailToSend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OnlyIndexesAndDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendSingleEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExtMailSettingsOutput", propOrder = {
    "extendedEMailEnabled",
    "externalEMailEnabled",
    "maxEmailToSend",
    "onlyIndexesAndDoc",
    "sendAll",
    "sendSingleEmail",
    "userSelected"
})
public class GetExtMailSettingsOutput
    extends BaseOutput
{

    @XmlElement(name = "ExtendedEMailEnabled")
    protected Boolean extendedEMailEnabled;
    @XmlElement(name = "ExternalEMailEnabled")
    protected Boolean externalEMailEnabled;
    @XmlElement(name = "MaxEmailToSend")
    protected Integer maxEmailToSend;
    @XmlElement(name = "OnlyIndexesAndDoc")
    protected Boolean onlyIndexesAndDoc;
    @XmlElement(name = "SendAll")
    protected Boolean sendAll;
    @XmlElement(name = "SendSingleEmail")
    protected Boolean sendSingleEmail;
    @XmlElement(name = "UserSelected")
    protected Boolean userSelected;

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
     * Gets the value of the maxEmailToSend property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEmailToSend() {
        return maxEmailToSend;
    }

    /**
     * Sets the value of the maxEmailToSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEmailToSend(Integer value) {
        this.maxEmailToSend = value;
    }

    /**
     * Gets the value of the onlyIndexesAndDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyIndexesAndDoc() {
        return onlyIndexesAndDoc;
    }

    /**
     * Sets the value of the onlyIndexesAndDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyIndexesAndDoc(Boolean value) {
        this.onlyIndexesAndDoc = value;
    }

    /**
     * Gets the value of the sendAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAll() {
        return sendAll;
    }

    /**
     * Sets the value of the sendAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAll(Boolean value) {
        this.sendAll = value;
    }

    /**
     * Gets the value of the sendSingleEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendSingleEmail() {
        return sendSingleEmail;
    }

    /**
     * Sets the value of the sendSingleEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendSingleEmail(Boolean value) {
        this.sendSingleEmail = value;
    }

    /**
     * Gets the value of the userSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserSelected() {
        return userSelected;
    }

    /**
     * Sets the value of the userSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserSelected(Boolean value) {
        this.userSelected = value;
    }

}
