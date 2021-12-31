
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMailBoxesInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailBoxesInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="GetOnlyPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailBoxesInput", propOrder = {
    "getOnlyPEC",
    "getShared",
    "getUser"
})
public class GetMailBoxesInput
    extends BaseInput
{

    @XmlElement(name = "GetOnlyPEC")
    protected Boolean getOnlyPEC;
    @XmlElement(name = "GetShared")
    protected Boolean getShared;
    @XmlElement(name = "GetUser")
    protected Boolean getUser;

    /**
     * Gets the value of the getOnlyPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetOnlyPEC() {
        return getOnlyPEC;
    }

    /**
     * Sets the value of the getOnlyPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetOnlyPEC(Boolean value) {
        this.getOnlyPEC = value;
    }

    /**
     * Gets the value of the getShared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetShared() {
        return getShared;
    }

    /**
     * Sets the value of the getShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetShared(Boolean value) {
        this.getShared = value;
    }

    /**
     * Gets the value of the getUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetUser() {
        return getUser;
    }

    /**
     * Sets the value of the getUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetUser(Boolean value) {
        this.getUser = value;
    }

}
