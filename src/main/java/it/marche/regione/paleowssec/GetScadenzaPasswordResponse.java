
package it.marche.regione.paleowssec;

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
 *         &lt;element name="GetScadenzaPasswordResult" type="{http://paleo.regione.marche.it/services/}DataGenerica" minOccurs="0"/>
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
    "getScadenzaPasswordResult"
})
@XmlRootElement(name = "GetScadenzaPasswordResponse")
public class GetScadenzaPasswordResponse {

    @XmlElement(name = "GetScadenzaPasswordResult", nillable = true)
    protected DataGenerica getScadenzaPasswordResult;

    /**
     * Gets the value of the getScadenzaPasswordResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataGenerica }
     *     
     */
    public DataGenerica getGetScadenzaPasswordResult() {
        return getScadenzaPasswordResult;
    }

    /**
     * Sets the value of the getScadenzaPasswordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataGenerica }
     *     
     */
    public void setGetScadenzaPasswordResult(DataGenerica value) {
        this.getScadenzaPasswordResult = value;
    }

}
