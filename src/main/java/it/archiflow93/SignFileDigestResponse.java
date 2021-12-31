
package it.archiflow93;

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
 *         &lt;element name="SignFileDigestResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="xmlSignedHashes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "signFileDigestResult",
    "xmlSignedHashes"
})
@XmlRootElement(name = "SignFileDigestResponse")
public class SignFileDigestResponse {

    @XmlElement(name = "SignFileDigestResult")
    protected ResultInfo signFileDigestResult;
    @XmlElement(nillable = true)
    protected String xmlSignedHashes;

    /**
     * Gets the value of the signFileDigestResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getSignFileDigestResult() {
        return signFileDigestResult;
    }

    /**
     * Sets the value of the signFileDigestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setSignFileDigestResult(ResultInfo value) {
        this.signFileDigestResult = value;
    }

    /**
     * Gets the value of the xmlSignedHashes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSignedHashes() {
        return xmlSignedHashes;
    }

    /**
     * Sets the value of the xmlSignedHashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSignedHashes(String value) {
        this.xmlSignedHashes = value;
    }

}
