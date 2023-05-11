
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
 *         &lt;element name="InserisciDatiUtenteResult" type="{http://tempuri.org/}EsitoOperazione" minOccurs="0"/>
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
    "inserisciDatiUtenteResult"
})
@XmlRootElement(name = "InserisciDatiUtenteResponse")
public class InserisciDatiUtenteResponse {

    @XmlElement(name = "InserisciDatiUtenteResult")
    protected EsitoOperazione inserisciDatiUtenteResult;

    /**
     * Gets the value of the inserisciDatiUtenteResult property.
     * 
     * @return
     *     possible object is
     *     {@link EsitoOperazione }
     *     
     */
    public EsitoOperazione getInserisciDatiUtenteResult() {
        return inserisciDatiUtenteResult;
    }

    /**
     * Sets the value of the inserisciDatiUtenteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoOperazione }
     *     
     */
    public void setInserisciDatiUtenteResult(EsitoOperazione value) {
        this.inserisciDatiUtenteResult = value;
    }

}
