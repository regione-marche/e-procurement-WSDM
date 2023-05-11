
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FascicoloRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fascicolo" type="{http://tempuri.org/}FascicoloNetDettaglio" minOccurs="0"/>
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
@XmlType(name = "FascicoloRet", propOrder = {
    "fascicolo",
    "lngErrNumber",
    "strErrString"
})
public class FascicoloRet {

    @XmlElement(name = "Fascicolo")
    protected FascicoloNetDettaglio fascicolo;
    protected long lngErrNumber;
    protected String strErrString;

    /**
     * Gets the value of the fascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloNetDettaglio }
     *     
     */
    public FascicoloNetDettaglio getFascicolo() {
        return fascicolo;
    }

    /**
     * Sets the value of the fascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloNetDettaglio }
     *     
     */
    public void setFascicolo(FascicoloNetDettaglio value) {
        this.fascicolo = value;
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
