
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
 *         &lt;element name="docnumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="utente" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "docnumber",
    "utente"
})
@XmlRootElement(name = "Dm_SecurityDoc_GetData_By_Docnumber_Utente")
public class DmSecurityDocGetDataByDocnumberUtente {

    protected String sessionId;
    protected int docnumber;
    protected int utente;

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
     * Gets the value of the docnumber property.
     * 
     */
    public int getDocnumber() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     */
    public void setDocnumber(int value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     */
    public int getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     */
    public void setUtente(int value) {
        this.utente = value;
    }

}