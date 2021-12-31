
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codErrore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailServiceResponse", propOrder = {
    "codErrore",
    "desErrore"
})
public class MailServiceResponse {

    protected int codErrore;
    protected String desErrore;

    /**
     * Gets the value of the codErrore property.
     * 
     */
    public int getCodErrore() {
        return codErrore;
    }

    /**
     * Sets the value of the codErrore property.
     * 
     */
    public void setCodErrore(int value) {
        this.codErrore = value;
    }

    /**
     * Gets the value of the desErrore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesErrore() {
        return desErrore;
    }

    /**
     * Sets the value of the desErrore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesErrore(String value) {
        this.desErrore = value;
    }

}
