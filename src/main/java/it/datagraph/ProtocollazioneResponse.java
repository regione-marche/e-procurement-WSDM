
package it.datagraph;

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
 *         &lt;element name="ProtocollazioneResult" type="{http://tempuri.org/}ProtocollazioneRet" minOccurs="0"/>
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
    "protocollazioneResult"
})
@XmlRootElement(name = "ProtocollazioneResponse")
public class ProtocollazioneResponse {

    @XmlElement(name = "ProtocollazioneResult")
    protected ProtocollazioneRet protocollazioneResult;

    /**
     * Gets the value of the protocollazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public ProtocollazioneRet getProtocollazioneResult() {
        return protocollazioneResult;
    }

    /**
     * Sets the value of the protocollazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public void setProtocollazioneResult(ProtocollazioneRet value) {
        this.protocollazioneResult = value;
    }

}
