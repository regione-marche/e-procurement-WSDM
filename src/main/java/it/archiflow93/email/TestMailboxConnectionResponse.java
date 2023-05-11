
package it.archiflow93.email;

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
 *         &lt;element name="TestMailboxConnectionResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.ExternalMail.ValueObject}TestMailboxConnectionOutput" minOccurs="0"/>
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
    "testMailboxConnectionResult"
})
@XmlRootElement(name = "TestMailboxConnectionResponse", namespace = "http://tempuri.org/")
public class TestMailboxConnectionResponse {

    @XmlElement(name = "TestMailboxConnectionResult", namespace = "http://tempuri.org/", nillable = true)
    protected TestMailboxConnectionOutput testMailboxConnectionResult;

    /**
     * Gets the value of the testMailboxConnectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link TestMailboxConnectionOutput }
     *     
     */
    public TestMailboxConnectionOutput getTestMailboxConnectionResult() {
        return testMailboxConnectionResult;
    }

    /**
     * Sets the value of the testMailboxConnectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestMailboxConnectionOutput }
     *     
     */
    public void setTestMailboxConnectionResult(TestMailboxConnectionOutput value) {
        this.testMailboxConnectionResult = value;
    }

}
