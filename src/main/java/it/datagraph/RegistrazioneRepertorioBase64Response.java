
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
 *         &lt;element name="RegistrazioneRepertorioBase64Result" type="{http://tempuri.org/}ProtocollazioneRet" minOccurs="0"/>
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
    "registrazioneRepertorioBase64Result"
})
@XmlRootElement(name = "RegistrazioneRepertorioBase64Response")
public class RegistrazioneRepertorioBase64Response {

    @XmlElement(name = "RegistrazioneRepertorioBase64Result")
    protected ProtocollazioneRet registrazioneRepertorioBase64Result;

    /**
     * Gets the value of the registrazioneRepertorioBase64Result property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public ProtocollazioneRet getRegistrazioneRepertorioBase64Result() {
        return registrazioneRepertorioBase64Result;
    }

    /**
     * Sets the value of the registrazioneRepertorioBase64Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocollazioneRet }
     *     
     */
    public void setRegistrazioneRepertorioBase64Result(ProtocollazioneRet value) {
        this.registrazioneRepertorioBase64Result = value;
    }

}
