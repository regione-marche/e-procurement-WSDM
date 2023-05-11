
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardRightsConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardRightsConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RwAggiungerePagine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwAnnullareProtocollo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwCancellaLista" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwClassificare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwFascicolare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwFascicolareArch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwModificaAllegati" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwModificaAnnotazioni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwModificaDati" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwModificaImmagini" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwModificaProtocollo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwRispedire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RwTogliVisibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardRightsConfig", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", propOrder = {
    "rwAggiungerePagine",
    "rwAnnullareProtocollo",
    "rwCancellaLista",
    "rwClassificare",
    "rwFascicolare",
    "rwFascicolareArch",
    "rwModificaAllegati",
    "rwModificaAnnotazioni",
    "rwModificaDati",
    "rwModificaImmagini",
    "rwModificaProtocollo",
    "rwRispedire",
    "rwTogliVisibilita"
})
public class CardRightsConfig {

    @XmlElement(name = "RwAggiungerePagine")
    protected Boolean rwAggiungerePagine;
    @XmlElement(name = "RwAnnullareProtocollo")
    protected Boolean rwAnnullareProtocollo;
    @XmlElement(name = "RwCancellaLista")
    protected Boolean rwCancellaLista;
    @XmlElement(name = "RwClassificare")
    protected Boolean rwClassificare;
    @XmlElement(name = "RwFascicolare")
    protected Boolean rwFascicolare;
    @XmlElement(name = "RwFascicolareArch")
    protected Boolean rwFascicolareArch;
    @XmlElement(name = "RwModificaAllegati")
    protected Boolean rwModificaAllegati;
    @XmlElement(name = "RwModificaAnnotazioni")
    protected Boolean rwModificaAnnotazioni;
    @XmlElement(name = "RwModificaDati")
    protected Boolean rwModificaDati;
    @XmlElement(name = "RwModificaImmagini")
    protected Boolean rwModificaImmagini;
    @XmlElement(name = "RwModificaProtocollo")
    protected Boolean rwModificaProtocollo;
    @XmlElement(name = "RwRispedire")
    protected Boolean rwRispedire;
    @XmlElement(name = "RwTogliVisibilita")
    protected Boolean rwTogliVisibilita;

    /**
     * Gets the value of the rwAggiungerePagine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwAggiungerePagine() {
        return rwAggiungerePagine;
    }

    /**
     * Sets the value of the rwAggiungerePagine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwAggiungerePagine(Boolean value) {
        this.rwAggiungerePagine = value;
    }

    /**
     * Gets the value of the rwAnnullareProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwAnnullareProtocollo() {
        return rwAnnullareProtocollo;
    }

    /**
     * Sets the value of the rwAnnullareProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwAnnullareProtocollo(Boolean value) {
        this.rwAnnullareProtocollo = value;
    }

    /**
     * Gets the value of the rwCancellaLista property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwCancellaLista() {
        return rwCancellaLista;
    }

    /**
     * Sets the value of the rwCancellaLista property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwCancellaLista(Boolean value) {
        this.rwCancellaLista = value;
    }

    /**
     * Gets the value of the rwClassificare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwClassificare() {
        return rwClassificare;
    }

    /**
     * Sets the value of the rwClassificare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwClassificare(Boolean value) {
        this.rwClassificare = value;
    }

    /**
     * Gets the value of the rwFascicolare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwFascicolare() {
        return rwFascicolare;
    }

    /**
     * Sets the value of the rwFascicolare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwFascicolare(Boolean value) {
        this.rwFascicolare = value;
    }

    /**
     * Gets the value of the rwFascicolareArch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwFascicolareArch() {
        return rwFascicolareArch;
    }

    /**
     * Sets the value of the rwFascicolareArch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwFascicolareArch(Boolean value) {
        this.rwFascicolareArch = value;
    }

    /**
     * Gets the value of the rwModificaAllegati property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwModificaAllegati() {
        return rwModificaAllegati;
    }

    /**
     * Sets the value of the rwModificaAllegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwModificaAllegati(Boolean value) {
        this.rwModificaAllegati = value;
    }

    /**
     * Gets the value of the rwModificaAnnotazioni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwModificaAnnotazioni() {
        return rwModificaAnnotazioni;
    }

    /**
     * Sets the value of the rwModificaAnnotazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwModificaAnnotazioni(Boolean value) {
        this.rwModificaAnnotazioni = value;
    }

    /**
     * Gets the value of the rwModificaDati property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwModificaDati() {
        return rwModificaDati;
    }

    /**
     * Sets the value of the rwModificaDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwModificaDati(Boolean value) {
        this.rwModificaDati = value;
    }

    /**
     * Gets the value of the rwModificaImmagini property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwModificaImmagini() {
        return rwModificaImmagini;
    }

    /**
     * Sets the value of the rwModificaImmagini property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwModificaImmagini(Boolean value) {
        this.rwModificaImmagini = value;
    }

    /**
     * Gets the value of the rwModificaProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwModificaProtocollo() {
        return rwModificaProtocollo;
    }

    /**
     * Sets the value of the rwModificaProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwModificaProtocollo(Boolean value) {
        this.rwModificaProtocollo = value;
    }

    /**
     * Gets the value of the rwRispedire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwRispedire() {
        return rwRispedire;
    }

    /**
     * Sets the value of the rwRispedire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwRispedire(Boolean value) {
        this.rwRispedire = value;
    }

    /**
     * Gets the value of the rwTogliVisibilita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRwTogliVisibilita() {
        return rwTogliVisibilita;
    }

    /**
     * Sets the value of the rwTogliVisibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRwTogliVisibilita(Boolean value) {
        this.rwTogliVisibilita = value;
    }

}
