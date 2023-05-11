
package it.archiflow94;

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
 *         &lt;element name="GetDocumentTypeResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="oDocumentType" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DocumentType" minOccurs="0"/>
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
    "getDocumentTypeResult",
    "oDocumentType"
})
@XmlRootElement(name = "GetDocumentTypeResponse")
public class GetDocumentTypeResponse {

    @XmlElement(name = "GetDocumentTypeResult")
    protected ResultInfo getDocumentTypeResult;
    @XmlElement(nillable = true)
    protected DocumentType oDocumentType;

    /**
     * Gets the value of the getDocumentTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDocumentTypeResult() {
        return getDocumentTypeResult;
    }

    /**
     * Sets the value of the getDocumentTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDocumentTypeResult(ResultInfo value) {
        this.getDocumentTypeResult = value;
    }

    /**
     * Gets the value of the oDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getODocumentType() {
        return oDocumentType;
    }

    /**
     * Sets the value of the oDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setODocumentType(DocumentType value) {
        this.oDocumentType = value;
    }

}
