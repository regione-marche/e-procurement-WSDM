
package org.datacontract.schemas._2004._07.siav_common_baseclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseVisibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseVisibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VisGroups" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfEntityAccess" minOccurs="0"/>
 *         &lt;element name="VisOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfEntityAccess" minOccurs="0"/>
 *         &lt;element name="VisUsers" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}ArrayOfEntityAccess" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVisibility", propOrder = {
    "visAll",
    "visGroups",
    "visOffices",
    "visUsers"
})
public class BaseVisibility {

    @XmlElement(name = "VisAll")
    protected Boolean visAll;
    @XmlElementRef(name = "VisGroups", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEntityAccess> visGroups;
    @XmlElementRef(name = "VisOffices", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEntityAccess> visOffices;
    @XmlElementRef(name = "VisUsers", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", type = JAXBElement.class)
    protected JAXBElement<ArrayOfEntityAccess> visUsers;

    /**
     * Gets the value of the visAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisAll() {
        return visAll;
    }

    /**
     * Sets the value of the visAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisAll(Boolean value) {
        this.visAll = value;
    }

    /**
     * Gets the value of the visGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEntityAccess> getVisGroups() {
        return visGroups;
    }

    /**
     * Sets the value of the visGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}
     *     
     */
    public void setVisGroups(JAXBElement<ArrayOfEntityAccess> value) {
        this.visGroups = ((JAXBElement<ArrayOfEntityAccess> ) value);
    }

    /**
     * Gets the value of the visOffices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEntityAccess> getVisOffices() {
        return visOffices;
    }

    /**
     * Sets the value of the visOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}
     *     
     */
    public void setVisOffices(JAXBElement<ArrayOfEntityAccess> value) {
        this.visOffices = ((JAXBElement<ArrayOfEntityAccess> ) value);
    }

    /**
     * Gets the value of the visUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEntityAccess> getVisUsers() {
        return visUsers;
    }

    /**
     * Sets the value of the visUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityAccess }{@code >}
     *     
     */
    public void setVisUsers(JAXBElement<ArrayOfEntityAccess> value) {
        this.visUsers = ((JAXBElement<ArrayOfEntityAccess> ) value);
    }

}
