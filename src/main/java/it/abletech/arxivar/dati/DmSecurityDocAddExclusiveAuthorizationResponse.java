
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
 *         &lt;element name="Dm_SecurityDoc_AddExclusiveAuthorizationResult" type="{http://www.Abletech.it/Arxivar}Dm_SecurityDoc" minOccurs="0"/>
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
    "dmSecurityDocAddExclusiveAuthorizationResult"
})
@XmlRootElement(name = "Dm_SecurityDoc_AddExclusiveAuthorizationResponse")
public class DmSecurityDocAddExclusiveAuthorizationResponse {

    @XmlElement(name = "Dm_SecurityDoc_AddExclusiveAuthorizationResult")
    protected DmSecurityDoc dmSecurityDocAddExclusiveAuthorizationResult;

    /**
     * Gets the value of the dmSecurityDocAddExclusiveAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmSecurityDoc }
     *     
     */
    public DmSecurityDoc getDmSecurityDocAddExclusiveAuthorizationResult() {
        return dmSecurityDocAddExclusiveAuthorizationResult;
    }

    /**
     * Sets the value of the dmSecurityDocAddExclusiveAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSecurityDoc }
     *     
     */
    public void setDmSecurityDocAddExclusiveAuthorizationResult(DmSecurityDoc value) {
        this.dmSecurityDocAddExclusiveAuthorizationResult = value;
    }

}
