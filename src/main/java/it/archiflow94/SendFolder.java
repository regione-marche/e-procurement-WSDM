
package it.archiflow94;

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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oUsers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="oGroups" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="oOffices" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Chart.ValueObject}ArrayOfOffice" minOccurs="0"/>
 *         &lt;element name="strMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bForceSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "strSessionId",
    "folderId",
    "oUsers",
    "oGroups",
    "oOffices",
    "strMessage",
    "bForceSend"
})
@XmlRootElement(name = "SendFolder")
public class SendFolder {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected Integer folderId;
    @XmlElement(nillable = true)
    protected ArrayOfUser oUsers;
    @XmlElement(nillable = true)
    protected ArrayOfGroup oGroups;
    @XmlElement(nillable = true)
    protected ArrayOfOffice oOffices;
    @XmlElement(nillable = true)
    protected String strMessage;
    protected Boolean bForceSend;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the oUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getOUsers() {
        return oUsers;
    }

    /**
     * Sets the value of the oUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setOUsers(ArrayOfUser value) {
        this.oUsers = value;
    }

    /**
     * Gets the value of the oGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getOGroups() {
        return oGroups;
    }

    /**
     * Sets the value of the oGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setOGroups(ArrayOfGroup value) {
        this.oGroups = value;
    }

    /**
     * Gets the value of the oOffices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOffice }
     *     
     */
    public ArrayOfOffice getOOffices() {
        return oOffices;
    }

    /**
     * Sets the value of the oOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOffice }
     *     
     */
    public void setOOffices(ArrayOfOffice value) {
        this.oOffices = value;
    }

    /**
     * Gets the value of the strMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMessage() {
        return strMessage;
    }

    /**
     * Sets the value of the strMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMessage(String value) {
        this.strMessage = value;
    }

    /**
     * Gets the value of the bForceSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBForceSend() {
        return bForceSend;
    }

    /**
     * Sets the value of the bForceSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBForceSend(Boolean value) {
        this.bForceSend = value;
    }

}
