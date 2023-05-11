
package it.marche.regione.paleowssec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiCorrispondente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiCorrispondente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paleo.regione.marche.it/services/}BEBase">
 *       &lt;sequence>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IstatComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://paleo.regione.marche.it/services/}TipoVoceRubrica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiCorrispondente", propOrder = {
    "cognome",
    "email",
    "idFiscale",
    "istatComune",
    "nome",
    "tipo"
})
@XmlSeeAlso({
    Rubrica.class
})
public class DatiCorrispondente
    extends BEBase
{

    @XmlElement(name = "Cognome", required = true, nillable = true)
    protected String cognome;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "IdFiscale", nillable = true)
    protected String idFiscale;
    @XmlElement(name = "IstatComune", nillable = true)
    protected String istatComune;
    @XmlElement(name = "Nome", nillable = true)
    protected String nome;
    @XmlElement(name = "Tipo")
    protected TipoVoceRubrica tipo;

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
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
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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
