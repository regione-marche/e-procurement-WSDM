
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inserisciInternoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserisciInternoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rispostaProtocolla" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}segnatura" minOccurs="0"/>
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
@XmlType(name = "inserisciInternoResponse", propOrder = {
    "rispostaProtocolla"
})
public class InserisciInternoResponse {

    @XmlElement(namespace = "")
    protected InserisciInternoResponse.RispostaProtocolla rispostaProtocolla;

    /**
     * Gets the value of the rispostaProtocolla property.
     * 
     * @return
     *     possible object is
     *     {@link InserisciInternoResponse.RispostaProtocolla }
     *     
     */
    public InserisciInternoResponse.RispostaProtocolla getRispostaProtocolla() {
        return rispostaProtocolla;
    }

    /**
     * Sets the value of the rispostaProtocolla property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserisciInternoResponse.RispostaProtocolla }
     *     
     */
    public void setRispostaProtocolla(InserisciInternoResponse.RispostaProtocolla value) {
        this.rispostaProtocolla = value;
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
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}segnatura" minOccurs="0"/>
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
        "segnatura"
    })
    public static class RispostaProtocolla {

        @XmlElement(required = true)
        protected String esito;
        @XmlElement(required = true)
        protected String messaggio;
        protected Segnatura segnatura;

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
         * Gets the value of the segnatura property.
         * 
         * @return
         *     possible object is
         *     {@link Segnatura }
         *     
         */
        public Segnatura getSegnatura() {
            return segnatura;
        }

        /**
         * Sets the value of the segnatura property.
         * 
         * @param value
         *     allowed object is
         *     {@link Segnatura }
         *     
         */
        public void setSegnatura(Segnatura value) {
            this.segnatura = value;
        }

    }

}
