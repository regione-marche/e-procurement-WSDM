
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolliSoggettoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolliSoggettoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Protocolli" type="{http://tempuri.org/}ArrayOfProtocolloSoggettoOut" minOccurs="0"/>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolliSoggettoOut", propOrder = {
    "protocolli",
    "messaggio",
    "errore"
})
public class ProtocolliSoggettoOut {

    @XmlElement(name = "Protocolli", nillable = true)
    protected ArrayOfProtocolloSoggettoOut protocolli;
    @XmlElement(name = "Messaggio", nillable = true)
    protected String messaggio;
    @XmlElement(name = "Errore", nillable = true)
    protected String errore;

    /**
     * Gets the value of the protocolli property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProtocolloSoggettoOut }
     *     
     */
    public ArrayOfProtocolloSoggettoOut getProtocolli() {
        return protocolli;
    }

    /**
     * Sets the value of the protocolli property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProtocolloSoggettoOut }
     *     
     */
    public void setProtocolli(ArrayOfProtocolloSoggettoOut value) {
        this.protocolli = value;
    }

    /**
     * Gets the value of the messaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the value of the messaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

}
