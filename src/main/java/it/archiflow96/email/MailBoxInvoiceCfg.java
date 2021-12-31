
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailBoxInvoiceCfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailBoxInvoiceCfg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnabledSenderDataRetrieval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="InvalidExtensions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SaveInvalidInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendersIndexBookIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailBoxInvoiceCfg", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "enabled",
    "enabledSenderDataRetrieval",
    "extensions",
    "invalidExtensions",
    "saveInvalidInvoice",
    "sendersIndexBookIds"
})
public class MailBoxInvoiceCfg {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "EnabledSenderDataRetrieval")
    protected Boolean enabledSenderDataRetrieval;
    @XmlElement(name = "Extensions", nillable = true)
    protected ArrayOfstring extensions;
    @XmlElement(name = "InvalidExtensions", nillable = true)
    protected ArrayOfstring invalidExtensions;
    @XmlElement(name = "SaveInvalidInvoice")
    protected Boolean saveInvalidInvoice;
    @XmlElement(name = "SendersIndexBookIds", nillable = true)
    protected ArrayOfguid sendersIndexBookIds;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the enabledSenderDataRetrieval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledSenderDataRetrieval() {
        return enabledSenderDataRetrieval;
    }

    /**
     * Sets the value of the enabledSenderDataRetrieval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledSenderDataRetrieval(Boolean value) {
        this.enabledSenderDataRetrieval = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setExtensions(ArrayOfstring value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the invalidExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getInvalidExtensions() {
        return invalidExtensions;
    }

    /**
     * Sets the value of the invalidExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setInvalidExtensions(ArrayOfstring value) {
        this.invalidExtensions = value;
    }

    /**
     * Gets the value of the saveInvalidInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveInvalidInvoice() {
        return saveInvalidInvoice;
    }

    /**
     * Sets the value of the saveInvalidInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveInvalidInvoice(Boolean value) {
        this.saveInvalidInvoice = value;
    }

    /**
     * Gets the value of the sendersIndexBookIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getSendersIndexBookIds() {
        return sendersIndexBookIds;
    }

    /**
     * Sets the value of the sendersIndexBookIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setSendersIndexBookIds(ArrayOfguid value) {
        this.sendersIndexBookIds = value;
    }

}
