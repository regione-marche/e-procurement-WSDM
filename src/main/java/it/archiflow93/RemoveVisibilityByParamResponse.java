
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
 *         &lt;element name="RemoveVisibilityByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}RemoveVisibilityOutput" minOccurs="0"/>
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
    "removeVisibilityByParamResult"
})
@XmlRootElement(name = "RemoveVisibilityByParamResponse")
public class RemoveVisibilityByParamResponse {

    @XmlElement(name = "RemoveVisibilityByParamResult", nillable = true)
    protected RemoveVisibilityOutput removeVisibilityByParamResult;

    /**
     * Gets the value of the removeVisibilityByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveVisibilityOutput }
     *     
     */
    public RemoveVisibilityOutput getRemoveVisibilityByParamResult() {
        return removeVisibilityByParamResult;
    }

    /**
     * Sets the value of the removeVisibilityByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveVisibilityOutput }
     *     
     */
    public void setRemoveVisibilityByParamResult(RemoveVisibilityOutput value) {
        this.removeVisibilityByParamResult = value;
    }

}
