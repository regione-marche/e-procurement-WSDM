
package it.infor.JProtocolloServices;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}registro"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}sezione"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataRegistrazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oraRegistrazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}soggetti" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}mittenteInterno" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}smistamenti" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}classificazione" minOccurs="0"/>
 *         &lt;element name="dataArrivoPartenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}estremi" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}anteatto" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}altriDati"/>
 *         &lt;element name="documenti" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}documento" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="annullamento" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annullato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="atto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "registro",
    "sezione",
    "anno",
    "numero",
    "dataRegistrazione",
    "oraRegistrazione",
    "tipo",
    "soggetti",
    "mittenteInterno",
    "smistamenti",
    "oggetto",
    "classificazione",
    "dataArrivoPartenza",
    "estremi",
    "anteatto",
    "altriDati",
    "documenti",
    "annullamento"
})
@XmlRootElement(name = "protocollo")
public class Protocollo {

    @XmlElement(required = true)
    protected Registro registro;
    @XmlElement(required = true)
    protected Sezione sezione;
    @XmlElement(required = true)
    protected String anno;
    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String dataRegistrazione;
    @XmlElement(required = true)
    protected String oraRegistrazione;
    @XmlElement(required = true)
    protected String tipo;
    protected Soggetti soggetti;
    protected MittenteInterno mittenteInterno;
    protected Smistamenti smistamenti;
    @XmlElement(required = true)
    protected String oggetto;
    protected Classificazione classificazione;
    protected String dataArrivoPartenza;
    protected Estremi estremi;
    protected Anteatto anteatto;
    @XmlElement(required = true)
    protected AltriDati altriDati;
    protected Protocollo.Documenti documenti;
    protected Protocollo.Annullamento annullamento;

    /**
     * Gets the value of the registro property.
     * 
     * @return
     *     possible object is
     *     {@link Registro }
     *     
     */
    public Registro getRegistro() {
        return registro;
    }

    /**
     * Sets the value of the registro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registro }
     *     
     */
    public void setRegistro(Registro value) {
        this.registro = value;
    }

    /**
     * Gets the value of the sezione property.
     * 
     * @return
     *     possible object is
     *     {@link Sezione }
     *     
     */
    public Sezione getSezione() {
        return sezione;
    }

    /**
     * Sets the value of the sezione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sezione }
     *     
     */
    public void setSezione(Sezione value) {
        this.sezione = value;
    }

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
     * Gets the value of the dataRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRegistrazione() {
        return dataRegistrazione;
    }

    /**
     * Sets the value of the dataRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistrazione(String value) {
        this.dataRegistrazione = value;
    }

    /**
     * Gets the value of the oraRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOraRegistrazione() {
        return oraRegistrazione;
    }

    /**
     * Sets the value of the oraRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOraRegistrazione(String value) {
        this.oraRegistrazione = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the soggetti property.
     * 
     * @return
     *     possible object is
     *     {@link Soggetti }
     *     
     */
    public Soggetti getSoggetti() {
        return soggetti;
    }

    /**
     * Sets the value of the soggetti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soggetti }
     *     
     */
    public void setSoggetti(Soggetti value) {
        this.soggetti = value;
    }

    /**
     * Gets the value of the mittenteInterno property.
     * 
     * @return
     *     possible object is
     *     {@link MittenteInterno }
     *     
     */
    public MittenteInterno getMittenteInterno() {
        return mittenteInterno;
    }

    /**
     * Sets the value of the mittenteInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link MittenteInterno }
     *     
     */
    public void setMittenteInterno(MittenteInterno value) {
        this.mittenteInterno = value;
    }

    /**
     * Gets the value of the smistamenti property.
     * 
     * @return
     *     possible object is
     *     {@link Smistamenti }
     *     
     */
    public Smistamenti getSmistamenti() {
        return smistamenti;
    }

    /**
     * Sets the value of the smistamenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Smistamenti }
     *     
     */
    public void setSmistamenti(Smistamenti value) {
        this.smistamenti = value;
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
     * Gets the value of the classificazione property.
     * 
     * @return
     *     possible object is
     *     {@link Classificazione }
     *     
     */
    public Classificazione getClassificazione() {
        return classificazione;
    }

    /**
     * Sets the value of the classificazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classificazione }
     *     
     */
    public void setClassificazione(Classificazione value) {
        this.classificazione = value;
    }

    /**
     * Gets the value of the dataArrivoPartenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataArrivoPartenza() {
        return dataArrivoPartenza;
    }

    /**
     * Sets the value of the dataArrivoPartenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataArrivoPartenza(String value) {
        this.dataArrivoPartenza = value;
    }

    /**
     * Gets the value of the estremi property.
     * 
     * @return
     *     possible object is
     *     {@link Estremi }
     *     
     */
    public Estremi getEstremi() {
        return estremi;
    }

    /**
     * Sets the value of the estremi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Estremi }
     *     
     */
    public void setEstremi(Estremi value) {
        this.estremi = value;
    }

    /**
     * Gets the value of the anteatto property.
     * 
     * @return
     *     possible object is
     *     {@link Anteatto }
     *     
     */
    public Anteatto getAnteatto() {
        return anteatto;
    }

    /**
     * Sets the value of the anteatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anteatto }
     *     
     */
    public void setAnteatto(Anteatto value) {
        this.anteatto = value;
    }

    /**
     * Gets the value of the altriDati property.
     * 
     * @return
     *     possible object is
     *     {@link AltriDati }
     *     
     */
    public AltriDati getAltriDati() {
        return altriDati;
    }

    /**
     * Sets the value of the altriDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltriDati }
     *     
     */
    public void setAltriDati(AltriDati value) {
        this.altriDati = value;
    }

    /**
     * Gets the value of the documenti property.
     * 
     * @return
     *     possible object is
     *     {@link Protocollo.Documenti }
     *     
     */
    public Protocollo.Documenti getDocumenti() {
        return documenti;
    }

    /**
     * Sets the value of the documenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocollo.Documenti }
     *     
     */
    public void setDocumenti(Protocollo.Documenti value) {
        this.documenti = value;
    }

    /**
     * Gets the value of the annullamento property.
     * 
     * @return
     *     possible object is
     *     {@link Protocollo.Annullamento }
     *     
     */
    public Protocollo.Annullamento getAnnullamento() {
        return annullamento;
    }

    /**
     * Sets the value of the annullamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocollo.Annullamento }
     *     
     */
    public void setAnnullamento(Protocollo.Annullamento value) {
        this.annullamento = value;
    }


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
     *         &lt;element name="annullato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="atto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "annullato",
        "atto"
    })
    public static class Annullamento {

        protected boolean annullato;
        protected String atto;

        /**
         * Gets the value of the annullato property.
         * 
         */
        public boolean isAnnullato() {
            return annullato;
        }

        /**
         * Sets the value of the annullato property.
         * 
         */
        public void setAnnullato(boolean value) {
            this.annullato = value;
        }

        /**
         * Gets the value of the atto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtto() {
            return atto;
        }

        /**
         * Sets the value of the atto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtto(String value) {
            this.atto = value;
        }

    }


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
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}documento" maxOccurs="unbounded"/>
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
        "documento"
    })
    public static class Documenti {

        @XmlElement(required = true)
        protected List<Documento> documento;

        /**
         * Gets the value of the documento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Documento }
         * 
         * 
         */
        public List<Documento> getDocumento() {
            if (documento == null) {
                documento = new ArrayList<Documento>();
            }
            return this.documento;
        }

    }

}
