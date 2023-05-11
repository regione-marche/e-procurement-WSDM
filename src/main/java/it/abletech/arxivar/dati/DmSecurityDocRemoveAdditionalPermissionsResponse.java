
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
 *         &lt;element name="Dm_SecurityDoc_RemoveAdditionalPermissionsResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmSecurityDocRemoveAdditionalPermissionsResult"
})
@XmlRootElement(name = "Dm_SecurityDoc_RemoveAdditionalPermissionsResponse")
public class DmSecurityDocRemoveAdditionalPermissionsResponse {

    @XmlElement(name = "Dm_SecurityDoc_RemoveAdditionalPermissionsResult")
    protected int dmSecurityDocRemoveAdditionalPermissionsResult;

    /**
     * Gets the value of the dmSecurityDocRemoveAdditionalPermissionsResult property.
     * 
     */
    public int getDmSecurityDocRemoveAdditionalPermissionsResult() {
        return dmSecurityDocRemoveAdditionalPermissionsResult;
    }

    /**
     * Sets the value of the dmSecurityDocRemoveAdditionalPermissionsResult property.
     * 
     */
    public void setDmSecurityDocRemoveAdditionalPermissionsResult(int value) {
        this.dmSecurityDocRemoveAdditionalPermissionsResult = value;
    }

}
