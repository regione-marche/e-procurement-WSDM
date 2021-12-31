
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
 *         &lt;element name="OpenFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}OpenFascicoloOutput" minOccurs="0"/>
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
    "openFascicoloByParamResult"
})
@XmlRootElement(name = "OpenFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class OpenFascicoloByParamResponse {

    @XmlElement(name = "OpenFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected OpenFascicoloOutput openFascicoloByParamResult;

    /**
     * Gets the value of the openFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link OpenFascicoloOutput }
     *     
     */
    public OpenFascicoloOutput getOpenFascicoloByParamResult() {
        return openFascicoloByParamResult;
    }

    /**
     * Sets the value of the openFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenFascicoloOutput }
     *     
     */
    public void setOpenFascicoloByParamResult(OpenFascicoloOutput value) {
        this.openFascicoloByParamResult = value;
    }

}
