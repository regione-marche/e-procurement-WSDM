
package it.infor.JProtocolloGenServices;

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
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fascicolo" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}fascicoloDettaglioType" minOccurs="0"/>
 *         &lt;element name="datiRicerca" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}datiRicercaType" minOccurs="0"/>
 *         &lt;element name="datiVisualizzazione" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}datiVisualizzazioneType" minOccurs="0"/>
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
    "username",
    "operazione",
    "fascicolo",
    "datiRicerca",
    "datiVisualizzazione"
})
@XmlRootElement(name = "richiestaGestioneFascicoli")
public class RichiestaGestioneFascicoli {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String operazione;
    protected FascicoloDettaglioType fascicolo;
    protected DatiRicercaType datiRicerca;
    protected DatiVisualizzazioneType datiVisualizzazione;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the operazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperazione() {
        return operazione;
    }

    /**
     * Sets the value of the operazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperazione(String value) {
        this.operazione = value;
    }

    /**
     * Gets the value of the fascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDettaglioType }
     *     
     */
    public FascicoloDettaglioType getFascicolo() {
        return fascicolo;
    }

    /**
     * Sets the value of the fascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDettaglioType }
     *     
     */
    public void setFascicolo(FascicoloDettaglioType value) {
        this.fascicolo = value;
    }

    /**
     * Gets the value of the datiRicerca property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRicercaType }
     *     
     */
    public DatiRicercaType getDatiRicerca() {
        return datiRicerca;
    }

    /**
     * Sets the value of the datiRicerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRicercaType }
     *     
     */
    public void setDatiRicerca(DatiRicercaType value) {
        this.datiRicerca = value;
    }

    /**
     * Gets the value of the datiVisualizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiVisualizzazioneType }
     *     
     */
    public DatiVisualizzazioneType getDatiVisualizzazione() {
        return datiVisualizzazione;
    }

    /**
     * Sets the value of the datiVisualizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiVisualizzazioneType }
     *     
     */
    public void setDatiVisualizzazione(DatiVisualizzazioneType value) {
        this.datiVisualizzazione = value;
    }

}
