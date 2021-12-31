
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
 *         &lt;element name="BuildFileDigestResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="xmlHashes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "buildFileDigestResult",
    "xmlHashes"
})
@XmlRootElement(name = "BuildFileDigestResponse")
public class BuildFileDigestResponse {

    @XmlElement(name = "BuildFileDigestResult")
    protected ResultInfo buildFileDigestResult;
    @XmlElement(nillable = true)
    protected String xmlHashes;

    /**
     * Gets the value of the buildFileDigestResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getBuildFileDigestResult() {
        return buildFileDigestResult;
    }

    /**
     * Sets the value of the buildFileDigestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setBuildFileDigestResult(ResultInfo value) {
        this.buildFileDigestResult = value;
    }

    /**
     * Gets the value of the xmlHashes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlHashes() {
        return xmlHashes;
    }

    /**
     * Sets the value of the xmlHashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlHashes(String value) {
        this.xmlHashes = value;
    }

}
