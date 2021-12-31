
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TokenOrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputParameter", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "tokenOrPassword",
    "username"
})
@XmlSeeAlso({
    InputByBarcode.class,
    InputScan.class,
    InputGetKeys.class,
    InputGetBarcode.class,
    InputArchive.class,
    InputAddAttachment.class,
    InputDelete.class,
    InputLink.class,
    InputUpdate.class,
    InputGetIdDoc.class,
    InputByKeys.class,
    InputByIdDoc.class
})
public class InputParameter {

    @XmlElement(name = "TokenOrPassword", nillable = true)
    protected String tokenOrPassword;
    @XmlElement(name = "Username", nillable = true)
    protected String username;

    /**
     * Gets the value of the tokenOrPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenOrPassword() {
        return tokenOrPassword;
    }

    /**
     * Sets the value of the tokenOrPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenOrPassword(String value) {
        this.tokenOrPassword = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
