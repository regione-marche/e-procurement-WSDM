
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveVisibilityInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveVisibilityInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CheckUserWithPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GroupCCIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="GroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="OfficeCCIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="OfficeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="UserCCIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="UserIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveVisibilityInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "checkUserWithPrivacy",
    "groupCCIds",
    "groupIds",
    "officeCCIds",
    "officeIds",
    "userCCIds",
    "userIds"
})
public class RemoveVisibilityInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "CheckUserWithPrivacy")
    protected Boolean checkUserWithPrivacy;
    @XmlElement(name = "GroupCCIds", nillable = true)
    protected ArrayOfint groupCCIds;
    @XmlElement(name = "GroupIds", nillable = true)
    protected ArrayOfint groupIds;
    @XmlElement(name = "OfficeCCIds", nillable = true)
    protected ArrayOfint officeCCIds;
    @XmlElement(name = "OfficeIds", nillable = true)
    protected ArrayOfint officeIds;
    @XmlElement(name = "UserCCIds", nillable = true)
    protected ArrayOfint userCCIds;
    @XmlElement(name = "UserIds", nillable = true)
    protected ArrayOfint userIds;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the checkUserWithPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckUserWithPrivacy() {
        return checkUserWithPrivacy;
    }

    /**
     * Sets the value of the checkUserWithPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckUserWithPrivacy(Boolean value) {
        this.checkUserWithPrivacy = value;
    }

    /**
     * Gets the value of the groupCCIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getGroupCCIds() {
        return groupCCIds;
    }

    /**
     * Sets the value of the groupCCIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setGroupCCIds(ArrayOfint value) {
        this.groupCCIds = value;
    }

    /**
     * Gets the value of the groupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getGroupIds() {
        return groupIds;
    }

    /**
     * Sets the value of the groupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setGroupIds(ArrayOfint value) {
        this.groupIds = value;
    }

    /**
     * Gets the value of the officeCCIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getOfficeCCIds() {
        return officeCCIds;
    }

    /**
     * Sets the value of the officeCCIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setOfficeCCIds(ArrayOfint value) {
        this.officeCCIds = value;
    }

    /**
     * Gets the value of the officeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getOfficeIds() {
        return officeIds;
    }

    /**
     * Sets the value of the officeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setOfficeIds(ArrayOfint value) {
        this.officeIds = value;
    }

    /**
     * Gets the value of the userCCIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getUserCCIds() {
        return userCCIds;
    }

    /**
     * Sets the value of the userCCIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setUserCCIds(ArrayOfint value) {
        this.userCCIds = value;
    }

    /**
     * Gets the value of the userIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getUserIds() {
        return userIds;
    }

    /**
     * Sets the value of the userIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setUserIds(ArrayOfint value) {
        this.userIds = value;
    }

}
