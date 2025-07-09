
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common_tipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for PAEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DenominazioneAmministrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DenominazioneUfficio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirizziDigitaliDiRiferimento" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAEType", propOrder = {
    "denominazioneAmministrazione",
    "denominazioneUfficio",
    "indirizziDigitaliDiRiferimento"
})
public class PAEType {

    @XmlElement(name = "DenominazioneAmministrazione", nillable = true)
    protected String denominazioneAmministrazione;
    @XmlElement(name = "DenominazioneUfficio", nillable = true)
    protected String denominazioneUfficio;
    @XmlElement(name = "IndirizziDigitaliDiRiferimento", nillable = true)
    protected ArrayOfstring indirizziDigitaliDiRiferimento;

    /**
     * Gets the value of the denominazioneAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneAmministrazione() {
        return denominazioneAmministrazione;
    }

    /**
     * Sets the value of the denominazioneAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneAmministrazione(String value) {
        this.denominazioneAmministrazione = value;
    }

    /**
     * Gets the value of the denominazioneUfficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneUfficio() {
        return denominazioneUfficio;
    }

    /**
     * Sets the value of the denominazioneUfficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneUfficio(String value) {
        this.denominazioneUfficio = value;
    }

    /**
     * Gets the value of the indirizziDigitaliDiRiferimento property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getIndirizziDigitaliDiRiferimento() {
        return indirizziDigitaliDiRiferimento;
    }

    /**
     * Sets the value of the indirizziDigitaliDiRiferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setIndirizziDigitaliDiRiferimento(ArrayOfstring value) {
        this.indirizziDigitaliDiRiferimento = value;
    }

}
