
package it.archiflow96;

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
 *         &lt;element name="GetContactsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="contacts" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}ArrayOfAgrafCardContact" minOccurs="0"/>
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
    "getContactsResult",
    "contacts"
})
@XmlRootElement(name = "GetContactsResponse")
public class GetContactsResponse {

    @XmlElement(name = "GetContactsResult")
    protected ResultInfo getContactsResult;
    @XmlElement(nillable = true)
    protected ArrayOfAgrafCardContact contacts;

    /**
     * Gets the value of the getContactsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetContactsResult() {
        return getContactsResult;
    }

    /**
     * Sets the value of the getContactsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetContactsResult(ResultInfo value) {
        this.getContactsResult = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgrafCardContact }
     *     
     */
    public ArrayOfAgrafCardContact getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgrafCardContact }
     *     
     */
    public void setContacts(ArrayOfAgrafCardContact value) {
        this.contacts = value;
    }

}
