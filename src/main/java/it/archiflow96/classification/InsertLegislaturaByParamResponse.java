
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
 *         &lt;element name="InsertLegislaturaByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertLegislaturaOutput" minOccurs="0"/>
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
    "insertLegislaturaByParamResult"
})
@XmlRootElement(name = "InsertLegislaturaByParamResponse", namespace = "http://tempuri.org/")
public class InsertLegislaturaByParamResponse {

    @XmlElement(name = "InsertLegislaturaByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertLegislaturaOutput insertLegislaturaByParamResult;

    /**
     * Gets the value of the insertLegislaturaByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertLegislaturaOutput }
     *     
     */
    public InsertLegislaturaOutput getInsertLegislaturaByParamResult() {
        return insertLegislaturaByParamResult;
    }

    /**
     * Sets the value of the insertLegislaturaByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertLegislaturaOutput }
     *     
     */
    public void setInsertLegislaturaByParamResult(InsertLegislaturaOutput value) {
        this.insertLegislaturaByParamResult = value;
    }

}
