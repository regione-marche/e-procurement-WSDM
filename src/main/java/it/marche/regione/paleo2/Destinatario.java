
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Destinatario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Destinatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerConoscenza" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destinatario", propOrder = {
    "codiceRubrica",
    "perConoscenza"
})
public class Destinatario {

    @XmlElement(name = "CodiceRubrica", nillable = true)
    protected String codiceRubrica;
    @XmlElement(name = "PerConoscenza")
    protected Boolean perConoscenza;

    /**
     * Gets the value of the codiceRubrica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRubrica() {
        return codiceRubrica;
    }

    /**
     * Sets the value of the codiceRubrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRubrica(String value) {
        this.codiceRubrica = value;
    }

    /**
     * Gets the value of the perConoscenza property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerConoscenza() {
        return perConoscenza;
    }

    /**
     * Sets the value of the perConoscenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerConoscenza(Boolean value) {
        this.perConoscenza = value;
    }

}
