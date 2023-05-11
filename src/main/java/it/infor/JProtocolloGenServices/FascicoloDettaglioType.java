
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fascicoloDettaglioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fascicoloDettaglioType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}fascicoloRiferimentoType">
 *       &lt;sequence>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCreazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataChiusura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="causaleChiusura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altriDati" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ubicazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="scarto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="attributi" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attributo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="attributo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="attributo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="attributo4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ufficio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="corrispondente" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}corrispondenteType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fascicoloDettaglioType", propOrder = {
    "descrizione",
    "dataCreazione",
    "dataChiusura",
    "causaleChiusura",
    "altriDati",
    "ufficio"
})
public class FascicoloDettaglioType
    extends FascicoloRiferimentoType
{

    protected String descrizione;
    protected String dataCreazione;
    protected String dataChiusura;
    protected String causaleChiusura;
    protected FascicoloDettaglioType.AltriDati altriDati;
    protected FascicoloDettaglioType.Ufficio ufficio;

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the dataCreazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Sets the value of the dataCreazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCreazione(String value) {
        this.dataCreazione = value;
    }

    /**
     * Gets the value of the dataChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataChiusura() {
        return dataChiusura;
    }

    /**
     * Sets the value of the dataChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataChiusura(String value) {
        this.dataChiusura = value;
    }

    /**
     * Gets the value of the causaleChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausaleChiusura() {
        return causaleChiusura;
    }

    /**
     * Sets the value of the causaleChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausaleChiusura(String value) {
        this.causaleChiusura = value;
    }

    /**
     * Gets the value of the altriDati property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDettaglioType.AltriDati }
     *     
     */
    public FascicoloDettaglioType.AltriDati getAltriDati() {
        return altriDati;
    }

    /**
     * Sets the value of the altriDati property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDettaglioType.AltriDati }
     *     
     */
    public void setAltriDati(FascicoloDettaglioType.AltriDati value) {
        this.altriDati = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloDettaglioType.Ufficio }
     *     
     */
    public FascicoloDettaglioType.Ufficio getUfficio() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloDettaglioType.Ufficio }
     *     
     */
    public void setUfficio(FascicoloDettaglioType.Ufficio value) {
        this.ufficio = value;
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
     *         &lt;element name="ubicazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="scarto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="attributi" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attributo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="attributo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="attributo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="attributo4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ubicazione",
        "note",
        "scarto",
        "attributi"
    })
    public static class AltriDati {

        protected String ubicazione;
        protected String note;
        protected String scarto;
        protected FascicoloDettaglioType.AltriDati.Attributi attributi;

        /**
         * Gets the value of the ubicazione property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUbicazione() {
            return ubicazione;
        }

        /**
         * Sets the value of the ubicazione property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUbicazione(String value) {
            this.ubicazione = value;
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
         * Gets the value of the scarto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScarto() {
            return scarto;
        }

        /**
         * Sets the value of the scarto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScarto(String value) {
            this.scarto = value;
        }

        /**
         * Gets the value of the attributi property.
         * 
         * @return
         *     possible object is
         *     {@link FascicoloDettaglioType.AltriDati.Attributi }
         *     
         */
        public FascicoloDettaglioType.AltriDati.Attributi getAttributi() {
            return attributi;
        }

        /**
         * Sets the value of the attributi property.
         * 
         * @param value
         *     allowed object is
         *     {@link FascicoloDettaglioType.AltriDati.Attributi }
         *     
         */
        public void setAttributi(FascicoloDettaglioType.AltriDati.Attributi value) {
            this.attributi = value;
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
         *         &lt;element name="attributo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="attributo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="attributo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="attributo4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "attributo1",
            "attributo2",
            "attributo3",
            "attributo4"
        })
        public static class Attributi {

            protected String attributo1;
            protected String attributo2;
            protected String attributo3;
            protected String attributo4;

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
             * Gets the value of the attributo3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributo3() {
                return attributo3;
            }

            /**
             * Sets the value of the attributo3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributo3(String value) {
                this.attributo3 = value;
            }

            /**
             * Gets the value of the attributo4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributo4() {
                return attributo4;
            }

            /**
             * Sets the value of the attributo4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributo4(String value) {
                this.attributo4 = value;
            }

        }

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
     *         &lt;element name="corrispondente" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}corrispondenteType"/>
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
        "corrispondente"
    })
    public static class Ufficio {

        @XmlElement(required = true)
        protected CorrispondenteType corrispondente;

        /**
         * Gets the value of the corrispondente property.
         * 
         * @return
         *     possible object is
         *     {@link CorrispondenteType }
         *     
         */
        public CorrispondenteType getCorrispondente() {
            return corrispondente;
        }

        /**
         * Sets the value of the corrispondente property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorrispondenteType }
         *     
         */
        public void setCorrispondente(CorrispondenteType value) {
            this.corrispondente = value;
        }

    }

}
