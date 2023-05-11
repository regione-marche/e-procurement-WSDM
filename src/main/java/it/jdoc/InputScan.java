
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputScan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputParameter">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocFields" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}ArrayOfDocField" minOccurs="0"/>
 *         &lt;element name="DocPutRequestOptions" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocPutRequestOptions" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputScan", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "company",
    "docFields",
    "docPutRequestOptions",
    "docType",
    "user"
})
public class InputScan
    extends InputParameter
{

    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "DocFields", nillable = true)
    protected ArrayOfDocField docFields;
    @XmlElement(name = "DocPutRequestOptions", nillable = true)
    protected DocPutRequestOptions docPutRequestOptions;
    @XmlElement(name = "DocType", nillable = true)
    protected String docType;
    @XmlElement(name = "User", nillable = true)
    protected String user;

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
     * Gets the value of the docPutRequestOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DocPutRequestOptions }
     *     
     */
    public DocPutRequestOptions getDocPutRequestOptions() {
        return docPutRequestOptions;
    }

    /**
     * Sets the value of the docPutRequestOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPutRequestOptions }
     *     
     */
    public void setDocPutRequestOptions(DocPutRequestOptions value) {
        this.docPutRequestOptions = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
