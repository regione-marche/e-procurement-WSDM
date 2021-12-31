
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescriptionColor" type="{http://schemas.datacontract.org/2004/07/System.Drawing}Color" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="FieldControlType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ControlType" minOccurs="0"/>
 *         &lt;element name="FieldDataType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}DataType" minOccurs="0"/>
 *         &lt;element name="FieldDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdField" minOccurs="0"/>
 *         &lt;element name="FieldIdList" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="FieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldValueTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDocumentName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEmptyList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExternalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsListAutomaticInsert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsListDraftState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsListInsertCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsListRelation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultipleSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNotModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNotNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNotNullArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOfficeRelation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}Language" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ListFieldChild" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdField" minOccurs="0"/>
 *         &lt;element name="ListFieldParent" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}IdField" minOccurs="0"/>
 *         &lt;element name="ValueColor" type="{http://schemas.datacontract.org/2004/07/System.Drawing}Color" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "descriptionColor",
    "documentTypeId",
    "fieldControlType",
    "fieldDataType",
    "fieldDescription",
    "fieldId",
    "fieldIdList",
    "fieldValue",
    "fieldValueTo",
    "isDocumentName",
    "isEmptyList",
    "isExternalData",
    "isHidden",
    "isListAutomaticInsert",
    "isListDraftState",
    "isListInsertCode",
    "isListRelation",
    "isMailId",
    "isMultipleSelection",
    "isNotModify",
    "isNotNull",
    "isNotNullArchive",
    "isOfficeRelation",
    "isSystem",
    "language",
    "length",
    "listFieldChild",
    "listFieldParent",
    "valueColor"
})
public class Field {

    @XmlElement(name = "DescriptionColor")
    protected Color descriptionColor;
    @XmlElement(name = "DocumentTypeId")
    protected Short documentTypeId;
    @XmlElement(name = "FieldControlType")
    protected ControlType fieldControlType;
    @XmlElement(name = "FieldDataType")
    protected DataType fieldDataType;
    @XmlElement(name = "FieldDescription", nillable = true)
    protected String fieldDescription;
    @XmlElement(name = "FieldId")
    protected IdField fieldId;
    @XmlElement(name = "FieldIdList")
    protected Short fieldIdList;
    @XmlElement(name = "FieldValue", nillable = true)
    protected String fieldValue;
    @XmlElement(name = "FieldValueTo", nillable = true)
    protected String fieldValueTo;
    @XmlElement(name = "IsDocumentName")
    protected Boolean isDocumentName;
    @XmlElement(name = "IsEmptyList")
    protected Boolean isEmptyList;
    @XmlElement(name = "IsExternalData")
    protected Boolean isExternalData;
    @XmlElement(name = "IsHidden")
    protected Boolean isHidden;
    @XmlElement(name = "IsListAutomaticInsert")
    protected Boolean isListAutomaticInsert;
    @XmlElement(name = "IsListDraftState")
    protected Boolean isListDraftState;
    @XmlElement(name = "IsListInsertCode")
    protected Boolean isListInsertCode;
    @XmlElement(name = "IsListRelation")
    protected Boolean isListRelation;
    @XmlElement(name = "IsMailId")
    protected Boolean isMailId;
    @XmlElement(name = "IsMultipleSelection")
    protected Boolean isMultipleSelection;
    @XmlElement(name = "IsNotModify")
    protected Boolean isNotModify;
    @XmlElement(name = "IsNotNull")
    protected Boolean isNotNull;
    @XmlElement(name = "IsNotNullArchive")
    protected Boolean isNotNullArchive;
    @XmlElement(name = "IsOfficeRelation")
    protected Boolean isOfficeRelation;
    @XmlElement(name = "IsSystem")
    protected Boolean isSystem;
    @XmlElement(name = "Language")
    protected Language language;
    @XmlElement(name = "Length")
    protected Short length;
    @XmlElement(name = "ListFieldChild")
    protected IdField listFieldChild;
    @XmlElement(name = "ListFieldParent")
    protected IdField listFieldParent;
    @XmlElement(name = "ValueColor")
    protected Color valueColor;

    /**
     * Gets the value of the descriptionColor property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getDescriptionColor() {
        return descriptionColor;
    }

    /**
     * Sets the value of the descriptionColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setDescriptionColor(Color value) {
        this.descriptionColor = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDocumentTypeId(Short value) {
        this.documentTypeId = value;
    }

    /**
     * Gets the value of the fieldControlType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlType }
     *     
     */
    public ControlType getFieldControlType() {
        return fieldControlType;
    }

    /**
     * Sets the value of the fieldControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlType }
     *     
     */
    public void setFieldControlType(ControlType value) {
        this.fieldControlType = value;
    }

