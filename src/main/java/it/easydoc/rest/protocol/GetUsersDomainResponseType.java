
package it.easydoc.rest.protocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUsersDomainResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUsersDomainResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="UserDomain" type="{http://www.consorziocsa.it/easydoc/ws}UserDomainType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUsersDomainResponseType", propOrder = {
    "userDomain"
})
public class GetUsersDomainResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "UserDomain")
    protected List<UserDomainType> userDomain;

    /**
     * Gets the value of the userDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDomainType }
     * 
     * 
     */
    public List<UserDomainType> getUserDomain() {
        if (userDomain == null) {
            userDomain = new ArrayList<UserDomainType>();
        }
        return this.userDomain;
    }

}
