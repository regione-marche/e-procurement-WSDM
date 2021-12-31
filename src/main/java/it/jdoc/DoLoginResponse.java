
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
 *         &lt;element name="DoLoginResult" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}UserResult" minOccurs="0"/>
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
    "doLoginResult"
})
@XmlRootElement(name = "DoLoginResponse")
public class DoLoginResponse {

    @XmlElement(name = "DoLoginResult", nillable = true)
    protected UserResult doLoginResult;

    /**
     * Gets the value of the doLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserResult }
     *     
     */
    public UserResult getDoLoginResult() {
        return doLoginResult;
    }

    /**
     * Sets the value of the doLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResult }
     *     
     */
    public void setDoLoginResult(UserResult value) {
        this.doLoginResult = value;
    }

}
