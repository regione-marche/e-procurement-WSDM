
package it.iride.wspostaweb;

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
 *         &lt;element name="InviaMailInteropResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inviaMailInteropResult"
})
@XmlRootElement(name = "InviaMailInteropResponse")
public class InviaMailInteropResponse {

    @XmlElement(name = "InviaMailInteropResult", required = true)
    protected String inviaMailInteropResult;

    /**
     * Gets the value of the inviaMailInteropResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviaMailInteropResult() {
        return inviaMailInteropResult;
    }

    /**
     * Sets the value of the inviaMailInteropResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviaMailInteropResult(String value) {
        this.inviaMailInteropResult = value;
    }

}
