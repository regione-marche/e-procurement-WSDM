
package it.easydoc.MailManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyContentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyContentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="MailTemplateItem" type="{http://www.consorziocsa.it/easydoc/ws}MailTemplateItem"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyContentItem", propOrder = {
    "body",
    "mailTemplateItem"
})
public class BodyContentItem {

    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "MailTemplateItem")
    protected MailTemplateItem mailTemplateItem;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the mailTemplateItem property.
     * 
     * @return
     *     possible object is
     *     {@link MailTemplateItem }
     *     
     */
    public MailTemplateItem getMailTemplateItem() {
        return mailTemplateItem;
    }

    /**
     * Sets the value of the mailTemplateItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailTemplateItem }
     *     
     */
    public void setMailTemplateItem(MailTemplateItem value) {
        this.mailTemplateItem = value;
    }

}
