
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
 *         &lt;element name="docnumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PathErp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idErp",
    "pathErp"
})
@XmlRootElement(name = "SD_ASSOCDOC_Insert")
public class SDASSOCDOCInsert {

    protected String sessionId;
    protected int docnumber;
    protected String idErp;
    @XmlElement(name = "PathErp")
    protected String pathErp;

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
     * Gets the value of the idErp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdErp() {
        return idErp;
    }

    /**
     * Sets the value of the idErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdErp(String value) {
        this.idErp = value;
    }

    /**
     * Gets the value of the pathErp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathErp() {
        return pathErp;
    }

    /**
     * Sets the value of the pathErp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathErp(String value) {
        this.pathErp = value;
    }

}
