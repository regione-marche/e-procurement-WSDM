//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.newud;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * La scrivania virtuale rappresenta un utente non come persona fisica, ma nella funzione che svolge presso una certa UO. Pu� essere indicata univocamente indicando UO e utente; oppure il sistema pu� cercare di identificarla anche o solo a partire dalla sua descrizione
 * 
 * <p>Java class for ScrivaniaVirtualeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScrivaniaVirtualeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="UO" type="{}UOType" minOccurs="0"/>
 *         &lt;element name="Utente" type="{}UserType" minOccurs="0"/>
 *         &lt;element name="IdScrivaniaVirt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DesScrivaniaVirt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScrivaniaVirtualeType", propOrder = {

})
public class ScrivaniaVirtualeType {

    @XmlElement(name = "UO")
    protected UOType uo;
    @XmlElement(name = "Utente")
    protected UserType utente;
    @XmlElement(name = "IdScrivaniaVirt")
    protected BigInteger idScrivaniaVirt;
    @XmlElement(name = "DesScrivaniaVirt")
    protected String desScrivaniaVirt;

    /**
     * Gets the value of the uo property.
     * 
     * @return
     *     possible object is
     *     {@link UOType }
     *     
     */
    public UOType getUO() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOType }
     *     
     */
    public void setUO(UOType value) {
        this.uo = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUtente(UserType value) {
        this.utente = value;
    }

    /**
     * Gets the value of the idScrivaniaVirt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdScrivaniaVirt() {
        return idScrivaniaVirt;
    }

    /**
     * Sets the value of the idScrivaniaVirt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdScrivaniaVirt(BigInteger value) {
        this.idScrivaniaVirt = value;
    }

    /**
     * Gets the value of the desScrivaniaVirt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesScrivaniaVirt() {
        return desScrivaniaVirt;
    }

    /**
     * Sets the value of the desScrivaniaVirt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesScrivaniaVirt(String value) {
        this.desScrivaniaVirt = value;
    }

}
