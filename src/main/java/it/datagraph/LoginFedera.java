
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="strCodEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCodEnte",
    "strCodFiscale",
    "strPassword"
})
@XmlRootElement(name = "LoginFedera")
public class LoginFedera {

    protected String strCodEnte;
    protected String strCodFiscale;
    protected String strPassword;

    /**
     * Gets the value of the strCodEnte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodEnte() {
        return strCodEnte;
    }

    /**
     * Sets the value of the strCodEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodEnte(String value) {
        this.strCodEnte = value;
    }

    /**
     * Gets the value of the strCodFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodFiscale() {
        return strCodFiscale;
    }

    /**
     * Sets the value of the strCodFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodFiscale(String value) {
        this.strCodFiscale = value;
    }

    /**
     * Gets the value of the strPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPassword() {
        return strPassword;
    }

    /**
     * Sets the value of the strPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPassword(String value) {
        this.strPassword = value;
    }

}
