
package it.archiflow93;

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
 *         &lt;element name="InsertCardByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}InsertCardByParamOutput" minOccurs="0"/>
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
    "insertCardByParamResult"
})
@XmlRootElement(name = "InsertCardByParamResponse")
public class InsertCardByParamResponse {

    @XmlElement(name = "InsertCardByParamResult", nillable = true)
    protected InsertCardByParamOutput insertCardByParamResult;

    /**
     * Gets the value of the insertCardByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCardByParamOutput }
     *     
     */
    public InsertCardByParamOutput getInsertCardByParamResult() {
        return insertCardByParamResult;
    }

    /**
     * Sets the value of the insertCardByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCardByParamOutput }
     *     
     */
    public void setInsertCardByParamResult(InsertCardByParamOutput value) {
        this.insertCardByParamResult = value;
    }

}
