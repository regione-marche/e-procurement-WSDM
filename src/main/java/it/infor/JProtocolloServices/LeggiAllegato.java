
package it.infor.JProtocolloServices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for leggiAllegato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="leggiAllegato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiestaLeggiAllegato" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}riferimento"/>
 *                   &lt;element name="progressivo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "leggiAllegato", propOrder = {
    "richiestaLeggiAllegato"
})
public class LeggiAllegato {

    @XmlElement(namespace = "")
    protected LeggiAllegato.RichiestaLeggiAllegato richiestaLeggiAllegato;

    /**
     * Gets the value of the richiestaLeggiAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link LeggiAllegato.RichiestaLeggiAllegato }
     *     
     */
    public LeggiAllegato.RichiestaLeggiAllegato getRichiestaLeggiAllegato() {
        return richiestaLeggiAllegato;
    }

    /**
     * Sets the value of the richiestaLeggiAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeggiAllegato.RichiestaLeggiAllegato }
     *     
     */
    public void setRichiestaLeggiAllegato(LeggiAllegato.RichiestaLeggiAllegato value) {
        this.richiestaLeggiAllegato = value;
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
     *         &lt;element name="progressivo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "progressivo"
    })
    public static class RichiestaLeggiAllegato {

        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected Riferimento riferimento;
        @XmlElement(required = true)
        protected BigInteger progressivo;

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
         * Gets the value of the progressivo property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProgressivo() {
            return progressivo;
        }

        /**
         * Sets the value of the progressivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProgressivo(BigInteger value) {
            this.progressivo = value;
        }

    }

}
