
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
 *         &lt;element name="InsertTipoFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertTipoFascicoloOutput" minOccurs="0"/>
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
    "insertTipoFascicoloByParamResult"
})
@XmlRootElement(name = "InsertTipoFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class InsertTipoFascicoloByParamResponse {

    @XmlElement(name = "InsertTipoFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertTipoFascicoloOutput insertTipoFascicoloByParamResult;

    /**
     * Gets the value of the insertTipoFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertTipoFascicoloOutput }
     *     
     */
    public InsertTipoFascicoloOutput getInsertTipoFascicoloByParamResult() {
        return insertTipoFascicoloByParamResult;
    }

    /**
     * Sets the value of the insertTipoFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTipoFascicoloOutput }
     *     
     */
    public void setInsertTipoFascicoloByParamResult(InsertTipoFascicoloOutput value) {
        this.insertTipoFascicoloByParamResult = value;
    }

}
