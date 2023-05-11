
package it.archiflow96;

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
 *         &lt;element name="ModifyCardResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ModifyCardOutput" minOccurs="0"/>
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
    "modifyCardResult"
})
@XmlRootElement(name = "ModifyCardResponse")
public class ModifyCardResponse {

    @XmlElement(name = "ModifyCardResult", nillable = true)
    protected ModifyCardOutput modifyCardResult;

    /**
     * Gets the value of the modifyCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyCardOutput }
     *     
     */
    public ModifyCardOutput getModifyCardResult() {
        return modifyCardResult;
    }

    /**
     * Sets the value of the modifyCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyCardOutput }
     *     
     */
    public void setModifyCardResult(ModifyCardOutput value) {
        this.modifyCardResult = value;
    }

}
