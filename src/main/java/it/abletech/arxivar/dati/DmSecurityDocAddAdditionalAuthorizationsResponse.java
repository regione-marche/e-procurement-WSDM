
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
 *         &lt;element name="Dm_SecurityDoc_AddAdditionalAuthorizationsResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_SecurityDoc" minOccurs="0"/>
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
    "dmSecurityDocAddAdditionalAuthorizationsResult"
})
@XmlRootElement(name = "Dm_SecurityDoc_AddAdditionalAuthorizationsResponse")
public class DmSecurityDocAddAdditionalAuthorizationsResponse {

    @XmlElement(name = "Dm_SecurityDoc_AddAdditionalAuthorizationsResult")
    protected ArrayOfDmSecurityDoc dmSecurityDocAddAdditionalAuthorizationsResult;

    /**
     * Gets the value of the dmSecurityDocAddAdditionalAuthorizationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmSecurityDoc }
     *     
     */
    public ArrayOfDmSecurityDoc getDmSecurityDocAddAdditionalAuthorizationsResult() {
        return dmSecurityDocAddAdditionalAuthorizationsResult;
    }

    /**
     * Sets the value of the dmSecurityDocAddAdditionalAuthorizationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmSecurityDoc }
     *     
     */
    public void setDmSecurityDocAddAdditionalAuthorizationsResult(ArrayOfDmSecurityDoc value) {
        this.dmSecurityDocAddAdditionalAuthorizationsResult = value;
    }

}
