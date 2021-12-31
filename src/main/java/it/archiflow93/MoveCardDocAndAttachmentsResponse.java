
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
 *         &lt;element name="MoveCardDocAndAttachmentsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}MoveCardDocAndAttachmentsOutput" minOccurs="0"/>
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
    "moveCardDocAndAttachmentsResult"
})
@XmlRootElement(name = "MoveCardDocAndAttachmentsResponse")
public class MoveCardDocAndAttachmentsResponse {

    @XmlElement(name = "MoveCardDocAndAttachmentsResult", nillable = true)
    protected MoveCardDocAndAttachmentsOutput moveCardDocAndAttachmentsResult;

    /**
     * Gets the value of the moveCardDocAndAttachmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MoveCardDocAndAttachmentsOutput }
     *     
     */
    public MoveCardDocAndAttachmentsOutput getMoveCardDocAndAttachmentsResult() {
        return moveCardDocAndAttachmentsResult;
    }

    /**
     * Sets the value of the moveCardDocAndAttachmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveCardDocAndAttachmentsOutput }
     *     
     */
    public void setMoveCardDocAndAttachmentsResult(MoveCardDocAndAttachmentsOutput value) {
        this.moveCardDocAndAttachmentsResult = value;
    }

}
