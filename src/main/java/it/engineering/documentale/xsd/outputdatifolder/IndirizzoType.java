//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatifolder;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndirizzoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndirizzoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Toponimo" type="{}ToponimoType" minOccurs="0"/>
 *         &lt;element name="Civico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piano" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Localita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ComuneIndirizzo" type="{}ComuneItalianoType" minOccurs="0"/>
 *         &lt;element name="NomeCittaEstera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatoIndirizzo" type="{}StatoNazionaleType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirizzoType", propOrder = {

})
public class IndirizzoType {

    @XmlElement(name = "Toponimo")
    protected ToponimoType toponimo;
    @XmlElement(name = "Civico")
    protected String civico;
    @XmlElement(name = "Interno")
    protected String interno;
    @XmlElement(name = "Scala")
    protected String scala;
    @XmlElement(name = "Piano")
    protected BigInteger piano;
    @XmlElement(name = "Localita")
    protected String localita;
    @XmlElement(name = "CAP")
    protected String cap;
    @XmlElement(name = "ComuneIndirizzo")
    protected ComuneItalianoType comuneIndirizzo;
    @XmlElement(name = "NomeCittaEstera")
    protected String nomeCittaEstera;
    @XmlElement(name = "StatoIndirizzo")
    protected StatoNazionaleType statoIndirizzo;

    /**
     * Gets the value of the toponimo property.
     * 
     * @return
     *     possible object is
     *     {@link ToponimoType }
     *     
     */
    public ToponimoType getToponimo() {
        return toponimo;
    }

    /**
     * Sets the value of the toponimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToponimoType }
     *     
     */
    public void setToponimo(ToponimoType value) {
        this.toponimo = value;
    }

    /**
     * Gets the value of the civico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivico() {
        return civico;
    }

    /**
     * Sets the value of the civico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivico(String value) {
        this.civico = value;
    }

    /**
     * Gets the value of the interno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterno() {
        return interno;
    }

    /**
     * Sets the value of the interno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterno(String value) {
        this.interno = value;
    }

    /**
     * Gets the value of the scala property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScala() {
        return scala;
    }

    /**
     * Sets the value of the scala property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScala(String value) {
        this.scala = value;
    }

    /**
     * Gets the value of the piano property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPiano() {
        return piano;
    }

    /**
     * Sets the value of the piano property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPiano(BigInteger value) {
        this.piano = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalita() {
        return localita;
    }

    /**
     * Sets the value of the localita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalita(String value) {
        this.localita = value;
    }

    /**
     * Gets the value of the cap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Sets the value of the cap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAP(String value) {
        this.cap = value;
    }

    /**
     * Gets the value of the comuneIndirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link ComuneItalianoType }
     *     
     */
    public ComuneItalianoType getComuneIndirizzo() {
        return comuneIndirizzo;
    }

    /**
     * Sets the value of the comuneIndirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComuneItalianoType }
     *     
     */
    public void setComuneIndirizzo(ComuneItalianoType value) {
        this.comuneIndirizzo = value;
    }

    /**
     * Gets the value of the nomeCittaEstera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCittaEstera() {
        return nomeCittaEstera;
    }

    /**
     * Sets the value of the nomeCittaEstera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCittaEstera(String value) {
        this.nomeCittaEstera = value;
    }

    /**
     * Gets the value of the statoIndirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link StatoNazionaleType }
     *     
     */
    public StatoNazionaleType getStatoIndirizzo() {
        return statoIndirizzo;
    }

    /**
     * Sets the value of the statoIndirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoNazionaleType }
     *     
     */
    public void setStatoIndirizzo(StatoNazionaleType value) {
        this.statoIndirizzo = value;
    }

}
