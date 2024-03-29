
package it.iride.wsprotocollodm;

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
 *         &lt;element name="InserisciDocumentoEAnagraficheResult" type="{http://tempuri.org/}ProtocolloOut" minOccurs="0"/>
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
    "inserisciDocumentoEAnagraficheResult"
})
@XmlRootElement(name = "InserisciDocumentoEAnagraficheResponse")
public class InserisciDocumentoEAnagraficheResponse {

    @XmlElement(name = "InserisciDocumentoEAnagraficheResult")
    protected ProtocolloOut inserisciDocumentoEAnagraficheResult;

    /**
     * Gets the value of the inserisciDocumentoEAnagraficheResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloOut }
     *     
     */
    public ProtocolloOut getInserisciDocumentoEAnagraficheResult() {
        return inserisciDocumentoEAnagraficheResult;
    }

    /**
     * Sets the value of the inserisciDocumentoEAnagraficheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloOut }
     *     
     */
    public void setInserisciDocumentoEAnagraficheResult(ProtocolloOut value) {
        this.inserisciDocumentoEAnagraficheResult = value;
    }

}
