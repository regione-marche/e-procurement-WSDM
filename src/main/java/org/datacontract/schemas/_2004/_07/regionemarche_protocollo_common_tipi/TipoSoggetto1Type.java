
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoSoggetto1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoSoggetto1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAI" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi.Digip}PAIType" minOccurs="0"/>
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
@XmlType(name = "TipoSoggetto1Type", propOrder = {
    "pai",
    "tipoRuolo"
})
public class TipoSoggetto1Type {

    @XmlElement(name = "PAI", nillable = true)
    protected PAIType pai;
    @XmlElement(name = "TipoRuolo", nillable = true)
    protected String tipoRuolo;

    /**
     * Gets the value of the pai property.
     * 
     * @return
     *     possible object is
     *     {@link PAIType }
     *     
     */
    public PAIType getPAI() {
        return pai;
    }

    /**
     * Sets the value of the pai property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAIType }
     *     
     */
    public void setPAI(PAIType value) {
        this.pai = value;
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
