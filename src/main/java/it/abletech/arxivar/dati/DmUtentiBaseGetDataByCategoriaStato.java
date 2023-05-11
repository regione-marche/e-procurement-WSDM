
package it.abletech.arxivar.dati;

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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_Categoria"/>
 *         &lt;element name="statoUtente" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_StatoUtente"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionId",
    "categoria",
    "statoUtente",
    "orderBy"
})
@XmlRootElement(name = "Dm_UtentiBase_GetData_By_Categoria_Stato")
public class DmUtentiBaseGetDataByCategoriaStato {

    protected String sessionId;
    @XmlElement(required = true)
    protected DmUtentiCategoria categoria;
    @XmlElement(required = true)
    protected DmUtentiStatoUtente statoUtente;
    protected String orderBy;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiCategoria }
     *     
     */
    public DmUtentiCategoria getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiCategoria }
     *     
     */
    public void setCategoria(DmUtentiCategoria value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the statoUtente property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiStatoUtente }
     *     
     */
    public DmUtentiStatoUtente getStatoUtente() {
        return statoUtente;
    }

    /**
     * Sets the value of the statoUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiStatoUtente }
     *     
     */
    public void setStatoUtente(DmUtentiStatoUtente value) {
        this.statoUtente = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

}
