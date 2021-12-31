
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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}registro"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}sezione"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}amministrazione"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}classificazione" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}corrispondente" minOccurs="0"/>
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
    "data",
    "ora",
    "amministrazione",
    "classificazione",
    "corrispondente"
})
@XmlRootElement(name = "segnatura")
public class Segnatura {

    @XmlElement(required = true)
    protected Registro registro;
    @XmlElement(required = true)
    protected Sezione sezione;
    @XmlElement(required = true)
    protected String anno;
    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String data;
    @XmlElement(required = true)
    protected String ora;
    @XmlElement(required = true)
    protected Amministrazione amministrazione;
    protected Classificazione classificazione;
    protected Corrispondente corrispondente;

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
     * Gets the value of the ora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOra() {
        return ora;
    }

    /**
     * Sets the value of the ora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOra(String value) {
        this.ora = value;
    }

    /**
     * Gets the value of the amministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link Amministrazione }
     *     
     */
    public Amministrazione getAmministrazione() {
        return amministrazione;
    }

    /**
     * Sets the value of the amministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amministrazione }
     *     
     */
    public void setAmministrazione(Amministrazione value) {
        this.amministrazione = value;
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

}
