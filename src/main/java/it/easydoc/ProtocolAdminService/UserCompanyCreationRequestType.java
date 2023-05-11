
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserCompanyCreationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCompanyCreationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CodiceUfficioType" type="{http://www.consorziocsa.it/easydoc/ws}CodiceUfficioType"/>
 *           &lt;element name="UserCompanyInfo" type="{http://www.consorziocsa.it/easydoc/ws}UserCompanyInfoType"/>
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
@XmlType(name = "UserCompanyCreationRequestType", propOrder = {
    "codiceUfficioType",
    "userCompanyInfo"
})
public class UserCompanyCreationRequestType {

    @XmlElement(name = "CodiceUfficioType")
    protected CodiceUfficioType codiceUfficioType;
    @XmlElement(name = "UserCompanyInfo")
    protected UserCompanyInfoType userCompanyInfo;

    /**
     * Gets the value of the codiceUfficioType property.
     * 
     * @return
     *     possible object is
     *     {@link CodiceUfficioType }
     *     
     */
    public CodiceUfficioType getCodiceUfficioType() {
        return codiceUfficioType;
    }

    /**
     * Sets the value of the codiceUfficioType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceUfficioType }
     *     
     */
    public void setCodiceUfficioType(CodiceUfficioType value) {
        this.codiceUfficioType = value;
    }

    /**
     * Gets the value of the userCompanyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserCompanyInfoType }
     *     
     */
    public UserCompanyInfoType getUserCompanyInfo() {
        return userCompanyInfo;
    }

    /**
     * Sets the value of the userCompanyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCompanyInfoType }
     *     
     */
    public void setUserCompanyInfo(UserCompanyInfoType value) {
        this.userCompanyInfo = value;
    }

}
