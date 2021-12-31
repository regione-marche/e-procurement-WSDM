
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
 *         &lt;element name="GetLicensesResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oLicenses" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}ArrayOfLicenseOption" minOccurs="0"/>
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
    "getLicensesResult",
    "oLicenses"
})
@XmlRootElement(name = "GetLicensesResponse")
public class GetLicensesResponse {

    @XmlElement(name = "GetLicensesResult")
    protected ResultInfo getLicensesResult;
    @XmlElement(nillable = true)
    protected ArrayOfLicenseOption oLicenses;

    /**
     * Gets the value of the getLicensesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetLicensesResult() {
        return getLicensesResult;
    }

    /**
     * Sets the value of the getLicensesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetLicensesResult(ResultInfo value) {
        this.getLicensesResult = value;
    }

    /**
     * Gets the value of the oLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLicenseOption }
     *     
     */
    public ArrayOfLicenseOption getOLicenses() {
        return oLicenses;
    }

    /**
     * Sets the value of the oLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLicenseOption }
     *     
     */
    public void setOLicenses(ArrayOfLicenseOption value) {
        this.oLicenses = value;
    }

}
