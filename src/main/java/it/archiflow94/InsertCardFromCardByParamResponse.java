
package it.archiflow94;

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
 *         &lt;element name="InsertCardFromCardByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}InsertCardFromCardOutput" minOccurs="0"/>
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
    "insertCardFromCardByParamResult"
})
@XmlRootElement(name = "InsertCardFromCardByParamResponse")
public class InsertCardFromCardByParamResponse {

    @XmlElement(name = "InsertCardFromCardByParamResult", nillable = true)
    protected InsertCardFromCardOutput insertCardFromCardByParamResult;

    /**
     * Gets the value of the insertCardFromCardByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCardFromCardOutput }
     *     
     */
    public InsertCardFromCardOutput getInsertCardFromCardByParamResult() {
        return insertCardFromCardByParamResult;
    }

    /**
     * Sets the value of the insertCardFromCardByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCardFromCardOutput }
     *     
     */
    public void setInsertCardFromCardByParamResult(InsertCardFromCardOutput value) {
        this.insertCardFromCardByParamResult = value;
    }

}
