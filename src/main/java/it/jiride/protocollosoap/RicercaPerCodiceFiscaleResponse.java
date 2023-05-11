
package it.jiride.protocollosoap;

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
 *         &lt;element name="RicercaPerCodiceFiscaleResult" type="{http://tempuri.org/}ProtocolliSoggettoOut"/>
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
    "ricercaPerCodiceFiscaleResult"
})
@XmlRootElement(name = "RicercaPerCodiceFiscaleResponse")
public class RicercaPerCodiceFiscaleResponse {

    @XmlElement(name = "RicercaPerCodiceFiscaleResult", required = true)
    protected ProtocolliSoggettoOut ricercaPerCodiceFiscaleResult;

    /**
     * Gets the value of the ricercaPerCodiceFiscaleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolliSoggettoOut }
     *     
     */
    public ProtocolliSoggettoOut getRicercaPerCodiceFiscaleResult() {
        return ricercaPerCodiceFiscaleResult;
    }

    /**
     * Sets the value of the ricercaPerCodiceFiscaleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolliSoggettoOut }
     *     
     */
    public void setRicercaPerCodiceFiscaleResult(ProtocolliSoggettoOut value) {
        this.ricercaPerCodiceFiscaleResult = value;
    }

}
