
package it.infor.JProtocolloGenServices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paginazioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paginazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inizioPag" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dimensionePag" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paginazioneType", propOrder = {
    "inizioPag",
    "dimensionePag"
})
@XmlSeeAlso({
    DatiRicercaType.class,
    DatiVisualizzazioneType.class,
    DatiRicercaAnagraficaType.class
})
public class PaginazioneType {

    @XmlElement(required = true)
    protected BigInteger inizioPag;
    protected BigInteger dimensionePag;

    /**
     * Gets the value of the inizioPag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInizioPag() {
        return inizioPag;
    }

    /**
     * Sets the value of the inizioPag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInizioPag(BigInteger value) {
        this.inizioPag = value;
    }

    /**
     * Gets the value of the dimensionePag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimensionePag() {
        return dimensionePag;
    }

    /**
     * Sets the value of the dimensionePag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimensionePag(BigInteger value) {
        this.dimensionePag = value;
    }

}
