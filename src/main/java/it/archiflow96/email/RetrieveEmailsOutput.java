
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveEmailsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEmailsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="MailsHeaders" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}ArrayOfMailInHeaders" minOccurs="0"/>
 *         &lt;element name="TotCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEmailsOutput", propOrder = {
    "mailsHeaders",
    "totCount"
})
public class RetrieveEmailsOutput
    extends BaseOutput
{

    @XmlElement(name = "MailsHeaders", nillable = true)
    protected ArrayOfMailInHeaders mailsHeaders;
    @XmlElement(name = "TotCount")
    protected Integer totCount;

    /**
     * Gets the value of the mailsHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailInHeaders }
     *     
     */
    public ArrayOfMailInHeaders getMailsHeaders() {
        return mailsHeaders;
    }

    /**
     * Sets the value of the mailsHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailInHeaders }
     *     
     */
    public void setMailsHeaders(ArrayOfMailInHeaders value) {
        this.mailsHeaders = value;
    }

    /**
     * Gets the value of the totCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotCount() {
        return totCount;
    }

    /**
     * Sets the value of the totCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotCount(Integer value) {
        this.totCount = value;
    }

}
