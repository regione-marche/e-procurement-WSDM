
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Contatti_Select complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Contatti_Select">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="RUBRICA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="CONTATTO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="MANSIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="CELL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="ABITAZIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="REPARTO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="UFFICIO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_SYSTEM_ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_RAGIONE_SOCIALE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_FAX" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_INDIRIZZO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_LOCALITA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_CAP" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_PROVINCIA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_NAZIONE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_MAIL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_TEL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_CELL" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_AOO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_CLASSE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_CODFIS" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_PARTIVA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_UCONTATTI" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_AOORUBRICA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_NOTERUBRICA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_CODICE" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_TIPO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_PRIORITA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_RUBRICA_CATEGORIA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_CATRUBRICHE_ID" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_CATRUBRICHE_RUBRICA" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="DM_CATRUBRICHE_TIPO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Selected" minOccurs="0"/>
 *         &lt;element name="MaxRowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DM_RUBRICA_STATO" type="{http://www.Abletech.it/Arxivar}Base_Selected" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Contatti_Select", propOrder = {
    "id",
    "rubrica",
    "contatto",
    "mansione",
    "tel",
    "fax",
    "cell",
    "abitazione",
    "reparto",
    "ufficio",
    "email",
    "dmrubricasystemid",
    "dmrubricaragionesociale",
    "dmrubricafax",
    "dmrubricaindirizzo",
    "dmrubricalocalita",
    "dmrubricacap",
    "dmrubricaprovincia",
    "dmrubricanazione",
    "dmrubricamail",
    "dmrubricatel",
    "dmrubricacell",
    "dmrubricaaoo",
    "dmrubricaclasse",
    "dmrubricacodfis",
    "dmrubricapartiva",
    "dmrubricaucontatti",
    "dmrubricaaoorubrica",
    "dmrubricanoterubrica",
    "dmrubricacodice",
    "dmrubricatipo",
    "dmrubricapriorita",
    "dmrubricacategoria",
    "dmcatrubricheid",
    "dmcatrubricherubrica",
    "dmcatrubrichetipo",
    "aggiuntivi",
    "maxRowCount",
    "dmrubricastato"
})
public class DmContattiSelect {

