
package it.jiride.docwsfascicolisoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltriDati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eterogeneo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataChiusura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatiAggiuntivi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Applicazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggiornamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnagraficaCf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnagraficaPiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloIn", propOrder = {
    "anno",
    "numero",
    "data",
    "oggetto",
    "classifica",
    "altriDati",
    "utente",
    "ruolo",
    "eterogeneo",
    "dataChiusura",
    "datiAggiuntivi",
    "applicazione",
    "aggiornamento",
    "anagraficaCf",
    "anagraficaPiva"
})
public class FascicoloIn {

    @XmlElement(name = "Anno", nillable = true)
    protected String anno;
    @XmlElement(name = "Numero", nillable = true)
    protected String numero;
    @XmlElement(name = "Data", nillable = true)
    protected String data;
    @XmlElement(name = "Oggetto", nillable = true)
    protected String oggetto;
    @XmlElement(name = "Classifica", nillable = true)
    protected String classifica;
    @XmlElement(name = "AltriDati", nillable = true)
    protected String altriDati;
    @XmlElement(name = "Utente", nillable = true)
    protected String utente;
    @XmlElement(name = "Ruolo", nillable = true)
    protected String ruolo;
    @XmlElement(name = "Eterogeneo", nillable = true)
    protected String eterogeneo;
    @XmlElement(name = "DataChiusura", nillable = true)
    protected String dataChiusura;
    @XmlElement(name = "DatiAggiuntivi", nillable = true)
    protected String datiAggiuntivi;
    @XmlElement(name = "Applicazione", nillable = true)
    protected String applicazione;
    @XmlElement(name = "Aggiornamento", nillable = true)
    protected String aggiornamento;
    @XmlElement(name = "AnagraficaCf", nillable = true)
    protected String anagraficaCf;
    @XmlElement(name = "AnagraficaPiva", nillable = true)
    protected String anagraficaPiva;

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnno(String value) {
        this.anno = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
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
     * Gets the value of the classifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifica() {
        return classifica;
    }

    /**
     * Sets the value of the classifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifica(String value) {
        this.classifica = value;
    }

    /**
     * Gets the value of the altriDati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltriDati() {
        return altriDati;
    }

    /**
     * Sets the value of the altriDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltriDati(String value) {
        this.altriDati = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
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
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Gets the value of the ruolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Sets the value of the ruolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

    /**
     * Gets the value of the eterogeneo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEterogeneo() {
        return eterogeneo;
    }

    /**
     * Sets the value of the eterogeneo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEterogeneo(String value) {
        this.eterogeneo = value;
    }

    /**
     * Gets the value of the dataChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataChiusura() {
        return dataChiusura;
    }

    /**
     * Sets the value of the dataChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataChiusura(String value) {
        this.dataChiusura = value;
    }

    /**
     * Gets the value of the datiAggiuntivi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatiAggiuntivi() {
        return datiAggiuntivi;
    }

    /**
     * Sets the value of the datiAggiuntivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatiAggiuntivi(String value) {
        this.datiAggiuntivi = value;
    }

    /**
     * Gets the value of the applicazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicazione() {
        return applicazione;
    }

    /**
     * Sets the value of the applicazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicazione(String value) {
        this.applicazione = value;
    }

    /**
     * Gets the value of the aggiornamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggiornamento() {
        return aggiornamento;
    }

    /**
     * Sets the value of the aggiornamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggiornamento(String value) {
        this.aggiornamento = value;
    }

    /**
     * Gets the value of the anagraficaCf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnagraficaCf() {
        return anagraficaCf;
    }

    /**
     * Sets the value of the anagraficaCf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnagraficaCf(String value) {
        this.anagraficaCf = value;
    }

    /**
     * Gets the value of the anagraficaPiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnagraficaPiva() {
        return anagraficaPiva;
    }

    /**
     * Sets the value of the anagraficaPiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnagraficaPiva(String value) {
        this.anagraficaPiva = value;
    }

}
