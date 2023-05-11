
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyCreationRequestType" type="{http://www.consorziocsa.it/easydoc/ws}CompanyCreationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertCompany", propOrder = {
    "companyCreationRequestType"
})
public class InsertCompany {

    @XmlElement(name = "CompanyCreationRequestType")
    protected CompanyCreationRequestType companyCreationRequestType;

    /**
     * Gets the value of the companyCreationRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyCreationRequestType }
     *     
     */
    public CompanyCreationRequestType getCompanyCreationRequestType() {
        return companyCreationRequestType;
    }

    /**
     * Sets the value of the companyCreationRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyCreationRequestType }
     *     
     */
    public void setCompanyCreationRequestType(CompanyCreationRequestType value) {
        this.companyCreationRequestType = value;
    }

}
