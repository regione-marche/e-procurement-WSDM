
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Dm_Aoo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Aoo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DENOMINAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASELLAPOSTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESPONSABILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISTITUZIONE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SOPPRESSIONE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PATHFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATHLOG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATHEDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATHMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMAINUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMAINPASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DB_ORIGINE" type="{http://www.Abletech.it/Arxivar}DbType"/>
 *         &lt;element name="DB_SERVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DB_DATABASE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVETYPE" type="{http://www.Abletech.it/Arxivar}Dm_Aoo_SaveType"/>
 *         &lt;element name="DB_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILEMANAGER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONFIGURATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DB_USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODPAESE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODIMPRESE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SL_INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SL_CIVICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SL_CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SL_LOCALITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SL_PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA_INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA_CIVICO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA_CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA_LOCALITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA_PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODFIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Aoo", propOrder = {
    "codice",
    "denominazione",
    "casellaposta",
    "responsabile",
    "istituzione",
    "soppressione",
    "pathfile",
    "pathlog",
    "pathedit",
    "pathmail",
    "domainuser",
    "domainpassword",
    "dborigine",
    "dbserver",
    "dbdatabase",
    "savetype",
    "dbpassword",
    "filemanagerid",
    "configurationid",
    "dbuser",
    "piva",
    "codpaese",
    "codimprese",
    "rea",
    "slindirizzo",
    "slcivico",
    "slcap",
    "sllocalita",
    "slprovincia",
    "saindirizzo",
    "sacivico",
    "sacap",
    "salocalita",
    "saprovincia",
    "codfis"
})
public class DmAoo
    extends Base
{

    @XmlElement(name = "CODICE")
    protected String codice;
    @XmlElement(name = "DENOMINAZIONE")
    protected String denominazione;
    @XmlElement(name = "CASELLAPOSTA")
    protected String casellaposta;
    @XmlElement(name = "RESPONSABILE")
    protected String responsabile;
    @XmlElement(name = "ISTITUZIONE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar istituzione;
    @XmlElement(name = "SOPPRESSIONE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar soppressione;
    @XmlElement(name = "PATHFILE")
    protected String pathfile;
    @XmlElement(name = "PATHLOG")
    protected String pathlog;
    @XmlElement(name = "PATHEDIT")
    protected String pathedit;
    @XmlElement(name = "PATHMAIL")
    protected String pathmail;
    @XmlElement(name = "DOMAINUSER")
    protected String domainuser;
    @XmlElement(name = "DOMAINPASSWORD")
    protected String domainpassword;
    @XmlElement(name = "DB_ORIGINE", required = true)
    protected DbType dborigine;
    @XmlElement(name = "DB_SERVER")
    protected String dbserver;
    @XmlElement(name = "DB_DATABASE")
    protected String dbdatabase;
    @XmlElement(name = "SAVETYPE", required = true)
    protected DmAooSaveType savetype;
    @XmlElement(name = "DB_PASSWORD")
    protected String dbpassword;
    @XmlElement(name = "FILEMANAGER_ID")
    protected String filemanagerid;
    @XmlElement(name = "CONFIGURATION_ID")
    protected String configurationid;
    @XmlElement(name = "DB_USER")
    protected String dbuser;
    @XmlElement(name = "PIVA")
    protected String piva;
    @XmlElement(name = "CODPAESE")
    protected String codpaese;
    @XmlElement(name = "CODIMPRESE")
    protected String codimprese;
    @XmlElement(name = "REA")
    protected String rea;
    @XmlElement(name = "SL_INDIRIZZO")
    protected String slindirizzo;
    @XmlElement(name = "SL_CIVICO")
    protected String slcivico;
    @XmlElement(name = "SL_CAP")
    protected String slcap;
    @XmlElement(name = "SL_LOCALITA")
    protected String sllocalita;
    @XmlElement(name = "SL_PROVINCIA")
    protected String slprovincia;
    @XmlElement(name = "SA_INDIRIZZO")
    protected String saindirizzo;
    @XmlElement(name = "SA_CIVICO")
    protected String sacivico;
    @XmlElement(name = "SA_CAP")
    protected String sacap;
    @XmlElement(name = "SA_LOCALITA")
    protected String salocalita;
    @XmlElement(name = "SA_PROVINCIA")
    protected String saprovincia;
    @XmlElement(name = "CODFIS")
    protected String codfis;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICE() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICE(String value) {
        this.codice = value;
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
     * Gets the value of the casellaposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASELLAPOSTA() {
        return casellaposta;
    }

    /**
     * Sets the value of the casellaposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASELLAPOSTA(String value) {
        this.casellaposta = value;
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
     * Gets the value of the istituzione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getISTITUZIONE() {
        return istituzione;
    }

    /**
     * Sets the value of the istituzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setISTITUZIONE(XMLGregorianCalendar value) {
        this.istituzione = value;
    }

    /**
     * Gets the value of the soppressione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSOPPRESSIONE() {
        return soppressione;
    }

    /**
     * Sets the value of the soppressione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSOPPRESSIONE(XMLGregorianCalendar value) {
        this.soppressione = value;
    }

    /**
     * Gets the value of the pathfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATHFILE() {
        return pathfile;
    }

    /**
     * Sets the value of the pathfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATHFILE(String value) {
        this.pathfile = value;
    }

    /**
     * Gets the value of the pathlog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATHLOG() {
        return pathlog;
    }

    /**
     * Sets the value of the pathlog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATHLOG(String value) {
        this.pathlog = value;
    }

    /**
     * Gets the value of the pathedit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATHEDIT() {
        return pathedit;
    }

    /**
     * Sets the value of the pathedit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATHEDIT(String value) {
        this.pathedit = value;
    }

    /**
     * Gets the value of the pathmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATHMAIL() {
        return pathmail;
    }

    /**
     * Sets the value of the pathmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATHMAIL(String value) {
        this.pathmail = value;
    }

    /**
     * Gets the value of the domainuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMAINUSER() {
        return domainuser;
    }

    /**
     * Sets the value of the domainuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMAINUSER(String value) {
        this.domainuser = value;
    }

    /**
     * Gets the value of the domainpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMAINPASSWORD() {
        return domainpassword;
    }

    /**
     * Sets the value of the domainpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMAINPASSWORD(String value) {
        this.domainpassword = value;
    }

    /**
     * Gets the value of the dborigine property.
     * 
     * @return
     *     possible object is
     *     {@link DbType }
     *     
     */
    public DbType getDBORIGINE() {
        return dborigine;
    }

    /**
     * Sets the value of the dborigine property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbType }
     *     
     */
    public void setDBORIGINE(DbType value) {
        this.dborigine = value;
    }

    /**
     * Gets the value of the dbserver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBSERVER() {
        return dbserver;
    }

    /**
     * Sets the value of the dbserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBSERVER(String value) {
        this.dbserver = value;
    }

    /**
     * Gets the value of the dbdatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBDATABASE() {
        return dbdatabase;
    }

    /**
     * Sets the value of the dbdatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBDATABASE(String value) {
        this.dbdatabase = value;
    }

    /**
     * Gets the value of the savetype property.
     * 
     * @return
     *     possible object is
     *     {@link DmAooSaveType }
     *     
     */
    public DmAooSaveType getSAVETYPE() {
        return savetype;
    }

    /**
     * Sets the value of the savetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAooSaveType }
     *     
     */
    public void setSAVETYPE(DmAooSaveType value) {
        this.savetype = value;
    }

    /**
     * Gets the value of the dbpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBPASSWORD() {
        return dbpassword;
    }

    /**
     * Sets the value of the dbpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBPASSWORD(String value) {
        this.dbpassword = value;
    }

    /**
     * Gets the value of the filemanagerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILEMANAGERID() {
        return filemanagerid;
    }

    /**
     * Sets the value of the filemanagerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILEMANAGERID(String value) {
        this.filemanagerid = value;
    }

    /**
     * Gets the value of the configurationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIGURATIONID() {
        return configurationid;
    }

    /**
     * Sets the value of the configurationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIGURATIONID(String value) {
        this.configurationid = value;
    }

    /**
     * Gets the value of the dbuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBUSER() {
        return dbuser;
    }

    /**
     * Sets the value of the dbuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBUSER(String value) {
        this.dbuser = value;
    }

    /**
     * Gets the value of the piva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIVA() {
        return piva;
    }

    /**
     * Sets the value of the piva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIVA(String value) {
        this.piva = value;
    }

    /**
     * Gets the value of the codpaese property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPAESE() {
        return codpaese;
    }

    /**
     * Sets the value of the codpaese property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPAESE(String value) {
        this.codpaese = value;
    }

    /**
     * Gets the value of the codimprese property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIMPRESE() {
        return codimprese;
    }

    /**
     * Sets the value of the codimprese property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIMPRESE(String value) {
        this.codimprese = value;
    }

    /**
     * Gets the value of the rea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREA() {
        return rea;
    }

    /**
     * Sets the value of the rea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREA(String value) {
        this.rea = value;
    }

    /**
     * Gets the value of the slindirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLINDIRIZZO() {
        return slindirizzo;
    }

    /**
     * Sets the value of the slindirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLINDIRIZZO(String value) {
        this.slindirizzo = value;
    }

    /**
     * Gets the value of the slcivico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLCIVICO() {
        return slcivico;
    }

    /**
     * Sets the value of the slcivico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLCIVICO(String value) {
        this.slcivico = value;
    }

    /**
     * Gets the value of the slcap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLCAP() {
        return slcap;
    }

    /**
     * Sets the value of the slcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLCAP(String value) {
        this.slcap = value;
    }

    /**
     * Gets the value of the sllocalita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLLOCALITA() {
        return sllocalita;
    }

    /**
     * Sets the value of the sllocalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLLOCALITA(String value) {
        this.sllocalita = value;
    }

    /**
     * Gets the value of the slprovincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLPROVINCIA() {
        return slprovincia;
    }

    /**
     * Sets the value of the slprovincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLPROVINCIA(String value) {
        this.slprovincia = value;
    }

    /**
     * Gets the value of the saindirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAINDIRIZZO() {
        return saindirizzo;
    }

    /**
     * Sets the value of the saindirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAINDIRIZZO(String value) {
        this.saindirizzo = value;
    }

    /**
     * Gets the value of the sacivico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACIVICO() {
        return sacivico;
    }

    /**
     * Sets the value of the sacivico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACIVICO(String value) {
        this.sacivico = value;
    }

    /**
     * Gets the value of the sacap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACAP() {
        return sacap;
    }

    /**
     * Sets the value of the sacap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACAP(String value) {
        this.sacap = value;
    }

    /**
     * Gets the value of the salocalita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALOCALITA() {
        return salocalita;
    }

    /**
     * Sets the value of the salocalita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALOCALITA(String value) {
        this.salocalita = value;
    }

    /**
     * Gets the value of the saprovincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPROVINCIA() {
        return saprovincia;
    }

    /**
     * Sets the value of the saprovincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPROVINCIA(String value) {
        this.saprovincia = value;
    }

    /**
     * Gets the value of the codfis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFIS() {
        return codfis;
    }

    /**
     * Sets the value of the codfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFIS(String value) {
        this.codfis = value;
    }

}
