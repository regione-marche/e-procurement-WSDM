
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrafSearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Agraf.ValueObject}AgrafSearchCriteria" minOccurs="0"/>
 *         &lt;element name="AnnotationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Archives" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfArchive" minOccurs="0"/>
 *         &lt;element name="CardProgFrom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CardProgTo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CardWithOutDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckSearchTooLong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassificationSearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ClassificationSearchCriteria" minOccurs="0"/>
 *         &lt;element name="Context" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchContext" minOccurs="0"/>
 *         &lt;element name="ContextFullText" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ContextFullText" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DocumentType" minOccurs="0"/>
 *         &lt;element name="DurationSearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DurationSearchCriteria" minOccurs="0"/>
 *         &lt;element name="ExtendedDocumentType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfDocumentType" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="FilterFullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolderSearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}FolderSearchCriteria" minOccurs="0"/>
 *         &lt;element name="FuzzySearchFullText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceDataTransmSearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Spesometro.ValueObject}InvoiceDataTransmissionSearchCriteria" minOccurs="0"/>
 *         &lt;element name="InvoiceSearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.ValueObject}InvoiceSearchCriteria" minOccurs="0"/>
 *         &lt;element name="IsForcedDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsForcedIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MainDoc" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchOptions" minOccurs="0"/>
 *         &lt;element name="MaxFounded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxToWait" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoFormatKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoWordFullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotDisplayInvalidatedCards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OneWordFullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnlyConnectedUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderByField" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}FieldToOrderBy" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}KeyOrderType" minOccurs="0"/>
 *         &lt;element name="PluralSearchFullText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegisterOperation" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}RegisterOperation" minOccurs="0"/>
 *         &lt;element name="SearchResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchResult" minOccurs="0"/>
 *         &lt;element name="SearchType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchType" minOccurs="0"/>
 *         &lt;element name="SortDescending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StringFullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseDefaultOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WfCardStatusFilter" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}WfCardStatusFilter" minOccurs="0"/>
 *         &lt;element name="WordsFullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "agrafSearchCriteria",
    "annotationValue",
    "archives",
    "cardProgFrom",
    "cardProgTo",
    "cardWithOutDoc",
    "checkSearchTooLong",
    "classificationSearchCriteria",
    "context",
    "contextFullText",
    "documentType",
    "durationSearchCriteria",
    "extendedDocumentType",
    "fields",
    "filterFullText",
    "folderSearchCriteria",
    "fuzzySearchFullText",
    "invoiceDataTransmSearchCriteria",
    "invoiceSearchCriteria",
    "isForcedDate",
    "isForcedIndex",
    "mainDoc",
    "maxFounded",
    "maxToWait",
    "noFormatKey",
    "noWordFullText",
    "notDisplayInvalidatedCards",
    "oneWordFullText",
    "onlyConnectedUser",
    "orderByField",
    "orderType",
    "pluralSearchFullText",
    "registerOperation",
    "searchResult",
    "searchType",
    "sortDescending",
    "stringFullText",
    "useDefaultOptions",
    "wfCardStatusFilter",
    "wordsFullText"
})
public class SearchCriteria {

