
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
 *         &lt;element name="RicercaPerCodiceFiscaleMultiDBResult" type="{http://tempuri.org/}ProtocolliSoggettoOut"/>
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
    "ricercaPerCodiceFiscaleMultiDBResult"
})
@XmlRootElement(name = "RicercaPerCodiceFiscaleMultiDBResponse")
public class RicercaPerCodiceFiscaleMultiDBResponse {

    @XmlElement(name = "RicercaPerCodiceFiscaleMultiDBResult", required = true)
    protected ProtocolliSoggettoOut ricercaPerCodiceFiscaleMultiDBResult;

    /**
     * Gets the value of the ricercaPerCodiceFiscaleMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolliSoggettoOut }
     *     
     */
    public ProtocolliSoggettoOut getRicercaPerCodiceFiscaleMultiDBResult() {
        return ricercaPerCodiceFiscaleMultiDBResult;
    }

    /**
     * Sets the value of the ricercaPerCodiceFiscaleMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolliSoggettoOut }
     *     
     */
    public void setRicercaPerCodiceFiscaleMultiDBResult(ProtocolliSoggettoOut value) {
        this.ricercaPerCodiceFiscaleMultiDBResult = value;
    }

}
