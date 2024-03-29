
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities.FascHistoryOrder;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pFascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderBy" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types}FascHistoryOrder" minOccurs="0"/>
 *         &lt;element name="orderAsc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pFascId",
    "pageSize",
    "pageIndex",
    "orderBy",
    "orderAsc"
})
@XmlRootElement(name = "ReadFascicoloHistoryPaged")
public class ReadFascicoloHistoryPaged {

    @XmlElementRef(name = "pFascId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> pFascId;
    protected Integer pageSize;
    protected Integer pageIndex;
    protected FascHistoryOrder orderBy;
    protected Boolean orderAsc;

    /**
     * Gets the value of the pFascId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getPFascId() {
        return pFascId;
    }

    /**
     * Sets the value of the pFascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setPFascId(JAXBElement<FascicoloIdentifier> value) {
        this.pFascId = ((JAXBElement<FascicoloIdentifier> ) value);
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

}
