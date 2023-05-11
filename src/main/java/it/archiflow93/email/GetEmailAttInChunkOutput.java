
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEmailAttInChunkOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEmailAttInChunkOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="ChunkParamOut" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}EmailAttChunkParamOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEmailAttInChunkOutput", propOrder = {
    "chunkParamOut"
})
public class GetEmailAttInChunkOutput
    extends BaseOutput
{

    @XmlElement(name = "ChunkParamOut", nillable = true)
    protected EmailAttChunkParamOut chunkParamOut;

    /**
     * Gets the value of the chunkParamOut property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAttChunkParamOut }
     *     
     */
    public EmailAttChunkParamOut getChunkParamOut() {
        return chunkParamOut;
    }

    /**
     * Sets the value of the chunkParamOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAttChunkParamOut }
     *     
     */
    public void setChunkParamOut(EmailAttChunkParamOut value) {
        this.chunkParamOut = value;
    }

}
