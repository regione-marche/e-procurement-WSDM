
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
 *         &lt;element name="InserisciDocumentoEAnagraficheStringResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inserisciDocumentoEAnagraficheStringResult"
})
@XmlRootElement(name = "InserisciDocumentoEAnagraficheStringResponse")
public class InserisciDocumentoEAnagraficheStringResponse {

    @XmlElement(name = "InserisciDocumentoEAnagraficheStringResult")
    protected String inserisciDocumentoEAnagraficheStringResult;

    /**
     * Gets the value of the inserisciDocumentoEAnagraficheStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInserisciDocumentoEAnagraficheStringResult() {
        return inserisciDocumentoEAnagraficheStringResult;
    }

    /**
     * Sets the value of the inserisciDocumentoEAnagraficheStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInserisciDocumentoEAnagraficheStringResult(String value) {
        this.inserisciDocumentoEAnagraficheStringResult = value;
    }

}
