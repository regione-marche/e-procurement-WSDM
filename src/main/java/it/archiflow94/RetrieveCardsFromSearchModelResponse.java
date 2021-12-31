
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RetrieveCardsFromSearchModelResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCards" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfCard" minOccurs="0"/>
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
    "retrieveCardsFromSearchModelResult",
    "oCards"
})
@XmlRootElement(name = "RetrieveCardsFromSearchModelResponse")
public class RetrieveCardsFromSearchModelResponse {

    @XmlElement(name = "RetrieveCardsFromSearchModelResult")
    protected ResultInfo retrieveCardsFromSearchModelResult;
    @XmlElement(nillable = true)
    protected ArrayOfCard oCards;

    /**
     * Gets the value of the retrieveCardsFromSearchModelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getRetrieveCardsFromSearchModelResult() {
        return retrieveCardsFromSearchModelResult;
    }

    /**
     * Sets the value of the retrieveCardsFromSearchModelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setRetrieveCardsFromSearchModelResult(ResultInfo value) {
        this.retrieveCardsFromSearchModelResult = value;
    }

    /**
     * Gets the value of the oCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCard }
     *     
     */
    public ArrayOfCard getOCards() {
        return oCards;
    }

    /**
     * Sets the value of the oCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCard }
     *     
     */
    public void setOCards(ArrayOfCard value) {
        this.oCards = value;
    }

}
