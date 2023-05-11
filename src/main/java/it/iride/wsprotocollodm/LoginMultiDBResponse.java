
package it.iride.wsprotocollodm;

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
 *         &lt;element name="LoginMultiDBResult" type="{http://tempuri.org/}LoginOut" minOccurs="0"/>
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
    "loginMultiDBResult"
})
@XmlRootElement(name = "LoginMultiDBResponse")
public class LoginMultiDBResponse {

    @XmlElement(name = "LoginMultiDBResult")
    protected LoginOut loginMultiDBResult;

    /**
     * Gets the value of the loginMultiDBResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginOut }
     *     
     */
    public LoginOut getLoginMultiDBResult() {
        return loginMultiDBResult;
    }

    /**
     * Sets the value of the loginMultiDBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginOut }
     *     
     */
    public void setLoginMultiDBResult(LoginOut value) {
        this.loginMultiDBResult = value;
    }

}
