
package it.abletech.arxivar.search;

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
 *         &lt;element name="dmTipiDocumentoCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dmTipiDocumentoCodice"
})
@XmlRootElement(name = "Dm_Profile_Select_Get_New_Instance_By_TipiDocumentoCodice")
public class DmProfileSelectGetNewInstanceByTipiDocumentoCodice {

    protected String sessionId;
    protected String dmTipiDocumentoCodice;

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
     * Gets the value of the dmTipiDocumentoCodice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmTipiDocumentoCodice() {
        return dmTipiDocumentoCodice;
    }

    /**
     * Sets the value of the dmTipiDocumentoCodice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmTipiDocumentoCodice(String value) {
        this.dmTipiDocumentoCodice = value;
    }

}
