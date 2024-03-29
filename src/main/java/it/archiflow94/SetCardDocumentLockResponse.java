
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
 *         &lt;element name="SetCardDocumentLockResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SetCardDocumentLockOutput" minOccurs="0"/>
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
    "setCardDocumentLockResult"
})
@XmlRootElement(name = "SetCardDocumentLockResponse")
public class SetCardDocumentLockResponse {

    @XmlElement(name = "SetCardDocumentLockResult", nillable = true)
    protected SetCardDocumentLockOutput setCardDocumentLockResult;

    /**
     * Gets the value of the setCardDocumentLockResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetCardDocumentLockOutput }
     *     
     */
    public SetCardDocumentLockOutput getSetCardDocumentLockResult() {
        return setCardDocumentLockResult;
    }

    /**
     * Sets the value of the setCardDocumentLockResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCardDocumentLockOutput }
     *     
     */
    public void setSetCardDocumentLockResult(SetCardDocumentLockOutput value) {
        this.setCardDocumentLockResult = value;
    }

}
