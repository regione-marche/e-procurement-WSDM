
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
 *         &lt;element name="ReadValoreCampiTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}ReadValoreCampiTipoFascicoloOutput" minOccurs="0"/>
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
    "readValoreCampiTipoFascicoloByParamResult"
})
@XmlRootElement(name = "ReadValoreCampiTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class ReadValoreCampiTipoFascicoloByParamResponse {

    @XmlElement(name = "ReadValoreCampiTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReadValoreCampiTipoFascicoloOutput readValoreCampiTipoFascicoloByParamResult;

    /**
     * Gets the value of the readValoreCampiTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadValoreCampiTipoFascicoloOutput }
     *     
     */
    public ReadValoreCampiTipoFascicoloOutput getReadValoreCampiTipoFascicoloByParamResult() {
        return readValoreCampiTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the readValoreCampiTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadValoreCampiTipoFascicoloOutput }
     *     
     */
    public void setReadValoreCampiTipoFascicoloByParamResult(ReadValoreCampiTipoFascicoloOutput value) {
        this.readValoreCampiTipoFascicoloByParamResult = value;
    }

}
