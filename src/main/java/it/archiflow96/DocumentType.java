
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddInEmailMapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Additives" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAdditive" minOccurs="0"/>
 *         &lt;element name="ArchiveIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfshort" minOccurs="0"/>
 *         &lt;element name="ArchivesOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfDocumentType.ArchiveDocumentTypeOptions" minOccurs="0"/>
 *         &lt;element name="CurrentAccessLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AccessLevel" minOccurs="0"/>
 *         &lt;element name="DefaultClassId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indexes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="InvoiceNotMappedFields" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ArrayOfIdField" minOccurs="0"/>
 *         &lt;element name="IsMandatoryRegType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfboolean" minOccurs="0"/>
 *         &lt;element name="PrivacyArchiveIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfshort" minOccurs="0"/>
 *         &lt;element name="WorkflowProcessType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}WFProcessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "addInEmailMapping",
    "additives",
    "archiveIds",
    "archivesOptions",
    "currentAccessLevel",
    "defaultClassId",
    "documentTypeId",
    "documentTypeName",
    "indexes",
    "invoiceNotMappedFields",
    "isMandatoryRegType",
    "options",
    "privacyArchiveIds",
    "workflowProcessType"
})
public class DocumentType {

    @XmlElement(name = "AddInEmailMapping", nillable = true)
    protected String addInEmailMapping;
    @XmlElement(name = "Additives", nillable = true)
    protected ArrayOfAdditive additives;
    @XmlElement(name = "ArchiveIds", nillable = true)
    protected ArrayOfshort archiveIds;
    @XmlElement(name = "ArchivesOptions", nillable = true)
    protected ArrayOfDocumentTypeArchiveDocumentTypeOptions archivesOptions;
    @XmlElement(name = "CurrentAccessLevel", nillable = true)
    protected AccessLevel currentAccessLevel;
    @XmlElement(name = "DefaultClassId")
    protected Long defaultClassId;
    @XmlElement(name = "DocumentTypeId")
    protected Short documentTypeId;
    @XmlElement(name = "DocumentTypeName", nillable = true)
    protected String documentTypeName;
    @XmlElement(name = "Indexes", nillable = true)
    protected ArrayOfField indexes;
    @XmlElement(name = "InvoiceNotMappedFields", nillable = true)
    protected ArrayOfIdField invoiceNotMappedFields;
    @XmlElement(name = "IsMandatoryRegType")
    protected Boolean isMandatoryRegType;
    @XmlElement(name = "Options", nillable = true)
    protected ArrayOfboolean options;
    @XmlElement(name = "PrivacyArchiveIds", nillable = true)
    protected ArrayOfshort privacyArchiveIds;
    @XmlElement(name = "WorkflowProcessType")
    protected WFProcessType workflowProcessType;

    /**
     * Gets the value of the addInEmailMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInEmailMapping() {
        return addInEmailMapping;
    }

    /**
     * Sets the value of the addInEmailMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInEmailMapping(String value) {
        this.addInEmailMapping = value;
    }

    /**
     * Gets the value of the additives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditive }
     *     
     */
    public ArrayOfAdditive getAdditives() {
        return additives;
    }

    /**
     * Sets the value of the additives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditive }
     *     
     */
    public void setAdditives(ArrayOfAdditive value) {
        this.additives = value;
    }

    /**
     * Gets the value of the archiveIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfshort }
     *     
     */
    public ArrayOfshort getArchiveIds() {
        return archiveIds;
    }

    /**
     * Sets the value of the archiveIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfshort }
     *     
     */
    public void setArchiveIds(ArrayOfshort value) {
        this.archiveIds = value;
    }

    /**
     * Gets the value of the archivesOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentTypeArchiveDocumentTypeOptions }
     *     
     */
    public ArrayOfDocumentTypeArchiveDocumentTypeOptions getArchivesOptions() {
        return archivesOptions;
    }

    /**
     * Sets the value of the archivesOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentTypeArchiveDocumentTypeOptions }
     *     
     */
    public void setArchivesOptions(ArrayOfDocumentTypeArchiveDocumentTypeOptions value) {
        this.archivesOptions = value;
    }

    /**
     * Gets the value of the currentAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessLevel }
     *     
     */
    public AccessLevel getCurrentAccessLevel() {
        return currentAccessLevel;
    }

    /**
     * Sets the value of the currentAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLevel }
     *     
     */
    public void setCurrentAccessLevel(AccessLevel value) {
        this.currentAccessLevel = value;
    }

    /**
     * Gets the value of the defaultClassId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultClassId() {
        return defaultClassId;
    }

    /**
     * Sets the value of the defaultClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultClassId(Long value) {
        this.defaultClassId = value;
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
     * Gets the value of the documentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeName() {
        return documentTypeName;
    }

    /**
     * Sets the value of the documentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeName(String value) {
        this.documentTypeName = value;
    }

    /**
     * Gets the value of the indexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getIndexes() {
        return indexes;
    }

    /**
     * Sets the value of the indexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setIndexes(ArrayOfField value) {
        this.indexes = value;
    }

    /**
     * Gets the value of the invoiceNotMappedFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIdField }
     *     
     */
    public ArrayOfIdField getInvoiceNotMappedFields() {
        return invoiceNotMappedFields;
    }

    /**
     * Sets the value of the invoiceNotMappedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIdField }
     *     
     */
    public void setInvoiceNotMappedFields(ArrayOfIdField value) {
        this.invoiceNotMappedFields = value;
    }

    /**
     * Gets the value of the isMandatoryRegType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatoryRegType() {
        return isMandatoryRegType;
    }

    /**
     * Sets the value of the isMandatoryRegType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatoryRegType(Boolean value) {
        this.isMandatoryRegType = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfboolean }
     *     
     */
    public ArrayOfboolean getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfboolean }
     *     
     */
    public void setOptions(ArrayOfboolean value) {
        this.options = value;
    }

    /**
     * Gets the value of the privacyArchiveIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfshort }
     *     
     */
    public ArrayOfshort getPrivacyArchiveIds() {
        return privacyArchiveIds;
    }

    /**
     * Sets the value of the privacyArchiveIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfshort }
     *     
     */
    public void setPrivacyArchiveIds(ArrayOfshort value) {
        this.privacyArchiveIds = value;
    }

    /**
     * Gets the value of the workflowProcessType property.
     * 
     * @return
     *     possible object is
     *     {@link WFProcessType }
     *     
     */
    public WFProcessType getWorkflowProcessType() {
        return workflowProcessType;
    }

    /**
     * Sets the value of the workflowProcessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFProcessType }
     *     
     */
    public void setWorkflowProcessType(WFProcessType value) {
        this.workflowProcessType = value;
    }

}
