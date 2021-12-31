//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 04:44:12 PM CET 
//


package it.prisma.getfascicoli;

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
 *         &lt;choice>
 *           &lt;element name="FASCICOLO_NUMERO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;group ref="{}FASCICOLO_NUMERO_GRUPPO"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="FASCICOLO_ANNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;group ref="{}FASCICOLO_ANNO_GRUPPO"/>
 *         &lt;/choice>
 *         &lt;element name="FASCICOLO_OGGETTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="STATO_FASCICOLO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UFFICIO_COMPETENZA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFFICIO_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTENTE_CREAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATA_APERTURA_DAL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_APERTURA_AL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_STATO_SCARTO_DAL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_STATO_SCARTO_AL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_CHIUSURA_DAL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_CHIUSURA_AL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_CREAZIONE_DAL" type="{}DateType" minOccurs="0"/>
 *         &lt;element name="DATA_CREAZIONE_AL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_AMMINISTRAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE_AOO" type="{}DateType" minOccurs="0"/>
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
    "fascicolonumero",
    "fascicolonumerodal",
    "fascicolonumeroal",
    "fascicoloanno",
    "fascicoloannodal",
    "fascicoloannoal",
    "fascicolooggetto",
    "note",
    "statoscarto",
    "statofascicolo",
    "ufficiocompetenza",
    "ufficiocreazione",
    "utentecreazione",
    "dataaperturadal",
    "dataaperturaal",
    "datastatoscartodal",
    "datastatoscartoal",
    "datachiusuradal",
    "datachiusuraal",
    "datacreazionedal",
    "datacreazioneal",
    "codiceamministrazione",
    "codiceaoo",
    "utente"
})
@XmlRootElement(name = "ROOT")
public class ROOT {

    @XmlElement(name = "CLASS_COD", required = true)
    protected String classcod;
    @XmlElement(name = "FASCICOLO_NUMERO")
    protected String fascicolonumero;
    @XmlElement(name = "FASCICOLO_NUMERO_DAL")
    protected String fascicolonumerodal;
    @XmlElement(name = "FASCICOLO_NUMERO_AL")
    protected String fascicolonumeroal;
    @XmlElement(name = "FASCICOLO_ANNO")
    protected String fascicoloanno;
    @XmlElement(name = "FASCICOLO_ANNO_DAL")
    protected String fascicoloannodal;
    @XmlElement(name = "FASCICOLO_ANNO_AL")
    protected String fascicoloannoal;
    @XmlElement(name = "FASCICOLO_OGGETTO")
    protected String fascicolooggetto;
    @XmlElement(name = "NOTE")
    protected String note;
    @XmlElement(name = "STATO_SCARTO")
    protected String statoscarto;
    @XmlElement(name = "STATO_FASCICOLO")
    protected String statofascicolo;
    @XmlElement(name = "UFFICIO_COMPETENZA")
    protected String ufficiocompetenza;
    @XmlElement(name = "UFFICIO_CREAZIONE")
    protected String ufficiocreazione;
    @XmlElement(name = "UTENTE_CREAZIONE")
    protected String utentecreazione;
    @XmlElement(name = "DATA_APERTURA_DAL")
    protected String dataaperturadal;
    @XmlElement(name = "DATA_APERTURA_AL")
    protected String dataaperturaal;
    @XmlElement(name = "DATA_STATO_SCARTO_DAL")
    protected String datastatoscartodal;
    @XmlElement(name = "DATA_STATO_SCARTO_AL")
    protected String datastatoscartoal;
    @XmlElement(name = "DATA_CHIUSURA_DAL")
    protected String datachiusuradal;
    @XmlElement(name = "DATA_CHIUSURA_AL")
    protected String datachiusuraal;
    @XmlElement(name = "DATA_CREAZIONE_DAL")
    protected String datacreazionedal;
    @XmlElement(name = "DATA_CREAZIONE_AL")
    protected String datacreazioneal;
    @XmlElement(name = "CODICE_AMMINISTRAZIONE")
    protected String codiceamministrazione;
    @XmlElement(name = "CODICE_AOO")
    protected String codiceaoo;
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
     * Gets the value of the fascicolonumerodal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLONUMERODAL() {
        return fascicolonumerodal;
    }

    /**
     * Sets the value of the fascicolonumerodal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLONUMERODAL(String value) {
        this.fascicolonumerodal = value;
    }

    /**
     * Gets the value of the fascicolonumeroal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLONUMEROAL() {
        return fascicolonumeroal;
    }

    /**
     * Sets the value of the fascicolonumeroal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLONUMEROAL(String value) {
        this.fascicolonumeroal = value;
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
     * Gets the value of the fascicoloannodal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLOANNODAL() {
        return fascicoloannodal;
    }

    /**
     * Sets the value of the fascicoloannodal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLOANNODAL(String value) {
        this.fascicoloannodal = value;
    }

    /**
     * Gets the value of the fascicoloannoal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICOLOANNOAL() {
        return fascicoloannoal;
    }

    /**
     * Sets the value of the fascicoloannoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICOLOANNOAL(String value) {
        this.fascicoloannoal = value;
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
     * Gets the value of the dataaperturadal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAAPERTURADAL() {
        return dataaperturadal;
    }

    /**
     * Sets the value of the dataaperturadal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAAPERTURADAL(String value) {
        this.dataaperturadal = value;
    }

    /**
     * Gets the value of the dataaperturaal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAAPERTURAAL() {
        return dataaperturaal;
    }

    /**
     * Sets the value of the dataaperturaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAAPERTURAAL(String value) {
        this.dataaperturaal = value;
    }

    /**
     * Gets the value of the datastatoscartodal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASTATOSCARTODAL() {
        return datastatoscartodal;
    }

    /**
     * Sets the value of the datastatoscartodal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASTATOSCARTODAL(String value) {
        this.datastatoscartodal = value;
    }

    /**
     * Gets the value of the datastatoscartoal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASTATOSCARTOAL() {
        return datastatoscartoal;
    }

    /**
     * Sets the value of the datastatoscartoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASTATOSCARTOAL(String value) {
        this.datastatoscartoal = value;
    }

    /**
     * Gets the value of the datachiusuradal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACHIUSURADAL() {
        return datachiusuradal;
    }

    /**
     * Sets the value of the datachiusuradal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACHIUSURADAL(String value) {
        this.datachiusuradal = value;
    }

    /**
     * Gets the value of the datachiusuraal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACHIUSURAAL() {
        return datachiusuraal;
    }

    /**
     * Sets the value of the datachiusuraal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACHIUSURAAL(String value) {
        this.datachiusuraal = value;
    }

    /**
     * Gets the value of the datacreazionedal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACREAZIONEDAL() {
        return datacreazionedal;
    }

    /**
     * Sets the value of the datacreazionedal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACREAZIONEDAL(String value) {
        this.datacreazionedal = value;
    }

    /**
     * Gets the value of the datacreazioneal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACREAZIONEAL() {
        return datacreazioneal;
    }

    /**
     * Sets the value of the datacreazioneal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACREAZIONEAL(String value) {
        this.datacreazioneal = value;
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