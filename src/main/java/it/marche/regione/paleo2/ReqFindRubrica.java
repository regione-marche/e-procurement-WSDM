
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqFindRubrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reqFindRubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IstatComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operatore" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://paleo.regione.marche.it/services/}TipoVoceRubrica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqFindRubrica", propOrder = {
    "codice",
    "descrizione",
    "email",
    "idFiscale",
    "istatComune",
    "operatore",
    "tipo"
})
public class ReqFindRubrica {

    @XmlElement(name = "Codice", nillable = true)
    protected String codice;
    @XmlElement(name = "Descrizione", nillable = true)
    protected String descrizione;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "IdFiscale", nillable = true)
    protected String idFiscale;
    @XmlElement(name = "IstatComune", nillable = true)
    protected String istatComune;
    @XmlElement(name = "Operatore", nillable = true)
    protected OperatorePaleo operatore;
    @XmlElement(name = "Tipo", nillable = true)
    protected TipoVoceRubrica tipo;

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
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the idFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscale() {
        return idFiscale;
    }

    /**
     * Sets the value of the idFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscale(String value) {
        this.idFiscale = value;
    }

    /**
     * Gets the value of the istatComune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstatComune() {
        return istatComune;
    }

    /**
     * Sets the value of the istatComune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstatComune(String value) {
        this.istatComune = value;
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
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoVoceRubrica }
     *     
     */
    public TipoVoceRubrica getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoVoceRubrica }
     *     
     */
    public void setTipo(TipoVoceRubrica value) {
        this.tipo = value;
    }

}
