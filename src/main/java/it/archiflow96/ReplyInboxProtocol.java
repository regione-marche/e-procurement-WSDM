
package it.archiflow96;

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
 *         &lt;element name="oSessInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="nMsgCardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nInboxProtCardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oEMailInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}EMail" minOccurs="0"/>
 *         &lt;element name="oAgrafRecips" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}ArrayOfRecipient" minOccurs="0"/>
 *         &lt;element name="enCardVisibility" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailVisProtType" minOccurs="0"/>
 *         &lt;element name="bSplitAddr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="strChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oSessInfo",
    "nMsgCardID",
    "nInboxProtCardID",
    "oeMailInfo",
    "oAgrafRecips",
    "enCardVisibility",
    "bSplitAddr",
    "strChannelID"
})
@XmlRootElement(name = "ReplyInboxProtocol")
public class ReplyInboxProtocol {

    @XmlElement(nillable = true)
    protected SessionInfo oSessInfo;
    protected Integer nMsgCardID;
    protected Integer nInboxProtCardID;
    @XmlElement(name = "oEMailInfo", nillable = true)
    protected EMail oeMailInfo;
    @XmlElement(nillable = true)
    protected ArrayOfRecipient oAgrafRecips;
    protected EMailVisProtType enCardVisibility;
    protected Boolean bSplitAddr;
    @XmlElement(nillable = true)
    protected String strChannelID;

    /**
     * Gets the value of the oSessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getOSessInfo() {
        return oSessInfo;
    }

    /**
     * Sets the value of the oSessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setOSessInfo(SessionInfo value) {
        this.oSessInfo = value;
    }

    /**
     * Gets the value of the nMsgCardID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNMsgCardID() {
        return nMsgCardID;
    }

    /**
     * Sets the value of the nMsgCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNMsgCardID(Integer value) {
        this.nMsgCardID = value;
    }

    /**
     * Gets the value of the nInboxProtCardID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNInboxProtCardID() {
        return nInboxProtCardID;
    }

    /**
     * Sets the value of the nInboxProtCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNInboxProtCardID(Integer value) {
        this.nInboxProtCardID = value;
    }

    /**
     * Gets the value of the oeMailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMail }
     *     
     */
    public EMail getOEMailInfo() {
        return oeMailInfo;
    }

    /**
     * Sets the value of the oeMailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMail }
     *     
     */
    public void setOEMailInfo(EMail value) {
        this.oeMailInfo = value;
    }

    /**
     * Gets the value of the oAgrafRecips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public ArrayOfRecipient getOAgrafRecips() {
        return oAgrafRecips;
    }

    /**
     * Sets the value of the oAgrafRecips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public void setOAgrafRecips(ArrayOfRecipient value) {
        this.oAgrafRecips = value;
    }

    /**
     * Gets the value of the enCardVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link EMailVisProtType }
     *     
     */
    public EMailVisProtType getEnCardVisibility() {
        return enCardVisibility;
    }

    /**
     * Sets the value of the enCardVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailVisProtType }
     *     
     */
    public void setEnCardVisibility(EMailVisProtType value) {
        this.enCardVisibility = value;
    }

    /**
     * Gets the value of the bSplitAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBSplitAddr() {
        return bSplitAddr;
    }

    /**
     * Sets the value of the bSplitAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBSplitAddr(Boolean value) {
        this.bSplitAddr = value;
    }

    /**
     * Gets the value of the strChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrChannelID() {
        return strChannelID;
    }

    /**
     * Sets the value of the strChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrChannelID(String value) {
        this.strChannelID = value;
    }

}
