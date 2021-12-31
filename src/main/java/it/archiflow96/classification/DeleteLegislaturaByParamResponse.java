
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
 *         &lt;element name="DeleteLegislaturaByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteLegislaturaOutput" minOccurs="0"/>
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
    "deleteLegislaturaByParamResult"
})
@XmlRootElement(name = "DeleteLegislaturaByParamResponse", namespace = "http://tempuri.org/")
public class DeleteLegislaturaByParamResponse {

    @XmlElement(name = "DeleteLegislaturaByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteLegislaturaOutput deleteLegislaturaByParamResult;

    /**
     * Gets the value of the deleteLegislaturaByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteLegislaturaOutput }
     *     
     */
    public DeleteLegislaturaOutput getDeleteLegislaturaByParamResult() {
        return deleteLegislaturaByParamResult;
    }

    /**
     * Sets the value of the deleteLegislaturaByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteLegislaturaOutput }
     *     
     */
    public void setDeleteLegislaturaByParamResult(DeleteLegislaturaOutput value) {
        this.deleteLegislaturaByParamResult = value;
    }

}
