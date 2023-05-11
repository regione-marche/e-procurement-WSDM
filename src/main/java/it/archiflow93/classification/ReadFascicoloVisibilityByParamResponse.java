
package it.archiflow93.classification;

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
 *         &lt;element name="ReadFascicoloVisibilityByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadFascicoloVisibilityOutput" minOccurs="0"/>
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
    "readFascicoloVisibilityByParamResult"
})
@XmlRootElement(name = "ReadFascicoloVisibilityByParamResponse", namespace = "http://tempuri.org/")
public class ReadFascicoloVisibilityByParamResponse {

    @XmlElement(name = "ReadFascicoloVisibilityByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadFascicoloVisibilityOutput readFascicoloVisibilityByParamResult;

    /**
     * Gets the value of the readFascicoloVisibilityByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFascicoloVisibilityOutput }
     *     
     */
    public ReadFascicoloVisibilityOutput getReadFascicoloVisibilityByParamResult() {
        return readFascicoloVisibilityByParamResult;
    }

    /**
     * Sets the value of the readFascicoloVisibilityByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFascicoloVisibilityOutput }
     *     
     */
    public void setReadFascicoloVisibilityByParamResult(ReadFascicoloVisibilityOutput value) {
        this.readFascicoloVisibilityByParamResult = value;
    }

}
