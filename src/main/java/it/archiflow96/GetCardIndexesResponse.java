
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
 *         &lt;element name="GetCardIndexesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oIndexes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
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
    "getCardIndexesResult",
    "oIndexes"
})
@XmlRootElement(name = "GetCardIndexesResponse")
public class GetCardIndexesResponse {

    @XmlElement(name = "GetCardIndexesResult")
    protected ResultInfo getCardIndexesResult;
    @XmlElement(nillable = true)
    protected ArrayOfField oIndexes;

    /**
     * Gets the value of the getCardIndexesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetCardIndexesResult() {
        return getCardIndexesResult;
    }

    /**
     * Sets the value of the getCardIndexesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetCardIndexesResult(ResultInfo value) {
        this.getCardIndexesResult = value;
    }

    /**
     * Gets the value of the oIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getOIndexes() {
        return oIndexes;
    }

    /**
     * Sets the value of the oIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setOIndexes(ArrayOfField value) {
        this.oIndexes = value;
    }

}
