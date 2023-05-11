
package it.infor.JProtocolloGenServices;

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
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeTabella" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codifica" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}codificaType" minOccurs="0"/>
 *         &lt;element name="datiRicerca" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}datiRicercaTabelleType" minOccurs="0"/>
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
    "username",
    "nomeTabella",
    "operazione",
    "codifica",
    "datiRicerca"
})
@XmlRootElement(name = "richiestaGestioneTabelle")
public class RichiestaGestioneTabelle {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String nomeTabella;
    @XmlElement(required = true)
    protected String operazione;
    protected CodificaType codifica;
    protected DatiRicercaTabelleType datiRicerca;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the nomeTabella property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTabella() {
        return nomeTabella;
    }

    /**
     * Sets the value of the nomeTabella property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTabella(String value) {
        this.nomeTabella = value;
    }

    /**
     * Gets the value of the operazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperazione() {
        return operazione;
    }

    /**
     * Sets the value of the operazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperazione(String value) {
        this.operazione = value;
    }

    /**
     * Gets the value of the codifica property.
     * 
     * @return
     *     possible object is
     *     {@link CodificaType }
     *     
     */
    public CodificaType getCodifica() {
        return codifica;
    }

    /**
     * Sets the value of the codifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodificaType }
     *     
     */
    public void setCodifica(CodificaType value) {
        this.codifica = value;
    }

    /**
     * Gets the value of the datiRicerca property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRicercaTabelleType }
     *     
     */
    public DatiRicercaTabelleType getDatiRicerca() {
        return datiRicerca;
    }

    /**
     * Sets the value of the datiRicerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRicercaTabelleType }
     *     
     */
    public void setDatiRicerca(DatiRicercaTabelleType value) {
        this.datiRicerca = value;
    }

}
