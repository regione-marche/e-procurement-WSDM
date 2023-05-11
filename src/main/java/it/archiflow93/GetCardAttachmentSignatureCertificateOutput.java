
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardAttachmentSignatureCertificateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardAttachmentSignatureCertificateOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CertificateInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Sign.ValueObject}CertificateInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardAttachmentSignatureCertificateOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "certificateInfo"
})
public class GetCardAttachmentSignatureCertificateOutput
    extends BaseOutput
{

    @XmlElement(name = "CertificateInfo", nillable = true)
    protected CertificateInfo certificateInfo;

    /**
     * Gets the value of the certificateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateInfo }
     *     
     */
    public CertificateInfo getCertificateInfo() {
        return certificateInfo;
    }

    /**
     * Sets the value of the certificateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateInfo }
     *     
     */
    public void setCertificateInfo(CertificateInfo value) {
        this.certificateInfo = value;
    }

}
