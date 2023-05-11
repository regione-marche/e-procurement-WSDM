
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
 *         &lt;element name="accesso" type="{http://www.Abletech.it/Arxivar}Dm_Permessi_Rubrica_Accesso"/>
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
    "accesso",
    "orderBy"
})
@XmlRootElement(name = "Dm_CatRubriche_Get_Data_By_Dm_Permessi_Rubrica_Accesso")
public class DmCatRubricheGetDataByDmPermessiRubricaAccesso {

    protected String sessionId;
    @XmlElement(required = true)
    protected DmPermessiRubricaAccesso accesso;
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
     * Gets the value of the accesso property.
     * 
     * @return
     *     possible object is
     *     {@link DmPermessiRubricaAccesso }
     *     
     */
    public DmPermessiRubricaAccesso getAccesso() {
        return accesso;
    }

    /**
     * Sets the value of the accesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPermessiRubricaAccesso }
     *     
     */
    public void setAccesso(DmPermessiRubricaAccesso value) {
        this.accesso = value;
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
