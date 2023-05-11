
package it.datagraph;

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
 *         &lt;element name="infoFasc" type="{http://tempuri.org/}FascicoloNet" minOccurs="0"/>
 *         &lt;element name="includiDocInformali" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="strDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "infoFasc",
    "includiDocInformali",
    "strDST"
})
@XmlRootElement(name = "GetFascicolo")
public class GetFascicolo {

    protected FascicoloNet infoFasc;
    protected boolean includiDocInformali;
    protected String strDST;

    /**
     * Gets the value of the infoFasc property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloNet }
     *     
     */
    public FascicoloNet getInfoFasc() {
        return infoFasc;
    }

    /**
     * Sets the value of the infoFasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloNet }
     *     
     */
    public void setInfoFasc(FascicoloNet value) {
        this.infoFasc = value;
    }

    /**
     * Gets the value of the includiDocInformali property.
     * 
     */
    public boolean isIncludiDocInformali() {
        return includiDocInformali;
    }

    /**
     * Sets the value of the includiDocInformali property.
     * 
     */
    public void setIncludiDocInformali(boolean value) {
        this.includiDocInformali = value;
    }

    /**
     * Gets the value of the strDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDST() {
        return strDST;
    }

    /**
     * Sets the value of the strDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDST(String value) {
        this.strDST = value;
    }

}
