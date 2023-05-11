
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
 *         &lt;element name="oSessInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="nCardID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enCardVisibility" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}EMailVisType" minOccurs="0"/>
 *         &lt;element name="oSendingParams" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Posting.ValueObject}SendingParams" minOccurs="0"/>
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
    "nCardID",
    "enCardVisibility",
    "oSendingParams"
})
@XmlRootElement(name = "Forward2")
public class Forward2 {

    @XmlElement(nillable = true)
    protected SessionInfo oSessInfo;
    protected Integer nCardID;
    protected EMailVisType enCardVisibility;
    @XmlElement(nillable = true)
    protected SendingParams oSendingParams;

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
     * Gets the value of the nCardID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNCardID() {
        return nCardID;
    }

    /**
     * Sets the value of the nCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNCardID(Integer value) {
        this.nCardID = value;
    }

    /**
     * Gets the value of the enCardVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link EMailVisType }
     *     
     */
    public EMailVisType getEnCardVisibility() {
        return enCardVisibility;
    }

    /**
     * Sets the value of the enCardVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailVisType }
     *     
     */
    public void setEnCardVisibility(EMailVisType value) {
        this.enCardVisibility = value;
    }

    /**
     * Gets the value of the oSendingParams property.
     * 
     * @return
     *     possible object is
     *     {@link SendingParams }
     *     
     */
    public SendingParams getOSendingParams() {
        return oSendingParams;
    }

    /**
     * Sets the value of the oSendingParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendingParams }
     *     
     */
    public void setOSendingParams(SendingParams value) {
        this.oSendingParams = value;
    }

}
