
package it.archiflow96.email;

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
 *         &lt;element name="GetMailBoxResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oMailBoxes" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}ArrayOfMailBox" minOccurs="0"/>
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
    "getMailBoxResult",
    "oMailBoxes"
})
@XmlRootElement(name = "GetMailBoxResponse", namespace = "http://tempuri.org/")
public class GetMailBoxResponse {

    @XmlElement(name = "GetMailBoxResult", namespace = "http://tempuri.org/")
    protected ResultInfo getMailBoxResult;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected ArrayOfMailBox oMailBoxes;

    /**
     * Gets the value of the getMailBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetMailBoxResult() {
        return getMailBoxResult;
    }

    /**
     * Sets the value of the getMailBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetMailBoxResult(ResultInfo value) {
        this.getMailBoxResult = value;
    }

    /**
     * Gets the value of the oMailBoxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailBox }
     *     
     */
    public ArrayOfMailBox getOMailBoxes() {
        return oMailBoxes;
    }

    /**
     * Sets the value of the oMailBoxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailBox }
     *     
     */
    public void setOMailBoxes(ArrayOfMailBox value) {
        this.oMailBoxes = value;
    }

}
