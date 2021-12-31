
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
 *         &lt;element name="DeleteFascicoloDocumentoByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}DeleteFascicoloDocumentoOutput" minOccurs="0"/>
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
    "deleteFascicoloDocumentoByParamResult"
})
@XmlRootElement(name = "DeleteFascicoloDocumentoByParamResponse", namespace = "http://tempuri.org/")
public class DeleteFascicoloDocumentoByParamResponse {

    @XmlElement(name = "DeleteFascicoloDocumentoByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeleteFascicoloDocumentoOutput deleteFascicoloDocumentoByParamResult;

    /**
     * Gets the value of the deleteFascicoloDocumentoByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteFascicoloDocumentoOutput }
     *     
     */
    public DeleteFascicoloDocumentoOutput getDeleteFascicoloDocumentoByParamResult() {
        return deleteFascicoloDocumentoByParamResult;
    }

    /**
     * Sets the value of the deleteFascicoloDocumentoByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteFascicoloDocumentoOutput }
     *     
     */
    public void setDeleteFascicoloDocumentoByParamResult(DeleteFascicoloDocumentoOutput value) {
        this.deleteFascicoloDocumentoByParamResult = value;
    }

}
