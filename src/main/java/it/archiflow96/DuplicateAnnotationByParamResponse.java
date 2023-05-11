
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
 *         &lt;element name="DuplicateAnnotationByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DuplicateAnnotationOutput" minOccurs="0"/>
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
    "duplicateAnnotationByParamResult"
})
@XmlRootElement(name = "DuplicateAnnotationByParamResponse")
public class DuplicateAnnotationByParamResponse {

    @XmlElement(name = "DuplicateAnnotationByParamResult", nillable = true)
    protected DuplicateAnnotationOutput duplicateAnnotationByParamResult;

    /**
     * Gets the value of the duplicateAnnotationByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateAnnotationOutput }
     *     
     */
    public DuplicateAnnotationOutput getDuplicateAnnotationByParamResult() {
        return duplicateAnnotationByParamResult;
    }

    /**
     * Sets the value of the duplicateAnnotationByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateAnnotationOutput }
     *     
     */
    public void setDuplicateAnnotationByParamResult(DuplicateAnnotationOutput value) {
        this.duplicateAnnotationByParamResult = value;
    }

}
