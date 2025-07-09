
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rubrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://paleo.regione.marche.it/services/}TipoVoceRubrica" minOccurs="0"/>
 *         &lt;element name="Toponimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rubrica", namespace = "http://paleo.regione.marche.it/services/", propOrder = {
    "cap",
    "codiceRubrica",
    "comune",
    "fax",
    "nazione",
    "note",
    "oggetto",
    "provincia",
    "telefono",
    "tipo",
    "toponimo"
})
public class Rubrica {

    @XmlElement(name = "Cap", nillable = true)
    protected String cap;
    @XmlElement(name = "CodiceRubrica", nillable = true)
    protected String codiceRubrica;
    @XmlElement(name = "Comune", nillable = true)
    protected String comune;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "Nazione", nillable = true)
    protected String nazione;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "Oggetto", nillable = true)
    protected Object oggetto;
    @XmlElement(name = "Provincia", nillable = true)
    protected String provincia;
    @XmlElement(name = "Telefono", nillable = true)
    protected String telefono;
    @XmlElement(name = "Tipo")
    protected TipoVoceRubrica tipo;
    @XmlElement(name = "Toponimo", nillable = true)
    protected String toponimo;

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
     * Gets the value of the codiceRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRubrica() {
        return codiceRubrica;
    }

    /**
     * Sets the value of the codiceRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRubrica(String value) {
        this.codiceRubrica = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
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
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the nazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazione() {
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
    public void setNazione(String value) {
        this.nazione = value;
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

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOggetto(Object value) {
        this.oggetto = value;
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
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoVoceRubrica }
     *     
     */
    public TipoVoceRubrica getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoVoceRubrica }
     *     
     */
    public void setTipo(TipoVoceRubrica value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the toponimo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToponimo() {
        return toponimo;
    }

    /**
     * Sets the value of the toponimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToponimo(String value) {
        this.toponimo = value;
    }

}
