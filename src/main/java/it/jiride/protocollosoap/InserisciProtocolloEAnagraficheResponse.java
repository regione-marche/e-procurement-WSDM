
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
 *         &lt;element name="InserisciProtocolloEAnagraficheResult" type="{http://tempuri.org/}ProtocolloOut"/>
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
    "inserisciProtocolloEAnagraficheResult"
})
@XmlRootElement(name = "InserisciProtocolloEAnagraficheResponse")
public class InserisciProtocolloEAnagraficheResponse {

    @XmlElement(name = "InserisciProtocolloEAnagraficheResult", required = true)
    protected ProtocolloOut inserisciProtocolloEAnagraficheResult;

    /**
     * Gets the value of the inserisciProtocolloEAnagraficheResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloOut }
     *     
     */
    public ProtocolloOut getInserisciProtocolloEAnagraficheResult() {
        return inserisciProtocolloEAnagraficheResult;
    }

    /**
     * Sets the value of the inserisciProtocolloEAnagraficheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloOut }
     *     
     */
    public void setInserisciProtocolloEAnagraficheResult(ProtocolloOut value) {
        this.inserisciProtocolloEAnagraficheResult = value;
    }

}
