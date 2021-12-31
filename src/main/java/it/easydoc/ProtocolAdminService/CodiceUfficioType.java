
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodiceUfficioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodiceUfficioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceOrganizzazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodiceUfficioType", propOrder = {
    "codice",
    "codiceOrganizzazione"
})
public class CodiceUfficioType {

    @XmlElement(name = "Codice", required = true)
    protected String codice;
    @XmlElement(name = "CodiceOrganizzazione", required = true)
    protected String codiceOrganizzazione;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Gets the value of the codiceOrganizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceOrganizzazione() {
        return codiceOrganizzazione;
    }

    /**
     * Sets the value of the codiceOrganizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceOrganizzazione(String value) {
        this.codiceOrganizzazione = value;
    }

}
