
package it.archiflow96.classification;

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
 *         &lt;element name="paramIn" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteTitolarioItemByPrimaryKeyInput" minOccurs="0"/>
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
    "paramIn"
})
@XmlRootElement(name = "DeleteTitolarioItemByPrimaryKeyByParam", namespace = "http://tempuri.org/")
public class DeleteTitolarioItemByPrimaryKeyByParam {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected DeleteTitolarioItemByPrimaryKeyInput paramIn;

    /**
     * Gets the value of the paramIn property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTitolarioItemByPrimaryKeyInput }
     *     
     */
    public DeleteTitolarioItemByPrimaryKeyInput getParamIn() {
        return paramIn;
    }

    /**
     * Sets the value of the paramIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTitolarioItemByPrimaryKeyInput }
     *     
     */
    public void setParamIn(DeleteTitolarioItemByPrimaryKeyInput value) {
        this.paramIn = value;
    }

}
