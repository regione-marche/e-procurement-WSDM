
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
 *         &lt;element name="ModifyExternalDocumentResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oAttachment" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExternalAttachment" minOccurs="0"/>
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
    "modifyExternalDocumentResult",
    "oAttachment"
})
@XmlRootElement(name = "ModifyExternalDocumentResponse")
public class ModifyExternalDocumentResponse {

    @XmlElement(name = "ModifyExternalDocumentResult")
    protected ResultInfo modifyExternalDocumentResult;
    @XmlElement(nillable = true)
    protected ExternalAttachment oAttachment;

    /**
     * Gets the value of the modifyExternalDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getModifyExternalDocumentResult() {
        return modifyExternalDocumentResult;
    }

    /**
     * Sets the value of the modifyExternalDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setModifyExternalDocumentResult(ResultInfo value) {
        this.modifyExternalDocumentResult = value;
    }

    /**
     * Gets the value of the oAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAttachment }
     *     
     */
    public ExternalAttachment getOAttachment() {
        return oAttachment;
    }

    /**
     * Sets the value of the oAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAttachment }
     *     
     */
    public void setOAttachment(ExternalAttachment value) {
        this.oAttachment = value;
    }

}
