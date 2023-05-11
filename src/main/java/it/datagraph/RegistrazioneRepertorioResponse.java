
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
 *         &lt;element name="RegistrazioneRepertorioResult" type="{http://tempuri.org/}ProtocollazioneRet" minOccurs="0"/>
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
    "registrazioneRepertorioResult"
})
@XmlRootElement(name = "RegistrazioneRepertorioResponse")
public class RegistrazioneRepertorioResponse {

    @XmlElement(name = "RegistrazioneRepertorioResult")
    protected ProtocollazioneRet registrazioneRepertorioResult;

    /**
     * Gets the value of the registrazioneRepertorioResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public ProtocollazioneRet getRegistrazioneRepertorioResult() {
        return registrazioneRepertorioResult;
    }

    /**
     * Sets the value of the registrazioneRepertorioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public void setRegistrazioneRepertorioResult(ProtocollazioneRet value) {
        this.registrazioneRepertorioResult = value;
    }

}
