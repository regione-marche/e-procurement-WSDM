
package it.archiflow96.email;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailBoxNsoCfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailBoxNsoCfg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SaveOrdersByType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Nso.ValueObject}NsoOrderDirection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailBoxNsoCfg", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "enabled",
    "saveOrdersByType"
})
public class MailBoxNsoCfg {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "SaveOrdersByType")
    protected NsoOrderDirection saveOrdersByType;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the saveOrdersByType property.
     * 
     * @return
     *     possible object is
     *     {@link NsoOrderDirection }
     *     
     */
    public NsoOrderDirection getSaveOrdersByType() {
        return saveOrdersByType;
    }

    /**
     * Sets the value of the saveOrdersByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsoOrderDirection }
     *     
     */
    public void setSaveOrdersByType(NsoOrderDirection value) {
        this.saveOrdersByType = value;
    }

}
