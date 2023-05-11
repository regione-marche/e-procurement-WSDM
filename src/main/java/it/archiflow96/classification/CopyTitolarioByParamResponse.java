
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
 *         &lt;element name="CopyTitolarioByParamResult" type="{http://schemas.datacontract.org/2004/07/Siav.Archiflow.Entities.Classification.ValueObject}CopyTitolarioOutput" minOccurs="0"/>
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
    "copyTitolarioByParamResult"
})
@XmlRootElement(name = "CopyTitolarioByParamResponse", namespace = "http://tempuri.org/")
public class CopyTitolarioByParamResponse {

    @XmlElement(name = "CopyTitolarioByParamResult", namespace = "http://tempuri.org/", nillable = true)
    protected CopyTitolarioOutput copyTitolarioByParamResult;

    /**
     * Gets the value of the copyTitolarioByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link CopyTitolarioOutput }
     *     
     */
    public CopyTitolarioOutput getCopyTitolarioByParamResult() {
        return copyTitolarioByParamResult;
    }

    /**
     * Sets the value of the copyTitolarioByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyTitolarioOutput }
     *     
     */
    public void setCopyTitolarioByParamResult(CopyTitolarioOutput value) {
        this.copyTitolarioByParamResult = value;
    }

}
