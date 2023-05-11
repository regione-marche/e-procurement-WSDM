
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassificationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAdditive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListItem", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "classificationId",
    "classificationLabel",
    "codeValue",
    "descriptionValue",
    "id",
    "isAdditive",
    "isExternal",
    "useId"
})
public class ListItem {

    @XmlElement(name = "ClassificationId")
    protected Integer classificationId;
    @XmlElement(name = "ClassificationLabel", nillable = true)
    protected String classificationLabel;
    @XmlElement(name = "CodeValue", nillable = true)
    protected String codeValue;
    @XmlElement(name = "DescriptionValue", nillable = true)
    protected String descriptionValue;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "IsAdditive")
    protected Boolean isAdditive;
    @XmlElement(name = "IsExternal")
    protected Boolean isExternal;
    @XmlElement(name = "UseId")
    protected Boolean useId;

    /**
     * Gets the value of the classificationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassificationId() {
        return classificationId;
    }

    /**
     * Sets the value of the classificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassificationId(Integer value) {
        this.classificationId = value;
    }

    /**
     * Gets the value of the classificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationLabel() {
        return classificationLabel;
    }

    /**
     * Sets the value of the classificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationLabel(String value) {
        this.classificationLabel = value;
    }

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the descriptionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionValue() {
        return descriptionValue;
    }

    /**
     * Sets the value of the descriptionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionValue(String value) {
        this.descriptionValue = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isAdditive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdditive() {
        return isAdditive;
    }

    /**
     * Sets the value of the isAdditive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdditive(Boolean value) {
        this.isAdditive = value;
    }

    /**
     * Gets the value of the isExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Sets the value of the isExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

    /**
     * Gets the value of the useId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseId() {
        return useId;
    }

    /**
     * Sets the value of the useId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseId(Boolean value) {
        this.useId = value;
    }

}
