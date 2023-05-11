
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
 *         &lt;element name="ReadTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadTipoFascicoloOutput" minOccurs="0"/>
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
    "readTipoFascicoloByParamResult"
})
@XmlRootElement(name = "ReadTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class ReadTipoFascicoloByParamResponse {

    @XmlElement(name = "ReadTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadTipoFascicoloOutput readTipoFascicoloByParamResult;

    /**
     * Gets the value of the readTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadTipoFascicoloOutput }
     *     
     */
    public ReadTipoFascicoloOutput getReadTipoFascicoloByParamResult() {
        return readTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the readTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadTipoFascicoloOutput }
     *     
     */
    public void setReadTipoFascicoloByParamResult(ReadTipoFascicoloOutput value) {
        this.readTipoFascicoloByParamResult = value;
    }

}
