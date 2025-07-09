
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqCercaProtocollo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqCercaProtocollo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="Segnatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WithoutStream" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqCercaProtocollo", propOrder = {
    "docNumber",
    "operatore",
    "segnatura",
    "withoutStream"
})
public class ReqCercaProtocollo {

    @XmlElement(name = "DocNumber", nillable = true)
    protected Integer docNumber;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(name = "Segnatura", nillable = true)
    protected String segnatura;
    @XmlElement(name = "WithoutStream")
    protected Boolean withoutStream;

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

    /**
     * Gets the value of the segnatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnatura() {
        return segnatura;
    }

    /**
     * Sets the value of the segnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnatura(String value) {
        this.segnatura = value;
    }

    /**
     * Gets the value of the withoutStream property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithoutStream() {
        return withoutStream;
    }

    /**
     * Sets the value of the withoutStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithoutStream(Boolean value) {
        this.withoutStream = value;
    }

}
