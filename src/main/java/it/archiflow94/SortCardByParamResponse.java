
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
 *         &lt;element name="SortCardByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}SortCardOutput" minOccurs="0"/>
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
    "sortCardByParamResult"
})
@XmlRootElement(name = "SortCardByParamResponse")
public class SortCardByParamResponse {

    @XmlElement(name = "SortCardByParamResult", nillable = true)
    protected SortCardOutput sortCardByParamResult;

    /**
     * Gets the value of the sortCardByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SortCardOutput }
     *     
     */
    public SortCardOutput getSortCardByParamResult() {
        return sortCardByParamResult;
    }

    /**
     * Sets the value of the sortCardByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortCardOutput }
     *     
     */
    public void setSortCardByParamResult(SortCardOutput value) {
        this.sortCardByParamResult = value;
    }

}
