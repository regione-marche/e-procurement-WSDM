
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
 *         &lt;element name="enAccessLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AccessLevel" minOccurs="0"/>
 *         &lt;element name="bReturnAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bGetFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bGetAddInEmailMapping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "enAccessLevel",
    "bReturnAll",
    "bGetFields",
    "bGetAddInEmailMapping"
})
@XmlRootElement(name = "GetDocumentTypes2")
public class GetDocumentTypes2 {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected AccessLevel enAccessLevel;
    protected Boolean bReturnAll;
    protected Boolean bGetFields;
    protected Boolean bGetAddInEmailMapping;

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
     * Gets the value of the enAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessLevel }
     *     
     */
    public AccessLevel getEnAccessLevel() {
        return enAccessLevel;
    }

    /**
     * Sets the value of the enAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLevel }
     *     
     */
    public void setEnAccessLevel(AccessLevel value) {
        this.enAccessLevel = value;
    }

    /**
     * Gets the value of the bReturnAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBReturnAll() {
        return bReturnAll;
    }

    /**
     * Sets the value of the bReturnAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBReturnAll(Boolean value) {
        this.bReturnAll = value;
    }

    /**
     * Gets the value of the bGetFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBGetFields() {
        return bGetFields;
    }

    /**
     * Sets the value of the bGetFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBGetFields(Boolean value) {
        this.bGetFields = value;
    }

    /**
     * Gets the value of the bGetAddInEmailMapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBGetAddInEmailMapping() {
        return bGetAddInEmailMapping;
    }

    /**
     * Sets the value of the bGetAddInEmailMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBGetAddInEmailMapping(Boolean value) {
        this.bGetAddInEmailMapping = value;
    }

}
