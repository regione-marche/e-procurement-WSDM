
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impostaRiservatezza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impostaRiservatezza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoProtocolloDaImpostare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProtocolloDaImpostare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gradoRiservatezza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impostaRiservatezza", propOrder = {
    "token",
    "annoProtocolloDaImpostare",
    "numeroProtocolloDaImpostare",
    "gradoRiservatezza"
})
public class ImpostaRiservatezza {

    protected String token;
    protected String annoProtocolloDaImpostare;
    protected String numeroProtocolloDaImpostare;
    protected Integer gradoRiservatezza;

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
     * Gets the value of the annoProtocolloDaImpostare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoProtocolloDaImpostare() {
        return annoProtocolloDaImpostare;
    }

    /**
     * Sets the value of the annoProtocolloDaImpostare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoProtocolloDaImpostare(String value) {
        this.annoProtocolloDaImpostare = value;
    }

    /**
     * Gets the value of the numeroProtocolloDaImpostare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolloDaImpostare() {
        return numeroProtocolloDaImpostare;
    }

    /**
     * Sets the value of the numeroProtocolloDaImpostare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolloDaImpostare(String value) {
        this.numeroProtocolloDaImpostare = value;
    }

    /**
     * Gets the value of the gradoRiservatezza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGradoRiservatezza() {
        return gradoRiservatezza;
    }

    /**
     * Sets the value of the gradoRiservatezza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradoRiservatezza(Integer value) {
        this.gradoRiservatezza = value;
    }

}
