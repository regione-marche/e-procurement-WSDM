
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
 *         &lt;element name="docnumberFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docnumberTo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "docnumberFrom",
    "docnumberTo"
})
@XmlRootElement(name = "Dm_Relazioni_Insert")
public class DmRelazioniInsert {

    protected String sessionId;
    protected int docnumberFrom;
    protected int docnumberTo;

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
     * Gets the value of the docnumberFrom property.
     * 
     */
    public int getDocnumberFrom() {
        return docnumberFrom;
    }

    /**
     * Sets the value of the docnumberFrom property.
     * 
     */
    public void setDocnumberFrom(int value) {
        this.docnumberFrom = value;
    }

    /**
     * Gets the value of the docnumberTo property.
     * 
     */
    public int getDocnumberTo() {
        return docnumberTo;
    }

    /**
     * Sets the value of the docnumberTo property.
     * 
     */
    public void setDocnumberTo(int value) {
        this.docnumberTo = value;
    }

}
