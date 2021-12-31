
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyCreationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyCreationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Ipa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="CompanyInfo" type="{http://www.consorziocsa.it/easydoc/ws}CompanyInfoType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyCreationRequestType", propOrder = {
    "ipa",
    "companyInfo"
})
public class CompanyCreationRequestType {

    @XmlElement(name = "Ipa")
    protected String ipa;
    @XmlElement(name = "CompanyInfo")
    protected CompanyInfoType companyInfo;

    /**
     * Gets the value of the ipa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpa() {
        return ipa;
    }

    /**
     * Sets the value of the ipa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpa(String value) {
        this.ipa = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfoType }
     *     
     */
    public CompanyInfoType getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoType }
     *     
     */
    public void setCompanyInfo(CompanyInfoType value) {
        this.companyInfo = value;
    }

}
