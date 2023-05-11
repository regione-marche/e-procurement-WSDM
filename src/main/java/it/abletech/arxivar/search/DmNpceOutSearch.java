
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_NpceOut_Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_NpceOut_Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Base_Search">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DOC_NUMBER" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATA_INVIO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATA_INVIO_RICHIESTO" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="DATA_AUTORIZZAZIONE" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="UTENTE_INVIO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="UTENTE_AUTORIZZAZIONE" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="DESTINATARIO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="LOCALITA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PROVINCIA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NAZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="USA_MITTENTE_PREDEFINITO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="MITTENTE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="M_INDIRIZZO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="M_LOCALITA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="M_CAP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="M_PROVINCIA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="M_NAZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATO_LAYOUT" type="{http://www.Abletech.it/Arxivar}Field_BitComparison" minOccurs="0"/>
 *         &lt;element name="NPCE_TIPO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NPCE_ID_RICHIESTA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NPCE_GUID_UTENTE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NPCE_ID_ORDINE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NPCE_NUMERO_RACCOMANDATA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="COSTO" type="{http://www.Abletech.it/Arxivar}Field_Double" minOccurs="0"/>
 *         &lt;element name="DETTAGLIO_COSTI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOTE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="RICEVUTA_DI_RITORNO" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Dm_Rubrica" type="{http://www.Abletech.it/Arxivar}Join_Dm_Rubrica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_NpceOut_Search", propOrder = {
    "id",
    "docnumber",
    "data",
    "datainvio",
    "datainviorichiesto",
    "dataautorizzazione",
    "utenteinvio",
    "utenteautorizzazione",
    "destinatario",
    "indirizzo",
    "localita",
    "cap",
    "provincia",
    "nazione",
    "usamittentepredefinito",
    "mittente",
    "mindirizzo",
    "mlocalita",
    "mcap",
    "mprovincia",
    "mnazione",
    "stato",
    "statolayout",
    "npcetipo",
    "npceidrichiesta",
    "npceguidutente",
    "npceidordine",
    "npcenumeroraccomandata",
    "costo",
    "dettagliocosti",
    "note",
    "ricevutadiritorno",
    "dmRubrica"
})
public class DmNpceOutSearch
    extends DmBaseSearch
{

    @XmlElement(name = "ID")
    protected FieldInt id;
    @XmlElement(name = "DOC_NUMBER")
    protected FieldInt docnumber;
    @XmlElement(name = "DATA")
    protected FieldDateTime data;
    @XmlElement(name = "DATA_INVIO")
    protected FieldDateTime datainvio;
    @XmlElement(name = "DATA_INVIO_RICHIESTO")
    protected FieldDateTime datainviorichiesto;
    @XmlElement(name = "DATA_AUTORIZZAZIONE")
    protected FieldDateTime dataautorizzazione;
    @XmlElement(name = "UTENTE_INVIO")
    protected FieldInt utenteinvio;
    @XmlElement(name = "UTENTE_AUTORIZZAZIONE")
    protected FieldInt utenteautorizzazione;
    @XmlElement(name = "DESTINATARIO")
    protected FieldString destinatario;
    @XmlElement(name = "INDIRIZZO")
    protected FieldString indirizzo;
    @XmlElement(name = "LOCALITA")
    protected FieldString localita;
    @XmlElement(name = "CAP")
    protected FieldString cap;
    @XmlElement(name = "PROVINCIA")
    protected FieldString provincia;
    @XmlElement(name = "NAZIONE")
    protected FieldString nazione;
    @XmlElement(name = "USA_MITTENTE_PREDEFINITO")
    protected FieldInt usamittentepredefinito;
    @XmlElement(name = "MITTENTE")
    protected FieldString mittente;
    @XmlElement(name = "M_INDIRIZZO")
    protected FieldString mindirizzo;
    @XmlElement(name = "M_LOCALITA")
    protected FieldString mlocalita;
    @XmlElement(name = "M_CAP")
    protected FieldString mcap;
    @XmlElement(name = "M_PROVINCIA")
    protected FieldString mprovincia;
    @XmlElement(name = "M_NAZIONE")
    protected FieldString mnazione;
    @XmlElement(name = "STATO")
    protected FieldString stato;
    @XmlElement(name = "STATO_LAYOUT")
    protected FieldBitComparison statolayout;
    @XmlElement(name = "NPCE_TIPO")
    protected FieldString npcetipo;
    @XmlElement(name = "NPCE_ID_RICHIESTA")
    protected FieldString npceidrichiesta;
    @XmlElement(name = "NPCE_GUID_UTENTE")
    protected FieldString npceguidutente;
    @XmlElement(name = "NPCE_ID_ORDINE")
    protected FieldString npceidordine;
    @XmlElement(name = "NPCE_NUMERO_RACCOMANDATA")
    protected FieldString npcenumeroraccomandata;
    @XmlElement(name = "COSTO")
    protected FieldDouble costo;
    @XmlElement(name = "DETTAGLIO_COSTI")
    protected FieldString dettagliocosti;
    @XmlElement(name = "NOTE")
    protected FieldString note;
    @XmlElement(name = "RICEVUTA_DI_RITORNO")
    protected FieldInt ricevutadiritorno;
    @XmlElement(name = "Dm_Rubrica")
    protected JoinDmRubrica dmRubrica;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setID(FieldInt value) {
        this.id = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setDOCNUMBER(FieldInt value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATA() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATA(FieldDateTime value) {
        this.data = value;
    }

    /**
     * Gets the value of the datainvio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAINVIO() {
        return datainvio;
    }

    /**
     * Sets the value of the datainvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAINVIO(FieldDateTime value) {
        this.datainvio = value;
    }

    /**
     * Gets the value of the datainviorichiesto property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAINVIORICHIESTO() {
        return datainviorichiesto;
    }

    /**
     * Sets the value of the datainviorichiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAINVIORICHIESTO(FieldDateTime value) {
        this.datainviorichiesto = value;
    }

    /**
     * Gets the value of the dataautorizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDATAAUTORIZZAZIONE() {
        return dataautorizzazione;
    }

    /**
     * Sets the value of the dataautorizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDATAAUTORIZZAZIONE(FieldDateTime value) {
        this.dataautorizzazione = value;
    }

    /**
     * Gets the value of the utenteinvio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTEINVIO() {
        return utenteinvio;
    }

    /**
     * Sets the value of the utenteinvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTEINVIO(FieldInt value) {
        this.utenteinvio = value;
    }

    /**
     * Gets the value of the utenteautorizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUTENTEAUTORIZZAZIONE() {
        return utenteautorizzazione;
    }

    /**
     * Sets the value of the utenteautorizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUTENTEAUTORIZZAZIONE(FieldInt value) {
        this.utenteautorizzazione = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDESTINATARIO() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDESTINATARIO(FieldString value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getINDIRIZZO() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setINDIRIZZO(FieldString value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLOCALITA() {
        return localita;
    }

    /**
     * Sets the value of the localita property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLOCALITA(FieldString value) {
        this.localita = value;
    }

    /**
     * Gets the value of the cap property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCAP() {
        return cap;
    }

    /**
     * Sets the value of the cap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCAP(FieldString value) {
        this.cap = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPROVINCIA() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPROVINCIA(FieldString value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the nazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNAZIONE() {
        return nazione;
    }

    /**
     * Sets the value of the nazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNAZIONE(FieldString value) {
        this.nazione = value;
    }

    /**
     * Gets the value of the usamittentepredefinito property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUSAMITTENTEPREDEFINITO() {
        return usamittentepredefinito;
    }

    /**
     * Sets the value of the usamittentepredefinito property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUSAMITTENTEPREDEFINITO(FieldInt value) {
        this.usamittentepredefinito = value;
    }

    /**
     * Gets the value of the mittente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMITTENTE() {
        return mittente;
    }

    /**
     * Sets the value of the mittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMITTENTE(FieldString value) {
        this.mittente = value;
    }

    /**
     * Gets the value of the mindirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMINDIRIZZO() {
        return mindirizzo;
    }

    /**
     * Sets the value of the mindirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMINDIRIZZO(FieldString value) {
        this.mindirizzo = value;
    }

    /**
     * Gets the value of the mlocalita property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMLOCALITA() {
        return mlocalita;
    }

    /**
     * Sets the value of the mlocalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMLOCALITA(FieldString value) {
        this.mlocalita = value;
    }

    /**
     * Gets the value of the mcap property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMCAP() {
        return mcap;
    }

    /**
     * Sets the value of the mcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMCAP(FieldString value) {
        this.mcap = value;
    }

    /**
     * Gets the value of the mprovincia property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMPROVINCIA() {
        return mprovincia;
    }

    /**
     * Sets the value of the mprovincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMPROVINCIA(FieldString value) {
        this.mprovincia = value;
    }

    /**
     * Gets the value of the mnazione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMNAZIONE() {
        return mnazione;
    }

    /**
     * Sets the value of the mnazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMNAZIONE(FieldString value) {
        this.mnazione = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSTATO(FieldString value) {
        this.stato = value;
    }

    /**
     * Gets the value of the statolayout property.
     * 
     * @return
     *     possible object is
     *     {@link FieldBitComparison }
     *     
     */
    public FieldBitComparison getSTATOLAYOUT() {
        return statolayout;
    }

    /**
     * Sets the value of the statolayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBitComparison }
     *     
     */
    public void setSTATOLAYOUT(FieldBitComparison value) {
        this.statolayout = value;
    }

    /**
     * Gets the value of the npcetipo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNPCETIPO() {
        return npcetipo;
    }

    /**
     * Sets the value of the npcetipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNPCETIPO(FieldString value) {
        this.npcetipo = value;
    }

    /**
     * Gets the value of the npceidrichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNPCEIDRICHIESTA() {
        return npceidrichiesta;
    }

    /**
     * Sets the value of the npceidrichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNPCEIDRICHIESTA(FieldString value) {
        this.npceidrichiesta = value;
    }

    /**
     * Gets the value of the npceguidutente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNPCEGUIDUTENTE() {
        return npceguidutente;
    }

    /**
     * Sets the value of the npceguidutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNPCEGUIDUTENTE(FieldString value) {
        this.npceguidutente = value;
    }

    /**
     * Gets the value of the npceidordine property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNPCEIDORDINE() {
        return npceidordine;
    }

    /**
     * Sets the value of the npceidordine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNPCEIDORDINE(FieldString value) {
        this.npceidordine = value;
    }

    /**
     * Gets the value of the npcenumeroraccomandata property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNPCENUMERORACCOMANDATA() {
        return npcenumeroraccomandata;
    }

    /**
     * Sets the value of the npcenumeroraccomandata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNPCENUMERORACCOMANDATA(FieldString value) {
        this.npcenumeroraccomandata = value;
    }

    /**
     * Gets the value of the costo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDouble }
     *     
     */
    public FieldDouble getCOSTO() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDouble }
     *     
     */
    public void setCOSTO(FieldDouble value) {
        this.costo = value;
    }

    /**
     * Gets the value of the dettagliocosti property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDETTAGLIOCOSTI() {
        return dettagliocosti;
    }

    /**
     * Sets the value of the dettagliocosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDETTAGLIOCOSTI(FieldString value) {
        this.dettagliocosti = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOTE(FieldString value) {
        this.note = value;
    }

    /**
     * Gets the value of the ricevutadiritorno property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRICEVUTADIRITORNO() {
        return ricevutadiritorno;
    }

    /**
     * Sets the value of the ricevutadiritorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRICEVUTADIRITORNO(FieldInt value) {
        this.ricevutadiritorno = value;
    }

    /**
     * Gets the value of the dmRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link JoinDmRubrica }
     *     
     */
    public JoinDmRubrica getDmRubrica() {
        return dmRubrica;
    }

    /**
     * Sets the value of the dmRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinDmRubrica }
     *     
     */
    public void setDmRubrica(JoinDmRubrica value) {
        this.dmRubrica = value;
    }

}
