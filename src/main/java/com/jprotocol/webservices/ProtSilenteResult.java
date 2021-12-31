
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protSilenteResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protSilenteResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoProt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="annoRep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codErrore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataOraProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRepertorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protSilenteResult", propOrder = {
    "annoProt",
    "annoRep",
    "codErrore",
    "dataOraProtocollo",
    "desErrore",
    "numeroProtocollo",
    "numeroRepertorio",
    "serieRep"
})
public class ProtSilenteResult {

    protected int annoProt;
    protected int annoRep;
    protected int codErrore;
    protected String dataOraProtocollo;
    protected String desErrore;
    protected String numeroProtocollo;
    protected String numeroRepertorio;
    protected String serieRep;

    /**
     * Gets the value of the annoProt property.
     * 
     */
    public int getAnnoProt() {
        return annoProt;
    }

    /**
     * Sets the value of the annoProt property.
     * 
     */
    public void setAnnoProt(int value) {
        this.annoProt = value;
    }

    /**
     * Gets the value of the annoRep property.
     * 
     */
    public int getAnnoRep() {
        return annoRep;
    }

    /**
     * Sets the value of the annoRep property.
     * 
     */
    public void setAnnoRep(int value) {
        this.annoRep = value;
    }

    /**
     * Gets the value of the codErrore property.
     * 
     */
    public int getCodErrore() {
        return codErrore;
    }

    /**
     * Sets the value of the codErrore property.
     * 
     */
    public void setCodErrore(int value) {
        this.codErrore = value;
    }

    /**
     * Gets the value of the dataOraProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOraProtocollo() {
        return dataOraProtocollo;
    }

    /**
     * Sets the value of the dataOraProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOraProtocollo(String value) {
        this.dataOraProtocollo = value;
    }

    /**
     * Gets the value of the desErrore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesErrore() {
        return desErrore;
    }

    /**
     * Sets the value of the desErrore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesErrore(String value) {
        this.desErrore = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocollo(String value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the numeroRepertorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRepertorio() {
        return numeroRepertorio;
    }

    /**
     * Sets the value of the numeroRepertorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRepertorio(String value) {
        this.numeroRepertorio = value;
    }

    /**
     * Gets the value of the serieRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieRep() {
        return serieRep;
    }

    /**
     * Sets the value of the serieRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieRep(String value) {
        this.serieRep = value;
    }

}
