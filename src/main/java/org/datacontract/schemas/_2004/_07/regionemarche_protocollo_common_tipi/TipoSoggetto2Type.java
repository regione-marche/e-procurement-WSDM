
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoSoggetto2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoSoggetto2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AS" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip}ASType" minOccurs="0"/>
 *         &lt;element name="TipoRuolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoSoggetto2Type", propOrder = {
    "as",
    "tipoRuolo"
})
public class TipoSoggetto2Type {

    @XmlElement(name = "AS", nillable = true)
    protected ASType as;
    @XmlElement(name = "TipoRuolo", nillable = true)
    protected String tipoRuolo;

    /**
     * Gets the value of the as property.
     * 
     * @return
     *     possible object is
     *     {@link ASType }
     *     
     */
    public ASType getAS() {
        return as;
    }

    /**
     * Sets the value of the as property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASType }
     *     
     */
    public void setAS(ASType value) {
        this.as = value;
    }

    /**
     * Gets the value of the tipoRuolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRuolo() {
        return tipoRuolo;
    }

    /**
     * Sets the value of the tipoRuolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRuolo(String value) {
        this.tipoRuolo = value;
    }

}
