
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
 *         &lt;element name="UpdateStatusHierarchyByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}UpdateStatusHierarchyOutput" minOccurs="0"/>
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
    "updateStatusHierarchyByParamResult"
})
@XmlRootElement(name = "UpdateStatusHierarchyByParamResponse", namespace = "http://tempuri.org/")
public class UpdateStatusHierarchyByParamResponse {

    @XmlElement(name = "UpdateStatusHierarchyByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateStatusHierarchyOutput updateStatusHierarchyByParamResult;

    /**
     * Gets the value of the updateStatusHierarchyByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatusHierarchyOutput }
     *     
     */
    public UpdateStatusHierarchyOutput getUpdateStatusHierarchyByParamResult() {
        return updateStatusHierarchyByParamResult;
    }

    /**
     * Sets the value of the updateStatusHierarchyByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatusHierarchyOutput }
     *     
     */
    public void setUpdateStatusHierarchyByParamResult(UpdateStatusHierarchyOutput value) {
        this.updateStatusHierarchyByParamResult = value;
    }

}
