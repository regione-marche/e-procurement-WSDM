
package it.easydoc.rest.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUsersCompanyRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUsersCompanyRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}ProtocollerUserProtocolServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="AooCode" type="{http://www.consorziocsa.it/easydoc/ws}CodeType"/>
 *         &lt;element name="CompanyCode" type="{http://www.consorziocsa.it/easydoc/ws}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUsersCompanyRequestType", propOrder = {
    "aooCode",
    "companyCode"
})
public class GetUsersCompanyRequestType
    extends ProtocollerUserProtocolServiceRequest
{

    @XmlElement(name = "AooCode", required = true)
    protected String aooCode;
    @XmlElement(name = "CompanyCode", required = true)
    protected String companyCode;

    /**
     * Gets the value of the aooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAooCode() {
        return aooCode;
    }

    /**
     * Sets the value of the aooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAooCode(String value) {
        this.aooCode = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

}
