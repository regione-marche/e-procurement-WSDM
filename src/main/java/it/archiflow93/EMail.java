
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}EMailBase">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfEMailAttachment" minOccurs="0"/>
 *         &lt;element name="BodyHTML" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMail", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject", propOrder = {
    "attachments",
    "bodyHTML"
})
public class EMail
    extends EMailBase
{

    @XmlElement(name = "Attachments", nillable = true)
    protected ArrayOfEMailAttachment attachments;
    @XmlElement(name = "BodyHTML")
    protected Boolean bodyHTML;

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEMailAttachment }
     *     
     */
    public ArrayOfEMailAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEMailAttachment }
     *     
     */
    public void setAttachments(ArrayOfEMailAttachment value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the bodyHTML property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBodyHTML() {
        return bodyHTML;
    }

    /**
     * Sets the value of the bodyHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBodyHTML(Boolean value) {
        this.bodyHTML = value;
    }

}
