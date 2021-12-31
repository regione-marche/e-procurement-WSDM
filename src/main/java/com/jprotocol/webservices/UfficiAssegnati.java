
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ufficiAssegnati complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ufficiAssegnati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codUfficio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAssegnazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ufficiAssegnati", propOrder = {
    "codUfficio",
    "tipoAssegnazione"
})
public class UfficiAssegnati {

    protected String codUfficio;
    protected int tipoAssegnazione;

    /**
     * Gets the value of the codUfficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUfficio() {
        return codUfficio;
    }

    /**
     * Sets the value of the codUfficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUfficio(String value) {
        this.codUfficio = value;
    }

    /**
     * Gets the value of the tipoAssegnazione property.
     * 
     */
    public int getTipoAssegnazione() {
        return tipoAssegnazione;
    }

    /**
     * Sets the value of the tipoAssegnazione property.
     * 
     */
    public void setTipoAssegnazione(int value) {
        this.tipoAssegnazione = value;
    }

}
