
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
 *         &lt;element name="sessionInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Login.ValueObject}SessionInfo" minOccurs="0"/>
 *         &lt;element name="channelGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archDocID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionInfo",
    "channelGuid",
    "archDocID"
})
@XmlRootElement(name = "ReadChnlFieldKeysSend")
public class ReadChnlFieldKeysSend {

    @XmlElement(nillable = true)
    protected SessionInfo sessionInfo;
    @XmlElement(nillable = true)
    protected String channelGuid;
    protected Integer archDocID;

    /**
     * Gets the value of the sessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfo }
     *     
     */
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets the value of the sessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfo }
     *     
     */
    public void setSessionInfo(SessionInfo value) {
        this.sessionInfo = value;
    }

    /**
     * Gets the value of the channelGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelGuid() {
        return channelGuid;
    }

    /**
     * Sets the value of the channelGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelGuid(String value) {
        this.channelGuid = value;
    }

    /**
     * Gets the value of the archDocID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArchDocID() {
        return archDocID;
    }

    /**
     * Sets the value of the archDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArchDocID(Integer value) {
        this.archDocID = value;
    }

}
