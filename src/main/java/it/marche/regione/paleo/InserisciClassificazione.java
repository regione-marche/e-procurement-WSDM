
package it.marche.regione.paleo;

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
 *         &lt;element name="opp" type="{http://paleo.regione.marche.it/services/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="classificazione" type="{http://paleo.regione.marche.it/services/}Classificazione2" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "opp",
    "classificazione",
    "docNumber"
})
@XmlRootElement(name = "InserisciClassificazione")
public class InserisciClassificazione {

    @XmlElement(nillable = true)
    protected OperatorePaleo opp;
    @XmlElement(nillable = true)
    protected Classificazione2 classificazione;
    protected Integer docNumber;

    /**
     * Gets the value of the opp property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOpp() {
        return opp;
    }

    /**
     * Sets the value of the opp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOpp(OperatorePaleo value) {
        this.opp = value;
    }

    /**
     * Gets the value of the classificazione property.
     * 
     * @return
     *     possible object is
     *     {@link Classificazione2 }
     *     
     */
    public Classificazione2 getClassificazione() {
        return classificazione;
    }

    /**
     * Sets the value of the classificazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classificazione2 }
     *     
     */
    public void setClassificazione(Classificazione2 value) {
        this.classificazione = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
    }

}
