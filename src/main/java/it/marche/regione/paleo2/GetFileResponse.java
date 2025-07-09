
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
 *         &lt;element name="GetFileResult" type="{http://paleo.regione.marche.it/services2/}BEBaseOfFilec14f1rMd" minOccurs="0"/>
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
    "getFileResult"
})
@XmlRootElement(name = "GetFileResponse")
public class GetFileResponse {

    @XmlElement(name = "GetFileResult", nillable = true)
    protected BEBaseOfFilec14F1RMd getFileResult;

    /**
     * Gets the value of the getFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link BEBaseOfFilec14F1RMd }
     *     
     */
    public BEBaseOfFilec14F1RMd getGetFileResult() {
        return getFileResult;
    }

    /**
     * Sets the value of the getFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEBaseOfFilec14F1RMd }
     *     
     */
    public void setGetFileResult(BEBaseOfFilec14F1RMd value) {
        this.getFileResult = value;
    }

}
