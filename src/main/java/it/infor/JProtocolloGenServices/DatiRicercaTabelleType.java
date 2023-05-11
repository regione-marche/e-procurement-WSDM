
package it.infor.JProtocolloGenServices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRicercaTabelleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRicercaTabelleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cercaSoloValidi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inizioPag" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "datiRicercaTabelleType", propOrder = {
    "cercaSoloValidi",
    "inizioPag",
    "dimensionePag"
})
public class DatiRicercaTabelleType {

    protected Boolean cercaSoloValidi;
    protected BigInteger inizioPag;
    protected BigInteger dimensionePag;

    /**
     * Gets the value of the cercaSoloValidi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCercaSoloValidi() {
        return cercaSoloValidi;
    }

    /**
     * Sets the value of the cercaSoloValidi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCercaSoloValidi(Boolean value) {
        this.cercaSoloValidi = value;
    }

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