    @XmlElement(name = "AgrafSearchCriteria", nillable = true)
    protected AgrafSearchCriteria agrafSearchCriteria;
    @XmlElement(name = "AnnotationValue", nillable = true)
    protected String annotationValue;
    @XmlElement(name = "Archives", nillable = true)
    protected ArrayOfArchive archives;
    @XmlElement(name = "CardProgFrom")
    protected Long cardProgFrom;
    @XmlElement(name = "CardProgTo")
    protected Long cardProgTo;
    @XmlElement(name = "CardWithOutDoc")
    protected Boolean cardWithOutDoc;
    @XmlElement(name = "CheckSearchTooLong")
    protected Boolean checkSearchTooLong;
    @XmlElement(name = "ClassificationSearchCriteria", nillable = true)
    protected ClassificationSearchCriteria classificationSearchCriteria;
    @XmlElement(name = "Context")
    protected SearchContext context;
    @XmlElement(name = "ContextFullText")
    protected ContextFullText contextFullText;
    @XmlElement(name = "DocumentType", nillable = true)
    protected DocumentType documentType;
    @XmlElement(name = "DurationSearchCriteria", nillable = true)
    protected DurationSearchCriteria durationSearchCriteria;
    @XmlElement(name = "ExtendedDocumentType", nillable = true)
    protected ArrayOfDocumentType extendedDocumentType;
    @XmlElement(name = "Fields", nillable = true)
    protected ArrayOfField fields;
    @XmlElement(name = "FilterFullText", nillable = true)
    protected String filterFullText;
    @XmlElement(name = "FolderSearchCriteria", nillable = true)
    protected FolderSearchCriteria folderSearchCriteria;
    @XmlElement(name = "FuzzySearchFullText")
    protected Boolean fuzzySearchFullText;
    @XmlElement(name = "InvoiceDataTransmSearchCriteria", nillable = true)
    protected InvoiceDataTransmissionSearchCriteria invoiceDataTransmSearchCriteria;
    @XmlElement(name = "InvoiceSearchCriteria", nillable = true)
    protected InvoiceSearchCriteria invoiceSearchCriteria;
    @XmlElement(name = "IsForcedDate")
    protected Boolean isForcedDate;
    @XmlElement(name = "IsForcedIndex")
    protected Boolean isForcedIndex;
    @XmlElement(name = "MainDoc")
    protected SearchOptions mainDoc;
    @XmlElement(name = "MaxFounded")
    protected Integer maxFounded;
    @XmlElement(name = "MaxToWait")
    protected Integer maxToWait;
    @XmlElement(name = "NoFormatKey")
    protected Boolean noFormatKey;
    @XmlElement(name = "NoWordFullText", nillable = true)
    protected String noWordFullText;
    @XmlElement(name = "NotDisplayInvalidatedCards")
    protected Boolean notDisplayInvalidatedCards;
    @XmlElement(name = "OneWordFullText", nillable = true)
    protected String oneWordFullText;
    @XmlElement(name = "OnlyConnectedUser")
    protected Boolean onlyConnectedUser;
    @XmlElement(name = "OrderByField", nillable = true)
    protected FieldToOrderBy orderByField;
    @XmlElement(name = "OrderType", nillable = true)
    protected KeyOrderType orderType;
    @XmlElement(name = "PluralSearchFullText")
    protected Boolean pluralSearchFullText;
    @XmlElement(name = "RegisterOperation")
    protected RegisterOperation registerOperation;
    @XmlElement(name = "SearchResult")
    protected SearchResult searchResult;
    @XmlElement(name = "SearchType")
    protected SearchType searchType;
    @XmlElement(name = "SortDescending")
    protected Boolean sortDescending;
    @XmlElement(name = "StringFullText", nillable = true)
    protected String stringFullText;
    @XmlElement(name = "UseDefaultOptions")
    protected Boolean useDefaultOptions;
    @XmlElement(name = "WfCardStatusFilter")
    protected WfCardStatusFilter wfCardStatusFilter;
    @XmlElement(name = "WordsFullText", nillable = true)
    protected String wordsFullText;

    /**
     * Gets the value of the agrafSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AgrafSearchCriteria }
     *     
     */
    public AgrafSearchCriteria getAgrafSearchCriteria() {
        return agrafSearchCriteria;
    }

    /**
     * Sets the value of the agrafSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrafSearchCriteria }
     *     
     */
    public void setAgrafSearchCriteria(AgrafSearchCriteria value) {
        this.agrafSearchCriteria = value;
    }

    /**
     * Gets the value of the annotationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationValue() {
        return annotationValue;
    }

    /**
     * Sets the value of the annotationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationValue(String value) {
        this.annotationValue = value;
    }

    /**
     * Gets the value of the archives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArchive }
     *     
     */
    public ArrayOfArchive getArchives() {
        return archives;
    }

    /**
     * Sets the value of the archives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArchive }
     *     
     */
    public void setArchives(ArrayOfArchive value) {
        this.archives = value;
    }

    /**
     * Gets the value of the cardProgFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardProgFrom() {
        return cardProgFrom;
    }

    /**
     * Sets the value of the cardProgFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardProgFrom(Long value) {
        this.cardProgFrom = value;
    }

    /**
     * Gets the value of the cardProgTo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardProgTo() {
        return cardProgTo;
    }

    /**
     * Sets the value of the cardProgTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardProgTo(Long value) {
        this.cardProgTo = value;
    }

    /**
     * Gets the value of the cardWithOutDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardWithOutDoc() {
        return cardWithOutDoc;
    }

    /**
     * Sets the value of the cardWithOutDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardWithOutDoc(Boolean value) {
        this.cardWithOutDoc = value;
    }

    /**
     * Gets the value of the checkSearchTooLong property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckSearchTooLong() {
        return checkSearchTooLong;
    }

    /**
     * Sets the value of the checkSearchTooLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckSearchTooLong(Boolean value) {
        this.checkSearchTooLong = value;
    }

    /**
     * Gets the value of the classificationSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchCriteria }
     *     
     */
    public ClassificationSearchCriteria getClassificationSearchCriteria() {
        return classificationSearchCriteria;
    }

