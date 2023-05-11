
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
 *         &lt;element name="InserisciDocumentoEAnagraficheMultiDBResult" type="{http://tempuri.org/}ProtocolloOut" minOccurs="0"/>
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
    "inserisciDocumentoEAnagraficheMultiDBResult"
})
@XmlRootElement(name = "InserisciDocumentoEAnagraficheMultiDBResponse")
public class InserisciDocumentoEAnagraficheMultiDBResponse {

    @XmlElement(name = "InserisciDocumentoEAnagraficheMultiDBResult")
    protected ProtocolloOut inserisciDocumentoEAnagraficheMultiDBResult;

    /**
     * Gets the value of the inserisciDocumentoEAnagraficheMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloOut }
     *     
     */
    public ProtocolloOut getInserisciDocumentoEAnagraficheMultiDBResult() {
        return inserisciDocumentoEAnagraficheMultiDBResult;
    }

    /**
     * Sets the value of the inserisciDocumentoEAnagraficheMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloOut }
     *     
     */
    public void setInserisciDocumentoEAnagraficheMultiDBResult(ProtocolloOut value) {
        this.inserisciDocumentoEAnagraficheMultiDBResult = value;
    }

}
