//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.26 at 04:05:31 PM CEST 
//


package it.lapis.richiestaprotocollazione;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Destinatario" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element name="Nominativo" type="{}varchar100"/>
 *                     &lt;element name="Indirizzo" type="{}varchar100" minOccurs="0"/>
 *                     &lt;element name="Cap" type="{}varchar005" minOccurs="0"/>
 *                     &lt;element name="Citta" type="{}varchar100" minOccurs="0"/>
 *                     &lt;element name="Provincia" type="{}SiglaProv" minOccurs="0"/>
 *                     &lt;element name="PEC" type="{}emailAddress" minOccurs="0"/>
 *                     &lt;element name="FAX" type="{}varchar020" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element name="Cod_Destinatario" type="{}varchar020" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *                 &lt;attribute name="tipo_vettore" use="required" type="{}vettore" />
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
    "destinatario"
})
@XmlRootElement(name = "Destinatari")
public class Destinatari {

    @XmlElement(name = "Destinatario", required = true)
    protected List<Destinatari.Destinatario> destinatario;

    /**
     * Gets the value of the destinatario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinatario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinatario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destinatari.Destinatario }
     * 
     * 
     */
    public List<Destinatari.Destinatario> getDestinatario() {
        if (destinatario == null) {
            destinatario = new ArrayList<Destinatari.Destinatario>();
        }
        return this.destinatario;
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
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;element name="Nominativo" type="{}varchar100"/>
     *           &lt;element name="Indirizzo" type="{}varchar100" minOccurs="0"/>
     *           &lt;element name="Cap" type="{}varchar005" minOccurs="0"/>
     *           &lt;element name="Citta" type="{}varchar100" minOccurs="0"/>
     *           &lt;element name="Provincia" type="{}SiglaProv" minOccurs="0"/>
     *           &lt;element name="PEC" type="{}emailAddress" minOccurs="0"/>
     *           &lt;element name="FAX" type="{}varchar020" minOccurs="0"/>
     *         &lt;/sequence>
     *         &lt;sequence>
     *           &lt;element name="Cod_Destinatario" type="{}varchar020" maxOccurs="unbounded"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *       &lt;attribute name="tipo_vettore" use="required" type="{}vettore" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nominativo",
        "indirizzo",
        "cap",
        "citta",
        "provincia",
        "pec",
        "fax",
        "codDestinatario"
    })
    public static class Destinatario {

        @XmlElement(name = "Nominativo")
        protected String nominativo;
        @XmlElement(name = "Indirizzo")
        protected String indirizzo;
        @XmlElement(name = "Cap")
        protected String cap;
        @XmlElement(name = "Citta")
        protected String citta;
        @XmlElement(name = "Provincia")
        protected String provincia;
        @XmlElement(name = "PEC")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String pec;
        @XmlElement(name = "FAX")
        protected String fax;
        @XmlElement(name = "Cod_Destinatario")
        protected List<String> codDestinatario;
        @XmlAttribute(name = "tipo_vettore", required = true)
        protected String tipoVettore;

        /**
         * Gets the value of the nominativo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNominativo() {
            return nominativo;
        }

        /**
         * Sets the value of the nominativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNominativo(String value) {
            this.nominativo = value;
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
         * Gets the value of the citta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitta() {
            return citta;
        }

        /**
         * Sets the value of the citta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitta(String value) {
            this.citta = value;
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
         * Gets the value of the pec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPEC() {
            return pec;
        }

        /**
         * Sets the value of the pec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPEC(String value) {
            this.pec = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAX() {
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
        public void setFAX(String value) {
            this.fax = value;
        }

        /**
         * Gets the value of the codDestinatario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codDestinatario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodDestinatario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCodDestinatario() {
            if (codDestinatario == null) {
                codDestinatario = new ArrayList<String>();
            }
            return this.codDestinatario;
        }

        /**
         * Gets the value of the tipoVettore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoVettore() {
            return tipoVettore;
        }

        /**
         * Sets the value of the tipoVettore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoVettore(String value) {
            this.tipoVettore = value;
        }

    }

}
