
package it.archiflow93;

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
 *         &lt;element name="GetDocComplianceCertificationModelsResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="defaultIndex" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="customDescs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="modelNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "getDocComplianceCertificationModelsResult",
    "defaultIndex",
    "customDescs",
    "modelNames"
})
@XmlRootElement(name = "GetDocComplianceCertificationModelsResponse")
public class GetDocComplianceCertificationModelsResponse {

    @XmlElement(name = "GetDocComplianceCertificationModelsResult")
    protected ResultInfo getDocComplianceCertificationModelsResult;
    protected Short defaultIndex;
    @XmlElement(nillable = true)
    protected ArrayOfstring customDescs;
    @XmlElement(nillable = true)
    protected ArrayOfstring modelNames;

    /**
     * Gets the value of the getDocComplianceCertificationModelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDocComplianceCertificationModelsResult() {
        return getDocComplianceCertificationModelsResult;
    }

    /**
     * Sets the value of the getDocComplianceCertificationModelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDocComplianceCertificationModelsResult(ResultInfo value) {
        this.getDocComplianceCertificationModelsResult = value;
    }

    /**
     * Gets the value of the defaultIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDefaultIndex() {
        return defaultIndex;
    }

    /**
     * Sets the value of the defaultIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDefaultIndex(Short value) {
        this.defaultIndex = value;
    }

    /**
     * Gets the value of the customDescs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getCustomDescs() {
        return customDescs;
    }

    /**
     * Sets the value of the customDescs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setCustomDescs(ArrayOfstring value) {
        this.customDescs = value;
    }

    /**
     * Gets the value of the modelNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getModelNames() {
        return modelNames;
    }

    /**
     * Sets the value of the modelNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setModelNames(ArrayOfstring value) {
        this.modelNames = value;
    }

}
