
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqCercaProtocolliCorrispondente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqCercaProtocolliCorrispondente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdFiscaleCorrispondente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqCercaProtocolliCorrispondente", propOrder = {
    "idFiscaleCorrispondente",
    "operatore",
    "tipoDocumento"
})
public class ReqCercaProtocolliCorrispondente {

    @XmlElement(name = "IdFiscaleCorrispondente", nillable = true)
    protected String idFiscaleCorrispondente;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(name = "TipoDocumento", nillable = true)
    protected String tipoDocumento;

    /**
     * Gets the value of the idFiscaleCorrispondente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscaleCorrispondente() {
        return idFiscaleCorrispondente;
    }

    /**
     * Sets the value of the idFiscaleCorrispondente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscaleCorrispondente(String value) {
        this.idFiscaleCorrispondente = value;
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
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
