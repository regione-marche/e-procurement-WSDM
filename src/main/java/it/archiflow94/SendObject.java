
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendEntities" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfSendEntity" minOccurs="0"/>
 *         &lt;element name="SendOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SendOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendObject", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "sendEntities",
    "sendOptions"
})
public class SendObject {

    @XmlElement(name = "SendEntities", nillable = true)
    protected ArrayOfSendEntity sendEntities;
    @XmlElement(name = "SendOptions", nillable = true)
    protected SendOptions sendOptions;

    /**
     * Gets the value of the sendEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSendEntity }
     *     
     */
    public ArrayOfSendEntity getSendEntities() {
        return sendEntities;
    }

    /**
     * Sets the value of the sendEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSendEntity }
     *     
     */
    public void setSendEntities(ArrayOfSendEntity value) {
        this.sendEntities = value;
    }

    /**
     * Gets the value of the sendOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SendOptions }
     *     
     */
    public SendOptions getSendOptions() {
        return sendOptions;
    }

    /**
     * Sets the value of the sendOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendOptions }
     *     
     */
    public void setSendOptions(SendOptions value) {
        this.sendOptions = value;
    }

}
