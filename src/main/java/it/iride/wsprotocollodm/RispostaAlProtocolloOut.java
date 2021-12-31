
package it.iride.wsprotocollodm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RispostaAlProtocolloOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RispostaAlProtocolloOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroRegistrazioneRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataRegistrazioneRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RispostaAlProtocolloOut", propOrder = {
    "numeroRegistrazioneRP",
    "dataRegistrazioneRP",
    "tipoRP"
})
public class RispostaAlProtocolloOut {

    @XmlElement(name = "NumeroRegistrazioneRP")
    protected String numeroRegistrazioneRP;
    @XmlElement(name = "DataRegistrazioneRP")
    protected String dataRegistrazioneRP;
    @XmlElement(name = "TipoRP")
    protected String tipoRP;

    /**
     * Gets the value of the numeroRegistrazioneRP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistrazioneRP() {
        return numeroRegistrazioneRP;
    }

    /**
     * Sets the value of the numeroRegistrazioneRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistrazioneRP(String value) {
        this.numeroRegistrazioneRP = value;
    }

    /**
     * Gets the value of the dataRegistrazioneRP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistrazioneRP() {
        return dataRegistrazioneRP;
    }

    /**
     * Sets the value of the dataRegistrazioneRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistrazioneRP(String value) {
        this.dataRegistrazioneRP = value;
    }

    /**
     * Gets the value of the tipoRP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRP() {
        return tipoRP;
    }

    /**
     * Sets the value of the tipoRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRP(String value) {
        this.tipoRP = value;
    }

}
