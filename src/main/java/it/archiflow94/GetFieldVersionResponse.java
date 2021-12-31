
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
 *         &lt;element name="GetFieldVersionResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetFieldVersionOutput" minOccurs="0"/>
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
    "getFieldVersionResult"
})
@XmlRootElement(name = "GetFieldVersionResponse")
public class GetFieldVersionResponse {

    @XmlElement(name = "GetFieldVersionResult", nillable = true)
    protected GetFieldVersionOutput getFieldVersionResult;

    /**
     * Gets the value of the getFieldVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetFieldVersionOutput }
     *     
     */
    public GetFieldVersionOutput getGetFieldVersionResult() {
        return getFieldVersionResult;
    }

    /**
     * Sets the value of the getFieldVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFieldVersionOutput }
     *     
     */
    public void setGetFieldVersionResult(GetFieldVersionOutput value) {
        this.getFieldVersionResult = value;
    }

}
