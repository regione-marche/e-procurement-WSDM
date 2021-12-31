
package it.archiflow94;

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
 *         &lt;element name="SetCardsFoldersResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}SetCardsFoldersOutput" minOccurs="0"/>
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
    "setCardsFoldersResult"
})
@XmlRootElement(name = "SetCardsFoldersResponse")
public class SetCardsFoldersResponse {

    @XmlElement(name = "SetCardsFoldersResult", nillable = true)
    protected SetCardsFoldersOutput setCardsFoldersResult;

    /**
     * Gets the value of the setCardsFoldersResult property.
     * 
     * @return
     *     possible object is
     *     {@link SetCardsFoldersOutput }
     *     
     */
    public SetCardsFoldersOutput getSetCardsFoldersResult() {
        return setCardsFoldersResult;
    }

    /**
     * Sets the value of the setCardsFoldersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCardsFoldersOutput }
     *     
     */
    public void setSetCardsFoldersResult(SetCardsFoldersOutput value) {
        this.setCardsFoldersResult = value;
    }

}
