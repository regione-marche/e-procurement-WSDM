//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 04:44:12 PM CET 
//


package it.prisma.getfascicoli.result;

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
 *         &lt;element name="CLASS_COD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASS_DAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FASCICOLO_ANNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FASCICOLO_NUMERO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FASCICOLO_OGGETTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROCEDIMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESPONSABILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATO_FASCICOLO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRIZIONE_STATO_FASCICOLO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFFICIO_COMPETENZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_UFFICIO_COMPETENZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFFICIO_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_UFFICIO_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTENTE_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRIZIONE_UTENTE_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_APERTURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_CHIUSURA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATO_SCARTO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="**"/>
 *               &lt;enumeration value="RR"/>
 *               &lt;enumeration value="CO"/>
 *               &lt;enumeration value="AA"/>
 *               &lt;enumeration value="PS"/>
 *               &lt;enumeration value="SC"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRIZIONE_STATO_SCARTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_STATO_SCARTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_AMMINISTRAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "classcod",
    "classdal",
    "fascicoloanno",
    "fascicolonumero",
    "fascicolooggetto",
    "note",
    "procedimento",
    "responsabile",
    "statofascicolo",
    "descrizionestatofascicolo",
    "ufficiocompetenza",
    "descrizioneufficiocompetenza",
    "ufficiocreazione",
    "descrizioneufficiocreazione",
    "utentecreazione",
    "descrizioneutentecreazione",
    "dataapertura",
    "datachiusura",
    "datacreazione",
    "statoscarto",
    "descrizionestatoscarto",
    "datastatoscarto",
    "codiceamministrazione",
    "codiceaoo"
})
@XmlRootElement(name = "FASCICOLO")
public class FASCICOLO {

    @XmlElement(name = "ID_DOCUMENTO")
    protected String iddocumento;
    @XmlElement(name = "CLASS_COD")
    protected String classcod;
    @XmlElement(name = "CLASS_DAL")
    protected String classdal;
    @XmlElement(name = "FASCICOLO_ANNO")
    protected String fascicoloanno;
    @XmlElement(name = "FASCICOLO_NUMERO")
    protected String fascicolonumero;
    @XmlElement(name = "FASCICOLO_OGGETTO")
    protected String fascicolooggetto;
    @XmlElement(name = "NOTE")
    protected String note;
    @XmlElement(name = "PROCEDIMENTO")
    protected String procedimento;
    @XmlElement(name = "RESPONSABILE")
    protected String responsabile;
    @XmlElement(name = "STATO_FASCICOLO")
    protected String statofascicolo;
    @XmlElement(name = "DESCRIZIONE_STATO_FASCICOLO")
    protected String descrizionestatofascicolo;
    @XmlElement(name = "UFFICIO_COMPETENZA")
    protected String ufficiocompetenza;
    @XmlElement(name = "DESCRIZIONE_UFFICIO_COMPETENZA")
    protected String descrizioneufficiocompetenza;
    @XmlElement(name = "UFFICIO_CREAZIONE")
    protected String ufficiocreazione;
    @XmlElement(name = "DESCRIZIONE_UFFICIO_CREAZIONE")
    protected String descrizioneufficiocreazione;
    @XmlElement(name = "UTENTE_CREAZIONE")
    protected String utentecreazione;
    @XmlElement(name = "DESCRIZIONE_UTENTE_CREAZIONE")
    protected String descrizioneutentecreazione;
    @XmlElement(name = "DATA_APERTURA")
    protected String dataapertura;
    @XmlElement(name = "DATA_CHIUSURA")
    protected String datachiusura;
    @XmlElement(name = "DATA_CREAZIONE")
    protected String datacreazione;
    @XmlElement(name = "STATO_SCARTO")
    protected String statoscarto;
    @XmlElement(name = "DESCRIZIONE_STATO_SCARTO")
    protected String descrizionestatoscarto;
    @XmlElement(name = "DATA_STATO_SCARTO")
    protected String datastatoscarto;
    @XmlElement(name = "CODICE_AMMINISTRAZIONE")
    protected String codiceamministrazione;
    @XmlElement(name = "CODICE_AOO")
    protected String codiceaoo;

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
     * Gets the value of the classdal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSDAL() {
        return classdal;
    }

