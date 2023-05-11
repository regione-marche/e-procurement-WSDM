
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
 *         &lt;element name="InserisciProtocolloEAnagraficheStringResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inserisciProtocolloEAnagraficheStringResult"
})
@XmlRootElement(name = "InserisciProtocolloEAnagraficheStringResponse")
public class InserisciProtocolloEAnagraficheStringResponse {

    @XmlElement(name = "InserisciProtocolloEAnagraficheStringResult", required = true)
    protected String inserisciProtocolloEAnagraficheStringResult;

    /**
     * Gets the value of the inserisciProtocolloEAnagraficheStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInserisciProtocolloEAnagraficheStringResult() {
        return inserisciProtocolloEAnagraficheStringResult;
    }

    /**
     * Sets the value of the inserisciProtocolloEAnagraficheStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInserisciProtocolloEAnagraficheStringResult(String value) {
        this.inserisciProtocolloEAnagraficheStringResult = value;
    }

}
