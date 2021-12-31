
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoCollationTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoCollationTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DescriptionFieldId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdField" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAutoCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MergeVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameFieldId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdField" minOccurs="0"/>
 *         &lt;element name="RememberFirst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoCollationTemplate", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject", propOrder = {
    "archiveId",
    "descriptionFieldId",
    "documentTypeId",
    "id",
    "isAutoCreation",
    "isConfirmationRequired",
    "isDisabled",
    "mergeVisibility",
    "name",
    "nameFieldId",
    "rememberFirst"
})
public class AutoCollationTemplate {

    @XmlElement(name = "ArchiveId")
    protected Integer archiveId;
    @XmlElement(name = "DescriptionFieldId")
    protected IdField descriptionFieldId;
    @XmlElement(name = "DocumentTypeId")
    protected Integer documentTypeId;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "IsAutoCreation")
    protected Boolean isAutoCreation;
    @XmlElement(name = "IsConfirmationRequired")
    protected Boolean isConfirmationRequired;
    @XmlElement(name = "IsDisabled")
    protected Boolean isDisabled;
    @XmlElement(name = "MergeVisibility")
    protected Boolean mergeVisibility;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NameFieldId")
    protected IdField nameFieldId;
    @XmlElement(name = "RememberFirst")
    protected Boolean rememberFirst;

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArchiveId(Integer value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the descriptionFieldId property.
     * 
     * @return
     *     possible object is
     *     {@link IdField }
     *     
     */
    public IdField getDescriptionFieldId() {
        return descriptionFieldId;
    }

    /**
     * Sets the value of the descriptionFieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdField }
     *     
     */
    public void setDescriptionFieldId(IdField value) {
        this.descriptionFieldId = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentTypeId(Integer value) {
        this.documentTypeId = value;
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
     * Gets the value of the isAutoCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoCreation() {
        return isAutoCreation;
    }

    /**
     * Sets the value of the isAutoCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoCreation(Boolean value) {
        this.isAutoCreation = value;
    }

    /**
     * Gets the value of the isConfirmationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfirmationRequired() {
        return isConfirmationRequired;
    }

    /**
     * Sets the value of the isConfirmationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfirmationRequired(Boolean value) {
        this.isConfirmationRequired = value;
    }

    /**
     * Gets the value of the isDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisabled() {
        return isDisabled;
    }

    /**
     * Sets the value of the isDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisabled(Boolean value) {
        this.isDisabled = value;
    }

    /**
     * Gets the value of the mergeVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeVisibility() {
        return mergeVisibility;
    }

    /**
     * Sets the value of the mergeVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeVisibility(Boolean value) {
        this.mergeVisibility = value;
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

    /**
     * Gets the value of the nameFieldId property.
     * 
     * @return
     *     possible object is
     *     {@link IdField }
     *     
     */
    public IdField getNameFieldId() {
        return nameFieldId;
    }

    /**
     * Sets the value of the nameFieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdField }
     *     
     */
    public void setNameFieldId(IdField value) {
        this.nameFieldId = value;
    }

    /**
     * Gets the value of the rememberFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRememberFirst() {
        return rememberFirst;
    }

    /**
     * Sets the value of the rememberFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRememberFirst(Boolean value) {
        this.rememberFirst = value;
    }

}