    /**
     * Sets the value of the classdal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSDAL(String value) {
        this.classdal = value;
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
     * Gets the value of the fascicolonumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLONUMERO() {
        return fascicolonumero;
    }

    /**
     * Sets the value of the fascicolonumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLONUMERO(String value) {
        this.fascicolonumero = value;
    }

    /**
     * Gets the value of the fascicolooggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLOOGGETTO() {
        return fascicolooggetto;
    }

    /**
     * Sets the value of the fascicolooggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLOOGGETTO(String value) {
        this.fascicolooggetto = value;
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
     * Gets the value of the procedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCEDIMENTO() {
        return procedimento;
    }

    /**
     * Sets the value of the procedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCEDIMENTO(String value) {
        this.procedimento = value;
    }

    /**
     * Gets the value of the responsabile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSABILE() {
        return responsabile;
    }

    /**
     * Sets the value of the responsabile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSABILE(String value) {
        this.responsabile = value;
    }

    /**
     * Gets the value of the statofascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATOFASCICOLO() {
        return statofascicolo;
    }

    /**
     * Sets the value of the statofascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATOFASCICOLO(String value) {
        this.statofascicolo = value;
    }

    /**
     * Gets the value of the descrizionestatofascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONESTATOFASCICOLO() {
        return descrizionestatofascicolo;
    }

    /**
     * Sets the value of the descrizionestatofascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONESTATOFASCICOLO(String value) {
        this.descrizionestatofascicolo = value;
    }

    /**
     * Gets the value of the ufficiocompetenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFFICIOCOMPETENZA() {
        return ufficiocompetenza;
    }

    /**
     * Sets the value of the ufficiocompetenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFFICIOCOMPETENZA(String value) {
        this.ufficiocompetenza = value;
    }

    /**
     * Gets the value of the descrizioneufficiocompetenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEUFFICIOCOMPETENZA() {
        return descrizioneufficiocompetenza;
    }

    /**
     * Sets the value of the descrizioneufficiocompetenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEUFFICIOCOMPETENZA(String value) {
        this.descrizioneufficiocompetenza = value;
    }

    /**
     * Gets the value of the ufficiocreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFFICIOCREAZIONE() {
        return ufficiocreazione;
    }

    /**
     * Sets the value of the ufficiocreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFFICIOCREAZIONE(String value) {
        this.ufficiocreazione = value;
    }

    /**
     * Gets the value of the descrizioneufficiocreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEUFFICIOCREAZIONE() {
        return descrizioneufficiocreazione;
    }

    /**
     * Sets the value of the descrizioneufficiocreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEUFFICIOCREAZIONE(String value) {
        this.descrizioneufficiocreazione = value;
    }

    /**
     * Gets the value of the utentecreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTENTECREAZIONE() {
        return utentecreazione;
    }

    /**
     * Sets the value of the utentecreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTENTECREAZIONE(String value) {
        this.utentecreazione = value;
    }

    /**
     * Gets the value of the descrizioneutentecreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONEUTENTECREAZIONE() {
        return descrizioneutentecreazione;
    }

    /**
     * Sets the value of the descrizioneutentecreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONEUTENTECREAZIONE(String value) {
        this.descrizioneutentecreazione = value;
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
     * Gets the value of the datachiusura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACHIUSURA() {
        return datachiusura;
    }

    /**
     * Sets the value of the datachiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACHIUSURA(String value) {
        this.datachiusura = value;
    }

    /**
     * Gets the value of the datacreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACREAZIONE() {
        return datacreazione;
    }

    /**
     * Sets the value of the datacreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACREAZIONE(String value) {
        this.datacreazione = value;
    }

    /**
     * Gets the value of the statoscarto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATOSCARTO() {
        return statoscarto;
    }

    /**
     * Sets the value of the statoscarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATOSCARTO(String value) {
        this.statoscarto = value;
    }

    /**
     * Gets the value of the descrizionestatoscarto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIZIONESTATOSCARTO() {
        return descrizionestatoscarto;
    }

    /**
     * Sets the value of the descrizionestatoscarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIZIONESTATOSCARTO(String value) {
        this.descrizionestatoscarto = value;
    }

    /**
     * Gets the value of the datastatoscarto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASTATOSCARTO() {
        return datastatoscarto;
    }

    /**
     * Sets the value of the datastatoscarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASTATOSCARTO(String value) {
        this.datastatoscarto = value;
    }

    /**
     * Gets the value of the codiceamministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEAMMINISTRAZIONE() {
        return codiceamministrazione;
    }

    /**
     * Sets the value of the codiceamministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEAMMINISTRAZIONE(String value) {
        this.codiceamministrazione = value;
    }

    /**
     * Gets the value of the codiceaoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEAOO() {
        return codiceaoo;
    }

    /**
     * Sets the value of the codiceaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEAOO(String value) {
        this.codiceaoo = value;
    }

}
