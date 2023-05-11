
package it.kdm.docer.webservices;

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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docIdLastVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docIdNewVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "token",
    "docIdLastVersion",
    "docIdNewVersion",
    "version"
})
@XmlRootElement(name = "addOldAdvancedVersion")
public class AddOldAdvancedVersion {

    @XmlElement(nillable = true)
    protected String token;
    @XmlElement(nillable = true)
    protected String docIdLastVersion;
    @XmlElement(nillable = true)
    protected String docIdNewVersion;
    protected Double version;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the docIdLastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdLastVersion() {
        return docIdLastVersion;
    }

    /**
     * Sets the value of the docIdLastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdLastVersion(String value) {
        this.docIdLastVersion = value;
    }

    /**
     * Gets the value of the docIdNewVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdNewVersion() {
        return docIdNewVersion;
    }

    /**
     * Sets the value of the docIdNewVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdNewVersion(String value) {
        this.docIdNewVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVersion(Double value) {
        this.version = value;
    }

}
