
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fascicolati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_dal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_al" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoprot_dal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoprot_al" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroprot_dal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroprot_al" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list", propOrder = {
    "token",
    "uor",
    "fascicolati",
    "verso",
    "dataDal",
    "dataAl",
    "annoprotDal",
    "annoprotAl",
    "numeroprotDal",
    "numeroprotAl"
})
public class List {

    protected String token;
    @XmlElement(name = "UOR")
    protected String uor;
    protected String fascicolati;
    protected String verso;
    @XmlElement(name = "data_dal")
    protected String dataDal;
    @XmlElement(name = "data_al")
    protected String dataAl;
    @XmlElement(name = "annoprot_dal")
    protected String annoprotDal;
    @XmlElement(name = "annoprot_al")
    protected String annoprotAl;
    @XmlElement(name = "numeroprot_dal")
    protected String numeroprotDal;
    @XmlElement(name = "numeroprot_al")
    protected String numeroprotAl;

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
     * Gets the value of the uor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOR() {
        return uor;
    }

    /**
     * Sets the value of the uor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOR(String value) {
        this.uor = value;
    }

    /**
     * Gets the value of the fascicolati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFascicolati() {
        return fascicolati;
    }

    /**
     * Sets the value of the fascicolati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFascicolati(String value) {
        this.fascicolati = value;
    }

    /**
     * Gets the value of the verso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerso() {
        return verso;
    }

    /**
     * Sets the value of the verso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerso(String value) {
        this.verso = value;
    }

    /**
     * Gets the value of the dataDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDal() {
        return dataDal;
    }

    /**
     * Sets the value of the dataDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDal(String value) {
        this.dataDal = value;
    }

    /**
     * Gets the value of the dataAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAl() {
        return dataAl;
    }

    /**
     * Sets the value of the dataAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAl(String value) {
        this.dataAl = value;
    }

    /**
     * Gets the value of the annoprotDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoprotDal() {
        return annoprotDal;
    }

    /**
     * Sets the value of the annoprotDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoprotDal(String value) {
        this.annoprotDal = value;
    }

    /**
     * Gets the value of the annoprotAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoprotAl() {
        return annoprotAl;
    }

    /**
     * Sets the value of the annoprotAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoprotAl(String value) {
        this.annoprotAl = value;
    }

    /**
     * Gets the value of the numeroprotDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroprotDal() {
        return numeroprotDal;
    }

    /**
     * Sets the value of the numeroprotDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroprotDal(String value) {
        this.numeroprotDal = value;
    }

    /**
     * Gets the value of the numeroprotAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroprotAl() {
        return numeroprotAl;
    }

    /**
     * Sets the value of the numeroprotAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroprotAl(String value) {
        this.numeroprotAl = value;
    }

}
