//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 04:44:13 PM CET 
//


package it.prisma.creafascicolo;

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
 *         &lt;element name="CLASS_COD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FASCICOLO_ANNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FASCICOLO_ANNO_PADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FASCICOLO_NUMERO_PADRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_APERTURA" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="OGGETTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNITA_COMPETENZA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UNITA_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "classcod",
    "fascicoloanno",
    "fascicoloannopadre",
    "fascicolonumeropadre",
    "dataapertura",
    "oggetto",
    "unitacompetenza",
    "unitacreazione",
    "note",
    "utente"
})
@XmlRootElement(name = "ROOT")
public class ROOT {

    @XmlElement(name = "CLASS_COD", required = true)
    protected String classcod;
    @XmlElement(name = "FASCICOLO_ANNO", required = true)
    protected String fascicoloanno;
    @XmlElement(name = "FASCICOLO_ANNO_PADRE")
    protected String fascicoloannopadre;
    @XmlElement(name = "FASCICOLO_NUMERO_PADRE")
    protected String fascicolonumeropadre;
    @XmlElement(name = "DATA_APERTURA")
    protected String dataapertura;
    @XmlElement(name = "OGGETTO", required = true)
    protected String oggetto;
    @XmlElement(name = "UNITA_COMPETENZA", required = true)
    protected String unitacompetenza;
    @XmlElement(name = "UNITA_CREAZIONE", required = true)
    protected String unitacreazione;
    @XmlElement(name = "NOTE")
    protected String note;
    @XmlElement(name = "UTENTE", required = true)
    protected String utente;

    /**
     * Gets the value of the classcod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSCOD() {
        return classcod;
    }

    /**
     * Sets the value of the classcod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSCOD(String value) {
        this.classcod = value;
    }

    /**
     * Gets the value of the fascicoloanno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLOANNO() {
        return fascicoloanno;
    }

    /**
     * Sets the value of the fascicoloanno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLOANNO(String value) {
        this.fascicoloanno = value;
    }

    /**
     * Gets the value of the fascicoloannopadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLOANNOPADRE() {
        return fascicoloannopadre;
    }

    /**
     * Sets the value of the fascicoloannopadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLOANNOPADRE(String value) {
        this.fascicoloannopadre = value;
    }

    /**
     * Gets the value of the fascicolonumeropadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLONUMEROPADRE() {
        return fascicolonumeropadre;
    }

    /**
     * Sets the value of the fascicolonumeropadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLONUMEROPADRE(String value) {
        this.fascicolonumeropadre = value;
    }

    /**
     * Gets the value of the dataapertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAAPERTURA() {
        return dataapertura;
    }

    /**
     * Sets the value of the dataapertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAAPERTURA(String value) {
        this.dataapertura = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGGETTO() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGGETTO(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the unitacompetenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITACOMPETENZA() {
        return unitacompetenza;
    }

    /**
     * Sets the value of the unitacompetenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITACOMPETENZA(String value) {
        this.unitacompetenza = value;
    }

    /**
     * Gets the value of the unitacreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITACREAZIONE() {
        return unitacreazione;
    }

    /**
     * Sets the value of the unitacreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITACREAZIONE(String value) {
        this.unitacreazione = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTE(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTENTE(String value) {
        this.utente = value;
    }

}
