
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
 *         &lt;element name="InsertTitolarioItemByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertTitolarioItemOutput" minOccurs="0"/>
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
    "insertTitolarioItemByParamResult"
})
@XmlRootElement(name = "InsertTitolarioItemByParamResponse", namespace = "http://tempuri.org/")
public class InsertTitolarioItemByParamResponse {

    @XmlElement(name = "InsertTitolarioItemByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertTitolarioItemOutput insertTitolarioItemByParamResult;

    /**
     * Gets the value of the insertTitolarioItemByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertTitolarioItemOutput }
     *     
     */
    public InsertTitolarioItemOutput getInsertTitolarioItemByParamResult() {
        return insertTitolarioItemByParamResult;
    }

    /**
     * Sets the value of the insertTitolarioItemByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTitolarioItemOutput }
     *     
     */
    public void setInsertTitolarioItemByParamResult(InsertTitolarioItemOutput value) {
        this.insertTitolarioItemByParamResult = value;
    }

}
