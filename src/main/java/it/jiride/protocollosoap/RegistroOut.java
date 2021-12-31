
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistroOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistroOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnoRegistro" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NumeroRegistro" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroOut", propOrder = {
    "tipoRegistro",
    "annoRegistro",
    "numeroRegistro"
})
public class RegistroOut {

    @XmlElement(name = "TipoRegistro", nillable = true)
    protected String tipoRegistro;
    @XmlElement(name = "AnnoRegistro")
    protected short annoRegistro;
    @XmlElement(name = "NumeroRegistro")
    protected short numeroRegistro;

    /**
     * Gets the value of the tipoRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    /**
     * Sets the value of the tipoRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegistro(String value) {
        this.tipoRegistro = value;
    }

    /**
     * Gets the value of the annoRegistro property.
     * 
     */
    public short getAnnoRegistro() {
        return annoRegistro;
    }

    /**
     * Sets the value of the annoRegistro property.
     * 
     */
    public void setAnnoRegistro(short value) {
        this.annoRegistro = value;
    }

    /**
     * Gets the value of the numeroRegistro property.
     * 
     */
    public short getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Sets the value of the numeroRegistro property.
     * 
     */
    public void setNumeroRegistro(short value) {
        this.numeroRegistro = value;
    }

}
