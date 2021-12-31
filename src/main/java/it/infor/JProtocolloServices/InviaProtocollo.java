
package it.infor.JProtocolloServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inviaProtocollo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inviaProtocollo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiestaInviaProtocollo" minOccurs="0" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}riferimento"/>
 *                   &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "inviaProtocollo", propOrder = {
    "richiestaInviaProtocollo"
})
public class InviaProtocollo {

    @XmlElement(namespace = "")
    protected InviaProtocollo.RichiestaInviaProtocollo richiestaInviaProtocollo;

    /**
     * Gets the value of the richiestaInviaProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link InviaProtocollo.RichiestaInviaProtocollo }
     *     
     */
    public InviaProtocollo.RichiestaInviaProtocollo getRichiestaInviaProtocollo() {
        return richiestaInviaProtocollo;
    }

    /**
     * Sets the value of the richiestaInviaProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InviaProtocollo.RichiestaInviaProtocollo }
     *     
     */
    public void setRichiestaInviaProtocollo(InviaProtocollo.RichiestaInviaProtocollo value) {
        this.richiestaInviaProtocollo = value;
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
     *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "account"
    })
    public static class RichiestaInviaProtocollo {

        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected Riferimento riferimento;
        protected String account;

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
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccount(String value) {
            this.account = value;
        }

    }

}
