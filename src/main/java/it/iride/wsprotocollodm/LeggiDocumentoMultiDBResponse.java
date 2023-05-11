
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
 *         &lt;element name="LeggiDocumentoMultiDBResult" type="{http://tempuri.org/}DocumentoOut" minOccurs="0"/>
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
    "leggiDocumentoMultiDBResult"
})
@XmlRootElement(name = "LeggiDocumentoMultiDBResponse")
public class LeggiDocumentoMultiDBResponse {

    @XmlElement(name = "LeggiDocumentoMultiDBResult")
    protected DocumentoOut leggiDocumentoMultiDBResult;

    /**
     * Gets the value of the leggiDocumentoMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoOut }
     *     
     */
    public DocumentoOut getLeggiDocumentoMultiDBResult() {
        return leggiDocumentoMultiDBResult;
    }

    /**
     * Sets the value of the leggiDocumentoMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoOut }
     *     
     */
    public void setLeggiDocumentoMultiDBResult(DocumentoOut value) {
        this.leggiDocumentoMultiDBResult = value;
    }

}
