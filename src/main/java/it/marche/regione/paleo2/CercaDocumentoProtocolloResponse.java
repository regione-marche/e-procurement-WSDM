
package it.marche.regione.paleo2;

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
 *         &lt;element name="CercaDocumentoProtocolloResult" type="{http://paleo.regione.marche.it/services2/}BEBaseOfRespDocumentoExtc14f1rMd" minOccurs="0"/>
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
    "cercaDocumentoProtocolloResult"
})
@XmlRootElement(name = "CercaDocumentoProtocolloResponse")
public class CercaDocumentoProtocolloResponse {

    @XmlElement(name = "CercaDocumentoProtocolloResult", nillable = true)
    protected BEBaseOfRespDocumentoExtc14F1RMd cercaDocumentoProtocolloResult;

    /**
     * Gets the value of the cercaDocumentoProtocolloResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfRespDocumentoExtc14F1RMd }
     *     
     */
    public BEBaseOfRespDocumentoExtc14F1RMd getCercaDocumentoProtocolloResult() {
        return cercaDocumentoProtocolloResult;
    }

    /**
     * Sets the value of the cercaDocumentoProtocolloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfRespDocumentoExtc14F1RMd }
     *     
     */
    public void setCercaDocumentoProtocolloResult(BEBaseOfRespDocumentoExtc14F1RMd value) {
        this.cercaDocumentoProtocolloResult = value;
    }

}
