
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqEffettuaTrasmissioni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqEffettuaTrasmissioni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InviaEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="Trasmissioni" type="{http://paleo.regione.marche.it/services2/}ArrayOfTrasmissioneDoc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqEffettuaTrasmissioni", propOrder = {
    "inviaEmail",
    "operatore",
    "trasmissioni"
})
public class ReqEffettuaTrasmissioni {

    @XmlElement(name = "InviaEmail")
    protected Boolean inviaEmail;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(name = "Trasmissioni", nillable = true)
    protected ArrayOfTrasmissioneDoc trasmissioni;

    /**
     * Gets the value of the inviaEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInviaEmail() {
        return inviaEmail;
    }

    /**
     * Sets the value of the inviaEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInviaEmail(Boolean value) {
        this.inviaEmail = value;
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

    /**
     * Gets the value of the trasmissioni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasmissioneDoc }
     *     
     */
    public ArrayOfTrasmissioneDoc getTrasmissioni() {
        return trasmissioni;
    }

    /**
     * Sets the value of the trasmissioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasmissioneDoc }
     *     
     */
    public void setTrasmissioni(ArrayOfTrasmissioneDoc value) {
        this.trasmissioni = value;
    }

}
