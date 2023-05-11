
package it.datagraph;

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
 *         &lt;element name="TestOpenOfficeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "testOpenOfficeResult"
})
@XmlRootElement(name = "TestOpenOfficeResponse")
public class TestOpenOfficeResponse {

    @XmlElement(name = "TestOpenOfficeResult")
    protected String testOpenOfficeResult;

    /**
     * Gets the value of the testOpenOfficeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestOpenOfficeResult() {
        return testOpenOfficeResult;
    }

    /**
     * Sets the value of the testOpenOfficeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestOpenOfficeResult(String value) {
        this.testOpenOfficeResult = value;
    }

}
