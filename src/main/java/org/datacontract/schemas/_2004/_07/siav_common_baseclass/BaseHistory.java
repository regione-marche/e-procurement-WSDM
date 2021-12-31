
package org.datacontract.schemas._2004._07.siav_common_baseclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloHistory;


/**
 * <p>Java class for BaseHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdHistory" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="IdRes" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *         &lt;element name="OperationData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "BaseHistory", propOrder = {
    "description",
    "idHistory",
    "idRes",
    "operationData",
    "userId"
})
@XmlSeeAlso({
    FascicoloHistory.class
})
public class BaseHistory {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "IdHistory", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> idHistory;
    @XmlElementRef(name = "IdRes", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> idRes;
    @XmlElement(name = "OperationData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationData;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<TypeIdentifierComplete> userId;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public JAXBElement<BaseIdentifier> getIdHistory() {
        return idHistory;
    }

    /**
     * Sets the value of the idHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public void setIdHistory(JAXBElement<BaseIdentifier> value) {
        this.idHistory = ((JAXBElement<BaseIdentifier> ) value);
    }

    /**
     * Gets the value of the idRes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public JAXBElement<BaseIdentifier> getIdRes() {
        return idRes;
    }

    /**
     * Sets the value of the idRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public void setIdRes(JAXBElement<BaseIdentifier> value) {
        this.idRes = ((JAXBElement<BaseIdentifier> ) value);
    }

    /**
     * Gets the value of the operationData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationData() {
        return operationData;
    }

    /**
     * Sets the value of the operationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationData(XMLGregorianCalendar value) {
        this.operationData = value;
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
