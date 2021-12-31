
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
 *         &lt;element name="strGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="enUploadType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}UploadType" minOccurs="0"/>
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
    "strGUID",
    "strName",
    "aBytes",
    "enUploadType"
})
@XmlRootElement(name = "UploadFile")
public class UploadFile {

    @XmlElement(nillable = true)
    protected SessionInfo oSessInfo;
    @XmlElement(nillable = true)
    protected String strGUID;
    @XmlElement(nillable = true)
    protected String strName;
    @XmlElement(nillable = true)
    protected byte[] aBytes;
    protected UploadType enUploadType;

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
     * Gets the value of the strGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrGUID() {
        return strGUID;
    }

    /**
     * Sets the value of the strGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrGUID(String value) {
        this.strGUID = value;
    }

    /**
     * Gets the value of the strName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrName() {
        return strName;
    }

    /**
     * Sets the value of the strName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrName(String value) {
        this.strName = value;
    }

    /**
     * Gets the value of the aBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getABytes() {
        return aBytes;
    }

    /**
     * Sets the value of the aBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setABytes(byte[] value) {
        this.aBytes = ((byte[]) value);
    }

    /**
     * Gets the value of the enUploadType property.
     * 
     * @return
     *     possible object is
     *     {@link UploadType }
     *     
     */
    public UploadType getEnUploadType() {
        return enUploadType;
    }

    /**
     * Sets the value of the enUploadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadType }
     *     
     */
    public void setEnUploadType(UploadType value) {
        this.enUploadType = value;
    }

}
