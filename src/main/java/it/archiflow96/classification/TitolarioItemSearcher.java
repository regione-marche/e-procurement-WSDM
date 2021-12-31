
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitolarioItemSearcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioItemSearcher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseSearcher">
 *       &lt;sequence>
 *         &lt;element name="IsCodeSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDescSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLabelSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPuntualSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsThesaurusSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}SortingTypes" minOccurs="0"/>
 *         &lt;element name="ParamLists" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}EntityQueryType" minOccurs="0"/>
 *         &lt;element name="ReadLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitolarioItem_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *         &lt;element name="Titolario_Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}TitolarioIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioItemSearcher", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Searcher", propOrder = {
    "isCodeSearch",
    "isDescSearch",
    "isLabelSearch",
    "isPuntualSearch",
    "isThesaurusSearch",
    "orderBy",
    "paramLists",
    "queryType",
    "readLevel",
    "titolarioItemId",
    "titolarioId"
})
public class TitolarioItemSearcher
    extends BaseSearcher
{

    @XmlElement(name = "IsCodeSearch")
    protected Boolean isCodeSearch;
    @XmlElement(name = "IsDescSearch")
    protected Boolean isDescSearch;
    @XmlElement(name = "IsLabelSearch")
    protected Boolean isLabelSearch;
    @XmlElement(name = "IsPuntualSearch")
    protected Boolean isPuntualSearch;
    @XmlElement(name = "IsThesaurusSearch")
    protected Boolean isThesaurusSearch;
    @XmlElement(name = "OrderBy")
    protected SortingTypes orderBy;
    @XmlElement(name = "ParamLists", nillable = true)
    protected ArrayOfstring paramLists;
    @XmlElement(name = "QueryType")
    protected EntityQueryType queryType;
    @XmlElement(name = "ReadLevel")
    protected Integer readLevel;
    @XmlElement(name = "TitolarioItem_Id", nillable = true)
    protected TitolarioItemIdentifier titolarioItemId;
    @XmlElement(name = "Titolario_Id", nillable = true)
    protected TitolarioIdentifier titolarioId;

    /**
     * Gets the value of the isCodeSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCodeSearch() {
        return isCodeSearch;
    }

    /**
     * Sets the value of the isCodeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCodeSearch(Boolean value) {
        this.isCodeSearch = value;
    }

    /**
     * Gets the value of the isDescSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDescSearch() {
        return isDescSearch;
    }

    /**
     * Sets the value of the isDescSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDescSearch(Boolean value) {
        this.isDescSearch = value;
    }

    /**
     * Gets the value of the isLabelSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLabelSearch() {
        return isLabelSearch;
    }

    /**
     * Sets the value of the isLabelSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLabelSearch(Boolean value) {
        this.isLabelSearch = value;
    }

    /**
     * Gets the value of the isPuntualSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPuntualSearch() {
        return isPuntualSearch;
    }

    /**
     * Sets the value of the isPuntualSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPuntualSearch(Boolean value) {
        this.isPuntualSearch = value;
    }

    /**
     * Gets the value of the isThesaurusSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsThesaurusSearch() {
        return isThesaurusSearch;
    }

    /**
     * Sets the value of the isThesaurusSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThesaurusSearch(Boolean value) {
        this.isThesaurusSearch = value;
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
     * Gets the value of the paramLists property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getParamLists() {
        return paramLists;
    }

    /**
     * Sets the value of the paramLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setParamLists(ArrayOfstring value) {
        this.paramLists = value;
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
     * Gets the value of the readLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReadLevel() {
        return readLevel;
    }

    /**
     * Sets the value of the readLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReadLevel(Integer value) {
        this.readLevel = value;
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

}
