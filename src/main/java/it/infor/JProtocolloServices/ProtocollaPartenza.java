
package it.infor.JProtocolloServices;

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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}registro" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}sezione" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}corrispondente" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}mittenteInterno" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}soggetti"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}smistamenti" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}classificazione" minOccurs="0"/>
 *         &lt;element name="dataInvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}estremi" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}anteatto" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}altriDati" minOccurs="0"/>
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
    "corrispondente",
    "mittenteInterno",
    "soggetti",
    "oggetto",
    "smistamenti",
    "classificazione",
    "dataInvio",
    "estremi",
    "anteatto",
    "altriDati"
})
@XmlRootElement(name = "protocollaPartenza")
public class ProtocollaPartenza {

    protected Registro registro;
    protected Sezione sezione;
    protected Corrispondente corrispondente;
    protected MittenteInterno mittenteInterno;
    @XmlElement(required = true)
    protected Soggetti soggetti;
    @XmlElement(required = true)
    protected String oggetto;
    protected Smistamenti smistamenti;
    protected Classificazione classificazione;
    protected String dataInvio;
    protected Estremi estremi;
    protected Anteatto anteatto;
    protected AltriDati altriDati;

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
     * Gets the value of the corrispondente property.
     * 
     * @return
     *     possible object is
     *     {@link Corrispondente }
     *     
     */
    public Corrispondente getCorrispondente() {
        return corrispondente;
    }

    /**
     * Sets the value of the corrispondente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corrispondente }
     *     
     */
    public void setCorrispondente(Corrispondente value) {
        this.corrispondente = value;
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
     * Gets the value of the dataInvio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInvio() {
        return dataInvio;
    }

    /**
     * Sets the value of the dataInvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvio(String value) {
        this.dataInvio = value;
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

}
