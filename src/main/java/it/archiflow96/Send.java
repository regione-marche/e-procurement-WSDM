
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element name="sessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="sending" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}Sending" minOccurs="0"/>
 *         &lt;element name="attachmentCodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="options" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendOption" minOccurs="0"/>
 *         &lt;element name="eEMailVisType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailVisType" minOccurs="0"/>
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
    "sessionInfo",
    "sending",
    "attachmentCodes",
    "options",
    "eeMailVisType"
})
@XmlRootElement(name = "Send")
public class Send {

    @XmlElement(nillable = true)
    protected SessionInfo sessionInfo;
    @XmlElement(nillable = true)
    protected Sending sending;
    @XmlElement(nillable = true)
    protected ArrayOfint attachmentCodes;
    @XmlList
    protected List<String> options;
    @XmlElement(name = "eEMailVisType")
    protected EMailVisType eeMailVisType;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setSessionInfo(SessionInfo value) {
        this.sessionInfo = value;
    }

    /**
     * Gets the value of the sending property.
     * 
     * @return
     *     possible object is
     *     {@link Sending }
     *     
     */
    public Sending getSending() {
        return sending;
    }

    /**
     * Sets the value of the sending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sending }
     *     
     */
    public void setSending(Sending value) {
        this.sending = value;
    }

    /**
     * Gets the value of the attachmentCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getAttachmentCodes() {
        return attachmentCodes;
    }

    /**
     * Sets the value of the attachmentCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setAttachmentCodes(ArrayOfint value) {
        this.attachmentCodes = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOptions() {
        if (options == null) {
            options = new ArrayList<String>();
        }
        return this.options;
    }

    /**
     * Gets the value of the eeMailVisType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailVisType }
     *     
     */
    public EMailVisType getEEMailVisType() {
        return eeMailVisType;
    }

    /**
     * Sets the value of the eeMailVisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailVisType }
     *     
     */
    public void setEEMailVisType(EMailVisType value) {
        this.eeMailVisType = value;
    }

}
