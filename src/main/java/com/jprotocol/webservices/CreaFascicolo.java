
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creaFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaFascicolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fascicolo" type="{http://WebServices.jprotocol.com/}fascicolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaFascicolo", propOrder = {
    "token",
    "fascicolo"
})
public class CreaFascicolo {

    protected String token;
    protected Fascicolo fascicolo;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the fascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link Fascicolo }
     *     
     */
    public Fascicolo getFascicolo() {
        return fascicolo;
    }

    /**
     * Sets the value of the fascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fascicolo }
     *     
     */
    public void setFascicolo(Fascicolo value) {
        this.fascicolo = value;
    }

}
