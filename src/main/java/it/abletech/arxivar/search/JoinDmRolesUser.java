
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Roles_User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Roles_User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="ID_ROLES" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FNEGA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Roles_User", propOrder = {
    "idroles",
    "fnega"
})
public class JoinDmRolesUser
    extends JoinAbstract
{

    @XmlElement(name = "ID_ROLES")
    protected FieldString idroles;
    @XmlElement(name = "FNEGA")
    protected FieldInt fnega;

    /**
     * Gets the value of the idroles property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getIDROLES() {
        return idroles;
    }

    /**
     * Sets the value of the idroles property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setIDROLES(FieldString value) {
        this.idroles = value;
    }

    /**
     * Gets the value of the fnega property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getFNEGA() {
        return fnega;
    }

    /**
     * Sets the value of the fnega property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setFNEGA(FieldInt value) {
        this.fnega = value;
    }

}
