
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_DatiProfilo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_DatiProfilo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CAMPO" type="{http://www.Abletech.it/Arxivar}Dm_DatiProfilo_Campo"/>
 *         &lt;element name="VALORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTATTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCALITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTATTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANSIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELNOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAXNOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CELL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABITAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REPARTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFFICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RIFERIMENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODFIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIORITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDRUBRICA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDCONTATTO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_DatiProfilo", propOrder = {
    "id",
    "docnumber",
    "campo",
    "valore",
    "contatti",
    "fax",
    "tel",
    "indirizzo",
    "mail",
    "localita",
    "cap",
    "provincia",
    "nazione",
    "contatto",
    "mansione",
    "telnome",
    "faxnome",
    "cell",
    "abitazione",
    "reparto",
    "ufficio",
    "email",
    "riferimento",
    "codfis",
    "partiva",
    "priorita",
    "codice",
    "idrubrica",
    "idcontatto"
})
public class DmDatiProfilo
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "CAMPO", required = true)
    protected DmDatiProfiloCampo campo;
    @XmlElement(name = "VALORE")
    protected String valore;
    @XmlElement(name = "CONTATTI")
    protected String contatti;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "INDIRIZZO")
    protected String indirizzo;
    @XmlElement(name = "MAIL")
    protected String mail;
    @XmlElement(name = "LOCALITA")
    protected String localita;
    @XmlElement(name = "CAP")
    protected String cap;
    @XmlElement(name = "PROVINCIA")
    protected String provincia;
    @XmlElement(name = "NAZIONE")
    protected String nazione;
    @XmlElement(name = "CONTATTO")
    protected String contatto;
    @XmlElement(name = "MANSIONE")
    protected String mansione;
    @XmlElement(name = "TELNOME")
    protected String telnome;
    @XmlElement(name = "FAXNOME")
    protected String faxnome;
    @XmlElement(name = "CELL")
    protected String cell;
    @XmlElement(name = "ABITAZIONE")
    protected String abitazione;
    @XmlElement(name = "REPARTO")
    protected String reparto;
    @XmlElement(name = "UFFICIO")
    protected String ufficio;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "RIFERIMENTO")
    protected String riferimento;
    @XmlElement(name = "CODFIS")
    protected String codfis;
    @XmlElement(name = "PARTIVA")
    protected String partiva;
    @XmlElement(name = "PRIORITA")
    protected String priorita;
    @XmlElement(name = "CODICE")
    protected String codice;
    @XmlElement(name = "IDRUBRICA")
    protected int idrubrica;
    @XmlElement(name = "IDCONTATTO")
    protected int idcontatto;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     */
    public int getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     */
    public void setDOCNUMBER(int value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the campo property.
     * 
     * @return
     *     possible object is
     *     {@link DmDatiProfiloCampo }
     *     
     */
    public DmDatiProfiloCampo getCAMPO() {
        return campo;
    }

    /**
     * Sets the value of the campo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDatiProfiloCampo }
     *     
     */
    public void setCAMPO(DmDatiProfiloCampo value) {
        this.campo = value;
    }

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORE() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORE(String value) {
        this.valore = value;
    }

    /**
     * Gets the value of the contatti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTATTI() {
        return contatti;
    }

    /**
     * Sets the value of the contatti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTATTI(String value) {
        this.contatti = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL(String value) {
        this.tel = value;
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
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAIL() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAIL(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALITA() {
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
    public void setLOCALITA(String value) {
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
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the nazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZIONE() {
        return nazione;
    }

    /**
     * Sets the value of the nazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZIONE(String value) {
        this.nazione = value;
    }

    /**
     * Gets the value of the contatto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTATTO() {
        return contatto;
    }

    /**
     * Sets the value of the contatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTATTO(String value) {
        this.contatto = value;
    }

    /**
     * Gets the value of the mansione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANSIONE() {
        return mansione;
    }

    /**
     * Sets the value of the mansione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANSIONE(String value) {
        this.mansione = value;
    }

    /**
     * Gets the value of the telnome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELNOME() {
        return telnome;
    }

    /**
     * Sets the value of the telnome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELNOME(String value) {
        this.telnome = value;
    }

    /**
     * Gets the value of the faxnome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNOME() {
        return faxnome;
    }

    /**
     * Sets the value of the faxnome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNOME(String value) {
        this.faxnome = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCELL() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCELL(String value) {
        this.cell = value;
    }

    /**
     * Gets the value of the abitazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABITAZIONE() {
        return abitazione;
    }

    /**
     * Sets the value of the abitazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABITAZIONE(String value) {
        this.abitazione = value;
    }

    /**
     * Gets the value of the reparto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPARTO() {
        return reparto;
    }

    /**
     * Sets the value of the reparto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPARTO(String value) {
        this.reparto = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFFICIO() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFFICIO(String value) {
        this.ufficio = value;
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
     * Gets the value of the riferimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTO() {
        return riferimento;
    }

    /**
     * Sets the value of the riferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTO(String value) {
        this.riferimento = value;
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

    /**
     * Gets the value of the partiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTIVA() {
        return partiva;
    }

    /**
     * Sets the value of the partiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTIVA(String value) {
        this.partiva = value;
    }

    /**
     * Gets the value of the priorita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITA() {
        return priorita;
    }

    /**
     * Sets the value of the priorita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITA(String value) {
        this.priorita = value;
    }

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
     * Gets the value of the idrubrica property.
     * 
     */
    public int getIDRUBRICA() {
        return idrubrica;
    }

    /**
     * Sets the value of the idrubrica property.
     * 
     */
    public void setIDRUBRICA(int value) {
        this.idrubrica = value;
    }

    /**
     * Gets the value of the idcontatto property.
     * 
     */
    public int getIDCONTATTO() {
        return idcontatto;
    }

    /**
     * Sets the value of the idcontatto property.
     * 
     */
    public void setIDCONTATTO(int value) {
        this.idcontatto = value;
    }

}
