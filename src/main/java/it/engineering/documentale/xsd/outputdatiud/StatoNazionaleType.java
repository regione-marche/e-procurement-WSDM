//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatiud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatoNazionaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatoNazionaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodISTATStato" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NomeStato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatoNazionaleType", propOrder = {
    "codISTATStato",
    "nomeStato"
})
public class StatoNazionaleType {

    @XmlElement(name = "CodISTATStato")
    protected String codISTATStato;
    @XmlElement(name = "NomeStato", required = true)
    protected String nomeStato;

    /**
     * Gets the value of the codISTATStato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodISTATStato() {
        return codISTATStato;
    }

    /**
     * Sets the value of the codISTATStato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodISTATStato(String value) {
        this.codISTATStato = value;
    }

    /**
     * Gets the value of the nomeStato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeStato() {
        return nomeStato;
    }

    /**
     * Sets the value of the nomeStato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeStato(String value) {
        this.nomeStato = value;
    }

}
