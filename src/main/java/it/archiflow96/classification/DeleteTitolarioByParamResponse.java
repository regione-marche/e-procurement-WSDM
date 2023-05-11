
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
 *         &lt;element name="DeleteTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteTitolarioOutput" minOccurs="0"/>
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
    "deleteTitolarioByParamResult"
})
@XmlRootElement(name = "DeleteTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class DeleteTitolarioByParamResponse {

    @XmlElement(name = "DeleteTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteTitolarioOutput deleteTitolarioByParamResult;

    /**
     * Gets the value of the deleteTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTitolarioOutput }
     *     
     */
    public DeleteTitolarioOutput getDeleteTitolarioByParamResult() {
        return deleteTitolarioByParamResult;
    }

    /**
     * Sets the value of the deleteTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTitolarioOutput }
     *     
     */
    public void setDeleteTitolarioByParamResult(DeleteTitolarioOutput value) {
        this.deleteTitolarioByParamResult = value;
    }

}
