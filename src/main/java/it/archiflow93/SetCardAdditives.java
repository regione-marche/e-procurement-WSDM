
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
 *         &lt;element name="oSessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="oCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="oAdditives" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfAdditive" minOccurs="0"/>
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
    "oCardId",
    "oAdditives"
})
@XmlRootElement(name = "SetCardAdditives")
public class SetCardAdditives {

    @XmlElement(nillable = true)
    protected SessionInfo oSessionInfo;
    protected String oCardId;
    @XmlElement(nillable = true)
    protected ArrayOfAdditive oAdditives;

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
     * Gets the value of the oCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCardId() {
        return oCardId;
    }

    /**
     * Sets the value of the oCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCardId(String value) {
        this.oCardId = value;
    }

    /**
     * Gets the value of the oAdditives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditive }
     *     
     */
    public ArrayOfAdditive getOAdditives() {
        return oAdditives;
    }

    /**
     * Sets the value of the oAdditives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditive }
     *     
     */
    public void setOAdditives(ArrayOfAdditive value) {
        this.oAdditives = value;
    }

}
