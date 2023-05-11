
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocollazioneRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocollazioneRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lngNumPG" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lngAnnoPG" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="strDataPG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lngErrNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="strErrString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocollazioneRet", propOrder = {
    "lngNumPG",
    "lngAnnoPG",
    "strDataPG",
    "lngErrNumber",
    "strErrString"
})
public class ProtocollazioneRet {

    protected long lngNumPG;
    protected long lngAnnoPG;
    protected String strDataPG;
    protected long lngErrNumber;
    protected String strErrString;

    /**
     * Gets the value of the lngNumPG property.
     * 
     */
    public long getLngNumPG() {
        return lngNumPG;
    }

    /**
     * Sets the value of the lngNumPG property.
     * 
     */
    public void setLngNumPG(long value) {
        this.lngNumPG = value;
    }

    /**
     * Gets the value of the lngAnnoPG property.
     * 
     */
    public long getLngAnnoPG() {
        return lngAnnoPG;
    }

    /**
     * Sets the value of the lngAnnoPG property.
     * 
     */
    public void setLngAnnoPG(long value) {
        this.lngAnnoPG = value;
    }

    /**
     * Gets the value of the strDataPG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDataPG() {
        return strDataPG;
    }

    /**
     * Sets the value of the strDataPG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDataPG(String value) {
        this.strDataPG = value;
    }

    /**
     * Gets the value of the lngErrNumber property.
     * 
     */
    public long getLngErrNumber() {
        return lngErrNumber;
    }

    /**
     * Sets the value of the lngErrNumber property.
     * 
     */
    public void setLngErrNumber(long value) {
        this.lngErrNumber = value;
    }

    /**
     * Gets the value of the strErrString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrErrString() {
        return strErrString;
    }

    /**
     * Sets the value of the strErrString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrErrString(String value) {
        this.strErrString = value;
    }

}
