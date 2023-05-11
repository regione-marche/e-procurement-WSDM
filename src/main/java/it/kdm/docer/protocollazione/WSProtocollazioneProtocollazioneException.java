
package it.kdm.docer.protocollazione;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.kdm.docer.protocollazione.xsd.ProtocollazioneException;


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
 *         &lt;element name="ProtocollazioneException" type="{http://protocollazione.docer.kdm.it/xsd}ProtocollazioneException" minOccurs="0"/>
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
    "protocollazioneException"
})
@XmlRootElement(name = "WSProtocollazioneProtocollazioneException")
public class WSProtocollazioneProtocollazioneException {

    @XmlElement(name = "ProtocollazioneException", nillable = true)
    protected ProtocollazioneException protocollazioneException;

    /**
     * Gets the value of the protocollazioneException property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocollazioneException }
     *     
     */
    public ProtocollazioneException getProtocollazioneException() {
        return protocollazioneException;
    }

    /**
     * Sets the value of the protocollazioneException property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocollazioneException }
     *     
     */
    public void setProtocollazioneException(ProtocollazioneException value) {
        this.protocollazioneException = value;
    }

}
