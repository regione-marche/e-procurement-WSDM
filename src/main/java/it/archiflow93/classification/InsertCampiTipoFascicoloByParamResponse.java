
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
 *         &lt;element name="InsertCampiTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertCampiTipoFascicoloOutput" minOccurs="0"/>
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
    "insertCampiTipoFascicoloByParamResult"
})
@XmlRootElement(name = "InsertCampiTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class InsertCampiTipoFascicoloByParamResponse {

    @XmlElement(name = "InsertCampiTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertCampiTipoFascicoloOutput insertCampiTipoFascicoloByParamResult;

    /**
     * Gets the value of the insertCampiTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCampiTipoFascicoloOutput }
     *     
     */
    public InsertCampiTipoFascicoloOutput getInsertCampiTipoFascicoloByParamResult() {
        return insertCampiTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the insertCampiTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCampiTipoFascicoloOutput }
     *     
     */
    public void setInsertCampiTipoFascicoloByParamResult(InsertCampiTipoFascicoloOutput value) {
        this.insertCampiTipoFascicoloByParamResult = value;
    }

}
