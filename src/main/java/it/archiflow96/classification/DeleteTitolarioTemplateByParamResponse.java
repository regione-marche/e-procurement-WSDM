
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
 *         &lt;element name="DeleteTitolarioTemplateByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteTitolarioTemplateOutput" minOccurs="0"/>
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
    "deleteTitolarioTemplateByParamResult"
})
@XmlRootElement(name = "DeleteTitolarioTemplateByParamResponse", namespace = "http://tempuri.org/")
public class DeleteTitolarioTemplateByParamResponse {

    @XmlElement(name = "DeleteTitolarioTemplateByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteTitolarioTemplateOutput deleteTitolarioTemplateByParamResult;

    /**
     * Gets the value of the deleteTitolarioTemplateByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTitolarioTemplateOutput }
     *     
     */
    public DeleteTitolarioTemplateOutput getDeleteTitolarioTemplateByParamResult() {
        return deleteTitolarioTemplateByParamResult;
    }

    /**
     * Sets the value of the deleteTitolarioTemplateByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTitolarioTemplateOutput }
     *     
     */
    public void setDeleteTitolarioTemplateByParamResult(DeleteTitolarioTemplateOutput value) {
        this.deleteTitolarioTemplateByParamResult = value;
    }

}
