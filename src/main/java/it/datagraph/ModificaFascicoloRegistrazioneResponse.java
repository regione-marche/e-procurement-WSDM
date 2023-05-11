
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
 *         &lt;element name="ModificaFascicoloRegistrazioneResult" type="{http://tempuri.org/}RegistrazioneRet" minOccurs="0"/>
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
    "modificaFascicoloRegistrazioneResult"
})
@XmlRootElement(name = "ModificaFascicoloRegistrazioneResponse")
public class ModificaFascicoloRegistrazioneResponse {

    @XmlElement(name = "ModificaFascicoloRegistrazioneResult")
    protected RegistrazioneRet modificaFascicoloRegistrazioneResult;

    /**
     * Gets the value of the modificaFascicoloRegistrazioneResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrazioneRet }
     *     
     */
    public RegistrazioneRet getModificaFascicoloRegistrazioneResult() {
        return modificaFascicoloRegistrazioneResult;
    }

    /**
     * Sets the value of the modificaFascicoloRegistrazioneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrazioneRet }
     *     
     */
    public void setModificaFascicoloRegistrazioneResult(RegistrazioneRet value) {
        this.modificaFascicoloRegistrazioneResult = value;
    }

}
