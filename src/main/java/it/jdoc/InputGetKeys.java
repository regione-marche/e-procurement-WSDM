
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputGetKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputGetKeys">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputParameter">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocFields" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}ArrayOfDocField" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputGetKeys", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "company",
    "docFields",
    "docType",
    "imageNumber"
})
public class InputGetKeys
    extends InputParameter
{

    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "DocFields", nillable = true)
    protected ArrayOfDocField docFields;
    @XmlElement(name = "DocType", nillable = true)
    protected String docType;
    @XmlElement(name = "ImageNumber")
    protected Integer imageNumber;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the docFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocField }
     *     
     */
    public ArrayOfDocField getDocFields() {
        return docFields;
    }

    /**
     * Sets the value of the docFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocField }
     *     
     */
    public void setDocFields(ArrayOfDocField value) {
        this.docFields = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the imageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageNumber() {
        return imageNumber;
    }

    /**
     * Sets the value of the imageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageNumber(Integer value) {
        this.imageNumber = value;
    }

}
