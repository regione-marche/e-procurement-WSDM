
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for leggiAllegatoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="leggiAllegatoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispostaLeggiAllegato" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}documento" minOccurs="0"/>
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
@XmlType(name = "leggiAllegatoResponse", propOrder = {
    "rispostaLeggiAllegato"
})
public class LeggiAllegatoResponse {

    @XmlElement(namespace = "")
    protected LeggiAllegatoResponse.RispostaLeggiAllegato rispostaLeggiAllegato;

    /**
     * Gets the value of the rispostaLeggiAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link LeggiAllegatoResponse.RispostaLeggiAllegato }
     *     
     */
    public LeggiAllegatoResponse.RispostaLeggiAllegato getRispostaLeggiAllegato() {
        return rispostaLeggiAllegato;
    }

    /**
     * Sets the value of the rispostaLeggiAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeggiAllegatoResponse.RispostaLeggiAllegato }
     *     
     */
    public void setRispostaLeggiAllegato(LeggiAllegatoResponse.RispostaLeggiAllegato value) {
        this.rispostaLeggiAllegato = value;
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
     *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}documento" minOccurs="0"/>
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
        "esito",
        "messaggio",
        "documento"
    })
    public static class RispostaLeggiAllegato {

        @XmlElement(required = true)
        protected String esito;
        @XmlElement(required = true)
        protected String messaggio;
        protected Documento documento;

        /**
         * Gets the value of the esito property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEsito() {
            return esito;
        }

        /**
         * Sets the value of the esito property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEsito(String value) {
            this.esito = value;
        }

        /**
         * Gets the value of the messaggio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessaggio() {
            return messaggio;
        }

        /**
         * Sets the value of the messaggio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessaggio(String value) {
            this.messaggio = value;
        }

        /**
         * Gets the value of the documento property.
         * 
         * @return
         *     possible object is
         *     {@link Documento }
         *     
         */
        public Documento getDocumento() {
            return documento;
        }

        /**
         * Sets the value of the documento property.
         * 
         * @param value
         *     allowed object is
         *     {@link Documento }
         *     
         */
        public void setDocumento(Documento value) {
            this.documento = value;
        }

    }

}
