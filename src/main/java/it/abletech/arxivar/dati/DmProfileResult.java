
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Result">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="PROFILE" type="{http://www.Abletech.it/Arxivar}Dm_Profile" minOccurs="0"/>
 *         &lt;element name="EXCEPTION" type="{http://www.Abletech.it/Arxivar}Security_Exception"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Result", propOrder = {
    "profile",
    "exception",
    "message"
})
public class DmProfileResult
    extends Base
{

    @XmlElement(name = "PROFILE")
    protected DmProfile profile;
    @XmlElement(name = "EXCEPTION", required = true)
    protected SecurityException exception;
    @XmlElement(name = "MESSAGE")
    protected String message;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link DmProfile }
     *     
     */
    public DmProfile getPROFILE() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProfile }
     *     
     */
    public void setPROFILE(DmProfile value) {
        this.profile = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityException }
     *     
     */
    public SecurityException getEXCEPTION() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityException }
     *     
     */
    public void setEXCEPTION(SecurityException value) {
        this.exception = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGE(String value) {
        this.message = value;
    }

}
