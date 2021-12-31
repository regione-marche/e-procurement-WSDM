
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for leggiProtocolloResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="leggiProtocolloResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispostaLeggiProtocollo" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}protocollo" minOccurs="0"/>
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
@XmlType(name = "leggiProtocolloResponse", propOrder = {
    "rispostaLeggiProtocollo"
})
public class LeggiProtocolloResponse {

    @XmlElement(namespace = "")
    protected LeggiProtocolloResponse.RispostaLeggiProtocollo rispostaLeggiProtocollo;

    /**
     * Gets the value of the rispostaLeggiProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link LeggiProtocolloResponse.RispostaLeggiProtocollo }
     *     
     */
    public LeggiProtocolloResponse.RispostaLeggiProtocollo getRispostaLeggiProtocollo() {
        return rispostaLeggiProtocollo;
    }

    /**
     * Sets the value of the rispostaLeggiProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeggiProtocolloResponse.RispostaLeggiProtocollo }
     *     
     */
    public void setRispostaLeggiProtocollo(LeggiProtocolloResponse.RispostaLeggiProtocollo value) {
        this.rispostaLeggiProtocollo = value;
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
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}protocollo" minOccurs="0"/>
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
        "protocollo"
    })
    public static class RispostaLeggiProtocollo {

        @XmlElement(required = true)
        protected String esito;
        @XmlElement(required = true)
        protected String messaggio;
        protected Protocollo protocollo;

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
         * Gets the value of the protocollo property.
         * 
         * @return
         *     possible object is
         *     {@link Protocollo }
         *     
         */
        public Protocollo getProtocollo() {
            return protocollo;
        }

        /**
         * Sets the value of the protocollo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Protocollo }
         *     
         */
        public void setProtocollo(Protocollo value) {
            this.protocollo = value;
        }

    }

}
