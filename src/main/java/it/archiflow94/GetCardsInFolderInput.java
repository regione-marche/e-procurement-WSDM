
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardsInFolderInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardsInFolderInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GetIndexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDescending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderFieldId" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}FieldToOrderBy" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}KeyOrderType" minOccurs="0"/>
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
@XmlType(name = "GetCardsInFolderInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject", propOrder = {
    "folderId",
    "getIndexes",
    "isDescending",
    "orderFieldId",
    "orderType",
    "pageIndex",
    "pageSize"
})
public class GetCardsInFolderInput
    extends BaseInput
{

    @XmlElement(name = "FolderId")
    protected Integer folderId;
    @XmlElement(name = "GetIndexes")
    protected Boolean getIndexes;
    @XmlElement(name = "IsDescending")
    protected Boolean isDescending;
    @XmlElement(name = "OrderFieldId")
    protected FieldToOrderBy orderFieldId;
    @XmlElement(name = "OrderType", nillable = true)
    protected KeyOrderType orderType;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the getIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetIndexes() {
        return getIndexes;
    }

    /**
     * Sets the value of the getIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetIndexes(Boolean value) {
        this.getIndexes = value;
    }

    /**
     * Gets the value of the isDescending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDescending() {
        return isDescending;
    }

    /**
     * Sets the value of the isDescending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDescending(Boolean value) {
        this.isDescending = value;
    }

    /**
     * Gets the value of the orderFieldId property.
     * 
     * @return
     *     possible object is
     *     {@link FieldToOrderBy }
     *     
     */
    public FieldToOrderBy getOrderFieldId() {
        return orderFieldId;
    }

    /**
     * Sets the value of the orderFieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldToOrderBy }
     *     
     */
    public void setOrderFieldId(FieldToOrderBy value) {
        this.orderFieldId = value;
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
