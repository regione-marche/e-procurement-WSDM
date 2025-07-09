
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqEliminaClassificazione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqEliminaClassificazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceFascicolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqEliminaClassificazione", propOrder = {
    "codiceFascicolo",
    "docNumber",
    "operatore"
})
public class ReqEliminaClassificazione {

    @XmlElement(name = "CodiceFascicolo", nillable = true)
    protected String codiceFascicolo;
    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;

    /**
     * Gets the value of the codiceFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFascicolo() {
        return codiceFascicolo;
    }

    /**
     * Sets the value of the codiceFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFascicolo(String value) {
        this.codiceFascicolo = value;
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

    /**
     * Gets the value of the operatore property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOperatore() {
        return operatore;
    }

    /**
     * Sets the value of the operatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOperatore(OperatorePaleo value) {
        this.operatore = value;
    }

}
