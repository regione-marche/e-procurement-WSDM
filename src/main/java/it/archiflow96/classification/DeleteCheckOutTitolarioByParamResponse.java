
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
 *         &lt;element name="DeleteCheckOutTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteCheckOutTitolarioOutput" minOccurs="0"/>
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
    "deleteCheckOutTitolarioByParamResult"
})
@XmlRootElement(name = "DeleteCheckOutTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class DeleteCheckOutTitolarioByParamResponse {

    @XmlElement(name = "DeleteCheckOutTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteCheckOutTitolarioOutput deleteCheckOutTitolarioByParamResult;

    /**
     * Gets the value of the deleteCheckOutTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCheckOutTitolarioOutput }
     *     
     */
    public DeleteCheckOutTitolarioOutput getDeleteCheckOutTitolarioByParamResult() {
        return deleteCheckOutTitolarioByParamResult;
    }

    /**
     * Sets the value of the deleteCheckOutTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCheckOutTitolarioOutput }
     *     
     */
    public void setDeleteCheckOutTitolarioByParamResult(DeleteCheckOutTitolarioOutput value) {
        this.deleteCheckOutTitolarioByParamResult = value;
    }

}
