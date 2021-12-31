
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
 *         &lt;element name="AggiungiAllegati2Result" type="{http://tempuri.org/}AllegatiInseritiOut" minOccurs="0"/>
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
    "aggiungiAllegati2Result"
})
@XmlRootElement(name = "AggiungiAllegati2Response")
public class AggiungiAllegati2Response {

    @XmlElement(name = "AggiungiAllegati2Result")
    protected AllegatiInseritiOut aggiungiAllegati2Result;

    /**
     * Gets the value of the aggiungiAllegati2Result property.
     * 
     * @return
     *     possible object is
     *     {@link AllegatiInseritiOut }
     *     
     */
    public AllegatiInseritiOut getAggiungiAllegati2Result() {
        return aggiungiAllegati2Result;
    }

    /**
     * Sets the value of the aggiungiAllegati2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllegatiInseritiOut }
     *     
     */
    public void setAggiungiAllegati2Result(AllegatiInseritiOut value) {
        this.aggiungiAllegati2Result = value;
    }

}
