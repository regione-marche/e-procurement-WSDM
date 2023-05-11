
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
 *         &lt;element name="InsertDifformitaByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertDifformitaOutput" minOccurs="0"/>
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
    "insertDifformitaByParamResult"
})
@XmlRootElement(name = "InsertDifformitaByParamResponse", namespace = "http://tempuri.org/")
public class InsertDifformitaByParamResponse {

    @XmlElement(name = "InsertDifformitaByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertDifformitaOutput insertDifformitaByParamResult;

    /**
     * Gets the value of the insertDifformitaByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertDifformitaOutput }
     *     
     */
    public InsertDifformitaOutput getInsertDifformitaByParamResult() {
        return insertDifformitaByParamResult;
    }

    /**
     * Sets the value of the insertDifformitaByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertDifformitaOutput }
     *     
     */
    public void setInsertDifformitaByParamResult(InsertDifformitaOutput value) {
        this.insertDifformitaByParamResult = value;
    }

}
