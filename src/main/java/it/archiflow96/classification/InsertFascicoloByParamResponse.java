
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
 *         &lt;element name="InsertFascicoloByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertFascicoloOutput" minOccurs="0"/>
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
    "insertFascicoloByParamResult"
})
@XmlRootElement(name = "InsertFascicoloByParamResponse", namespace = "http://tempuri.org/")
public class InsertFascicoloByParamResponse {

    @XmlElement(name = "InsertFascicoloByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertFascicoloOutput insertFascicoloByParamResult;

    /**
     * Gets the value of the insertFascicoloByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertFascicoloOutput }
     *     
     */
    public InsertFascicoloOutput getInsertFascicoloByParamResult() {
        return insertFascicoloByParamResult;
    }

    /**
     * Sets the value of the insertFascicoloByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertFascicoloOutput }
     *     
     */
    public void setInsertFascicoloByParamResult(InsertFascicoloOutput value) {
        this.insertFascicoloByParamResult = value;
    }

}
