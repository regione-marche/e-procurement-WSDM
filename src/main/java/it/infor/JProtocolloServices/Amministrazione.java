
package it.infor.JProtocolloServices;

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
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}ente"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}aoo" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.jprotocollo.jente.infor.arezzo.it/}uo" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ente",
    "aoo",
    "uo",
    "nota"
})
@XmlRootElement(name = "amministrazione")
public class Amministrazione {

    @XmlElement(required = true)
    protected Ente ente;
    protected Aoo aoo;
    protected Uo uo;
    protected String nota;

    /**
     * Gets the value of the ente property.
     * 
     * @return
     *     possible object is
     *     {@link Ente }
     *     
     */
    public Ente getEnte() {
        return ente;
    }

    /**
     * Sets the value of the ente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ente }
     *     
     */
    public void setEnte(Ente value) {
        this.ente = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link Aoo }
     *     
     */
    public Aoo getAoo() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aoo }
     *     
     */
    public void setAoo(Aoo value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the uo property.
     * 
     * @return
     *     possible object is
     *     {@link Uo }
     *     
     */
    public Uo getUo() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uo }
     *     
     */
    public void setUo(Uo value) {
        this.uo = value;
    }

    /**
     * Gets the value of the nota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Sets the value of the nota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

}
