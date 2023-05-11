
package it.archiflow93;

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
 *         &lt;element name="RetrieveCardsByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}RetrieveCardsOutput" minOccurs="0"/>
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
    "retrieveCardsByParamResult"
})
@XmlRootElement(name = "RetrieveCardsByParamResponse")
public class RetrieveCardsByParamResponse {

    @XmlElement(name = "RetrieveCardsByParamResult", nillable = true)
    protected RetrieveCardsOutput retrieveCardsByParamResult;

    /**
     * Gets the value of the retrieveCardsByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveCardsOutput }
     *     
     */
    public RetrieveCardsOutput getRetrieveCardsByParamResult() {
        return retrieveCardsByParamResult;
    }

    /**
     * Sets the value of the retrieveCardsByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveCardsOutput }
     *     
     */
    public void setRetrieveCardsByParamResult(RetrieveCardsOutput value) {
        this.retrieveCardsByParamResult = value;
    }

}
