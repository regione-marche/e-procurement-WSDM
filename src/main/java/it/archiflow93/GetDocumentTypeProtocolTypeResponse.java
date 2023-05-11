
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
 *         &lt;element name="GetDocumentTypeProtocolTypeResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="enProtocolType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AipType" minOccurs="0"/>
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
    "getDocumentTypeProtocolTypeResult",
    "enProtocolType"
})
@XmlRootElement(name = "GetDocumentTypeProtocolTypeResponse")
public class GetDocumentTypeProtocolTypeResponse {

    @XmlElement(name = "GetDocumentTypeProtocolTypeResult")
    protected ResultInfo getDocumentTypeProtocolTypeResult;
    protected AipType enProtocolType;

    /**
     * Gets the value of the getDocumentTypeProtocolTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDocumentTypeProtocolTypeResult() {
        return getDocumentTypeProtocolTypeResult;
    }

    /**
     * Sets the value of the getDocumentTypeProtocolTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDocumentTypeProtocolTypeResult(ResultInfo value) {
        this.getDocumentTypeProtocolTypeResult = value;
    }

    /**
     * Gets the value of the enProtocolType property.
     * 
     * @return
     *     possible object is
     *     {@link AipType }
     *     
     */
    public AipType getEnProtocolType() {
        return enProtocolType;
    }

    /**
     * Sets the value of the enProtocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AipType }
     *     
     */
    public void setEnProtocolType(AipType value) {
        this.enProtocolType = value;
    }

}
