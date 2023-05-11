
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseTitolarioItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseTitolarioItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateClassThisLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *         &lt;element name="IsSearchedItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *         &lt;element name="Sons" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}StatusType" minOccurs="0"/>
 *         &lt;element name="TypeAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UO_Responsible" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseTitolarioItem", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.ValueObject", propOrder = {
    "code",
    "createClassThisLevel",
    "description",
    "fullCode",
    "id",
    "isSearchedItem",
    "label",
    "parentId",
    "sons",
    "sorting",
    "status",
    "typeAll",
    "uoResponsible"
})
@XmlSeeAlso({
    TitolarioItemEntity.class
})
public class BaseTitolarioItem
    extends BaseValueObject
{

    @XmlElement(name = "Code", nillable = true)
    protected String code;
    @XmlElement(name = "CreateClassThisLevel")
    protected Integer createClassThisLevel;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "FullCode", nillable = true)
    protected String fullCode;
    @XmlElement(name = "Id", nillable = true)
    protected TitolarioItemIdentifier id;
    @XmlElement(name = "IsSearchedItem")
    protected Boolean isSearchedItem;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "ParentId", nillable = true)
    protected TitolarioItemIdentifier parentId;
    @XmlElement(name = "Sons")
    protected Short sons;
    @XmlElement(name = "Sorting")
    protected Integer sorting;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "TypeAll")
    protected Boolean typeAll;
    @XmlElement(name = "UO_Responsible")
    protected Integer uoResponsible;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the createClassThisLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreateClassThisLevel() {
        return createClassThisLevel;
    }

    /**
     * Sets the value of the createClassThisLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreateClassThisLevel(Integer value) {
        this.createClassThisLevel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fullCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullCode() {
        return fullCode;
    }

    /**
     * Sets the value of the fullCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullCode(String value) {
        this.fullCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setId(TitolarioItemIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the isSearchedItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSearchedItem() {
        return isSearchedItem;
    }

    /**
     * Sets the value of the isSearchedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSearchedItem(Boolean value) {
        this.isSearchedItem = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setParentId(TitolarioItemIdentifier value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the sons property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSons() {
        return sons;
    }

    /**
     * Sets the value of the sons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSons(Short value) {
        this.sons = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSorting(Integer value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the typeAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTypeAll() {
        return typeAll;
    }

    /**
     * Sets the value of the typeAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTypeAll(Boolean value) {
        this.typeAll = value;
    }

    /**
     * Gets the value of the uoResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUOResponsible() {
        return uoResponsible;
    }

    /**
     * Sets the value of the uoResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUOResponsible(Integer value) {
        this.uoResponsible = value;
    }

}
