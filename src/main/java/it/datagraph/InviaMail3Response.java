
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
 *         &lt;element name="InviaMail3Result" type="{http://tempuri.org/}RegistrazioneRet" minOccurs="0"/>
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
    "inviaMail3Result"
})
@XmlRootElement(name = "InviaMail3Response")
public class InviaMail3Response {

    @XmlElement(name = "InviaMail3Result")
    protected RegistrazioneRet inviaMail3Result;

    /**
     * Gets the value of the inviaMail3Result property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrazioneRet }
     *     
     */
    public RegistrazioneRet getInviaMail3Result() {
        return inviaMail3Result;
    }

    /**
     * Sets the value of the inviaMail3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrazioneRet }
     *     
     */
    public void setInviaMail3Result(RegistrazioneRet value) {
        this.inviaMail3Result = value;
    }

}
