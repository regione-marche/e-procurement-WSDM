
package it.archiflow93;

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
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oCardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="enHistoryOperation" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}HistoryOperation" minOccurs="0"/>
 *         &lt;element name="strCustomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strSessionId",
    "oCardId",
    "enHistoryOperation",
    "strCustomDescription"
})
@XmlRootElement(name = "WriteCardHistory")
public class WriteCardHistory {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected String oCardId;
    protected HistoryOperation enHistoryOperation;
    @XmlElement(nillable = true)
    protected String strCustomDescription;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the oCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCardId() {
        return oCardId;
    }

    /**
     * Sets the value of the oCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCardId(String value) {
        this.oCardId = value;
    }

    /**
     * Gets the value of the enHistoryOperation property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryOperation }
     *     
     */
    public HistoryOperation getEnHistoryOperation() {
        return enHistoryOperation;
    }

    /**
     * Sets the value of the enHistoryOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryOperation }
     *     
     */
    public void setEnHistoryOperation(HistoryOperation value) {
        this.enHistoryOperation = value;
    }

    /**
     * Gets the value of the strCustomDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCustomDescription() {
        return strCustomDescription;
    }

    /**
     * Sets the value of the strCustomDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCustomDescription(String value) {
        this.strCustomDescription = value;
    }

}
