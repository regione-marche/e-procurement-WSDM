
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UODestinataria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UODestinataria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Carico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCopie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UODestinataria", propOrder = {
    "carico",
    "tipoUO",
    "data",
    "numeroCopie"
})
public class UODestinataria {

    @XmlElement(name = "Carico", nillable = true)
    protected String carico;
    @XmlElement(name = "TipoUO", nillable = true)
    protected String tipoUO;
    @XmlElement(name = "Data", nillable = true)
    protected String data;
    @XmlElement(name = "NumeroCopie", nillable = true)
    protected String numeroCopie;

    /**
     * Gets the value of the carico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarico() {
        return carico;
    }

    /**
     * Sets the value of the carico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarico(String value) {
        this.carico = value;
    }

    /**
     * Gets the value of the tipoUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUO() {
        return tipoUO;
    }

    /**
     * Sets the value of the tipoUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUO(String value) {
        this.tipoUO = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the numeroCopie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCopie() {
        return numeroCopie;
    }

    /**
     * Sets the value of the numeroCopie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCopie(String value) {
        this.numeroCopie = value;
    }

}
