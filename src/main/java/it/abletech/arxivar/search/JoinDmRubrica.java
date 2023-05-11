
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Rubrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Rubrica">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="SYSTEM_ID" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="RAGIONE_SOCIALE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="LOCALITA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PROVINCIA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NAZIONE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="MAIL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CELL" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CATEGORIA" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CLASSE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CODFIS" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PARTIVA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="UCONTATTI" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="AOORUBRICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NOTERUBRICA" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CODICE" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="TIPO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Rubrica", propOrder = {
    "systemid",
    "ragionesociale",
    "fax",
    "indirizzo",
    "localita",
    "cap",
    "provincia",
    "nazione",
    "mail",
    "tel",
    "cell",
    "categoria",
    "aoo",
    "classe",
    "codfis",
    "partiva",
    "ucontatti",
    "aoorubrica",
    "noterubrica",
    "codice",
    "tipo",
    "stato"
})
public class JoinDmRubrica
    extends JoinAbstract
{

    @XmlElement(name = "SYSTEM_ID")
    protected FieldInt systemid;
    @XmlElement(name = "RAGIONE_SOCIALE")
    protected FieldString ragionesociale;
    @XmlElement(name = "FAX")
    protected FieldString fax;
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
    @XmlElement(name = "MAIL")
    protected FieldString mail;
    @XmlElement(name = "TEL")
    protected FieldString tel;
    @XmlElement(name = "CELL")
    protected FieldString cell;
    @XmlElement(name = "CATEGORIA")
    protected FieldInt categoria;
    @XmlElement(name = "AOO")
    protected FieldString aoo;
    @XmlElement(name = "CLASSE")
    protected FieldString classe;
    @XmlElement(name = "CODFIS")
    protected FieldString codfis;
    @XmlElement(name = "PARTIVA")
    protected FieldString partiva;
    @XmlElement(name = "UCONTATTI")
    protected FieldString ucontatti;
    @XmlElement(name = "AOORUBRICA")
    protected FieldString aoorubrica;
    @XmlElement(name = "NOTERUBRICA")
    protected FieldString noterubrica;
    @XmlElement(name = "CODICE")
    protected FieldString codice;
    @XmlElement(name = "TIPO")
    protected FieldString tipo;
    @XmlElement(name = "STATO")
    protected FieldString stato;

    /**
     * Gets the value of the systemid property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getSYSTEMID() {
        return systemid;
    }

    /**
     * Sets the value of the systemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setSYSTEMID(FieldInt value) {
        this.systemid = value;
    }

    /**
     * Gets the value of the ragionesociale property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRAGIONESOCIALE() {
        return ragionesociale;
    }

    /**
     * Sets the value of the ragionesociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRAGIONESOCIALE(FieldString value) {
        this.ragionesociale = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFAX(FieldString value) {
        this.fax = value;
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
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getMAIL() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setMAIL(FieldString value) {
        this.mail = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTEL(FieldString value) {
        this.tel = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCELL() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCELL(FieldString value) {
        this.cell = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCATEGORIA() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCATEGORIA(FieldInt value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAOO(FieldString value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCLASSE() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCLASSE(FieldString value) {
        this.classe = value;
    }

    /**
     * Gets the value of the codfis property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCODFIS() {
        return codfis;
    }

    /**
     * Sets the value of the codfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCODFIS(FieldString value) {
        this.codfis = value;
    }

    /**
     * Gets the value of the partiva property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPARTIVA() {
        return partiva;
    }

    /**
     * Sets the value of the partiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPARTIVA(FieldString value) {
        this.partiva = value;
    }

    /**
     * Gets the value of the ucontatti property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUCONTATTI() {
        return ucontatti;
    }

    /**
     * Sets the value of the ucontatti property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUCONTATTI(FieldString value) {
        this.ucontatti = value;
    }

    /**
     * Gets the value of the aoorubrica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAOORUBRICA() {
        return aoorubrica;
    }

    /**
     * Sets the value of the aoorubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAOORUBRICA(FieldString value) {
        this.aoorubrica = value;
    }

    /**
     * Gets the value of the noterubrica property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNOTERUBRICA() {
        return noterubrica;
    }

    /**
     * Sets the value of the noterubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNOTERUBRICA(FieldString value) {
        this.noterubrica = value;
    }

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCODICE() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCODICE(FieldString value) {
        this.codice = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTIPO(FieldString value) {
        this.tipo = value;
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

}
