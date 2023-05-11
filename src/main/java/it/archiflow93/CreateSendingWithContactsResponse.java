
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CreateSendingWithContactsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="sendingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "createSendingWithContactsResult",
    "sendingId"
})
@XmlRootElement(name = "CreateSendingWithContactsResponse")
public class CreateSendingWithContactsResponse {

    @XmlElement(name = "CreateSendingWithContactsResult")
    protected ResultInfo createSendingWithContactsResult;
    protected Integer sendingId;

    /**
     * Gets the value of the createSendingWithContactsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCreateSendingWithContactsResult() {
        return createSendingWithContactsResult;
    }

    /**
     * Sets the value of the createSendingWithContactsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCreateSendingWithContactsResult(ResultInfo value) {
        this.createSendingWithContactsResult = value;
    }

    /**
     * Gets the value of the sendingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendingId() {
        return sendingId;
    }

    /**
     * Sets the value of the sendingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendingId(Integer value) {
        this.sendingId = value;
    }

}
