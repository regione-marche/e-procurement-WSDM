//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 02:39:26 PM CET 
//


package it.prisma.segnaturaaltri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}Intestazione"/>
 *         &lt;element ref="{}Descrizione" minOccurs="0"/>
 *         &lt;element ref="{}ApplicativoProtocollo" minOccurs="0"/>
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
    "intestazione",
    "descrizione",
    "applicativoProtocollo"
})
@XmlRootElement(name = "Segnatura")
public class Segnatura {

    @XmlElement(name = "Intestazione", required = true)
    protected Intestazione intestazione;
    @XmlElement(name = "Descrizione")
    protected Descrizione descrizione;
    @XmlElement(name = "ApplicativoProtocollo")
    protected ApplicativoProtocollo applicativoProtocollo;

    /**
     * Gets the value of the intestazione property.
     * 
     * @return
     *     possible object is
     *     {@link Intestazione }
     *     
     */
    public Intestazione getIntestazione() {
        return intestazione;
    }

    /**
     * Sets the value of the intestazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intestazione }
     *     
     */
    public void setIntestazione(Intestazione value) {
        this.intestazione = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link Descrizione }
     *     
     */
    public Descrizione getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descrizione }
     *     
     */
    public void setDescrizione(Descrizione value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the applicativoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicativoProtocollo }
     *     
     */
    public ApplicativoProtocollo getApplicativoProtocollo() {
        return applicativoProtocollo;
    }

    /**
     * Sets the value of the applicativoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicativoProtocollo }
     *     
     */
    public void setApplicativoProtocollo(ApplicativoProtocollo value) {
        this.applicativoProtocollo = value;
    }

}
