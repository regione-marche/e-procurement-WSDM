
package it.infor.JProtocolloServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}soggetto"/>
 *           &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}anagrafica"/>
 *           &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}amministrazione"/>
 *         &lt;/choice>
 *         &lt;element name="altriSoggetti" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}soggetto" minOccurs="0"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}anagrafica" minOccurs="0"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}amministrazione" minOccurs="0"/>
 *                 &lt;/sequence>
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
    "soggettoOrAnagraficaOrAmministrazione",
    "altriSoggetti"
})
@XmlRootElement(name = "soggetti")
public class Soggetti {

    @XmlElements({
        @XmlElement(name = "soggetto", type = Soggetto.class),
        @XmlElement(name = "anagrafica", type = Anagrafica.class),
        @XmlElement(name = "amministrazione", type = Amministrazione.class)
    })
    protected List<Object> soggettoOrAnagraficaOrAmministrazione;
    @XmlElement(nillable = true)
    protected List<Soggetti.AltriSoggetti> altriSoggetti;

    /**
     * Gets the value of the soggettoOrAnagraficaOrAmministrazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soggettoOrAnagraficaOrAmministrazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoggettoOrAnagraficaOrAmministrazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Soggetto }
     * {@link Anagrafica }
     * {@link Amministrazione }
     * 
     * 
     */
    public List<Object> getSoggettoOrAnagraficaOrAmministrazione() {
        if (soggettoOrAnagraficaOrAmministrazione == null) {
            soggettoOrAnagraficaOrAmministrazione = new ArrayList<Object>();
        }
        return this.soggettoOrAnagraficaOrAmministrazione;
    }

    /**
     * Gets the value of the altriSoggetti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altriSoggetti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltriSoggetti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Soggetti.AltriSoggetti }
     * 
     * 
     */
    public List<Soggetti.AltriSoggetti> getAltriSoggetti() {
        if (altriSoggetti == null) {
            altriSoggetti = new ArrayList<Soggetti.AltriSoggetti>();
        }
        return this.altriSoggetti;
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
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}soggetto" minOccurs="0"/>
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}anagrafica" minOccurs="0"/>
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}amministrazione" minOccurs="0"/>
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
        "soggetto",
        "anagrafica",
        "amministrazione"
    })
    public static class AltriSoggetti {

        protected Soggetto soggetto;
        protected Anagrafica anagrafica;
        protected Amministrazione amministrazione;

        /**
         * Gets the value of the soggetto property.
         * 
         * @return
         *     possible object is
         *     {@link Soggetto }
         *     
         */
        public Soggetto getSoggetto() {
            return soggetto;
        }

        /**
         * Sets the value of the soggetto property.
         * 
         * @param value
         *     allowed object is
         *     {@link Soggetto }
         *     
         */
        public void setSoggetto(Soggetto value) {
            this.soggetto = value;
        }

        /**
         * Gets the value of the anagrafica property.
         * 
         * @return
         *     possible object is
         *     {@link Anagrafica }
         *     
         */
        public Anagrafica getAnagrafica() {
            return anagrafica;
        }

        /**
         * Sets the value of the anagrafica property.
         * 
         * @param value
         *     allowed object is
         *     {@link Anagrafica }
         *     
         */
        public void setAnagrafica(Anagrafica value) {
            this.anagrafica = value;
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

    }

}