    /**
     * Sets the value of the classificationSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchCriteria }
     *     
     */
    public void setClassificationSearchCriteria(ClassificationSearchCriteria value) {
        this.classificationSearchCriteria = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link SearchContext }
     *     
     */
    public SearchContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchContext }
     *     
     */
    public void setContext(SearchContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the contextFullText property.
     * 
     * @return
     *     possible object is
     *     {@link ContextFullText }
     *     
     */
    public ContextFullText getContextFullText() {
        return contextFullText;
    }

    /**
     * Sets the value of the contextFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextFullText }
     *     
     */
    public void setContextFullText(ContextFullText value) {
        this.contextFullText = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the durationSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DurationSearchCriteria }
     *     
     */
    public DurationSearchCriteria getDurationSearchCriteria() {
        return durationSearchCriteria;
    }

    /**
     * Sets the value of the durationSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationSearchCriteria }
     *     
     */
    public void setDurationSearchCriteria(DurationSearchCriteria value) {
        this.durationSearchCriteria = value;
    }

    /**
     * Gets the value of the extendedDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public ArrayOfDocumentType getExtendedDocumentType() {
        return extendedDocumentType;
    }

    /**
     * Sets the value of the extendedDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public void setExtendedDocumentType(ArrayOfDocumentType value) {
        this.extendedDocumentType = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setFields(ArrayOfField value) {
        this.fields = value;
    }

    /**
     * Gets the value of the filterFullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterFullText() {
        return filterFullText;
    }

    /**
     * Sets the value of the filterFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterFullText(String value) {
        this.filterFullText = value;
    }

    /**
     * Gets the value of the folderSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FolderSearchCriteria }
     *     
     */
    public FolderSearchCriteria getFolderSearchCriteria() {
        return folderSearchCriteria;
    }

    /**
     * Sets the value of the folderSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderSearchCriteria }
     *     
     */
    public void setFolderSearchCriteria(FolderSearchCriteria value) {
        this.folderSearchCriteria = value;
    }

    /**
     * Gets the value of the fuzzySearchFullText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuzzySearchFullText() {
        return fuzzySearchFullText;
    }

    /**
     * Sets the value of the fuzzySearchFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuzzySearchFullText(Boolean value) {
        this.fuzzySearchFullText = value;
    }

    /**
     * Gets the value of the invoiceDataTransmSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDataTransmissionSearchCriteria }
     *     
     */
    public InvoiceDataTransmissionSearchCriteria getInvoiceDataTransmSearchCriteria() {
        return invoiceDataTransmSearchCriteria;
    }

    /**
     * Sets the value of the invoiceDataTransmSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDataTransmissionSearchCriteria }
     *     
     */
    public void setInvoiceDataTransmSearchCriteria(InvoiceDataTransmissionSearchCriteria value) {
        this.invoiceDataTransmSearchCriteria = value;
    }

    /**
     * Gets the value of the invoiceSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSearchCriteria }
     *     
     */
    public InvoiceSearchCriteria getInvoiceSearchCriteria() {
        return invoiceSearchCriteria;
    }

    /**
     * Sets the value of the invoiceSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSearchCriteria }
     *     
     */
    public void setInvoiceSearchCriteria(InvoiceSearchCriteria value) {
        this.invoiceSearchCriteria = value;
    }

    /**
     * Gets the value of the isForcedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForcedDate() {
        return isForcedDate;
    }

    /**
     * Sets the value of the isForcedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForcedDate(Boolean value) {
        this.isForcedDate = value;
    }

    /**
     * Gets the value of the isForcedIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForcedIndex() {
        return isForcedIndex;
    }

    /**
     * Sets the value of the isForcedIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForcedIndex(Boolean value) {
        this.isForcedIndex = value;
    }

    /**
     * Gets the value of the mainDoc property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptions }
     *     
     */
    public SearchOptions getMainDoc() {
        return mainDoc;
    }

    /**
     * Sets the value of the mainDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptions }
     *     
     */
    public void setMainDoc(SearchOptions value) {
        this.mainDoc = value;
    }

    /**
     * Gets the value of the maxFounded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFounded() {
        return maxFounded;
    }

    /**
     * Sets the value of the maxFounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFounded(Integer value) {
        this.maxFounded = value;
    }

    /**
     * Gets the value of the maxToWait property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxToWait() {
        return maxToWait;
    }

    /**
     * Sets the value of the maxToWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxToWait(Integer value) {
        this.maxToWait = value;
    }

    /**
     * Gets the value of the noFormatKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFormatKey() {
        return noFormatKey;
    }

    /**
     * Sets the value of the noFormatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFormatKey(Boolean value) {
        this.noFormatKey = value;
    }

    /**
     * Gets the value of the noWordFullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoWordFullText() {
        return noWordFullText;
    }

    /**
     * Sets the value of the noWordFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoWordFullText(String value) {
        this.noWordFullText = value;
    }

    /**
     * Gets the value of the notDisplayInvalidatedCards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDisplayInvalidatedCards() {
        return notDisplayInvalidatedCards;
    }

    /**
     * Sets the value of the notDisplayInvalidatedCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDisplayInvalidatedCards(Boolean value) {
        this.notDisplayInvalidatedCards = value;
    }

    /**
     * Gets the value of the oneWordFullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWordFullText() {
        return oneWordFullText;
    }

    /**
     * Sets the value of the oneWordFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWordFullText(String value) {
        this.oneWordFullText = value;
    }

    /**
     * Gets the value of the onlyConnectedUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyConnectedUser() {
        return onlyConnectedUser;
    }

    /**
     * Sets the value of the onlyConnectedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyConnectedUser(Boolean value) {
        this.onlyConnectedUser = value;
    }

    /**
     * Gets the value of the orderByField property.
     * 
     * @return
     *     possible object is
     *     {@link FieldToOrderBy }
     *     
     */
    public FieldToOrderBy getOrderByField() {
        return orderByField;
    }

    /**
     * Sets the value of the orderByField property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldToOrderBy }
     *     
     */
    public void setOrderByField(FieldToOrderBy value) {
        this.orderByField = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyOrderType }
     *     
     */
    public KeyOrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyOrderType }
     *     
     */
    public void setOrderType(KeyOrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the pluralSearchFullText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPluralSearchFullText() {
        return pluralSearchFullText;
    }

    /**
     * Sets the value of the pluralSearchFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPluralSearchFullText(Boolean value) {
        this.pluralSearchFullText = value;
    }

    /**
     * Gets the value of the registerOperation property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterOperation }
     *     
     */
    public RegisterOperation getRegisterOperation() {
        return registerOperation;
    }

    /**
     * Sets the value of the registerOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterOperation }
     *     
     */
    public void setRegisterOperation(RegisterOperation value) {
        this.registerOperation = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchResult(SearchResult value) {
        this.searchResult = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearchType(SearchType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the sortDescending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortDescending() {
        return sortDescending;
    }

    /**
     * Sets the value of the sortDescending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortDescending(Boolean value) {
        this.sortDescending = value;
    }

    /**
     * Gets the value of the stringFullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringFullText() {
        return stringFullText;
    }

    /**
     * Sets the value of the stringFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringFullText(String value) {
        this.stringFullText = value;
    }

    /**
     * Gets the value of the useDefaultOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDefaultOptions() {
        return useDefaultOptions;
    }

    /**
     * Sets the value of the useDefaultOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultOptions(Boolean value) {
        this.useDefaultOptions = value;
    }

    /**
     * Gets the value of the wfCardStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link WfCardStatusFilter }
     *     
     */
    public WfCardStatusFilter getWfCardStatusFilter() {
        return wfCardStatusFilter;
    }

    /**
     * Sets the value of the wfCardStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WfCardStatusFilter }
     *     
     */
    public void setWfCardStatusFilter(WfCardStatusFilter value) {
        this.wfCardStatusFilter = value;
    }

    /**
     * Gets the value of the wordsFullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordsFullText() {
        return wordsFullText;
    }

    /**
     * Sets the value of the wordsFullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordsFullText(String value) {
        this.wordsFullText = value;
    }

}
