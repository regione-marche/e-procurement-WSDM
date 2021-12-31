
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveCardsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCardsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="GetAdditives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetIndexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetInvoicesMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoicesTotalAmountMode" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}InvoicesTotalAmountMode" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchCriteria" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCardsInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "getAdditives",
    "getIndexes",
    "getInvoice",
    "getInvoicesMonitor",
    "invoicesTotalAmountMode",
    "pageNumber",
    "pageSize",
    "searchCriteria"
})
public class RetrieveCardsInput
    extends BaseInput
{

    @XmlElement(name = "GetAdditives")
    protected Boolean getAdditives;
    @XmlElement(name = "GetIndexes")
    protected Boolean getIndexes;
    @XmlElement(name = "GetInvoice", nillable = true)
    protected Boolean getInvoice;
    @XmlElement(name = "GetInvoicesMonitor", nillable = true)
    protected Boolean getInvoicesMonitor;
    @XmlElement(name = "InvoicesTotalAmountMode")
    protected InvoicesTotalAmountMode invoicesTotalAmountMode;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "SearchCriteria", nillable = true)
    protected SearchCriteria searchCriteria;

    /**
     * Gets the value of the getAdditives property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetAdditives() {
        return getAdditives;
    }

    /**
     * Sets the value of the getAdditives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetAdditives(Boolean value) {
        this.getAdditives = value;
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
     * Gets the value of the getInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetInvoice() {
        return getInvoice;
    }

    /**
     * Sets the value of the getInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetInvoice(Boolean value) {
        this.getInvoice = value;
    }

    /**
     * Gets the value of the getInvoicesMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetInvoicesMonitor() {
        return getInvoicesMonitor;
    }

    /**
     * Sets the value of the getInvoicesMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetInvoicesMonitor(Boolean value) {
        this.getInvoicesMonitor = value;
    }

    /**
     * Gets the value of the invoicesTotalAmountMode property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicesTotalAmountMode }
     *     
     */
    public InvoicesTotalAmountMode getInvoicesTotalAmountMode() {
        return invoicesTotalAmountMode;
    }

    /**
     * Sets the value of the invoicesTotalAmountMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicesTotalAmountMode }
     *     
     */
    public void setInvoicesTotalAmountMode(InvoicesTotalAmountMode value) {
        this.invoicesTotalAmountMode = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
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
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setSearchCriteria(SearchCriteria value) {
        this.searchCriteria = value;
    }

}
