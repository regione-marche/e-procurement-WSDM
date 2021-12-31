
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputLink">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputParameter">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Iddoc_1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Iddoc_2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "InputLink", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "company",
    "iddoc1",
    "iddoc2",
    "user"
})
public class InputLink
    extends InputParameter
{

    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "Iddoc_1")
    protected Long iddoc1;
    @XmlElement(name = "Iddoc_2")
    protected Long iddoc2;
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
     * Gets the value of the iddoc1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIddoc1() {
        return iddoc1;
    }

    /**
     * Sets the value of the iddoc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIddoc1(Long value) {
        this.iddoc1 = value;
    }

    /**
     * Gets the value of the iddoc2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIddoc2() {
        return iddoc2;
    }

    /**
     * Sets the value of the iddoc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIddoc2(Long value) {
        this.iddoc2 = value;
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
