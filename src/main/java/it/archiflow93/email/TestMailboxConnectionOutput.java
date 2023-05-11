
package it.archiflow93.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestMailboxConnectionOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestMailboxConnectionOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="InfoMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestOk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestMailboxConnectionOutput", propOrder = {
    "infoMessage",
    "testOk"
})
public class TestMailboxConnectionOutput
    extends BaseOutput
{

    @XmlElement(name = "InfoMessage", nillable = true)
    protected String infoMessage;
    @XmlElement(name = "TestOk")
    protected Boolean testOk;

    /**
     * Gets the value of the infoMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoMessage() {
        return infoMessage;
    }

    /**
     * Sets the value of the infoMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoMessage(String value) {
        this.infoMessage = value;
    }

    /**
     * Gets the value of the testOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestOk() {
        return testOk;
    }

    /**
     * Sets the value of the testOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestOk(Boolean value) {
        this.testOk = value;
    }

}
