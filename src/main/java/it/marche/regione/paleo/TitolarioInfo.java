
package it.marche.regione.paleo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitolarioInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitolarioInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceClassifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custode" type="{http://paleo.regione.marche.it/services/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="DescrizioneClassifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescrizioneFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitolarioInfo", propOrder = {
    "codiceClassifica",
    "codiceFascicolo",
    "custode",
    "descrizioneClassifica",
    "descrizioneFascicolo"
})
public class TitolarioInfo {

    @XmlElement(name = "CodiceClassifica", nillable = true)
    protected String codiceClassifica;
    @XmlElement(name = "CodiceFascicolo", nillable = true)
    protected String codiceFascicolo;
    @XmlElement(name = "Custode", nillable = true)
    protected OperatorePaleo custode;
    @XmlElement(name = "DescrizioneClassifica", nillable = true)
    protected String descrizioneClassifica;
    @XmlElement(name = "DescrizioneFascicolo", nillable = true)
    protected String descrizioneFascicolo;

    /**
     * Gets the value of the codiceClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceClassifica() {
        return codiceClassifica;
    }

    /**
     * Sets the value of the codiceClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceClassifica(String value) {
        this.codiceClassifica = value;
    }

    /**
     * Gets the value of the codiceFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFascicolo() {
        return codiceFascicolo;
    }

    /**
     * Sets the value of the codiceFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFascicolo(String value) {
        this.codiceFascicolo = value;
    }

    /**
     * Gets the value of the custode property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getCustode() {
        return custode;
    }

    /**
     * Sets the value of the custode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setCustode(OperatorePaleo value) {
        this.custode = value;
    }

    /**
     * Gets the value of the descrizioneClassifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneClassifica() {
        return descrizioneClassifica;
    }

    /**
     * Sets the value of the descrizioneClassifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneClassifica(String value) {
        this.descrizioneClassifica = value;
    }

    /**
     * Gets the value of the descrizioneFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneFascicolo() {
        return descrizioneFascicolo;
    }

    /**
     * Sets the value of the descrizioneFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneFascicolo(String value) {
        this.descrizioneFascicolo = value;
    }

}
