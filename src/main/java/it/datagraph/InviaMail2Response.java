
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
 *         &lt;element name="InviaMail2Result" type="{http://tempuri.org/}RegistrazioneRet" minOccurs="0"/>
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
    "inviaMail2Result"
})
@XmlRootElement(name = "InviaMail2Response")
public class InviaMail2Response {

    @XmlElement(name = "InviaMail2Result")
    protected RegistrazioneRet inviaMail2Result;

    /**
     * Gets the value of the inviaMail2Result property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrazioneRet }
     *     
     */
    public RegistrazioneRet getInviaMail2Result() {
        return inviaMail2Result;
    }

    /**
     * Sets the value of the inviaMail2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrazioneRet }
     *     
     */
    public void setInviaMail2Result(RegistrazioneRet value) {
        this.inviaMail2Result = value;
    }

}
