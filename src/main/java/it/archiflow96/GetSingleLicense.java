
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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oLicenseOption" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}LicenseOptions" minOccurs="0"/>
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
    "strSessionId",
    "oLicenseOption"
})
@XmlRootElement(name = "GetSingleLicense")
public class GetSingleLicense {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected LicenseOptions oLicenseOption;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the oLicenseOption property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseOptions }
     *     
     */
    public LicenseOptions getOLicenseOption() {
        return oLicenseOption;
    }

    /**
     * Sets the value of the oLicenseOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseOptions }
     *     
     */
    public void setOLicenseOption(LicenseOptions value) {
        this.oLicenseOption = value;
    }

}
