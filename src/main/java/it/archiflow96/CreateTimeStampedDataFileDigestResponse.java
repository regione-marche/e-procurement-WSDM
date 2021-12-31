
package it.archiflow96;

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
 *         &lt;element name="CreateTimeStampedDataFileDigestResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="xmlTSDSignedHashes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "createTimeStampedDataFileDigestResult",
    "xmlTSDSignedHashes"
})
@XmlRootElement(name = "CreateTimeStampedDataFileDigestResponse")
public class CreateTimeStampedDataFileDigestResponse {

    @XmlElement(name = "CreateTimeStampedDataFileDigestResult")
    protected ResultInfo createTimeStampedDataFileDigestResult;
    @XmlElement(nillable = true)
    protected String xmlTSDSignedHashes;

    /**
     * Gets the value of the createTimeStampedDataFileDigestResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getCreateTimeStampedDataFileDigestResult() {
        return createTimeStampedDataFileDigestResult;
    }

    /**
     * Sets the value of the createTimeStampedDataFileDigestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setCreateTimeStampedDataFileDigestResult(ResultInfo value) {
        this.createTimeStampedDataFileDigestResult = value;
    }

    /**
     * Gets the value of the xmlTSDSignedHashes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlTSDSignedHashes() {
        return xmlTSDSignedHashes;
    }

    /**
     * Sets the value of the xmlTSDSignedHashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlTSDSignedHashes(String value) {
        this.xmlTSDSignedHashes = value;
    }

}
