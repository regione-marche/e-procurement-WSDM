
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
 *         &lt;element name="InsertValoreCampiTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertValoreCampiTipoFascicoloOutput" minOccurs="0"/>
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
    "insertValoreCampiTipoFascicoloByParamResult"
})
@XmlRootElement(name = "InsertValoreCampiTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class InsertValoreCampiTipoFascicoloByParamResponse {

    @XmlElement(name = "InsertValoreCampiTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertValoreCampiTipoFascicoloOutput insertValoreCampiTipoFascicoloByParamResult;

    /**
     * Gets the value of the insertValoreCampiTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertValoreCampiTipoFascicoloOutput }
     *     
     */
    public InsertValoreCampiTipoFascicoloOutput getInsertValoreCampiTipoFascicoloByParamResult() {
        return insertValoreCampiTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the insertValoreCampiTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertValoreCampiTipoFascicoloOutput }
     *     
     */
    public void setInsertValoreCampiTipoFascicoloByParamResult(InsertValoreCampiTipoFascicoloOutput value) {
        this.insertValoreCampiTipoFascicoloByParamResult = value;
    }

}
