
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
 *         &lt;element name="InserisciProtocolloEAnagraficheMultiDBResult" type="{http://tempuri.org/}ProtocolloOut"/>
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
    "inserisciProtocolloEAnagraficheMultiDBResult"
})
@XmlRootElement(name = "InserisciProtocolloEAnagraficheMultiDBResponse")
public class InserisciProtocolloEAnagraficheMultiDBResponse {

    @XmlElement(name = "InserisciProtocolloEAnagraficheMultiDBResult", required = true)
    protected ProtocolloOut inserisciProtocolloEAnagraficheMultiDBResult;

    /**
     * Gets the value of the inserisciProtocolloEAnagraficheMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloOut }
     *     
     */
    public ProtocolloOut getInserisciProtocolloEAnagraficheMultiDBResult() {
        return inserisciProtocolloEAnagraficheMultiDBResult;
    }

    /**
     * Sets the value of the inserisciProtocolloEAnagraficheMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloOut }
     *     
     */
    public void setInserisciProtocolloEAnagraficheMultiDBResult(ProtocolloOut value) {
        this.inserisciProtocolloEAnagraficheMultiDBResult = value;
    }

}
