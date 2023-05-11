
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.siav_classification_entities.EntityDataType;
import org.datacontract.schemas._2004._07.siav_classification_entities.EntityQueryType;
import org.datacontract.schemas._2004._07.siav_classification_entities.NumerationType;
import org.datacontract.schemas._2004._07.siav_classification_entities.ReadEntityType;
import org.datacontract.schemas._2004._07.siav_classification_entities.SortingTypes;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.CustomDateTimeNullable;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.TipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolario.TitolarioIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolarioitem.TitolarioItemIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibility;


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
 *         &lt;element name="Data_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}EntityDataType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Numeration_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}NumerationType" minOccurs="0"/>
 *         &lt;element name="OpenDataFrom" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="OpenDataTo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.BaseClass}CustomDateTimeNullable" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}SortingTypes" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="ReadTypeFasc" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}ReadEntityType" minOccurs="0"/>
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
    "description",
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
    @XmlElementRef(name = "Classification_Code", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> classificationCode;
    @XmlElementRef(name = "CloseDataFrom", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> closeDataFrom;
    @XmlElementRef(name = "CloseDataTo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> closeDataTo;
    @XmlElementRef(name = "Code_Num", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> codeNum;
    @XmlElementRef(name = "Code_Num_From", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> codeNumFrom;
    @XmlElementRef(name = "Code_Num_To", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> codeNumTo;
    @XmlElement(name = "CurrentDiscardYears")
    protected Integer currentDiscardYears;
    @XmlElement(name = "Data_Type")
    protected EntityDataType dataType;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "FascicoloFields", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCampiTipoFascicoloValue> fascicoloFields;
    @XmlElementRef(name = "FascicoloId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> fascicoloId;
    @XmlElementRef(name = "FascicoloId_From", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> fascicoloIdFrom;
    @XmlElementRef(name = "FascicoloId_To", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> fascicoloIdTo;
    @XmlElementRef(name = "FascicoloVis", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<BaseVisibility> fascicoloVis;
    @XmlElement(name = "FinalDiscardYears")
    protected Integer finalDiscardYears;
    @XmlElement(name = "HistoricalDiscardYears")
    protected Integer historicalDiscardYears;
    @XmlElementRef(name = "Label", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "LegislaturaCode", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> legislaturaCode;
    @XmlElementRef(name = "List_Classification_ID", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> listClassificationID;
    @XmlElementRef(name = "List_UO_Manufacturer", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> listUOManufacturer;
    @XmlElementRef(name = "List_UO_Responsible", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> listUOResponsible;
    @XmlElementRef(name = "List_UserId_Resp", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> listUserIdResp;
    @XmlElementRef(name = "LocationName", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> locationName;
    @XmlElementRef(name = "Note", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> note;
    @XmlElement(name = "Numeration_Type")
    protected NumerationType numerationType;
    @XmlElementRef(name = "OpenDataFrom", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> openDataFrom;
    @XmlElementRef(name = "OpenDataTo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<CustomDateTimeNullable> openDataTo;
    @XmlElement(name = "OrderBy")
    protected SortingTypes orderBy;
    @XmlElementRef(name = "ParentId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> parentId;
    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "ReadTypeFasc")
    protected ReadEntityType readTypeFasc;
    @XmlElement(name = "StoreDiscardYears")
    protected Integer storeDiscardYears;
    @XmlElementRef(name = "Subject", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "Thesaurus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<String> thesaurus;
    @XmlElementRef(name = "TipoFascicolo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<TipoFascicoloIdentifier> tipoFascicolo;
    @XmlElementRef(name = "TitolarioId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<TitolarioIdentifier> titolarioId;
    @XmlElementRef(name = "TitolarioItem_id", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<TitolarioItemIdentifier> titolarioItemId;
    @XmlElementRef(name = "UtenteId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", type = JAXBElement.class)
    protected JAXBElement<BaseIdentifier> utenteId;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationCode(JAXBElement<String> value) {
        this.classificationCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the closeDataFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getCloseDataFrom() {
        return closeDataFrom;
    }

    /**
     * Sets the value of the closeDataFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setCloseDataFrom(JAXBElement<CustomDateTimeNullable> value) {
        this.closeDataFrom = ((JAXBElement<CustomDateTimeNullable> ) value);
    }

    /**
     * Gets the value of the closeDataTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getCloseDataTo() {
        return closeDataTo;
    }

    /**
     * Sets the value of the closeDataTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setCloseDataTo(JAXBElement<CustomDateTimeNullable> value) {
        this.closeDataTo = ((JAXBElement<CustomDateTimeNullable> ) value);
    }

    /**
     * Gets the value of the codeNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeNum() {
        return codeNum;
    }

    /**
     * Sets the value of the codeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeNum(JAXBElement<String> value) {
        this.codeNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codeNumFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeNumFrom() {
        return codeNumFrom;
    }

    /**
     * Sets the value of the codeNumFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeNumFrom(JAXBElement<String> value) {
        this.codeNumFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codeNumTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeNumTo() {
        return codeNumTo;
    }

    /**
     * Sets the value of the codeNumTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeNumTo(JAXBElement<String> value) {
        this.codeNumTo = ((JAXBElement<String> ) value);
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fascicoloFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> getFascicoloFields() {
        return fascicoloFields;
    }

    /**
     * Sets the value of the fascicoloFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}
     *     
     */
    public void setFascicoloFields(JAXBElement<ArrayOfCampiTipoFascicoloValue> value) {
        this.fascicoloFields = ((JAXBElement<ArrayOfCampiTipoFascicoloValue> ) value);
    }

    /**
     * Gets the value of the fascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setFascicoloId(JAXBElement<FascicoloIdentifier> value) {
        this.fascicoloId = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the fascicoloIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getFascicoloIdFrom() {
        return fascicoloIdFrom;
    }

    /**
     * Sets the value of the fascicoloIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setFascicoloIdFrom(JAXBElement<FascicoloIdentifier> value) {
        this.fascicoloIdFrom = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the fascicoloIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getFascicoloIdTo() {
        return fascicoloIdTo;
    }

    /**
     * Sets the value of the fascicoloIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setFascicoloIdTo(JAXBElement<FascicoloIdentifier> value) {
        this.fascicoloIdTo = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the fascicoloVis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}
     *     
     */
    public JAXBElement<BaseVisibility> getFascicoloVis() {
        return fascicoloVis;
    }

    /**
     * Sets the value of the fascicoloVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}
     *     
     */
    public void setFascicoloVis(JAXBElement<BaseVisibility> value) {
        this.fascicoloVis = ((JAXBElement<BaseVisibility> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the legislaturaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegislaturaCode() {
        return legislaturaCode;
    }

    /**
     * Sets the value of the legislaturaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegislaturaCode(JAXBElement<String> value) {
        this.legislaturaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the listClassificationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getListClassificationID() {
        return listClassificationID;
    }

    /**
     * Sets the value of the listClassificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setListClassificationID(JAXBElement<ArrayOfint> value) {
        this.listClassificationID = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the listUOManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getListUOManufacturer() {
        return listUOManufacturer;
    }

    /**
     * Sets the value of the listUOManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setListUOManufacturer(JAXBElement<ArrayOfint> value) {
        this.listUOManufacturer = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the listUOResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getListUOResponsible() {
        return listUOResponsible;
    }

    /**
     * Sets the value of the listUOResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setListUOResponsible(JAXBElement<ArrayOfint> value) {
        this.listUOResponsible = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the listUserIdResp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getListUserIdResp() {
        return listUserIdResp;
    }

    /**
     * Sets the value of the listUserIdResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setListUserIdResp(JAXBElement<ArrayOfint> value) {
        this.listUserIdResp = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationName(JAXBElement<String> value) {
        this.locationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getOpenDataFrom() {
        return openDataFrom;
    }

    /**
     * Sets the value of the openDataFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setOpenDataFrom(JAXBElement<CustomDateTimeNullable> value) {
        this.openDataFrom = ((JAXBElement<CustomDateTimeNullable> ) value);
    }

    /**
     * Gets the value of the openDataTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public JAXBElement<CustomDateTimeNullable> getOpenDataTo() {
        return openDataTo;
    }

    /**
     * Sets the value of the openDataTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}
     *     
     */
    public void setOpenDataTo(JAXBElement<CustomDateTimeNullable> value) {
        this.openDataTo = ((JAXBElement<CustomDateTimeNullable> ) value);
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
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setParentId(JAXBElement<FascicoloIdentifier> value) {
        this.parentId = ((JAXBElement<FascicoloIdentifier> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the thesaurus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThesaurus() {
        return thesaurus;
    }

    /**
     * Sets the value of the thesaurus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThesaurus(JAXBElement<String> value) {
        this.thesaurus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<TipoFascicoloIdentifier> getTipoFascicolo() {
        return tipoFascicolo;
    }

    /**
     * Sets the value of the tipoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}
     *     
     */
    public void setTipoFascicolo(JAXBElement<TipoFascicoloIdentifier> value) {
        this.tipoFascicolo = ((JAXBElement<TipoFascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the titolarioId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TitolarioIdentifier }{@code >}
     *     
     */
    public JAXBElement<TitolarioIdentifier> getTitolarioId() {
        return titolarioId;
    }

    /**
     * Sets the value of the titolarioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TitolarioIdentifier }{@code >}
     *     
     */
    public void setTitolarioId(JAXBElement<TitolarioIdentifier> value) {
        this.titolarioId = ((JAXBElement<TitolarioIdentifier> ) value);
    }

    /**
     * Gets the value of the titolarioItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<TitolarioItemIdentifier> getTitolarioItemId() {
        return titolarioItemId;
    }

    /**
     * Sets the value of the titolarioItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}
     *     
     */
    public void setTitolarioItemId(JAXBElement<TitolarioItemIdentifier> value) {
        this.titolarioItemId = ((JAXBElement<TitolarioItemIdentifier> ) value);
    }

    /**
     * Gets the value of the utenteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public JAXBElement<BaseIdentifier> getUtenteId() {
        return utenteId;
    }

    /**
     * Sets the value of the utenteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}
     *     
     */
    public void setUtenteId(JAXBElement<BaseIdentifier> value) {
        this.utenteId = ((JAXBElement<BaseIdentifier> ) value);
    }

}
