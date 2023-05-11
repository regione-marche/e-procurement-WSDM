
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
 *         &lt;element name="wlt" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}WebLinkType" minOccurs="0"/>
 *         &lt;element name="sitePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oCardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
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
    "wlt",
    "sitePath",
    "oCardIds"
})
@XmlRootElement(name = "CreateWebLinks")
public class CreateWebLinks {

    @XmlElement(nillable = true)
    protected SessionInfo oSessionInfo;
    protected WebLinkType wlt;
    @XmlElement(nillable = true)
    protected String sitePath;
    @XmlElement(nillable = true)
    protected ArrayOfguid oCardIds;

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
     * Gets the value of the wlt property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkType }
     *     
     */
    public WebLinkType getWlt() {
        return wlt;
    }

    /**
     * Sets the value of the wlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkType }
     *     
     */
    public void setWlt(WebLinkType value) {
        this.wlt = value;
    }

    /**
     * Gets the value of the sitePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitePath() {
        return sitePath;
    }

    /**
     * Sets the value of the sitePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitePath(String value) {
        this.sitePath = value;
    }

    /**
     * Gets the value of the oCardIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getOCardIds() {
        return oCardIds;
    }

    /**
     * Sets the value of the oCardIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setOCardIds(ArrayOfguid value) {
        this.oCardIds = value;
    }

}
