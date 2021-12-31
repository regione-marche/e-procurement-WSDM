
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
 *         &lt;element name="DeleteCardByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DeleteCardOutput" minOccurs="0"/>
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
    "deleteCardByParamResult"
})
@XmlRootElement(name = "DeleteCardByParamResponse")
public class DeleteCardByParamResponse {

    @XmlElement(name = "DeleteCardByParamResult", nillable = true)
    protected DeleteCardOutput deleteCardByParamResult;

    /**
     * Gets the value of the deleteCardByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCardOutput }
     *     
     */
    public DeleteCardOutput getDeleteCardByParamResult() {
        return deleteCardByParamResult;
    }

    /**
     * Sets the value of the deleteCardByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCardOutput }
     *     
     */
    public void setDeleteCardByParamResult(DeleteCardOutput value) {
        this.deleteCardByParamResult = value;
    }

}
