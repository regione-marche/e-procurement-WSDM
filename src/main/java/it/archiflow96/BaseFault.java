
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternalCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsComErrorInternalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFault", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", propOrder = {
    "internalCode",
    "isComErrorInternalCode",
    "message",
    "name"
})
@XmlSeeAlso({
    PostingFault.class,
    NoRightsFault.class,
    PostingMailServiceNoSenderFault.class,
    PostingMailServiceMaxRecipientsFault.class,
    PostingMailServiceNoRecipientsFault.class,
    ParamValidationFault.class,
    InvalidSessionFault.class
})
public class BaseFault {

    @XmlElement(name = "InternalCode")
    protected Integer internalCode;
    @XmlElement(name = "IsComErrorInternalCode")
    protected Boolean isComErrorInternalCode;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;

    /**
     * Gets the value of the internalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInternalCode() {
        return internalCode;
    }

    /**
     * Sets the value of the internalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInternalCode(Integer value) {
        this.internalCode = value;
    }

    /**
     * Gets the value of the isComErrorInternalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComErrorInternalCode() {
        return isComErrorInternalCode;
    }

    /**
     * Sets the value of the isComErrorInternalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComErrorInternalCode(Boolean value) {
        this.isComErrorInternalCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
