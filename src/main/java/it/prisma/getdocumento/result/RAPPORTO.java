//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 04:44:12 PM CET 
//


package it.prisma.getdocumento.result;

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
 *         &lt;element name="ID_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COGNOME_NOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_FISCALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DENOMINAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDRIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONOSCENZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_AMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD_UO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_AMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "iddocumento",
    "cognomenome",
    "codicefiscale",
    "email",
    "denominazione",
    "indirizzo",
    "cap",
    "idrif",
    "conoscenza",
    "codamm",
    "codaoo",
    "coduo",
    "descrizioneamm",
    "descrizioneaoo"
})
@XmlRootElement(name = "RAPPORTO")
public class RAPPORTO {

    @XmlElement(name = "ID_DOCUMENTO")
    protected String iddocumento;
    @XmlElement(name = "COGNOME_NOME")
    protected String cognomenome;
    @XmlElement(name = "CODICE_FISCALE")
    protected String codicefiscale;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "DENOMINAZIONE")
    protected String denominazione;
    @XmlElement(name = "INDIRIZZO")
    protected String indirizzo;
    @XmlElement(name = "CAP")
    protected String cap;
    @XmlElement(name = "IDRIF")
    protected String idrif;
    @XmlElement(name = "CONOSCENZA")
    protected String conoscenza;
    @XmlElement(name = "COD_AMM")
    protected String codamm;
    @XmlElement(name = "COD_AOO")
    protected String codaoo;
    @XmlElement(name = "COD_UO")
    protected String coduo;
    @XmlElement(name = "DESCRIZIONE_AMM")
    protected String descrizioneamm;
    @XmlElement(name = "DESCRIZIONE_AOO")
    protected String descrizioneaoo;

    /**
     * Gets the value of the iddocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDOCUMENTO() {
        return iddocumento;
    }

    /**
     * Sets the value of the iddocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDOCUMENTO(String value) {
        this.iddocumento = value;
    }

    /**
     * Gets the value of the cognomenome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOGNOMENOME() {
        return cognomenome;
    }

    /**
     * Sets the value of the cognomenome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOGNOMENOME(String value) {
        this.cognomenome = value;
    }

    /**
     * Gets the value of the codicefiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEFISCALE() {
        return codicefiscale;
    }

    /**
     * Sets the value of the codicefiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEFISCALE(String value) {
        this.codicefiscale = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMINAZIONE() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMINAZIONE(String value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDIRIZZO() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDIRIZZO(String value) {
        this.indirizzo = value;
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
     * Gets the value of the idrif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRIF() {
        return idrif;
    }

    /**
     * Sets the value of the idrif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRIF(String value) {
        this.idrif = value;
    }

    /**
     * Gets the value of the conoscenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONOSCENZA() {
        return conoscenza;
    }

    /**
     * Sets the value of the conoscenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONOSCENZA(String value) {
        this.conoscenza = value;
    }

    /**
     * Gets the value of the codamm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAMM() {
        return codamm;
    }

    /**
     * Sets the value of the codamm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAMM(String value) {
        this.codamm = value;
    }

    /**
     * Gets the value of the codaoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAOO() {
        return codaoo;
    }

    /**
     * Sets the value of the codaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAOO(String value) {
        this.codaoo = value;
    }

    /**
     * Gets the value of the coduo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODUO() {
        return coduo;
    }

    /**
     * Sets the value of the coduo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODUO(String value) {
        this.coduo = value;
    }

    /**
     * Gets the value of the descrizioneamm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEAMM() {
        return descrizioneamm;
    }

    /**
     * Sets the value of the descrizioneamm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEAMM(String value) {
        this.descrizioneamm = value;
    }

    /**
     * Gets the value of the descrizioneaoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEAOO() {
        return descrizioneaoo;
    }

    /**
     * Sets the value of the descrizioneaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEAOO(String value) {
        this.descrizioneaoo = value;
    }

}
