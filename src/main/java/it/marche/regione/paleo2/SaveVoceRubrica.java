
package it.marche.regione.paleo2;

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
 *         &lt;element name="operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="voce" type="{http://paleo.regione.marche.it/services/}Rubrica" minOccurs="0"/>
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
    "operatore",
    "voce"
})
@XmlRootElement(name = "SaveVoceRubrica")
public class SaveVoceRubrica {

    @XmlElement(nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(nillable = true)
    protected Rubrica voce;

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

    /**
     * Gets the value of the voce property.
     * 
     * @return
     *     possible object is
     *     {@link Rubrica }
     *     
     */
    public Rubrica getVoce() {
        return voce;
    }

    /**
     * Sets the value of the voce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rubrica }
     *     
     */
    public void setVoce(Rubrica value) {
        this.voce = value;
    }

}
