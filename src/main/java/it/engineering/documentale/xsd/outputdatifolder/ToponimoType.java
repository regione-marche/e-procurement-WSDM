//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatifolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToponimoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToponimoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CodToponomastico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescrizioneToponimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToponimoType", propOrder = {
    "codToponomastico",
    "descrizioneToponimo"
})
public class ToponimoType {

    @XmlElement(name = "CodToponomastico")
    protected String codToponomastico;
    @XmlElement(name = "DescrizioneToponimo")
    protected String descrizioneToponimo;

    /**
     * Gets the value of the codToponomastico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodToponomastico() {
        return codToponomastico;
    }

    /**
     * Sets the value of the codToponomastico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodToponomastico(String value) {
        this.codToponomastico = value;
    }

    /**
     * Gets the value of the descrizioneToponimo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneToponimo() {
        return descrizioneToponimo;
    }

    /**
     * Sets the value of the descrizioneToponimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneToponimo(String value) {
        this.descrizioneToponimo = value;
    }

}
