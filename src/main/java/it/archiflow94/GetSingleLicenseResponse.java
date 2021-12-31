
package it.archiflow94;

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
 *         &lt;element name="GetSingleLicenseResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oLicense" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}LicenseOption" minOccurs="0"/>
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
    "getSingleLicenseResult",
    "oLicense"
})
@XmlRootElement(name = "GetSingleLicenseResponse")
public class GetSingleLicenseResponse {

    @XmlElement(name = "GetSingleLicenseResult")
    protected ResultInfo getSingleLicenseResult;
    @XmlElement(nillable = true)
    protected LicenseOption oLicense;

    /**
     * Gets the value of the getSingleLicenseResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetSingleLicenseResult() {
        return getSingleLicenseResult;
    }

    /**
     * Sets the value of the getSingleLicenseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetSingleLicenseResult(ResultInfo value) {
        this.getSingleLicenseResult = value;
    }

    /**
     * Gets the value of the oLicense property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseOption }
     *     
     */
    public LicenseOption getOLicense() {
        return oLicense;
    }

    /**
     * Sets the value of the oLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseOption }
     *     
     */
    public void setOLicense(LicenseOption value) {
        this.oLicense = value;
    }

}
