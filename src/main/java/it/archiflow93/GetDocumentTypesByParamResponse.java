
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
 *         &lt;element name="GetDocumentTypesByParamResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}GetDocumentTypesOutput" minOccurs="0"/>
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
    "getDocumentTypesByParamResult"
})
@XmlRootElement(name = "GetDocumentTypesByParamResponse")
public class GetDocumentTypesByParamResponse {

    @XmlElement(name = "GetDocumentTypesByParamResult", nillable = true)
    protected GetDocumentTypesOutput getDocumentTypesByParamResult;

    /**
     * Gets the value of the getDocumentTypesByParamResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentTypesOutput }
     *     
     */
    public GetDocumentTypesOutput getGetDocumentTypesByParamResult() {
        return getDocumentTypesByParamResult;
    }

    /**
     * Sets the value of the getDocumentTypesByParamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentTypesOutput }
     *     
     */
    public void setGetDocumentTypesByParamResult(GetDocumentTypesOutput value) {
        this.getDocumentTypesByParamResult = value;
    }

}
