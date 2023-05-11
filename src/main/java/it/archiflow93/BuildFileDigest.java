
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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oCardIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="strCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="target" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}DigestTarget" minOccurs="0"/>
 *         &lt;element name="bRemoveTempFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "oCardIds",
    "strCertificate",
    "target",
    "bRemoveTempFile"
})
@XmlRootElement(name = "BuildFileDigest")
public class BuildFileDigest {

    @XmlElement(nillable = true)
    protected String strSessionId;
    @XmlElement(nillable = true)
    protected ArrayOfguid oCardIds;
    @XmlElement(nillable = true)
    protected String strCertificate;
    protected DigestTarget target;
    protected Boolean bRemoveTempFile;

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

    /**
     * Gets the value of the strCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCertificate() {
        return strCertificate;
    }

    /**
     * Sets the value of the strCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCertificate(String value) {
        this.strCertificate = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link DigestTarget }
     *     
     */
    public DigestTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestTarget }
     *     
     */
    public void setTarget(DigestTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the bRemoveTempFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBRemoveTempFile() {
        return bRemoveTempFile;
    }

    /**
     * Sets the value of the bRemoveTempFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBRemoveTempFile(Boolean value) {
        this.bRemoveTempFile = value;
    }

}
