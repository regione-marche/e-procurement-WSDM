
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
 *         &lt;element name="InsertClassificaFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertClassificaFascicoloOutput" minOccurs="0"/>
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
    "insertClassificaFascicoloByParamResult"
})
@XmlRootElement(name = "InsertClassificaFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class InsertClassificaFascicoloByParamResponse {

    @XmlElement(name = "InsertClassificaFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertClassificaFascicoloOutput insertClassificaFascicoloByParamResult;

    /**
     * Gets the value of the insertClassificaFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertClassificaFascicoloOutput }
     *     
     */
    public InsertClassificaFascicoloOutput getInsertClassificaFascicoloByParamResult() {
        return insertClassificaFascicoloByParamResult;
    }

    /**
     * Sets the value of the insertClassificaFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertClassificaFascicoloOutput }
     *     
     */
    public void setInsertClassificaFascicoloByParamResult(InsertClassificaFascicoloOutput value) {
        this.insertClassificaFascicoloByParamResult = value;
    }

}
