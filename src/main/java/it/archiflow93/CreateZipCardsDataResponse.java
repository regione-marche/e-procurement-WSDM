
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
 *         &lt;element name="CreateZipCardsDataResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}CreateZipCardsDataOutput" minOccurs="0"/>
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
    "createZipCardsDataResult"
})
@XmlRootElement(name = "CreateZipCardsDataResponse")
public class CreateZipCardsDataResponse {

    @XmlElement(name = "CreateZipCardsDataResult", nillable = true)
    protected CreateZipCardsDataOutput createZipCardsDataResult;

    /**
     * Gets the value of the createZipCardsDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateZipCardsDataOutput }
     *     
     */
    public CreateZipCardsDataOutput getCreateZipCardsDataResult() {
        return createZipCardsDataResult;
    }

    /**
     * Sets the value of the createZipCardsDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateZipCardsDataOutput }
     *     
     */
    public void setCreateZipCardsDataResult(CreateZipCardsDataOutput value) {
        this.createZipCardsDataResult = value;
    }

}
