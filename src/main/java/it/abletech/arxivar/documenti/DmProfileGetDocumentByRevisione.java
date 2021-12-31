
package it.abletech.arxivar.documenti;

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
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="revisione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="autoSwitchToDmRevisioni" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "docNumber",
    "revisione",
    "autoSwitchToDmRevisioni"
})
@XmlRootElement(name = "Dm_Profile_GetDocument_By_Revisione")
public class DmProfileGetDocumentByRevisione {

    protected String sessionId;
    protected int docNumber;
    protected int revisione;
    protected boolean autoSwitchToDmRevisioni;

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
     * Gets the value of the docNumber property.
     * 
     */
    public int getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     */
    public void setDocNumber(int value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     */
    public int getRevisione() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     */
    public void setRevisione(int value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the autoSwitchToDmRevisioni property.
     * 
     */
    public boolean isAutoSwitchToDmRevisioni() {
        return autoSwitchToDmRevisioni;
    }

    /**
     * Sets the value of the autoSwitchToDmRevisioni property.
     * 
     */
    public void setAutoSwitchToDmRevisioni(boolean value) {
        this.autoSwitchToDmRevisioni = value;
    }

}