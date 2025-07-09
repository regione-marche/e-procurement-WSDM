
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi_digip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoSoggetto44Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoSoggetto44Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PF" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip.Protocollo}PFType" minOccurs="0"/>
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
@XmlType(name = "TipoSoggetto44Type", propOrder = {
    "pf",
    "tipoRuolo"
})
public class TipoSoggetto44Type {

    @XmlElement(name = "PF", nillable = true)
    protected PFType pf;
    @XmlElement(name = "TipoRuolo", nillable = true)
    protected String tipoRuolo;

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link PFType }
     *     
     */
    public PFType getPF() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFType }
     *     
     */
    public void setPF(PFType value) {
        this.pf = value;
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
