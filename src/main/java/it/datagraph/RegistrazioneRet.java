
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrazioneRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrazioneRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Registrazione" type="{}Segnatura" minOccurs="0"/>
 *         &lt;element name="lngErrNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="strErrString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrazioneRet", propOrder = {
    "registrazione",
    "lngErrNumber",
    "strErrString"
})
public class RegistrazioneRet {

    @XmlElement(name = "Registrazione")
    protected Segnatura registrazione;
    protected long lngErrNumber;
    protected String strErrString;

    /**
     * Gets the value of the registrazione property.
     * 
     * @return
     *     possible object is
     *     {@link Segnatura }
     *     
     */
    public Segnatura getRegistrazione() {
        return registrazione;
    }

    /**
     * Sets the value of the registrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Segnatura }
     *     
     */
    public void setRegistrazione(Segnatura value) {
        this.registrazione = value;
    }

    /**
     * Gets the value of the lngErrNumber property.
     * 
     */
    public long getLngErrNumber() {
        return lngErrNumber;
    }

    /**
     * Sets the value of the lngErrNumber property.
     * 
     */
    public void setLngErrNumber(long value) {
        this.lngErrNumber = value;
    }

    /**
     * Gets the value of the strErrString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrErrString() {
        return strErrString;
    }

    /**
     * Sets the value of the strErrString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrErrString(String value) {
        this.strErrString = value;
    }

}
