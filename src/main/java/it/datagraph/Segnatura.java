
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Segnatura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segnatura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Intestazione" type="{}Intestazione" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{}Descrizione" minOccurs="0"/>
 *         &lt;element name="ApplicativoProtocollo" type="{}ApplicativoProtocollo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="noNamespaceSchemaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segnatura", namespace = "", propOrder = {
    "intestazione",
    "descrizione",
    "applicativoProtocollo"
})
public class Segnatura {

    @XmlElement(name = "Intestazione")
    protected Intestazione intestazione;
    @XmlElement(name = "Descrizione")
    protected Descrizione descrizione;
    @XmlElement(name = "ApplicativoProtocollo")
    protected ApplicativoProtocollo applicativoProtocollo;
    @XmlAttribute(name = "noNamespaceSchemaLocation")
    protected String noNamespaceSchemaLocation;

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

    /**
     * Gets the value of the noNamespaceSchemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNamespaceSchemaLocation() {
        return noNamespaceSchemaLocation;
    }

    /**
     * Sets the value of the noNamespaceSchemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNamespaceSchemaLocation(String value) {
        this.noNamespaceSchemaLocation = value;
    }

}
