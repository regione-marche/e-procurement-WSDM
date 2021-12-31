
package it.jdoc;

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
 *         &lt;element name="DoLinkResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}LinkResult" minOccurs="0"/>
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
    "doLinkResult"
})
@XmlRootElement(name = "DoLinkResponse")
public class DoLinkResponse {

    @XmlElement(name = "DoLinkResult", nillable = true)
    protected LinkResult doLinkResult;

    /**
     * Gets the value of the doLinkResult property.
     * 
     * @return
     *     possible object is
     *     {@link LinkResult }
     *     
     */
    public LinkResult getDoLinkResult() {
        return doLinkResult;
    }

    /**
     * Sets the value of the doLinkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkResult }
     *     
     */
    public void setDoLinkResult(LinkResult value) {
        this.doLinkResult = value;
    }

}
