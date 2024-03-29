
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
 *         &lt;element name="ReadFascicoloHistoryByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadFascicoloHistoryOutput" minOccurs="0"/>
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
    "readFascicoloHistoryByParamResult"
})
@XmlRootElement(name = "ReadFascicoloHistoryByParamResponse", namespace = "http://tempuri.org/")
public class ReadFascicoloHistoryByParamResponse {

    @XmlElement(name = "ReadFascicoloHistoryByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadFascicoloHistoryOutput readFascicoloHistoryByParamResult;

    /**
     * Gets the value of the readFascicoloHistoryByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFascicoloHistoryOutput }
     *     
     */
    public ReadFascicoloHistoryOutput getReadFascicoloHistoryByParamResult() {
        return readFascicoloHistoryByParamResult;
    }

    /**
     * Sets the value of the readFascicoloHistoryByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFascicoloHistoryOutput }
     *     
     */
    public void setReadFascicoloHistoryByParamResult(ReadFascicoloHistoryOutput value) {
        this.readFascicoloHistoryByParamResult = value;
    }

}
