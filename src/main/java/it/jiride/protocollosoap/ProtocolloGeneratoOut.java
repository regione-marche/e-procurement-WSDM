
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolloGeneratoOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolloGeneratoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroRegistrazionePG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRegistrazionePG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolloGeneratoOut", propOrder = {
    "numeroRegistrazionePG",
    "dataRegistrazionePG",
    "tipoPG"
})
public class ProtocolloGeneratoOut {

    @XmlElement(name = "NumeroRegistrazionePG", nillable = true)
    protected String numeroRegistrazionePG;
    @XmlElement(name = "DataRegistrazionePG", nillable = true)
    protected String dataRegistrazionePG;
    @XmlElement(name = "TipoPG", nillable = true)
    protected String tipoPG;

    /**
     * Gets the value of the numeroRegistrazionePG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistrazionePG() {
        return numeroRegistrazionePG;
    }

    /**
     * Sets the value of the numeroRegistrazionePG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistrazionePG(String value) {
        this.numeroRegistrazionePG = value;
    }

    /**
     * Gets the value of the dataRegistrazionePG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistrazionePG() {
        return dataRegistrazionePG;
    }

    /**
     * Sets the value of the dataRegistrazionePG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistrazionePG(String value) {
        this.dataRegistrazionePG = value;
    }

    /**
     * Gets the value of the tipoPG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPG() {
        return tipoPG;
    }

    /**
     * Sets the value of the tipoPG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPG(String value) {
        this.tipoPG = value;
    }

}
