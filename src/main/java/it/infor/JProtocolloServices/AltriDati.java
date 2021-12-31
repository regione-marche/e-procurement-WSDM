
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}tipoDocumento" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}tramite" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}affare" minOccurs="0"/>
 *         &lt;element name="visibilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tipoDocumento",
    "tramite",
    "note",
    "attributo1",
    "attributo2",
    "affare",
    "visibilita"
})
@XmlRootElement(name = "altriDati")
public class AltriDati {

    protected TipoDocumento tipoDocumento;
    protected Tramite tramite;
    protected String note;
    protected String attributo1;
    protected String attributo2;
    protected Affare affare;
    protected String visibilita;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the tramite property.
     * 
     * @return
     *     possible object is
     *     {@link Tramite }
     *     
     */
    public Tramite getTramite() {
        return tramite;
    }

    /**
     * Sets the value of the tramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tramite }
     *     
     */
    public void setTramite(Tramite value) {
        this.tramite = value;
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
     * Gets the value of the attributo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributo1() {
        return attributo1;
    }

    /**
     * Sets the value of the attributo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributo1(String value) {
        this.attributo1 = value;
    }

    /**
     * Gets the value of the attributo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributo2() {
        return attributo2;
    }

    /**
     * Sets the value of the attributo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributo2(String value) {
        this.attributo2 = value;
    }

    /**
     * Gets the value of the affare property.
     * 
     * @return
     *     possible object is
     *     {@link Affare }
     *     
     */
    public Affare getAffare() {
        return affare;
    }

    /**
     * Sets the value of the affare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affare }
     *     
     */
    public void setAffare(Affare value) {
        this.affare = value;
    }

    /**
     * Gets the value of the visibilita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilita() {
        return visibilita;
    }

    /**
     * Sets the value of the visibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilita(String value) {
        this.visibilita = value;
    }

}
