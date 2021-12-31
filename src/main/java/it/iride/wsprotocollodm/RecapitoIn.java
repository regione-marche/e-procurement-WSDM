
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecapitoIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecapitoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoRecapito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValoreRecapito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Swap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecapitoIn", propOrder = {
    "tipoRecapito",
    "valoreRecapito",
    "swap"
})
public class RecapitoIn {

    @XmlElement(name = "TipoRecapito")
    protected String tipoRecapito;
    @XmlElement(name = "ValoreRecapito")
    protected String valoreRecapito;
    @XmlElement(name = "Swap")
    protected String swap;

    /**
     * Gets the value of the tipoRecapito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecapito() {
        return tipoRecapito;
    }

    /**
     * Sets the value of the tipoRecapito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecapito(String value) {
        this.tipoRecapito = value;
    }

    /**
     * Gets the value of the valoreRecapito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoreRecapito() {
        return valoreRecapito;
    }

    /**
     * Sets the value of the valoreRecapito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoreRecapito(String value) {
        this.valoreRecapito = value;
    }

    /**
     * Gets the value of the swap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwap() {
        return swap;
    }

    /**
     * Sets the value of the swap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwap(String value) {
        this.swap = value;
    }

}
