
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
 *         &lt;element name="dmRubricaForUpdate" type="{http://www.Abletech.it/Arxivar}Dm_Rubrica_ForUpdate" minOccurs="0"/>
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
    "dmRubricaForUpdate"
})
@XmlRootElement(name = "Dm_Rubrica_Update")
public class DmRubricaUpdate {

    protected String sessionId;
    protected DmRubricaForUpdate dmRubricaForUpdate;

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
     * Gets the value of the dmRubricaForUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link DmRubricaForUpdate }
     *     
     */
    public DmRubricaForUpdate getDmRubricaForUpdate() {
        return dmRubricaForUpdate;
    }

    /**
     * Sets the value of the dmRubricaForUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRubricaForUpdate }
     *     
     */
    public void setDmRubricaForUpdate(DmRubricaForUpdate value) {
        this.dmRubricaForUpdate = value;
    }

}
