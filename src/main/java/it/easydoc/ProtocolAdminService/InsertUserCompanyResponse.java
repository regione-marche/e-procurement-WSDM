
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertUserCompanyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertUserCompanyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserCompanyCreationResponseType" type="{http://www.consorziocsa.it/easydoc/ws}userCompanyCreationResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertUserCompanyResponse", propOrder = {
    "userCompanyCreationResponseType"
})
public class InsertUserCompanyResponse {

    @XmlElement(name = "UserCompanyCreationResponseType")
    protected UserCompanyCreationResponseType userCompanyCreationResponseType;

    /**
     * Gets the value of the userCompanyCreationResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link UserCompanyCreationResponseType }
     *     
     */
    public UserCompanyCreationResponseType getUserCompanyCreationResponseType() {
        return userCompanyCreationResponseType;
    }

    /**
     * Sets the value of the userCompanyCreationResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCompanyCreationResponseType }
     *     
     */
    public void setUserCompanyCreationResponseType(UserCompanyCreationResponseType value) {
        this.userCompanyCreationResponseType = value;
    }

}
