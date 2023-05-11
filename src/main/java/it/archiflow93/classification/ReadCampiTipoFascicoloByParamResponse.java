
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
 *         &lt;element name="ReadCampiTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadCampiTipoFascicoloOutput" minOccurs="0"/>
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
    "readCampiTipoFascicoloByParamResult"
})
@XmlRootElement(name = "ReadCampiTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class ReadCampiTipoFascicoloByParamResponse {

    @XmlElement(name = "ReadCampiTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadCampiTipoFascicoloOutput readCampiTipoFascicoloByParamResult;

    /**
     * Gets the value of the readCampiTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadCampiTipoFascicoloOutput }
     *     
     */
    public ReadCampiTipoFascicoloOutput getReadCampiTipoFascicoloByParamResult() {
        return readCampiTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the readCampiTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCampiTipoFascicoloOutput }
     *     
     */
    public void setReadCampiTipoFascicoloByParamResult(ReadCampiTipoFascicoloOutput value) {
        this.readCampiTipoFascicoloByParamResult = value;
    }

}
