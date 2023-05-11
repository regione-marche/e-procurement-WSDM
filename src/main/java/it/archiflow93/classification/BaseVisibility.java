
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
@XmlType(name = "BaseVisibility", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", propOrder = {
    "visAll",
    "visGroups",
    "visOffices",
    "visUsers"
})
@XmlSeeAlso({
    BaseVisibilityPrivacy.class
})
public class BaseVisibility {

    @XmlElement(name = "VisAll")
    protected Boolean visAll;
    @XmlElement(name = "VisGroups", nillable = true)
    protected ArrayOfEntityAccess visGroups;
    @XmlElement(name = "VisOffices", nillable = true)
    protected ArrayOfEntityAccess visOffices;
    @XmlElement(name = "VisUsers", nillable = true)
    protected ArrayOfEntityAccess visUsers;

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
     *     {@link ArrayOfEntityAccess }
     *     
     */
    public ArrayOfEntityAccess getVisGroups() {
        return visGroups;
    }

    /**
     * Sets the value of the visGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityAccess }
     *     
     */
    public void setVisGroups(ArrayOfEntityAccess value) {
        this.visGroups = value;
    }

    /**
     * Gets the value of the visOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityAccess }
     *     
     */
    public ArrayOfEntityAccess getVisOffices() {
        return visOffices;
    }

    /**
     * Sets the value of the visOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityAccess }
     *     
     */
    public void setVisOffices(ArrayOfEntityAccess value) {
        this.visOffices = value;
    }

    /**
     * Gets the value of the visUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityAccess }
     *     
     */
    public ArrayOfEntityAccess getVisUsers() {
        return visUsers;
    }

    /**
     * Sets the value of the visUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityAccess }
     *     
     */
    public void setVisUsers(ArrayOfEntityAccess value) {
        this.visUsers = value;
    }

}
