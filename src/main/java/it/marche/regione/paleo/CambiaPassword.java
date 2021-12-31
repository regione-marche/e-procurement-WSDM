
package it.marche.regione.paleo;

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
 *         &lt;element name="opp" type="{http://paleo.regione.marche.it/services/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="OldPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "opp",
    "oldPwd",
    "newPwd"
})
@XmlRootElement(name = "CambiaPassword")
public class CambiaPassword {

    @XmlElement(nillable = true)
    protected OperatorePaleo opp;
    @XmlElement(name = "OldPwd", nillable = true)
    protected String oldPwd;
    @XmlElement(name = "NewPwd", nillable = true)
    protected String newPwd;

    /**
     * Gets the value of the opp property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getOpp() {
        return opp;
    }

    /**
     * Sets the value of the opp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setOpp(OperatorePaleo value) {
        this.opp = value;
    }

    /**
     * Gets the value of the oldPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPwd() {
        return oldPwd;
    }

    /**
     * Sets the value of the oldPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPwd(String value) {
        this.oldPwd = value;
    }

    /**
     * Gets the value of the newPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPwd() {
        return newPwd;
    }

    /**
     * Sets the value of the newPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPwd(String value) {
        this.newPwd = value;
    }

}
