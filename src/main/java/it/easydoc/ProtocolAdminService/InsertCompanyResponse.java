
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertCompanyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertCompanyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyCreationResponseType" type="{http://www.consorziocsa.it/easydoc/ws}companyCreationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertCompanyResponse", propOrder = {
    "companyCreationResponseType"
})
public class InsertCompanyResponse {

    @XmlElement(name = "CompanyCreationResponseType")
    protected CompanyCreationResponseType companyCreationResponseType;

    /**
     * Gets the value of the companyCreationResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyCreationResponseType }
     *     
     */
    public CompanyCreationResponseType getCompanyCreationResponseType() {
        return companyCreationResponseType;
    }

    /**
     * Sets the value of the companyCreationResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyCreationResponseType }
     *     
     */
    public void setCompanyCreationResponseType(CompanyCreationResponseType value) {
        this.companyCreationResponseType = value;
    }

}
