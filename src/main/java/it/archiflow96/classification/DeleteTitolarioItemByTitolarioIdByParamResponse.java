
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
 *         &lt;element name="DeleteTitolarioItemByTitolarioIdByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteTitolarioItemByTitolarioIdOutput" minOccurs="0"/>
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
    "deleteTitolarioItemByTitolarioIdByParamResult"
})
@XmlRootElement(name = "DeleteTitolarioItemByTitolarioIdByParamResponse", namespace = "http://tempuri.org/")
public class DeleteTitolarioItemByTitolarioIdByParamResponse {

    @XmlElement(name = "DeleteTitolarioItemByTitolarioIdByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteTitolarioItemByTitolarioIdOutput deleteTitolarioItemByTitolarioIdByParamResult;

    /**
     * Gets the value of the deleteTitolarioItemByTitolarioIdByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTitolarioItemByTitolarioIdOutput }
     *     
     */
    public DeleteTitolarioItemByTitolarioIdOutput getDeleteTitolarioItemByTitolarioIdByParamResult() {
        return deleteTitolarioItemByTitolarioIdByParamResult;
    }

    /**
     * Sets the value of the deleteTitolarioItemByTitolarioIdByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTitolarioItemByTitolarioIdOutput }
     *     
     */
    public void setDeleteTitolarioItemByTitolarioIdByParamResult(DeleteTitolarioItemByTitolarioIdOutput value) {
        this.deleteTitolarioItemByTitolarioIdByParamResult = value;
    }

}
