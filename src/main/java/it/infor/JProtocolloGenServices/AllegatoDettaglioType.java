
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegatoDettaglioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegatoDettaglioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fascicoloAppartenenza" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}fascicoloRiferimentoType"/>
 *         &lt;element name="datiProtocollo" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}protocolloDettaglioType" minOccurs="0"/>
 *         &lt;element name="tipoRiferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allegatoDettaglioType", propOrder = {
    "fascicoloAppartenenza",
    "datiProtocollo",
    "tipoRiferimento",
    "riferimento",
    "data",
    "oggetto",
    "note"
})
public class AllegatoDettaglioType {

    @XmlElement(required = true)
    protected FascicoloRiferimentoType fascicoloAppartenenza;
    protected ProtocolloDettaglioType datiProtocollo;
    protected String tipoRiferimento;
    protected String riferimento;
    protected String data;
    protected String oggetto;
    protected String note;

    /**
     * Gets the value of the fascicoloAppartenenza property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloRiferimentoType }
     *     
     */
    public FascicoloRiferimentoType getFascicoloAppartenenza() {
        return fascicoloAppartenenza;
    }

    /**
     * Sets the value of the fascicoloAppartenenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloRiferimentoType }
     *     
     */
    public void setFascicoloAppartenenza(FascicoloRiferimentoType value) {
        this.fascicoloAppartenenza = value;
    }

    /**
     * Gets the value of the datiProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolloDettaglioType }
     *     
     */
    public ProtocolloDettaglioType getDatiProtocollo() {
        return datiProtocollo;
    }

    /**
     * Sets the value of the datiProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolloDettaglioType }
     *     
     */
    public void setDatiProtocollo(ProtocolloDettaglioType value) {
        this.datiProtocollo = value;
    }

    /**
     * Gets the value of the tipoRiferimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRiferimento() {
        return tipoRiferimento;
    }

    /**
     * Sets the value of the tipoRiferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRiferimento(String value) {
        this.tipoRiferimento = value;
    }

    /**
     * Gets the value of the riferimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimento() {
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
    public void setRiferimento(String value) {
        this.riferimento = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
