
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anagraficaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anagraficaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cognomeDenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altriDati" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fisicaNonFisica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tipoScheda" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}tipoSchedaType" minOccurs="0"/>
 *                   &lt;element name="tipoSocieta" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}tipoSocietaType" minOccurs="0"/>
 *                   &lt;element name="rifJAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="statoEstero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rifInterpro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="annullata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anagraficaType", propOrder = {
    "codice",
    "cognomeDenom",
    "nome",
    "dataNascita",
    "comuneNascita",
    "sesso",
    "indirizzo",
    "civico",
    "esponente",
    "localita",
    "cap",
    "comune",
    "provincia",
    "codFiscale",
    "partitaIva",
    "email",
    "altriDati",
    "annullata"
})
public class AnagraficaType {

    protected String codice;
    protected String cognomeDenom;
    protected String nome;
    protected String dataNascita;
    protected String comuneNascita;
    protected String sesso;
    protected String indirizzo;
    protected String civico;
    protected String esponente;
    protected String localita;
    protected String cap;
    protected String comune;
    protected String provincia;
    protected String codFiscale;
    protected String partitaIva;
    protected String email;
    protected AnagraficaType.AltriDati altriDati;
    protected String annullata;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
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
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Gets the value of the cognomeDenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognomeDenom() {
        return cognomeDenom;
    }

    /**
     * Sets the value of the cognomeDenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognomeDenom(String value) {
        this.cognomeDenom = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the dataNascita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     * Sets the value of the dataNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascita(String value) {
        this.dataNascita = value;
    }

    /**
     * Gets the value of the comuneNascita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneNascita() {
        return comuneNascita;
    }

    /**
     * Sets the value of the comuneNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneNascita(String value) {
        this.comuneNascita = value;
    }

    /**
     * Gets the value of the sesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * Sets the value of the sesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesso(String value) {
        this.sesso = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
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
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the civico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivico() {
        return civico;
    }

    /**
     * Sets the value of the civico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivico(String value) {
        this.civico = value;
    }

    /**
     * Gets the value of the esponente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsponente() {
        return esponente;
    }

    /**
     * Sets the value of the esponente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsponente(String value) {
        this.esponente = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalita() {
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
    public void setLocalita(String value) {
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
    public String getCap() {
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
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * Gets the value of the comune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Sets the value of the comune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
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
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the codFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFiscale() {
        return codFiscale;
    }

    /**
     * Sets the value of the codFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFiscale(String value) {
        this.codFiscale = value;
    }

    /**
     * Gets the value of the partitaIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitaIva() {
        return partitaIva;
    }

    /**
     * Sets the value of the partitaIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitaIva(String value) {
        this.partitaIva = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
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
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the altriDati property.
     * 
     * @return
     *     possible object is
     *     {@link AnagraficaType.AltriDati }
     *     
     */
    public AnagraficaType.AltriDati getAltriDati() {
        return altriDati;
    }

    /**
     * Sets the value of the altriDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnagraficaType.AltriDati }
     *     
     */
    public void setAltriDati(AnagraficaType.AltriDati value) {
        this.altriDati = value;
    }

    /**
     * Gets the value of the annullata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnullata() {
        return annullata;
    }

    /**
     * Sets the value of the annullata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnullata(String value) {
        this.annullata = value;
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
     *         &lt;element name="fisicaNonFisica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tipoScheda" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}tipoSchedaType" minOccurs="0"/>
     *         &lt;element name="tipoSocieta" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}tipoSocietaType" minOccurs="0"/>
     *         &lt;element name="rifJAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="statoEstero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rifInterpro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fisicaNonFisica",
        "tipoScheda",
        "tipoSocieta",
        "rifJAna",
        "statoEstero",
        "rifInterpro"
    })
    public static class AltriDati {

        protected String fisicaNonFisica;
        protected TipoSchedaType tipoScheda;
        protected TipoSocietaType tipoSocieta;
        protected String rifJAna;
        protected String statoEstero;
        protected String rifInterpro;

        /**
         * Gets the value of the fisicaNonFisica property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFisicaNonFisica() {
            return fisicaNonFisica;
        }

        /**
         * Sets the value of the fisicaNonFisica property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFisicaNonFisica(String value) {
            this.fisicaNonFisica = value;
        }

        /**
         * Gets the value of the tipoScheda property.
         * 
         * @return
         *     possible object is
         *     {@link TipoSchedaType }
         *     
         */
        public TipoSchedaType getTipoScheda() {
            return tipoScheda;
        }

        /**
         * Sets the value of the tipoScheda property.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoSchedaType }
         *     
         */
        public void setTipoScheda(TipoSchedaType value) {
            this.tipoScheda = value;
        }

        /**
         * Gets the value of the tipoSocieta property.
         * 
         * @return
         *     possible object is
         *     {@link TipoSocietaType }
         *     
         */
        public TipoSocietaType getTipoSocieta() {
            return tipoSocieta;
        }

        /**
         * Sets the value of the tipoSocieta property.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoSocietaType }
         *     
         */
        public void setTipoSocieta(TipoSocietaType value) {
            this.tipoSocieta = value;
        }

        /**
         * Gets the value of the rifJAna property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRifJAna() {
            return rifJAna;
        }

        /**
         * Sets the value of the rifJAna property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRifJAna(String value) {
            this.rifJAna = value;
        }

        /**
         * Gets the value of the statoEstero property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatoEstero() {
            return statoEstero;
        }

        /**
         * Sets the value of the statoEstero property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatoEstero(String value) {
            this.statoEstero = value;
        }

        /**
         * Gets the value of the rifInterpro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRifInterpro() {
            return rifInterpro;
        }

        /**
         * Sets the value of the rifInterpro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRifInterpro(String value) {
            this.rifInterpro = value;
        }

    }

}
