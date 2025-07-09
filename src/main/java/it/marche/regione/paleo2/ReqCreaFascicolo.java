
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqCreaFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqCreaFascicolo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services2/}DatiNuovoFascicolo">
 *       &lt;sequence>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqCreaFascicolo", propOrder = {
    "numero",
    "operatore"
})
public class ReqCreaFascicolo
    extends DatiNuovoFascicolo
{

    @XmlElement(name = "Numero", nillable = true)
    protected Integer numero;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
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
