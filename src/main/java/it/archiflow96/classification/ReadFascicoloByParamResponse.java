
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
 *         &lt;element name="ReadFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadFascicoloOutput" minOccurs="0"/>
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
    "readFascicoloByParamResult"
})
@XmlRootElement(name = "ReadFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class ReadFascicoloByParamResponse {

    @XmlElement(name = "ReadFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadFascicoloOutput readFascicoloByParamResult;

    /**
     * Gets the value of the readFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFascicoloOutput }
     *     
     */
    public ReadFascicoloOutput getReadFascicoloByParamResult() {
        return readFascicoloByParamResult;
    }

    /**
     * Sets the value of the readFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFascicoloOutput }
     *     
     */
    public void setReadFascicoloByParamResult(ReadFascicoloOutput value) {
        this.readFascicoloByParamResult = value;
    }

}
