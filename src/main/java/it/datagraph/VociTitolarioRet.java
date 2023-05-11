
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VociTitolarioRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VociTitolarioRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Voci" type="{http://tempuri.org/}ArrayOfVoceTitolario" minOccurs="0"/>
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
@XmlType(name = "VociTitolarioRet", propOrder = {
    "count",
    "voci",
    "lngErrNumber",
    "strErrString"
})
public class VociTitolarioRet {

    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "Voci")
    protected ArrayOfVoceTitolario voci;
    protected long lngErrNumber;
    protected String strErrString;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the voci property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVoceTitolario }
     *     
     */
    public ArrayOfVoceTitolario getVoci() {
        return voci;
    }

    /**
     * Sets the value of the voci property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVoceTitolario }
     *     
     */
    public void setVoci(ArrayOfVoceTitolario value) {
        this.voci = value;
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
