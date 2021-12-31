
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
 *         &lt;element name="CheckCreateZipCardsDataResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CheckCreateZipCardsDataOutput" minOccurs="0"/>
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
    "checkCreateZipCardsDataResult"
})
@XmlRootElement(name = "CheckCreateZipCardsDataResponse")
public class CheckCreateZipCardsDataResponse {

    @XmlElement(name = "CheckCreateZipCardsDataResult", nillable = true)
    protected CheckCreateZipCardsDataOutput checkCreateZipCardsDataResult;

    /**
     * Gets the value of the checkCreateZipCardsDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCreateZipCardsDataOutput }
     *     
     */
    public CheckCreateZipCardsDataOutput getCheckCreateZipCardsDataResult() {
        return checkCreateZipCardsDataResult;
    }

    /**
     * Sets the value of the checkCreateZipCardsDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCreateZipCardsDataOutput }
     *     
     */
    public void setCheckCreateZipCardsDataResult(CheckCreateZipCardsDataOutput value) {
        this.checkCreateZipCardsDataResult = value;
    }

}
