
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetExistingCardVisibilityCCResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oCardUsers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="oCardGroups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="oCardOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="oCardUsersCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="oCardGroupsCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="oCardOfficesCC" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getExistingCardVisibilityCCResult",
    "oCardUsers",
    "oCardGroups",
    "oCardOffices",
    "oCardUsersCC",
    "oCardGroupsCC",
    "oCardOfficesCC"
})
@XmlRootElement(name = "GetExistingCardVisibilityCCResponse")
public class GetExistingCardVisibilityCCResponse {

    @XmlElement(name = "GetExistingCardVisibilityCCResult")
    protected ResultInfo getExistingCardVisibilityCCResult;
    @XmlElement(nillable = true)
    protected ArrayOfUser oCardUsers;
    @XmlElement(nillable = true)
    protected ArrayOfGroup oCardGroups;
    @XmlElement(nillable = true)
    protected ArrayOfOffice oCardOffices;
    @XmlElement(nillable = true)
    protected ArrayOfUser oCardUsersCC;
    @XmlElement(nillable = true)
    protected ArrayOfGroup oCardGroupsCC;
    @XmlElement(nillable = true)
    protected ArrayOfOffice oCardOfficesCC;

    /**
     * Gets the value of the getExistingCardVisibilityCCResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetExistingCardVisibilityCCResult() {
        return getExistingCardVisibilityCCResult;
    }

    /**
     * Sets the value of the getExistingCardVisibilityCCResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetExistingCardVisibilityCCResult(ResultInfo value) {
        this.getExistingCardVisibilityCCResult = value;
    }

    /**
     * Gets the value of the oCardUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getOCardUsers() {
        return oCardUsers;
    }

    /**
     * Sets the value of the oCardUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setOCardUsers(ArrayOfUser value) {
        this.oCardUsers = value;
    }

    /**
     * Gets the value of the oCardGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getOCardGroups() {
        return oCardGroups;
    }

    /**
     * Sets the value of the oCardGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setOCardGroups(ArrayOfGroup value) {
        this.oCardGroups = value;
    }

    /**
     * Gets the value of the oCardOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOCardOffices() {
        return oCardOffices;
    }

    /**
     * Sets the value of the oCardOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOCardOffices(ArrayOfOffice value) {
        this.oCardOffices = value;
    }

    /**
     * Gets the value of the oCardUsersCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getOCardUsersCC() {
        return oCardUsersCC;
    }

    /**
     * Sets the value of the oCardUsersCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setOCardUsersCC(ArrayOfUser value) {
        this.oCardUsersCC = value;
    }

    /**
     * Gets the value of the oCardGroupsCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getOCardGroupsCC() {
        return oCardGroupsCC;
    }

    /**
     * Sets the value of the oCardGroupsCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setOCardGroupsCC(ArrayOfGroup value) {
        this.oCardGroupsCC = value;
    }

    /**
     * Gets the value of the oCardOfficesCC property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOCardOfficesCC() {
        return oCardOfficesCC;
    }

    /**
     * Sets the value of the oCardOfficesCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOCardOfficesCC(ArrayOfOffice value) {
        this.oCardOfficesCC = value;
    }

}
