
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_Full_Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Full_Text">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFullTextEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Full_Text", propOrder = {
    "valore",
    "isFullTextEnabled"
})
public class FieldFullText
    extends FieldAbstract
{

    @XmlElement(name = "Valore")
    protected String valore;
    @XmlElement(name = "IsFullTextEnabled")
    protected boolean isFullTextEnabled;

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValore(String value) {
        this.valore = value;
    }

    /**
     * Gets the value of the isFullTextEnabled property.
     * 
     */
    public boolean isIsFullTextEnabled() {
        return isFullTextEnabled;
    }

    /**
     * Sets the value of the isFullTextEnabled property.
     * 
     */
    public void setIsFullTextEnabled(boolean value) {
        this.isFullTextEnabled = value;
    }

}
