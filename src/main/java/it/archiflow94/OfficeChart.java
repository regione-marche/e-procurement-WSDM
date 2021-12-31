
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeChart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficeChart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChildrenOfficesIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="IsExecutiveOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficeChart", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject", propOrder = {
    "childrenOfficesIds",
    "code",
    "isExecutiveOffice",
    "name"
})
public class OfficeChart {

    @XmlElement(name = "ChildrenOfficesIds", nillable = true)
    protected ArrayOfint childrenOfficesIds;
    @XmlElement(name = "Code")
    protected Short code;
    @XmlElement(name = "IsExecutiveOffice")
    protected Boolean isExecutiveOffice;
    @XmlElement(name = "Name", nillable = true)
    protected String name;

    /**
     * Gets the value of the childrenOfficesIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getChildrenOfficesIds() {
        return childrenOfficesIds;
    }

    /**
     * Sets the value of the childrenOfficesIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setChildrenOfficesIds(ArrayOfint value) {
        this.childrenOfficesIds = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCode(Short value) {
        this.code = value;
    }

    /**
     * Gets the value of the isExecutiveOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExecutiveOffice() {
        return isExecutiveOffice;
    }

    /**
     * Sets the value of the isExecutiveOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExecutiveOffice(Boolean value) {
        this.isExecutiveOffice = value;
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
