
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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nListId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nParentItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="strParentItemValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nDocumentType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
    "nListId",
    "nParentItemId",
    "strParentItemValue",
    "nDocumentType"
})
@XmlRootElement(name = "GetListItems")
public class GetListItems {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected Short nListId;
    protected Integer nParentItemId;
    @XmlElement(nillable = true)
    protected String strParentItemValue;
    protected Short nDocumentType;

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
     * Gets the value of the nListId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNListId() {
        return nListId;
    }

    /**
     * Sets the value of the nListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNListId(Short value) {
        this.nListId = value;
    }

    /**
     * Gets the value of the nParentItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNParentItemId() {
        return nParentItemId;
    }

    /**
     * Sets the value of the nParentItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNParentItemId(Integer value) {
        this.nParentItemId = value;
    }

    /**
     * Gets the value of the strParentItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrParentItemValue() {
        return strParentItemValue;
    }

    /**
     * Sets the value of the strParentItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrParentItemValue(String value) {
        this.strParentItemValue = value;
    }

    /**
     * Gets the value of the nDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNDocumentType() {
        return nDocumentType;
    }

    /**
     * Sets the value of the nDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNDocumentType(Short value) {
        this.nDocumentType = value;
    }

}
