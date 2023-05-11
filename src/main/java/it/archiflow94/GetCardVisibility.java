
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
 *         &lt;element name="nArchiveId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nDocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="oFields" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfField" minOccurs="0"/>
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
    "nArchiveId",
    "nDocumentTypeId",
    "oFields"
})
@XmlRootElement(name = "GetCardVisibility")
public class GetCardVisibility {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected Short nArchiveId;
    protected Short nDocumentTypeId;
    @XmlElement(nillable = true)
    protected ArrayOfField oFields;

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
     * Gets the value of the nArchiveId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNArchiveId() {
        return nArchiveId;
    }

    /**
     * Sets the value of the nArchiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNArchiveId(Short value) {
        this.nArchiveId = value;
    }

    /**
     * Gets the value of the nDocumentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNDocumentTypeId() {
        return nDocumentTypeId;
    }

    /**
     * Sets the value of the nDocumentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNDocumentTypeId(Short value) {
        this.nDocumentTypeId = value;
    }

    /**
     * Gets the value of the oFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getOFields() {
        return oFields;
    }

    /**
     * Sets the value of the oFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setOFields(ArrayOfField value) {
        this.oFields = value;
    }

}