    @XmlElement(name = "ID")
    protected BaseSelected id;
    @XmlElement(name = "RUBRICA")
    protected BaseSelected rubrica;
    @XmlElement(name = "CONTATTO")
    protected BaseSelected contatto;
    @XmlElement(name = "MANSIONE")
    protected BaseSelected mansione;
    @XmlElement(name = "TEL")
    protected BaseSelected tel;
    @XmlElement(name = "FAX")
    protected BaseSelected fax;
    @XmlElement(name = "CELL")
    protected BaseSelected cell;
    @XmlElement(name = "ABITAZIONE")
    protected BaseSelected abitazione;
    @XmlElement(name = "REPARTO")
    protected BaseSelected reparto;
    @XmlElement(name = "UFFICIO")
    protected BaseSelected ufficio;
    @XmlElement(name = "EMAIL")
    protected BaseSelected email;
    @XmlElement(name = "DM_RUBRICA_SYSTEM_ID")
    protected BaseSelected dmrubricasystemid;
    @XmlElement(name = "DM_RUBRICA_RAGIONE_SOCIALE")
    protected BaseSelected dmrubricaragionesociale;
    @XmlElement(name = "DM_RUBRICA_FAX")
    protected BaseSelected dmrubricafax;
    @XmlElement(name = "DM_RUBRICA_INDIRIZZO")
    protected BaseSelected dmrubricaindirizzo;
    @XmlElement(name = "DM_RUBRICA_LOCALITA")
    protected BaseSelected dmrubricalocalita;
    @XmlElement(name = "DM_RUBRICA_CAP")
    protected BaseSelected dmrubricacap;
    @XmlElement(name = "DM_RUBRICA_PROVINCIA")
    protected BaseSelected dmrubricaprovincia;
    @XmlElement(name = "DM_RUBRICA_NAZIONE")
    protected BaseSelected dmrubricanazione;
    @XmlElement(name = "DM_RUBRICA_MAIL")
    protected BaseSelected dmrubricamail;
    @XmlElement(name = "DM_RUBRICA_TEL")
    protected BaseSelected dmrubricatel;
    @XmlElement(name = "DM_RUBRICA_CELL")
    protected BaseSelected dmrubricacell;
    @XmlElement(name = "DM_RUBRICA_AOO")
    protected BaseSelected dmrubricaaoo;
    @XmlElement(name = "DM_RUBRICA_CLASSE")
    protected BaseSelected dmrubricaclasse;
    @XmlElement(name = "DM_RUBRICA_CODFIS")
    protected BaseSelected dmrubricacodfis;
    @XmlElement(name = "DM_RUBRICA_PARTIVA")
    protected BaseSelected dmrubricapartiva;
    @XmlElement(name = "DM_RUBRICA_UCONTATTI")
    protected BaseSelected dmrubricaucontatti;
    @XmlElement(name = "DM_RUBRICA_AOORUBRICA")
    protected BaseSelected dmrubricaaoorubrica;
    @XmlElement(name = "DM_RUBRICA_NOTERUBRICA")
    protected BaseSelected dmrubricanoterubrica;
    @XmlElement(name = "DM_RUBRICA_CODICE")
    protected BaseSelected dmrubricacodice;
    @XmlElement(name = "DM_RUBRICA_TIPO")
    protected BaseSelected dmrubricatipo;
    @XmlElement(name = "DM_RUBRICA_PRIORITA")
    protected BaseSelected dmrubricapriorita;
    @XmlElement(name = "DM_RUBRICA_CATEGORIA")
    protected BaseSelected dmrubricacategoria;
    @XmlElement(name = "DM_CATRUBRICHE_ID")
    protected BaseSelected dmcatrubricheid;
    @XmlElement(name = "DM_CATRUBRICHE_RUBRICA")
    protected BaseSelected dmcatrubricherubrica;
    @XmlElement(name = "DM_CATRUBRICHE_TIPO")
    protected BaseSelected dmcatrubrichetipo;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfAggiuntivoSelected aggiuntivi;
    @XmlElement(name = "MaxRowCount")
    protected int maxRowCount;
    @XmlElement(name = "DM_RUBRICA_STATO")
    protected BaseSelected dmrubricastato;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setID(BaseSelected value) {
        this.id = value;
    }

