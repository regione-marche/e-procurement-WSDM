
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertUserCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertUserCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserCompanyCreationRequestType" type="{http://www.consorziocsa.it/easydoc/ws}UserCompanyCreationRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertUserCompany", propOrder = {
    "userCompanyCreationRequestType"
})
public class InsertUserCompany {

    @XmlElement(name = "UserCompanyCreationRequestType")
    protected UserCompanyCreationRequestType userCompanyCreationRequestType;

    /**
     * Gets the value of the userCompanyCreationRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link UserCompanyCreationRequestType }
     *     
     */
    public UserCompanyCreationRequestType getUserCompanyCreationRequestType() {
        return userCompanyCreationRequestType;
    }

    /**
     * Sets the value of the userCompanyCreationRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCompanyCreationRequestType }
     *     
     */
    public void setUserCompanyCreationRequestType(UserCompanyCreationRequestType value) {
        this.userCompanyCreationRequestType = value;
    }

}
