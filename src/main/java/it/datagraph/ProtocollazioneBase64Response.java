
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
 *         &lt;element name="ProtocollazioneBase64Result" type="{http://tempuri.org/}ProtocollazioneRet" minOccurs="0"/>
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
    "protocollazioneBase64Result"
})
@XmlRootElement(name = "ProtocollazioneBase64Response")
public class ProtocollazioneBase64Response {

    @XmlElement(name = "ProtocollazioneBase64Result")
    protected ProtocollazioneRet protocollazioneBase64Result;

    /**
     * Gets the value of the protocollazioneBase64Result property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public ProtocollazioneRet getProtocollazioneBase64Result() {
        return protocollazioneBase64Result;
    }

    /**
     * Sets the value of the protocollazioneBase64Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public void setProtocollazioneBase64Result(ProtocollazioneRet value) {
        this.protocollazioneBase64Result = value;
    }

}
