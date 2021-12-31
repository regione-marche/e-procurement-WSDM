
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="dmRubricaSystemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ufficio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abitazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contatto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mansione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reparto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dmRubricaSystemId",
    "ufficio",
    "tel",
    "abitazione",
    "cell",
    "contatto",
    "email",
    "fax",
    "mansione",
    "reparto"
})
@XmlRootElement(name = "Dm_Contatti_Insert")
public class DmContattiInsert {

    protected String sessionId;
    protected int dmRubricaSystemId;
    protected String ufficio;
    protected String tel;
    protected String abitazione;
    protected String cell;
    protected String contatto;
    protected String email;
    protected String fax;
    protected String mansione;
    protected String reparto;

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
     * Gets the value of the dmRubricaSystemId property.
     * 
     */
    public int getDmRubricaSystemId() {
        return dmRubricaSystemId;
    }

    /**
     * Sets the value of the dmRubricaSystemId property.
     * 
     */
    public void setDmRubricaSystemId(int value) {
        this.dmRubricaSystemId = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfficio() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfficio(String value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the abitazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbitazione() {
        return abitazione;
    }

    /**
     * Sets the value of the abitazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbitazione(String value) {
        this.abitazione = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCell() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCell(String value) {
        this.cell = value;
    }

    /**
     * Gets the value of the contatto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContatto() {
        return contatto;
    }

    /**
     * Sets the value of the contatto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContatto(String value) {
        this.contatto = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the mansione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMansione() {
        return mansione;
    }

    /**
     * Sets the value of the mansione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMansione(String value) {
        this.mansione = value;
    }

    /**
     * Gets the value of the reparto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReparto() {
        return reparto;
    }

    /**
     * Sets the value of the reparto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReparto(String value) {
        this.reparto = value;
    }

}
