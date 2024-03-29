
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confermaSegnatura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confermaSegnatura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiestaConfermaSegnatura" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}riferimento"/>
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
@XmlType(name = "confermaSegnatura", propOrder = {
    "richiestaConfermaSegnatura"
})
public class ConfermaSegnatura {

    @XmlElement(namespace = "")
    protected ConfermaSegnatura.RichiestaConfermaSegnatura richiestaConfermaSegnatura;

    /**
     * Gets the value of the richiestaConfermaSegnatura property.
     * 
     * @return
     *     possible object is
     *     {@link ConfermaSegnatura.RichiestaConfermaSegnatura }
     *     
     */
    public ConfermaSegnatura.RichiestaConfermaSegnatura getRichiestaConfermaSegnatura() {
        return richiestaConfermaSegnatura;
    }

    /**
     * Sets the value of the richiestaConfermaSegnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfermaSegnatura.RichiestaConfermaSegnatura }
     *     
     */
    public void setRichiestaConfermaSegnatura(ConfermaSegnatura.RichiestaConfermaSegnatura value) {
        this.richiestaConfermaSegnatura = value;
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
     *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}riferimento"/>
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
        "username",
        "riferimento",
        "documento"
    })
    public static class RichiestaConfermaSegnatura {

        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected Riferimento riferimento;
        protected Documento documento;

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
         * Gets the value of the riferimento property.
         * 
         * @return
         *     possible object is
         *     {@link Riferimento }
         *     
         */
        public Riferimento getRiferimento() {
            return riferimento;
        }

        /**
         * Sets the value of the riferimento property.
         * 
         * @param value
         *     allowed object is
         *     {@link Riferimento }
         *     
         */
        public void setRiferimento(Riferimento value) {
            this.riferimento = value;
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
