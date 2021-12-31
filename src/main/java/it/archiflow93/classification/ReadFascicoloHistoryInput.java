
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadFascicoloHistoryInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadFascicoloHistoryInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderAsc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}FascHistoryOrder" minOccurs="0"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadFascicoloHistoryInput", propOrder = {
    "fascId",
    "language",
    "orderAsc",
    "orderBy",
    "pageIndex",
    "pageSize"
})
public class ReadFascicoloHistoryInput
    extends BaseInput
{

    @XmlElement(name = "FascId", nillable = true)
    protected FascicoloIdentifier fascId;
    @XmlElement(name = "Language")
    protected Integer language;
    @XmlElement(name = "OrderAsc")
    protected Boolean orderAsc;
    @XmlElement(name = "OrderBy")
    protected FascHistoryOrder orderBy;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;

    /**
     * Gets the value of the fascId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascId() {
        return fascId;
    }

    /**
     * Sets the value of the fascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascId(FascicoloIdentifier value) {
        this.fascId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLanguage(Integer value) {
        this.language = value;
    }

    /**
     * Gets the value of the orderAsc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderAsc() {
        return orderAsc;
    }

    /**
     * Sets the value of the orderAsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderAsc(Boolean value) {
        this.orderAsc = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link FascHistoryOrder }
     *     
     */
    public FascHistoryOrder getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascHistoryOrder }
     *     
     */
    public void setOrderBy(FascHistoryOrder value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
