
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Rubrica_Base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Rubrica_Base">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="RAGIONE_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDIRIZZO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCALITA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CELL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATO" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica_Stato"/>
 *         &lt;element name="TIPO" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica_Tipo"/>
 *         &lt;element name="CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODFIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIORITA" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica_Priorita"/>
 *         &lt;element name="AOORUBRICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTERUBRICA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggiuntivi" type="{http://www.Abletech.it/Arxivar}ArrayOfAggiuntivo_Base" minOccurs="0"/>
 *         &lt;element name="Contatti" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Contatti_Base" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Rubrica_Base", propOrder = {
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
    "stato",
    "tipo",
    "categoria",
    "aoo",
    "classe",
    "codfis",
    "partiva",
    "priorita",
    "aoorubrica",
    "noterubrica",
    "codice",
    "aggiuntivi",
    "contatti"
})
@XmlSeeAlso({
    DmRubricaForInsert.class,
    DmRubricaForUpdate.class
})
public abstract class DmRubricaBase
    extends Base
{

    @XmlElement(name = "RAGIONE_SOCIALE")
    protected String ragionesociale;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "INDIRIZZO")
    protected String indirizzo;
    @XmlElement(name = "LOCALITA")
    protected String localita;
    @XmlElement(name = "CAP")
    protected String cap;
    @XmlElement(name = "PROVINCIA")
    protected String provincia;
    @XmlElement(name = "NAZIONE")
    protected String nazione;
    @XmlElement(name = "MAIL")
    protected String mail;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "CELL")
    protected String cell;
    @XmlElement(name = "STATO", required = true)
    protected DmRubricaStato stato;
    @XmlElement(name = "TIPO", required = true)
    protected DmRubricaTipo tipo;
    @XmlElement(name = "CATEGORIA")
    protected int categoria;
    @XmlElement(name = "AOO")
    protected String aoo;
    @XmlElement(name = "CLASSE")
    protected String classe;
    @XmlElement(name = "CODFIS")
    protected String codfis;
    @XmlElement(name = "PARTIVA")
    protected String partiva;
    @XmlElement(name = "PRIORITA", required = true)
    protected DmRubricaPriorita priorita;
    @XmlElement(name = "AOORUBRICA")
    protected String aoorubrica;
    @XmlElement(name = "NOTERUBRICA")
    protected String noterubrica;
    @XmlElement(name = "CODICE")
    protected String codice;
    @XmlElement(name = "Aggiuntivi")
    protected ArrayOfAggiuntivoBase aggiuntivi;
    @XmlElement(name = "Contatti")
    protected ArrayOfDmContattiBase contatti;

    /**
     * Gets the value of the ragionesociale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAGIONESOCIALE() {
        return ragionesociale;
    }

    /**
     * Sets the value of the ragionesociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAGIONESOCIALE(String value) {
        this.ragionesociale = value;
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
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubricaStato }
     *     
     */
    public DmRubricaStato getSTATO() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubricaStato }
     *     
     */
    public void setSTATO(DmRubricaStato value) {
        this.stato = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubricaTipo }
     *     
     */
    public DmRubricaTipo getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubricaTipo }
     *     
     */
    public void setTIPO(DmRubricaTipo value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     */
    public int getCATEGORIA() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     */
    public void setCATEGORIA(int value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOO(String value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSE() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSE(String value) {
        this.classe = value;
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
     *     {@link DmRubricaPriorita }
     *     
     */
    public DmRubricaPriorita getPRIORITA() {
        return priorita;
    }

    /**
     * Sets the value of the priorita property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubricaPriorita }
     *     
     */
    public void setPRIORITA(DmRubricaPriorita value) {
        this.priorita = value;
    }

    /**
     * Gets the value of the aoorubrica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOORUBRICA() {
        return aoorubrica;
    }

    /**
     * Sets the value of the aoorubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOORUBRICA(String value) {
        this.aoorubrica = value;
    }

    /**
     * Gets the value of the noterubrica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTERUBRICA() {
        return noterubrica;
    }

    /**
     * Sets the value of the noterubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTERUBRICA(String value) {
        this.noterubrica = value;
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
     * Gets the value of the aggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggiuntivoBase }
     *     
     */
    public ArrayOfAggiuntivoBase getAggiuntivi() {
        return aggiuntivi;
    }

    /**
     * Sets the value of the aggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggiuntivoBase }
     *     
     */
    public void setAggiuntivi(ArrayOfAggiuntivoBase value) {
        this.aggiuntivi = value;
    }

    /**
     * Gets the value of the contatti property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmContattiBase }
     *     
     */
    public ArrayOfDmContattiBase getContatti() {
        return contatti;
    }

    /**
     * Sets the value of the contatti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmContattiBase }
     *     
     */
    public void setContatti(ArrayOfDmContattiBase value) {
        this.contatti = value;
    }

}
