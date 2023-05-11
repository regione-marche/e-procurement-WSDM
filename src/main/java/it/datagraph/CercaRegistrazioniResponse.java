
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
 *         &lt;element name="CercaRegistrazioniResult" type="{http://tempuri.org/}RegistrazioniRet" minOccurs="0"/>
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
    "cercaRegistrazioniResult"
})
@XmlRootElement(name = "CercaRegistrazioniResponse")
public class CercaRegistrazioniResponse {

    @XmlElement(name = "CercaRegistrazioniResult")
    protected RegistrazioniRet cercaRegistrazioniResult;

    /**
     * Gets the value of the cercaRegistrazioniResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrazioniRet }
     *     
     */
    public RegistrazioniRet getCercaRegistrazioniResult() {
        return cercaRegistrazioniResult;
    }

    /**
     * Sets the value of the cercaRegistrazioniResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrazioniRet }
     *     
     */
    public void setCercaRegistrazioniResult(RegistrazioniRet value) {
        this.cercaRegistrazioniResult = value;
    }

}
