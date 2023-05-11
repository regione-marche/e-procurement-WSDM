
package org.datacontract.schemas._2004._07.siav_common_baseclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseVisibilityDesc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseVisibilityDesc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescGroups" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfTypeIdentifier" minOccurs="0"/>
 *         &lt;element name="DescOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfTypeIdentifier" minOccurs="0"/>
 *         &lt;element name="DescUsers" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfTypeIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVisibilityDesc", propOrder = {
    "descGroups",
    "descOffices",
    "descUsers"
})
public class BaseVisibilityDesc {

    @XmlElementRef(name = "DescGroups", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTypeIdentifier> descGroups;
    @XmlElementRef(name = "DescOffices", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTypeIdentifier> descOffices;
    @XmlElementRef(name = "DescUsers", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTypeIdentifier> descUsers;

    /**
     * Gets the value of the descGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTypeIdentifier> getDescGroups() {
        return descGroups;
    }

    /**
     * Sets the value of the descGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}
     *     
     */
    public void setDescGroups(JAXBElement<ArrayOfTypeIdentifier> value) {
        this.descGroups = ((JAXBElement<ArrayOfTypeIdentifier> ) value);
    }

    /**
     * Gets the value of the descOffices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTypeIdentifier> getDescOffices() {
        return descOffices;
    }

    /**
     * Sets the value of the descOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}
     *     
     */
    public void setDescOffices(JAXBElement<ArrayOfTypeIdentifier> value) {
        this.descOffices = ((JAXBElement<ArrayOfTypeIdentifier> ) value);
    }

    /**
     * Gets the value of the descUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTypeIdentifier> getDescUsers() {
        return descUsers;
    }

    /**
     * Sets the value of the descUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTypeIdentifier }{@code >}
     *     
     */
    public void setDescUsers(JAXBElement<ArrayOfTypeIdentifier> value) {
        this.descUsers = ((JAXBElement<ArrayOfTypeIdentifier> ) value);
    }

}
