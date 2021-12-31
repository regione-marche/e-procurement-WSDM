
package it.archiflow93.email;

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
 *         &lt;element name="oSessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="bGetShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bGetUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bGetOnlyPEC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "oSessionInfo",
    "bGetShared",
    "bGetUser",
    "bGetOnlyPEC"
})
@XmlRootElement(name = "GetMailBox", namespace = "http://tempuri.org/")
public class GetMailBox {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected SessionInfo oSessionInfo;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean bGetShared;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean bGetUser;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean bGetOnlyPEC;

    /**
     * Gets the value of the oSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getOSessionInfo() {
        return oSessionInfo;
    }

    /**
     * Sets the value of the oSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setOSessionInfo(SessionInfo value) {
        this.oSessionInfo = value;
    }

    /**
     * Gets the value of the bGetShared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBGetShared() {
        return bGetShared;
    }

    /**
     * Sets the value of the bGetShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBGetShared(Boolean value) {
        this.bGetShared = value;
    }

    /**
     * Gets the value of the bGetUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBGetUser() {
        return bGetUser;
    }

    /**
     * Sets the value of the bGetUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBGetUser(Boolean value) {
        this.bGetUser = value;
    }

    /**
     * Gets the value of the bGetOnlyPEC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBGetOnlyPEC() {
        return bGetOnlyPEC;
    }

    /**
     * Sets the value of the bGetOnlyPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBGetOnlyPEC(Boolean value) {
        this.bGetOnlyPEC = value;
    }

}
