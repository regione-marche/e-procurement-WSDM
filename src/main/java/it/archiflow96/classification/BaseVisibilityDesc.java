
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlType(name = "BaseVisibilityDesc", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", propOrder = {
    "descGroups",
    "descOffices",
    "descUsers"
})
public class BaseVisibilityDesc {

    @XmlElement(name = "DescGroups", nillable = true)
    protected ArrayOfTypeIdentifier descGroups;
    @XmlElement(name = "DescOffices", nillable = true)
    protected ArrayOfTypeIdentifier descOffices;
    @XmlElement(name = "DescUsers", nillable = true)
    protected ArrayOfTypeIdentifier descUsers;

    /**
     * Gets the value of the descGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeIdentifier }
     *     
     */
    public ArrayOfTypeIdentifier getDescGroups() {
        return descGroups;
    }

    /**
     * Sets the value of the descGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeIdentifier }
     *     
     */
    public void setDescGroups(ArrayOfTypeIdentifier value) {
        this.descGroups = value;
    }

    /**
     * Gets the value of the descOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeIdentifier }
     *     
     */
    public ArrayOfTypeIdentifier getDescOffices() {
        return descOffices;
    }

    /**
     * Sets the value of the descOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeIdentifier }
     *     
     */
    public void setDescOffices(ArrayOfTypeIdentifier value) {
        this.descOffices = value;
    }

    /**
     * Gets the value of the descUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeIdentifier }
     *     
     */
    public ArrayOfTypeIdentifier getDescUsers() {
        return descUsers;
    }

    /**
     * Sets the value of the descUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeIdentifier }
     *     
     */
    public void setDescUsers(ArrayOfTypeIdentifier value) {
        this.descUsers = value;
    }

}
