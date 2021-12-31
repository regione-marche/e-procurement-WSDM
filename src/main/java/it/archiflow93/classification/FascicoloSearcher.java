
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloSearcher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddTitolarioItemObsolete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Classification_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CloseDataFrom" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="CloseDataTo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="Code_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code_Num_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code_Num_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Data_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityDataType" minOccurs="0"/>
 *         &lt;element name="DepositId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDateFrom" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="ExpirationDateTo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="FascicoloFields" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfCampiTipoFascicoloValue" minOccurs="0"/>
 *         &lt;element name="FascicoloId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FascicoloId_From" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FascicoloId_To" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="FascicoloVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
 *         &lt;element name="FinalDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HistoricalDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegislaturaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Classification_ID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="List_UO_Manufacturer" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="List_UO_Responsible" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="List_UserId_Resp" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numeration_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}NumerationType" minOccurs="0"/>
 *         &lt;element name="OpenDataFrom" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="OpenDataTo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}SortingTypes" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="Preservation" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}PreservationStatus" minOccurs="0"/>
 *         &lt;element name="PreservationDateFrom" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="PreservationDateTo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="ReadTypeFasc" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}ReadEntityType" minOccurs="0"/>
 *         &lt;element name="StoreDiscardYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thesaurus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoFascicolo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="TitolarioId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioIdentifier" minOccurs="0"/>
 *         &lt;element name="TitolarioItem_id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *         &lt;element name="UtenteId" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", propOrder = {
    "addTitolarioItemObsolete",
    "classificationCode",
    "closeDataFrom",
    "closeDataTo",
    "codeNum",
    "codeNumFrom",
    "codeNumTo",
    "currentDiscardYears",
    "dataType",
    "depositId",
    "description",
    "expirationDateFrom",
    "expirationDateTo",
    "fascicoloFields",
    "fascicoloId",
    "fascicoloIdFrom",
    "fascicoloIdTo",
    "fascicoloVis",
    "finalDiscardYears",
    "historicalDiscardYears",
    "label",
    "legislaturaCode",
    "listClassificationID",
    "listUOManufacturer",
    "listUOResponsible",
    "listUserIdResp",
    "locationName",
    "note",
    "numerationType",
    "openDataFrom",
    "openDataTo",
    "orderBy",
    "parentId",
    "preservation",
    "preservationDateFrom",
    "preservationDateTo",
    "queryType",
    "readTypeFasc",
    "storeDiscardYears",
    "subject",
    "thesaurus",
    "tipoFascicolo",
    "titolarioId",
    "titolarioItemId",
    "utenteId"
})
public class FascicoloSearcher {

