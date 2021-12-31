
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceAmmSoggetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAOOSoggetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceAOO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codiceAmmSoggetto",
    "codiceAOOSoggetto",
    "codiceAmministrazione",
    "codiceAOO"
})
@XmlRootElement(name = "RicercaAmministrazioneMultiDB")
public class RicercaAmministrazioneMultiDB {

    @XmlElement(name = "CodiceAmmSoggetto", required = true)
    protected String codiceAmmSoggetto;
    @XmlElement(name = "CodiceAOOSoggetto", required = true)
    protected String codiceAOOSoggetto;
    @XmlElement(name = "CodiceAmministrazione", required = true)
    protected String codiceAmministrazione;
    @XmlElement(name = "CodiceAOO", required = true)
    protected String codiceAOO;

    /**
     * Gets the value of the codiceAmmSoggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAmmSoggetto() {
        return codiceAmmSoggetto;
    }

    /**
     * Sets the value of the codiceAmmSoggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAmmSoggetto(String value) {
        this.codiceAmmSoggetto = value;
    }

    /**
     * Gets the value of the codiceAOOSoggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAOOSoggetto() {
        return codiceAOOSoggetto;
    }

    /**
     * Sets the value of the codiceAOOSoggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAOOSoggetto(String value) {
        this.codiceAOOSoggetto = value;
    }

    /**
     * Gets the value of the codiceAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAmministrazione() {
        return codiceAmministrazione;
    }

    /**
     * Sets the value of the codiceAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAmministrazione(String value) {
        this.codiceAmministrazione = value;
    }

    /**
     * Gets the value of the codiceAOO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAOO() {
        return codiceAOO;
    }

    /**
     * Sets the value of the codiceAOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAOO(String value) {
        this.codiceAOO = value;
    }

}
