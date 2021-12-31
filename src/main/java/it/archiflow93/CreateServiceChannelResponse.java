
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
 *         &lt;element name="CreateServiceChannelResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="serviceChannelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "createServiceChannelResult",
    "serviceChannelId"
})
@XmlRootElement(name = "CreateServiceChannelResponse")
public class CreateServiceChannelResponse {

    @XmlElement(name = "CreateServiceChannelResult")
    protected ResultInfo createServiceChannelResult;
    protected Integer serviceChannelId;

    /**
     * Gets the value of the createServiceChannelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCreateServiceChannelResult() {
        return createServiceChannelResult;
    }

    /**
     * Sets the value of the createServiceChannelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCreateServiceChannelResult(ResultInfo value) {
        this.createServiceChannelResult = value;
    }

    /**
     * Gets the value of the serviceChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceChannelId() {
        return serviceChannelId;
    }

    /**
     * Sets the value of the serviceChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceChannelId(Integer value) {
        this.serviceChannelId = value;
    }

}