    @XmlElement(name = "AddTitolarioItemObsolete")
    protected Boolean addTitolarioItemObsolete;
    @XmlElement(name = "Classification_Code", nillable = true)
    protected String classificationCode;
    @XmlElement(name = "CloseDataFrom", nillable = true)
    protected CustomDateTimeNullable closeDataFrom;
    @XmlElement(name = "CloseDataTo", nillable = true)
    protected CustomDateTimeNullable closeDataTo;
    @XmlElement(name = "Code_Num", nillable = true)
    protected String codeNum;
    @XmlElement(name = "Code_Num_From", nillable = true)
    protected String codeNumFrom;
    @XmlElement(name = "Code_Num_To", nillable = true)
    protected String codeNumTo;
    @XmlElement(name = "CurrentDiscardYears")
    protected Integer currentDiscardYears;
    @XmlElement(name = "Data_Type")
    protected EntityDataType dataType;
    @XmlElement(name = "DepositId", nillable = true)
    protected String depositId;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "ExpirationDateFrom", nillable = true)
    protected CustomDateTimeNullable expirationDateFrom;
    @XmlElement(name = "ExpirationDateTo", nillable = true)
    protected CustomDateTimeNullable expirationDateTo;
    @XmlElement(name = "FascicoloFields", nillable = true)
    protected ArrayOfCampiTipoFascicoloValue fascicoloFields;
    @XmlElement(name = "FascicoloId", nillable = true)
    protected FascicoloIdentifier fascicoloId;
    @XmlElement(name = "FascicoloId_From", nillable = true)
    protected FascicoloIdentifier fascicoloIdFrom;
    @XmlElement(name = "FascicoloId_To", nillable = true)
    protected FascicoloIdentifier fascicoloIdTo;
    @XmlElement(name = "FascicoloVis", nillable = true)
    protected BaseVisibility fascicoloVis;
    @XmlElement(name = "FinalDiscardYears")
    protected Integer finalDiscardYears;
    @XmlElement(name = "HistoricalDiscardYears")
    protected Integer historicalDiscardYears;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "LegislaturaCode", nillable = true)
    protected String legislaturaCode;
    @XmlElement(name = "List_Classification_ID", nillable = true)
    protected ArrayOfint listClassificationID;
    @XmlElement(name = "List_UO_Manufacturer", nillable = true)
    protected ArrayOfint listUOManufacturer;
    @XmlElement(name = "List_UO_Responsible", nillable = true)
    protected ArrayOfint listUOResponsible;
    @XmlElement(name = "List_UserId_Resp", nillable = true)
    protected ArrayOfint listUserIdResp;
    @XmlElement(name = "LocationName", nillable = true)
    protected String locationName;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "Numeration_Type")
    protected NumerationType numerationType;
    @XmlElement(name = "OpenDataFrom", nillable = true)
    protected CustomDateTimeNullable openDataFrom;
    @XmlElement(name = "OpenDataTo", nillable = true)
    protected CustomDateTimeNullable openDataTo;
    @XmlElement(name = "OrderBy")
    protected SortingTypes orderBy;
    @XmlElement(name = "ParentId", nillable = true)
    protected FascicoloIdentifier parentId;
    @XmlElement(name = "Preservation")
    protected PreservationStatus preservation;
    @XmlElement(name = "PreservationDateFrom", nillable = true)
    protected CustomDateTimeNullable preservationDateFrom;
    @XmlElement(name = "PreservationDateTo", nillable = true)
    protected CustomDateTimeNullable preservationDateTo;
    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "ReadTypeFasc")
    protected ReadEntityType readTypeFasc;
    @XmlElement(name = "StoreDiscardYears")
    protected Integer storeDiscardYears;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "Thesaurus", nillable = true)
    protected String thesaurus;
    @XmlElement(name = "TipoFascicolo", nillable = true)
    protected TipoFascicoloIdentifier tipoFascicolo;
    @XmlElement(name = "TitolarioId", nillable = true)
    protected TitolarioIdentifier titolarioId;
    @XmlElement(name = "TitolarioItem_id", nillable = true)
    protected TitolarioItemIdentifier titolarioItemId;
    @XmlElement(name = "UtenteId", nillable = true)
    protected BaseIdentifier utenteId;

    /**
     * Gets the value of the addTitolarioItemObsolete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddTitolarioItemObsolete() {
        return addTitolarioItemObsolete;
    }

    /**
     * Sets the value of the addTitolarioItemObsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddTitolarioItemObsolete(Boolean value) {
        this.addTitolarioItemObsolete = value;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * Gets the value of the closeDataFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getCloseDataFrom() {
        return closeDataFrom;
    }

    /**
     * Sets the value of the closeDataFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setCloseDataFrom(CustomDateTimeNullable value) {
        this.closeDataFrom = value;
    }

    /**
     * Gets the value of the closeDataTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getCloseDataTo() {
        return closeDataTo;
    }

    /**
     * Sets the value of the closeDataTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setCloseDataTo(CustomDateTimeNullable value) {
        this.closeDataTo = value;
    }

    /**
     * Gets the value of the codeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeNum() {
        return codeNum;
    }

    /**
     * Sets the value of the codeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNum(String value) {
        this.codeNum = value;
    }

    /**
     * Gets the value of the codeNumFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeNumFrom() {
        return codeNumFrom;
    }

    /**
     * Sets the value of the codeNumFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNumFrom(String value) {
        this.codeNumFrom = value;
    }

    /**
     * Gets the value of the codeNumTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeNumTo() {
        return codeNumTo;
    }

    /**
     * Sets the value of the codeNumTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNumTo(String value) {
        this.codeNumTo = value;
    }

    /**
     * Gets the value of the currentDiscardYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentDiscardYears() {
        return currentDiscardYears;
    }

    /**
     * Sets the value of the currentDiscardYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentDiscardYears(Integer value) {
        this.currentDiscardYears = value;
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
     * Gets the value of the depositId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositId() {
        return depositId;
    }

    /**
     * Sets the value of the depositId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositId(String value) {
        this.depositId = value;
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
     * Gets the value of the expirationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getExpirationDateFrom() {
        return expirationDateFrom;
    }

    /**
     * Sets the value of the expirationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setExpirationDateFrom(CustomDateTimeNullable value) {
        this.expirationDateFrom = value;
    }

    /**
     * Gets the value of the expirationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getExpirationDateTo() {
        return expirationDateTo;
    }

    /**
     * Sets the value of the expirationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setExpirationDateTo(CustomDateTimeNullable value) {
        this.expirationDateTo = value;
    }

    /**
     * Gets the value of the fascicoloFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampiTipoFascicoloValue }
     *     
     */
    public ArrayOfCampiTipoFascicoloValue getFascicoloFields() {
        return fascicoloFields;
    }

    /**
     * Sets the value of the fascicoloFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampiTipoFascicoloValue }
     *     
     */
    public void setFascicoloFields(ArrayOfCampiTipoFascicoloValue value) {
        this.fascicoloFields = value;
    }

    /**
     * Gets the value of the fascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloId(FascicoloIdentifier value) {
        this.fascicoloId = value;
    }

    /**
     * Gets the value of the fascicoloIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloIdFrom() {
        return fascicoloIdFrom;
    }

    /**
     * Sets the value of the fascicoloIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloIdFrom(FascicoloIdentifier value) {
        this.fascicoloIdFrom = value;
    }

    /**
     * Gets the value of the fascicoloIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloIdTo() {
        return fascicoloIdTo;
    }

    /**
     * Sets the value of the fascicoloIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloIdTo(FascicoloIdentifier value) {
        this.fascicoloIdTo = value;
    }

    /**
     * Gets the value of the fascicoloVis property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibility }
     *     
     */
    public BaseVisibility getFascicoloVis() {
        return fascicoloVis;
    }

    /**
     * Sets the value of the fascicoloVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibility }
     *     
     */
    public void setFascicoloVis(BaseVisibility value) {
        this.fascicoloVis = value;
    }

    /**
     * Gets the value of the finalDiscardYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinalDiscardYears() {
        return finalDiscardYears;
    }

    /**
     * Sets the value of the finalDiscardYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinalDiscardYears(Integer value) {
        this.finalDiscardYears = value;
    }

    /**
     * Gets the value of the historicalDiscardYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistoricalDiscardYears() {
        return historicalDiscardYears;
    }

    /**
     * Sets the value of the historicalDiscardYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistoricalDiscardYears(Integer value) {
        this.historicalDiscardYears = value;
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
     * Gets the value of the legislaturaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegislaturaCode() {
        return legislaturaCode;
    }

    /**
     * Sets the value of the legislaturaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegislaturaCode(String value) {
        this.legislaturaCode = value;
    }

    /**
     * Gets the value of the listClassificationID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getListClassificationID() {
        return listClassificationID;
    }

    /**
     * Sets the value of the listClassificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setListClassificationID(ArrayOfint value) {
        this.listClassificationID = value;
    }

    /**
     * Gets the value of the listUOManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getListUOManufacturer() {
        return listUOManufacturer;
    }

    /**
     * Sets the value of the listUOManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setListUOManufacturer(ArrayOfint value) {
        this.listUOManufacturer = value;
    }

    /**
     * Gets the value of the listUOResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getListUOResponsible() {
        return listUOResponsible;
    }

    /**
     * Sets the value of the listUOResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setListUOResponsible(ArrayOfint value) {
        this.listUOResponsible = value;
    }

    /**
     * Gets the value of the listUserIdResp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getListUserIdResp() {
        return listUserIdResp;
    }

    /**
     * Sets the value of the listUserIdResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setListUserIdResp(ArrayOfint value) {
        this.listUserIdResp = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
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
     * Gets the value of the openDataFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getOpenDataFrom() {
        return openDataFrom;
    }

    /**
     * Sets the value of the openDataFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setOpenDataFrom(CustomDateTimeNullable value) {
        this.openDataFrom = value;
    }

    /**
     * Gets the value of the openDataTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getOpenDataTo() {
        return openDataTo;
    }

    /**
     * Sets the value of the openDataTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setOpenDataTo(CustomDateTimeNullable value) {
        this.openDataTo = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link SortingTypes }
     *     
     */
    public SortingTypes getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingTypes }
     *     
     */
    public void setOrderBy(SortingTypes value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setParentId(FascicoloIdentifier value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the preservation property.
     * 
     * @return
     *     possible object is
     *     {@link PreservationStatus }
     *     
     */
    public PreservationStatus getPreservation() {
        return preservation;
    }

    /**
     * Sets the value of the preservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreservationStatus }
     *     
     */
    public void setPreservation(PreservationStatus value) {
        this.preservation = value;
    }

    /**
     * Gets the value of the preservationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getPreservationDateFrom() {
        return preservationDateFrom;
    }

    /**
     * Sets the value of the preservationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setPreservationDateFrom(CustomDateTimeNullable value) {
        this.preservationDateFrom = value;
    }

    /**
     * Gets the value of the preservationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public CustomDateTimeNullable getPreservationDateTo() {
        return preservationDateTo;
    }

    /**
     * Sets the value of the preservationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateTimeNullable }
     *     
     */
    public void setPreservationDateTo(CustomDateTimeNullable value) {
        this.preservationDateTo = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityQueryType }
     *     
     */
    public EntityQueryType getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityQueryType }
     *     
     */
    public void setQueryType(EntityQueryType value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the readTypeFasc property.
     * 
     * @return
     *     possible object is
     *     {@link ReadEntityType }
     *     
     */
    public ReadEntityType getReadTypeFasc() {
        return readTypeFasc;
    }

    /**
     * Sets the value of the readTypeFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadEntityType }
     *     
     */
    public void setReadTypeFasc(ReadEntityType value) {
        this.readTypeFasc = value;
    }

    /**
     * Gets the value of the storeDiscardYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreDiscardYears() {
        return storeDiscardYears;
    }

    /**
     * Sets the value of the storeDiscardYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreDiscardYears(Integer value) {
        this.storeDiscardYears = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
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
     * Gets the value of the tipoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascicolo() {
        return tipoFascicolo;
    }

    /**
     * Sets the value of the tipoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascicolo(TipoFascicoloIdentifier value) {
        this.tipoFascicolo = value;
    }

    /**
     * Gets the value of the titolarioId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public TitolarioIdentifier getTitolarioId() {
        return titolarioId;
    }

    /**
     * Sets the value of the titolarioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioIdentifier }
     *     
     */
    public void setTitolarioId(TitolarioIdentifier value) {
        this.titolarioId = value;
    }

    /**
     * Gets the value of the titolarioItemId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getTitolarioItemId() {
        return titolarioItemId;
    }

    /**
     * Sets the value of the titolarioItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setTitolarioItemId(TitolarioItemIdentifier value) {
        this.titolarioItemId = value;
    }

    /**
     * Gets the value of the utenteId property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIdentifier }
     *     
     */
    public BaseIdentifier getUtenteId() {
        return utenteId;
    }

    /**
     * Sets the value of the utenteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIdentifier }
     *     
     */
    public void setUtenteId(BaseIdentifier value) {
        this.utenteId = value;
    }

}
