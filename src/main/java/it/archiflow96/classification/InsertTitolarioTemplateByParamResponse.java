
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
 *         &lt;element name="InsertTitolarioTemplateByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertTitolarioTemplateOutput" minOccurs="0"/>
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
    "insertTitolarioTemplateByParamResult"
})
@XmlRootElement(name = "InsertTitolarioTemplateByParamResponse", namespace = "http://tempuri.org/")
public class InsertTitolarioTemplateByParamResponse {

    @XmlElement(name = "InsertTitolarioTemplateByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertTitolarioTemplateOutput insertTitolarioTemplateByParamResult;

    /**
     * Gets the value of the insertTitolarioTemplateByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertTitolarioTemplateOutput }
     *     
     */
    public InsertTitolarioTemplateOutput getInsertTitolarioTemplateByParamResult() {
        return insertTitolarioTemplateByParamResult;
    }

    /**
     * Sets the value of the insertTitolarioTemplateByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTitolarioTemplateOutput }
     *     
     */
    public void setInsertTitolarioTemplateByParamResult(InsertTitolarioTemplateOutput value) {
        this.insertTitolarioTemplateByParamResult = value;
    }

}
