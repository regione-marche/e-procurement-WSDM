
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
 *         &lt;element name="AggiungiAllegatiMultiDBResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "aggiungiAllegatiMultiDBResult"
})
@XmlRootElement(name = "AggiungiAllegatiMultiDBResponse")
public class AggiungiAllegatiMultiDBResponse {

    @XmlElement(name = "AggiungiAllegatiMultiDBResult", required = true)
    protected String aggiungiAllegatiMultiDBResult;

    /**
     * Gets the value of the aggiungiAllegatiMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggiungiAllegatiMultiDBResult() {
        return aggiungiAllegatiMultiDBResult;
    }

    /**
     * Sets the value of the aggiungiAllegatiMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggiungiAllegatiMultiDBResult(String value) {
        this.aggiungiAllegatiMultiDBResult = value;
    }

}
