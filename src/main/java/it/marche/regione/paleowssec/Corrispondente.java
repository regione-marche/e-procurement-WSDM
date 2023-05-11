
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Corrispondente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Corrispondente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceRubrica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrispondenteOccasionale" type="{http://paleo.regione.marche.it/services/}DatiCorrispondente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Corrispondente", propOrder = {
    "codiceRubrica",
    "corrispondenteOccasionale"
})
public class Corrispondente {

    @XmlElement(name = "CodiceRubrica", nillable = true)
    protected String codiceRubrica;
    @XmlElement(name = "CorrispondenteOccasionale", nillable = true)
    protected DatiCorrispondente corrispondenteOccasionale;

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
     * Gets the value of the corrispondenteOccasionale property.
     * 
     * @return
     *     possible object is
     *     {@link DatiCorrispondente }
     *     
     */
    public DatiCorrispondente getCorrispondenteOccasionale() {
        return corrispondenteOccasionale;
    }

    /**
     * Sets the value of the corrispondenteOccasionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiCorrispondente }
     *     
     */
    public void setCorrispondenteOccasionale(DatiCorrispondente value) {
        this.corrispondenteOccasionale = value;
    }

}
