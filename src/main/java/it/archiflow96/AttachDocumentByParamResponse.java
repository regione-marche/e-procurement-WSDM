
package it.archiflow96;

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
 *         &lt;element name="AttachDocumentByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}AttachDocumentOutput" minOccurs="0"/>
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
    "attachDocumentByParamResult"
})
@XmlRootElement(name = "AttachDocumentByParamResponse")
public class AttachDocumentByParamResponse {

    @XmlElement(name = "AttachDocumentByParamResult", nillable = true)
    protected AttachDocumentOutput attachDocumentByParamResult;

    /**
     * Gets the value of the attachDocumentByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link AttachDocumentOutput }
     *     
     */
    public AttachDocumentOutput getAttachDocumentByParamResult() {
        return attachDocumentByParamResult;
    }

    /**
     * Sets the value of the attachDocumentByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachDocumentOutput }
     *     
     */
    public void setAttachDocumentByParamResult(AttachDocumentOutput value) {
        this.attachDocumentByParamResult = value;
    }

}
