
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
 *         &lt;element name="AttachPressMarkResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}AttachPressMarkOutput" minOccurs="0"/>
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
    "attachPressMarkResult"
})
@XmlRootElement(name = "AttachPressMarkResponse")
public class AttachPressMarkResponse {

    @XmlElement(name = "AttachPressMarkResult", nillable = true)
    protected AttachPressMarkOutput attachPressMarkResult;

    /**
     * Gets the value of the attachPressMarkResult property.
     * 
     * @return
     *     possible object is
     *     {@link AttachPressMarkOutput }
     *     
     */
    public AttachPressMarkOutput getAttachPressMarkResult() {
        return attachPressMarkResult;
    }

    /**
     * Sets the value of the attachPressMarkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachPressMarkOutput }
     *     
     */
    public void setAttachPressMarkResult(AttachPressMarkOutput value) {
        this.attachPressMarkResult = value;
    }

}
