
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
 *         &lt;element name="LeggiProtocolloMultiDBResult" type="{http://tempuri.org/}DocumentoOut"/>
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
    "leggiProtocolloMultiDBResult"
})
@XmlRootElement(name = "LeggiProtocolloMultiDBResponse")
public class LeggiProtocolloMultiDBResponse {

    @XmlElement(name = "LeggiProtocolloMultiDBResult", required = true)
    protected DocumentoOut leggiProtocolloMultiDBResult;

    /**
     * Gets the value of the leggiProtocolloMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoOut }
     *     
     */
    public DocumentoOut getLeggiProtocolloMultiDBResult() {
        return leggiProtocolloMultiDBResult;
    }

    /**
     * Sets the value of the leggiProtocolloMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoOut }
     *     
     */
    public void setLeggiProtocolloMultiDBResult(DocumentoOut value) {
        this.leggiProtocolloMultiDBResult = value;
    }

}
