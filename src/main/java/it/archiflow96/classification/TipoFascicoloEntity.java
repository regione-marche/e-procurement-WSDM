
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TipoFascicoloEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoFascicoloEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="AggregationAdmittedList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="ChildrenAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Contains_Documents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Contains_SubFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreatorId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}TypeIdentifierComplete" minOccurs="0"/>
 *         &lt;element name="DataCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataUpdate" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="Data_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityDataType" minOccurs="0"/>
 *         &lt;element name="DefaultType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiffAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Responsible" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="Numeration_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}NumerationType" minOccurs="0"/>
 *         &lt;element name="Numeration_Years" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcessAssociated" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}StatusType" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="Thesaurus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoFascicoloId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="Uffici_CC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FieldDefinition" minOccurs="0"/>
 *         &lt;element name="VisAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="YearBack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoFascicoloEntity", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.ValueObject", propOrder = {
    "aggregationAdmittedList",
    "childrenAll",
    "containsDocuments",
    "containsSubFiles",
    "creatorId",
    "dataCreation",
    "dataUpdate",
    "dataType",
    "defaultType",
    "diffAll",
    "hasResponsible",
    "label",
    "location",
    "note",
    "numerationType",
    "numerationYears",
    "processAssociated",
    "status",
    "subject",
    "thesaurus",
    "tipoFascicoloId",
    "ufficiCC",
    "visAll",
    "yearBack"
})
public class TipoFascicoloEntity
    extends BaseValueObject
{

    @XmlElement(name = "AggregationAdmittedList", nillable = true)
    protected ArrayOfint aggregationAdmittedList;
    @XmlElement(name = "ChildrenAll")
    protected Boolean childrenAll;
    @XmlElement(name = "Contains_Documents")
    protected Boolean containsDocuments;
    @XmlElement(name = "Contains_SubFiles")
    protected Boolean containsSubFiles;
    @XmlElement(name = "CreatorId", nillable = true)
    protected TypeIdentifierComplete creatorId;
    @XmlElement(name = "DataCreation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreation;
    @XmlElement(name = "DataUpdate", nillable = true)
    protected CustomDateTimeNullable dataUpdate;
    @XmlElement(name = "Data_Type")
    protected EntityDataType dataType;
    @XmlElement(name = "DefaultType")
    protected Boolean defaultType;
    @XmlElement(name = "DiffAll")
    protected Boolean diffAll;
    @XmlElement(name = "Has_Responsible")
    protected FieldDefinition hasResponsible;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "Location")
    protected FieldDefinition location;
    @XmlElement(name = "Note")
    protected FieldDefinition note;
    @XmlElement(name = "Numeration_Type")
    protected NumerationType numerationType;
    @XmlElement(name = "Numeration_Years")
    protected Integer numerationYears;
    @XmlElement(name = "ProcessAssociated")
    protected FieldDefinition processAssociated;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "Subject")
    protected FieldDefinition subject;
    @XmlElement(name = "Thesaurus", nillable = true)
    protected String thesaurus;
    @XmlElement(name = "TipoFascicoloId", nillable = true)
    protected TipoFascicoloIdentifier tipoFascicoloId;
    @XmlElement(name = "Uffici_CC")
    protected FieldDefinition ufficiCC;
    @XmlElement(name = "VisAll")
    protected Boolean visAll;
    @XmlElement(name = "YearBack")
    protected Boolean yearBack;

    /**
     * Gets the value of the aggregationAdmittedList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getAggregationAdmittedList() {
        return aggregationAdmittedList;
    }

    /**
     * Sets the value of the aggregationAdmittedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setAggregationAdmittedList(ArrayOfint value) {
        this.aggregationAdmittedList = value;
    }

    /**
     * Gets the value of the childrenAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildrenAll() {
        return childrenAll;
    }

    /**
     * Sets the value of the childrenAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildrenAll(Boolean value) {
        this.childrenAll = value;
    }

    /**
     * Gets the value of the containsDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsDocuments() {
        return containsDocuments;
    }

    /**
     * Sets the value of the containsDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsDocuments(Boolean value) {
        this.containsDocuments = value;
    }

    /**
     * Gets the value of the containsSubFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsSubFiles() {
        return containsSubFiles;
    }

    /**
     * Sets the value of the containsSubFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsSubFiles(Boolean value) {
        this.containsSubFiles = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public TypeIdentifierComplete getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIdentifierComplete }
     *     
     */
    public void setCreatorId(TypeIdentifierComplete value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the dataCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreation() {
        return dataCreation;
    }

    /**
     * Sets the value of the dataCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreation(XMLGregorianCalendar value) {
        this.dataCreation = value;
    }

    /**
     * Gets the value of the dataUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getDataUpdate() {
        return dataUpdate;
    }

    /**
     * Sets the value of the dataUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setDataUpdate(CustomDateTimeNullable value) {
        this.dataUpdate = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDataType }
     *     
     */
    public EntityDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDataType }
     *     
     */
    public void setDataType(EntityDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the defaultType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultType() {
        return defaultType;
    }

    /**
     * Sets the value of the defaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultType(Boolean value) {
        this.defaultType = value;
    }

    /**
     * Gets the value of the diffAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiffAll() {
        return diffAll;
    }

    /**
     * Sets the value of the diffAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiffAll(Boolean value) {
        this.diffAll = value;
    }

    /**
     * Gets the value of the hasResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getHasResponsible() {
        return hasResponsible;
    }

    /**
     * Sets the value of the hasResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setHasResponsible(FieldDefinition value) {
        this.hasResponsible = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setLocation(FieldDefinition value) {
        this.location = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setNote(FieldDefinition value) {
        this.note = value;
    }

    /**
     * Gets the value of the numerationType property.
     * 
     * @return
     *     possible object is
     *     {@link NumerationType }
     *     
     */
    public NumerationType getNumerationType() {
        return numerationType;
    }

    /**
     * Sets the value of the numerationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumerationType }
     *     
     */
    public void setNumerationType(NumerationType value) {
        this.numerationType = value;
    }

    /**
     * Gets the value of the numerationYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumerationYears() {
        return numerationYears;
    }

    /**
     * Sets the value of the numerationYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumerationYears(Integer value) {
        this.numerationYears = value;
    }

    /**
     * Gets the value of the processAssociated property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getProcessAssociated() {
        return processAssociated;
    }

    /**
     * Sets the value of the processAssociated property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setProcessAssociated(FieldDefinition value) {
        this.processAssociated = value;
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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setSubject(FieldDefinition value) {
        this.subject = value;
    }

    /**
     * Gets the value of the thesaurus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThesaurus() {
        return thesaurus;
    }

    /**
     * Sets the value of the thesaurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThesaurus(String value) {
        this.thesaurus = value;
    }

    /**
     * Gets the value of the tipoFascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascicoloId() {
        return tipoFascicoloId;
    }

    /**
     * Sets the value of the tipoFascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascicoloId(TipoFascicoloIdentifier value) {
        this.tipoFascicoloId = value;
    }

    /**
     * Gets the value of the ufficiCC property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDefinition }
     *     
     */
    public FieldDefinition getUfficiCC() {
        return ufficiCC;
    }

    /**
     * Sets the value of the ufficiCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDefinition }
     *     
     */
    public void setUfficiCC(FieldDefinition value) {
        this.ufficiCC = value;
    }

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
     * Gets the value of the yearBack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYearBack() {
        return yearBack;
    }

    /**
     * Sets the value of the yearBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYearBack(Boolean value) {
        this.yearBack = value;
    }

}