    /**
     * Gets the value of the fieldDataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getFieldDataType() {
        return fieldDataType;
    }

    /**
     * Sets the value of the fieldDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setFieldDataType(DataType value) {
        this.fieldDataType = value;
    }

    /**
     * Gets the value of the fieldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Sets the value of the fieldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDescription(String value) {
        this.fieldDescription = value;
    }

    /**
     * Gets the value of the fieldId property.
     * 
     * @return
     *     possible object is
     *     {@link IdField }
     *     
     */
    public IdField getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdField }
     *     
     */
    public void setFieldId(IdField value) {
        this.fieldId = value;
    }

    /**
     * Gets the value of the fieldIdList property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFieldIdList() {
        return fieldIdList;
    }

    /**
     * Sets the value of the fieldIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFieldIdList(Short value) {
        this.fieldIdList = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    /**
     * Gets the value of the fieldValueTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValueTo() {
        return fieldValueTo;
    }

    /**
     * Sets the value of the fieldValueTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValueTo(String value) {
        this.fieldValueTo = value;
    }

    /**
     * Gets the value of the isDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDocumentName() {
        return isDocumentName;
    }

    /**
     * Sets the value of the isDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDocumentName(Boolean value) {
        this.isDocumentName = value;
    }

    /**
     * Gets the value of the isEmptyList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmptyList() {
        return isEmptyList;
    }

    /**
     * Sets the value of the isEmptyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmptyList(Boolean value) {
        this.isEmptyList = value;
    }

    /**
     * Gets the value of the isExternalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternalData() {
        return isExternalData;
    }

    /**
     * Sets the value of the isExternalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternalData(Boolean value) {
        this.isExternalData = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
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
     * Gets the value of the isListDraftState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsListDraftState() {
        return isListDraftState;
    }

    /**
     * Sets the value of the isListDraftState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsListDraftState(Boolean value) {
        this.isListDraftState = value;
    }

    /**
     * Gets the value of the isListInsertCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsListInsertCode() {
        return isListInsertCode;
    }

    /**
     * Sets the value of the isListInsertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsListInsertCode(Boolean value) {
        this.isListInsertCode = value;
    }

    /**
     * Gets the value of the isListRelation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsListRelation() {
        return isListRelation;
    }

    /**
     * Sets the value of the isListRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsListRelation(Boolean value) {
        this.isListRelation = value;
    }

    /**
     * Gets the value of the isMailId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMailId() {
        return isMailId;
    }

    /**
     * Sets the value of the isMailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMailId(Boolean value) {
        this.isMailId = value;
    }

    /**
     * Gets the value of the isMultipleSelection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipleSelection() {
        return isMultipleSelection;
    }

    /**
     * Sets the value of the isMultipleSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipleSelection(Boolean value) {
        this.isMultipleSelection = value;
    }

    /**
     * Gets the value of the isNotModify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotModify() {
        return isNotModify;
    }

    /**
     * Sets the value of the isNotModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotModify(Boolean value) {
        this.isNotModify = value;
    }

    /**
     * Gets the value of the isNotNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotNull() {
        return isNotNull;
    }

    /**
     * Sets the value of the isNotNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotNull(Boolean value) {
        this.isNotNull = value;
    }

    /**
     * Gets the value of the isNotNullArchive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotNullArchive() {
        return isNotNullArchive;
    }

    /**
     * Sets the value of the isNotNullArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotNullArchive(Boolean value) {
        this.isNotNullArchive = value;
    }

    /**
     * Gets the value of the isOfficeRelation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOfficeRelation() {
        return isOfficeRelation;
    }

    /**
     * Sets the value of the isOfficeRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOfficeRelation(Boolean value) {
        this.isOfficeRelation = value;
    }

    /**
     * Gets the value of the isSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSystem() {
        return isSystem;
    }

    /**
     * Sets the value of the isSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSystem(Boolean value) {
        this.isSystem = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLength(Short value) {
        this.length = value;
    }

    /**
     * Gets the value of the listFieldChild property.
     * 
     * @return
     *     possible object is
     *     {@link IdField }
     *     
     */
    public IdField getListFieldChild() {
        return listFieldChild;
    }

    /**
     * Sets the value of the listFieldChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdField }
     *     
     */
    public void setListFieldChild(IdField value) {
        this.listFieldChild = value;
    }

    /**
     * Gets the value of the listFieldParent property.
     * 
     * @return
     *     possible object is
     *     {@link IdField }
     *     
     */
    public IdField getListFieldParent() {
        return listFieldParent;
    }

    /**
     * Sets the value of the listFieldParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdField }
     *     
     */
    public void setListFieldParent(IdField value) {
        this.listFieldParent = value;
    }

    /**
     * Gets the value of the valueColor property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getValueColor() {
        return valueColor;
    }

    /**
     * Sets the value of the valueColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setValueColor(Color value) {
        this.valueColor = value;
    }

}
