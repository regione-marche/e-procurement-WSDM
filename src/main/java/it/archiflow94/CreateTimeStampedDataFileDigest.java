
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
 *         &lt;element name="xmlDigest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lstTSDDigest" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "xmlDigest",
    "lstTSDDigest"
})
@XmlRootElement(name = "CreateTimeStampedDataFileDigest")
public class CreateTimeStampedDataFileDigest {

    @XmlElement(nillable = true)
    protected String strSessionId;
    @XmlElement(nillable = true)
    protected String xmlDigest;
    @XmlElement(nillable = true)
    protected ArrayOfstring lstTSDDigest;

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
     * Gets the value of the xmlDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlDigest() {
        return xmlDigest;
    }

    /**
     * Sets the value of the xmlDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlDigest(String value) {
        this.xmlDigest = value;
    }

    /**
     * Gets the value of the lstTSDDigest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getLstTSDDigest() {
        return lstTSDDigest;
    }

    /**
     * Sets the value of the lstTSDDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setLstTSDDigest(ArrayOfstring value) {
        this.lstTSDDigest = value;
    }

}
