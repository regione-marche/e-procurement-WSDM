
package it.infor.JProtocolloServices;

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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}corrispondente"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presaInCarico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="chiusura" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "corrispondente",
    "nota",
    "presaInCarico",
    "chiusura"
})
@XmlRootElement(name = "smistamento")
public class Smistamento {

    @XmlElement(required = true)
    protected Corrispondente corrispondente;
    protected String nota;
    protected Boolean presaInCarico;
    protected Boolean chiusura;

    /**
     * Gets the value of the corrispondente property.
     * 
     * @return
     *     possible object is
     *     {@link Corrispondente }
     *     
     */
    public Corrispondente getCorrispondente() {
        return corrispondente;
    }

    /**
     * Sets the value of the corrispondente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corrispondente }
     *     
     */
    public void setCorrispondente(Corrispondente value) {
        this.corrispondente = value;
    }

    /**
     * Gets the value of the nota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Sets the value of the nota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Gets the value of the presaInCarico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresaInCarico() {
        return presaInCarico;
    }

    /**
     * Sets the value of the presaInCarico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresaInCarico(Boolean value) {
        this.presaInCarico = value;
    }

    /**
     * Gets the value of the chiusura property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChiusura() {
        return chiusura;
    }

    /**
     * Sets the value of the chiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChiusura(Boolean value) {
        this.chiusura = value;
    }

}
