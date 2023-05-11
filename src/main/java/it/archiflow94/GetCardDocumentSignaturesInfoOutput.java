
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardDocumentSignaturesInfoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardDocumentSignaturesInfoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CryptographicEnvelope" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}CryptographicEnvelope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardDocumentSignaturesInfoOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cryptographicEnvelope"
})
public class GetCardDocumentSignaturesInfoOutput
    extends BaseOutput
{

    @XmlElement(name = "CryptographicEnvelope", nillable = true)
    protected CryptographicEnvelope cryptographicEnvelope;

    /**
     * Gets the value of the cryptographicEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicEnvelope }
     *     
     */
    public CryptographicEnvelope getCryptographicEnvelope() {
        return cryptographicEnvelope;
    }

    /**
     * Sets the value of the cryptographicEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicEnvelope }
     *     
     */
    public void setCryptographicEnvelope(CryptographicEnvelope value) {
        this.cryptographicEnvelope = value;
    }

}
