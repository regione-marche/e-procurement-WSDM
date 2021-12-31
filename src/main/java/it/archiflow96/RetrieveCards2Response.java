
package it.archiflow96;

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
 *         &lt;element name="RetrieveCards2Result" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "retrieveCards2Result",
    "hitCount",
    "oCards"
})
@XmlRootElement(name = "RetrieveCards2Response")
public class RetrieveCards2Response {

    @XmlElement(name = "RetrieveCards2Result")
    protected ResultInfo retrieveCards2Result;
    @XmlElement(name = "HitCount")
    protected Integer hitCount;
    @XmlElement(nillable = true)
    protected ArrayOfCard oCards;

    /**
     * Gets the value of the retrieveCards2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getRetrieveCards2Result() {
        return retrieveCards2Result;
    }

    /**
     * Sets the value of the retrieveCards2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setRetrieveCards2Result(ResultInfo value) {
        this.retrieveCards2Result = value;
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
