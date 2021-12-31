
package it.easydoc.rest.protocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUsersCompanyResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUsersCompanyResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="UserCompany" type="{http://www.consorziocsa.it/easydoc/ws}UserCompanyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUsersCompanyResponseType", propOrder = {
    "userCompany"
})
public class GetUsersCompanyResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "UserCompany")
    protected List<UserCompanyType> userCompany;

    /**
     * Gets the value of the userCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserCompanyType }
     * 
     * 
     */
    public List<UserCompanyType> getUserCompany() {
        if (userCompany == null) {
            userCompany = new ArrayList<UserCompanyType>();
        }
        return this.userCompany;
    }

}
