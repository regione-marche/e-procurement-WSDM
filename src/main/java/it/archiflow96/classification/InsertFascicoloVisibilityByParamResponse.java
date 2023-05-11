
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
 *         &lt;element name="InsertFascicoloVisibilityByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}InsertFascicoloVisibilityOutput" minOccurs="0"/>
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
    "insertFascicoloVisibilityByParamResult"
})
@XmlRootElement(name = "InsertFascicoloVisibilityByParamResponse", namespace = "http://tempuri.org/")
public class InsertFascicoloVisibilityByParamResponse {

    @XmlElement(name = "InsertFascicoloVisibilityByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected InsertFascicoloVisibilityOutput insertFascicoloVisibilityByParamResult;

    /**
     * Gets the value of the insertFascicoloVisibilityByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsertFascicoloVisibilityOutput }
     *     
     */
    public InsertFascicoloVisibilityOutput getInsertFascicoloVisibilityByParamResult() {
        return insertFascicoloVisibilityByParamResult;
    }

    /**
     * Sets the value of the insertFascicoloVisibilityByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertFascicoloVisibilityOutput }
     *     
     */
    public void setInsertFascicoloVisibilityByParamResult(InsertFascicoloVisibilityOutput value) {
        this.insertFascicoloVisibilityByParamResult = value;
    }

}
