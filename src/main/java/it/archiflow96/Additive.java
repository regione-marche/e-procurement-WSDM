
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Additive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Additive">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditiveControlType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ControlType" minOccurs="0"/>
 *         &lt;element name="AdditiveId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdAdditive" minOccurs="0"/>
 *         &lt;element name="AdditiveIdList" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="AdditiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditiveValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsListAutomaticInsert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUserEnabledToSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Additive", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "additiveControlType",
    "additiveId",
    "additiveIdList",
    "additiveName",
    "additiveValue",
    "imageContent",
    "isListAutomaticInsert",
    "isSigned",
    "isUserEnabledToSign"
})
public class Additive {

    @XmlElement(name = "AdditiveControlType")
    protected ControlType additiveControlType;
    @XmlElement(name = "AdditiveId")
    protected IdAdditive additiveId;
    @XmlElement(name = "AdditiveIdList")
    protected Short additiveIdList;
    @XmlElement(name = "AdditiveName", nillable = true)
    protected String additiveName;
    @XmlElement(name = "AdditiveValue", nillable = true)
    protected String additiveValue;
    @XmlElement(name = "ImageContent", nillable = true)
    protected String imageContent;
    @XmlElement(name = "IsListAutomaticInsert")
    protected Boolean isListAutomaticInsert;
    @XmlElement(name = "IsSigned")
    protected Boolean isSigned;
    @XmlElement(name = "IsUserEnabledToSign")
    protected Boolean isUserEnabledToSign;

    /**
     * Gets the value of the additiveControlType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlType }
     *     
     */
    public ControlType getAdditiveControlType() {
        return additiveControlType;
    }

    /**
     * Sets the value of the additiveControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlType }
     *     
     */
    public void setAdditiveControlType(ControlType value) {
        this.additiveControlType = value;
    }

    /**
     * Gets the value of the additiveId property.
     * 
     * @return
     *     possible object is
     *     {@link IdAdditive }
     *     
     */
    public IdAdditive getAdditiveId() {
        return additiveId;
    }

    /**
     * Sets the value of the additiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdAdditive }
     *     
     */
    public void setAdditiveId(IdAdditive value) {
        this.additiveId = value;
    }

    /**
     * Gets the value of the additiveIdList property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAdditiveIdList() {
        return additiveIdList;
    }

    /**
     * Sets the value of the additiveIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAdditiveIdList(Short value) {
        this.additiveIdList = value;
    }

    /**
     * Gets the value of the additiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditiveName() {
        return additiveName;
    }

    /**
     * Sets the value of the additiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditiveName(String value) {
        this.additiveName = value;
    }

    /**
     * Gets the value of the additiveValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditiveValue() {
        return additiveValue;
    }

    /**
     * Sets the value of the additiveValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditiveValue(String value) {
        this.additiveValue = value;
    }

    /**
     * Gets the value of the imageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageContent() {
        return imageContent;
    }

    /**
     * Sets the value of the imageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageContent(String value) {
        this.imageContent = value;
    }

    /**
     * Gets the value of the isListAutomaticInsert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsListAutomaticInsert() {
        return isListAutomaticInsert;
    }

    /**
     * Sets the value of the isListAutomaticInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsListAutomaticInsert(Boolean value) {
        this.isListAutomaticInsert = value;
    }

    /**
     * Gets the value of the isSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSigned() {
        return isSigned;
    }

    /**
     * Sets the value of the isSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSigned(Boolean value) {
        this.isSigned = value;
    }

    /**
     * Gets the value of the isUserEnabledToSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserEnabledToSign() {
        return isUserEnabledToSign;
    }

    /**
     * Sets the value of the isUserEnabledToSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserEnabledToSign(Boolean value) {
        this.isUserEnabledToSign = value;
    }

}
