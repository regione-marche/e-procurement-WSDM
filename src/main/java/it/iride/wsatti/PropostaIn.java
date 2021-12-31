
package it.iride.wsatti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropostaIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropostaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trattamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImmediatamenteEsecutiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACapigruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APrefetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACoReCo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaPubblicare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://tempuri.org/}ArrayOfAllegatoIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropostaIn", propOrder = {
    "oggetto",
    "oggettoBilingue",
    "organo",
    "trattamento",
    "proponente",
    "relatore",
    "data",
    "classifica",
    "immediatamenteEsecutiva",
    "aCapigruppo",
    "aPrefetto",
    "aCoReCo",
    "daPubblicare",
    "utente",
    "ruolo",
    "allegati"
})
public class PropostaIn {

    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "OggettoBilingue")
    protected String oggettoBilingue;
    @XmlElement(name = "Organo")
    protected String organo;
    @XmlElement(name = "Trattamento")
    protected String trattamento;
    @XmlElement(name = "Proponente")
    protected String proponente;
    @XmlElement(name = "Relatore")
    protected String relatore;
    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "Classifica")
    protected String classifica;
    @XmlElement(name = "ImmediatamenteEsecutiva")
    protected String immediatamenteEsecutiva;
    @XmlElement(name = "ACapigruppo")
    protected String aCapigruppo;
    @XmlElement(name = "APrefetto")
    protected String aPrefetto;
    @XmlElement(name = "ACoReCo")
    protected String aCoReCo;
    @XmlElement(name = "DaPubblicare")
    protected String daPubblicare;
    @XmlElement(name = "Utente")
    protected String utente;
    @XmlElement(name = "Ruolo")
    protected String ruolo;
    @XmlElement(name = "Allegati")
    protected ArrayOfAllegatoIn allegati;

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
     * Gets the value of the oggettoBilingue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoBilingue() {
        return oggettoBilingue;
    }

    /**
     * Sets the value of the oggettoBilingue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoBilingue(String value) {
        this.oggettoBilingue = value;
    }

    /**
     * Gets the value of the organo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgano() {
        return organo;
    }

    /**
     * Sets the value of the organo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgano(String value) {
        this.organo = value;
    }

    /**
     * Gets the value of the trattamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrattamento() {
        return trattamento;
    }

    /**
     * Sets the value of the trattamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrattamento(String value) {
        this.trattamento = value;
    }

    /**
     * Gets the value of the proponente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProponente() {
        return proponente;
    }

    /**
     * Sets the value of the proponente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProponente(String value) {
        this.proponente = value;
    }

    /**
     * Gets the value of the relatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatore() {
        return relatore;
    }

    /**
     * Sets the value of the relatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatore(String value) {
        this.relatore = value;
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
     * Gets the value of the immediatamenteEsecutiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediatamenteEsecutiva() {
        return immediatamenteEsecutiva;
    }

    /**
     * Sets the value of the immediatamenteEsecutiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmediatamenteEsecutiva(String value) {
        this.immediatamenteEsecutiva = value;
    }

    /**
     * Gets the value of the aCapigruppo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACapigruppo() {
        return aCapigruppo;
    }

    /**
     * Sets the value of the aCapigruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACapigruppo(String value) {
        this.aCapigruppo = value;
    }

    /**
     * Gets the value of the aPrefetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPrefetto() {
        return aPrefetto;
    }

    /**
     * Sets the value of the aPrefetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPrefetto(String value) {
        this.aPrefetto = value;
    }

    /**
     * Gets the value of the aCoReCo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACoReCo() {
        return aCoReCo;
    }

    /**
     * Sets the value of the aCoReCo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACoReCo(String value) {
        this.aCoReCo = value;
    }

    /**
     * Gets the value of the daPubblicare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaPubblicare() {
        return daPubblicare;
    }

    /**
     * Sets the value of the daPubblicare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaPubblicare(String value) {
        this.daPubblicare = value;
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
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public ArrayOfAllegatoIn getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public void setAllegati(ArrayOfAllegatoIn value) {
        this.allegati = value;
    }

}
