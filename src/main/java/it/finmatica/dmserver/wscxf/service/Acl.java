
package it.finmatica.dmserver.wscxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCompetenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utenteGruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acl", propOrder = {
    "accesso",
    "tipoCompetenza",
    "utenteGruppo"
})
public class Acl {

    protected String accesso;
    protected String tipoCompetenza;
    protected String utenteGruppo;

    /**
     * Gets the value of the accesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesso() {
        return accesso;
    }

    /**
     * Sets the value of the accesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesso(String value) {
        this.accesso = value;
    }

    /**
     * Gets the value of the tipoCompetenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCompetenza() {
        return tipoCompetenza;
    }

    /**
     * Sets the value of the tipoCompetenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCompetenza(String value) {
        this.tipoCompetenza = value;
    }

    /**
     * Gets the value of the utenteGruppo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtenteGruppo() {
        return utenteGruppo;
    }

    /**
     * Sets the value of the utenteGruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtenteGruppo(String value) {
        this.utenteGruppo = value;
    }

}
