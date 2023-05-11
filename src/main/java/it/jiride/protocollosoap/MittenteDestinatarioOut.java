
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MittenteDestinatarioOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MittenteDestinatarioOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdSoggetto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CognomeNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartitaIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChiaveAlternativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MittenteDestinatarioOut", propOrder = {
    "idSoggetto",
    "cognomeNome",
    "partitaIVA",
    "chiaveAlternativa"
})
public class MittenteDestinatarioOut {

    @XmlElement(name = "IdSoggetto")
    protected int idSoggetto;
    @XmlElement(name = "CognomeNome", nillable = true)
    protected String cognomeNome;
    @XmlElement(name = "PartitaIVA", nillable = true)
    protected String partitaIVA;
    @XmlElement(name = "ChiaveAlternativa", nillable = true)
    protected String chiaveAlternativa;

    /**
     * Gets the value of the idSoggetto property.
     * 
     */
    public int getIdSoggetto() {
        return idSoggetto;
    }

    /**
     * Sets the value of the idSoggetto property.
     * 
     */
    public void setIdSoggetto(int value) {
        this.idSoggetto = value;
    }

    /**
     * Gets the value of the cognomeNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognomeNome() {
        return cognomeNome;
    }

    /**
     * Sets the value of the cognomeNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognomeNome(String value) {
        this.cognomeNome = value;
    }

    /**
     * Gets the value of the partitaIVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitaIVA() {
        return partitaIVA;
    }

    /**
     * Sets the value of the partitaIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitaIVA(String value) {
        this.partitaIVA = value;
    }

    /**
     * Gets the value of the chiaveAlternativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChiaveAlternativa() {
        return chiaveAlternativa;
    }

    /**
     * Sets the value of the chiaveAlternativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChiaveAlternativa(String value) {
        this.chiaveAlternativa = value;
    }

}
