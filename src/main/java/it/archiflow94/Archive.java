
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Archive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Archive">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AOOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchiveId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ArchiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvalidatingMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsStorePECIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStorePECOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfboolean" minOccurs="0"/>
 *         &lt;element name="ProtocolRangeFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolRangeToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolRegisterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Archive", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "aooCode",
    "adminCode",
    "archiveId",
    "archiveName",
    "invalidatingMeasure",
    "isStorePECIn",
    "isStorePECOut",
    "options",
    "protocolRangeFromTime",
    "protocolRangeToTime",
    "protocolRegisterCode"
})
public class Archive {

    @XmlElement(name = "AOOCode", nillable = true)
    protected String aooCode;
    @XmlElement(name = "AdminCode", nillable = true)
    protected String adminCode;
    @XmlElement(name = "ArchiveId")
    protected Short archiveId;
    @XmlElement(name = "ArchiveName", nillable = true)
    protected String archiveName;
    @XmlElement(name = "InvalidatingMeasure", nillable = true)
    protected String invalidatingMeasure;
    @XmlElement(name = "IsStorePECIn")
    protected Boolean isStorePECIn;
    @XmlElement(name = "IsStorePECOut")
    protected Boolean isStorePECOut;
    @XmlElement(name = "Options", nillable = true)
    protected ArrayOfboolean options;
    @XmlElement(name = "ProtocolRangeFromTime", nillable = true)
    protected String protocolRangeFromTime;
    @XmlElement(name = "ProtocolRangeToTime", nillable = true)
    protected String protocolRangeToTime;
    @XmlElement(name = "ProtocolRegisterCode", nillable = true)
    protected String protocolRegisterCode;

    /**
     * Gets the value of the aooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOOCode() {
        return aooCode;
    }

    /**
     * Sets the value of the aooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOOCode(String value) {
        this.aooCode = value;
    }

    /**
     * Gets the value of the adminCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminCode() {
        return adminCode;
    }

    /**
     * Sets the value of the adminCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminCode(String value) {
        this.adminCode = value;
    }

    /**
     * Gets the value of the archiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getArchiveId() {
        return archiveId;
    }

    /**
     * Sets the value of the archiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setArchiveId(Short value) {
        this.archiveId = value;
    }

    /**
     * Gets the value of the archiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveName() {
        return archiveName;
    }

    /**
     * Sets the value of the archiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveName(String value) {
        this.archiveName = value;
    }

    /**
     * Gets the value of the invalidatingMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidatingMeasure() {
        return invalidatingMeasure;
    }

    /**
     * Sets the value of the invalidatingMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidatingMeasure(String value) {
        this.invalidatingMeasure = value;
    }

    /**
     * Gets the value of the isStorePECIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStorePECIn() {
        return isStorePECIn;
    }

    /**
     * Sets the value of the isStorePECIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStorePECIn(Boolean value) {
        this.isStorePECIn = value;
    }

    /**
     * Gets the value of the isStorePECOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStorePECOut() {
        return isStorePECOut;
    }

    /**
     * Sets the value of the isStorePECOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStorePECOut(Boolean value) {
        this.isStorePECOut = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfboolean }
     *     
     */
    public ArrayOfboolean getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfboolean }
     *     
     */
    public void setOptions(ArrayOfboolean value) {
        this.options = value;
    }

    /**
     * Gets the value of the protocolRangeFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRangeFromTime() {
        return protocolRangeFromTime;
    }

    /**
     * Sets the value of the protocolRangeFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRangeFromTime(String value) {
        this.protocolRangeFromTime = value;
    }

    /**
     * Gets the value of the protocolRangeToTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRangeToTime() {
        return protocolRangeToTime;
    }

    /**
     * Sets the value of the protocolRangeToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRangeToTime(String value) {
        this.protocolRangeToTime = value;
    }

    /**
     * Gets the value of the protocolRegisterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRegisterCode() {
        return protocolRegisterCode;
    }

    /**
     * Sets the value of the protocolRegisterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRegisterCode(String value) {
        this.protocolRegisterCode = value;
    }

}
