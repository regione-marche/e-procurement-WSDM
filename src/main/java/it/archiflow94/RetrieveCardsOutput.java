
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveCardsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCardsOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Cards" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfCard" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceMonitor" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Invoice.Monitor}InvoiceMonitor" minOccurs="0"/>
 *         &lt;element name="SearchResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCardsOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cards",
    "hitCount",
    "invoiceMonitor",
    "searchResult"
})
public class RetrieveCardsOutput
    extends BaseOutput
{

    @XmlElement(name = "Cards", nillable = true)
    protected ArrayOfCard cards;
    @XmlElement(name = "HitCount")
    protected Integer hitCount;
    @XmlElement(name = "InvoiceMonitor", nillable = true)
    protected InvoiceMonitor invoiceMonitor;
    @XmlElement(name = "SearchResult")
    protected SearchResult searchResult;

    /**
     * Gets the value of the cards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCard }
     *     
     */
    public ArrayOfCard getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCard }
     *     
     */
    public void setCards(ArrayOfCard value) {
        this.cards = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHitCount(Integer value) {
        this.hitCount = value;
    }

    /**
     * Gets the value of the invoiceMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceMonitor }
     *     
     */
    public InvoiceMonitor getInvoiceMonitor() {
        return invoiceMonitor;
    }

    /**
     * Sets the value of the invoiceMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceMonitor }
     *     
     */
    public void setInvoiceMonitor(InvoiceMonitor value) {
        this.invoiceMonitor = value;
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

}
