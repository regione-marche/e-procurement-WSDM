
package org.datacontract.schemas._2004._07.siav_common_baseclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}TypeIdentifierComplete" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseNote", propOrder = {
    "creationData",
    "id",
    "nota",
    "userId"
})
public class BaseNote {

    @XmlElement(name = "CreationData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationData;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> id;
    @XmlElementRef(name = "Nota", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> nota;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<TypeIdentifierComplete> userId;

    /**
     * Gets the value of the creationData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationData() {
        return creationData;
    }

    /**
     * Sets the value of the creationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationData(XMLGregorianCalendar value) {
        this.creationData = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public JAXBElement<BaseIdentifier> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public void setId(JAXBElement<BaseIdentifier> value) {
        this.id = ((JAXBElement<BaseIdentifier> ) value);
    }

    /**
     * Gets the value of the nota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNota() {
        return nota;
    }

    /**
     * Sets the value of the nota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNota(JAXBElement<String> value) {
        this.nota = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TypeIdentifierComplete }{@code >}
     *     
     */
    public JAXBElement<TypeIdentifierComplete> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypeIdentifierComplete }{@code >}
     *     
     */
    public void setUserId(JAXBElement<TypeIdentifierComplete> value) {
        this.userId = ((JAXBElement<TypeIdentifierComplete> ) value);
    }

}
