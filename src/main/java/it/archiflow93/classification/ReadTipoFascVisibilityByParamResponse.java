
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
 *         &lt;element name="ReadTipoFascVisibilityByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadTipoFascVisibilityOutput" minOccurs="0"/>
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
    "readTipoFascVisibilityByParamResult"
})
@XmlRootElement(name = "ReadTipoFascVisibilityByParamResponse", namespace = "http://tempuri.org/")
public class ReadTipoFascVisibilityByParamResponse {

    @XmlElement(name = "ReadTipoFascVisibilityByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadTipoFascVisibilityOutput readTipoFascVisibilityByParamResult;

    /**
     * Gets the value of the readTipoFascVisibilityByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadTipoFascVisibilityOutput }
     *     
     */
    public ReadTipoFascVisibilityOutput getReadTipoFascVisibilityByParamResult() {
        return readTipoFascVisibilityByParamResult;
    }

    /**
     * Sets the value of the readTipoFascVisibilityByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadTipoFascVisibilityOutput }
     *     
     */
    public void setReadTipoFascVisibilityByParamResult(ReadTipoFascVisibilityOutput value) {
        this.readTipoFascVisibilityByParamResult = value;
    }

}
