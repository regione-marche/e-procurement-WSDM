
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inserisciArrivo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserisciArrivo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiestaProtocollaArrivo" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}protocollaArrivo"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}documento" minOccurs="0"/>
 *                   &lt;element name="confermaSegnatura" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "inserisciArrivo", propOrder = {
    "richiestaProtocollaArrivo"
})
public class InserisciArrivo {

    @XmlElement(namespace = "")
    protected InserisciArrivo.RichiestaProtocollaArrivo richiestaProtocollaArrivo;

    /**
     * Gets the value of the richiestaProtocollaArrivo property.
     * 
     * @return
     *     possible object is
     *     {@link InserisciArrivo.RichiestaProtocollaArrivo }
     *     
     */
    public InserisciArrivo.RichiestaProtocollaArrivo getRichiestaProtocollaArrivo() {
        return richiestaProtocollaArrivo;
    }

    /**
     * Sets the value of the richiestaProtocollaArrivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserisciArrivo.RichiestaProtocollaArrivo }
     *     
     */
    public void setRichiestaProtocollaArrivo(InserisciArrivo.RichiestaProtocollaArrivo value) {
        this.richiestaProtocollaArrivo = value;
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
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}protocollaArrivo"/>
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}documento" minOccurs="0"/>
     *         &lt;element name="confermaSegnatura" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "username",
        "protocollaArrivo",
        "documento",
        "confermaSegnatura"
    })
    public static class RichiestaProtocollaArrivo {

        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected ProtocollaArrivo protocollaArrivo;
        protected Documento documento;
        protected Boolean confermaSegnatura;

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the protocollaArrivo property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocollaArrivo }
         *     
         */
        public ProtocollaArrivo getProtocollaArrivo() {
            return protocollaArrivo;
        }

        /**
         * Sets the value of the protocollaArrivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocollaArrivo }
         *     
         */
        public void setProtocollaArrivo(ProtocollaArrivo value) {
            this.protocollaArrivo = value;
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

        /**
         * Gets the value of the confermaSegnatura property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isConfermaSegnatura() {
            return confermaSegnatura;
        }

        /**
         * Sets the value of the confermaSegnatura property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setConfermaSegnatura(Boolean value) {
            this.confermaSegnatura = value;
        }

    }

}
