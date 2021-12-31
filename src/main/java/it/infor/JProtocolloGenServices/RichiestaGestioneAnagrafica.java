
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
 *         &lt;element name="operazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anagrafica" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}anagraficaType" minOccurs="0"/>
 *         &lt;element name="datiRicerca" type="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}datiRicercaAnagraficaType" minOccurs="0"/>
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
    "operazione",
    "anagrafica",
    "datiRicerca"
})
@XmlRootElement(name = "richiestaGestioneAnagrafica")
public class RichiestaGestioneAnagrafica {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String operazione;
    protected AnagraficaType anagrafica;
    protected DatiRicercaAnagraficaType datiRicerca;

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
     * Gets the value of the anagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link AnagraficaType }
     *     
     */
    public AnagraficaType getAnagrafica() {
        return anagrafica;
    }

    /**
     * Sets the value of the anagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnagraficaType }
     *     
     */
    public void setAnagrafica(AnagraficaType value) {
        this.anagrafica = value;
    }

    /**
     * Gets the value of the datiRicerca property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRicercaAnagraficaType }
     *     
     */
    public DatiRicercaAnagraficaType getDatiRicerca() {
        return datiRicerca;
    }

    /**
     * Sets the value of the datiRicerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRicercaAnagraficaType }
     *     
     */
    public void setDatiRicerca(DatiRicercaAnagraficaType value) {
        this.datiRicerca = value;
    }

}
