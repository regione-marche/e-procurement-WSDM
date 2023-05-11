
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
 *         &lt;element name="ReadChannelServicesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="channelServices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfServiceChannel" minOccurs="0"/>
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
    "readChannelServicesResult",
    "channelServices"
})
@XmlRootElement(name = "ReadChannelServicesResponse")
public class ReadChannelServicesResponse {

    @XmlElement(name = "ReadChannelServicesResult")
    protected ResultInfo readChannelServicesResult;
    @XmlElement(nillable = true)
    protected ArrayOfServiceChannel channelServices;

    /**
     * Gets the value of the readChannelServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getReadChannelServicesResult() {
        return readChannelServicesResult;
    }

    /**
     * Sets the value of the readChannelServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setReadChannelServicesResult(ResultInfo value) {
        this.readChannelServicesResult = value;
    }

    /**
     * Gets the value of the channelServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceChannel }
     *     
     */
    public ArrayOfServiceChannel getChannelServices() {
        return channelServices;
    }

    /**
     * Sets the value of the channelServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceChannel }
     *     
     */
    public void setChannelServices(ArrayOfServiceChannel value) {
        this.channelServices = value;
    }

}
