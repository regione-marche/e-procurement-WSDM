
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CriteriRicerca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriRicerca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flusso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaAnno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdAnno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaNumero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ANumero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaDataReg" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ADataReg" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Fascicolo" type="{http://tempuri.org/}FascicoloNet" minOccurs="0"/>
 *         &lt;element name="FiltroUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Persona" type="{}Persona" minOccurs="0"/>
 *         &lt;element name="Fascicolati" type="{http://tempuri.org/}enFiltroFasc"/>
 *         &lt;element name="MaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ordinamento" type="{http://tempuri.org/}enOrdinamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriRicerca", propOrder = {
    "flusso",
    "daAnno",
    "adAnno",
    "daNumero",
    "aNumero",
    "daDataReg",
    "aDataReg",
    "fascicolo",
    "filtroUO",
    "oggetto",
    "tipoDoc",
    "persona",
    "fascicolati",
    "maxCount",
    "ordinamento"
})
public class CriteriRicerca {

    @XmlElement(name = "Flusso")
    protected String flusso;
    @XmlElement(name = "DaAnno")
    protected int daAnno;
    @XmlElement(name = "AdAnno")
    protected int adAnno;
    @XmlElement(name = "DaNumero")
    protected int daNumero;
    @XmlElement(name = "ANumero")
    protected int aNumero;
    @XmlElement(name = "DaDataReg", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar daDataReg;
    @XmlElement(name = "ADataReg", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aDataReg;
    @XmlElement(name = "Fascicolo")
    protected FascicoloNet fascicolo;
    @XmlElement(name = "FiltroUO")
    protected String filtroUO;
    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "TipoDoc")
    protected String tipoDoc;
    @XmlElement(name = "Persona")
    protected Persona persona;
    @XmlElement(name = "Fascicolati", required = true)
    protected EnFiltroFasc fascicolati;
    @XmlElement(name = "MaxCount", defaultValue = "0")
    protected Integer maxCount;
    @XmlElement(name = "Ordinamento", defaultValue = "Crescente")
    protected EnOrdinamento ordinamento;

    /**
     * Gets the value of the flusso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlusso() {
        return flusso;
    }

    /**
     * Sets the value of the flusso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlusso(String value) {
        this.flusso = value;
    }

    /**
     * Gets the value of the daAnno property.
     * 
     */
    public int getDaAnno() {
        return daAnno;
    }

    /**
     * Sets the value of the daAnno property.
     * 
     */
    public void setDaAnno(int value) {
        this.daAnno = value;
    }

    /**
     * Gets the value of the adAnno property.
     * 
     */
    public int getAdAnno() {
        return adAnno;
    }

    /**
     * Sets the value of the adAnno property.
     * 
     */
    public void setAdAnno(int value) {
        this.adAnno = value;
    }

    /**
     * Gets the value of the daNumero property.
     * 
     */
    public int getDaNumero() {
        return daNumero;
    }

    /**
     * Sets the value of the daNumero property.
     * 
     */
    public void setDaNumero(int value) {
        this.daNumero = value;
    }

    /**
     * Gets the value of the aNumero property.
     * 
     */
    public int getANumero() {
        return aNumero;
    }

    /**
     * Sets the value of the aNumero property.
     * 
     */
    public void setANumero(int value) {
        this.aNumero = value;
    }

    /**
     * Gets the value of the daDataReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDaDataReg() {
        return daDataReg;
    }

    /**
     * Sets the value of the daDataReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDaDataReg(XMLGregorianCalendar value) {
        this.daDataReg = value;
    }

    /**
     * Gets the value of the aDataReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getADataReg() {
        return aDataReg;
    }

    /**
     * Sets the value of the aDataReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setADataReg(XMLGregorianCalendar value) {
        this.aDataReg = value;
    }

    /**
     * Gets the value of the fascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloNet }
     *     
     */
    public FascicoloNet getFascicolo() {
        return fascicolo;
    }

    /**
     * Sets the value of the fascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloNet }
     *     
     */
    public void setFascicolo(FascicoloNet value) {
        this.fascicolo = value;
    }

    /**
     * Gets the value of the filtroUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroUO() {
        return filtroUO;
    }

    /**
     * Sets the value of the filtroUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroUO(String value) {
        this.filtroUO = value;
    }

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
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
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the tipoDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Sets the value of the tipoDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersona(Persona value) {
        this.persona = value;
    }

    /**
     * Gets the value of the fascicolati property.
     * 
     * @return
     *     possible object is
     *     {@link EnFiltroFasc }
     *     
     */
    public EnFiltroFasc getFascicolati() {
        return fascicolati;
    }

    /**
     * Sets the value of the fascicolati property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnFiltroFasc }
     *     
     */
    public void setFascicolati(EnFiltroFasc value) {
        this.fascicolati = value;
    }

    /**
     * Gets the value of the maxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCount(Integer value) {
        this.maxCount = value;
    }

    /**
     * Gets the value of the ordinamento property.
     * 
     * @return
     *     possible object is
     *     {@link EnOrdinamento }
     *     
     */
    public EnOrdinamento getOrdinamento() {
        return ordinamento;
    }

    /**
     * Sets the value of the ordinamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnOrdinamento }
     *     
     */
    public void setOrdinamento(EnOrdinamento value) {
        this.ordinamento = value;
    }

}
