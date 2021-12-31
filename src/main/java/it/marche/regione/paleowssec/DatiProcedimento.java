
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiProcedimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiProcedimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceTipoProcedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroProcedimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatoProcedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiProcedimento", propOrder = {
    "codiceTipoProcedimento",
    "numeroProcedimento",
    "statoProcedimento"
})
public class DatiProcedimento {

    @XmlElement(name = "CodiceTipoProcedimento", nillable = true)
    protected String codiceTipoProcedimento;
    @XmlElement(name = "NumeroProcedimento", nillable = true)
    protected Integer numeroProcedimento;
    @XmlElement(name = "StatoProcedimento", nillable = true)
    protected String statoProcedimento;

    /**
     * Gets the value of the codiceTipoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTipoProcedimento() {
        return codiceTipoProcedimento;
    }

    /**
     * Sets the value of the codiceTipoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTipoProcedimento(String value) {
        this.codiceTipoProcedimento = value;
    }

    /**
     * Gets the value of the numeroProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroProcedimento() {
        return numeroProcedimento;
    }

    /**
     * Sets the value of the numeroProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroProcedimento(Integer value) {
        this.numeroProcedimento = value;
    }

    /**
     * Gets the value of the statoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoProcedimento() {
        return statoProcedimento;
    }

    /**
     * Sets the value of the statoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoProcedimento(String value) {
        this.statoProcedimento = value;
    }

}
