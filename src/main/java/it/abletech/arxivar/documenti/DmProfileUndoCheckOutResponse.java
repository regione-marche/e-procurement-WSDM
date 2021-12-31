
package it.abletech.arxivar.documenti;

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
 *         &lt;element name="Dm_Profile_Undo_CheckOutResult" type="{http://www.Abletech.it/Arxivar}Security_Exception"/>
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
    "dmProfileUndoCheckOutResult"
})
@XmlRootElement(name = "Dm_Profile_Undo_CheckOutResponse")
public class DmProfileUndoCheckOutResponse {

    @XmlElement(name = "Dm_Profile_Undo_CheckOutResult", required = true)
    protected SecurityException dmProfileUndoCheckOutResult;

    /**
     * Gets the value of the dmProfileUndoCheckOutResult property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityException }
     *     
     */
    public SecurityException getDmProfileUndoCheckOutResult() {
        return dmProfileUndoCheckOutResult;
    }

    /**
     * Sets the value of the dmProfileUndoCheckOutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityException }
     *     
     */
    public void setDmProfileUndoCheckOutResult(SecurityException value) {
        this.dmProfileUndoCheckOutResult = value;
    }

}