    /**
     * Gets the value of the rubrica property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getRUBRICA() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setRUBRICA(BaseSelected value) {
        this.rubrica = value;
    }

    /**
     * Gets the value of the contatto property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getCONTATTO() {
        return contatto;
    }

    /**
     * Sets the value of the contatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setCONTATTO(BaseSelected value) {
        this.contatto = value;
    }

    /**
     * Gets the value of the mansione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getMANSIONE() {
        return mansione;
    }

    /**
     * Sets the value of the mansione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setMANSIONE(BaseSelected value) {
        this.mansione = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setTEL(BaseSelected value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setFAX(BaseSelected value) {
        this.fax = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getCELL() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setCELL(BaseSelected value) {
        this.cell = value;
    }

    /**
     * Gets the value of the abitazione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getABITAZIONE() {
        return abitazione;
    }

    /**
     * Sets the value of the abitazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setABITAZIONE(BaseSelected value) {
        this.abitazione = value;
    }

    /**
     * Gets the value of the reparto property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getREPARTO() {
        return reparto;
    }

    /**
     * Sets the value of the reparto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setREPARTO(BaseSelected value) {
        this.reparto = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getUFFICIO() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setUFFICIO(BaseSelected value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setEMAIL(BaseSelected value) {
        this.email = value;
    }

    /**
     * Gets the value of the dmrubricasystemid property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICASYSTEMID() {
        return dmrubricasystemid;
    }

    /**
     * Sets the value of the dmrubricasystemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICASYSTEMID(BaseSelected value) {
        this.dmrubricasystemid = value;
    }

    /**
     * Gets the value of the dmrubricaragionesociale property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICARAGIONESOCIALE() {
        return dmrubricaragionesociale;
    }

    /**
     * Sets the value of the dmrubricaragionesociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICARAGIONESOCIALE(BaseSelected value) {
        this.dmrubricaragionesociale = value;
    }

    /**
     * Gets the value of the dmrubricafax property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAFAX() {
        return dmrubricafax;
    }

    /**
     * Sets the value of the dmrubricafax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAFAX(BaseSelected value) {
        this.dmrubricafax = value;
    }

    /**
     * Gets the value of the dmrubricaindirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAINDIRIZZO() {
        return dmrubricaindirizzo;
    }

    /**
     * Sets the value of the dmrubricaindirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAINDIRIZZO(BaseSelected value) {
        this.dmrubricaindirizzo = value;
    }

    /**
     * Gets the value of the dmrubricalocalita property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICALOCALITA() {
        return dmrubricalocalita;
    }

    /**
     * Sets the value of the dmrubricalocalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICALOCALITA(BaseSelected value) {
        this.dmrubricalocalita = value;
    }

    /**
     * Gets the value of the dmrubricacap property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICACAP() {
        return dmrubricacap;
    }

    /**
     * Sets the value of the dmrubricacap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICACAP(BaseSelected value) {
        this.dmrubricacap = value;
    }

    /**
     * Gets the value of the dmrubricaprovincia property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAPROVINCIA() {
        return dmrubricaprovincia;
    }

    /**
     * Sets the value of the dmrubricaprovincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAPROVINCIA(BaseSelected value) {
        this.dmrubricaprovincia = value;
    }

    /**
     * Gets the value of the dmrubricanazione property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICANAZIONE() {
        return dmrubricanazione;
    }

    /**
     * Sets the value of the dmrubricanazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICANAZIONE(BaseSelected value) {
        this.dmrubricanazione = value;
    }

    /**
     * Gets the value of the dmrubricamail property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAMAIL() {
        return dmrubricamail;
    }

    /**
     * Sets the value of the dmrubricamail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAMAIL(BaseSelected value) {
        this.dmrubricamail = value;
    }

    /**
     * Gets the value of the dmrubricatel property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICATEL() {
        return dmrubricatel;
    }

    /**
     * Sets the value of the dmrubricatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICATEL(BaseSelected value) {
        this.dmrubricatel = value;
    }

    /**
     * Gets the value of the dmrubricacell property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICACELL() {
        return dmrubricacell;
    }

    /**
     * Sets the value of the dmrubricacell property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICACELL(BaseSelected value) {
        this.dmrubricacell = value;
    }

    /**
     * Gets the value of the dmrubricaaoo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAAOO() {
        return dmrubricaaoo;
    }

    /**
     * Sets the value of the dmrubricaaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAAOO(BaseSelected value) {
        this.dmrubricaaoo = value;
    }

    /**
     * Gets the value of the dmrubricaclasse property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICACLASSE() {
        return dmrubricaclasse;
    }

    /**
     * Sets the value of the dmrubricaclasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICACLASSE(BaseSelected value) {
        this.dmrubricaclasse = value;
    }

    /**
     * Gets the value of the dmrubricacodfis property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICACODFIS() {
        return dmrubricacodfis;
    }

    /**
     * Sets the value of the dmrubricacodfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICACODFIS(BaseSelected value) {
        this.dmrubricacodfis = value;
    }

    /**
     * Gets the value of the dmrubricapartiva property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAPARTIVA() {
        return dmrubricapartiva;
    }

    /**
     * Sets the value of the dmrubricapartiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAPARTIVA(BaseSelected value) {
        this.dmrubricapartiva = value;
    }

    /**
     * Gets the value of the dmrubricaucontatti property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAUCONTATTI() {
        return dmrubricaucontatti;
    }

    /**
     * Sets the value of the dmrubricaucontatti property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAUCONTATTI(BaseSelected value) {
        this.dmrubricaucontatti = value;
    }

    /**
     * Gets the value of the dmrubricaaoorubrica property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAAOORUBRICA() {
        return dmrubricaaoorubrica;
    }

    /**
     * Sets the value of the dmrubricaaoorubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAAOORUBRICA(BaseSelected value) {
        this.dmrubricaaoorubrica = value;
    }

    /**
     * Gets the value of the dmrubricanoterubrica property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICANOTERUBRICA() {
        return dmrubricanoterubrica;
    }

    /**
     * Sets the value of the dmrubricanoterubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICANOTERUBRICA(BaseSelected value) {
        this.dmrubricanoterubrica = value;
    }

    /**
     * Gets the value of the dmrubricacodice property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICACODICE() {
        return dmrubricacodice;
    }

    /**
     * Sets the value of the dmrubricacodice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICACODICE(BaseSelected value) {
        this.dmrubricacodice = value;
    }

    /**
     * Gets the value of the dmrubricatipo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICATIPO() {
        return dmrubricatipo;
    }

    /**
     * Sets the value of the dmrubricatipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICATIPO(BaseSelected value) {
        this.dmrubricatipo = value;
    }

    /**
     * Gets the value of the dmrubricapriorita property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICAPRIORITA() {
        return dmrubricapriorita;
    }

    /**
     * Sets the value of the dmrubricapriorita property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICAPRIORITA(BaseSelected value) {
        this.dmrubricapriorita = value;
    }

    /**
     * Gets the value of the dmrubricacategoria property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICACATEGORIA() {
        return dmrubricacategoria;
    }

    /**
     * Sets the value of the dmrubricacategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICACATEGORIA(BaseSelected value) {
        this.dmrubricacategoria = value;
    }

    /**
     * Gets the value of the dmcatrubricheid property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMCATRUBRICHEID() {
        return dmcatrubricheid;
    }

    /**
     * Sets the value of the dmcatrubricheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMCATRUBRICHEID(BaseSelected value) {
        this.dmcatrubricheid = value;
    }

    /**
     * Gets the value of the dmcatrubricherubrica property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMCATRUBRICHERUBRICA() {
        return dmcatrubricherubrica;
    }

    /**
     * Sets the value of the dmcatrubricherubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMCATRUBRICHERUBRICA(BaseSelected value) {
        this.dmcatrubricherubrica = value;
    }

    /**
     * Gets the value of the dmcatrubrichetipo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMCATRUBRICHETIPO() {
        return dmcatrubrichetipo;
    }

    /**
     * Sets the value of the dmcatrubrichetipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMCATRUBRICHETIPO(BaseSelected value) {
        this.dmcatrubrichetipo = value;
    }

    /**
     * Gets the value of the aggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggiuntivoSelected }
     *     
     */
    public ArrayOfAggiuntivoSelected getAggiuntivi() {
        return aggiuntivi;
    }

    /**
     * Sets the value of the aggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggiuntivoSelected }
     *     
     */
    public void setAggiuntivi(ArrayOfAggiuntivoSelected value) {
        this.aggiuntivi = value;
    }

    /**
     * Gets the value of the maxRowCount property.
     * 
     */
    public int getMaxRowCount() {
        return maxRowCount;
    }

    /**
     * Sets the value of the maxRowCount property.
     * 
     */
    public void setMaxRowCount(int value) {
        this.maxRowCount = value;
    }

    /**
     * Gets the value of the dmrubricastato property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSelected }
     *     
     */
    public BaseSelected getDMRUBRICASTATO() {
        return dmrubricastato;
    }

    /**
     * Sets the value of the dmrubricastato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSelected }
     *     
     */
    public void setDMRUBRICASTATO(BaseSelected value) {
        this.dmrubricastato = value;
    }

}
